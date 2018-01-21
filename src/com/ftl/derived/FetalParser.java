// Generated from Fetal.g4 by ANTLR 4.7.1

package com.ftl.derived;
import com.ftl.helper.*;
import com.ftl.events.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Semaphore;
import java.util.Set;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FetalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		DecimalType=10, NumberType=11, StringType=12, BooleanType=13, DateType=14, 
		ObjectType=15, DaoType=16, Equals=17, PlusEquals=18, MinusEquals=19, MultiplyEquals=20, 
		DivideEquals=21, ModuloEquals=22, ExponentEquals=23, Plus=24, Minus=25, 
		Multiply=26, Divide=27, Modulo=28, Exponent=29, And=30, Or=31, Not=32, 
		IsEqualTo=33, IsLessThan=34, IsLessThanOrEqualTo=35, IsGreaterThan=36, 
		IsGreaterThanOrEqualTo=37, IsNotEqualTo=38, AndExpression=39, OrExpression=40, 
		ExclusiveOrExpression=41, GetBalance=42, GetVariableType=43, GetDescription=44, 
		Today=45, GetDays=46, DayOfTheWeek=47, GetCalendarDay=48, GetMonth=49, 
		GetYear=50, GetDate=51, Import=52, Lookup=53, List=54, Begin=55, End=56, 
		Credit=57, Debit=58, Ledger=59, Alias=60, MapFile=61, Update=62, Insert=63, 
		Delete=64, DepleteStock=65, CommitStock=66, AddStock=67, Print=68, IfStatement=69, 
		Else=70, OpenBracket=71, CloseBracket=72, Boolean=73, Percentage=74, Decimal=75, 
		Number=76, Date=77, Identifier=78, String=79, Whitespace=80, Newline=81, 
		BlockComment=82, LineComment=83;
	public static final int
		RULE_transaction = 0, RULE_begin = 1, RULE_end = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_declaration = 5, RULE_var = 6, RULE_type = 7, 
		RULE_assignment = 8, RULE_assignmentOp = 9, RULE_unaryOP = 10, RULE_expressionOp = 11, 
		RULE_arithExpressOp = 12, RULE_bitwiseExpressOp = 13, RULE_comparisonOp = 14, 
		RULE_logicExpressOp = 15, RULE_rharg = 16, RULE_lharg = 17, RULE_identifier = 18, 
		RULE_evaluation = 19, RULE_block = 20, RULE_evalExpression = 21, RULE_eval = 22, 
		RULE_assignmentCommands = 23, RULE_command = 24, RULE_invocation = 25, 
		RULE_argumentList = 26, RULE_amtArg = 27, RULE_stringArg = 28, RULE_setArg = 29, 
		RULE_numberArg = 30, RULE_dateArg = 31, RULE_daoArg = 32, RULE_debitOrCredit = 33, 
		RULE_literal = 34, RULE_charLiteral = 35, RULE_numericLiteral = 36, RULE_doubleLiteral = 37, 
		RULE_percentLiteral = 38, RULE_booleanLiteral = 39, RULE_stringLiteral = 40, 
		RULE_dateLiteral = 41, RULE_objectLiteral = 42, RULE_daoLiteral = 43;
	public static final String[] ruleNames = {
		"transaction", "begin", "end", "statements", "statement", "declaration", 
		"var", "type", "assignment", "assignmentOp", "unaryOP", "expressionOp", 
		"arithExpressOp", "bitwiseExpressOp", "comparisonOp", "logicExpressOp", 
		"rharg", "lharg", "identifier", "evaluation", "block", "evalExpression", 
		"eval", "assignmentCommands", "command", "invocation", "argumentList", 
		"amtArg", "stringArg", "setArg", "numberArg", "dateArg", "daoArg", "debitOrCredit", 
		"literal", "charLiteral", "numericLiteral", "doubleLiteral", "percentLiteral", 
		"booleanLiteral", "stringLiteral", "dateLiteral", "objectLiteral", "daoLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "':'", "'.'", "'()'", "'D'", "'C'", 
		"'decimal'", "'number'", "'string'", "'boolean'", "'date'", "'object'", 
		"'dao'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'!'", "'=='", "'<'", 
		"'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'^^'", "'getBalance'", 
		"'getVariableType'", "'getDescription'", "'today'", "'getDays'", "'dayOfTheWeek'", 
		"'getCalendarDay'", "'getMonth'", "'getYear'", "'getDate'", "'import'", 
		"'lookup'", "'list'", "'begin'", "'end'", "'credit'", "'debit'", "'ledger'", 
		"'alias'", "'mapFile'", "'update'", "'insert'", "'delete'", "'depleteStock'", 
		"'commitStock'", "'addStock'", "'print'", "'if'", "'else'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "DecimalType", 
		"NumberType", "StringType", "BooleanType", "DateType", "ObjectType", "DaoType", 
		"Equals", "PlusEquals", "MinusEquals", "MultiplyEquals", "DivideEquals", 
		"ModuloEquals", "ExponentEquals", "Plus", "Minus", "Multiply", "Divide", 
		"Modulo", "Exponent", "And", "Or", "Not", "IsEqualTo", "IsLessThan", "IsLessThanOrEqualTo", 
		"IsGreaterThan", "IsGreaterThanOrEqualTo", "IsNotEqualTo", "AndExpression", 
		"OrExpression", "ExclusiveOrExpression", "GetBalance", "GetVariableType", 
		"GetDescription", "Today", "GetDays", "DayOfTheWeek", "GetCalendarDay", 
		"GetMonth", "GetYear", "GetDate", "Import", "Lookup", "List", "Begin", 
		"End", "Credit", "Debit", "Ledger", "Alias", "MapFile", "Update", "Insert", 
		"Delete", "DepleteStock", "CommitStock", "AddStock", "Print", "IfStatement", 
		"Else", "OpenBracket", "CloseBracket", "Boolean", "Percentage", "Decimal", 
		"Number", "Date", "Identifier", "String", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Fetal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		FetalTransaction trans;
		ObjectMath	om;
		Semaphore semaphore;
		private static final int NOT_DEFINED=0, MALFORMED_EXP=1, CAST_EXCEPT=2, CANNOT_LOAD_FILE=3,
								 INVALID_DATE=4, CANNOT_LOAD_OBJECT=5, CANNOT_INVOKE_METHD=6, INVALID_OBJECT=7,
								 INVALID_ARG=8, RECORD_NOT_FOUND=9, DEBUG_ERROR=10, MALFORMED_CODEBLOCK=11; 
		public long getErrorCount() {
			return trans.getErrorCount();
		}
		public void setErrorCount(long errorCount ) {
			trans.setErrorCount(errorCount);
		}
		public String getErrMsg() {
			return trans.getErrMsg();
		}
		public void fetalLogger(String msg) {
			trans.fetalLogger(getClass().getName(), msg);
		}

	public FetalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TransactionContext extends ParserRuleContext {
		public FetalTransaction t;
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TransactionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TransactionContext(ParserRuleContext parent, int invokingState, FetalTransaction t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_transaction; }
	}

	public final TransactionContext transaction(FetalTransaction t) throws RecognitionException {
		TransactionContext _localctx = new TransactionContext(_ctx, getState(), t);
		enterRule(_localctx, 0, RULE_transaction);
		try {
			enterOuterAlt(_localctx, 1);
			{

							trans = t;
							om = new ObjectMath();	
							semaphore = trans.getSemaphore();			
						
			setState(89);
			begin();
			setState(90);
			statements();
			setState(91);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(FetalParser.Begin, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);

			if (semaphore != null) {
				trans.setLineNum(getCurrentToken().getLine());	
				trans.getStep().receiveStep(trans);		
				try {
					semaphore.acquire();
				}catch (InterruptedException e){
					RecognitionException ex = trans.errorHandler(DEBUG_ERROR, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				trans.setPrevLine(trans.getLineNum());
			}

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(Begin);
			trans.beginTrans();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(FetalParser.End, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);

			if (semaphore != null) {
				trans.setLineNum(getCurrentToken().getLine());	
				trans.getStep().receiveStep(trans);		
				try {
					semaphore.acquire();
				}catch (InterruptedException e){
					RecognitionException ex = trans.errorHandler(DEBUG_ERROR, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				trans.setPrevLine(trans.getLineNum());
			}

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(End);
			trans.commitTrans();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DecimalType) | (1L << NumberType) | (1L << StringType) | (1L << BooleanType) | (1L << DateType) | (1L << ObjectType) | (1L << DaoType) | (1L << Credit) | (1L << Debit) | (1L << Ledger) | (1L << Alias) | (1L << MapFile) | (1L << Update) | (1L << Insert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Delete - 64)) | (1L << (DepleteStock - 64)) | (1L << (CommitStock - 64)) | (1L << (AddStock - 64)) | (1L << (Print - 64)) | (1L << (IfStatement - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);

			if (semaphore != null) {
				trans.setLineNum(getCurrentToken().getLine());	
				trans.getStep().receiveStep(trans);		
				try {
					semaphore.acquire();
				}catch (InterruptedException e){
					RecognitionException ex = trans.errorHandler(DEBUG_ERROR, _localctx, this);
					_errHandler.reportError(this, ex );
					
				}
				trans.setPrevLine(trans.getLineNum());
			}

		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				declaration();
				setState(105);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				command();
				setState(108);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				assignment();
				setState(111);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				evaluation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public VarContext var;
		public AssignmentContext assignment;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((DeclarationContext)_localctx).type = type();
				setState(118);
				((DeclarationContext)_localctx).var = var();

								trans.publish(((DeclarationContext)_localctx).var.name, ((DeclarationContext)_localctx).type.varType);
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((DeclarationContext)_localctx).type = type();
				setState(122);
				((DeclarationContext)_localctx).assignment = assignment();

								trans.publish(((DeclarationContext)_localctx).assignment.lh, ((DeclarationContext)_localctx).type.varType, ((DeclarationContext)_localctx).assignment.obj);				
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public String name;
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((VarContext)_localctx).identifier = identifier();

							((VarContext)_localctx).name =  (((VarContext)_localctx).identifier!=null?_input.getText(((VarContext)_localctx).identifier.start,((VarContext)_localctx).identifier.stop):null);
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public VariableType varType;
		public TerminalNode DecimalType() { return getToken(FetalParser.DecimalType, 0); }
		public TerminalNode NumberType() { return getToken(FetalParser.NumberType, 0); }
		public TerminalNode StringType() { return getToken(FetalParser.StringType, 0); }
		public TerminalNode BooleanType() { return getToken(FetalParser.BooleanType, 0); }
		public TerminalNode DateType() { return getToken(FetalParser.DateType, 0); }
		public TerminalNode ObjectType() { return getToken(FetalParser.ObjectType, 0); }
		public TerminalNode DaoType() { return getToken(FetalParser.DaoType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalType:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(DecimalType);

								((TypeContext)_localctx).varType =  VariableType.DECIMAL;
							
				}
				break;
			case NumberType:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NumberType);

								((TypeContext)_localctx).varType =  VariableType.NUMBER;
							
				}
				break;
			case StringType:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(StringType);

								((TypeContext)_localctx).varType =  VariableType.STRING;
							
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(BooleanType);

								((TypeContext)_localctx).varType =  VariableType.BOOLEAN;
							
				}
				break;
			case DateType:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(DateType);

								((TypeContext)_localctx).varType =  VariableType.DATE;
							
				}
				break;
			case ObjectType:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(ObjectType);

								((TypeContext)_localctx).varType =  VariableType.OBJECT;
							
				}
				break;
			case DaoType:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(DaoType);

								((TypeContext)_localctx).varType =  VariableType.DAO;
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Object obj;
		public String lh;
		public LhargContext lharg;
		public RhargContext rharg;
		public UnaryOPContext unaryOP;
		public LhargContext lharg() {
			return getRuleContext(LhargContext.class,0);
		}
		public TerminalNode Equals() { return getToken(FetalParser.Equals, 0); }
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public UnaryOPContext unaryOP() {
			return getRuleContext(UnaryOPContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(147);
				match(Equals);
				setState(148);
				((AssignmentContext)_localctx).rharg = rharg(0);

								((AssignmentContext)_localctx).obj =  ((AssignmentContext)_localctx).rharg.obj;
								((AssignmentContext)_localctx).lh =  (((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null);
								if (trans.isVariable((((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null)) == true) {
									trans.assignVariable((((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null), ((AssignmentContext)_localctx).rharg.obj);
								}
									
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(152);
				((AssignmentContext)_localctx).unaryOP = unaryOP();
				setState(153);
				((AssignmentContext)_localctx).rharg = rharg(0);

								String oper = (((AssignmentContext)_localctx).unaryOP!=null?_input.getText(((AssignmentContext)_localctx).unaryOP.start,((AssignmentContext)_localctx).unaryOP.stop):null);
								oper = oper.substring(0, oper.length() - 1);
								if (trans.isVariable((((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null)) == false) {
									RecognitionException ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
									// _errHandler.reportError(this, ex );
								}else{
									((AssignmentContext)_localctx).obj =  om.getExpression(((AssignmentContext)_localctx).lharg.obj, oper, ((AssignmentContext)_localctx).rharg.obj);								
									trans.assignVariable((((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null), _localctx.obj);
								}
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOpContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(FetalParser.Equals, 0); }
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Equals);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOPContext extends ParserRuleContext {
		public TerminalNode PlusEquals() { return getToken(FetalParser.PlusEquals, 0); }
		public TerminalNode MinusEquals() { return getToken(FetalParser.MinusEquals, 0); }
		public TerminalNode MultiplyEquals() { return getToken(FetalParser.MultiplyEquals, 0); }
		public TerminalNode DivideEquals() { return getToken(FetalParser.DivideEquals, 0); }
		public TerminalNode ModuloEquals() { return getToken(FetalParser.ModuloEquals, 0); }
		public TerminalNode ExponentEquals() { return getToken(FetalParser.ExponentEquals, 0); }
		public UnaryOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOP; }
	}

	public final UnaryOPContext unaryOP() throws RecognitionException {
		UnaryOPContext _localctx = new UnaryOPContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PlusEquals) | (1L << MinusEquals) | (1L << MultiplyEquals) | (1L << DivideEquals) | (1L << ModuloEquals) | (1L << ExponentEquals))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOpContext extends ParserRuleContext {
		public ArithExpressOpContext arithExpressOp() {
			return getRuleContext(ArithExpressOpContext.class,0);
		}
		public BitwiseExpressOpContext bitwiseExpressOp() {
			return getRuleContext(BitwiseExpressOpContext.class,0);
		}
		public ExpressionOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOp; }
	}

	public final ExpressionOpContext expressionOp() throws RecognitionException {
		ExpressionOpContext _localctx = new ExpressionOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionOp);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
			case Multiply:
			case Divide:
			case Modulo:
			case Exponent:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				arithExpressOp();
				}
				break;
			case And:
			case Or:
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				bitwiseExpressOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithExpressOpContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(FetalParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(FetalParser.Divide, 0); }
		public TerminalNode Plus() { return getToken(FetalParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(FetalParser.Minus, 0); }
		public TerminalNode Modulo() { return getToken(FetalParser.Modulo, 0); }
		public TerminalNode Exponent() { return getToken(FetalParser.Exponent, 0); }
		public ArithExpressOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpressOp; }
	}

	public final ArithExpressOpContext arithExpressOp() throws RecognitionException {
		ArithExpressOpContext _localctx = new ArithExpressOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Multiply) | (1L << Divide) | (1L << Modulo) | (1L << Exponent))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseExpressOpContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(FetalParser.And, 0); }
		public TerminalNode Or() { return getToken(FetalParser.Or, 0); }
		public TerminalNode Not() { return getToken(FetalParser.Not, 0); }
		public BitwiseExpressOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpressOp; }
	}

	public final BitwiseExpressOpContext bitwiseExpressOp() throws RecognitionException {
		BitwiseExpressOpContext _localctx = new BitwiseExpressOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bitwiseExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Or) | (1L << Not))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOpContext extends ParserRuleContext {
		public TerminalNode IsEqualTo() { return getToken(FetalParser.IsEqualTo, 0); }
		public TerminalNode IsLessThan() { return getToken(FetalParser.IsLessThan, 0); }
		public TerminalNode IsLessThanOrEqualTo() { return getToken(FetalParser.IsLessThanOrEqualTo, 0); }
		public TerminalNode IsGreaterThan() { return getToken(FetalParser.IsGreaterThan, 0); }
		public TerminalNode IsGreaterThanOrEqualTo() { return getToken(FetalParser.IsGreaterThanOrEqualTo, 0); }
		public TerminalNode IsNotEqualTo() { return getToken(FetalParser.IsNotEqualTo, 0); }
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IsEqualTo) | (1L << IsLessThan) | (1L << IsLessThanOrEqualTo) | (1L << IsGreaterThan) | (1L << IsGreaterThanOrEqualTo) | (1L << IsNotEqualTo))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressOpContext extends ParserRuleContext {
		public TerminalNode AndExpression() { return getToken(FetalParser.AndExpression, 0); }
		public TerminalNode OrExpression() { return getToken(FetalParser.OrExpression, 0); }
		public TerminalNode ExclusiveOrExpression() { return getToken(FetalParser.ExclusiveOrExpression, 0); }
		public LogicExpressOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpressOp; }
	}

	public final LogicExpressOpContext logicExpressOp() throws RecognitionException {
		LogicExpressOpContext _localctx = new LogicExpressOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AndExpression) | (1L << OrExpression) | (1L << ExclusiveOrExpression))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhargContext extends ParserRuleContext {
		public Object obj;
		public RhargContext lh;
		public ExpressionOpContext expressionOp;
		public RhargContext rh;
		public VarContext var;
		public LiteralContext literal;
		public AssignmentCommandsContext assignmentCommands;
		public ExpressionOpContext expressionOp() {
			return getRuleContext(ExpressionOpContext.class,0);
		}
		public List<RhargContext> rharg() {
			return getRuleContexts(RhargContext.class);
		}
		public RhargContext rharg(int i) {
			return getRuleContext(RhargContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignmentCommandsContext assignmentCommands() {
			return getRuleContext(AssignmentCommandsContext.class,0);
		}
		public RhargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rharg; }
	}

	public final RhargContext rharg() throws RecognitionException {
		return rharg(0);
	}

	private RhargContext rharg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RhargContext _localctx = new RhargContext(_ctx, _parentState);
		RhargContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_rharg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(175);
				match(T__1);
				setState(176);
				((RhargContext)_localctx).lh = rharg(0);
				setState(177);
				((RhargContext)_localctx).expressionOp = expressionOp();
				setState(178);
				((RhargContext)_localctx).rh = rharg(0);
				setState(179);
				match(T__2);

								if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
									RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
									//_errHandler.reportError(this, ex );
								}else{
									((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
								}
							
				}
				break;
			case 2:
				{
				setState(182);
				((RhargContext)_localctx).var = var();

								
								if (trans.isVariable(((RhargContext)_localctx).var.name) == false) {
									RecognitionException ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
									//_errHandler.reportError(this, ex );
									
								}
								((RhargContext)_localctx).obj =  trans.getValue(((RhargContext)_localctx).var.name);
								
							
				}
				break;
			case 3:
				{
				setState(185);
				((RhargContext)_localctx).literal = literal();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).literal.obj;
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(MALFORMED_EXP, _localctx, this);
									//_errHandler.reportError(this, ex );
								}
							
				}
				break;
			case 4:
				{
				setState(188);
				((RhargContext)_localctx).assignmentCommands = assignmentCommands();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).assignmentCommands.obj;
							
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RhargContext(_parentctx, _parentState);
					_localctx.lh = _prevctx;
					_localctx.lh = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_rharg);
					setState(193);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(194);
					((RhargContext)_localctx).expressionOp = expressionOp();
					setState(195);
					((RhargContext)_localctx).rh = rharg(6);

					          				if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
					          					RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
					          					//_errHandler.reportError(this, ex );
					          				}else{
					          					((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
					          				}
					          			
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LhargContext extends ParserRuleContext {
		public Object obj;
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LhargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lharg; }
	}

	public final LhargContext lharg() throws RecognitionException {
		LhargContext _localctx = new LhargContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lharg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((LhargContext)_localctx).var = var();
			((LhargContext)_localctx).obj =  trans.getValue(((LhargContext)_localctx).var.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FetalParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvaluationContext extends ParserRuleContext {
		public boolean result;
		public EvalExpressionContext evalExpression;
		public TerminalNode IfStatement() { return getToken(FetalParser.IfStatement, 0); }
		public EvalExpressionContext evalExpression() {
			return getRuleContext(EvalExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(FetalParser.Else, 0); }
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_evaluation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IfStatement);
			setState(209);
			match(T__1);
			setState(210);
			((EvaluationContext)_localctx).evalExpression = evalExpression(0);
			setState(211);
			match(T__2);
			setState(212);
			block(((EvaluationContext)_localctx).evalExpression.result);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(213);
				match(Else);
				setState(214);
				block(!((EvaluationContext)_localctx).evalExpression.result);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public boolean result;
		public TerminalNode OpenBracket() { return getToken(FetalParser.OpenBracket, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(FetalParser.CloseBracket, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContext(ParserRuleContext parent, int invokingState, boolean result) {
			super(parent, invokingState);
			this.result = result;
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block(boolean result) throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState(), result);
		enterRule(_localctx, 40, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{


				if (_localctx.result == false) { // If the statement evealuates to false
					int level = 0;
					// Consume tokens until the end of block marker
					while (true){
						if (getCurrentToken().getText().compareTo("{") == 0) level++;
						consume();
						if (getCurrentToken().getText().compareTo("}") == 0) level--;
						if (level == 0 || getCurrentToken().getText().compareTo("<EOF>") == 0 ) break;
					}
					if (level > 0) {
						RecognitionException ex = trans.errorHandler(MALFORMED_CODEBLOCK, _localctx, this);
						//_errHandler.reportError(this, ex );
					}	
					// Set the parser state as if it had executed the tokens
					_localctx.start = getCurrentToken();
					_ctx.start = getCurrentToken();
					setState(220); 
					_errHandler.sync(this);
					consume(); // Consume the end of block marker
					
					return _localctx; // Exit the rule
				}


			setState(218);
			match(OpenBracket);
			setState(219);
			statements();
			setState(220);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalExpressionContext extends ParserRuleContext {
		public boolean result;
		public EvalExpressionContext lh;
		public LogicExpressOpContext logicExpressOp;
		public EvalExpressionContext rh;
		public EvalContext eval;
		public LogicExpressOpContext logicExpressOp() {
			return getRuleContext(LogicExpressOpContext.class,0);
		}
		public List<EvalExpressionContext> evalExpression() {
			return getRuleContexts(EvalExpressionContext.class);
		}
		public EvalExpressionContext evalExpression(int i) {
			return getRuleContext(EvalExpressionContext.class,i);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public EvalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalExpression; }
	}

	public final EvalExpressionContext evalExpression() throws RecognitionException {
		return evalExpression(0);
	}

	private EvalExpressionContext evalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EvalExpressionContext _localctx = new EvalExpressionContext(_ctx, _parentState);
		EvalExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_evalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(223);
				match(T__1);
				setState(224);
				((EvalExpressionContext)_localctx).lh = evalExpression(0);
				setState(225);
				((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
				setState(226);
				((EvalExpressionContext)_localctx).rh = evalExpression(0);
				setState(227);
				match(T__2);

									((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
								
				}
				break;
			case 2:
				{
				setState(230);
				((EvalExpressionContext)_localctx).eval = eval();

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;
								
				}
				break;
			case 3:
				{
				setState(233);
				match(T__1);
				setState(234);
				((EvalExpressionContext)_localctx).eval = eval();
				setState(235);
				match(T__2);

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;					
								
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EvalExpressionContext(_parentctx, _parentState);
					_localctx.lh = _prevctx;
					_localctx.lh = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_evalExpression);
					setState(240);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(241);
					((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
					setState(242);
					((EvalExpressionContext)_localctx).rh = evalExpression(5);

					          					((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
					          				
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EvalContext extends ParserRuleContext {
		public boolean result;
		public RhargContext lh;
		public ComparisonOpContext comparisonOp;
		public RhargContext rh;
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public List<RhargContext> rharg() {
			return getRuleContexts(RhargContext.class);
		}
		public RhargContext rharg(int i) {
			return getRuleContext(RhargContext.class,i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((EvalContext)_localctx).lh = rharg(0);
			setState(251);
			((EvalContext)_localctx).comparisonOp = comparisonOp();
			setState(252);
			((EvalContext)_localctx).rh = rharg(0);

								((EvalContext)_localctx).result =  om.evaluateExpression(((EvalContext)_localctx).lh.obj, (((EvalContext)_localctx).comparisonOp!=null?_input.getText(((EvalContext)_localctx).comparisonOp.start,((EvalContext)_localctx).comparisonOp.stop):null), ((EvalContext)_localctx).rh.obj);
							
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentCommandsContext extends ParserRuleContext {
		public Object obj;
		public StringArgContext stringArg;
		public VarContext var;
		public DateArgContext startPeriod;
		public DateArgContext endPeriod;
		public DateArgContext dateArg;
		public NumberArgContext y;
		public NumberArgContext m;
		public NumberArgContext d;
		public StringArgContext sql;
		public ArgumentListContext argumentList;
		public InvocationContext invocation;
		public TerminalNode GetBalance() { return getToken(FetalParser.GetBalance, 0); }
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public TerminalNode GetVariableType() { return getToken(FetalParser.GetVariableType, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode GetDescription() { return getToken(FetalParser.GetDescription, 0); }
		public TerminalNode Today() { return getToken(FetalParser.Today, 0); }
		public TerminalNode GetDays() { return getToken(FetalParser.GetDays, 0); }
		public List<DateArgContext> dateArg() {
			return getRuleContexts(DateArgContext.class);
		}
		public DateArgContext dateArg(int i) {
			return getRuleContext(DateArgContext.class,i);
		}
		public TerminalNode DayOfTheWeek() { return getToken(FetalParser.DayOfTheWeek, 0); }
		public TerminalNode GetCalendarDay() { return getToken(FetalParser.GetCalendarDay, 0); }
		public TerminalNode GetMonth() { return getToken(FetalParser.GetMonth, 0); }
		public TerminalNode GetYear() { return getToken(FetalParser.GetYear, 0); }
		public TerminalNode GetDate() { return getToken(FetalParser.GetDate, 0); }
		public List<NumberArgContext> numberArg() {
			return getRuleContexts(NumberArgContext.class);
		}
		public NumberArgContext numberArg(int i) {
			return getRuleContext(NumberArgContext.class,i);
		}
		public TerminalNode Import() { return getToken(FetalParser.Import, 0); }
		public TerminalNode Lookup() { return getToken(FetalParser.Lookup, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode List() { return getToken(FetalParser.List, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public AssignmentCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentCommands; }
	}

	public final AssignmentCommandsContext assignmentCommands() throws RecognitionException {
		AssignmentCommandsContext _localctx = new AssignmentCommandsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentCommands);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GetBalance:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(GetBalance);
				setState(256);
				match(T__1);
				setState(257);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(258);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj =  trans._getBalance(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetVariableType:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(GetVariableType);
				setState(262);
				match(T__1);
				setState(263);
				((AssignmentCommandsContext)_localctx).var = var();
				setState(264);
				match(T__2);

								
								if (trans.isVariable(((AssignmentCommandsContext)_localctx).var.name) == false) {
									Exception ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
									//_errHandler.reportError(this, (RecognitionException) ex );
									
								}else{
									((AssignmentCommandsContext)_localctx).obj =  trans.getVariableType(((AssignmentCommandsContext)_localctx).var.name);
								}
							
				}
				break;
			case GetDescription:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(GetDescription);

								((AssignmentCommandsContext)_localctx).obj =  trans.getDescription();
							
				}
				break;
			case Today:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(Today);
				 
								try {
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
									((AssignmentCommandsContext)_localctx).obj =  (Date) sdf.parse(sdf.format(new Date()));
								}catch (ParseException pe){
									RecognitionException ex = trans.errorHandler(INVALID_DATE, _localctx, this);
									//_errHandler.reportError(this, ex );
								}
							
				}
				break;
			case GetDays:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(GetDays);
				setState(272);
				match(T__1);
				setState(273);
				((AssignmentCommandsContext)_localctx).startPeriod = dateArg();
				setState(274);
				match(T__3);
				setState(275);
				((AssignmentCommandsContext)_localctx).endPeriod = dateArg();
				setState(276);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj =  (Double) trans.getDays(((AssignmentCommandsContext)_localctx).startPeriod.date, ((AssignmentCommandsContext)_localctx).endPeriod.date );
							
				}
				break;
			case DayOfTheWeek:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(DayOfTheWeek);
				setState(280);
				match(T__1);
				setState(281);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(282);
				match(T__2);
					
								((AssignmentCommandsContext)_localctx).obj =  trans.dayOfTheWeek(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case GetCalendarDay:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(GetCalendarDay);
				setState(286);
				match(T__1);
				setState(287);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(288);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj = trans.getCalendarDay(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case GetMonth:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				match(GetMonth);
				setState(292);
				match(T__1);
				setState(293);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(294);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj = trans.getMonth(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case GetYear:
				enterOuterAlt(_localctx, 9);
				{
				setState(297);
				match(GetYear);
				setState(298);
				match(T__1);
				setState(299);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(300);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj = trans.getYear(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case GetDate:
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
				match(GetDate);
				setState(304);
				match(T__1);
				setState(305);
				((AssignmentCommandsContext)_localctx).y = numberArg();
				setState(306);
				match(T__3);
				setState(307);
				((AssignmentCommandsContext)_localctx).m = numberArg();
				setState(308);
				match(T__3);
				setState(309);
				((AssignmentCommandsContext)_localctx).d = numberArg();
				setState(310);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj = trans.getDate( ((AssignmentCommandsContext)_localctx).y.num, ((AssignmentCommandsContext)_localctx).m.num, ((AssignmentCommandsContext)_localctx).d.num );
							
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 11);
				{
				setState(313);
				match(Import);
				setState(314);
				match(T__1);
				setState(315);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(316);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj = trans.importClass(((AssignmentCommandsContext)_localctx).stringArg.string);
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(6, _localctx, this);
								}
								
							
				}
				break;
			case Lookup:
				enterOuterAlt(_localctx, 12);
				{
				setState(319);
				match(Lookup);
				setState(320);
				match(T__1);
				setState(321);
				((AssignmentCommandsContext)_localctx).sql = stringArg();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(322);
					match(T__3);
					setState(323);
					((AssignmentCommandsContext)_localctx).argumentList = argumentList();
					}
				}

				setState(326);
				match(T__2);

								((AssignmentCommandsContext)_localctx).obj = trans._lookup(((AssignmentCommandsContext)_localctx).sql.string, ((AssignmentCommandsContext)_localctx).argumentList.argList.toArray());
								if (_localctx.obj == null) {
									
									RecognitionException ex = trans.errorHandler(RECORD_NOT_FOUND, _localctx, this);
									//_errHandler.reportError(this, ex );
								}
							
				}
				break;
			case List:
				enterOuterAlt(_localctx, 13);
				{
				setState(329);
				match(List);
				setState(330);
				match(T__1);
				setState(331);
				((AssignmentCommandsContext)_localctx).sql = stringArg();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(332);
					match(T__3);
					setState(333);
					((AssignmentCommandsContext)_localctx).argumentList = argumentList();
					}
				}

				setState(336);
				match(T__2);

								trans._list( ((AssignmentCommandsContext)_localctx).sql.string, ((AssignmentCommandsContext)_localctx).argumentList.argList.toArray());
							
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 14);
				{
				setState(339);
				((AssignmentCommandsContext)_localctx).invocation = invocation();

								if (((AssignmentCommandsContext)_localctx).invocation.args != null) {
									((AssignmentCommandsContext)_localctx).obj =  trans.invokeMethod(((AssignmentCommandsContext)_localctx).invocation.obj, ((AssignmentCommandsContext)_localctx).invocation.method, ((AssignmentCommandsContext)_localctx).invocation.args);
								}else{
									((AssignmentCommandsContext)_localctx).obj =  trans.invokeMethod(((AssignmentCommandsContext)_localctx).invocation.obj, ((AssignmentCommandsContext)_localctx).invocation.method);
								}
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(6, _localctx, this);
								}
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public RhargContext rharg;
		public AmtArgContext amtArg;
		public StringArgContext stringArg;
		public DebitOrCreditContext debitOrCredit;
		public StringArgContext acc;
		public StringArgContext desc;
		public StringArgContext account;
		public StringArgContext name;
		public InvocationContext invocation;
		public StringArgContext sql;
		public ArgumentListContext argumentList;
		public DaoArgContext dao;
		public SetArgContext setArg;
		public NumberArgContext numberArg;
		public TerminalNode Print() { return getToken(FetalParser.Print, 0); }
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public TerminalNode Credit() { return getToken(FetalParser.Credit, 0); }
		public AmtArgContext amtArg() {
			return getRuleContext(AmtArgContext.class,0);
		}
		public List<StringArgContext> stringArg() {
			return getRuleContexts(StringArgContext.class);
		}
		public StringArgContext stringArg(int i) {
			return getRuleContext(StringArgContext.class,i);
		}
		public TerminalNode Debit() { return getToken(FetalParser.Debit, 0); }
		public TerminalNode Ledger() { return getToken(FetalParser.Ledger, 0); }
		public DebitOrCreditContext debitOrCredit() {
			return getRuleContext(DebitOrCreditContext.class,0);
		}
		public TerminalNode Alias() { return getToken(FetalParser.Alias, 0); }
		public TerminalNode MapFile() { return getToken(FetalParser.MapFile, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode Update() { return getToken(FetalParser.Update, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Insert() { return getToken(FetalParser.Insert, 0); }
		public DaoArgContext daoArg() {
			return getRuleContext(DaoArgContext.class,0);
		}
		public TerminalNode Delete() { return getToken(FetalParser.Delete, 0); }
		public TerminalNode CommitStock() { return getToken(FetalParser.CommitStock, 0); }
		public SetArgContext setArg() {
			return getRuleContext(SetArgContext.class,0);
		}
		public TerminalNode DepleteStock() { return getToken(FetalParser.DepleteStock, 0); }
		public TerminalNode AddStock() { return getToken(FetalParser.AddStock, 0); }
		public NumberArgContext numberArg() {
			return getRuleContext(NumberArgContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_command);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Print:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(Print);
				setState(345);
				match(T__1);
				setState(346);
				((CommandContext)_localctx).rharg = rharg(0);
				setState(347);
				match(T__2);

								if (((CommandContext)_localctx).rharg.obj == null) {
									Exception ex = trans.errorHandler(MALFORMED_EXP, _localctx, this);
									//_errHandler.reportError(this, (RecognitionException) ex );
								}else{
									System.out.println(((CommandContext)_localctx).rharg.obj);
								}
							
				}
				break;
			case Credit:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(Credit);
				setState(351);
				match(T__1);
				setState(352);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(353);
				match(T__3);
				setState(354);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(355);
				match(T__2);

								trans._credit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Debit:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(Debit);
				setState(359);
				match(T__1);
				setState(360);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(361);
				match(T__3);
				setState(362);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(363);
				match(T__2);

								trans._debit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Ledger:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(Ledger);
				setState(367);
				match(T__1);
				setState(368);
				((CommandContext)_localctx).debitOrCredit = debitOrCredit();
				setState(369);
				match(T__3);
				setState(370);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(371);
				match(T__3);
				setState(372);
				((CommandContext)_localctx).acc = stringArg();
				setState(373);
				match(T__3);
				setState(374);
				((CommandContext)_localctx).desc = stringArg();
				setState(375);
				match(T__2);

								trans._ledger(((CommandContext)_localctx).debitOrCredit.c, ((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).acc.string, ((CommandContext)_localctx).desc.string );
							
				}
				break;
			case Alias:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				match(Alias);
				setState(379);
				match(T__1);
				setState(380);
				((CommandContext)_localctx).account = stringArg();
				setState(381);
				match(T__3);
				setState(382);
				((CommandContext)_localctx).name = stringArg();
				setState(383);
				match(T__2);

								trans.putMap(((CommandContext)_localctx).account.string, ((CommandContext)_localctx).name.string);
							
				}
				break;
			case MapFile:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				match(MapFile);
				setState(387);
				match(T__4);
				setState(388);
				((CommandContext)_localctx).stringArg = stringArg();

								trans.mapFile(((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				((CommandContext)_localctx).invocation = invocation();
					
								if (((CommandContext)_localctx).invocation.args != null) {
									trans.invokeMethod(((CommandContext)_localctx).invocation.obj, ((CommandContext)_localctx).invocation.method, ((CommandContext)_localctx).invocation.args);
								}else{
									trans.invokeMethod(((CommandContext)_localctx).invocation.obj, ((CommandContext)_localctx).invocation.method, null);
								}
							
				}
				break;
			case Update:
				enterOuterAlt(_localctx, 8);
				{
				setState(394);
				match(Update);
				setState(395);
				match(T__1);
				setState(396);
				((CommandContext)_localctx).sql = stringArg();
				setState(397);
				match(T__3);
				setState(398);
				((CommandContext)_localctx).argumentList = argumentList();
				setState(399);
				match(T__2);

								trans._update( ((CommandContext)_localctx).sql.string, ((CommandContext)_localctx).argumentList.argList.toArray());
							
				}
				break;
			case Insert:
				enterOuterAlt(_localctx, 9);
				{
				setState(402);
				match(Insert);
				setState(403);
				match(T__1);
				setState(404);
				((CommandContext)_localctx).sql = stringArg();
				setState(405);
				match(T__3);
				setState(406);
				((CommandContext)_localctx).dao = daoArg();
				setState(407);
				match(T__2);

								trans.insert(((CommandContext)_localctx).sql.string, ((CommandContext)_localctx).dao.dao);
							
				}
				break;
			case Delete:
				enterOuterAlt(_localctx, 10);
				{
				setState(410);
				match(Delete);
				setState(411);
				match(T__1);
				setState(412);
				((CommandContext)_localctx).sql = stringArg();
				setState(413);
				match(T__3);
				setState(414);
				((CommandContext)_localctx).dao = daoArg();
				setState(415);
				match(T__2);

								trans.delete(((CommandContext)_localctx).sql.string, ((CommandContext)_localctx).dao.dao);
							
				}
				break;
			case CommitStock:
				enterOuterAlt(_localctx, 11);
				{
				setState(418);
				match(CommitStock);
				setState(419);
				match(T__1);
				setState(420);
				((CommandContext)_localctx).setArg = setArg();
				setState(421);
				match(T__2);

								trans.commitStock(((CommandContext)_localctx).setArg.items);
							
				}
				break;
			case DepleteStock:
				enterOuterAlt(_localctx, 12);
				{
				setState(424);
				match(DepleteStock);
				setState(425);
				match(T__1);
				setState(426);
				((CommandContext)_localctx).setArg = setArg();
				setState(427);
				match(T__2);

								trans.depleteStock(((CommandContext)_localctx).setArg.items);
							
				}
				break;
			case AddStock:
				enterOuterAlt(_localctx, 13);
				{
				setState(430);
				match(AddStock);
				setState(431);
				match(T__1);
				setState(432);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(433);
				match(T__3);
				setState(434);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(435);
				match(T__2);

								trans.addStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationContext extends ParserRuleContext {
		public Object obj;
		public String method;
		public Object[] args;
		public ObjectLiteralContext o;
		public IdentifierContext m;
		public ArgumentListContext argumentList;
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_invocation);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				((InvocationContext)_localctx).o = objectLiteral();
				setState(441);
				match(T__5);
				setState(442);
				((InvocationContext)_localctx).m = identifier();
				setState(443);
				match(T__1);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << GetBalance) | (1L << GetVariableType) | (1L << GetDescription) | (1L << Today) | (1L << GetDays) | (1L << DayOfTheWeek) | (1L << GetCalendarDay) | (1L << GetMonth) | (1L << GetYear) | (1L << GetDate) | (1L << Import) | (1L << Lookup) | (1L << List))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Boolean - 73)) | (1L << (Percentage - 73)) | (1L << (Decimal - 73)) | (1L << (Number - 73)) | (1L << (Date - 73)) | (1L << (Identifier - 73)) | (1L << (String - 73)))) != 0)) {
					{
					setState(444);
					((InvocationContext)_localctx).argumentList = argumentList();
					}
				}

				setState(447);
				match(T__2);

								((InvocationContext)_localctx).obj =  trans.getValue((((InvocationContext)_localctx).o!=null?_input.getText(((InvocationContext)_localctx).o.start,((InvocationContext)_localctx).o.stop):null));
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(INVALID_OBJECT, _localctx, this);
									//_errHandler.reportError(this, ex );
								}
								((InvocationContext)_localctx).method =  (((InvocationContext)_localctx).m!=null?_input.getText(((InvocationContext)_localctx).m.start,((InvocationContext)_localctx).m.stop):null);				
								((InvocationContext)_localctx).args =  ((InvocationContext)_localctx).argumentList.argList.toArray();
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				((InvocationContext)_localctx).o = objectLiteral();
				setState(451);
				match(T__5);
				setState(452);
				((InvocationContext)_localctx).m = identifier();
				setState(453);
				match(T__6);

								((InvocationContext)_localctx).obj =  trans.getValue((((InvocationContext)_localctx).o!=null?_input.getText(((InvocationContext)_localctx).o.start,((InvocationContext)_localctx).o.stop):null));
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(INVALID_OBJECT, _localctx, this);
									//_errHandler.reportError(this, ex );
								}
								((InvocationContext)_localctx).method =  (((InvocationContext)_localctx).m!=null?_input.getText(((InvocationContext)_localctx).m.start,((InvocationContext)_localctx).m.stop):null);				
								((InvocationContext)_localctx).args =  null;
								
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List <Object> argList;
		public RhargContext rharg;
		public List<RhargContext> rharg() {
			return getRuleContexts(RhargContext.class);
		}
		public RhargContext rharg(int i) {
			return getRuleContext(RhargContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentList);
		((ArgumentListContext)_localctx).argList =  new ArrayList<Object>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			((ArgumentListContext)_localctx).rharg = rharg(0);
			_localctx.argList.add(((ArgumentListContext)_localctx).rharg.obj);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(460);
				match(T__3);
				setState(461);
				((ArgumentListContext)_localctx).rharg = rharg(0);
				_localctx.argList.add(((ArgumentListContext)_localctx).rharg.obj);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmtArgContext extends ParserRuleContext {
		public Double amt;
		public RhargContext rharg;
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public AmtArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amtArg; }
	}

	public final AmtArgContext amtArg() throws RecognitionException {
		AmtArgContext _localctx = new AmtArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_amtArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			((AmtArgContext)_localctx).rharg = rharg(0);

							if (((AmtArgContext)_localctx).rharg.obj == null || ((AmtArgContext)_localctx).rharg.obj instanceof Double == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								//_errHandler.reportError(this, ex );
								
							}
							((AmtArgContext)_localctx).amt =  (Double) ((AmtArgContext)_localctx).rharg.obj;
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringArgContext extends ParserRuleContext {
		public String string;
		public RhargContext rharg;
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public StringArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArg; }
	}

	public final StringArgContext stringArg() throws RecognitionException {
		StringArgContext _localctx = new StringArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			((StringArgContext)_localctx).rharg = rharg(0);

							if (((StringArgContext)_localctx).rharg.obj == null || ((StringArgContext)_localctx).rharg.obj instanceof String == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								//_errHandler.reportError(this, ex );
								
							}
							((StringArgContext)_localctx).string =  (String) ((StringArgContext)_localctx).rharg.obj;
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetArgContext extends ParserRuleContext {
		public Set<?> items;
		public InvocationContext invocation;
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public SetArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setArg; }
	}

	public final SetArgContext setArg() throws RecognitionException {
		SetArgContext _localctx = new SetArgContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_setArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			((SetArgContext)_localctx).invocation = invocation();

							((SetArgContext)_localctx).items =  trans.getList(((SetArgContext)_localctx).invocation.obj, ((SetArgContext)_localctx).invocation.method);
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberArgContext extends ParserRuleContext {
		public Long num;
		public RhargContext rharg;
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public NumberArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberArg; }
	}

	public final NumberArgContext numberArg() throws RecognitionException {
		NumberArgContext _localctx = new NumberArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numberArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			((NumberArgContext)_localctx).rharg = rharg(0);

							if (((NumberArgContext)_localctx).rharg.obj == null || ((NumberArgContext)_localctx).rharg.obj instanceof Long == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								//_errHandler.reportError(this, ex );
								
							}
							((NumberArgContext)_localctx).num =  (Long) ((NumberArgContext)_localctx).rharg.obj;
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateArgContext extends ParserRuleContext {
		public Date date;
		public RhargContext rharg;
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public DateArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateArg; }
	}

	public final DateArgContext dateArg() throws RecognitionException {
		DateArgContext _localctx = new DateArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dateArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			((DateArgContext)_localctx).rharg = rharg(0);

							if (((DateArgContext)_localctx).rharg.obj == null || ((DateArgContext)_localctx).rharg.obj instanceof Date == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								//_errHandler.reportError(this, ex );
								
							}
							((DateArgContext)_localctx).date =  (Date) ((DateArgContext)_localctx).rharg.obj;
							
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DaoArgContext extends ParserRuleContext {
		public Object dao;
		public RhargContext rharg;
		public RhargContext rharg() {
			return getRuleContext(RhargContext.class,0);
		}
		public DaoArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daoArg; }
	}

	public final DaoArgContext daoArg() throws RecognitionException {
		DaoArgContext _localctx = new DaoArgContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_daoArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			((DaoArgContext)_localctx).rharg = rharg(0);

							if (((DaoArgContext)_localctx).rharg.obj == null) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
							}
							((DaoArgContext)_localctx).dao =  ((DaoArgContext)_localctx).rharg.obj;
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebitOrCreditContext extends ParserRuleContext {
		public char c;
		public CharLiteralContext charLiteral;
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public DebitOrCreditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debitOrCredit; }
	}

	public final DebitOrCreditContext debitOrCredit() throws RecognitionException {
		DebitOrCreditContext _localctx = new DebitOrCreditContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_debitOrCredit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			((DebitOrCreditContext)_localctx).charLiteral = charLiteral();

								((DebitOrCreditContext)_localctx).c =  (((DebitOrCreditContext)_localctx).charLiteral!=null?_input.getText(((DebitOrCreditContext)_localctx).charLiteral.start,((DebitOrCreditContext)_localctx).charLiteral.stop):null).charAt(0);
							
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Object obj;
		public NumericLiteralContext numericLiteral;
		public DoubleLiteralContext doubleLiteral;
		public BooleanLiteralContext booleanLiteral;
		public PercentLiteralContext percentLiteral;
		public StringLiteralContext stringLiteral;
		public DateLiteralContext dateLiteral;
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public PercentLiteralContext percentLiteral() {
			return getRuleContext(PercentLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				((LiteralContext)_localctx).numericLiteral = numericLiteral();

								((LiteralContext)_localctx).obj =  (Long) trans.getLong((((LiteralContext)_localctx).numericLiteral!=null?_input.getText(((LiteralContext)_localctx).numericLiteral.start,((LiteralContext)_localctx).numericLiteral.stop):null));
							
				}
				break;
			case Decimal:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				((LiteralContext)_localctx).doubleLiteral = doubleLiteral();

								((LiteralContext)_localctx).obj =  (Double) trans.getDouble((((LiteralContext)_localctx).doubleLiteral!=null?_input.getText(((LiteralContext)_localctx).doubleLiteral.start,((LiteralContext)_localctx).doubleLiteral.stop):null));
							
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				((LiteralContext)_localctx).booleanLiteral = booleanLiteral();

								if ("true".compareTo((((LiteralContext)_localctx).booleanLiteral!=null?_input.getText(((LiteralContext)_localctx).booleanLiteral.start,((LiteralContext)_localctx).booleanLiteral.stop):null)) == 0 ) {
									((LiteralContext)_localctx).obj =  (boolean) true;
								}else if ("false".compareTo((((LiteralContext)_localctx).booleanLiteral!=null?_input.getText(((LiteralContext)_localctx).booleanLiteral.start,((LiteralContext)_localctx).booleanLiteral.stop):null)) == 0) {
									((LiteralContext)_localctx).obj =  (boolean) false;
								}else{
									((LiteralContext)_localctx).obj =  null;
								}
								
							
				}
				break;
			case Percentage:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				((LiteralContext)_localctx).percentLiteral = percentLiteral();

								String d = (((LiteralContext)_localctx).percentLiteral!=null?_input.getText(((LiteralContext)_localctx).percentLiteral.start,((LiteralContext)_localctx).percentLiteral.stop):null);
								d = d.substring(0, d.length() - 1);
								Double result = trans.getDouble(d);
								result /= 100;
								((LiteralContext)_localctx).obj =  (Double) result;

							
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				((LiteralContext)_localctx).stringLiteral = stringLiteral();
				((LiteralContext)_localctx).obj =  (String) trans.stripQuotes((((LiteralContext)_localctx).stringLiteral!=null?_input.getText(((LiteralContext)_localctx).stringLiteral.start,((LiteralContext)_localctx).stringLiteral.stop):null));
				}
				break;
			case Date:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				((LiteralContext)_localctx).dateLiteral = dateLiteral();

									try {
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
										((LiteralContext)_localctx).obj =  (Date) sdf.parse((((LiteralContext)_localctx).dateLiteral!=null?_input.getText(((LiteralContext)_localctx).dateLiteral.start,((LiteralContext)_localctx).dateLiteral.stop):null));
									}catch(ParseException pe){
										Exception ex = trans.errorHandler(2, _localctx, this);
										//_errHandler.reportError(this, (RecognitionException) ex );
									}
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_charLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(FetalParser.Number, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleLiteralContext extends ParserRuleContext {
		public TerminalNode Decimal() { return getToken(FetalParser.Decimal, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(Decimal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PercentLiteralContext extends ParserRuleContext {
		public TerminalNode Percentage() { return getToken(FetalParser.Percentage, 0); }
		public PercentLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentLiteral; }
	}

	public final PercentLiteralContext percentLiteral() throws RecognitionException {
		PercentLiteralContext _localctx = new PercentLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_percentLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(Percentage);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(FetalParser.Boolean, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(Boolean);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(FetalParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode Date() { return getToken(FetalParser.Date, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(Date);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FetalParser.Identifier, 0); }
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DaoLiteralContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FetalParser.Identifier, 0); }
		public DaoLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daoLiteral; }
	}

	public final DaoLiteralContext daoLiteral() throws RecognitionException {
		DaoLiteralContext _localctx = new DaoLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_daoLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return rharg_sempred((RhargContext)_localctx, predIndex);
		case 21:
			return evalExpression_sempred((EvalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rharg_sempred(RhargContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean evalExpression_sempred(EvalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0213\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5g\n\5\r"+
		"\5\16\5h\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6v\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00a7"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c2"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00da"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f1\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00f8\n\27\f\27\16\27\u00fb\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0147\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0151\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0159\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01b9\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01c0\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01cb"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01d3\n\34\f\34\16\34\u01d6\13"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u01ff\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3-\2\4\",.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVX\2\b\3\2\24\31\3\2\32\37\3\2 \"\3\2#(\3\2)+\3\2\n\13"+
		"\2\u021f\2Z\3\2\2\2\4_\3\2\2\2\6b\3\2\2\2\bf\3\2\2\2\nu\3\2\2\2\f\177"+
		"\3\2\2\2\16\u0081\3\2\2\2\20\u0092\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3"+
		"\2\2\2\26\u00a2\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa\3\2"+
		"\2\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00c1\3\2\2\2$\u00cd\3\2\2\2&\u00d0"+
		"\3\2\2\2(\u00d2\3\2\2\2*\u00db\3\2\2\2,\u00f0\3\2\2\2.\u00fc\3\2\2\2\60"+
		"\u0158\3\2\2\2\62\u01b8\3\2\2\2\64\u01ca\3\2\2\2\66\u01cc\3\2\2\28\u01d7"+
		"\3\2\2\2:\u01da\3\2\2\2<\u01dd\3\2\2\2>\u01e0\3\2\2\2@\u01e3\3\2\2\2B"+
		"\u01e6\3\2\2\2D\u01e9\3\2\2\2F\u01fe\3\2\2\2H\u0200\3\2\2\2J\u0202\3\2"+
		"\2\2L\u0204\3\2\2\2N\u0206\3\2\2\2P\u0208\3\2\2\2R\u020a\3\2\2\2T\u020c"+
		"\3\2\2\2V\u020e\3\2\2\2X\u0210\3\2\2\2Z[\b\2\1\2[\\\5\4\3\2\\]\5\b\5\2"+
		"]^\5\6\4\2^\3\3\2\2\2_`\79\2\2`a\b\3\1\2a\5\3\2\2\2bc\7:\2\2cd\b\4\1\2"+
		"d\7\3\2\2\2eg\5\n\6\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\t\3\2\2"+
		"\2jk\5\f\7\2kl\7\3\2\2lv\3\2\2\2mn\5\62\32\2no\7\3\2\2ov\3\2\2\2pq\5\22"+
		"\n\2qr\7\3\2\2rv\3\2\2\2sv\5(\25\2tv\7\3\2\2uj\3\2\2\2um\3\2\2\2up\3\2"+
		"\2\2us\3\2\2\2ut\3\2\2\2v\13\3\2\2\2wx\5\20\t\2xy\5\16\b\2yz\b\7\1\2z"+
		"\u0080\3\2\2\2{|\5\20\t\2|}\5\22\n\2}~\b\7\1\2~\u0080\3\2\2\2\177w\3\2"+
		"\2\2\177{\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082\5&\24\2\u0082\u0083\b\b"+
		"\1\2\u0083\17\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0093\b\t\1\2\u0086\u0087"+
		"\7\r\2\2\u0087\u0093\b\t\1\2\u0088\u0089\7\16\2\2\u0089\u0093\b\t\1\2"+
		"\u008a\u008b\7\17\2\2\u008b\u0093\b\t\1\2\u008c\u008d\7\20\2\2\u008d\u0093"+
		"\b\t\1\2\u008e\u008f\7\21\2\2\u008f\u0093\b\t\1\2\u0090\u0091\7\22\2\2"+
		"\u0091\u0093\b\t\1\2\u0092\u0084\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u0088"+
		"\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\21\3\2\2\2\u0094\u0095\5$\23\2\u0095\u0096\7\23\2"+
		"\2\u0096\u0097\5\"\22\2\u0097\u0098\b\n\1\2\u0098\u009f\3\2\2\2\u0099"+
		"\u009a\5$\23\2\u009a\u009b\5\26\f\2\u009b\u009c\5\"\22\2\u009c\u009d\b"+
		"\n\1\2\u009d\u009f\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0099\3\2\2\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a1\7\23\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\t\2\2\2"+
		"\u00a3\27\3\2\2\2\u00a4\u00a7\5\32\16\2\u00a5\u00a7\5\34\17\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\t\5\2\2\u00ad"+
		"\37\3\2\2\2\u00ae\u00af\t\6\2\2\u00af!\3\2\2\2\u00b0\u00b1\b\22\1\2\u00b1"+
		"\u00b2\7\4\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\5"+
		"\"\22\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7\b\22\1\2\u00b7\u00c2\3\2\2\2\u00b8"+
		"\u00b9\5\16\b\2\u00b9\u00ba\b\22\1\2\u00ba\u00c2\3\2\2\2\u00bb\u00bc\5"+
		"F$\2\u00bc\u00bd\b\22\1\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\5\60\31\2\u00bf"+
		"\u00c0\b\22\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b0\3\2\2\2\u00c1\u00b8\3"+
		"\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00ca\3\2\2\2\u00c3"+
		"\u00c4\f\7\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\5\"\22\b\u00c6\u00c7\b"+
		"\22\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb#\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cd\u00ce\5\16\b\2\u00ce\u00cf\b\23\1\2\u00cf%\3\2\2\2\u00d0\u00d1"+
		"\7P\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5"+
		"\5,\27\2\u00d5\u00d6\7\5\2\2\u00d6\u00d9\5*\26\2\u00d7\u00d8\7H\2\2\u00d8"+
		"\u00da\5*\26\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da)\3\2\2\2"+
		"\u00db\u00dc\b\26\1\2\u00dc\u00dd\7I\2\2\u00dd\u00de\5\b\5\2\u00de\u00df"+
		"\7J\2\2\u00df+\3\2\2\2\u00e0\u00e1\b\27\1\2\u00e1\u00e2\7\4\2\2\u00e2"+
		"\u00e3\5,\27\2\u00e3\u00e4\5 \21\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\7\5"+
		"\2\2\u00e6\u00e7\b\27\1\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9\5.\30\2\u00e9"+
		"\u00ea\b\27\1\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed\5"+
		".\30\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef\b\27\1\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00e0\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\u00f9\3\2"+
		"\2\2\u00f2\u00f3\f\6\2\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\5,\27\7\u00f5"+
		"\u00f6\b\27\1\2\u00f6\u00f8\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8\u00fb\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa-\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\5\"\22\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff\5\"\22"+
		"\2\u00ff\u0100\b\30\1\2\u0100/\3\2\2\2\u0101\u0102\7,\2\2\u0102\u0103"+
		"\7\4\2\2\u0103\u0104\5:\36\2\u0104\u0105\7\5\2\2\u0105\u0106\b\31\1\2"+
		"\u0106\u0159\3\2\2\2\u0107\u0108\7-\2\2\u0108\u0109\7\4\2\2\u0109\u010a"+
		"\5\16\b\2\u010a\u010b\7\5\2\2\u010b\u010c\b\31\1\2\u010c\u0159\3\2\2\2"+
		"\u010d\u010e\7.\2\2\u010e\u0159\b\31\1\2\u010f\u0110\7/\2\2\u0110\u0159"+
		"\b\31\1\2\u0111\u0112\7\60\2\2\u0112\u0113\7\4\2\2\u0113\u0114\5@!\2\u0114"+
		"\u0115\7\6\2\2\u0115\u0116\5@!\2\u0116\u0117\7\5\2\2\u0117\u0118\b\31"+
		"\1\2\u0118\u0159\3\2\2\2\u0119\u011a\7\61\2\2\u011a\u011b\7\4\2\2\u011b"+
		"\u011c\5@!\2\u011c\u011d\7\5\2\2\u011d\u011e\b\31\1\2\u011e\u0159\3\2"+
		"\2\2\u011f\u0120\7\62\2\2\u0120\u0121\7\4\2\2\u0121\u0122\5@!\2\u0122"+
		"\u0123\7\5\2\2\u0123\u0124\b\31\1\2\u0124\u0159\3\2\2\2\u0125\u0126\7"+
		"\63\2\2\u0126\u0127\7\4\2\2\u0127\u0128\5@!\2\u0128\u0129\7\5\2\2\u0129"+
		"\u012a\b\31\1\2\u012a\u0159\3\2\2\2\u012b\u012c\7\64\2\2\u012c\u012d\7"+
		"\4\2\2\u012d\u012e\5@!\2\u012e\u012f\7\5\2\2\u012f\u0130\b\31\1\2\u0130"+
		"\u0159\3\2\2\2\u0131\u0132\7\65\2\2\u0132\u0133\7\4\2\2\u0133\u0134\5"+
		"> \2\u0134\u0135\7\6\2\2\u0135\u0136\5> \2\u0136\u0137\7\6\2\2\u0137\u0138"+
		"\5> \2\u0138\u0139\7\5\2\2\u0139\u013a\b\31\1\2\u013a\u0159\3\2\2\2\u013b"+
		"\u013c\7\66\2\2\u013c\u013d\7\4\2\2\u013d\u013e\5:\36\2\u013e\u013f\7"+
		"\5\2\2\u013f\u0140\b\31\1\2\u0140\u0159\3\2\2\2\u0141\u0142\7\67\2\2\u0142"+
		"\u0143\7\4\2\2\u0143\u0146\5:\36\2\u0144\u0145\7\6\2\2\u0145\u0147\5\66"+
		"\34\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\7\5\2\2\u0149\u014a\b\31\1\2\u014a\u0159\3\2\2\2\u014b\u014c\7"+
		"8\2\2\u014c\u014d\7\4\2\2\u014d\u0150\5:\36\2\u014e\u014f\7\6\2\2\u014f"+
		"\u0151\5\66\34\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0153\7\5\2\2\u0153\u0154\b\31\1\2\u0154\u0159\3\2\2\2\u0155"+
		"\u0156\5\64\33\2\u0156\u0157\b\31\1\2\u0157\u0159\3\2\2\2\u0158\u0101"+
		"\3\2\2\2\u0158\u0107\3\2\2\2\u0158\u010d\3\2\2\2\u0158\u010f\3\2\2\2\u0158"+
		"\u0111\3\2\2\2\u0158\u0119\3\2\2\2\u0158\u011f\3\2\2\2\u0158\u0125\3\2"+
		"\2\2\u0158\u012b\3\2\2\2\u0158\u0131\3\2\2\2\u0158\u013b\3\2\2\2\u0158"+
		"\u0141\3\2\2\2\u0158\u014b\3\2\2\2\u0158\u0155\3\2\2\2\u0159\61\3\2\2"+
		"\2\u015a\u015b\7F\2\2\u015b\u015c\7\4\2\2\u015c\u015d\5\"\22\2\u015d\u015e"+
		"\7\5\2\2\u015e\u015f\b\32\1\2\u015f\u01b9\3\2\2\2\u0160\u0161\7;\2\2\u0161"+
		"\u0162\7\4\2\2\u0162\u0163\58\35\2\u0163\u0164\7\6\2\2\u0164\u0165\5:"+
		"\36\2\u0165\u0166\7\5\2\2\u0166\u0167\b\32\1\2\u0167\u01b9\3\2\2\2\u0168"+
		"\u0169\7<\2\2\u0169\u016a\7\4\2\2\u016a\u016b\58\35\2\u016b\u016c\7\6"+
		"\2\2\u016c\u016d\5:\36\2\u016d\u016e\7\5\2\2\u016e\u016f\b\32\1\2\u016f"+
		"\u01b9\3\2\2\2\u0170\u0171\7=\2\2\u0171\u0172\7\4\2\2\u0172\u0173\5D#"+
		"\2\u0173\u0174\7\6\2\2\u0174\u0175\58\35\2\u0175\u0176\7\6\2\2\u0176\u0177"+
		"\5:\36\2\u0177\u0178\7\6\2\2\u0178\u0179\5:\36\2\u0179\u017a\7\5\2\2\u017a"+
		"\u017b\b\32\1\2\u017b\u01b9\3\2\2\2\u017c\u017d\7>\2\2\u017d\u017e\7\4"+
		"\2\2\u017e\u017f\5:\36\2\u017f\u0180\7\6\2\2\u0180\u0181\5:\36\2\u0181"+
		"\u0182\7\5\2\2\u0182\u0183\b\32\1\2\u0183\u01b9\3\2\2\2\u0184\u0185\7"+
		"?\2\2\u0185\u0186\7\7\2\2\u0186\u0187\5:\36\2\u0187\u0188\b\32\1\2\u0188"+
		"\u01b9\3\2\2\2\u0189\u018a\5\64\33\2\u018a\u018b\b\32\1\2\u018b\u01b9"+
		"\3\2\2\2\u018c\u018d\7@\2\2\u018d\u018e\7\4\2\2\u018e\u018f\5:\36\2\u018f"+
		"\u0190\7\6\2\2\u0190\u0191\5\66\34\2\u0191\u0192\7\5\2\2\u0192\u0193\b"+
		"\32\1\2\u0193\u01b9\3\2\2\2\u0194\u0195\7A\2\2\u0195\u0196\7\4\2\2\u0196"+
		"\u0197\5:\36\2\u0197\u0198\7\6\2\2\u0198\u0199\5B\"\2\u0199\u019a\7\5"+
		"\2\2\u019a\u019b\b\32\1\2\u019b\u01b9\3\2\2\2\u019c\u019d\7B\2\2\u019d"+
		"\u019e\7\4\2\2\u019e\u019f\5:\36\2\u019f\u01a0\7\6\2\2\u01a0\u01a1\5B"+
		"\"\2\u01a1\u01a2\7\5\2\2\u01a2\u01a3\b\32\1\2\u01a3\u01b9\3\2\2\2\u01a4"+
		"\u01a5\7D\2\2\u01a5\u01a6\7\4\2\2\u01a6\u01a7\5<\37\2\u01a7\u01a8\7\5"+
		"\2\2\u01a8\u01a9\b\32\1\2\u01a9\u01b9\3\2\2\2\u01aa\u01ab\7C\2\2\u01ab"+
		"\u01ac\7\4\2\2\u01ac\u01ad\5<\37\2\u01ad\u01ae\7\5\2\2\u01ae\u01af\b\32"+
		"\1\2\u01af\u01b9\3\2\2\2\u01b0\u01b1\7E\2\2\u01b1\u01b2\7\4\2\2\u01b2"+
		"\u01b3\5:\36\2\u01b3\u01b4\7\6\2\2\u01b4\u01b5\5> \2\u01b5\u01b6\7\5\2"+
		"\2\u01b6\u01b7\b\32\1\2\u01b7\u01b9\3\2\2\2\u01b8\u015a\3\2\2\2\u01b8"+
		"\u0160\3\2\2\2\u01b8\u0168\3\2\2\2\u01b8\u0170\3\2\2\2\u01b8\u017c\3\2"+
		"\2\2\u01b8\u0184\3\2\2\2\u01b8\u0189\3\2\2\2\u01b8\u018c\3\2\2\2\u01b8"+
		"\u0194\3\2\2\2\u01b8\u019c\3\2\2\2\u01b8\u01a4\3\2\2\2\u01b8\u01aa\3\2"+
		"\2\2\u01b8\u01b0\3\2\2\2\u01b9\63\3\2\2\2\u01ba\u01bb\5V,\2\u01bb\u01bc"+
		"\7\b\2\2\u01bc\u01bd\5&\24\2\u01bd\u01bf\7\4\2\2\u01be\u01c0\5\66\34\2"+
		"\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\7\5\2\2\u01c2\u01c3\b\33\1\2\u01c3\u01cb\3\2\2\2\u01c4\u01c5\5V,\2\u01c5"+
		"\u01c6\7\b\2\2\u01c6\u01c7\5&\24\2\u01c7\u01c8\7\t\2\2\u01c8\u01c9\b\33"+
		"\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01ba\3\2\2\2\u01ca\u01c4\3\2\2\2\u01cb"+
		"\65\3\2\2\2\u01cc\u01cd\5\"\22\2\u01cd\u01d4\b\34\1\2\u01ce\u01cf\7\6"+
		"\2\2\u01cf\u01d0\5\"\22\2\u01d0\u01d1\b\34\1\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01ce\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\67\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\5\"\22\2\u01d8\u01d9"+
		"\b\35\1\2\u01d99\3\2\2\2\u01da\u01db\5\"\22\2\u01db\u01dc\b\36\1\2\u01dc"+
		";\3\2\2\2\u01dd\u01de\5\64\33\2\u01de\u01df\b\37\1\2\u01df=\3\2\2\2\u01e0"+
		"\u01e1\5\"\22\2\u01e1\u01e2\b \1\2\u01e2?\3\2\2\2\u01e3\u01e4\5\"\22\2"+
		"\u01e4\u01e5\b!\1\2\u01e5A\3\2\2\2\u01e6\u01e7\5\"\22\2\u01e7\u01e8\b"+
		"\"\1\2\u01e8C\3\2\2\2\u01e9\u01ea\5H%\2\u01ea\u01eb\b#\1\2\u01ebE\3\2"+
		"\2\2\u01ec\u01ed\5J&\2\u01ed\u01ee\b$\1\2\u01ee\u01ff\3\2\2\2\u01ef\u01f0"+
		"\5L\'\2\u01f0\u01f1\b$\1\2\u01f1\u01ff\3\2\2\2\u01f2\u01f3\5P)\2\u01f3"+
		"\u01f4\b$\1\2\u01f4\u01ff\3\2\2\2\u01f5\u01f6\5N(\2\u01f6\u01f7\b$\1\2"+
		"\u01f7\u01ff\3\2\2\2\u01f8\u01f9\5R*\2\u01f9\u01fa\b$\1\2\u01fa\u01ff"+
		"\3\2\2\2\u01fb\u01fc\5T+\2\u01fc\u01fd\b$\1\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u01ec\3\2\2\2\u01fe\u01ef\3\2\2\2\u01fe\u01f2\3\2\2\2\u01fe\u01f5\3\2"+
		"\2\2\u01fe\u01f8\3\2\2\2\u01fe\u01fb\3\2\2\2\u01ffG\3\2\2\2\u0200\u0201"+
		"\t\7\2\2\u0201I\3\2\2\2\u0202\u0203\7N\2\2\u0203K\3\2\2\2\u0204\u0205"+
		"\7M\2\2\u0205M\3\2\2\2\u0206\u0207\7L\2\2\u0207O\3\2\2\2\u0208\u0209\7"+
		"K\2\2\u0209Q\3\2\2\2\u020a\u020b\7Q\2\2\u020bS\3\2\2\2\u020c\u020d\7O"+
		"\2\2\u020dU\3\2\2\2\u020e\u020f\7P\2\2\u020fW\3\2\2\2\u0210\u0211\7P\2"+
		"\2\u0211Y\3\2\2\2\25hu\177\u0092\u009e\u00a6\u00c1\u00ca\u00d9\u00f0\u00f9"+
		"\u0146\u0150\u0158\u01b8\u01bf\u01ca\u01d4\u01fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}