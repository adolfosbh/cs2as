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
public abstract class AbstractAstmLookupFilter<C extends Definition> implements AstmLookupFilter {
	
	@NonNull private Class<C> _class;
	
	public AbstractAstmLookupFilter(@NonNull Class<C> _class) {
		this._class = _class;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean matches(@NonNull Definition namedElement) {
		return _class.isInstance(namedElement) && _matches((C)namedElement);
	}
	
	abstract protected Boolean _matches(@NonNull C element);
}
