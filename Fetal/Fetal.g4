/**
 * Flexible Transaction Language (fetal) defines accounting transactions
 * 
 */
grammar Fetal;
@header {
package com.ftl.derived;
import com.ftl.helper.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.lang.reflect.InvocationTargetException;
} 
@members {
	FetalTransaction trans;
	ObjectMath	om;
	private static final int NOT_DEFINED=0, MALFORMED_EXP=1, CAST_EXCEPT=2, CANNOT_LOAD_FILE=3,
							 INVALID_DATE=4, CANNOT_LOAD_OBJECT=5, CANNOT_INVOKE_METHD=6, INVALID_OBJECT=7,
							 INVALID_ARG=8; 
}
transaction[FetalTransaction t]  : 
			{
				trans = t;
				om = new ObjectMath();					
			} begin statements end
			;

begin : 'begin' {trans.beginTrans();};

end		: 'end' {trans.commitTrans();};


statements	: (statement)+
			;
         

statement 	: declaration ';'
			| command ';'
			| assignment ';'
			| evaluation
			| ';'
			;
			
declaration : type var
			{
				trans.publish($var.name, $type.varType);
			}
			| type assignment
			{
				trans.publish($assignment.lh, $type.varType, $assignment.obj);				
			}
			;
			
var returns [String name]	
			: identifier
			{
				$name = $identifier.text;
			}
			;


type returns [VariableType varType]
			: DecimalType
			{
				$varType = VariableType.DECIMAL;
			}
			| NumberType
			{
				$varType = VariableType.NUMBER;
			}

			| StringType 
			{
				$varType = VariableType.STRING;
			}
			| BooleanType
			{
				$varType = VariableType.BOOLEAN;
			}
			| DateType
			{
				$varType = VariableType.DATE;
			}
			| ObjectType
			{
				$varType = VariableType.OBJECT;
			}
			| DaoType
			{
				$varType = VariableType.DAO;
			}
			;

assignment returns [Object obj, String lh]		
			: lharg Equals rharg
			{
				$obj = $rharg.obj;
				$lh = $lharg.text;
				if (trans.isVariable($lharg.text) == true) {
					trans.assignVariable($lharg.text, $rharg.obj);
				}
			}
			| lharg unaryOP rharg
			{
				String oper = $unaryOP.text;
				oper = oper.substring(0, oper.length() - 1);
				if (trans.isVariable($lharg.text) == false) {
					RecognitionException ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
					_errHandler.reportError(this, ex );
				}else{
					$obj = om.getExpression($lharg.obj, oper, $rharg.obj);								
					trans.assignVariable($lharg.text, $obj);
				}
			}
			;


assignmentOp	: Equals
				;

unaryOP			: PlusEquals
				| MinusEquals
				| MultiplyEquals
				| DivideEquals
				| ModuloEquals
				| ExponentEquals
				;
				
expressionOp	: arithExpressOp
				| bitwiseExpressOp
				;

arithExpressOp	: Multiply
				| Divide
				| Plus
				| Minus
				| Modulo
				| Exponent
				;
				
bitwiseExpressOp  
				: And
				| Or
				| Not
				;

comparisonOp	: IsEqualTo
				| IsLessThan
				| IsLessThanOrEqualTo
				| IsGreaterThan
				| IsGreaterThanOrEqualTo
				| IsNotEqualTo
				;
				
logicExpressOp	: AndExpression
				| OrExpression
				| ExclusiveOrExpression
				;

