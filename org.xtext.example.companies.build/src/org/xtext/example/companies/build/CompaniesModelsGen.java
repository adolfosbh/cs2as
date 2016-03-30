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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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
	
	private static int NUM_DEPARTMENTS = 2;
	private static int NUM_OF_SUB_DEPARTMENTS = 2;
	private static int NUM_EMPLOYEE_PER_DEPARMENT = 1;
	private static int MAX_DEPTH_OF_SUB_DEPARTMENTS = 2;
	private static long TOTAL_OF_DEPTS = Math.round((Math.pow(NUM_OF_SUB_DEPARTMENTS, MAX_DEPTH_OF_SUB_DEPARTMENTS+1))) 
			- (NUM_OF_SUB_DEPARTMENTS*2) + NUM_DEPARTMENTS;
	private static long TOT_OF_EMPLOYEES = TOTAL_OF_DEPTS * NUM_EMPLOYEE_PER_DEPARMENT;
	
	private static boolean GEN_SERIES_OF_MODELS = true;
	private static int MIN_NUM_ELEMENTS = 35;
	private static int MAX_NUM_ELEMENTS = 100000;
	private static int NUM_MODELS = 25;
				
	private static boolean MENTORS_IN_ALL_MODEL = true; 
	
	private long numOfElements=0;
	private Stack<Integer> currentDeptPath = new Stack<Integer>(); 
	
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
		URI baseURI = TESTS_BASE_URI.appendSegment("scale2");

		ResourceSet rSet = new ResourceSetImpl();
		StandaloneProjectMap.getAdapter(rSet);
				
		if (GEN_SERIES_OF_MODELS) {
			NUM_DEPARTMENTS = 2;
			NUM_OF_SUB_DEPARTMENTS = 2;
			MAX_DEPTH_OF_SUB_DEPARTMENTS = 2;
			int i=1;
			for (Long numOfModelElements : computeValuesEquidistantInLogScale(MIN_NUM_ELEMENTS, MAX_NUM_ELEMENTS, NUM_MODELS) ) {				
				String modelName = "model" + (i++) +".101";
				NUM_EMPLOYEE_PER_DEPARMENT = computeRequiredNumOfEmployeePerDepartment(numOfModelElements, NUM_DEPARTMENTS, NUM_OF_SUB_DEPARTMENTS, MAX_DEPTH_OF_SUB_DEPARTMENTS).intValue();
				mGen.genNewModel(rSet, baseURI.appendSegment(modelName));
				System.out.println(modelName + " - " + "Number of elements: " + mGen.numOfElements());
			}
		} else {
			String modelName = "test.101";
			mGen.genNewModel(rSet, baseURI.appendSegment(modelName));
			System.out.println("Number of elements: " + mGen.numOfElements());
			System.out.println("Theory: " + (1 + // Company 
					4*TOTAL_OF_DEPTS // DEPT + DEPT_MANAGER (employee) + department_manager + department_employee objects 
				   + TOT_OF_EMPLOYEES));
		}
	}
	
	
	public static List<Long> computeValuesEquidistantInLogScale(int minValue, int maxValue, int nOfPoints) {
		
		List<Long> result = new ArrayList<Long>();
					
		double min = Math.log10(minValue);
		double max = Math.log10(maxValue);
		
		for (int i=0; i < nOfPoints; i++) {
			double value = min + i* (max-min)/nOfPoints;
			result.add(new Long(Math.round(Math.pow(10, value))));
		}
		return result;
	}
	
	/**
	 * num_model_elements = 
	 * 			1 + -- company 
	 * 	 		num_tot_of_depts * 4 + -- 1.dept, 2.manager, 3.department_manager, 4.department_employee 
	 *          num_tot_of_depts * num_employee_per_dept -- non manager employees
     *
	 * @param valuesOfTotalModelElements
	 * @param numMainDepts
	 * @param numSubdepts
	 * @param depthOfDepts
	 * @return
	 */
	public static Long computeRequiredNumOfEmployeePerDepartment(Long numOfModelElements, int numMainDepts, 
			int numSubdepts, int depthOfDepts) {

		long totalNumOfDepts = Math.round((Math.pow(numSubdepts, depthOfDepts+1))) 
							- (numSubdepts*2) + numMainDepts;
		// num_employee_per_dept = (num_model_elements - num_tot_of_depts*4 - 1)/num_tot_of_depts	
		return Math.round(numOfModelElements-totalNumOfDepts*4-1)/totalNumOfDepts;
	}
	
	
	
	public Resource genNewModel(ResourceSet rSet, URI modelURI) {
		
		Resource resource = rSet.createResource(modelURI);
		numOfElements = 0;
		resource.getContents().add(createCompany());
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resource;
	}
	
	public company createCompany( ) {
		
		company r = CompaniesFactory.eINSTANCE.createcompany();
		numOfElements++;
		r.setName("aCompany");
		for (int i = 1; i <= NUM_DEPARTMENTS; i++) {
			currentDeptPath.push(i);
			r.getDeparment().add(createDepartment(String.valueOf(i), MAX_DEPTH_OF_SUB_DEPARTMENTS));
			currentDeptPath.pop();
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
				currentDeptPath.push(i);
				p.getDeparment().add(createDepartment(numberHint + CONST__ + String.valueOf(i), maxDepth -1));
				currentDeptPath.pop();
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
			StringBuilder sb = new StringBuilder();
			sb.append(computeTargetDeptId());
			String employeeName = isManager ? CONST_MANAGER : CONST_EMPLOYEE + String.valueOf(randIntRange(1, NUM_EMPLOYEE_PER_DEPARMENT));
			sb.append(employeeName);
			return sb.toString();
		} else{
			return null;
		}
	}
	
	private String computeTargetDeptId( ) {
		
		StringBuilder sb = new StringBuilder();
		if (MENTORS_IN_ALL_MODEL) {
			int dept = randIntRange(1, NUM_DEPARTMENTS);			
			int depth = randIntRange(1, MAX_DEPTH_OF_SUB_DEPARTMENTS);
			
			sb.append(CONST_D);
			sb.append(dept);
			sb.append(CONST__);
			for (int i = 1; i <= depth; i++) {
				int subDept = randIntRange(1, NUM_OF_SUB_DEPARTMENTS);
				sb.append(String.valueOf(subDept));
				sb.append(CONST__);
			}
		} else {
			int targetDepth = randIntRange(1, currentDeptPath.size());			
			sb.append(CONST_D);
			for (int i = 1; i <= targetDepth; i++) {
				int dept = currentDeptPath.elementAt(i-1);
				sb.append(String.valueOf(dept));
				sb.append(CONST__);
			}
		}
		return sb.toString();
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
