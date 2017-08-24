// Generated from Fetal.g4 by ANTLR 4.5.2

package com.ftl.derived;
import com.ftl.helper.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.lang.reflect.InvocationTargetException;

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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DecimalType=14, NumberType=15, 
		StringType=16, BooleanType=17, DateType=18, ObjectType=19, DaoType=20, 
		Equals=21, PlusEquals=22, MinusEquals=23, MultiplyEquals=24, DivideEquals=25, 
		ModuloEquals=26, ExponentEquals=27, Plus=28, Minus=29, Multiply=30, Divide=31, 
		Modulo=32, Exponent=33, And=34, Or=35, Not=36, IsEqualTo=37, IsLessThan=38, 
		IsLessThanOrEqualTo=39, IsGreaterThan=40, IsGreaterThanOrEqualTo=41, IsNotEqualTo=42, 
		AndExpression=43, OrExpression=44, ExclusiveOrExpression=45, GetBalance=46, 
		GetVariableType=47, GetDescription=48, Today=49, GetDays=50, DayOfTheWeek=51, 
		GetCalendarDay=52, GetMonth=53, GetYear=54, Import=55, Lookup=56, List=57, 
		Credit=58, Debit=59, Ledger=60, Alias=61, MapFile=62, IfStatement=63, 
		Else=64, Print=65, Percentage=66, Boolean=67, Number=68, Decimal=69, Date=70, 
		Identifier=71, String=72, ExtendedAscii=73, Whitespace=74, Newline=75, 
		BlockComment=76, LineComment=77;
	public static final int
		RULE_transaction = 0, RULE_begin = 1, RULE_end = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_declaration = 5, RULE_var = 6, RULE_type = 7, 
		RULE_assignment = 8, RULE_assignmentOp = 9, RULE_unaryOP = 10, RULE_expressionOp = 11, 
		RULE_arithExpressOp = 12, RULE_bitwiseExpressOp = 13, RULE_comparisonOp = 14, 
		RULE_logicExpressOp = 15, RULE_rharg = 16, RULE_lharg = 17, RULE_identifier = 18, 
		RULE_evaluation = 19, RULE_block = 20, RULE_evalExpression = 21, RULE_eval = 22, 
		RULE_assignmentCommands = 23, RULE_command = 24, RULE_invocation = 25, 
		RULE_argumentList = 26, RULE_amtArg = 27, RULE_stringArg = 28, RULE_numberArg = 29, 
		RULE_dateArg = 30, RULE_debitOrCredit = 31, RULE_literal = 32, RULE_fileName = 33, 
		RULE_charLiteral = 34, RULE_numericLiteral = 35, RULE_doubleLiteral = 36, 
		RULE_percentLiteral = 37, RULE_booleanLiteral = 38, RULE_stringLiteral = 39, 
		RULE_dateLiteral = 40, RULE_objectLiteral = 41, RULE_daoLiteral = 42;
	public static final String[] ruleNames = {
		"transaction", "begin", "end", "statements", "statement", "declaration", 
		"var", "type", "assignment", "assignmentOp", "unaryOP", "expressionOp", 
		"arithExpressOp", "bitwiseExpressOp", "comparisonOp", "logicExpressOp", 
		"rharg", "lharg", "identifier", "evaluation", "block", "evalExpression", 
		"eval", "assignmentCommands", "command", "invocation", "argumentList", 
		"amtArg", "stringArg", "numberArg", "dateArg", "debitOrCredit", "literal", 
		"fileName", "charLiteral", "numericLiteral", "doubleLiteral", "percentLiteral", 
		"booleanLiteral", "stringLiteral", "dateLiteral", "objectLiteral", "daoLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "';'", "'('", "')'", "'{'", "'}'", "','", "':'", 
		"'.'", "'()'", "'D'", "'C'", "'decimal'", "'number'", "'string'", "'boolean'", 
		"'date'", "'object'", "'dao'", "'='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'!'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'^^'", 
		"'getBalance'", "'getVariableType'", "'getDescription'", "'today'", "'getDays'", 
		"'dayOfTheWeek'", "'getCalendarDay'", "'getMonth'", "'getYear'", "'import'", 
		"'lookup'", "'list'", "'credit'", "'debit'", "'ledger'", "'alias'", "'mapFile'", 
		"'if'", "'else'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DecimalType", "NumberType", "StringType", "BooleanType", 
		"DateType", "ObjectType", "DaoType", "Equals", "PlusEquals", "MinusEquals", 
		"MultiplyEquals", "DivideEquals", "ModuloEquals", "ExponentEquals", "Plus", 
		"Minus", "Multiply", "Divide", "Modulo", "Exponent", "And", "Or", "Not", 
		"IsEqualTo", "IsLessThan", "IsLessThanOrEqualTo", "IsGreaterThan", "IsGreaterThanOrEqualTo", 
		"IsNotEqualTo", "AndExpression", "OrExpression", "ExclusiveOrExpression", 
		"GetBalance", "GetVariableType", "GetDescription", "Today", "GetDays", 
		"DayOfTheWeek", "GetCalendarDay", "GetMonth", "GetYear", "Import", "Lookup", 
		"List", "Credit", "Debit", "Ledger", "Alias", "MapFile", "IfStatement", 
		"Else", "Print", "Percentage", "Boolean", "Number", "Decimal", "Date", 
		"Identifier", "String", "ExtendedAscii", "Whitespace", "Newline", "BlockComment", 
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
		private static final int NOT_DEFINED=0, MALFORMED_EXP=1, CAST_EXCEPT=2, CANNOT_LOAD_FILE=3,
								 INVALID_DATE=4, CANNOT_LOAD_OBJECT=5, CANNOT_INVOKE_METHD=6, INVALID_OBJECT=7,
								 INVALID_ARG=8; 

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
						
			setState(87);
			begin();
			setState(88);
			statements();
			setState(89);
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
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
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
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__1);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(97);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				declaration();
				setState(103);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				command();
				setState(106);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				assignment();
				setState(109);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				evaluation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(T__2);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((DeclarationContext)_localctx).type = type();
				setState(116);
				((DeclarationContext)_localctx).var = var();

								trans.publish(((DeclarationContext)_localctx).var.name, ((DeclarationContext)_localctx).type.varType);
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((DeclarationContext)_localctx).type = type();
				setState(120);
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
			setState(125);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(DecimalType);

								((TypeContext)_localctx).varType =  VariableType.DECIMAL;
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(NumberType);

								((TypeContext)_localctx).varType =  VariableType.NUMBER;
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(StringType);

								((TypeContext)_localctx).varType =  VariableType.STRING;
							
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(BooleanType);

								((TypeContext)_localctx).varType =  VariableType.BOOLEAN;
							
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(DateType);

								((TypeContext)_localctx).varType =  VariableType.DATE;
							
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(ObjectType);

								((TypeContext)_localctx).varType =  VariableType.OBJECT;
							
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(DaoType);

								((TypeContext)_localctx).varType =  VariableType.DAO;
							
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(145);
				match(Equals);
				setState(146);
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
				setState(149);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(150);
				((AssignmentContext)_localctx).unaryOP = unaryOP();
				setState(151);
				((AssignmentContext)_localctx).rharg = rharg(0);

								String oper = (((AssignmentContext)_localctx).unaryOP!=null?_input.getText(((AssignmentContext)_localctx).unaryOP.start,((AssignmentContext)_localctx).unaryOP.stop):null);
								oper = oper.substring(0, oper.length() - 1);
								if (trans.isVariable((((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null)) == false) {
									RecognitionException ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
									_errHandler.reportError(this, ex );
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
			setState(156);
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
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PlusEquals) | (1L << MinusEquals) | (1L << MultiplyEquals) | (1L << DivideEquals) | (1L << ModuloEquals) | (1L << ExponentEquals))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				arithExpressOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				bitwiseExpressOp();
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
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Multiply) | (1L << Divide) | (1L << Modulo) | (1L << Exponent))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Or) | (1L << Not))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IsEqualTo) | (1L << IsLessThan) | (1L << IsLessThanOrEqualTo) | (1L << IsGreaterThan) | (1L << IsGreaterThanOrEqualTo) | (1L << IsNotEqualTo))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AndExpression) | (1L << OrExpression) | (1L << ExclusiveOrExpression))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(173);
				match(T__3);
				setState(174);
				((RhargContext)_localctx).lh = rharg(0);
				setState(175);
				((RhargContext)_localctx).expressionOp = expressionOp();
				setState(176);
				((RhargContext)_localctx).rh = rharg(0);
				setState(177);
				match(T__4);

								if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
									RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
									_errHandler.reportError(this, ex );
								}else{
									((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
								}
							
				}
				break;
			case 2:
				{
				setState(180);
				((RhargContext)_localctx).var = var();

								
								if (trans.isVariable(((RhargContext)_localctx).var.name) == false) {
									RecognitionException ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
									_errHandler.reportError(this, ex );
									
								}
								((RhargContext)_localctx).obj =  trans.getValue(((RhargContext)_localctx).var.name);
								
							
				}
				break;
			case 3:
				{
				setState(183);
				((RhargContext)_localctx).literal = literal();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).literal.obj;
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(MALFORMED_EXP, _localctx, this);
									_errHandler.reportError(this, ex );
								}
							
				}
				break;
			case 4:
				{
				setState(186);
				((RhargContext)_localctx).assignmentCommands = assignmentCommands();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).assignmentCommands.obj;
							
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
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
					setState(191);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(192);
					((RhargContext)_localctx).expressionOp = expressionOp();
					setState(193);
					((RhargContext)_localctx).rh = rharg(6);

					          				if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
					          					RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
					          					_errHandler.reportError(this, ex );
					          				}else{
					          					((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
					          				}
					          			
					}
					} 
				}
				setState(200);
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
			setState(201);
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
			setState(204);
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
		public FileNameContext rfn;
		public FileNameContext lfn;
		public TerminalNode IfStatement() { return getToken(FetalParser.IfStatement, 0); }
		public EvalExpressionContext evalExpression() {
			return getRuleContext(EvalExpressionContext.class,0);
		}
		public List<FileNameContext> fileName() {
			return getRuleContexts(FileNameContext.class);
		}
		public FileNameContext fileName(int i) {
			return getRuleContext(FileNameContext.class,i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IfStatement);
			setState(207);
			match(T__3);
			setState(208);
			((EvaluationContext)_localctx).evalExpression = evalExpression(0);
			setState(209);
			match(T__4);
			setState(210);
			((EvaluationContext)_localctx).rfn = fileName();
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(211);
				match(Else);
				setState(212);
				((EvaluationContext)_localctx).lfn = fileName();
				}
				break;
			}

								((EvaluationContext)_localctx).result =  ((EvaluationContext)_localctx).evalExpression.result;

								if (_localctx.result == true ) {
									try {
										trans.loadBlock(((EvaluationContext)_localctx).rfn.name);
									} catch (IOException e) {
										RecognitionException ex = trans.errorHandler(CANNOT_LOAD_FILE, _localctx, this);
										_errHandler.reportError(this, ex );
										
									}
								}else if(_localctx.lfn != null){
									try {
										trans.loadBlock(((EvaluationContext)_localctx).lfn.name);
									} catch (IOException e) {
										RecognitionException ex = trans.errorHandler(CAST_EXCEPT, _localctx, this);
										_errHandler.reportError(this, ex );
										
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
		public FetalTransaction t;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContext(ParserRuleContext parent, int invokingState, FetalTransaction t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block(FetalTransaction t) throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState(), t);
		enterRule(_localctx, 40, RULE_block);

			trans = t;
			om = new ObjectMath();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__5);
			setState(218);
			statements();
			setState(219);
			match(T__6);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(222);
				match(T__3);
				setState(223);
				((EvalExpressionContext)_localctx).lh = evalExpression(0);
				setState(224);
				((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
				setState(225);
				((EvalExpressionContext)_localctx).rh = evalExpression(0);
				setState(226);
				match(T__4);

									((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
								
				}
				break;
			case 2:
				{
				setState(229);
				((EvalExpressionContext)_localctx).eval = eval();

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;
								
				}
				break;
			case 3:
				{
				setState(232);
				match(T__3);
				setState(233);
				((EvalExpressionContext)_localctx).eval = eval();
				setState(234);
				match(T__4);

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;					
								
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
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
					setState(239);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(240);
					((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
					setState(241);
					((EvalExpressionContext)_localctx).rh = evalExpression(5);

					          					((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
					          				
					}
					} 
				}
				setState(248);
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
			setState(249);
			((EvalContext)_localctx).lh = rharg(0);
			setState(250);
			((EvalContext)_localctx).comparisonOp = comparisonOp();
			setState(251);
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
		public DaoLiteralContext daoLiteral;
		public StringArgContext sql;
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
		public TerminalNode Import() { return getToken(FetalParser.Import, 0); }
		public TerminalNode Lookup() { return getToken(FetalParser.Lookup, 0); }
		public DaoLiteralContext daoLiteral() {
			return getRuleContext(DaoLiteralContext.class,0);
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
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(GetBalance);
				setState(255);
				match(T__3);
				setState(256);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(257);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj =  trans.getBalance(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(GetVariableType);
				setState(261);
				match(T__3);
				setState(262);
				((AssignmentCommandsContext)_localctx).var = var();
				setState(263);
				match(T__4);

								
								if (trans.isVariable(((AssignmentCommandsContext)_localctx).var.name) == false) {
									Exception ex = trans.errorHandler(NOT_DEFINED, _localctx, this);
									_errHandler.reportError(this, (RecognitionException) ex );
									
								}else{
									((AssignmentCommandsContext)_localctx).obj =  trans.getVariableType(((AssignmentCommandsContext)_localctx).var.name);
								}
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(GetDescription);

								((AssignmentCommandsContext)_localctx).obj =  trans.getDescription();
							
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(Today);
				 
								try {
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
									((AssignmentCommandsContext)_localctx).obj =  (Date) sdf.parse(sdf.format(new Date()));
								}catch (ParseException pe){
									RecognitionException ex = trans.errorHandler(INVALID_DATE, _localctx, this);
									_errHandler.reportError(this, ex );
								}
							
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(GetDays);
				setState(271);
				match(T__3);
				setState(272);
				((AssignmentCommandsContext)_localctx).startPeriod = dateArg();
				setState(273);
				match(T__7);
				setState(274);
				((AssignmentCommandsContext)_localctx).endPeriod = dateArg();
				setState(275);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj =  (Double) trans.getDays(((AssignmentCommandsContext)_localctx).startPeriod.date, ((AssignmentCommandsContext)_localctx).endPeriod.date );
							
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(DayOfTheWeek);
				setState(279);
				match(T__3);
				setState(280);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(281);
				match(T__4);
					
								((AssignmentCommandsContext)_localctx).obj =  trans.dayOfTheWeek(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				match(GetCalendarDay);
				setState(285);
				match(T__3);
				setState(286);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(287);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj = trans.getCalendarDay(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(GetMonth);
				setState(291);
				match(T__3);
				setState(292);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(293);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj = trans.getMonth(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				match(GetYear);
				setState(297);
				match(T__3);
				setState(298);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(299);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj = trans.getYear(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(302);
				match(Import);
				setState(303);
				match(T__3);
				setState(304);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(305);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj = trans.importClass(((AssignmentCommandsContext)_localctx).stringArg.string);
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(6, _localctx, this);
								}
								
							
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(308);
				match(Lookup);
				setState(309);
				match(T__3);
				setState(310);
				((AssignmentCommandsContext)_localctx).daoLiteral = daoLiteral();
				setState(311);
				match(T__7);
				setState(312);
				((AssignmentCommandsContext)_localctx).sql = stringArg();
				setState(313);
				match(T__4);

								((AssignmentCommandsContext)_localctx).obj = trans.lookup((((AssignmentCommandsContext)_localctx).daoLiteral!=null?_input.getText(((AssignmentCommandsContext)_localctx).daoLiteral.start,((AssignmentCommandsContext)_localctx).daoLiteral.stop):null), ((AssignmentCommandsContext)_localctx).sql.string);
							
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(316);
				match(List);
				setState(317);
				match(T__3);
				setState(318);
				((AssignmentCommandsContext)_localctx).daoLiteral = daoLiteral();
				setState(319);
				match(T__7);
				setState(320);
				((AssignmentCommandsContext)_localctx).sql = stringArg();
				setState(321);
				match(T__4);

								trans.list((((AssignmentCommandsContext)_localctx).daoLiteral!=null?_input.getText(((AssignmentCommandsContext)_localctx).daoLiteral.start,((AssignmentCommandsContext)_localctx).daoLiteral.stop):null), ((AssignmentCommandsContext)_localctx).sql.string);
							
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(324);
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_command);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(Print);
				setState(330);
				match(T__3);
				setState(331);
				((CommandContext)_localctx).rharg = rharg(0);
				setState(332);
				match(T__4);

								if (((CommandContext)_localctx).rharg.obj == null) {
									Exception ex = trans.errorHandler(MALFORMED_EXP, _localctx, this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}else{
									System.out.println(((CommandContext)_localctx).rharg.obj);
								}
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(Credit);
				setState(336);
				match(T__3);
				setState(337);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(338);
				match(T__7);
				setState(339);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(340);
				match(T__4);

								trans.credit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(Debit);
				setState(344);
				match(T__3);
				setState(345);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(346);
				match(T__7);
				setState(347);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(348);
				match(T__4);

								trans.debit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(Ledger);
				setState(352);
				match(T__3);
				setState(353);
				((CommandContext)_localctx).debitOrCredit = debitOrCredit();
				setState(354);
				match(T__7);
				setState(355);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(356);
				match(T__7);
				setState(357);
				((CommandContext)_localctx).acc = stringArg();
				setState(358);
				match(T__7);
				setState(359);
				((CommandContext)_localctx).desc = stringArg();
				setState(360);
				match(T__4);

								trans.ledger(((CommandContext)_localctx).debitOrCredit.c, ((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).acc.string, ((CommandContext)_localctx).desc.string );
							
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(Alias);
				setState(364);
				match(T__3);
				setState(365);
				((CommandContext)_localctx).account = stringArg();
				setState(366);
				match(T__7);
				setState(367);
				((CommandContext)_localctx).name = stringArg();
				setState(368);
				match(T__4);

								trans.putMap(((CommandContext)_localctx).account.string, ((CommandContext)_localctx).name.string);
							
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				match(MapFile);
				setState(372);
				match(T__8);
				setState(373);
				((CommandContext)_localctx).stringArg = stringArg();

								trans.mapFile(((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				((CommandContext)_localctx).invocation = invocation();
					
								if (((CommandContext)_localctx).invocation.args != null) {
									trans.invokeMethod(((CommandContext)_localctx).invocation.obj, ((CommandContext)_localctx).invocation.method, ((CommandContext)_localctx).invocation.args);
								}else{
									trans.invokeMethod(((CommandContext)_localctx).invocation.obj, ((CommandContext)_localctx).invocation.method, null);
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
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				((InvocationContext)_localctx).o = objectLiteral();
				setState(382);
				match(T__9);
				setState(383);
				((InvocationContext)_localctx).m = identifier();
				setState(384);
				match(T__3);
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(385);
					((InvocationContext)_localctx).argumentList = argumentList();
					}
					break;
				}
				setState(388);
				match(T__4);

								((InvocationContext)_localctx).obj =  trans.getValue((((InvocationContext)_localctx).o!=null?_input.getText(((InvocationContext)_localctx).o.start,((InvocationContext)_localctx).o.stop):null));
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(INVALID_OBJECT, _localctx, this);
									_errHandler.reportError(this, ex );
								}
								((InvocationContext)_localctx).method =  (((InvocationContext)_localctx).m!=null?_input.getText(((InvocationContext)_localctx).m.start,((InvocationContext)_localctx).m.stop):null);				
								((InvocationContext)_localctx).args =  ((InvocationContext)_localctx).argumentList.argList.toArray();
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				((InvocationContext)_localctx).o = objectLiteral();
				setState(392);
				match(T__9);
				setState(393);
				((InvocationContext)_localctx).m = identifier();
				setState(394);
				match(T__10);

								((InvocationContext)_localctx).obj =  trans.getValue((((InvocationContext)_localctx).o!=null?_input.getText(((InvocationContext)_localctx).o.start,((InvocationContext)_localctx).o.stop):null));
								if (_localctx.obj == null) {
									RecognitionException ex = trans.errorHandler(INVALID_OBJECT, _localctx, this);
									_errHandler.reportError(this, ex );
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((ArgumentListContext)_localctx).rharg = rharg(0);
			_localctx.argList.add(((ArgumentListContext)_localctx).rharg.obj);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					match(T__7);
					setState(402);
					((ArgumentListContext)_localctx).rharg = rharg(0);
					_localctx.argList.add(((ArgumentListContext)_localctx).rharg.obj);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(410);
			((AmtArgContext)_localctx).rharg = rharg(0);

							if (((AmtArgContext)_localctx).rharg.obj == null || ((AmtArgContext)_localctx).rharg.obj instanceof Double == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								_errHandler.reportError(this, ex );
								
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
			setState(413);
			((StringArgContext)_localctx).rharg = rharg(0);

							if (((StringArgContext)_localctx).rharg.obj == null || ((StringArgContext)_localctx).rharg.obj instanceof String == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								_errHandler.reportError(this, ex );
								
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
		enterRule(_localctx, 58, RULE_numberArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			((NumberArgContext)_localctx).rharg = rharg(0);

							if (((NumberArgContext)_localctx).rharg.obj == null || ((NumberArgContext)_localctx).rharg.obj instanceof Long == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								_errHandler.reportError(this, ex );
								
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
		enterRule(_localctx, 60, RULE_dateArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((DateArgContext)_localctx).rharg = rharg(0);

							if (((DateArgContext)_localctx).rharg.obj == null || ((DateArgContext)_localctx).rharg.obj instanceof Date == false) {
								RecognitionException ex = trans.errorHandler(INVALID_ARG, _localctx, this);
								_errHandler.reportError(this, ex );
								
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
		enterRule(_localctx, 62, RULE_debitOrCredit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 64, RULE_literal);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				((LiteralContext)_localctx).numericLiteral = numericLiteral();

								((LiteralContext)_localctx).obj =  (Long) trans.getLong((((LiteralContext)_localctx).numericLiteral!=null?_input.getText(((LiteralContext)_localctx).numericLiteral.start,((LiteralContext)_localctx).numericLiteral.stop):null));
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				((LiteralContext)_localctx).doubleLiteral = doubleLiteral();

								((LiteralContext)_localctx).obj =  (Double) trans.getDouble((((LiteralContext)_localctx).doubleLiteral!=null?_input.getText(((LiteralContext)_localctx).doubleLiteral.start,((LiteralContext)_localctx).doubleLiteral.stop):null));
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				((LiteralContext)_localctx).percentLiteral = percentLiteral();

								String d = (((LiteralContext)_localctx).percentLiteral!=null?_input.getText(((LiteralContext)_localctx).percentLiteral.start,((LiteralContext)_localctx).percentLiteral.stop):null);
								d = d.substring(0, d.length() - 1);
								Double result = trans.getDouble(d);
								result /= 100;
								((LiteralContext)_localctx).obj =  (Double) result;

							
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				((LiteralContext)_localctx).stringLiteral = stringLiteral();
				((LiteralContext)_localctx).obj =  (String) trans.stripQuotes((((LiteralContext)_localctx).stringLiteral!=null?_input.getText(((LiteralContext)_localctx).stringLiteral.start,((LiteralContext)_localctx).stringLiteral.stop):null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				((LiteralContext)_localctx).dateLiteral = dateLiteral();

									try {
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
										((LiteralContext)_localctx).obj =  (Date) sdf.parse((((LiteralContext)_localctx).dateLiteral!=null?_input.getText(((LiteralContext)_localctx).dateLiteral.start,((LiteralContext)_localctx).dateLiteral.stop):null));
									}catch(ParseException pe){
										Exception ex = trans.errorHandler(2, _localctx, this);
										_errHandler.reportError(this, (RecognitionException) ex );
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

	public static class FileNameContext extends ParserRuleContext {
		public String name;
		public Token fn;
		public Token ft;
		public List<TerminalNode> Identifier() { return getTokens(FetalParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FetalParser.Identifier, i);
		}
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(IsLessThan);
			setState(446);
			((FileNameContext)_localctx).fn = match(Identifier);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(447);
				match(T__9);
				setState(448);
				((FileNameContext)_localctx).ft = match(Identifier);
				}
				break;
			}
			setState(451);
			match(IsGreaterThan);

							if ((((FileNameContext)_localctx).ft!=null?((FileNameContext)_localctx).ft.getText():null) != null) {
								((FileNameContext)_localctx).name =  (((FileNameContext)_localctx).fn!=null?((FileNameContext)_localctx).fn.getText():null) + "." + (((FileNameContext)_localctx).ft!=null?((FileNameContext)_localctx).ft.getText():null);
							}else{
								((FileNameContext)_localctx).name =  (((FileNameContext)_localctx).fn!=null?((FileNameContext)_localctx).fn.getText():null);
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

	public static class CharLiteralContext extends ParserRuleContext {
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_charLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 70, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 72, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		enterRule(_localctx, 74, RULE_percentLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
		enterRule(_localctx, 76, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
		enterRule(_localctx, 78, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
		enterRule(_localctx, 80, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		enterRule(_localctx, 82, RULE_objectLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		enterRule(_localctx, 84, RULE_daoLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3O\u01db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5e\n\5\r\5\16\5"+
		"f\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00a5\n\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c0\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00c7\n\22\f\22\16\22\u00ca\13\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d8\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f0\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u00f7\n\27\f\27\16\27\u00fa\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u014a\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u017e\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0185\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0190\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0198\n\34\f\34\16\34\u019b\13\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01be\n\"\3#\3#\3#"+
		"\3#\5#\u01c4\n#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3,\2\4\",-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTV\2\b\3\2\30\35\3\2\36#\3\2$&\3\2\',\3\2-/"+
		"\3\2\16\17\u01e0\2X\3\2\2\2\4]\3\2\2\2\6`\3\2\2\2\bd\3\2\2\2\ns\3\2\2"+
		"\2\f}\3\2\2\2\16\177\3\2\2\2\20\u0090\3\2\2\2\22\u009c\3\2\2\2\24\u009e"+
		"\3\2\2\2\26\u00a0\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00a8\3"+
		"\2\2\2\36\u00aa\3\2\2\2 \u00ac\3\2\2\2\"\u00bf\3\2\2\2$\u00cb\3\2\2\2"+
		"&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00db\3\2\2\2,\u00ef\3\2\2\2.\u00fb\3"+
		"\2\2\2\60\u0149\3\2\2\2\62\u017d\3\2\2\2\64\u018f\3\2\2\2\66\u0191\3\2"+
		"\2\28\u019c\3\2\2\2:\u019f\3\2\2\2<\u01a2\3\2\2\2>\u01a5\3\2\2\2@\u01a8"+
		"\3\2\2\2B\u01bd\3\2\2\2D\u01bf\3\2\2\2F\u01c8\3\2\2\2H\u01ca\3\2\2\2J"+
		"\u01cc\3\2\2\2L\u01ce\3\2\2\2N\u01d0\3\2\2\2P\u01d2\3\2\2\2R\u01d4\3\2"+
		"\2\2T\u01d6\3\2\2\2V\u01d8\3\2\2\2XY\b\2\1\2YZ\5\4\3\2Z[\5\b\5\2[\\\5"+
		"\6\4\2\\\3\3\2\2\2]^\7\3\2\2^_\b\3\1\2_\5\3\2\2\2`a\7\4\2\2ab\b\4\1\2"+
		"b\7\3\2\2\2ce\5\n\6\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2\2"+
		"\2hi\5\f\7\2ij\7\5\2\2jt\3\2\2\2kl\5\62\32\2lm\7\5\2\2mt\3\2\2\2no\5\22"+
		"\n\2op\7\5\2\2pt\3\2\2\2qt\5(\25\2rt\7\5\2\2sh\3\2\2\2sk\3\2\2\2sn\3\2"+
		"\2\2sq\3\2\2\2sr\3\2\2\2t\13\3\2\2\2uv\5\20\t\2vw\5\16\b\2wx\b\7\1\2x"+
		"~\3\2\2\2yz\5\20\t\2z{\5\22\n\2{|\b\7\1\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2"+
		"\2~\r\3\2\2\2\177\u0080\5&\24\2\u0080\u0081\b\b\1\2\u0081\17\3\2\2\2\u0082"+
		"\u0083\7\20\2\2\u0083\u0091\b\t\1\2\u0084\u0085\7\21\2\2\u0085\u0091\b"+
		"\t\1\2\u0086\u0087\7\22\2\2\u0087\u0091\b\t\1\2\u0088\u0089\7\23\2\2\u0089"+
		"\u0091\b\t\1\2\u008a\u008b\7\24\2\2\u008b\u0091\b\t\1\2\u008c\u008d\7"+
		"\25\2\2\u008d\u0091\b\t\1\2\u008e\u008f\7\26\2\2\u008f\u0091\b\t\1\2\u0090"+
		"\u0082\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u0088\3\2"+
		"\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\21\3\2\2\2\u0092\u0093\5$\23\2\u0093\u0094\7\27\2\2\u0094\u0095\5\"\22"+
		"\2\u0095\u0096\b\n\1\2\u0096\u009d\3\2\2\2\u0097\u0098\5$\23\2\u0098\u0099"+
		"\5\26\f\2\u0099\u009a\5\"\22\2\u009a\u009b\b\n\1\2\u009b\u009d\3\2\2\2"+
		"\u009c\u0092\3\2\2\2\u009c\u0097\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f"+
		"\7\27\2\2\u009f\25\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a5\5\32\16\2\u00a3\u00a5\5\34\17\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7\33\3\2\2\2\u00a8\u00a9"+
		"\t\4\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\t\5\2\2\u00ab\37\3\2\2\2\u00ac\u00ad"+
		"\t\6\2\2\u00ad!\3\2\2\2\u00ae\u00af\b\22\1\2\u00af\u00b0\7\6\2\2\u00b0"+
		"\u00b1\5\"\22\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4"+
		"\7\7\2\2\u00b4\u00b5\b\22\1\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\5\16\b\2"+
		"\u00b7\u00b8\b\22\1\2\u00b8\u00c0\3\2\2\2\u00b9\u00ba\5B\"\2\u00ba\u00bb"+
		"\b\22\1\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\5\60\31\2\u00bd\u00be\b\22\1"+
		"\2\u00be\u00c0\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c8\3\2\2\2\u00c1\u00c2\f\7\2\2\u00c2"+
		"\u00c3\5\30\r\2\u00c3\u00c4\5\"\22\b\u00c4\u00c5\b\22\1\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\16\b\2"+
		"\u00cc\u00cd\b\23\1\2\u00cd%\3\2\2\2\u00ce\u00cf\7I\2\2\u00cf\'\3\2\2"+
		"\2\u00d0\u00d1\7A\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\5,\27\2\u00d3\u00d4"+
		"\7\7\2\2\u00d4\u00d7\5D#\2\u00d5\u00d6\7B\2\2\u00d6\u00d8\5D#\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\25"+
		"\1\2\u00da)\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\u00dd\5\b\5\2\u00dd\u00de"+
		"\7\t\2\2\u00de+\3\2\2\2\u00df\u00e0\b\27\1\2\u00e0\u00e1\7\6\2\2\u00e1"+
		"\u00e2\5,\27\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\5,\27\2\u00e4\u00e5\7\7"+
		"\2\2\u00e5\u00e6\b\27\1\2\u00e6\u00f0\3\2\2\2\u00e7\u00e8\5.\30\2\u00e8"+
		"\u00e9\b\27\1\2\u00e9\u00f0\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5"+
		".\30\2\u00ec\u00ed\7\7\2\2\u00ed\u00ee\b\27\1\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00df\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\u00f8\3\2"+
		"\2\2\u00f1\u00f2\f\6\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\5,\27\7\u00f4"+
		"\u00f5\b\27\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9-\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\5\"\22"+
		"\2\u00fe\u00ff\b\30\1\2\u00ff/\3\2\2\2\u0100\u0101\7\60\2\2\u0101\u0102"+
		"\7\6\2\2\u0102\u0103\5:\36\2\u0103\u0104\7\7\2\2\u0104\u0105\b\31\1\2"+
		"\u0105\u014a\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7\6\2\2\u0108\u0109"+
		"\5\16\b\2\u0109\u010a\7\7\2\2\u010a\u010b\b\31\1\2\u010b\u014a\3\2\2\2"+
		"\u010c\u010d\7\62\2\2\u010d\u014a\b\31\1\2\u010e\u010f\7\63\2\2\u010f"+
		"\u014a\b\31\1\2\u0110\u0111\7\64\2\2\u0111\u0112\7\6\2\2\u0112\u0113\5"+
		"> \2\u0113\u0114\7\n\2\2\u0114\u0115\5> \2\u0115\u0116\7\7\2\2\u0116\u0117"+
		"\b\31\1\2\u0117\u014a\3\2\2\2\u0118\u0119\7\65\2\2\u0119\u011a\7\6\2\2"+
		"\u011a\u011b\5> \2\u011b\u011c\7\7\2\2\u011c\u011d\b\31\1\2\u011d\u014a"+
		"\3\2\2\2\u011e\u011f\7\66\2\2\u011f\u0120\7\6\2\2\u0120\u0121\5> \2\u0121"+
		"\u0122\7\7\2\2\u0122\u0123\b\31\1\2\u0123\u014a\3\2\2\2\u0124\u0125\7"+
		"\67\2\2\u0125\u0126\7\6\2\2\u0126\u0127\5> \2\u0127\u0128\7\7\2\2\u0128"+
		"\u0129\b\31\1\2\u0129\u014a\3\2\2\2\u012a\u012b\78\2\2\u012b\u012c\7\6"+
		"\2\2\u012c\u012d\5> \2\u012d\u012e\7\7\2\2\u012e\u012f\b\31\1\2\u012f"+
		"\u014a\3\2\2\2\u0130\u0131\79\2\2\u0131\u0132\7\6\2\2\u0132\u0133\5:\36"+
		"\2\u0133\u0134\7\7\2\2\u0134\u0135\b\31\1\2\u0135\u014a\3\2\2\2\u0136"+
		"\u0137\7:\2\2\u0137\u0138\7\6\2\2\u0138\u0139\5V,\2\u0139\u013a\7\n\2"+
		"\2\u013a\u013b\5:\36\2\u013b\u013c\7\7\2\2\u013c\u013d\b\31\1\2\u013d"+
		"\u014a\3\2\2\2\u013e\u013f\7;\2\2\u013f\u0140\7\6\2\2\u0140\u0141\5V,"+
		"\2\u0141\u0142\7\n\2\2\u0142\u0143\5:\36\2\u0143\u0144\7\7\2\2\u0144\u0145"+
		"\b\31\1\2\u0145\u014a\3\2\2\2\u0146\u0147\5\64\33\2\u0147\u0148\b\31\1"+
		"\2\u0148\u014a\3\2\2\2\u0149\u0100\3\2\2\2\u0149\u0106\3\2\2\2\u0149\u010c"+
		"\3\2\2\2\u0149\u010e\3\2\2\2\u0149\u0110\3\2\2\2\u0149\u0118\3\2\2\2\u0149"+
		"\u011e\3\2\2\2\u0149\u0124\3\2\2\2\u0149\u012a\3\2\2\2\u0149\u0130\3\2"+
		"\2\2\u0149\u0136\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0146\3\2\2\2\u014a"+
		"\61\3\2\2\2\u014b\u014c\7C\2\2\u014c\u014d\7\6\2\2\u014d\u014e\5\"\22"+
		"\2\u014e\u014f\7\7\2\2\u014f\u0150\b\32\1\2\u0150\u017e\3\2\2\2\u0151"+
		"\u0152\7<\2\2\u0152\u0153\7\6\2\2\u0153\u0154\58\35\2\u0154\u0155\7\n"+
		"\2\2\u0155\u0156\5:\36\2\u0156\u0157\7\7\2\2\u0157\u0158\b\32\1\2\u0158"+
		"\u017e\3\2\2\2\u0159\u015a\7=\2\2\u015a\u015b\7\6\2\2\u015b\u015c\58\35"+
		"\2\u015c\u015d\7\n\2\2\u015d\u015e\5:\36\2\u015e\u015f\7\7\2\2\u015f\u0160"+
		"\b\32\1\2\u0160\u017e\3\2\2\2\u0161\u0162\7>\2\2\u0162\u0163\7\6\2\2\u0163"+
		"\u0164\5@!\2\u0164\u0165\7\n\2\2\u0165\u0166\58\35\2\u0166\u0167\7\n\2"+
		"\2\u0167\u0168\5:\36\2\u0168\u0169\7\n\2\2\u0169\u016a\5:\36\2\u016a\u016b"+
		"\7\7\2\2\u016b\u016c\b\32\1\2\u016c\u017e\3\2\2\2\u016d\u016e\7?\2\2\u016e"+
		"\u016f\7\6\2\2\u016f\u0170\5:\36\2\u0170\u0171\7\n\2\2\u0171\u0172\5:"+
		"\36\2\u0172\u0173\7\7\2\2\u0173\u0174\b\32\1\2\u0174\u017e\3\2\2\2\u0175"+
		"\u0176\7@\2\2\u0176\u0177\7\13\2\2\u0177\u0178\5:\36\2\u0178\u0179\b\32"+
		"\1\2\u0179\u017e\3\2\2\2\u017a\u017b\5\64\33\2\u017b\u017c\b\32\1\2\u017c"+
		"\u017e\3\2\2\2\u017d\u014b\3\2\2\2\u017d\u0151\3\2\2\2\u017d\u0159\3\2"+
		"\2\2\u017d\u0161\3\2\2\2\u017d\u016d\3\2\2\2\u017d\u0175\3\2\2\2\u017d"+
		"\u017a\3\2\2\2\u017e\63\3\2\2\2\u017f\u0180\5T+\2\u0180\u0181\7\f\2\2"+
		"\u0181\u0182\5&\24\2\u0182\u0184\7\6\2\2\u0183\u0185\5\66\34\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7\7\2\2\u0187"+
		"\u0188\b\33\1\2\u0188\u0190\3\2\2\2\u0189\u018a\5T+\2\u018a\u018b\7\f"+
		"\2\2\u018b\u018c\5&\24\2\u018c\u018d\7\r\2\2\u018d\u018e\b\33\1\2\u018e"+
		"\u0190\3\2\2\2\u018f\u017f\3\2\2\2\u018f\u0189\3\2\2\2\u0190\65\3\2\2"+
		"\2\u0191\u0192\5\"\22\2\u0192\u0199\b\34\1\2\u0193\u0194\7\n\2\2\u0194"+
		"\u0195\5\"\22\2\u0195\u0196\b\34\1\2\u0196\u0198\3\2\2\2\u0197\u0193\3"+
		"\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\67\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\5\"\22\2\u019d\u019e\b\35"+
		"\1\2\u019e9\3\2\2\2\u019f\u01a0\5\"\22\2\u01a0\u01a1\b\36\1\2\u01a1;\3"+
		"\2\2\2\u01a2\u01a3\5\"\22\2\u01a3\u01a4\b\37\1\2\u01a4=\3\2\2\2\u01a5"+
		"\u01a6\5\"\22\2\u01a6\u01a7\b \1\2\u01a7?\3\2\2\2\u01a8\u01a9\5F$\2\u01a9"+
		"\u01aa\b!\1\2\u01aaA\3\2\2\2\u01ab\u01ac\5H%\2\u01ac\u01ad\b\"\1\2\u01ad"+
		"\u01be\3\2\2\2\u01ae\u01af\5J&\2\u01af\u01b0\b\"\1\2\u01b0\u01be\3\2\2"+
		"\2\u01b1\u01b2\5N(\2\u01b2\u01b3\b\"\1\2\u01b3\u01be\3\2\2\2\u01b4\u01b5"+
		"\5L\'\2\u01b5\u01b6\b\"\1\2\u01b6\u01be\3\2\2\2\u01b7\u01b8\5P)\2\u01b8"+
		"\u01b9\b\"\1\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\5R*\2\u01bb\u01bc\b\"\1"+
		"\2\u01bc\u01be\3\2\2\2\u01bd\u01ab\3\2\2\2\u01bd\u01ae\3\2\2\2\u01bd\u01b1"+
		"\3\2\2\2\u01bd\u01b4\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be"+
		"C\3\2\2\2\u01bf\u01c0\7(\2\2\u01c0\u01c3\7I\2\2\u01c1\u01c2\7\f\2\2\u01c2"+
		"\u01c4\7I\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\7*\2\2\u01c6\u01c7\b#\1\2\u01c7E\3\2\2\2\u01c8\u01c9"+
		"\t\7\2\2\u01c9G\3\2\2\2\u01ca\u01cb\7F\2\2\u01cbI\3\2\2\2\u01cc\u01cd"+
		"\7G\2\2\u01cdK\3\2\2\2\u01ce\u01cf\7D\2\2\u01cfM\3\2\2\2\u01d0\u01d1\7"+
		"E\2\2\u01d1O\3\2\2\2\u01d2\u01d3\7J\2\2\u01d3Q\3\2\2\2\u01d4\u01d5\7H"+
		"\2\2\u01d5S\3\2\2\2\u01d6\u01d7\7I\2\2\u01d7U\3\2\2\2\u01d8\u01d9\7I\2"+
		"\2\u01d9W\3\2\2\2\24fs}\u0090\u009c\u00a4\u00bf\u00c8\u00d7\u00ef\u00f8"+
		"\u0149\u017d\u0184\u018f\u0199\u01bd\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}