/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.delphi/model/astm.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.delphi.astm.lookup.util;

import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.delphi.astm.Definition;

/**
 * 
 */
public interface AstmLookupFilter {
	
	boolean matches(@NonNull Definition namedElement);
	
}
