/*
 * generated by Xtext
 */
package uk.ac.york.cs.cs2as.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.york.cs.cs2as.services.CS2ASDSLGrammarAccess;

public class CS2ASDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CS2ASDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected uk.ac.york.cs.cs2as.parser.antlr.internal.InternalCS2ASDSLParser createParser(XtextTokenStream stream) {
		return new uk.ac.york.cs.cs2as.parser.antlr.internal.InternalCS2ASDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public CS2ASDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CS2ASDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}