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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		GetBalance=46, GetVariableType=47, Today=48, GetDays=49, DayOfTheWeek=50, 
		GetRate=51, GetBaseCurrency=52, LastRefreshDate=53, Alias=54, MapFile=55, 
		Import=56, Lookup=57, List=58, Credit=59, Debit=60, Ledger=61, AddStock=62, 
		DepleteStock=63, SetTax=64, SetShipCharges=65, SetAddedCharges=66, CommitReceipt=67, 
		DepleteReceipt=68, CommitStock=69, Invoke=70, IfStatement=71, Else=72, 
		Print=73, Percentage=74, Boolean=75, Long=76, Double=77, Date=78, Identifier=79, 
		String=80, LineAfterPreprocessing=81, ExtendedAscii=82, Whitespace=83, 
		Newline=84, BlockComment=85, LineComment=86;
	public static final int
		RULE_transaction = 0, RULE_begin = 1, RULE_end = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_declaration = 5, RULE_var = 6, RULE_type = 7, 
		RULE_assignment = 8, RULE_arithmetic = 9, RULE_lexical = 10, RULE_logical = 11, 
		RULE_dateType = 12, RULE_objectType = 13, RULE_daoType = 14, RULE_assignmentOp = 15, 
		RULE_unaryOP = 16, RULE_expressionOp = 17, RULE_arithExpressOp = 18, RULE_bitwiseExpressOp = 19, 
		RULE_comparisonOp = 20, RULE_logicExpressOp = 21, RULE_rharg = 22, RULE_lharg = 23, 
		RULE_identifier = 24, RULE_evaluation = 25, RULE_block = 26, RULE_evalExpression = 27, 
		RULE_eval = 28, RULE_assignmentCommands = 29, RULE_command = 30, RULE_invocation = 31, 
		RULE_argumentList = 32, RULE_amtArg = 33, RULE_stringArg = 34, RULE_numberArg = 35, 
		RULE_dateArg = 36, RULE_debitOrCredit = 37, RULE_literal = 38, RULE_fileName = 39, 
		RULE_charLiteral = 40, RULE_numericLiteral = 41, RULE_doubleLiteral = 42, 
		RULE_percentLiteral = 43, RULE_booleanLiteral = 44, RULE_stringLiteral = 45, 
		RULE_dateLiteral = 46, RULE_objectLiteral = 47, RULE_daoLiteral = 48;
	public static final String[] ruleNames = {
		"transaction", "begin", "end", "statements", "statement", "declaration", 
		"var", "type", "assignment", "arithmetic", "lexical", "logical", "dateType", 
		"objectType", "daoType", "assignmentOp", "unaryOP", "expressionOp", "arithExpressOp", 
		"bitwiseExpressOp", "comparisonOp", "logicExpressOp", "rharg", "lharg", 
		"identifier", "evaluation", "block", "evalExpression", "eval", "assignmentCommands", 
		"command", "invocation", "argumentList", "amtArg", "stringArg", "numberArg", 
		"dateArg", "debitOrCredit", "literal", "fileName", "charLiteral", "numericLiteral", 
		"doubleLiteral", "percentLiteral", "booleanLiteral", "stringLiteral", 
		"dateLiteral", "objectLiteral", "daoLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "';'", "'='", "'double'", "'long'", "'string'", 
		"'boolean'", "'date'", "'object'", "'dao'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'^='", "'*'", "'/'", "'+'", "'-'", "'%'", "'^'", "'&'", "'|'", 
		"'!'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'^^'", 
		"'('", "')'", "'{'", "'}'", "','", "':'", "'.'", "'()'", "'D'", "'C'", 
		"'getBalance'", "'getVariableType'", "'today'", "'getDays'", "'dayOfTheWeek'", 
		"'getRate'", "'getBaseCurrency'", "'lastRefreshDate'", "'alias'", "'mapFile'", 
		"'import'", "'lookup'", "'list'", "'credit'", "'debit'", "'ledger'", "'addStock'", 
		"'depleteStock'", "'setTax'", "'setShipCharges'", "'setAddedCharges'", 
		"'commitReceipt'", "'depleteReceipt'", "'commitStock'", "'invoke'", "'if'", 
		"'else'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "GetBalance", 
		"GetVariableType", "Today", "GetDays", "DayOfTheWeek", "GetRate", "GetBaseCurrency", 
		"LastRefreshDate", "Alias", "MapFile", "Import", "Lookup", "List", "Credit", 
		"Debit", "Ledger", "AddStock", "DepleteStock", "SetTax", "SetShipCharges", 
		"SetAddedCharges", "CommitReceipt", "DepleteReceipt", "CommitStock", "Invoke", 
		"IfStatement", "Else", "Print", "Percentage", "Boolean", "Long", "Double", 
		"Date", "Identifier", "String", "LineAfterPreprocessing", "ExtendedAscii", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
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
						
			setState(99);
			begin();
			setState(100);
			statements();
			setState(101);
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
			setState(103);
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
			setState(106);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Alias) | (1L << MapFile) | (1L << Credit) | (1L << Debit) | (1L << Ledger) | (1L << AddStock) | (1L << DepleteStock))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SetShipCharges - 65)) | (1L << (SetAddedCharges - 65)) | (1L << (CommitReceipt - 65)) | (1L << (DepleteReceipt - 65)) | (1L << (CommitStock - 65)) | (1L << (IfStatement - 65)) | (1L << (Print - 65)) | (1L << (Identifier - 65)))) != 0) );
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				declaration();
				setState(115);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				command();
				setState(118);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				assignment();
				setState(121);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				evaluation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((DeclarationContext)_localctx).type = type();
				setState(128);
				((DeclarationContext)_localctx).var = var();
				trans.addVariable(((DeclarationContext)_localctx).var.name, ((DeclarationContext)_localctx).type.varType); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((DeclarationContext)_localctx).type = type();
				setState(132);
				((DeclarationContext)_localctx).assignment = assignment();

								trans.addVariable(((DeclarationContext)_localctx).assignment.lh, ((DeclarationContext)_localctx).type.varType, ((DeclarationContext)_localctx).assignment.obj);				
							
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
			setState(137);
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
		public ArithmeticContext arithmetic;
		public LexicalContext lexical;
		public LogicalContext logical;
		public DateTypeContext dateType;
		public ObjectTypeContext objectType;
		public DaoTypeContext daoType;
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public LexicalContext lexical() {
			return getRuleContext(LexicalContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public DateTypeContext dateType() {
			return getRuleContext(DateTypeContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public DaoTypeContext daoType() {
			return getRuleContext(DaoTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((TypeContext)_localctx).arithmetic = arithmetic();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).arithmetic.varType;
							
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((TypeContext)_localctx).lexical = lexical();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).lexical.varType;
							
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((TypeContext)_localctx).logical = logical();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).logical.varType;
							
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				((TypeContext)_localctx).dateType = dateType();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).dateType.varType;
							
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				((TypeContext)_localctx).objectType = objectType();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).objectType.varType;
							
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				((TypeContext)_localctx).daoType = daoType();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).daoType.varType;
							
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(161);
				match(T__3);
				setState(162);
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
				setState(165);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(166);
				((AssignmentContext)_localctx).unaryOP = unaryOP();
				setState(167);
				((AssignmentContext)_localctx).rharg = rharg(0);

								String oper = (((AssignmentContext)_localctx).unaryOP!=null?_input.getText(((AssignmentContext)_localctx).unaryOP.start,((AssignmentContext)_localctx).unaryOP.stop):null);
								oper = oper.substring(0, oper.length() - 1);
								if (((AssignmentContext)_localctx).lharg.obj == null) {
									NoViableAltException ex = trans.getException("'" + (((AssignmentContext)_localctx).lharg!=null?_input.getText(((AssignmentContext)_localctx).lharg.start,((AssignmentContext)_localctx).lharg.stop):null) + "' has not been defined.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
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

	public static class ArithmeticContext extends ParserRuleContext {
		public VariableType varType;
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmetic);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__4);

								((ArithmeticContext)_localctx).varType =  VariableType.DOUBLE;
							
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__5);

								((ArithmeticContext)_localctx).varType =  VariableType.LONG;
							
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

	public static class LexicalContext extends ParserRuleContext {
		public VariableType varType;
		public LexicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexical; }
	}

	public final LexicalContext lexical() throws RecognitionException {
		LexicalContext _localctx = new LexicalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lexical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__6);

							((LexicalContext)_localctx).varType =  VariableType.STRING;
						
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

	public static class LogicalContext extends ParserRuleContext {
		public VariableType varType;
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__7);

							((LogicalContext)_localctx).varType =  VariableType.BOOLEAN;
						
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

	public static class DateTypeContext extends ParserRuleContext {
		public VariableType varType;
		public DateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateType; }
	}

	public final DateTypeContext dateType() throws RecognitionException {
		DateTypeContext _localctx = new DateTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__8);

							((DateTypeContext)_localctx).varType =  VariableType.DATE;
						
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

	public static class ObjectTypeContext extends ParserRuleContext {
		public VariableType varType;
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__9);

							((ObjectTypeContext)_localctx).varType =  VariableType.OBJECT;
						
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

	public static class DaoTypeContext extends ParserRuleContext {
		public VariableType varType;
		public DaoTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daoType; }
	}

	public final DaoTypeContext daoType() throws RecognitionException {
		DaoTypeContext _localctx = new DaoTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_daoType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__10);

							((DaoTypeContext)_localctx).varType =  VariableType.DAO;
						
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
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__3);
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
		public UnaryOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOP; }
	}

	public final UnaryOPContext unaryOP() throws RecognitionException {
		UnaryOPContext _localctx = new UnaryOPContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unaryOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_expressionOp);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				arithExpressOp();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		public ArithExpressOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpressOp; }
	}

	public final ArithExpressOpContext arithExpressOp() throws RecognitionException {
		ArithExpressOpContext _localctx = new ArithExpressOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		public BitwiseExpressOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpressOp; }
	}

	public final BitwiseExpressOpContext bitwiseExpressOp() throws RecognitionException {
		BitwiseExpressOpContext _localctx = new BitwiseExpressOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bitwiseExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		public LogicExpressOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpressOp; }
	}

	public final LogicExpressOpContext logicExpressOp() throws RecognitionException {
		LogicExpressOpContext _localctx = new LogicExpressOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_rharg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(210);
				match(T__35);
				setState(211);
				((RhargContext)_localctx).lh = rharg(0);
				setState(212);
				((RhargContext)_localctx).expressionOp = expressionOp();
				setState(213);
				((RhargContext)_localctx).rh = rharg(0);
				setState(214);
				match(T__36);

								if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
									
									NoViableAltException ex = trans.getException("'" + (((RhargContext)_localctx).lh!=null?_input.getText(((RhargContext)_localctx).lh.start,((RhargContext)_localctx).lh.stop):null) + "' and ''" + (((RhargContext)_localctx).rh!=null?_input.getText(((RhargContext)_localctx).rh.start,((RhargContext)_localctx).rh.stop):null) + "' are different types.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}else{
									((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
								}
							
				}
				break;
			case 2:
				{
				setState(217);
				((RhargContext)_localctx).var = var();

								
								((RhargContext)_localctx).obj =  trans.getValue(((RhargContext)_localctx).var.name);
								if (_localctx.obj == null) {
									NoViableAltException ex = trans.getException("'" + ((RhargContext)_localctx).var.name + "' is not defined.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
									
								}
							
				}
				break;
			case 3:
				{
				setState(220);
				((RhargContext)_localctx).literal = literal();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).literal.obj;
								if (_localctx.obj == null) {
									NoViableAltException ex = trans.getException("'" + (((RhargContext)_localctx).literal!=null?_input.getText(((RhargContext)_localctx).literal.start,((RhargContext)_localctx).literal.stop):null) + "' is malformed.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}
							
				}
				break;
			case 4:
				{
				setState(223);
				((RhargContext)_localctx).assignmentCommands = assignmentCommands();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).assignmentCommands.obj;
							
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
					setState(228);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(229);
					((RhargContext)_localctx).expressionOp = expressionOp();
					setState(230);
					((RhargContext)_localctx).rh = rharg(6);

					          				if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
					          					
					          					NoViableAltException ex = trans.getException("'" + (((RhargContext)_localctx).lh!=null?_input.getText(((RhargContext)_localctx).lh.start,((RhargContext)_localctx).lh.stop):null) + "' and ''" + (((RhargContext)_localctx).rh!=null?_input.getText(((RhargContext)_localctx).rh.start,((RhargContext)_localctx).rh.stop):null) + "' are different types.",_localctx,this);
					          					_errHandler.reportError(this, (RecognitionException) ex );
					          				}else{
					          					((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
					          				}
					          			
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 46, RULE_lharg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 48, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		enterRule(_localctx, 50, RULE_evaluation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IfStatement);
			setState(244);
			match(T__35);
			setState(245);
			((EvaluationContext)_localctx).evalExpression = evalExpression(0);
			setState(246);
			match(T__36);
			setState(247);
			((EvaluationContext)_localctx).rfn = fileName();
			setState(250);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(248);
				match(Else);
				setState(249);
				((EvaluationContext)_localctx).lfn = fileName();
				}
			}


								((EvaluationContext)_localctx).result =  ((EvaluationContext)_localctx).evalExpression.result;

								if (_localctx.result == true ) {
									try {
										trans.loadBlock(((EvaluationContext)_localctx).rfn.name);
									} catch (IOException e) {
										NoViableAltException ex = trans.getException("Can not load file: '" + ((EvaluationContext)_localctx).rfn.name + "'",_localctx,this);
										_errHandler.reportError(this, (RecognitionException) ex );
										
									}
								}else if(_localctx.lfn != null){
									try {
										trans.loadBlock(((EvaluationContext)_localctx).lfn.name);
									} catch (IOException e) {
										NoViableAltException ex = trans.getException("Can not load file: '" + ((EvaluationContext)_localctx).lfn.name + "'", _localctx,this);
										_errHandler.reportError(this, (RecognitionException) ex );
										
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
		enterRule(_localctx, 52, RULE_block);

			trans = t;
			om = new ObjectMath();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__37);
			setState(255);
			statements();
			setState(256);
			match(T__38);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_evalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(259);
				match(T__35);
				setState(260);
				((EvalExpressionContext)_localctx).lh = evalExpression(0);
				setState(261);
				((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
				setState(262);
				((EvalExpressionContext)_localctx).rh = evalExpression(0);
				setState(263);
				match(T__36);

									((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
								
				}
				break;
			case 2:
				{
				setState(266);
				((EvalExpressionContext)_localctx).eval = eval();

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;
								
				}
				break;
			case 3:
				{
				setState(269);
				match(T__35);
				setState(270);
				((EvalExpressionContext)_localctx).eval = eval();
				setState(271);
				match(T__36);

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;					
								
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
					setState(276);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(277);
					((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
					setState(278);
					((EvalExpressionContext)_localctx).rh = evalExpression(5);

					          					((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
					          				
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 56, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((EvalContext)_localctx).lh = rharg(0);
			setState(287);
			((EvalContext)_localctx).comparisonOp = comparisonOp();
			setState(288);
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
		public TerminalNode Today() { return getToken(FetalParser.Today, 0); }
		public TerminalNode GetDays() { return getToken(FetalParser.GetDays, 0); }
		public List<DateArgContext> dateArg() {
			return getRuleContexts(DateArgContext.class);
		}
		public DateArgContext dateArg(int i) {
			return getRuleContext(DateArgContext.class,i);
		}
		public TerminalNode DayOfTheWeek() { return getToken(FetalParser.DayOfTheWeek, 0); }
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
		enterRule(_localctx, 58, RULE_assignmentCommands);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case GetBalance:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(GetBalance);
				setState(292);
				match(T__35);
				setState(293);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(294);
				match(T__36);

								((AssignmentCommandsContext)_localctx).obj =  trans.getBalance(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetVariableType:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(GetVariableType);
				setState(298);
				match(T__35);
				setState(299);
				((AssignmentCommandsContext)_localctx).var = var();
				setState(300);
				match(T__36);

								
								if (trans.isVariable(((AssignmentCommandsContext)_localctx).var.name) == false) {
									Exception ex = trans.getException("'" + ((AssignmentCommandsContext)_localctx).var.name  + "' has not been declared",_localctx, this);
									_errHandler.reportError(this, (RecognitionException) ex );
									
								}else{
									((AssignmentCommandsContext)_localctx).obj =  trans.getVariableType(((AssignmentCommandsContext)_localctx).var.name);
								}
							
				}
				break;
			case Today:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(Today);
				 
								try {
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
									((AssignmentCommandsContext)_localctx).obj =  (Date) sdf.parse(sdf.format(new Date()));
								}catch (ParseException pe){
									Exception ex = trans.getException("Invalid date format.",_localctx, this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}
							
				}
				break;
			case GetDays:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(GetDays);
				setState(306);
				match(T__35);
				setState(307);
				((AssignmentCommandsContext)_localctx).startPeriod = dateArg();
				setState(308);
				match(T__39);
				setState(309);
				((AssignmentCommandsContext)_localctx).endPeriod = dateArg();
				setState(310);
				match(T__36);

								((AssignmentCommandsContext)_localctx).obj =  (Double) trans.getDays(((AssignmentCommandsContext)_localctx).startPeriod.date, ((AssignmentCommandsContext)_localctx).endPeriod.date );
							
				}
				break;
			case DayOfTheWeek:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				match(DayOfTheWeek);
				setState(314);
				match(T__35);
				setState(315);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(316);
				match(T__36);

								((AssignmentCommandsContext)_localctx).obj =  om.dayOfTheWeek(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				match(Import);
				setState(320);
				match(T__35);
				setState(321);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(322);
				match(T__36);

								((AssignmentCommandsContext)_localctx).obj = trans.importClass(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case Lookup:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(Lookup);
				setState(326);
				match(T__35);
				setState(327);
				((AssignmentCommandsContext)_localctx).daoLiteral = daoLiteral();
				setState(328);
				match(T__39);
				setState(329);
				((AssignmentCommandsContext)_localctx).sql = stringArg();
				setState(330);
				match(T__36);

								((AssignmentCommandsContext)_localctx).obj = trans.lookup((((AssignmentCommandsContext)_localctx).daoLiteral!=null?_input.getText(((AssignmentCommandsContext)_localctx).daoLiteral.start,((AssignmentCommandsContext)_localctx).daoLiteral.stop):null), ((AssignmentCommandsContext)_localctx).sql.string);
							
				}
				break;
			case List:
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
				match(List);
				setState(334);
				match(T__35);
				setState(335);
				((AssignmentCommandsContext)_localctx).daoLiteral = daoLiteral();
				setState(336);
				match(T__39);
				setState(337);
				((AssignmentCommandsContext)_localctx).sql = stringArg();
				setState(338);
				match(T__36);

								trans.list((((AssignmentCommandsContext)_localctx).daoLiteral!=null?_input.getText(((AssignmentCommandsContext)_localctx).daoLiteral.start,((AssignmentCommandsContext)_localctx).daoLiteral.stop):null), ((AssignmentCommandsContext)_localctx).sql.string);
							
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				((AssignmentCommandsContext)_localctx).invocation = invocation();

								if (((AssignmentCommandsContext)_localctx).invocation.args != null) {
									((AssignmentCommandsContext)_localctx).obj =  trans.invokeMethod(((AssignmentCommandsContext)_localctx).invocation.obj, ((AssignmentCommandsContext)_localctx).invocation.method, ((AssignmentCommandsContext)_localctx).invocation.args);
								}else{
									((AssignmentCommandsContext)_localctx).obj =  trans.invokeMethod(((AssignmentCommandsContext)_localctx).invocation.obj, ((AssignmentCommandsContext)_localctx).invocation.method);
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
		public NumberArgContext numberArg;
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
		public TerminalNode AddStock() { return getToken(FetalParser.AddStock, 0); }
		public NumberArgContext numberArg() {
			return getRuleContext(NumberArgContext.class,0);
		}
		public TerminalNode DepleteStock() { return getToken(FetalParser.DepleteStock, 0); }
		public TerminalNode SetShipCharges() { return getToken(FetalParser.SetShipCharges, 0); }
		public TerminalNode SetAddedCharges() { return getToken(FetalParser.SetAddedCharges, 0); }
		public TerminalNode CommitStock() { return getToken(FetalParser.CommitStock, 0); }
		public TerminalNode CommitReceipt() { return getToken(FetalParser.CommitReceipt, 0); }
		public TerminalNode DepleteReceipt() { return getToken(FetalParser.DepleteReceipt, 0); }
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
		enterRule(_localctx, 60, RULE_command);
		try {
			setState(436);
			switch (_input.LA(1)) {
			case Print:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(Print);
				setState(347);
				match(T__35);
				setState(348);
				((CommandContext)_localctx).rharg = rharg(0);
				setState(349);
				match(T__36);

								if (((CommandContext)_localctx).rharg.obj == null) {
									Exception ex = trans.getException("Malformed assignment.",_localctx, this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}else{
									System.out.println(((CommandContext)_localctx).rharg.obj);
								}
							
				}
				break;
			case Credit:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(Credit);
				setState(353);
				match(T__35);
				setState(354);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(355);
				match(T__39);
				setState(356);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(357);
				match(T__36);

								trans.credit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Debit:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(Debit);
				setState(361);
				match(T__35);
				setState(362);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(363);
				match(T__39);
				setState(364);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(365);
				match(T__36);

								trans.debit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Ledger:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(Ledger);
				setState(369);
				match(T__35);
				setState(370);
				((CommandContext)_localctx).debitOrCredit = debitOrCredit();
				setState(371);
				match(T__39);
				setState(372);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(373);
				match(T__39);
				setState(374);
				((CommandContext)_localctx).acc = stringArg();
				setState(375);
				match(T__39);
				setState(376);
				((CommandContext)_localctx).desc = stringArg();
				setState(377);
				match(T__36);

								trans.ledger(((CommandContext)_localctx).debitOrCredit.c, ((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).acc.string, ((CommandContext)_localctx).desc.string );
							
				}
				break;
			case AddStock:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				match(AddStock);
				setState(381);
				match(T__35);
				setState(382);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(383);
				match(T__39);
				setState(384);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(385);
				match(T__36);

								trans.addStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			case DepleteStock:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				match(DepleteStock);
				setState(389);
				match(T__35);
				setState(390);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(391);
				match(T__39);
				setState(392);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(393);
				match(T__36);

								trans.depleteStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			case SetShipCharges:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				match(SetShipCharges);
				setState(397);
				match(T__35);
				setState(398);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(399);
				match(T__36);

								trans.setShipCharges(((CommandContext)_localctx).amtArg.amt);
							
				}
				break;
			case SetAddedCharges:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				match(SetAddedCharges);
				setState(403);
				match(T__35);
				setState(404);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(405);
				match(T__36);

								trans.setAddedCharges(((CommandContext)_localctx).amtArg.amt);
							
				}
				break;
			case CommitStock:
				enterOuterAlt(_localctx, 9);
				{
				setState(408);
				match(CommitStock);
				setState(409);
				match(T__35);
				setState(410);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(411);
				match(T__39);
				setState(412);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(413);
				match(T__36);

								trans.commitStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			case CommitReceipt:
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				match(CommitReceipt);

								trans.commitReceipt();
							
				}
				break;
			case DepleteReceipt:
				enterOuterAlt(_localctx, 11);
				{
				setState(418);
				match(DepleteReceipt);

								trans.depleteReceipt();
							
				}
				break;
			case Alias:
				enterOuterAlt(_localctx, 12);
				{
				setState(420);
				match(Alias);
				setState(421);
				match(T__35);
				setState(422);
				((CommandContext)_localctx).account = stringArg();
				setState(423);
				match(T__39);
				setState(424);
				((CommandContext)_localctx).name = stringArg();
				setState(425);
				match(T__36);

								trans.putMap(((CommandContext)_localctx).account.string, ((CommandContext)_localctx).name.string);
							
				}
				break;
			case MapFile:
				enterOuterAlt(_localctx, 13);
				{
				setState(428);
				match(MapFile);
				setState(429);
				match(T__40);
				setState(430);
				((CommandContext)_localctx).stringArg = stringArg();

								trans.mapFile(((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 14);
				{
				setState(433);
				((CommandContext)_localctx).invocation = invocation();
					
								if (((CommandContext)_localctx).invocation.args != null) {
									trans.invokeMethod(((CommandContext)_localctx).invocation.obj, ((CommandContext)_localctx).invocation.method, ((CommandContext)_localctx).invocation.args);
								}else{
									trans.invokeMethod(((CommandContext)_localctx).invocation.obj, ((CommandContext)_localctx).invocation.method, null);
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
		enterRule(_localctx, 62, RULE_invocation);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				((InvocationContext)_localctx).o = objectLiteral();
				setState(439);
				match(T__41);
				setState(440);
				((InvocationContext)_localctx).m = identifier();
				setState(441);
				match(T__35);
				setState(443);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (GetBalance - 36)) | (1L << (GetVariableType - 36)) | (1L << (Today - 36)) | (1L << (GetDays - 36)) | (1L << (DayOfTheWeek - 36)) | (1L << (Import - 36)) | (1L << (Lookup - 36)) | (1L << (List - 36)) | (1L << (Percentage - 36)) | (1L << (Boolean - 36)) | (1L << (Long - 36)) | (1L << (Double - 36)) | (1L << (Date - 36)) | (1L << (Identifier - 36)) | (1L << (String - 36)))) != 0)) {
					{
					setState(442);
					((InvocationContext)_localctx).argumentList = argumentList();
					}
				}

				setState(445);
				match(T__36);

								((InvocationContext)_localctx).obj =  trans.getValue((((InvocationContext)_localctx).o!=null?_input.getText(((InvocationContext)_localctx).o.start,((InvocationContext)_localctx).o.stop):null));
								((InvocationContext)_localctx).method =  (((InvocationContext)_localctx).m!=null?_input.getText(((InvocationContext)_localctx).m.start,((InvocationContext)_localctx).m.stop):null);				
								((InvocationContext)_localctx).args =  ((InvocationContext)_localctx).argumentList.argList.toArray();
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				((InvocationContext)_localctx).o = objectLiteral();
				setState(449);
				match(T__41);
				setState(450);
				((InvocationContext)_localctx).m = identifier();
				setState(451);
				match(T__42);

								((InvocationContext)_localctx).obj =  trans.getValue((((InvocationContext)_localctx).o!=null?_input.getText(((InvocationContext)_localctx).o.start,((InvocationContext)_localctx).o.stop):null));
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
		enterRule(_localctx, 64, RULE_argumentList);
		((ArgumentListContext)_localctx).argList =  new ArrayList<Object>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((ArgumentListContext)_localctx).rharg = rharg(0);
			_localctx.argList.add(((ArgumentListContext)_localctx).rharg.obj);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(458);
				match(T__39);
				setState(459);
				((ArgumentListContext)_localctx).rharg = rharg(0);
				_localctx.argList.add(((ArgumentListContext)_localctx).rharg.obj);
				}
				}
				setState(466);
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
		enterRule(_localctx, 66, RULE_amtArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			((AmtArgContext)_localctx).rharg = rharg(0);

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
		enterRule(_localctx, 68, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			((StringArgContext)_localctx).rharg = rharg(0);

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
		enterRule(_localctx, 70, RULE_numberArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((NumberArgContext)_localctx).rharg = rharg(0);

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
		enterRule(_localctx, 72, RULE_dateArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((DateArgContext)_localctx).rharg = rharg(0);

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
		enterRule(_localctx, 74, RULE_debitOrCredit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		public StringLiteralContext stringLiteral;
		public NumericLiteralContext numericLiteral;
		public DoubleLiteralContext doubleLiteral;
		public BooleanLiteralContext booleanLiteral;
		public PercentLiteralContext percentLiteral;
		public DateLiteralContext dateLiteral;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_literal);
		try {
			setState(500);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				((LiteralContext)_localctx).stringLiteral = stringLiteral();
				((LiteralContext)_localctx).obj =  (String) trans.stripQuotes((((LiteralContext)_localctx).stringLiteral!=null?_input.getText(((LiteralContext)_localctx).stringLiteral.start,((LiteralContext)_localctx).stringLiteral.stop):null));
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				((LiteralContext)_localctx).numericLiteral = numericLiteral();

								((LiteralContext)_localctx).obj =  (Long) trans.getLong((((LiteralContext)_localctx).numericLiteral!=null?_input.getText(((LiteralContext)_localctx).numericLiteral.start,((LiteralContext)_localctx).numericLiteral.stop):null));
							
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				((LiteralContext)_localctx).doubleLiteral = doubleLiteral();

								((LiteralContext)_localctx).obj =  (Double) trans.getDouble((((LiteralContext)_localctx).doubleLiteral!=null?_input.getText(((LiteralContext)_localctx).doubleLiteral.start,((LiteralContext)_localctx).doubleLiteral.stop):null));
							
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
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
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				((LiteralContext)_localctx).percentLiteral = percentLiteral();

								String d = (((LiteralContext)_localctx).percentLiteral!=null?_input.getText(((LiteralContext)_localctx).percentLiteral.start,((LiteralContext)_localctx).percentLiteral.stop):null);
								d = d.substring(0, d.length() - 1);
								Double result = trans.getDouble(d);
								result /= 100;
								((LiteralContext)_localctx).obj =  (Double) result;

							
				}
				break;
			case Date:
				enterOuterAlt(_localctx, 6);
				{
				setState(497);
				((LiteralContext)_localctx).dateLiteral = dateLiteral();

									try {
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
										((LiteralContext)_localctx).obj =  (Date) sdf.parse((((LiteralContext)_localctx).dateLiteral!=null?_input.getText(((LiteralContext)_localctx).dateLiteral.start,((LiteralContext)_localctx).dateLiteral.stop):null));
									}catch(ParseException pe){	
										Exception ex = trans.getException("Invalid date format.",_localctx, this);
										_errHandler.reportError(this, (RecognitionException) ex );
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
		enterRule(_localctx, 78, RULE_fileName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__27);
			setState(503);
			((FileNameContext)_localctx).fn = match(Identifier);
			setState(506);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(504);
				match(T__41);
				setState(505);
				((FileNameContext)_localctx).ft = match(Identifier);
				}
			}

			setState(508);
			match(T__29);

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
		enterRule(_localctx, 80, RULE_charLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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
		public TerminalNode Long() { return getToken(FetalParser.Long, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(Long);
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
		public TerminalNode Double() { return getToken(FetalParser.Double, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(Double);
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
		enterRule(_localctx, 86, RULE_percentLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		enterRule(_localctx, 88, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 90, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 92, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 94, RULE_objectLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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
		enterRule(_localctx, 96, RULE_daoLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
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
		case 22:
			return rharg_sempred((RhargContext)_localctx, predIndex);
		case 27:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u0214\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5q\n\5\r\5\16\5r\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u008a\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\5\23\u00ca\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00e5\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u00ec"+
		"\n\30\f\30\16\30\u00ef\13\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u00fd\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0115\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u011c\n\35\f\35\16"+
		"\35\u011f\13\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u015b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01b7\n \3!\3!\3!\3!\3!\5!\u01be"+
		"\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01c9\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u01d1\n\"\f\"\16\"\u01d4\13\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01f7"+
		"\n(\3)\3)\3)\3)\5)\u01fd\n)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\2\4.8\63\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\b\3\2\16"+
		"\23\3\2\24\31\3\2\32\34\3\2\35\"\3\2#%\3\2./\u0216\2d\3\2\2\2\4i\3\2\2"+
		"\2\6l\3\2\2\2\bp\3\2\2\2\n\177\3\2\2\2\f\u0089\3\2\2\2\16\u008b\3\2\2"+
		"\2\20\u00a0\3\2\2\2\22\u00ac\3\2\2\2\24\u00b2\3\2\2\2\26\u00b4\3\2\2\2"+
		"\30\u00b7\3\2\2\2\32\u00ba\3\2\2\2\34\u00bd\3\2\2\2\36\u00c0\3\2\2\2 "+
		"\u00c3\3\2\2\2\"\u00c5\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00cd\3"+
		"\2\2\2*\u00cf\3\2\2\2,\u00d1\3\2\2\2.\u00e4\3\2\2\2\60\u00f0\3\2\2\2\62"+
		"\u00f3\3\2\2\2\64\u00f5\3\2\2\2\66\u0100\3\2\2\28\u0114\3\2\2\2:\u0120"+
		"\3\2\2\2<\u015a\3\2\2\2>\u01b6\3\2\2\2@\u01c8\3\2\2\2B\u01ca\3\2\2\2D"+
		"\u01d5\3\2\2\2F\u01d8\3\2\2\2H\u01db\3\2\2\2J\u01de\3\2\2\2L\u01e1\3\2"+
		"\2\2N\u01f6\3\2\2\2P\u01f8\3\2\2\2R\u0201\3\2\2\2T\u0203\3\2\2\2V\u0205"+
		"\3\2\2\2X\u0207\3\2\2\2Z\u0209\3\2\2\2\\\u020b\3\2\2\2^\u020d\3\2\2\2"+
		"`\u020f\3\2\2\2b\u0211\3\2\2\2de\b\2\1\2ef\5\4\3\2fg\5\b\5\2gh\5\6\4\2"+
		"h\3\3\2\2\2ij\7\3\2\2jk\b\3\1\2k\5\3\2\2\2lm\7\4\2\2mn\b\4\1\2n\7\3\2"+
		"\2\2oq\5\n\6\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\t\3\2\2\2tu\5"+
		"\f\7\2uv\7\5\2\2v\u0080\3\2\2\2wx\5> \2xy\7\5\2\2y\u0080\3\2\2\2z{\5\22"+
		"\n\2{|\7\5\2\2|\u0080\3\2\2\2}\u0080\5\64\33\2~\u0080\7\5\2\2\177t\3\2"+
		"\2\2\177w\3\2\2\2\177z\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\13\3\2"+
		"\2\2\u0081\u0082\5\20\t\2\u0082\u0083\5\16\b\2\u0083\u0084\b\7\1\2\u0084"+
		"\u008a\3\2\2\2\u0085\u0086\5\20\t\2\u0086\u0087\5\22\n\2\u0087\u0088\b"+
		"\7\1\2\u0088\u008a\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0085\3\2\2\2\u008a"+
		"\r\3\2\2\2\u008b\u008c\5\62\32\2\u008c\u008d\b\b\1\2\u008d\17\3\2\2\2"+
		"\u008e\u008f\5\24\13\2\u008f\u0090\b\t\1\2\u0090\u00a1\3\2\2\2\u0091\u0092"+
		"\5\26\f\2\u0092\u0093\b\t\1\2\u0093\u00a1\3\2\2\2\u0094\u0095\5\30\r\2"+
		"\u0095\u0096\b\t\1\2\u0096\u00a1\3\2\2\2\u0097\u0098\5\32\16\2\u0098\u0099"+
		"\b\t\1\2\u0099\u00a1\3\2\2\2\u009a\u009b\5\34\17\2\u009b\u009c\b\t\1\2"+
		"\u009c\u00a1\3\2\2\2\u009d\u009e\5\36\20\2\u009e\u009f\b\t\1\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0091\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0"+
		"\u0097\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\21\3\2\2"+
		"\2\u00a2\u00a3\5\60\31\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5.\30\2\u00a5"+
		"\u00a6\b\n\1\2\u00a6\u00ad\3\2\2\2\u00a7\u00a8\5\60\31\2\u00a8\u00a9\5"+
		"\"\22\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\b\n\1\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a2\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\7\2"+
		"\2\u00af\u00b3\b\13\1\2\u00b0\u00b1\7\b\2\2\u00b1\u00b3\b\13\1\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\7\t\2"+
		"\2\u00b5\u00b6\b\f\1\2\u00b6\27\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9"+
		"\b\r\1\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\b\16\1\2\u00bc"+
		"\33\3\2\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf\b\17\1\2\u00bf\35\3\2\2\2"+
		"\u00c0\u00c1\7\r\2\2\u00c1\u00c2\b\20\1\2\u00c2\37\3\2\2\2\u00c3\u00c4"+
		"\7\6\2\2\u00c4!\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6#\3\2\2\2\u00c7\u00ca"+
		"\5&\24\2\u00c8\u00ca\5(\25\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00cc\t\3\2\2\u00cc\'\3\2\2\2\u00cd\u00ce\t\4\2\2\u00ce"+
		")\3\2\2\2\u00cf\u00d0\t\5\2\2\u00d0+\3\2\2\2\u00d1\u00d2\t\6\2\2\u00d2"+
		"-\3\2\2\2\u00d3\u00d4\b\30\1\2\u00d4\u00d5\7&\2\2\u00d5\u00d6\5.\30\2"+
		"\u00d6\u00d7\5$\23\2\u00d7\u00d8\5.\30\2\u00d8\u00d9\7\'\2\2\u00d9\u00da"+
		"\b\30\1\2\u00da\u00e5\3\2\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\b\30\1"+
		"\2\u00dd\u00e5\3\2\2\2\u00de\u00df\5N(\2\u00df\u00e0\b\30\1\2\u00e0\u00e5"+
		"\3\2\2\2\u00e1\u00e2\5<\37\2\u00e2\u00e3\b\30\1\2\u00e3\u00e5\3\2\2\2"+
		"\u00e4\u00d3\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e1"+
		"\3\2\2\2\u00e5\u00ed\3\2\2\2\u00e6\u00e7\f\7\2\2\u00e7\u00e8\5$\23\2\u00e8"+
		"\u00e9\5.\30\b\u00e9\u00ea\b\30\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3"+
		"\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"/\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\5\16\b\2\u00f1\u00f2\b\31\1"+
		"\2\u00f2\61\3\2\2\2\u00f3\u00f4\7Q\2\2\u00f4\63\3\2\2\2\u00f5\u00f6\7"+
		"I\2\2\u00f6\u00f7\7&\2\2\u00f7\u00f8\58\35\2\u00f8\u00f9\7\'\2\2\u00f9"+
		"\u00fc\5P)\2\u00fa\u00fb\7J\2\2\u00fb\u00fd\5P)\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\33\1\2\u00ff\65"+
		"\3\2\2\2\u0100\u0101\7(\2\2\u0101\u0102\5\b\5\2\u0102\u0103\7)\2\2\u0103"+
		"\67\3\2\2\2\u0104\u0105\b\35\1\2\u0105\u0106\7&\2\2\u0106\u0107\58\35"+
		"\2\u0107\u0108\5,\27\2\u0108\u0109\58\35\2\u0109\u010a\7\'\2\2\u010a\u010b"+
		"\b\35\1\2\u010b\u0115\3\2\2\2\u010c\u010d\5:\36\2\u010d\u010e\b\35\1\2"+
		"\u010e\u0115\3\2\2\2\u010f\u0110\7&\2\2\u0110\u0111\5:\36\2\u0111\u0112"+
		"\7\'\2\2\u0112\u0113\b\35\1\2\u0113\u0115\3\2\2\2\u0114\u0104\3\2\2\2"+
		"\u0114\u010c\3\2\2\2\u0114\u010f\3\2\2\2\u0115\u011d\3\2\2\2\u0116\u0117"+
		"\f\6\2\2\u0117\u0118\5,\27\2\u0118\u0119\58\35\7\u0119\u011a\b\35\1\2"+
		"\u011a\u011c\3\2\2\2\u011b\u0116\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e9\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\5.\30\2\u0121\u0122\5*\26\2\u0122\u0123\5.\30\2\u0123\u0124\b\36"+
		"\1\2\u0124;\3\2\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7&\2\2\u0127\u0128"+
		"\5F$\2\u0128\u0129\7\'\2\2\u0129\u012a\b\37\1\2\u012a\u015b\3\2\2\2\u012b"+
		"\u012c\7\61\2\2\u012c\u012d\7&\2\2\u012d\u012e\5\16\b\2\u012e\u012f\7"+
		"\'\2\2\u012f\u0130\b\37\1\2\u0130\u015b\3\2\2\2\u0131\u0132\7\62\2\2\u0132"+
		"\u015b\b\37\1\2\u0133\u0134\7\63\2\2\u0134\u0135\7&\2\2\u0135\u0136\5"+
		"J&\2\u0136\u0137\7*\2\2\u0137\u0138\5J&\2\u0138\u0139\7\'\2\2\u0139\u013a"+
		"\b\37\1\2\u013a\u015b\3\2\2\2\u013b\u013c\7\64\2\2\u013c\u013d\7&\2\2"+
		"\u013d\u013e\5J&\2\u013e\u013f\7\'\2\2\u013f\u0140\b\37\1\2\u0140\u015b"+
		"\3\2\2\2\u0141\u0142\7:\2\2\u0142\u0143\7&\2\2\u0143\u0144\5F$\2\u0144"+
		"\u0145\7\'\2\2\u0145\u0146\b\37\1\2\u0146\u015b\3\2\2\2\u0147\u0148\7"+
		";\2\2\u0148\u0149\7&\2\2\u0149\u014a\5b\62\2\u014a\u014b\7*\2\2\u014b"+
		"\u014c\5F$\2\u014c\u014d\7\'\2\2\u014d\u014e\b\37\1\2\u014e\u015b\3\2"+
		"\2\2\u014f\u0150\7<\2\2\u0150\u0151\7&\2\2\u0151\u0152\5b\62\2\u0152\u0153"+
		"\7*\2\2\u0153\u0154\5F$\2\u0154\u0155\7\'\2\2\u0155\u0156\b\37\1\2\u0156"+
		"\u015b\3\2\2\2\u0157\u0158\5@!\2\u0158\u0159\b\37\1\2\u0159\u015b\3\2"+
		"\2\2\u015a\u0125\3\2\2\2\u015a\u012b\3\2\2\2\u015a\u0131\3\2\2\2\u015a"+
		"\u0133\3\2\2\2\u015a\u013b\3\2\2\2\u015a\u0141\3\2\2\2\u015a\u0147\3\2"+
		"\2\2\u015a\u014f\3\2\2\2\u015a\u0157\3\2\2\2\u015b=\3\2\2\2\u015c\u015d"+
		"\7K\2\2\u015d\u015e\7&\2\2\u015e\u015f\5.\30\2\u015f\u0160\7\'\2\2\u0160"+
		"\u0161\b \1\2\u0161\u01b7\3\2\2\2\u0162\u0163\7=\2\2\u0163\u0164\7&\2"+
		"\2\u0164\u0165\5D#\2\u0165\u0166\7*\2\2\u0166\u0167\5F$\2\u0167\u0168"+
		"\7\'\2\2\u0168\u0169\b \1\2\u0169\u01b7\3\2\2\2\u016a\u016b\7>\2\2\u016b"+
		"\u016c\7&\2\2\u016c\u016d\5D#\2\u016d\u016e\7*\2\2\u016e\u016f\5F$\2\u016f"+
		"\u0170\7\'\2\2\u0170\u0171\b \1\2\u0171\u01b7\3\2\2\2\u0172\u0173\7?\2"+
		"\2\u0173\u0174\7&\2\2\u0174\u0175\5L\'\2\u0175\u0176\7*\2\2\u0176\u0177"+
		"\5D#\2\u0177\u0178\7*\2\2\u0178\u0179\5F$\2\u0179\u017a\7*\2\2\u017a\u017b"+
		"\5F$\2\u017b\u017c\7\'\2\2\u017c\u017d\b \1\2\u017d\u01b7\3\2\2\2\u017e"+
		"\u017f\7@\2\2\u017f\u0180\7&\2\2\u0180\u0181\5F$\2\u0181\u0182\7*\2\2"+
		"\u0182\u0183\5H%\2\u0183\u0184\7\'\2\2\u0184\u0185\b \1\2\u0185\u01b7"+
		"\3\2\2\2\u0186\u0187\7A\2\2\u0187\u0188\7&\2\2\u0188\u0189\5F$\2\u0189"+
		"\u018a\7*\2\2\u018a\u018b\5H%\2\u018b\u018c\7\'\2\2\u018c\u018d\b \1\2"+
		"\u018d\u01b7\3\2\2\2\u018e\u018f\7C\2\2\u018f\u0190\7&\2\2\u0190\u0191"+
		"\5D#\2\u0191\u0192\7\'\2\2\u0192\u0193\b \1\2\u0193\u01b7\3\2\2\2\u0194"+
		"\u0195\7D\2\2\u0195\u0196\7&\2\2\u0196\u0197\5D#\2\u0197\u0198\7\'\2\2"+
		"\u0198\u0199\b \1\2\u0199\u01b7\3\2\2\2\u019a\u019b\7G\2\2\u019b\u019c"+
		"\7&\2\2\u019c\u019d\5F$\2\u019d\u019e\7*\2\2\u019e\u019f\5H%\2\u019f\u01a0"+
		"\7\'\2\2\u01a0\u01a1\b \1\2\u01a1\u01b7\3\2\2\2\u01a2\u01a3\7E\2\2\u01a3"+
		"\u01b7\b \1\2\u01a4\u01a5\7F\2\2\u01a5\u01b7\b \1\2\u01a6\u01a7\78\2\2"+
		"\u01a7\u01a8\7&\2\2\u01a8\u01a9\5F$\2\u01a9\u01aa\7*\2\2\u01aa\u01ab\5"+
		"F$\2\u01ab\u01ac\7\'\2\2\u01ac\u01ad\b \1\2\u01ad\u01b7\3\2\2\2\u01ae"+
		"\u01af\79\2\2\u01af\u01b0\7+\2\2\u01b0\u01b1\5F$\2\u01b1\u01b2\b \1\2"+
		"\u01b2\u01b7\3\2\2\2\u01b3\u01b4\5@!\2\u01b4\u01b5\b \1\2\u01b5\u01b7"+
		"\3\2\2\2\u01b6\u015c\3\2\2\2\u01b6\u0162\3\2\2\2\u01b6\u016a\3\2\2\2\u01b6"+
		"\u0172\3\2\2\2\u01b6\u017e\3\2\2\2\u01b6\u0186\3\2\2\2\u01b6\u018e\3\2"+
		"\2\2\u01b6\u0194\3\2\2\2\u01b6\u019a\3\2\2\2\u01b6\u01a2\3\2\2\2\u01b6"+
		"\u01a4\3\2\2\2\u01b6\u01a6\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b3\3\2"+
		"\2\2\u01b7?\3\2\2\2\u01b8\u01b9\5`\61\2\u01b9\u01ba\7,\2\2\u01ba\u01bb"+
		"\5\62\32\2\u01bb\u01bd\7&\2\2\u01bc\u01be\5B\"\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\'\2\2\u01c0\u01c1\b!"+
		"\1\2\u01c1\u01c9\3\2\2\2\u01c2\u01c3\5`\61\2\u01c3\u01c4\7,\2\2\u01c4"+
		"\u01c5\5\62\32\2\u01c5\u01c6\7-\2\2\u01c6\u01c7\b!\1\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01b8\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c9A\3\2\2\2\u01ca\u01cb"+
		"\5.\30\2\u01cb\u01d2\b\"\1\2\u01cc\u01cd\7*\2\2\u01cd\u01ce\5.\30\2\u01ce"+
		"\u01cf\b\"\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d1\u01d4\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3C\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d5\u01d6\5.\30\2\u01d6\u01d7\b#\1\2\u01d7E\3\2\2\2\u01d8\u01d9"+
		"\5.\30\2\u01d9\u01da\b$\1\2\u01daG\3\2\2\2\u01db\u01dc\5.\30\2\u01dc\u01dd"+
		"\b%\1\2\u01ddI\3\2\2\2\u01de\u01df\5.\30\2\u01df\u01e0\b&\1\2\u01e0K\3"+
		"\2\2\2\u01e1\u01e2\5R*\2\u01e2\u01e3\b\'\1\2\u01e3M\3\2\2\2\u01e4\u01e5"+
		"\5\\/\2\u01e5\u01e6\b(\1\2\u01e6\u01f7\3\2\2\2\u01e7\u01e8\5T+\2\u01e8"+
		"\u01e9\b(\1\2\u01e9\u01f7\3\2\2\2\u01ea\u01eb\5V,\2\u01eb\u01ec\b(\1\2"+
		"\u01ec\u01f7\3\2\2\2\u01ed\u01ee\5Z.\2\u01ee\u01ef\b(\1\2\u01ef\u01f7"+
		"\3\2\2\2\u01f0\u01f1\5X-\2\u01f1\u01f2\b(\1\2\u01f2\u01f7\3\2\2\2\u01f3"+
		"\u01f4\5^\60\2\u01f4\u01f5\b(\1\2\u01f5\u01f7\3\2\2\2\u01f6\u01e4\3\2"+
		"\2\2\u01f6\u01e7\3\2\2\2\u01f6\u01ea\3\2\2\2\u01f6\u01ed\3\2\2\2\u01f6"+
		"\u01f0\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7O\3\2\2\2\u01f8\u01f9\7\36\2\2"+
		"\u01f9\u01fc\7Q\2\2\u01fa\u01fb\7,\2\2\u01fb\u01fd\7Q\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\7 \2\2\u01ff"+
		"\u0200\b)\1\2\u0200Q\3\2\2\2\u0201\u0202\t\7\2\2\u0202S\3\2\2\2\u0203"+
		"\u0204\7N\2\2\u0204U\3\2\2\2\u0205\u0206\7O\2\2\u0206W\3\2\2\2\u0207\u0208"+
		"\7L\2\2\u0208Y\3\2\2\2\u0209\u020a\7M\2\2\u020a[\3\2\2\2\u020b\u020c\7"+
		"R\2\2\u020c]\3\2\2\2\u020d\u020e\7P\2\2\u020e_\3\2\2\2\u020f\u0210\7Q"+
		"\2\2\u0210a\3\2\2\2\u0211\u0212\7Q\2\2\u0212c\3\2\2\2\25r\177\u0089\u00a0"+
		"\u00ac\u00b2\u00c9\u00e4\u00ed\u00fc\u0114\u011d\u015a\u01b6\u01bd\u01c8"+
		"\u01d2\u01f6\u01fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}