/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.xtext.example.companies.build;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.pivot.internal.resource.StandaloneProjectMap;
import org.xtext.example.mydsl.CompaniesStandaloneSetup;
import org.xtext.example.mydsl.companies.CompaniesFactory;
import org.xtext.example.mydsl.companies.company;
import org.xtext.example.mydsl.companies.department;
import org.xtext.example.mydsl.companies.department_employees;
import org.xtext.example.mydsl.companies.department_manager;
import org.xtext.example.mydsl.companies.employee;

public class CompaniesModelsGen {

	private static URI TESTS_BASE_URI = URI.createPlatformResourceURI("org.xtext.example.companies.build/src-gen/org/xtext/example/companies/build/examples", true);
	
	//private static int NUM_COMPANIES = 4;
	private static int MAGNITUDE;
	private static int NUM_DEPARTMENTS = 4;
	private static int NUM_OF_SUB_DEPARTMENTS = 4;
	private static int MAX_DEPTH_OF_SUB_DEPARTMENTS = 4;
	private static int NUM_EMPLOYEE_PER_DEPARMENT = 5;
	
	public static boolean flipCoin() {
		return ThreadLocalRandom.current().nextBoolean();
	}
	public static int randRange(int min, int max) {
	    return ThreadLocalRandom.current().nextInt(min, max +1);
	}
	
	public static void main(String[] args) {
		
		CompaniesModelsGen mGen = new CompaniesModelsGen();
		CompaniesStandaloneSetup.doSetup();
		URI baseURI = TESTS_BASE_URI;

		ResourceSet rSet = new ResourceSetImpl();
		StandaloneProjectMap.getAdapter(rSet);
		
		
		//rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = rSet.createResource(baseURI.appendSegment("example.101"));
		resource.getContents().add(mGen.createCompany());
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public company createCompany( ) {
		
		company r = CompaniesFactory.eINSTANCE.createcompany();
		r.setName("aCompany");
		for (int i = 1; i <= NUM_DEPARTMENTS; i++) {
			r.getDeparment().add(createDepartment(String.valueOf(i), MAX_DEPTH_OF_SUB_DEPARTMENTS));
		}
		return r;
	}
	
	private department createDepartment(String numberHint, int maxDepth) {
				
		department p = CompaniesFactory.eINSTANCE.createdepartment();
		p.setName("D"+numberHint+"_");
		 
		p.setDepartment_manager(createManager(p.getName()));
		p.setDepartment_employees(createEmployees(p.getName()));
		
		if (maxDepth > 1) {
			for (int i = 1; i <= NUM_OF_SUB_DEPARTMENTS; i++) {
				p.getDeparment().add(createDepartment(numberHint + "_" + String.valueOf(i), maxDepth -1));
			}
		}
		return p;
	}
	
	private department_manager createManager(String deptName) {
		
		department_manager c = CompaniesFactory.eINSTANCE.createdepartment_manager();
		c.setEmployee(createEmployee(deptName+ "manager", computeMentor(true)));		
		return c;
	}
		
	private department_employees createEmployees(String deptName) {
		department_employees depEmployees = CompaniesFactory.eINSTANCE.createdepartment_employees();
		
		for (int i = 1; i <= NUM_EMPLOYEE_PER_DEPARMENT; i++) {
			String emplName = deptName + "employee" + i;
			depEmployees.getEmployee().add(createEmployee(emplName, computeMentor(false)));
		}
		return depEmployees;
	}
	
	private String computeMentor(boolean isManager) {
		if (flipCoin()) {			
			int dept = randRange(1, NUM_DEPARTMENTS);			
			int depth = randRange(1, MAX_DEPTH_OF_SUB_DEPARTMENTS);
			String deptName= "D" + dept + "_";
			for (int i = 1; i < depth; i++) {
				int subDept = randRange(1, NUM_OF_SUB_DEPARTMENTS);
				deptName += String.valueOf(subDept) + "_";
			}
			String employeeName = isManager ? "manager" : "employee" + String.valueOf(randRange(1, NUM_EMPLOYEE_PER_DEPARMENT));
			return deptName + employeeName;
		} else{
			return null;
		}
	}
	
	private employee createEmployee(String name, String mentor ) {
		
		employee employee = CompaniesFactory.eINSTANCE.createemployee();
		employee.setName(name);
		employee.setAddress(employee.getName() + "_addr");
		//employee.setMentor(mentor == null ? null : "\"" + mentor + "\"");
		employee.setMentor(mentor);
		employee.setSalary(Math.random() * 100000);
		return employee;
	}
	
	
}
