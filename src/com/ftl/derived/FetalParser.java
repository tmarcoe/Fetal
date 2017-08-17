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
		T__38=39, T__39=40, T__40=41, T__41=42, GetAmount=43, GetTax=44, GetDescription=45, 
		GetItemPrice=46, GetItemTax=47, GetItemQty=48, GetTotalItems=49, GetShipCharges=50, 
		GetAddedCharges=51, GetBalance=52, GetLowestItem=53, GetHighestItem=54, 
		GetVariableType=55, CommitReceipt=56, DepleteReceipt=57, Today=58, GetDays=59, 
		DayOfTheWeek=60, GetRate=61, GetBaseCurrency=62, LastRefreshDate=63, Alias=64, 
		MapFile=65, Credit=66, Debit=67, Ledger=68, AddStock=69, DepleteStock=70, 
		SetTax=71, SetShipCharges=72, SetAddedCharges=73, CommitStock=74, IfStatement=75, 
		Else=76, Print=77, Percentage=78, Boolean=79, Long=80, Double=81, Date=82, 
		Identifier=83, String=84, LineAfterPreprocessing=85, ExtendedAscii=86, 
		Whitespace=87, Newline=88, BlockComment=89, LineComment=90;
	public static final int
		RULE_transaction = 0, RULE_begin = 1, RULE_end = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_declaration = 5, RULE_var = 6, RULE_type = 7, 
		RULE_assignment = 8, RULE_arithmetic = 9, RULE_lexical = 10, RULE_logical = 11, 
		RULE_dateType = 12, RULE_assignmentOp = 13, RULE_unaryOP = 14, RULE_expressionOp = 15, 
		RULE_arithExpressOp = 16, RULE_bitwiseExpressOp = 17, RULE_comparisonOp = 18, 
		RULE_logicExpressOp = 19, RULE_rharg = 20, RULE_lharg = 21, RULE_identifier = 22, 
		RULE_evaluation = 23, RULE_block = 24, RULE_evalExpression = 25, RULE_eval = 26, 
		RULE_assignmentCommands = 27, RULE_command = 28, RULE_amtArg = 29, RULE_stringArg = 30, 
		RULE_numberArg = 31, RULE_dateArg = 32, RULE_debitOrCredit = 33, RULE_literal = 34, 
		RULE_fileName = 35, RULE_charLiteral = 36, RULE_numericLiteral = 37, RULE_doubleLiteral = 38, 
		RULE_percentLiteral = 39, RULE_booleanLiteral = 40, RULE_stringLiteral = 41, 
		RULE_dateLiteral = 42;
	public static final String[] ruleNames = {
		"transaction", "begin", "end", "statements", "statement", "declaration", 
		"var", "type", "assignment", "arithmetic", "lexical", "logical", "dateType", 
		"assignmentOp", "unaryOP", "expressionOp", "arithExpressOp", "bitwiseExpressOp", 
		"comparisonOp", "logicExpressOp", "rharg", "lharg", "identifier", "evaluation", 
		"block", "evalExpression", "eval", "assignmentCommands", "command", "amtArg", 
		"stringArg", "numberArg", "dateArg", "debitOrCredit", "literal", "fileName", 
		"charLiteral", "numericLiteral", "doubleLiteral", "percentLiteral", "booleanLiteral", 
		"stringLiteral", "dateLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "';'", "'='", "'double'", "'long'", "'string'", 
		"'boolean'", "'date'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
		"'*'", "'/'", "'+'", "'-'", "'%'", "'^'", "'&'", "'|'", "'!'", "'=='", 
		"'<'", "'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'^^'", "'('", "')'", 
		"'{'", "'}'", "','", "':'", "'.'", "'D'", "'C'", "'getAmount'", "'getTax'", 
		"'getDescription'", "'getItemPrice'", "'getItemTax'", "'getItemQty'", 
		"'getTotalItems'", "'getShipCharges'", "'getAddedCharges'", "'getBalance'", 
		"'getLowestItem'", "'getHighestItem'", "'getVariableType'", "'commitReceipt'", 
		"'depleteReceipt'", "'today'", "'getDays'", "'dayOfTheWeek'", "'getRate'", 
		"'getBaseCurrency'", "'lastRefreshDate'", "'alias'", "'mapFile'", "'credit'", 
		"'debit'", "'ledger'", "'addStock'", "'depleteStock'", "'setTax'", "'setShipCharges'", 
		"'setAddedCharges'", "'commitStock'", "'if'", "'else'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "GetAmount", "GetTax", "GetDescription", 
		"GetItemPrice", "GetItemTax", "GetItemQty", "GetTotalItems", "GetShipCharges", 
		"GetAddedCharges", "GetBalance", "GetLowestItem", "GetHighestItem", "GetVariableType", 
		"CommitReceipt", "DepleteReceipt", "Today", "GetDays", "DayOfTheWeek", 
		"GetRate", "GetBaseCurrency", "LastRefreshDate", "Alias", "MapFile", "Credit", 
		"Debit", "Ledger", "AddStock", "DepleteStock", "SetTax", "SetShipCharges", 
		"SetAddedCharges", "CommitStock", "IfStatement", "Else", "Print", "Percentage", 
		"Boolean", "Long", "Double", "Date", "Identifier", "String", "LineAfterPreprocessing", 
		"ExtendedAscii", "Whitespace", "Newline", "BlockComment", "LineComment"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitTransaction(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitBegin(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitEnd(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << CommitReceipt) | (1L << DepleteReceipt))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Alias - 64)) | (1L << (MapFile - 64)) | (1L << (Credit - 64)) | (1L << (Debit - 64)) | (1L << (Ledger - 64)) | (1L << (AddStock - 64)) | (1L << (DepleteStock - 64)) | (1L << (SetShipCharges - 64)) | (1L << (SetAddedCharges - 64)) | (1L << (CommitStock - 64)) | (1L << (IfStatement - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				declaration();
				setState(103);
				match(T__2);
				}
				break;
			case CommitReceipt:
			case DepleteReceipt:
			case Alias:
			case MapFile:
			case Credit:
			case Debit:
			case Ledger:
			case AddStock:
			case DepleteStock:
			case SetShipCharges:
			case SetAddedCharges:
			case CommitStock:
			case Print:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				command();
				setState(106);
				match(T__2);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				assignment();
				setState(109);
				match(T__2);
				}
				break;
			case IfStatement:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				evaluation();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(T__2);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitDeclaration(this);
		}
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
				trans.addVariable(((DeclarationContext)_localctx).var.name, ((DeclarationContext)_localctx).type.varType); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((DeclarationContext)_localctx).type = type();
				setState(120);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitVar(this);
		}
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
		public ArithmeticContext arithmetic;
		public LexicalContext lexical;
		public LogicalContext logical;
		public DateTypeContext dateType;
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((TypeContext)_localctx).arithmetic = arithmetic();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).arithmetic.varType;
							
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((TypeContext)_localctx).lexical = lexical();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).lexical.varType;
							
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((TypeContext)_localctx).logical = logical();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).logical.varType;
							
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				((TypeContext)_localctx).dateType = dateType();

								((TypeContext)_localctx).varType =  ((TypeContext)_localctx).dateType.varType;
							
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(143);
				match(T__3);
				setState(144);
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
				setState(147);
				((AssignmentContext)_localctx).lharg = lharg();
				setState(148);
				((AssignmentContext)_localctx).unaryOP = unaryOP();
				setState(149);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmetic);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__4);

								((ArithmeticContext)_localctx).varType =  VariableType.DOUBLE;
							
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterLexical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitLexical(this);
		}
	}

	public final LexicalContext lexical() throws RecognitionException {
		LexicalContext _localctx = new LexicalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lexical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitLogical(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitDateType(this);
		}
	}

	public final DateTypeContext dateType() throws RecognitionException {
		DateTypeContext _localctx = new DateTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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

	public static class AssignmentOpContext extends ParserRuleContext {
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitAssignmentOp(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterUnaryOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitUnaryOP(this);
		}
	}

	public final UnaryOPContext unaryOP() throws RecognitionException {
		UnaryOPContext _localctx = new UnaryOPContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterExpressionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitExpressionOp(this);
		}
	}

	public final ExpressionOpContext expressionOp() throws RecognitionException {
		ExpressionOpContext _localctx = new ExpressionOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionOp);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				arithExpressOp();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterArithExpressOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitArithExpressOp(this);
		}
	}

	public final ArithExpressOpContext arithExpressOp() throws RecognitionException {
		ArithExpressOpContext _localctx = new ArithExpressOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arithExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterBitwiseExpressOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitBitwiseExpressOp(this);
		}
	}

	public final BitwiseExpressOpContext bitwiseExpressOp() throws RecognitionException {
		BitwiseExpressOpContext _localctx = new BitwiseExpressOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bitwiseExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitComparisonOp(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterLogicExpressOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitLogicExpressOp(this);
		}
	}

	public final LogicExpressOpContext logicExpressOp() throws RecognitionException {
		LogicExpressOpContext _localctx = new LogicExpressOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicExpressOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterRharg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitRharg(this);
		}
	}

	public final RhargContext rharg() throws RecognitionException {
		return rharg(0);
	}

	private RhargContext rharg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RhargContext _localctx = new RhargContext(_ctx, _parentState);
		RhargContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_rharg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(186);
				match(T__33);
				setState(187);
				((RhargContext)_localctx).lh = rharg(0);
				setState(188);
				((RhargContext)_localctx).expressionOp = expressionOp();
				setState(189);
				((RhargContext)_localctx).rh = rharg(0);
				setState(190);
				match(T__34);

								if (trans.isMatched(((RhargContext)_localctx).lh.obj, ((RhargContext)_localctx).rh.obj) == false) {
									
									NoViableAltException ex = trans.getException("'" + (((RhargContext)_localctx).lh!=null?_input.getText(((RhargContext)_localctx).lh.start,((RhargContext)_localctx).lh.stop):null) + "' and ''" + (((RhargContext)_localctx).rh!=null?_input.getText(((RhargContext)_localctx).rh.start,((RhargContext)_localctx).rh.stop):null) + "' are different types.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}else{
									((RhargContext)_localctx).obj =  om.getExpression(((RhargContext)_localctx).lh.obj, (((RhargContext)_localctx).expressionOp!=null?_input.getText(((RhargContext)_localctx).expressionOp.start,((RhargContext)_localctx).expressionOp.stop):null), ((RhargContext)_localctx).rh.obj);
								}
							
				}
				break;
			case Identifier:
				{
				setState(193);
				((RhargContext)_localctx).var = var();

								
								((RhargContext)_localctx).obj =  trans.getValue(((RhargContext)_localctx).var.name);
								if (_localctx.obj == null) {
									NoViableAltException ex = trans.getException("'" + ((RhargContext)_localctx).var.name + "' is not defined.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
									
								}
							
				}
				break;
			case Percentage:
			case Boolean:
			case Long:
			case Double:
			case Date:
			case String:
				{
				setState(196);
				((RhargContext)_localctx).literal = literal();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).literal.obj;
								if (_localctx.obj == null) {
									NoViableAltException ex = trans.getException("'" + (((RhargContext)_localctx).literal!=null?_input.getText(((RhargContext)_localctx).literal.start,((RhargContext)_localctx).literal.stop):null) + "' is malformed.",_localctx,this);
									_errHandler.reportError(this, (RecognitionException) ex );
								}
							
				}
				break;
			case GetAmount:
			case GetTax:
			case GetDescription:
			case GetItemPrice:
			case GetItemTax:
			case GetItemQty:
			case GetTotalItems:
			case GetShipCharges:
			case GetAddedCharges:
			case GetBalance:
			case GetLowestItem:
			case GetHighestItem:
			case GetVariableType:
			case Today:
			case GetDays:
			case DayOfTheWeek:
			case GetRate:
			case GetBaseCurrency:
			case LastRefreshDate:
				{
				setState(199);
				((RhargContext)_localctx).assignmentCommands = assignmentCommands();

								((RhargContext)_localctx).obj =  ((RhargContext)_localctx).assignmentCommands.obj;
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
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
					setState(204);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(205);
					((RhargContext)_localctx).expressionOp = expressionOp();
					setState(206);
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
				setState(213);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterLharg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitLharg(this);
		}
	}

	public final LhargContext lharg() throws RecognitionException {
		LhargContext _localctx = new LhargContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lharg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterEvaluation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitEvaluation(this);
		}
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_evaluation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IfStatement);
			setState(220);
			match(T__33);
			setState(221);
			((EvaluationContext)_localctx).evalExpression = evalExpression(0);
			setState(222);
			match(T__34);
			setState(223);
			((EvaluationContext)_localctx).rfn = fileName();
			setState(226);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(224);
				match(Else);
				setState(225);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block(FetalTransaction t) throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState(), t);
		enterRule(_localctx, 48, RULE_block);

			trans = t;
			om = new ObjectMath();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__35);
			setState(231);
			statements();
			setState(232);
			match(T__36);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterEvalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitEvalExpression(this);
		}
	}

	public final EvalExpressionContext evalExpression() throws RecognitionException {
		return evalExpression(0);
	}

	private EvalExpressionContext evalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EvalExpressionContext _localctx = new EvalExpressionContext(_ctx, _parentState);
		EvalExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_evalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(235);
				match(T__33);
				setState(236);
				((EvalExpressionContext)_localctx).lh = evalExpression(0);
				setState(237);
				((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
				setState(238);
				((EvalExpressionContext)_localctx).rh = evalExpression(0);
				setState(239);
				match(T__34);

									((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
								
				}
				break;
			case 2:
				{
				setState(242);
				((EvalExpressionContext)_localctx).eval = eval();

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;
								
				}
				break;
			case 3:
				{
				setState(245);
				match(T__33);
				setState(246);
				((EvalExpressionContext)_localctx).eval = eval();
				setState(247);
				match(T__34);

									((EvalExpressionContext)_localctx).result =  ((EvalExpressionContext)_localctx).eval.result;					
								
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
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
					setState(252);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(253);
					((EvalExpressionContext)_localctx).logicExpressOp = logicExpressOp();
					setState(254);
					((EvalExpressionContext)_localctx).rh = evalExpression(5);

					          					((EvalExpressionContext)_localctx).result =  om.evaluateLogic(((EvalExpressionContext)_localctx).lh.result, (((EvalExpressionContext)_localctx).logicExpressOp!=null?_input.getText(((EvalExpressionContext)_localctx).logicExpressOp.start,((EvalExpressionContext)_localctx).logicExpressOp.stop):null), ((EvalExpressionContext)_localctx).rh.result);
					          				
					}
					} 
				}
				setState(261);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((EvalContext)_localctx).lh = rharg(0);
			setState(263);
			((EvalContext)_localctx).comparisonOp = comparisonOp();
			setState(264);
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
		public TerminalNode GetAmount() { return getToken(FetalParser.GetAmount, 0); }
		public TerminalNode GetTax() { return getToken(FetalParser.GetTax, 0); }
		public TerminalNode GetDescription() { return getToken(FetalParser.GetDescription, 0); }
		public TerminalNode GetItemPrice() { return getToken(FetalParser.GetItemPrice, 0); }
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public TerminalNode GetItemTax() { return getToken(FetalParser.GetItemTax, 0); }
		public TerminalNode GetItemQty() { return getToken(FetalParser.GetItemQty, 0); }
		public TerminalNode GetTotalItems() { return getToken(FetalParser.GetTotalItems, 0); }
		public TerminalNode GetShipCharges() { return getToken(FetalParser.GetShipCharges, 0); }
		public TerminalNode GetAddedCharges() { return getToken(FetalParser.GetAddedCharges, 0); }
		public TerminalNode GetBalance() { return getToken(FetalParser.GetBalance, 0); }
		public TerminalNode GetLowestItem() { return getToken(FetalParser.GetLowestItem, 0); }
		public TerminalNode GetHighestItem() { return getToken(FetalParser.GetHighestItem, 0); }
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
		public TerminalNode GetRate() { return getToken(FetalParser.GetRate, 0); }
		public TerminalNode GetBaseCurrency() { return getToken(FetalParser.GetBaseCurrency, 0); }
		public TerminalNode LastRefreshDate() { return getToken(FetalParser.LastRefreshDate, 0); }
		public AssignmentCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterAssignmentCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitAssignmentCommands(this);
		}
	}

	public final AssignmentCommandsContext assignmentCommands() throws RecognitionException {
		AssignmentCommandsContext _localctx = new AssignmentCommandsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentCommands);
		try {
			setState(339);
			switch (_input.LA(1)) {
			case GetAmount:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(GetAmount);

								((AssignmentCommandsContext)_localctx).obj =  trans.getAmount();
							
				}
				break;
			case GetTax:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(GetTax);

								((AssignmentCommandsContext)_localctx).obj =  trans.getTax();
							
				}
				break;
			case GetDescription:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(GetDescription);

								((AssignmentCommandsContext)_localctx).obj =  trans.getDescription();
							
				}
				break;
			case GetItemPrice:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(GetItemPrice);
				setState(274);
				match(T__33);
				setState(275);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(276);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  trans.getItemPrice(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetItemTax:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				match(GetItemTax);
				setState(280);
				match(T__33);
				setState(281);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(282);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  trans.getItemTax(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetItemQty:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(GetItemQty);
				setState(286);
				match(T__33);
				setState(287);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(288);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  trans.getItemQty(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetTotalItems:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(GetTotalItems);

								((AssignmentCommandsContext)_localctx).obj =  trans.getTotalItems();
							
				}
				break;
			case GetShipCharges:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(GetShipCharges);

								((AssignmentCommandsContext)_localctx).obj =  trans.getShipCharges();
							
				}
				break;
			case GetAddedCharges:
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				match(GetAddedCharges);

								((AssignmentCommandsContext)_localctx).obj =  trans.getAddedCharges();
							
				}
				break;
			case GetBalance:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				match(GetBalance);
				setState(298);
				match(T__33);
				setState(299);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(300);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  trans.getBalance(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetLowestItem:
				enterOuterAlt(_localctx, 11);
				{
				setState(303);
				match(GetLowestItem);

								((AssignmentCommandsContext)_localctx).obj =  trans.getLowestItem();
							
				}
				break;
			case GetHighestItem:
				enterOuterAlt(_localctx, 12);
				{
				setState(305);
				match(GetHighestItem);

								((AssignmentCommandsContext)_localctx).obj =  trans.getHighestItem();
							
				}
				break;
			case GetVariableType:
				enterOuterAlt(_localctx, 13);
				{
				setState(307);
				match(GetVariableType);
				setState(308);
				match(T__33);
				setState(309);
				((AssignmentCommandsContext)_localctx).var = var();
				setState(310);
				match(T__34);

								
								if (trans.isVariable(((AssignmentCommandsContext)_localctx).var.name) == false) {
									Exception ex = trans.getException("'" + ((AssignmentCommandsContext)_localctx).var.name  + "' has not been declared",_localctx, this);
									_errHandler.reportError(this, (RecognitionException) ex );
									
								}else{
									((AssignmentCommandsContext)_localctx).obj =  trans.getVariableType(((AssignmentCommandsContext)_localctx).var.name);
								}
							
				}
				break;
			case Today:
				enterOuterAlt(_localctx, 14);
				{
				setState(313);
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
				enterOuterAlt(_localctx, 15);
				{
				setState(315);
				match(GetDays);
				setState(316);
				match(T__33);
				setState(317);
				((AssignmentCommandsContext)_localctx).startPeriod = dateArg();
				setState(318);
				match(T__37);
				setState(319);
				((AssignmentCommandsContext)_localctx).endPeriod = dateArg();
				setState(320);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  (Double) trans.getDays(((AssignmentCommandsContext)_localctx).startPeriod.date, ((AssignmentCommandsContext)_localctx).endPeriod.date );
							
				}
				break;
			case DayOfTheWeek:
				enterOuterAlt(_localctx, 16);
				{
				setState(323);
				match(DayOfTheWeek);
				setState(324);
				match(T__33);
				setState(325);
				((AssignmentCommandsContext)_localctx).dateArg = dateArg();
				setState(326);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  om.dayOfTheWeek(((AssignmentCommandsContext)_localctx).dateArg.date);
							
				}
				break;
			case GetRate:
				enterOuterAlt(_localctx, 17);
				{
				setState(329);
				match(GetRate);
				setState(330);
				match(T__33);
				setState(331);
				((AssignmentCommandsContext)_localctx).stringArg = stringArg();
				setState(332);
				match(T__34);

								((AssignmentCommandsContext)_localctx).obj =  trans.getRate(((AssignmentCommandsContext)_localctx).stringArg.string);
							
				}
				break;
			case GetBaseCurrency:
				enterOuterAlt(_localctx, 18);
				{
				setState(335);
				match(GetBaseCurrency);

								((AssignmentCommandsContext)_localctx).obj =  trans.getBaseCurrency();
							
				}
				break;
			case LastRefreshDate:
				enterOuterAlt(_localctx, 19);
				{
				setState(337);
				match(LastRefreshDate);

								((AssignmentCommandsContext)_localctx).obj =  trans.lastRefreshDate();
							
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_command);
		try {
			setState(428);
			switch (_input.LA(1)) {
			case Print:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(Print);
				setState(342);
				match(T__33);
				setState(343);
				((CommandContext)_localctx).rharg = rharg(0);
				setState(344);
				match(T__34);

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
				setState(347);
				match(Credit);
				setState(348);
				match(T__33);
				setState(349);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(350);
				match(T__37);
				setState(351);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(352);
				match(T__34);

								trans.credit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Debit:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(Debit);
				setState(356);
				match(T__33);
				setState(357);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(358);
				match(T__37);
				setState(359);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(360);
				match(T__34);

								trans.debit(((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).stringArg.string);
							
				}
				break;
			case Ledger:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(Ledger);
				setState(364);
				match(T__33);
				setState(365);
				((CommandContext)_localctx).debitOrCredit = debitOrCredit();
				setState(366);
				match(T__37);
				setState(367);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(368);
				match(T__37);
				setState(369);
				((CommandContext)_localctx).acc = stringArg();
				setState(370);
				match(T__37);
				setState(371);
				((CommandContext)_localctx).desc = stringArg();
				setState(372);
				match(T__34);

								trans.ledger(((CommandContext)_localctx).debitOrCredit.c, ((CommandContext)_localctx).amtArg.amt, ((CommandContext)_localctx).acc.string, ((CommandContext)_localctx).desc.string );
							
				}
				break;
			case AddStock:
				enterOuterAlt(_localctx, 5);
				{
				setState(375);
				match(AddStock);
				setState(376);
				match(T__33);
				setState(377);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(378);
				match(T__37);
				setState(379);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(380);
				match(T__34);

								trans.addStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			case DepleteStock:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				match(DepleteStock);
				setState(384);
				match(T__33);
				setState(385);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(386);
				match(T__37);
				setState(387);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(388);
				match(T__34);

								trans.depleteStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			case SetShipCharges:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				match(SetShipCharges);
				setState(392);
				match(T__33);
				setState(393);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(394);
				match(T__34);

								trans.setShipCharges(((CommandContext)_localctx).amtArg.amt);
							
				}
				break;
			case SetAddedCharges:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				match(SetAddedCharges);
				setState(398);
				match(T__33);
				setState(399);
				((CommandContext)_localctx).amtArg = amtArg();
				setState(400);
				match(T__34);

								trans.setAddedCharges(((CommandContext)_localctx).amtArg.amt);
							
				}
				break;
			case CommitStock:
				enterOuterAlt(_localctx, 9);
				{
				setState(403);
				match(CommitStock);
				setState(404);
				match(T__33);
				setState(405);
				((CommandContext)_localctx).stringArg = stringArg();
				setState(406);
				match(T__37);
				setState(407);
				((CommandContext)_localctx).numberArg = numberArg();
				setState(408);
				match(T__34);

								trans.commitStock(((CommandContext)_localctx).stringArg.string, ((CommandContext)_localctx).numberArg.num);
							
				}
				break;
			case CommitReceipt:
				enterOuterAlt(_localctx, 10);
				{
				setState(411);
				match(CommitReceipt);

								trans.commitReceipt();
							
				}
				break;
			case DepleteReceipt:
				enterOuterAlt(_localctx, 11);
				{
				setState(413);
				match(DepleteReceipt);

								trans.depleteReceipt();
							
				}
				break;
			case Alias:
				enterOuterAlt(_localctx, 12);
				{
				setState(415);
				match(Alias);
				setState(416);
				match(T__33);
				setState(417);
				((CommandContext)_localctx).account = stringArg();
				setState(418);
				match(T__37);
				setState(419);
				((CommandContext)_localctx).name = stringArg();
				setState(420);
				match(T__34);

								trans.putMap(((CommandContext)_localctx).account.string, ((CommandContext)_localctx).name.string);
							
				}
				break;
			case MapFile:
				enterOuterAlt(_localctx, 13);
				{
				setState(423);
				match(MapFile);
				setState(424);
				match(T__38);
				setState(425);
				((CommandContext)_localctx).stringArg = stringArg();

								trans.mapFile(((CommandContext)_localctx).stringArg.string);
							
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterAmtArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitAmtArg(this);
		}
	}

	public final AmtArgContext amtArg() throws RecognitionException {
		AmtArgContext _localctx = new AmtArgContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_amtArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitStringArg(this);
		}
	}

	public final StringArgContext stringArg() throws RecognitionException {
		StringArgContext _localctx = new StringArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterNumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitNumberArg(this);
		}
	}

	public final NumberArgContext numberArg() throws RecognitionException {
		NumberArgContext _localctx = new NumberArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numberArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterDateArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitDateArg(this);
		}
	}

	public final DateArgContext dateArg() throws RecognitionException {
		DateArgContext _localctx = new DateArgContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dateArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterDebitOrCredit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitDebitOrCredit(this);
		}
	}

	public final DebitOrCreditContext debitOrCredit() throws RecognitionException {
		DebitOrCreditContext _localctx = new DebitOrCreditContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_debitOrCredit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(463);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				((LiteralContext)_localctx).stringLiteral = stringLiteral();
				((LiteralContext)_localctx).obj =  (String) trans.stripQuotes((((LiteralContext)_localctx).stringLiteral!=null?_input.getText(((LiteralContext)_localctx).stringLiteral.start,((LiteralContext)_localctx).stringLiteral.stop):null));
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				((LiteralContext)_localctx).numericLiteral = numericLiteral();

								((LiteralContext)_localctx).obj =  (Long) trans.getLong((((LiteralContext)_localctx).numericLiteral!=null?_input.getText(((LiteralContext)_localctx).numericLiteral.start,((LiteralContext)_localctx).numericLiteral.stop):null));
							
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				((LiteralContext)_localctx).doubleLiteral = doubleLiteral();

								((LiteralContext)_localctx).obj =  (Double) trans.getDouble((((LiteralContext)_localctx).doubleLiteral!=null?_input.getText(((LiteralContext)_localctx).doubleLiteral.start,((LiteralContext)_localctx).doubleLiteral.stop):null));
							
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
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
				setState(457);
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
				setState(460);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fileName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__25);
			setState(466);
			((FileNameContext)_localctx).fn = match(Identifier);
			setState(469);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(467);
				match(T__39);
				setState(468);
				((FileNameContext)_localctx).ft = match(Identifier);
				}
			}

			setState(471);
			match(T__27);

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitCharLiteral(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_charLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitDoubleLiteral(this);
		}
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterPercentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitPercentLiteral(this);
		}
	}

	public final PercentLiteralContext percentLiteral() throws RecognitionException {
		PercentLiteralContext _localctx = new PercentLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_percentLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FetalListener ) ((FetalListener)listener).exitDateLiteral(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return rharg_sempred((RhargContext)_localctx, predIndex);
		case 25:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\\\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5e\n\5\r\5\16\5"+
		"f\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u009b\n\n\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00b2\n\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cd\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00d4\n\26\f\26\16\26\u00d7\13\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e5\n\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fd\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0104\n\33\f\33\16\33\u0107\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0156\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01af\n\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01d2\n$\3%\3%\3%\3%\5%\u01d8\n%\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\2\4*\64-\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\b\3\2"+
		"\f\21\3\2\22\27\3\2\30\32\3\2\33 \3\2!#\3\2+,\u01f7\2X\3\2\2\2\4]\3\2"+
		"\2\2\6`\3\2\2\2\bd\3\2\2\2\ns\3\2\2\2\f}\3\2\2\2\16\177\3\2\2\2\20\u008e"+
		"\3\2\2\2\22\u009a\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00a5\3"+
		"\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2\2\2\36\u00ad\3\2\2\2 \u00b1\3\2\2"+
		"\2\"\u00b3\3\2\2\2$\u00b5\3\2\2\2&\u00b7\3\2\2\2(\u00b9\3\2\2\2*\u00cc"+
		"\3\2\2\2,\u00d8\3\2\2\2.\u00db\3\2\2\2\60\u00dd\3\2\2\2\62\u00e8\3\2\2"+
		"\2\64\u00fc\3\2\2\2\66\u0108\3\2\2\28\u0155\3\2\2\2:\u01ae\3\2\2\2<\u01b0"+
		"\3\2\2\2>\u01b3\3\2\2\2@\u01b6\3\2\2\2B\u01b9\3\2\2\2D\u01bc\3\2\2\2F"+
		"\u01d1\3\2\2\2H\u01d3\3\2\2\2J\u01dc\3\2\2\2L\u01de\3\2\2\2N\u01e0\3\2"+
		"\2\2P\u01e2\3\2\2\2R\u01e4\3\2\2\2T\u01e6\3\2\2\2V\u01e8\3\2\2\2XY\b\2"+
		"\1\2YZ\5\4\3\2Z[\5\b\5\2[\\\5\6\4\2\\\3\3\2\2\2]^\7\3\2\2^_\b\3\1\2_\5"+
		"\3\2\2\2`a\7\4\2\2ab\b\4\1\2b\7\3\2\2\2ce\5\n\6\2dc\3\2\2\2ef\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2g\t\3\2\2\2hi\5\f\7\2ij\7\5\2\2jt\3\2\2\2kl\5:\36"+
		"\2lm\7\5\2\2mt\3\2\2\2no\5\22\n\2op\7\5\2\2pt\3\2\2\2qt\5\60\31\2rt\7"+
		"\5\2\2sh\3\2\2\2sk\3\2\2\2sn\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\13\3\2\2\2u"+
		"v\5\20\t\2vw\5\16\b\2wx\b\7\1\2x~\3\2\2\2yz\5\20\t\2z{\5\22\n\2{|\b\7"+
		"\1\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\r\3\2\2\2\177\u0080\5.\30\2\u0080"+
		"\u0081\b\b\1\2\u0081\17\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\b\t"+
		"\1\2\u0084\u008f\3\2\2\2\u0085\u0086\5\26\f\2\u0086\u0087\b\t\1\2\u0087"+
		"\u008f\3\2\2\2\u0088\u0089\5\30\r\2\u0089\u008a\b\t\1\2\u008a\u008f\3"+
		"\2\2\2\u008b\u008c\5\32\16\2\u008c\u008d\b\t\1\2\u008d\u008f\3\2\2\2\u008e"+
		"\u0082\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b\3\2"+
		"\2\2\u008f\21\3\2\2\2\u0090\u0091\5,\27\2\u0091\u0092\7\6\2\2\u0092\u0093"+
		"\5*\26\2\u0093\u0094\b\n\1\2\u0094\u009b\3\2\2\2\u0095\u0096\5,\27\2\u0096"+
		"\u0097\5\36\20\2\u0097\u0098\5*\26\2\u0098\u0099\b\n\1\2\u0099\u009b\3"+
		"\2\2\2\u009a\u0090\3\2\2\2\u009a\u0095\3\2\2\2\u009b\23\3\2\2\2\u009c"+
		"\u009d\7\7\2\2\u009d\u00a1\b\13\1\2\u009e\u009f\7\b\2\2\u009f\u00a1\b"+
		"\13\1\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\25\3\2\2\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00a4\b\f\1\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\n\2"+
		"\2\u00a6\u00a7\b\r\1\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa"+
		"\b\16\1\2\u00aa\33\3\2\2\2\u00ab\u00ac\7\6\2\2\u00ac\35\3\2\2\2\u00ad"+
		"\u00ae\t\2\2\2\u00ae\37\3\2\2\2\u00af\u00b2\5\"\22\2\u00b0\u00b2\5$\23"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2!\3\2\2\2\u00b3\u00b4"+
		"\t\3\2\2\u00b4#\3\2\2\2\u00b5\u00b6\t\4\2\2\u00b6%\3\2\2\2\u00b7\u00b8"+
		"\t\5\2\2\u00b8\'\3\2\2\2\u00b9\u00ba\t\6\2\2\u00ba)\3\2\2\2\u00bb\u00bc"+
		"\b\26\1\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\5 \21\2\u00bf"+
		"\u00c0\5*\26\2\u00c0\u00c1\7%\2\2\u00c1\u00c2\b\26\1\2\u00c2\u00cd\3\2"+
		"\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\b\26\1\2\u00c5\u00cd\3\2\2\2\u00c6"+
		"\u00c7\5F$\2\u00c7\u00c8\b\26\1\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\58\35"+
		"\2\u00ca\u00cb\b\26\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc"+
		"\u00c3\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d5\3\2"+
		"\2\2\u00ce\u00cf\f\7\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\5*\26\b\u00d1"+
		"\u00d2\b\26\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6+\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\5\16\b\2\u00d9\u00da\b\27\1\2\u00da-\3\2\2\2\u00db"+
		"\u00dc\7U\2\2\u00dc/\3\2\2\2\u00dd\u00de\7M\2\2\u00de\u00df\7$\2\2\u00df"+
		"\u00e0\5\64\33\2\u00e0\u00e1\7%\2\2\u00e1\u00e4\5H%\2\u00e2\u00e3\7N\2"+
		"\2\u00e3\u00e5\5H%\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\b\31\1\2\u00e7\61\3\2\2\2\u00e8\u00e9\7&\2\2\u00e9"+
		"\u00ea\5\b\5\2\u00ea\u00eb\7\'\2\2\u00eb\63\3\2\2\2\u00ec\u00ed\b\33\1"+
		"\2\u00ed\u00ee\7$\2\2\u00ee\u00ef\5\64\33\2\u00ef\u00f0\5(\25\2\u00f0"+
		"\u00f1\5\64\33\2\u00f1\u00f2\7%\2\2\u00f2\u00f3\b\33\1\2\u00f3\u00fd\3"+
		"\2\2\2\u00f4\u00f5\5\66\34\2\u00f5\u00f6\b\33\1\2\u00f6\u00fd\3\2\2\2"+
		"\u00f7\u00f8\7$\2\2\u00f8\u00f9\5\66\34\2\u00f9\u00fa\7%\2\2\u00fa\u00fb"+
		"\b\33\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00ec\3\2\2\2\u00fc\u00f4\3\2\2\2"+
		"\u00fc\u00f7\3\2\2\2\u00fd\u0105\3\2\2\2\u00fe\u00ff\f\6\2\2\u00ff\u0100"+
		"\5(\25\2\u0100\u0101\5\64\33\7\u0101\u0102\b\33\1\2\u0102\u0104\3\2\2"+
		"\2\u0103\u00fe\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\65\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5*\26\2\u0109"+
		"\u010a\5&\24\2\u010a\u010b\5*\26\2\u010b\u010c\b\34\1\2\u010c\67\3\2\2"+
		"\2\u010d\u010e\7-\2\2\u010e\u0156\b\35\1\2\u010f\u0110\7.\2\2\u0110\u0156"+
		"\b\35\1\2\u0111\u0112\7/\2\2\u0112\u0156\b\35\1\2\u0113\u0114\7\60\2\2"+
		"\u0114\u0115\7$\2\2\u0115\u0116\5> \2\u0116\u0117\7%\2\2\u0117\u0118\b"+
		"\35\1\2\u0118\u0156\3\2\2\2\u0119\u011a\7\61\2\2\u011a\u011b\7$\2\2\u011b"+
		"\u011c\5> \2\u011c\u011d\7%\2\2\u011d\u011e\b\35\1\2\u011e\u0156\3\2\2"+
		"\2\u011f\u0120\7\62\2\2\u0120\u0121\7$\2\2\u0121\u0122\5> \2\u0122\u0123"+
		"\7%\2\2\u0123\u0124\b\35\1\2\u0124\u0156\3\2\2\2\u0125\u0126\7\63\2\2"+
		"\u0126\u0156\b\35\1\2\u0127\u0128\7\64\2\2\u0128\u0156\b\35\1\2\u0129"+
		"\u012a\7\65\2\2\u012a\u0156\b\35\1\2\u012b\u012c\7\66\2\2\u012c\u012d"+
		"\7$\2\2\u012d\u012e\5> \2\u012e\u012f\7%\2\2\u012f\u0130\b\35\1\2\u0130"+
		"\u0156\3\2\2\2\u0131\u0132\7\67\2\2\u0132\u0156\b\35\1\2\u0133\u0134\7"+
		"8\2\2\u0134\u0156\b\35\1\2\u0135\u0136\79\2\2\u0136\u0137\7$\2\2\u0137"+
		"\u0138\5\16\b\2\u0138\u0139\7%\2\2\u0139\u013a\b\35\1\2\u013a\u0156\3"+
		"\2\2\2\u013b\u013c\7<\2\2\u013c\u0156\b\35\1\2\u013d\u013e\7=\2\2\u013e"+
		"\u013f\7$\2\2\u013f\u0140\5B\"\2\u0140\u0141\7(\2\2\u0141\u0142\5B\"\2"+
		"\u0142\u0143\7%\2\2\u0143\u0144\b\35\1\2\u0144\u0156\3\2\2\2\u0145\u0146"+
		"\7>\2\2\u0146\u0147\7$\2\2\u0147\u0148\5B\"\2\u0148\u0149\7%\2\2\u0149"+
		"\u014a\b\35\1\2\u014a\u0156\3\2\2\2\u014b\u014c\7?\2\2\u014c\u014d\7$"+
		"\2\2\u014d\u014e\5> \2\u014e\u014f\7%\2\2\u014f\u0150\b\35\1\2\u0150\u0156"+
		"\3\2\2\2\u0151\u0152\7@\2\2\u0152\u0156\b\35\1\2\u0153\u0154\7A\2\2\u0154"+
		"\u0156\b\35\1\2\u0155\u010d\3\2\2\2\u0155\u010f\3\2\2\2\u0155\u0111\3"+
		"\2\2\2\u0155\u0113\3\2\2\2\u0155\u0119\3\2\2\2\u0155\u011f\3\2\2\2\u0155"+
		"\u0125\3\2\2\2\u0155\u0127\3\2\2\2\u0155\u0129\3\2\2\2\u0155\u012b\3\2"+
		"\2\2\u0155\u0131\3\2\2\2\u0155\u0133\3\2\2\2\u0155\u0135\3\2\2\2\u0155"+
		"\u013b\3\2\2\2\u0155\u013d\3\2\2\2\u0155\u0145\3\2\2\2\u0155\u014b\3\2"+
		"\2\2\u0155\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u01569\3\2\2\2\u0157\u0158"+
		"\7O\2\2\u0158\u0159\7$\2\2\u0159\u015a\5*\26\2\u015a\u015b\7%\2\2\u015b"+
		"\u015c\b\36\1\2\u015c\u01af\3\2\2\2\u015d\u015e\7D\2\2\u015e\u015f\7$"+
		"\2\2\u015f\u0160\5<\37\2\u0160\u0161\7(\2\2\u0161\u0162\5> \2\u0162\u0163"+
		"\7%\2\2\u0163\u0164\b\36\1\2\u0164\u01af\3\2\2\2\u0165\u0166\7E\2\2\u0166"+
		"\u0167\7$\2\2\u0167\u0168\5<\37\2\u0168\u0169\7(\2\2\u0169\u016a\5> \2"+
		"\u016a\u016b\7%\2\2\u016b\u016c\b\36\1\2\u016c\u01af\3\2\2\2\u016d\u016e"+
		"\7F\2\2\u016e\u016f\7$\2\2\u016f\u0170\5D#\2\u0170\u0171\7(\2\2\u0171"+
		"\u0172\5<\37\2\u0172\u0173\7(\2\2\u0173\u0174\5> \2\u0174\u0175\7(\2\2"+
		"\u0175\u0176\5> \2\u0176\u0177\7%\2\2\u0177\u0178\b\36\1\2\u0178\u01af"+
		"\3\2\2\2\u0179\u017a\7G\2\2\u017a\u017b\7$\2\2\u017b\u017c\5> \2\u017c"+
		"\u017d\7(\2\2\u017d\u017e\5@!\2\u017e\u017f\7%\2\2\u017f\u0180\b\36\1"+
		"\2\u0180\u01af\3\2\2\2\u0181\u0182\7H\2\2\u0182\u0183\7$\2\2\u0183\u0184"+
		"\5> \2\u0184\u0185\7(\2\2\u0185\u0186\5@!\2\u0186\u0187\7%\2\2\u0187\u0188"+
		"\b\36\1\2\u0188\u01af\3\2\2\2\u0189\u018a\7J\2\2\u018a\u018b\7$\2\2\u018b"+
		"\u018c\5<\37\2\u018c\u018d\7%\2\2\u018d\u018e\b\36\1\2\u018e\u01af\3\2"+
		"\2\2\u018f\u0190\7K\2\2\u0190\u0191\7$\2\2\u0191\u0192\5<\37\2\u0192\u0193"+
		"\7%\2\2\u0193\u0194\b\36\1\2\u0194\u01af\3\2\2\2\u0195\u0196\7L\2\2\u0196"+
		"\u0197\7$\2\2\u0197\u0198\5> \2\u0198\u0199\7(\2\2\u0199\u019a\5@!\2\u019a"+
		"\u019b\7%\2\2\u019b\u019c\b\36\1\2\u019c\u01af\3\2\2\2\u019d\u019e\7:"+
		"\2\2\u019e\u01af\b\36\1\2\u019f\u01a0\7;\2\2\u01a0\u01af\b\36\1\2\u01a1"+
		"\u01a2\7B\2\2\u01a2\u01a3\7$\2\2\u01a3\u01a4\5> \2\u01a4\u01a5\7(\2\2"+
		"\u01a5\u01a6\5> \2\u01a6\u01a7\7%\2\2\u01a7\u01a8\b\36\1\2\u01a8\u01af"+
		"\3\2\2\2\u01a9\u01aa\7C\2\2\u01aa\u01ab\7)\2\2\u01ab\u01ac\5> \2\u01ac"+
		"\u01ad\b\36\1\2\u01ad\u01af\3\2\2\2\u01ae\u0157\3\2\2\2\u01ae\u015d\3"+
		"\2\2\2\u01ae\u0165\3\2\2\2\u01ae\u016d\3\2\2\2\u01ae\u0179\3\2\2\2\u01ae"+
		"\u0181\3\2\2\2\u01ae\u0189\3\2\2\2\u01ae\u018f\3\2\2\2\u01ae\u0195\3\2"+
		"\2\2\u01ae\u019d\3\2\2\2\u01ae\u019f\3\2\2\2\u01ae\u01a1\3\2\2\2\u01ae"+
		"\u01a9\3\2\2\2\u01af;\3\2\2\2\u01b0\u01b1\5*\26\2\u01b1\u01b2\b\37\1\2"+
		"\u01b2=\3\2\2\2\u01b3\u01b4\5*\26\2\u01b4\u01b5\b \1\2\u01b5?\3\2\2\2"+
		"\u01b6\u01b7\5*\26\2\u01b7\u01b8\b!\1\2\u01b8A\3\2\2\2\u01b9\u01ba\5*"+
		"\26\2\u01ba\u01bb\b\"\1\2\u01bbC\3\2\2\2\u01bc\u01bd\5J&\2\u01bd\u01be"+
		"\b#\1\2\u01beE\3\2\2\2\u01bf\u01c0\5T+\2\u01c0\u01c1\b$\1\2\u01c1\u01d2"+
		"\3\2\2\2\u01c2\u01c3\5L\'\2\u01c3\u01c4\b$\1\2\u01c4\u01d2\3\2\2\2\u01c5"+
		"\u01c6\5N(\2\u01c6\u01c7\b$\1\2\u01c7\u01d2\3\2\2\2\u01c8\u01c9\5R*\2"+
		"\u01c9\u01ca\b$\1\2\u01ca\u01d2\3\2\2\2\u01cb\u01cc\5P)\2\u01cc\u01cd"+
		"\b$\1\2\u01cd\u01d2\3\2\2\2\u01ce\u01cf\5V,\2\u01cf\u01d0\b$\1\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01bf\3\2\2\2\u01d1\u01c2\3\2\2\2\u01d1\u01c5\3\2"+
		"\2\2\u01d1\u01c8\3\2\2\2\u01d1\u01cb\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d2"+
		"G\3\2\2\2\u01d3\u01d4\7\34\2\2\u01d4\u01d7\7U\2\2\u01d5\u01d6\7*\2\2\u01d6"+
		"\u01d8\7U\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\7\36\2\2\u01da\u01db\b%\1\2\u01dbI\3\2\2\2\u01dc\u01dd"+
		"\t\7\2\2\u01ddK\3\2\2\2\u01de\u01df\7R\2\2\u01dfM\3\2\2\2\u01e0\u01e1"+
		"\7S\2\2\u01e1O\3\2\2\2\u01e2\u01e3\7P\2\2\u01e3Q\3\2\2\2\u01e4\u01e5\7"+
		"Q\2\2\u01e5S\3\2\2\2\u01e6\u01e7\7V\2\2\u01e7U\3\2\2\2\u01e8\u01e9\7T"+
		"\2\2\u01e9W\3\2\2\2\22fs}\u008e\u009a\u00a0\u00b1\u00cc\u00d5\u00e4\u00fc"+
		"\u0105\u0155\u01ae\u01d1\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}