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
			{trans.addVariable($var.name, $type.varType); }
			| type assignment
			{
				trans.addVariable($assignment.lh, $type.varType, $assignment.obj);				
			}
			;
			
var returns [String name]		: identifier
								{$name = $identifier.text;}
								;


type returns [VariableType varType]
			: arithmetic
			{
				$varType = $arithmetic.varType;
			}
			| lexical
			{
				$varType = $lexical.varType;
			}
			| logical
			{
				$varType = $logical.varType;
			}
			| dateType
			{
				$varType = $dateType.varType;
			}
			;

assignment returns [Object obj, String lh]		
			: lharg '=' rharg
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
				if ($lharg.obj == null) {
					NoViableAltException ex = trans.getException("'" + $lharg.text + "' has not been defined.",_localctx,this);
					_errHandler.reportError(this, (RecognitionException) ex );
				}else{
					$obj = om.getExpression($lharg.obj, oper, $rharg.obj);								
					trans.assignVariable($lharg.text, $obj);
				}
			}
			;

arithmetic returns [VariableType varType]
			: 'double'
			{
				$varType = VariableType.DOUBLE;
			}
			| 'long'
			{
				$varType = VariableType.LONG;
			}
			;

lexical	returns [VariableType varType]
			: 'string' 
			{
				$varType = VariableType.STRING;
			}
			;

logical	returns [VariableType varType]
			: 'boolean'
			{
				$varType = VariableType.BOOLEAN;
			}
			;

dateType returns [VariableType varType]
			: 'date'
			{
				$varType = VariableType.DATE;
			}
			;


assignmentOp	: '='		// Equals
				;

unaryOP			: '+='		// Plus Equals
				| '-='		// Minus Equals
				| '*='		// Multiply Equals
				| '/='		// Divide Equals
				| '%='		// Modulo Equals
				| '^='		// Exponent Equals
				;
expressionOp	: arithExpressOp
				| bitwiseExpressOp
				;

arithExpressOp	: '*'
				| '/'
				| '+'
				| '-'
				| '%'
				| '^'
				;
				
bitwiseExpressOp  : '&'
				| '|'
				| '!'
				;

comparisonOp	: '=='
				| '<'
				| '<='
				| '>'
				| '>='
				| '!='
				;
				
logicExpressOp	: '&&'
				| '||'
				| '^^'
				;

