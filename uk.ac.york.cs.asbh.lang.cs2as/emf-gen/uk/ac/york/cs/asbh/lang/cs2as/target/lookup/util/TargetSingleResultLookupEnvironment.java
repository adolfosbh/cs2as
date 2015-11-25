/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: uk.ac.york.cs.asbh.lang.cs2as/model/TargetMM1.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	uk.ac.york.cs.asbh.lang.cs2as.target.lookup.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;

import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl.LookupEnvironmentImpl;
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;

public class TargetSingleResultLookupEnvironment extends LookupEnvironmentImpl   {
	
	private @NonNull Executor executor;
	private @NonNull String name;
	private @NonNull EClass typeFilter;
	
	public TargetSingleResultLookupEnvironment(@NonNull Executor executor, @NonNull EClass typeFilter, @NonNull String name) {
		this.executor = executor;
		this.name = name;
		this.typeFilter = typeFilter;
	}
	
	@Override
	@NonNull
	public Executor getExecutor() {
		return executor;
	}
	
	@Override
	public boolean hasFinalResult() {		
		for (NamedElement element : getNamedElements()) {
			if (name.equals(element.getName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	@NonNull
	public LookupEnvironment addElement(@Nullable NamedElement namedElement) {
		if (namedElement != null) {
			if (name.equals(namedElement.getName())) {
				if (typeFilter.isInstance(namedElement)) {
					EList<NamedElement> elements = getNamedElements();
					if (!elements.contains(namedElement)) { 	// FIXME use a set ?
						elements.add(namedElement);
					}
				}
			}
		}
		return this;
	}
	
	@Override
	@NonNull
	public <NE extends NamedElement > LookupEnvironment addElements(
			@Nullable EList<NE> namedElements) {
		
		if (namedElements != null) {
			for (NamedElement namedElement : namedElements) {
				addElement(namedElement);
			}	
		}
		return this;
	}
}
