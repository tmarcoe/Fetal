package com.ftl.helper;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.apache.log4j.Logger;

public class BailErrorStrategy extends DefaultErrorStrategy {
	private static Logger logger = Logger.getLogger(BailErrorStrategy.class);	

	@Override
	public void recover(Parser recognizer, RecognitionException e) {
		throw new RuntimeException(e);
	}

	/** Make sure we don't attempt to recover from problems in subrules. */
	@Override
	public void sync(Parser recognizer) {}

	@Override
	public Token recoverInline(Parser recognizer) throws RecognitionException {

		logger.error("'" + recognizer.getRuleContext().getText() + "' @" + 
						   recognizer.getCurrentToken().getLine() + "," + 
						   recognizer.getCurrentToken().getCharPositionInLine());
		throw new RuntimeException();
		//return recognizer.getCurrentToken();
	}

	@Override
	public void reportError(Parser recognizer, RecognitionException e) {
		Token t = recognizer.getCurrentToken();
		logger.error(t.getText() + " @" + t.getLine() + "," + t.getCharPositionInLine());
		
	}
}