rharg returns[Object obj]		
			: lh=rharg expressionOp rh=rharg
			{
				if (trans.isMatched($lh.obj, $rh.obj) == false) {
					
					NoViableAltException ex = trans.getException("'" + $lh.text + "' and ''" + $rh.text + "' are different types.",_localctx,this);
					_errHandler.reportError(this, (RecognitionException) ex );
				}else{
					$obj = om.getExpression($lh.obj, $expressionOp.text, $rh.obj);
				}
			}
			| '(' lh=rharg expressionOp rh=rharg ')'
			{
				if (trans.isMatched($lh.obj, $rh.obj) == false) {
					
					NoViableAltException ex = trans.getException("'" + $lh.text + "' and ''" + $rh.text + "' are different types.",_localctx,this);
					_errHandler.reportError(this, (RecognitionException) ex );
				}else{
					$obj = om.getExpression($lh.obj, $expressionOp.text, $rh.obj);
				}
			}
			| var
			{
				
				$obj = trans.getValue($var.name);
				if ($obj == null) {
					NoViableAltException ex = trans.getException("'" + $var.name + "' is not defined.",_localctx,this);
					_errHandler.reportError(this, (RecognitionException) ex );
					
				}
			}
			| literal
			{
				$obj = $literal.obj;
				if ($obj == null) {
					NoViableAltException ex = trans.getException("'" + $literal.text + "' is malformed.",_localctx,this);
					_errHandler.reportError(this, (RecognitionException) ex );
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
							NoViableAltException ex = trans.getException("Can not load file: '" + $rfn.name + "'",_localctx,this);
							_errHandler.reportError(this, (RecognitionException) ex );
							
						}
					}else if(_localctx.lfn != null){
						try {
							trans.loadBlock($lfn.name);
						} catch (IOException e) {
							NoViableAltException ex = trans.getException("Can not load file: '" + $lfn.name + "'", _localctx,this);
							_errHandler.reportError(this, (RecognitionException) ex );
							
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

/*
eval returns [boolean result]	
				: lh=literal comparisonOp rh=literal
				{
					$result = om.evaluateExpression($lh.obj, $comparisonOp.text, $rh.obj);
				}
				| var comparisonOp literal
				{
					if (trans.isVariable($var.name) == false) {
						
						Exception ex = trans.getException("'" + $var.name + "' has not been defined.",_localctx, this );
						_errHandler.reportError(this, (RecognitionException) ex );					
					}else{
						Object lh = trans.getValue($var.name);
						$result = om.evaluateExpression(lh, $comparisonOp.text, $literal.obj);
					}
				}
				| literal comparisonOp var
				{
					if (trans.isVariable($var.name) == false) {
						
						Exception ex = trans.getException("'" + $var.name + "' has not been defined.",_localctx, this);
						_errHandler.reportError(this, (RecognitionException) ex );
					}else{
						Object rh = trans.getValue($var.name);
						$result = om.evaluateExpression($literal.obj, $comparisonOp.text, rh);
					}
				}
				| lv=var comparisonOp rv=var
				{
					Object l = trans.getValue($lv.name);
					Object r = trans.getValue($rv.name);
					$result = om.evaluateExpression(l, $comparisonOp.text, r);
				}
				;
*/
assignmentCommands returns [Object obj] 
			: GetAmount 
			{
				$obj = trans.getAmount();
			}
			| GetTax
			{
				$obj = trans.getTax();
			}
			| GetDescription
			{
				$obj = trans.getDescription();
			}
			| GetItemPrice '(' stringArg ')'
			{
				$obj = trans.getItemPrice($stringArg.string);
			}
			| GetItemTax '(' stringArg ')'
			{
				$obj = trans.getItemTax($stringArg.string);
			}
			| GetItemQty '(' stringArg ')'
			{
				$obj = trans.getItemQty($stringArg.string);
			}
			| GetTotalItems 
			{
				$obj = trans.getTotalItems();
			}
			| GetShipCharges
			{
				$obj = trans.getShipCharges();
			}
			| GetAddedCharges
			{
				$obj = trans.getAddedCharges();
			}
			| GetBalance '(' stringArg ')'
			{
				$obj = trans.getBalance($stringArg.string);
			}
			| GetLowestItem
			{
				$obj = trans.getLowestItem();
			}
			| GetHighestItem
			{
				$obj = trans.getHighestItem();
			}
			|	GetVariableType '(' var ')'
			{
				
				if (trans.isVariable($var.name) == false) {
					Exception ex = trans.getException("'" + $var.name  + "' has not been declared",_localctx, this);
					_errHandler.reportError(this, (RecognitionException) ex );
					
				}else{
					$obj = trans.getVariableType($var.name);
				}
			}
			| Today
			{ 
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					$obj = (Date) sdf.parse(sdf.format(new Date()));
				}catch (ParseException pe){
					Exception ex = trans.getException("Invalid date format.",_localctx, this);
					_errHandler.reportError(this, (RecognitionException) ex );
				}
			}
			| GetDays '(' startPeriod=dateArg ',' endPeriod=dateArg ')'
			{
				$obj = (Double) trans.getDays($startPeriod.date, $endPeriod.date );
			}
			| DayOfTheWeek '(' dateArg ')'
			{
				$obj = om.dayOfTheWeek($dateArg.date);
			}
			| GetRate '(' stringArg ')'
			{
				$obj = trans.getRate($stringArg.string);
			}
			| GetBaseCurrency
			{
				$obj = trans.getBaseCurrency();
			}
			| LastRefreshDate
			{
				$obj = trans.lastRefreshDate();
			}
			;


command 	: Print '(' rharg ')' 
			{
				if ($rharg.obj == null) {
					Exception ex = trans.getException("Malformed assignment.",_localctx, this);
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
			| AddStock '(' stringArg ',' numberArg ')'
			{
				trans.addStock($stringArg.string, $numberArg.num);
			}
			| DepleteStock '(' stringArg ',' numberArg ')'
			{
				trans.depleteStock($stringArg.string, $numberArg.num);
			}
			| SetShipCharges '(' amtArg ')'
			{
				trans.setShipCharges($amtArg.amt);
			}
			| SetAddedCharges '(' amtArg ')'
			{
				trans.setAddedCharges($amtArg.amt);
			}
			| CommitStock '(' stringArg ',' numberArg ')'
			{
				trans.commitStock($stringArg.string, $numberArg.num);
			}
			| CommitReceipt
			{
				trans.commitReceipt();
			}
			| DepleteReceipt
			{
				trans.depleteReceipt();
			}
			| Alias '(' account=stringArg ',' name=stringArg ')'
			{
				trans.putMap($account.string, $name.string);
			}
			| MapFile ':' stringArg
			{
				trans.mapFile($stringArg.string);
			}
			;

amtArg	returns [Double amt]
			: rharg
			{
				$amt = (Double) $rharg.obj;
			}
			;
			
stringArg returns [String string] 
			: rharg
			{
				$string = (String) $rharg.obj;
			}
			;

numberArg	returns [Long num]
			: rharg
			{
				$num = (Long) $rharg.obj;
			}
			;

dateArg	returns [Date date]
			: rharg
			{
				$date = (Date) $rharg.obj;
			}
			;


debitOrCredit returns [char c]	: charLiteral
				{
					$c = $charLiteral.text.charAt(0);
				}
				;

literal	returns [Object obj]	
			: stringLiteral
			{$obj = (String) trans.stripQuotes($stringLiteral.text);}
			| numericLiteral
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
			|	dateLiteral
			{
					try {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						$obj = (Date) sdf.parse($dateLiteral.text);
					}catch(ParseException pe){	
						Exception ex = trans.getException("Invalid date format.",_localctx, this);
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

numericLiteral	: Long;

doubleLiteral : Double;

percentLiteral	: Percentage;
			
booleanLiteral	: Boolean;

stringLiteral 	: String ;

dateLiteral		: Date ;

//Below are Token definitions
/*************************************************************************************
 *************************************************************************************
 ** Token Definitions 
 *************************************************************************************
 *************************************************************************************/

// Reserve words (Assignment Commands)
GetAmount		: 'getAmount';
GetTax			: 'getTax';
GetDescription	: 'getDescription';
GetItemPrice	: 'getItemPrice';
GetItemTax		: 'getItemTax';
GetItemQty		: 'getItemQty';
GetTotalItems	: 'getTotalItems';
GetShipCharges  : 'getShipCharges';
GetAddedCharges	: 'getAddedCharges';
GetBalance		: 'getBalance';
GetLowestItem 	: 'getLowestItem';
GetHighestItem	: 'getHighestItem';
GetVariableType	: 'getVariableType' ;
CommitReceipt	: 'commitReceipt';
DepleteReceipt	: 'depleteReceipt' ;
Today			: 'today';
GetDays			: 'getDays' ;
DayOfTheWeek	: 'dayOfTheWeek' ;
GetRate			: 'getRate' ;
GetBaseCurrency	: 'getBaseCurrency' ;
LastRefreshDate	: 'lastRefreshDate' ;
Alias			: 'alias' ;
MapFile			: 'mapFile' ;


// Reserve words (Commands)
Credit			: 'credit';
Debit			: 'debit';
Ledger			: 'ledger';
AddStock		: 'addStock';
DepleteStock	: 'depleteStock';
SetTax			: 'setTax';
SetShipCharges	: 'setShipCharges';
SetAddedCharges : 'setAddedCharges';
CommitStock		: 'commitStock' ;

IfStatement	: 'if';
Else		: 'else';
Print		: 'print';

Percentage	: (Sign)? Digit+ ('.' Digit+)? '%' ;

Boolean		: 'true' | 'false';

Long		: Sign? Digit+;

Double		: Sign? Digit+ '.' Digit*;

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
    :   [0-9]
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
    :   '+' | '-'
    ;
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



// ignore the lines generated by c preprocessor                                   
// sample line : '#line 1 "/home/dm/files/dk1.h" 1'                           
LineAfterPreprocessing
    :   '#line' Whitespace* ~[\r\n]*
        -> skip
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
