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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.xtext.example.delphi.astm.Definition;
import org.xtext.example.delphi.astm.lookup.LookupEnvironment;
import org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl;

public class AstmSingleResultLookupEnvironment extends LookupEnvironmentImpl   {
	
	private @NonNull Executor executor;
	private @NonNull String name;
	private @NonNull EClass typeFilter;
	private @Nullable AstmLookupFilter expFilter;
	
	public AstmSingleResultLookupEnvironment(@NonNull Executor executor, @NonNull EClass typeFilter, @NonNull String name,  @Nullable AstmLookupFilter expFilter) {
		this.executor = executor;
		this.name = name;
		this.typeFilter = typeFilter;
		this.expFilter = expFilter;
	}

	public AstmSingleResultLookupEnvironment(@NonNull Executor executor, @NonNull EClass typeFilter, @NonNull String name) {
		this(executor,typeFilter, name, null);
	}
	
	@Override
	@NonNull
	public Executor getExecutor() {
		return executor;
	}
	
	@Override
	public boolean hasFinalResult() {
		for (Definition element : getNamedElements()) {
			if (name.equals(element.getIdentifierName().getNameString())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	@NonNull
	public LookupEnvironment addElements(@Nullable Definition namedElement) {
		if (namedElement != null) {
			if (name.equals(namedElement.getIdentifierName().getNameString())) {
				if (typeFilter.isInstance(namedElement)) {
				    AstmLookupFilter expFilter2 = expFilter;
					if (expFilter2 == null || expFilter2.matches(namedElement)) {
						List<Definition> elements = getNamedElements();
						if (!elements.contains(namedElement)) { 	// FIXME use a set ?
							elements.add(namedElement);
						}
					}
				}
			}
		}
		return this;
	}
	
	@Override
	@NonNull
	public <NE extends Definition > LookupEnvironment addElements(
			@Nullable Collection<NE> namedElements) {
		
		if (namedElements != null) {
			for (Definition namedElement : namedElements) {
				addElements(namedElement);
			}	
		}
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public <NE extends Definition> List<NE> getNamedElementsByKind(Class<NE> class_) {
		List<NE> result = new ArrayList<NE>(); 
		for (Definition namedElement : getNamedElements()) {
			if (class_.isAssignableFrom(namedElement.getClass())) {
				result.add((NE)namedElement);
			}
		}
		return result;
	}
}
