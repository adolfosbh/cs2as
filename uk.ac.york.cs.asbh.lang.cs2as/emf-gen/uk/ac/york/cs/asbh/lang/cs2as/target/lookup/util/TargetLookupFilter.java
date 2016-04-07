/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: uk.ac.york.cs.asbh.lang.cs2as/model/TargetMM1.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	uk.ac.york.cs.asbh.lang.cs2as.target.lookup.util;

import org.eclipse.jdt.annotation.NonNull;
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;

/**
 * 
 */
public interface TargetLookupFilter {
	
	boolean matches(@NonNull NamedElement namedElement);
	
}
