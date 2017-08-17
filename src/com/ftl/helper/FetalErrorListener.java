package com.ftl.helper;

import java.util.BitSet;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.log4j.Logger;


public class FetalErrorListener extends BaseErrorListener {
	private static Logger logger = Logger.getLogger(FetalErrorListener.class);	
	@Override
	public void syntaxError(Recognizer <?,?> recognizer, 
							Object offendingSymbol, 
							int line, int charPositionInLine, 
							String msg, RecognitionException e){
		msg = e.getMessage();

		msg = "Error @" + line + "," + charPositionInLine + ": " + msg;
		logger.error(msg);	
	}
	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
			int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
		super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts,
				configs);
	}
	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, BitSet conflictingAlts,
			ATNConfigSet configs) {
		super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex,
				conflictingAlts, configs);
	}
	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
		super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex,
				prediction, configs);
	}

}