rharg returns[Object obj]		
			: lh=rharg expressionOp rh=rharg
			{
				if (trans.isMatched($lh.obj, $rh.obj) == false) {
					RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
					_errHandler.reportError(this, ex );
				}else{
					$obj = om.getExpression($lh.obj, $expressionOp.text, $rh.obj);
				}
			}
			| '(' lh=rharg expressionOp rh=rharg ')'
			{
				if (trans.isMatched($lh.obj, $rh.obj) == false) {
					RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
					_errHandler.reportError(this, ex );
				}else{
					$obj = om.getExpression($lh.obj, $expressionOp.text, $rh.obj);
				}
			}
			| var
			{
				
				if (trans.isVariable($var.name) == false) {
					RecognitionException ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				$obj = trans.getValue($var.name);
				
			}
			| literal
			{
				$obj = $literal.obj;
				if ($obj == null) {
					RecognitionException ex = trans.errorHandler(MALFORMED_EXP, _localctx, this);
					_errHandler.reportError(this, ex );
				}
			}
			| assignmentCommands
			{
				$obj = $assignmentCommands.obj;
			}
			;

lharg returns[Object obj]		: var
								{$obj = trans.getValue($var.name);}
								;

identifier	: Identifier;

evaluation returns [boolean result]	
				: IfStatement '(' evalExpression ')'  rfn=fileName (Else lfn=fileName)?
				{
					$result = $evalExpression.result;

					if ($result == true ) {
						try {
							trans.loadBlock($rfn.name);
						} catch (IOException e) {
							RecognitionException ex = trans.errorHandler(CANNOT_LOAD_FILE, _localctx, this);
							_errHandler.reportError(this, ex );
							
						}
					}else if(_localctx.lfn != null){
						try {
							trans.loadBlock($lfn.name);
						} catch (IOException e) {
							RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
							_errHandler.reportError(this, ex );
							
						}
					}
					
				}
				;


block[FetalTransaction t] 
@init {
	trans = t;
	om = new ObjectMath();
}
: '{' statements '}' ;


evalExpression returns [boolean result]	
				: lh=evalExpression logicExpressOp rh=evalExpression
				{
					$result = om.evaluateLogic($lh.result, $logicExpressOp.text, $rh.result);
				}
				| '(' lh=evalExpression logicExpressOp rh=evalExpression ')'
				{
					$result = om.evaluateLogic($lh.result, $logicExpressOp.text, $rh.result);
				}
				| eval
				{
					$result = $eval.result;
				}
				| '(' eval ')'
				{
					$result = $eval.result;					
				}
				;


eval returns [boolean result]
				: lh=rharg comparisonOp rh=rharg
				{
					$result= om.evaluateExpression($lh.obj, $comparisonOp.text, $rh.obj);
				}
				;


assignmentCommands returns [Object obj] 
			:  GetBalance '(' stringArg ')'
			{
				$obj = trans.getBalance($stringArg.string);
			}
			|	GetVariableType '(' var ')'
			{
				
				if (trans.isVariable($var.name) == false) {
					Exception ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
					_errHandler.reportError(this, (RecognitionException) ex );
					
				}else{
					$obj = trans.getVariableType($var.name);
				}
			}
			| GetDescription
			{
				$obj = trans.getDescription();
			}
			| Today
			{ 
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					$obj = (Date) sdf.parse(sdf.format(new Date()));
				}catch (ParseException pe){
					RecognitionException ex = trans.errorHandler(INVALID_DATE, _localctx, this);
					_errHandler.reportError(this, ex );
				}
			}
			| GetDays '(' startPeriod=dateArg ',' endPeriod=dateArg ')'
			{
				$obj = (Double) trans.getDays($startPeriod.date, $endPeriod.date );
			}
			| DayOfTheWeek '(' dateArg ')'
			{	
				$obj = trans.dayOfTheWeek($dateArg.date);
			}
			| GetCalendarDay '(' dateArg ')'
			{
				$obj=trans.getCalendarDay($dateArg.date);
			}
			| GetMonth '(' dateArg ')'
			{
				$obj=trans.getMonth($dateArg.date);
			}
			| GetYear '(' dateArg ')'
			{
				$obj=trans.getYear($dateArg.date);
			}
			| Import '(' stringArg ')' /* Import( path ) */
			{
				$obj=trans.importClass($stringArg.string);
				if ($obj == null) {
					RecognitionException ex = trans.errorHandler(6, _localctx, this);
				}
				
			}
			| Lookup '(' sql=stringArg ',' argumentList ')' /* Lookup( table, SQL) */
			{
				$obj=trans.lookup($sql.string, $argumentList.argList.toArray());
			}
			| List '(' sql=stringArg ',' argumentList ')' /* List( table, SQL) */
			{
				trans.list( $sql.string, $argumentList.argList.toArray());
			}
			| Update '(' sql=stringArg ',' argumentList ')'
			{
				$obj=trans.update( $sql.string, $argumentList.argList.toArray());
			}
			| invocation 
			{
				if ($invocation.args != null) {
					$obj = trans.invokeMethod($invocation.obj, $invocation.method, $invocation.args);
				}else{
					$obj = trans.invokeMethod($invocation.obj, $invocation.method);
				}
				if ($obj == null) {
					RecognitionException ex = trans.errorHandler(6, _localctx, this);
				}
			}
			;
			


