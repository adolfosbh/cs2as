/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DelphiAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/delphi/parser/antlr/internal/InternalDelphi.tokens");
	}
}