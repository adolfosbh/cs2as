/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.companies/model/Company.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.company.lookup.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;

import org.xtext.example.company.Employee;
import org.xtext.example.company.lookup.LookupEnvironment;
import org.xtext.example.company.lookup.impl.LookupEnvironmentImpl;

public class CompanySingleResultLookupEnvironment extends LookupEnvironmentImpl   {
	
	private @NonNull Executor executor;
	private @NonNull String name;
	private @NonNull EClass typeFilter;
	private @Nullable CompanyLookupFilter expFilter;
	
	public CompanySingleResultLookupEnvironment(@NonNull Executor executor, @NonNull EClass typeFilter, @NonNull String name,  @Nullable CompanyLookupFilter expFilter) {
		this.executor = executor;
		this.name = name;
		this.typeFilter = typeFilter;
		this.expFilter = expFilter;
	}

	public CompanySingleResultLookupEnvironment(@NonNull Executor executor, @NonNull EClass typeFilter, @NonNull String name) {
		this(executor,typeFilter, name, null);
	}
	
	@Override
	@NonNull
	public Executor getExecutor() {
		return executor;
	}
	
	@Override
	public boolean hasFinalResult() {
		for (Employee element : getNamedElements()) {
			if (name.equals(element.getName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	@NonNull
	public LookupEnvironment addElement(@Nullable Employee namedElement) {
		if (namedElement != null) {
			if (name.equals(namedElement.getName())) {
				if (typeFilter.isInstance(namedElement)) {
				    CompanyLookupFilter expFilter2 = expFilter;
					if (expFilter2 == null || expFilter2.matches(namedElement)) {
						List<Employee> elements = getNamedElements();
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
	public <NE extends Employee > LookupEnvironment addElements(
			@Nullable Collection<NE> namedElements) {
		
		if (namedElements != null) {
			for (Employee namedElement : namedElements) {
				addElement(namedElement);
			}	
		}
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public <NE extends Employee> List<NE> getNamedElementsByKind(Class<NE> class_) {
		List<NE> result = new ArrayList<NE>(); 
		for (Employee namedElement : getNamedElements()) {
			if (class_.isAssignableFrom(namedElement.getClass())) {
				result.add((NE)namedElement);
			}
		}
		return result;
	}
}