command 	: Print '(' rharg ')' 
			{
				if ($rharg.obj == null) {
					Exception ex = trans.errorHandler(MALFORMED_EXP, _localctx, this);
					_errHandler.reportError(this, (RecognitionException) ex );
				}else{
					System.out.println($rharg.obj);
				}
			}
			| Credit '(' amtArg ',' stringArg ')'
			{
				trans.credit($amtArg.amt, $stringArg.string);
			}
			| Debit '(' amtArg ',' stringArg ')'
			{
				trans.debit($amtArg.amt, $stringArg.string);
			}
			| Ledger '(' debitOrCredit ',' amtArg ',' acc=stringArg ',' desc=stringArg ')'
			{
				trans.ledger($debitOrCredit.c, $amtArg.amt, $acc.string, $desc.string );
			}
			| Alias '(' account=stringArg ',' name=stringArg ')'
			{
				trans.putMap($account.string, $name.string);
			}
			| MapFile ':' stringArg
			{
				trans.mapFile($stringArg.string);
			}
			| invocation
			{	
				if ($invocation.args != null) {
					trans.invokeMethod($invocation.obj, $invocation.method, $invocation.args);
				}else{
					trans.invokeMethod($invocation.obj, $invocation.method, null);
				}
			}
			;

invocation returns [Object obj, String method, Object[] args]
			: o=objectLiteral '.' m=identifier '('argumentList? ')'
			{
				$obj = trans.getValue($o.text);
				if ($obj == null) {
					RecognitionException ex = trans.errorHandler(INVALID_OBJECT, _localctx, this);
					_errHandler.reportError(this, ex );
				}
				$method = $m.text;				
				$args = $argumentList.argList.toArray();
			}
			| o=objectLiteral '.' m=identifier '()'
			{
				$obj = trans.getValue($o.text);
				if ($obj == null) {
					RecognitionException ex = trans.errorHandler(INVALID_OBJECT, _localctx, this);
					_errHandler.reportError(this, ex );
				}
				$method = $m.text;				
				$args = null;
				
			}
			;
			
argumentList returns [List <Object> argList]
	@init{$argList = new ArrayList<Object>();}

			: rharg  {$argList.add($rharg.obj);} (',' rharg {$argList.add($rharg.obj);})*
			;

