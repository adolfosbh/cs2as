/*
 * generated by Xtext
 */
package uk.ac.york.cs.cs2as.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CS2ASDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.tokens");
	}
}
