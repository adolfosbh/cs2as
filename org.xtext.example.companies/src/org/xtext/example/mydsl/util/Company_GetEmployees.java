package org.xtext.example.mydsl.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.library.AbstractOperation;
import org.xtext.example.company.Company;
import org.xtext.example.company.Department;
import org.xtext.example.company.Employee;;

public class Company_GetEmployees extends AbstractOperation {

	public static  Company_GetEmployees INSTANCE = new Company_GetEmployees();
		
	@Override
	public @Nullable Object dispatch(@NonNull Executor executor, @NonNull OperationCallExp callExp,
			@Nullable Object sourceValue) {
			
		return basicEvaluate(executor, callExp, new Object[]{sourceValue});
	}
	
		
	private void addEmployees(Department dept, Set<Employee> list) {
		list.addAll(dept.getEmployees());
		list.add(dept.getManager());
		for (Department subdept : dept.getSubdepts()) {
			addEmployees(subdept, list);
		}
	}
	
	@Override
	public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller,
			@Nullable Object @NonNull [] sourceAndArgumentValues) {
		
		Company company = (Company) sourceAndArgumentValues[0];
		Set<Employee> employees = new HashSet<Employee>();
		for (Department dept : company.getDepts()) {
			addEmployees(dept, employees);
		}
		return executor.getIdResolver().boxedValueOf(employees);
	}

}
