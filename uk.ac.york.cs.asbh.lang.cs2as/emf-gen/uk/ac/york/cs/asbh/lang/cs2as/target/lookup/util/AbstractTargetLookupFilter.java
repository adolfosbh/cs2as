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
public abstract class AbstractTargetLookupFilter<C extends NamedElement> implements TargetLookupFilter {
	
	@NonNull private Class<C> _class;
	
	public AbstractTargetLookupFilter(@NonNull Class<C> _class) {
		this._class = _class;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean matches(@NonNull NamedElement namedElement) {
		return _class.isInstance(namedElement) && _matches((C)namedElement);
	}
	
	abstract protected Boolean _matches(@NonNull C element);
}