amtArg	returns [Double amt]
			: rharg
			{
				if ($rharg.obj == null || $rharg.obj instanceof Double == false) {
					RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				$amt = (Double) $rharg.obj;
			}
			;
			
stringArg returns [String string] 
			: rharg
			{
				if ($rharg.obj == null || $rharg.obj instanceof String == false) {
					RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				$string = (String) $rharg.obj;
			}
			;

numberArg	returns [Long num]
			: rharg
			{
				if ($rharg.obj == null || $rharg.obj instanceof Long == false) {
					RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				$num = (Long) $rharg.obj;
			}
			;

dateArg	returns [Date date]
			: rharg
			{
				if ($rharg.obj == null || $rharg.obj instanceof Date == false) {
					RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				$date = (Date) $rharg.obj;
				
			}
			;

debitOrCredit returns [char c]	: charLiteral
				{
					$c = $charLiteral.text.charAt(0);
				}
				;

literal	returns [Object obj]	
			: numericLiteral
			{
				$obj = (Long) trans.getLong($numericLiteral.text);
			}
			| doubleLiteral
			{
				$obj = (Double) trans.getDouble($doubleLiteral.text);
			}
			| booleanLiteral
			{
				if ("true".compareTo($booleanLiteral.text) == 0 ) {
					$obj = (boolean) true;
				}else if ("false".compareTo($booleanLiteral.text) == 0) {
					$obj = (boolean) false;
				}else{
					$obj = null;
				}
				
			}
			| percentLiteral
			{
				String d = $percentLiteral.text;
				d = d.substring(0, d.length() - 1);
				Double result = trans.getDouble(d);
				result /= 100;
				$obj = (Double) result;

			}
			| stringLiteral
			{$obj = (String) trans.stripQuotes($stringLiteral.text);}
			|	dateLiteral
			{
					try {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						$obj = (Date) sdf.parse($dateLiteral.text);
					}catch(ParseException pe){
						Exception ex = trans.errorHandler(2, _localctx, this);
						_errHandler.reportError(this, (RecognitionException) ex );
					}
			}
			;


fileName returns[String name]	
			: '<' fn=Identifier ('.' ft=Identifier)? '>'
			{
				if ($ft.text != null) {
					$name = $fn.text + "." + $ft.text;
				}else{
					$name = $fn.text;
				}
			}
			;
			


charLiteral		: ('D' | 'C');

numericLiteral	: Number ;

doubleLiteral	: Decimal ;

percentLiteral	: Percentage ;
			
booleanLiteral	: Boolean ;

stringLiteral 	: String ;

dateLiteral		: Date ;

objectLiteral	: Identifier ;

daoLiteral		: Identifier ;

//Below are Token definitions
/*************************************************************************************
 *************************************************************************************
 ** Token Definitions 
 *************************************************************************************
 *************************************************************************************/
/******************************************************************
 * Data Types
 ******************************************************************/
DecimalType 	: 'decimal' ;
NumberType 		: 'number' ;
StringType 		: 'string' ;
BooleanType 	: 'boolean' ;
DateType 		: 'date' ;
ObjectType 		: 'object' ;
DaoType 		: 'dao' ;
/******************************************************************
 * Assignmnt operator
 ******************************************************************/
 Equals			: '=' ;
 
 /*****************************************************************
  * Unary operators
  *****************************************************************/
PlusEquals		: '+=' ;
MinusEquals 	: '-=' ;
MultiplyEquals	: '*=' ;
DivideEquals	: '/=' ;
ModuloEquals	: '%=' ;
ExponentEquals	: '^=' ;

/*****************************************************************
 * Binary operators
 *****************************************************************/
 Plus			: '+' ;
 Minus			: '-' ;
 Multiply		: '*' ;
 Divide			: '/' ;
 Modulo			: '%' ;
 Exponent		: '^' ;
 
 /*************************************************************** 
  * Bitwise operators
  ***************************************************************/
  And			: '&' ;
  Or			: '|' ;
  Not			: '!' ;
  
 /*************************************************************
  * Compariso operators
  *************************************************************/
  IsEqualTo					: '==' ;
  IsLessThan				: '<'  ;
  IsLessThanOrEqualTo		: '<=' ;
  IsGreaterThan				: '>'  ;
  IsGreaterThanOrEqualTo	: '>=' ;
  IsNotEqualTo				: '!=' ;
   
 /*************************************************************
  * Expression operators
  *************************************************************/
  AndExpression			: '&&' ;
  OrExpression			: '||' ;
  ExclusiveOrExpression	: '^^' ;

// Reserve words (Assignment Commands)
GetBalance		: 'getBalance';
GetVariableType	: 'getVariableType' ;
GetDescription  : 'getDescription' ;
Today			: 'today';
GetDays			: 'getDays' ;
DayOfTheWeek	: 'dayOfTheWeek' ;
GetCalendarDay  : 'getCalendarDay' ;
GetMonth		: 'getMonth' ;
GetYear			: 'getYear' ;
Import			: 'import'	;
Lookup			: 'lookup'	;
Update			: 'update'	;
List			: 'list' 	;


// Reserve words (Commands)
Credit			: 'credit';
Debit			: 'debit';
Ledger			: 'ledger';
Alias			: 'alias' ;
MapFile			: 'mapFile' ;

IfStatement	: 'if';
Else		: 'else';
Print		: 'print';

Percentage	: (Sign)? Digit+ (Dot Digit+)? '%' ;

Boolean		: 'true' | 'false';

Number			: Sign? Digit+;

Decimal		: Sign? Digit+ Dot Digit*;

Date		: Year '-' Month '-' Day;

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;
String: '"' ( ESC | ~[\\"] )* '"';

/*************************************************************************************
 *************************************************************************************
 ** Fragment Definitions 
 *************************************************************************************
 *************************************************************************************/
fragment
ESC :   '\\' [abtnfrv"'\\]
    ;

fragment
IdentifierNondigit
    :   Nondigit
    //|   // other implementation-defined characters...
    ;
fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :  [0-9]
    ;
    
fragment
Digits
	: [-+]?[0-9]+
	;

fragment
Year
	: Digit Digit Digit Digit;

fragment
Month
	: Digit Digit;
	
fragment
Day
	: Digit Digit;

fragment
Sign
    :   Plus | Minus
    ;
fragment Dot : '.';

    
fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   SimpleEscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

    
fragment    
CChar
    :   ~['\\\r\n]
    |   SimpleEscapeSequence
    ;
    
fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

ExtendedAscii
	: [\x80-\xfe]+
	-> skip
	;
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
	
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
