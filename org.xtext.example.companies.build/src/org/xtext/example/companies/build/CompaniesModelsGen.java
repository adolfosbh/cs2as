/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations, University of York and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera (University of York) - initial API and implementation
 *******************************************************************************/
package org.xtext.example.companies.build;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.pivot.internal.resource.StandaloneProjectMap;
import org.xtext.example.mydsl.CompaniesStandaloneSetup;
import org.xtext.example.mydsl.companies.CompaniesFactory;
import org.xtext.example.mydsl.companies.company;
import org.xtext.example.mydsl.companies.department;
import org.xtext.example.mydsl.companies.department_employees;
import org.xtext.example.mydsl.companies.department_manager;
import org.xtext.example.mydsl.companies.employee;

public class CompaniesModelsGen {

	private static final String CONST_ADDR = "_addr";

	private static final String CONST_D = "D";
	
	private static final String CONST__ = "_";
	
	private static final String CONST_MANAGER = "manager";
	
	private static final String CONST_EMPLOYEE = "employee";
	
	private static URI TESTS_BASE_URI = URI.createPlatformResourceURI("org.xtext.example.companies.build/src-gen/org/xtext/example/companies/build/examples", true);
	
	//private static int NUM_COMPANIES = 4;
	private static int NUM_DEPARTMENTS = 10;
	private static int NUM_OF_SUB_DEPARTMENTS = 5;
	private static int NUM_EMPLOYEE_PER_DEPARMENT = 10;
	private static int MAX_DEPTH_OF_SUB_DEPARTMENTS = 5;
	
	private long numOfElements=0;
	
	public static boolean flipCoin() {
		return ThreadLocalRandom.current().nextBoolean();
	}
	public static int randIntRange(int min, int max) {
	    return ThreadLocalRandom.current().nextInt(min, max +1);
	}
	public static double randDoubleRange(int min, int max) {
		return ThreadLocalRandom.current().nextDouble(min, max);
	}
	
	public static void main(String[] args) {
		
		CompaniesStandaloneSetup.doSetup();
		
		CompaniesModelsGen mGen = new CompaniesModelsGen();
		
		URI baseURI = TESTS_BASE_URI;

		ResourceSet rSet = new ResourceSetImpl();
		StandaloneProjectMap.getAdapter(rSet);
		
		
		//rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = rSet.createResource(baseURI.appendSegment("model7.101"));
		resource.getContents().add(mGen.createCompany());
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Number of elements: " + mGen.numOfElements());
	}
	
	
	public company createCompany( ) {
		
		company r = CompaniesFactory.eINSTANCE.createcompany();
		numOfElements++;
		r.setName("aCompany");
		for (int i = 1; i <= NUM_DEPARTMENTS; i++) {
			r.getDeparment().add(createDepartment(String.valueOf(i), MAX_DEPTH_OF_SUB_DEPARTMENTS));
		}
		return r;
	}
	
	public long numOfElements() {
		return numOfElements;
	}
	private department createDepartment(String numberHint, int maxDepth) {
				
		department p = CompaniesFactory.eINSTANCE.createdepartment();
		numOfElements++;
		p.setName(CONST_D+numberHint+CONST__);
		 
		p.setDepartment_manager(createManager(p.getName()));
		p.setDepartment_employees(createEmployees(p.getName()));
		
		if (maxDepth > 1) {
			for (int i = 1; i <= NUM_OF_SUB_DEPARTMENTS; i++) {
				p.getDeparment().add(createDepartment(numberHint + CONST__ + String.valueOf(i), maxDepth -1));
			}
		}
		return p;
	}
	
	private department_manager createManager(String deptName) {
		
		department_manager c = CompaniesFactory.eINSTANCE.createdepartment_manager();
		numOfElements++;
		c.setEmployee(createEmployee(deptName+ CONST_MANAGER, computeMentor(true)));
		return c;
	}
		
	private department_employees createEmployees(String deptName) {
		department_employees depEmployees = CompaniesFactory.eINSTANCE.createdepartment_employees();
		numOfElements++;
		
		for (int i = 1; i <= NUM_EMPLOYEE_PER_DEPARMENT; i++) {
			String emplName = deptName + CONST_EMPLOYEE + i;
			depEmployees.getEmployee().add(createEmployee(emplName, computeMentor(false)));
		}
		return depEmployees;
	}
	
	private String computeMentor(boolean isManager) {
		if (flipCoin()) {			
			int dept = randIntRange(1, NUM_DEPARTMENTS);			
			int depth = randIntRange(1, MAX_DEPTH_OF_SUB_DEPARTMENTS);
			StringBuilder sb = new StringBuilder();
			sb.append(CONST_D);
			sb.append(dept);
			sb.append(CONST__);
			for (int i = 1; i < depth; i++) {
				int subDept = randIntRange(1, NUM_OF_SUB_DEPARTMENTS);
				sb.append(String.valueOf(subDept));
				sb.append(CONST__);
			}
			String employeeName = isManager ? CONST_MANAGER : CONST_EMPLOYEE + String.valueOf(randIntRange(1, NUM_EMPLOYEE_PER_DEPARMENT));
			sb.append(employeeName);
			return sb.toString();
		} else{
			return null;
		}
	}
	
	private employee createEmployee(String name, String mentor ) {
		
		employee employee = CompaniesFactory.eINSTANCE.createemployee();
		numOfElements++;
		employee.setName(name);
		employee.setAddress(employee.getName() + CONST_ADDR);
		//employee.setMentor(mentor == null ? null : "\"" + mentor + "\"");
		employee.setMentor(mentor);
		employee.setSalary(randDoubleRange(10000, 12000));
		return employee;
	}
}
