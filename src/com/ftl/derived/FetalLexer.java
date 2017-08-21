// Generated from Fetal.g4 by ANTLR 4.5.2

package com.ftl.derived;
import com.ftl.helper.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.lang.reflect.InvocationTargetException;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FetalLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "DecimalType", "NumberType", "StringType", 
		"BooleanType", "DateType", "ObjectType", "DaoType", "Equals", "PlusEquals", 
		"MinusEquals", "MultiplyEquals", "DivideEquals", "ModuloEquals", "ExponentEquals", 
		"Plus", "Minus", "Multiply", "Divide", "Modulo", "Exponent", "And", "Or", 
		"Not", "IsEqualTo", "IsLessThan", "IsLessThanOrEqualTo", "IsGreaterThan", 
		"IsGreaterThanOrEqualTo", "IsNotEqualTo", "AndExpression", "OrExpression", 
		"ExclusiveOrExpression", "GetBalance", "GetVariableType", "GetDescription", 
		"Today", "GetDays", "DayOfTheWeek", "GetCalendarDay", "GetMonth", "GetYear", 
		"Import", "Lookup", "List", "Credit", "Debit", "Ledger", "Alias", "MapFile", 
		"IfStatement", "Else", "Print", "Percentage", "Boolean", "Number", "Decimal", 
		"Date", "Identifier", "String", "ESC", "IdentifierNondigit", "Nondigit", 
		"Digit", "Digits", "Year", "Month", "Day", "Sign", "Dot", "SCharSequence", 
		"SChar", "CChar", "SimpleEscapeSequence", "ExtendedAscii", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
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


		FetalTransaction trans;
		ObjectMath	om;
		private static final int NOT_DEFINED=0, MALFORMED_EXP=1, CAST_EXCEPT=2, CANNOT_LOAD_FILE=3,
								 INVALID_DATE=4, CANNOT_LOAD_OBJECT=5, CANNOT_INVOKE_METHD=6, INVALID_OBJECT=7,
								 INVALID_ARG=8; 


	public FetalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fetal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2O\u02a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3"+
		"A\3B\3B\3B\3B\3B\3B\3C\5C\u01f1\nC\3C\6C\u01f4\nC\rC\16C\u01f5\3C\3C\6"+
		"C\u01fa\nC\rC\16C\u01fb\5C\u01fe\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5"+
		"D\u020b\nD\3E\5E\u020e\nE\3E\6E\u0211\nE\rE\16E\u0212\3F\5F\u0216\nF\3"+
		"F\6F\u0219\nF\rF\16F\u021a\3F\3F\7F\u021f\nF\fF\16F\u0222\13F\3G\3G\3"+
		"G\3G\3G\3G\3H\3H\3H\7H\u022d\nH\fH\16H\u0230\13H\3I\3I\3I\7I\u0235\nI"+
		"\fI\16I\u0238\13I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\5N\u0246\nN\3N\6"+
		"N\u0249\nN\rN\16N\u024a\3O\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\5R\u025a"+
		"\nR\3S\3S\3T\6T\u025f\nT\rT\16T\u0260\3U\3U\3U\3U\3U\3U\3U\5U\u026a\n"+
		"U\3V\3V\5V\u026e\nV\3W\3W\3W\3X\6X\u0274\nX\rX\16X\u0275\3X\3X\3Y\6Y\u027b"+
		"\nY\rY\16Y\u027c\3Y\3Y\3Z\3Z\5Z\u0283\nZ\3Z\5Z\u0286\nZ\3Z\3Z\3[\3[\3"+
		"[\3[\7[\u028e\n[\f[\16[\u0291\13[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\7\\\u029c"+
		"\n\\\f\\\16\\\u029f\13\\\3\\\3\\\3\u028f\2]\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7"+
		"\2\u00a9\2\u00ab\2\u00ad\2\u00afK\u00b1L\u00b3M\u00b5N\u00b7O\3\2\r\4"+
		"\2$$^^\13\2$$))^^cdhhppttvvxx\5\2C\\aac|\3\2\62;\4\2--//\6\2\f\f\17\17"+
		"$$^^\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhppttvvxx\5\2\62^ghzz\4\2\13\13\""+
		"\"\4\2\f\f\17\17\u02af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\3\u00b9"+
		"\3\2\2\2\5\u00bf\3\2\2\2\7\u00c3\3\2\2\2\t\u00c5\3\2\2\2\13\u00c7\3\2"+
		"\2\2\r\u00c9\3\2\2\2\17\u00cb\3\2\2\2\21\u00cd\3\2\2\2\23\u00cf\3\2\2"+
		"\2\25\u00d1\3\2\2\2\27\u00d3\3\2\2\2\31\u00d6\3\2\2\2\33\u00d8\3\2\2\2"+
		"\35\u00da\3\2\2\2\37\u00e2\3\2\2\2!\u00e9\3\2\2\2#\u00f0\3\2\2\2%\u00f8"+
		"\3\2\2\2\'\u00fd\3\2\2\2)\u0104\3\2\2\2+\u0108\3\2\2\2-\u010a\3\2\2\2"+
		"/\u010d\3\2\2\2\61\u0110\3\2\2\2\63\u0113\3\2\2\2\65\u0116\3\2\2\2\67"+
		"\u0119\3\2\2\29\u011c\3\2\2\2;\u011e\3\2\2\2=\u0120\3\2\2\2?\u0122\3\2"+
		"\2\2A\u0124\3\2\2\2C\u0126\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I\u012c"+
		"\3\2\2\2K\u012e\3\2\2\2M\u0131\3\2\2\2O\u0133\3\2\2\2Q\u0136\3\2\2\2S"+
		"\u0138\3\2\2\2U\u013b\3\2\2\2W\u013e\3\2\2\2Y\u0141\3\2\2\2[\u0144\3\2"+
		"\2\2]\u0147\3\2\2\2_\u0152\3\2\2\2a\u0162\3\2\2\2c\u0171\3\2\2\2e\u0177"+
		"\3\2\2\2g\u017f\3\2\2\2i\u018c\3\2\2\2k\u019b\3\2\2\2m\u01a4\3\2\2\2o"+
		"\u01ac\3\2\2\2q\u01b3\3\2\2\2s\u01ba\3\2\2\2u\u01bf\3\2\2\2w\u01c6\3\2"+
		"\2\2y\u01cc\3\2\2\2{\u01d3\3\2\2\2}\u01d9\3\2\2\2\177\u01e1\3\2\2\2\u0081"+
		"\u01e4\3\2\2\2\u0083\u01e9\3\2\2\2\u0085\u01f0\3\2\2\2\u0087\u020a\3\2"+
		"\2\2\u0089\u020d\3\2\2\2\u008b\u0215\3\2\2\2\u008d\u0223\3\2\2\2\u008f"+
		"\u0229\3\2\2\2\u0091\u0231\3\2\2\2\u0093\u023b\3\2\2\2\u0095\u023e\3\2"+
		"\2\2\u0097\u0240\3\2\2\2\u0099\u0242\3\2\2\2\u009b\u0245\3\2\2\2\u009d"+
		"\u024c\3\2\2\2\u009f\u0251\3\2\2\2\u00a1\u0254\3\2\2\2\u00a3\u0259\3\2"+
		"\2\2\u00a5\u025b\3\2\2\2\u00a7\u025e\3\2\2\2\u00a9\u0269\3\2\2\2\u00ab"+
		"\u026d\3\2\2\2\u00ad\u026f\3\2\2\2\u00af\u0273\3\2\2\2\u00b1\u027a\3\2"+
		"\2\2\u00b3\u0285\3\2\2\2\u00b5\u0289\3\2\2\2\u00b7\u0297\3\2\2\2\u00b9"+
		"\u00ba\7d\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd\7k\2\2"+
		"\u00bd\u00be\7p\2\2\u00be\4\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p"+
		"\2\2\u00c1\u00c2\7f\2\2\u00c2\6\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4\b\3\2"+
		"\2\2\u00c5\u00c6\7*\2\2\u00c6\n\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8\f\3\2"+
		"\2\2\u00c9\u00ca\7}\2\2\u00ca\16\3\2\2\2\u00cb\u00cc\7\177\2\2\u00cc\20"+
		"\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce\22\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0"+
		"\24\3\2\2\2\u00d1\u00d2\7\60\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4"+
		"\u00d5\7+\2\2\u00d5\30\3\2\2\2\u00d6\u00d7\7F\2\2\u00d7\32\3\2\2\2\u00d8"+
		"\u00d9\7E\2\2\u00d9\34\3\2\2\2\u00da\u00db\7f\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7o\2\2\u00df\u00e0\7c\2\2"+
		"\u00e0\u00e1\7n\2\2\u00e1\36\3\2\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7"+
		"w\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7i\2\2\u00ef"+
		"\"\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7p\2\2"+
		"\u00f7$\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7v\2"+
		"\2\u00fb\u00fc\7g\2\2\u00fc&\3\2\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7"+
		"d\2\2\u00ff\u0100\7l\2\2\u0100\u0101\7g\2\2\u0101\u0102\7e\2\2\u0102\u0103"+
		"\7v\2\2\u0103(\3\2\2\2\u0104\u0105\7f\2\2\u0105\u0106\7c\2\2\u0106\u0107"+
		"\7q\2\2\u0107*\3\2\2\2\u0108\u0109\7?\2\2\u0109,\3\2\2\2\u010a\u010b\7"+
		"-\2\2\u010b\u010c\7?\2\2\u010c.\3\2\2\2\u010d\u010e\7/\2\2\u010e\u010f"+
		"\7?\2\2\u010f\60\3\2\2\2\u0110\u0111\7,\2\2\u0111\u0112\7?\2\2\u0112\62"+
		"\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115\7?\2\2\u0115\64\3\2\2\2\u0116"+
		"\u0117\7\'\2\2\u0117\u0118\7?\2\2\u0118\66\3\2\2\2\u0119\u011a\7`\2\2"+
		"\u011a\u011b\7?\2\2\u011b8\3\2\2\2\u011c\u011d\7-\2\2\u011d:\3\2\2\2\u011e"+
		"\u011f\7/\2\2\u011f<\3\2\2\2\u0120\u0121\7,\2\2\u0121>\3\2\2\2\u0122\u0123"+
		"\7\61\2\2\u0123@\3\2\2\2\u0124\u0125\7\'\2\2\u0125B\3\2\2\2\u0126\u0127"+
		"\7`\2\2\u0127D\3\2\2\2\u0128\u0129\7(\2\2\u0129F\3\2\2\2\u012a\u012b\7"+
		"~\2\2\u012bH\3\2\2\2\u012c\u012d\7#\2\2\u012dJ\3\2\2\2\u012e\u012f\7?"+
		"\2\2\u012f\u0130\7?\2\2\u0130L\3\2\2\2\u0131\u0132\7>\2\2\u0132N\3\2\2"+
		"\2\u0133\u0134\7>\2\2\u0134\u0135\7?\2\2\u0135P\3\2\2\2\u0136\u0137\7"+
		"@\2\2\u0137R\3\2\2\2\u0138\u0139\7@\2\2\u0139\u013a\7?\2\2\u013aT\3\2"+
		"\2\2\u013b\u013c\7#\2\2\u013c\u013d\7?\2\2\u013dV\3\2\2\2\u013e\u013f"+
		"\7(\2\2\u013f\u0140\7(\2\2\u0140X\3\2\2\2\u0141\u0142\7~\2\2\u0142\u0143"+
		"\7~\2\2\u0143Z\3\2\2\2\u0144\u0145\7`\2\2\u0145\u0146\7`\2\2\u0146\\\3"+
		"\2\2\2\u0147\u0148\7i\2\2\u0148\u0149\7g\2\2\u0149\u014a\7v\2\2\u014a"+
		"\u014b\7D\2\2\u014b\u014c\7c\2\2\u014c\u014d\7n\2\2\u014d\u014e\7c\2\2"+
		"\u014e\u014f\7p\2\2\u014f\u0150\7e\2\2\u0150\u0151\7g\2\2\u0151^\3\2\2"+
		"\2\u0152\u0153\7i\2\2\u0153\u0154\7g\2\2\u0154\u0155\7v\2\2\u0155\u0156"+
		"\7X\2\2\u0156\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158\u0159\7k\2\2\u0159"+
		"\u015a\7c\2\2\u015a\u015b\7d\2\2\u015b\u015c\7n\2\2\u015c\u015d\7g\2\2"+
		"\u015d\u015e\7V\2\2\u015e\u015f\7{\2\2\u015f\u0160\7r\2\2\u0160\u0161"+
		"\7g\2\2\u0161`\3\2\2\2\u0162\u0163\7i\2\2\u0163\u0164\7g\2\2\u0164\u0165"+
		"\7v\2\2\u0165\u0166\7F\2\2\u0166\u0167\7g\2\2\u0167\u0168\7u\2\2\u0168"+
		"\u0169\7e\2\2\u0169\u016a\7t\2\2\u016a\u016b\7k\2\2\u016b\u016c\7r\2\2"+
		"\u016c\u016d\7v\2\2\u016d\u016e\7k\2\2\u016e\u016f\7q\2\2\u016f\u0170"+
		"\7p\2\2\u0170b\3\2\2\2\u0171\u0172\7v\2\2\u0172\u0173\7q\2\2\u0173\u0174"+
		"\7f\2\2\u0174\u0175\7c\2\2\u0175\u0176\7{\2\2\u0176d\3\2\2\2\u0177\u0178"+
		"\7i\2\2\u0178\u0179\7g\2\2\u0179\u017a\7v\2\2\u017a\u017b\7F\2\2\u017b"+
		"\u017c\7c\2\2\u017c\u017d\7{\2\2\u017d\u017e\7u\2\2\u017ef\3\2\2\2\u017f"+
		"\u0180\7f\2\2\u0180\u0181\7c\2\2\u0181\u0182\7{\2\2\u0182\u0183\7Q\2\2"+
		"\u0183\u0184\7h\2\2\u0184\u0185\7V\2\2\u0185\u0186\7j\2\2\u0186\u0187"+
		"\7g\2\2\u0187\u0188\7Y\2\2\u0188\u0189\7g\2\2\u0189\u018a\7g\2\2\u018a"+
		"\u018b\7m\2\2\u018bh\3\2\2\2\u018c\u018d\7i\2\2\u018d\u018e\7g\2\2\u018e"+
		"\u018f\7v\2\2\u018f\u0190\7E\2\2\u0190\u0191\7c\2\2\u0191\u0192\7n\2\2"+
		"\u0192\u0193\7g\2\2\u0193\u0194\7p\2\2\u0194\u0195\7f\2\2\u0195\u0196"+
		"\7c\2\2\u0196\u0197\7t\2\2\u0197\u0198\7F\2\2\u0198\u0199\7c\2\2\u0199"+
		"\u019a\7{\2\2\u019aj\3\2\2\2\u019b\u019c\7i\2\2\u019c\u019d\7g\2\2\u019d"+
		"\u019e\7v\2\2\u019e\u019f\7O\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7p\2\2"+
		"\u01a1\u01a2\7v\2\2\u01a2\u01a3\7j\2\2\u01a3l\3\2\2\2\u01a4\u01a5\7i\2"+
		"\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7[\2\2\u01a8\u01a9"+
		"\7g\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7t\2\2\u01abn\3\2\2\2\u01ac\u01ad"+
		"\7k\2\2\u01ad\u01ae\7o\2\2\u01ae\u01af\7r\2\2\u01af\u01b0\7q\2\2\u01b0"+
		"\u01b1\7t\2\2\u01b1\u01b2\7v\2\2\u01b2p\3\2\2\2\u01b3\u01b4\7n\2\2\u01b4"+
		"\u01b5\7q\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7m\2\2\u01b7\u01b8\7w\2\2"+
		"\u01b8\u01b9\7r\2\2\u01b9r\3\2\2\2\u01ba\u01bb\7n\2\2\u01bb\u01bc\7k\2"+
		"\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7v\2\2\u01bet\3\2\2\2\u01bf\u01c0\7"+
		"e\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7f\2\2\u01c3\u01c4"+
		"\7k\2\2\u01c4\u01c5\7v\2\2\u01c5v\3\2\2\2\u01c6\u01c7\7f\2\2\u01c7\u01c8"+
		"\7g\2\2\u01c8\u01c9\7d\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7v\2\2\u01cb"+
		"x\3\2\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf\7f\2\2\u01cf"+
		"\u01d0\7i\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7t\2\2\u01d2z\3\2\2\2\u01d3"+
		"\u01d4\7c\2\2\u01d4\u01d5\7n\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7c\2\2"+
		"\u01d7\u01d8\7u\2\2\u01d8|\3\2\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7c\2"+
		"\2\u01db\u01dc\7r\2\2\u01dc\u01dd\7H\2\2\u01dd\u01de\7k\2\2\u01de\u01df"+
		"\7n\2\2\u01df\u01e0\7g\2\2\u01e0~\3\2\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3"+
		"\7h\2\2\u01e3\u0080\3\2\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7n\2\2\u01e6"+
		"\u01e7\7u\2\2\u01e7\u01e8\7g\2\2\u01e8\u0082\3\2\2\2\u01e9\u01ea\7r\2"+
		"\2\u01ea\u01eb\7t\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee"+
		"\7v\2\2\u01ee\u0084\3\2\2\2\u01ef\u01f1\5\u00a3R\2\u01f0\u01ef\3\2\2\2"+
		"\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f4\5\u0099M\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01fd\3\2\2\2\u01f7\u01f9\5\u00a5S\2\u01f8\u01fa\5\u0099M\2"+
		"\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\7\'\2\2\u0200\u0086\3\2\2\2\u0201\u0202\7v"+
		"\2\2\u0202\u0203\7t\2\2\u0203\u0204\7w\2\2\u0204\u020b\7g\2\2\u0205\u0206"+
		"\7h\2\2\u0206\u0207\7c\2\2\u0207\u0208\7n\2\2\u0208\u0209\7u\2\2\u0209"+
		"\u020b\7g\2\2\u020a\u0201\3\2\2\2\u020a\u0205\3\2\2\2\u020b\u0088\3\2"+
		"\2\2\u020c\u020e\5\u00a3R\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u0211\5\u0099M\2\u0210\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u008a\3\2\2\2\u0214"+
		"\u0216\5\u00a3R\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218"+
		"\3\2\2\2\u0217\u0219\5\u0099M\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0220"+
		"\5\u00a5S\2\u021d\u021f\5\u0099M\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u008c\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0224\5\u009dO\2\u0224\u0225\7/\2\2\u0225\u0226\5"+
		"\u009fP\2\u0226\u0227\7/\2\2\u0227\u0228\5\u00a1Q\2\u0228\u008e\3\2\2"+
		"\2\u0229\u022e\5\u0095K\2\u022a\u022d\5\u0095K\2\u022b\u022d\5\u0099M"+
		"\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0090\3\2\2\2\u0230\u022e\3\2\2\2\u0231"+
		"\u0236\7$\2\2\u0232\u0235\5\u0093J\2\u0233\u0235\n\2\2\2\u0234\u0232\3"+
		"\2\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7$"+
		"\2\2\u023a\u0092\3\2\2\2\u023b\u023c\7^\2\2\u023c\u023d\t\3\2\2\u023d"+
		"\u0094\3\2\2\2\u023e\u023f\5\u0097L\2\u023f\u0096\3\2\2\2\u0240\u0241"+
		"\t\4\2\2\u0241\u0098\3\2\2\2\u0242\u0243\t\5\2\2\u0243\u009a\3\2\2\2\u0244"+
		"\u0246\t\6\2\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2"+
		"\2\2\u0247\u0249\t\5\2\2\u0248\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u009c\3\2\2\2\u024c\u024d\5\u0099"+
		"M\2\u024d\u024e\5\u0099M\2\u024e\u024f\5\u0099M\2\u024f\u0250\5\u0099"+
		"M\2\u0250\u009e\3\2\2\2\u0251\u0252\5\u0099M\2\u0252\u0253\5\u0099M\2"+
		"\u0253\u00a0\3\2\2\2\u0254\u0255\5\u0099M\2\u0255\u0256\5\u0099M\2\u0256"+
		"\u00a2\3\2\2\2\u0257\u025a\59\35\2\u0258\u025a\5;\36\2\u0259\u0257\3\2"+
		"\2\2\u0259\u0258\3\2\2\2\u025a\u00a4\3\2\2\2\u025b\u025c\7\60\2\2\u025c"+
		"\u00a6\3\2\2\2\u025d\u025f\5\u00a9U\2\u025e\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u00a8\3\2\2\2\u0262"+
		"\u026a\n\7\2\2\u0263\u026a\5\u00adW\2\u0264\u0265\7^\2\2\u0265\u026a\7"+
		"\f\2\2\u0266\u0267\7^\2\2\u0267\u0268\7\17\2\2\u0268\u026a\7\f\2\2\u0269"+
		"\u0262\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0264\3\2\2\2\u0269\u0266\3\2"+
		"\2\2\u026a\u00aa\3\2\2\2\u026b\u026e\n\b\2\2\u026c\u026e\5\u00adW\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e\u00ac\3\2\2\2\u026f\u0270\7^"+
		"\2\2\u0270\u0271\t\t\2\2\u0271\u00ae\3\2\2\2\u0272\u0274\t\n\2\2\u0273"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277\u0278\bX\2\2\u0278\u00b0\3\2\2\2\u0279"+
		"\u027b\t\13\2\2\u027a\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027a\3"+
		"\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\bY\2\2\u027f"+
		"\u00b2\3\2\2\2\u0280\u0282\7\17\2\2\u0281\u0283\7\f\2\2\u0282\u0281\3"+
		"\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0286\7\f\2\2\u0285"+
		"\u0280\3\2\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\bZ"+
		"\2\2\u0288\u00b4\3\2\2\2\u0289\u028a\7\61\2\2\u028a\u028b\7,\2\2\u028b"+
		"\u028f\3\2\2\2\u028c\u028e\13\2\2\2\u028d\u028c\3\2\2\2\u028e\u0291\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0293\7,\2\2\u0293\u0294\7\61\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\b[\2\2\u0296\u00b6\3\2\2\2\u0297\u0298\7\61\2\2\u0298"+
		"\u0299\7\61\2\2\u0299\u029d\3\2\2\2\u029a\u029c\n\f\2\2\u029b\u029a\3"+
		"\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a1\b\\\2\2\u02a1\u00b8\3\2"+
		"\2\2\35\2\u01f0\u01f5\u01fb\u01fd\u020a\u020d\u0212\u0215\u021a\u0220"+
		"\u022c\u022e\u0234\u0236\u0245\u024a\u0259\u0260\u0269\u026d\u0275\u027c"+
		"\u0282\u0285\u028f\u029d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}