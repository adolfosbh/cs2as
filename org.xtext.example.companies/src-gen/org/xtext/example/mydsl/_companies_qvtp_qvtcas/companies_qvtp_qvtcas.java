/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.qvtd.cs2as.compiler.internal.CS2ASJavaCompilerImpl$CS2ASJavaCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.xtext.example.mydsl._companies_qvtp_qvtcas;

import java.util.Iterator;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.model.RootObjectsOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.xtext.base.cs2as.tx.AbstractCS2ASTransformer;
import org.xtext.example.company.Company;
import org.xtext.example.company.CompanyFactory;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.company.Department;
import org.xtext.example.company.Employee;
import org.xtext.example.company.lookup.util.CompanyLookupResult;
import org.xtext.example.company.lookup.util.CompanyLookupSolver;
import org.xtext.example.mydsl.companies.CompaniesPackage;
import org.xtext.example.mydsl.companies.company;
import org.xtext.example.mydsl.companies.department;
import org.xtext.example.mydsl.companies.department_employees;
import org.xtext.example.mydsl.companies.department_manager;
import org.xtext.example.mydsl.companies.employee;

/**
 * The companies_qvtp_qvtcas transformation:
 * <p>
 * Construct with an evaluator
 * <br>
 * Populate each input model with {@link addRootObjects(String,List)}
 * <br>
 * {@link run()}
 * <br>
 * Extract each output model with {@link getRootObjects(String)}
 */
@SuppressWarnings("nls")
public class companies_qvtp_qvtcas extends AbstractCS2ASTransformer
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_company_com = IdManager.getNsURIPackageId("http://www.company.com", null, CompanyPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/2015/QVTbaseLibrary", "qvtbaselib", null);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies = IdManager.getNsURIPackageId("http://www.xtext.org/example/mydsl/Companies", null, CompaniesPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Company = PACKid_http_c_s_s_www_company_com.getClassId("Company", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Department = PACKid_http_c_s_s_www_company_com.getClassId("Department", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_EObject = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Employee = PACKid_http_c_s_s_www_company_com.getClassId("Employee", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Model = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary.getClassId("Model", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Visitable = PACKid_http_c_s_s_www_company_com.getClassId("Visitable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_company = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("company", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department_employees = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_employees", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department_manager = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_manager", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_employee = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("employee", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull DataTypeId DATAid_EDouble = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId COL_CLSSid_department = TypeId.COLLECTION.getSpecializedId(CLSSid_department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId COL_CLSSid_employee = TypeId.COLLECTION.getSpecializedId(CLSSid_employee);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_department = TypeId.ORDERED_SET.getSpecializedId(CLSSid_department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_employee = TypeId.ORDERED_SET.getSpecializedId(CLSSid_employee);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Department = TypeId.SEQUENCE.getSpecializedId(CLSSid_Department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Employee = TypeId.SEQUENCE.getSpecializedId(CLSSid_Employee);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_OclElement = TypeId.SET.getSpecializedId(CLSSid_OclElement);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_company = TypeId.SET.getSpecializedId(CLSSid_company);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_department = TypeId.SET.getSpecializedId(CLSSid_department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_department_employees = TypeId.SET.getSpecializedId(CLSSid_department_employees);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_department_manager = TypeId.SET.getSpecializedId(CLSSid_department_manager);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_employee = TypeId.SET.getSpecializedId(CLSSid_employee);
    
    
    private final CompanyLookupSolver lookupSolver = new CompanyLookupSolver(executor);
    
    public companies_qvtp_qvtcas(final /*@NonNull*/ Executor executor) throws ReflectiveOperationException {
        super(executor, new /*@NonNull*/ String[] {"leftCS", "rightAS"}, null, null, null);
    }
    
    public boolean run() throws ReflectiveOperationException {
        return MAP___root__() && invocationManager.flush();
    }
    
    /**
     * 
     * map __root__ in companies_qvtp_qvtcas {
     * 
     *   where ( |)
     * {roots : Set(OclElement) = leftCS.rootObjects()
     *   ;
     * _'\u00ABchild-company\u00BB' : Set(companies::company[*|1]) = roots->selectByKind(companies::company)
     *   ;
     * _'\\u00ABjoin-company-0\\u00BB' : Set(companies::company[*|1]) = _'\u00ABchild-company\u00BB';
     * _'\u00ABchild-department\u00BB' : Set(companies::department[*|1]) = roots->selectByKind(companies::department)
     *   ;
     * _'\\u00ABjoin-department-0\\u00BB' : UniqueCollection(companies::department[*|1]) = _'\u00ABchild-department\u00BB';
     * _'\\u00ABjoin-department-1\\u00BB' : UniqueCollection(companies::department[*|1]) = _'\u00ABchild-department\u00BB';
     * _'\u00ABchild-department_employees\u00BB' : Set(companies::department_employees[*|1]) = roots->selectByKind(companies::department_employees)
     *   ;
     * _'\\u00ABjoin-department_employees-0\\u00BB' : Set(companies::department_employees[*|1]) = _'\u00ABchild-department_employees\u00BB';
     * _'\u00ABchild-department_manager\u00BB' : Set(companies::department_manager[*|1]) = roots->selectByKind(companies::department_manager)
     *   ;
     * _'\\u00ABjoin-department_manager-0\\u00BB' : Set(companies::department_manager[*|1]) = _'\u00ABchild-department_manager\u00BB';
     * _'\u00ABchild-employee\u00BB' : Set(companies::employee[*|1]) = roots->selectByKind(companies::employee)
     *   ;
     * _'\\u00ABjoin-employee-0\\u00BB' : UniqueCollection(companies::employee[*|1]) = _'\u00ABchild-employee\u00BB';
     *  |}
     * for loop0 : companies::company in _'\\u00ABjoin-company-0\\u00BB' {
     * 
     *     map _'companies::company::deparment' {
     * _'\\u00ABjoin-department-0\\u00BB' := _'\\u00ABjoin-department-0\\u00BB';
     * _'\\u00ABjoin-department-1\\u00BB' := _'\\u00ABjoin-department-1\\u00BB';
     * _'\\u00ABparent\\u00BB' := loop0;
     * }}
     *   for loop0 : companies::department in _'\\u00ABjoin-department-1\\u00BB' {
     * 
     *     map _'companies::department::deparment' {
     * _'\\u00ABjoin-department-0\\u00BB' := _'\\u00ABjoin-department-0\\u00BB';
     * _'\\u00ABparent\\u00BB' := loop0;
     * }}
     *   for loop0 : companies::department in _'\\u00ABjoin-department-0\\u00BB' {
     * 
     *     map _'companies::department::department_employees' {
     * _'\\u00ABjoin-department_employees-0\\u00BB' := _'\\u00ABjoin-department_employees-0\\u00BB';
     * _'\\u00ABparent\\u00BB' := loop0;
     * }}
     *   for loop0 : companies::department in _'\\u00ABjoin-department-0\\u00BB' {
     * 
     *     map _'companies::department::department_manager' {
     * _'\\u00ABjoin-department_manager-0\\u00BB' := _'\\u00ABjoin-department_manager-0\\u00BB';
     * _'\\u00ABparent\\u00BB' := loop0;
     * }}
     *   for loop0 : companies::department_employees in _'\\u00ABjoin-department_employees-0\\u00BB' {
     * 
     *     map _'companies::department_employees::employee' {
     * _'\\u00ABjoin-employee-0\\u00BB' := _'\\u00ABjoin-employee-0\\u00BB';
     * _'\\u00ABparent\\u00BB' := loop0;
     * }}
     *   for loop0 : companies::department_manager in _'\\u00ABjoin-department_manager-0\\u00BB' {
     * 
     *     map _'companies::department_manager::employee' {
     * _'\\u00ABjoin-employee-0\\u00BB' := _'\\u00ABjoin-employee-0\\u00BB';
     * _'\\u00ABparent\\u00BB' := loop0;
     * }}
     *   for loop0 : companies::company in _'\\u00ABjoin-company-0\\u00BB' {
     * 
     *     map ccompany_2_Company {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::department in _'\\u00ABjoin-department-0\\u00BB' {
     * 
     *     map cdepartment_2_Department {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::employee in _'\\u00ABjoin-employee-0\\u00BB' {
     * 
     *     map cemployee_2_Employee {
     * lEmployee := loop0;
     * }}
     *   for loop0 : companies::company in _'\\u00ABjoin-company-0\\u00BB' {
     * 
     *     map _'ucompany_2_Company_depts\\nucompany_2_Company_name' {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::department in _'\\u00ABjoin-department-0\\u00BB' {
     * 
     *     map _'udepartment_2_Department_employees\\nudepartment_2_Department_name\\nudepartment_2_Department_subdepts' {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::department in _'\\u00ABjoin-department-0\\u00BB' {
     * 
     *     map udepartment_2_Department_manager {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::employee in _'\\u00ABjoin-employee-0\\u00BB' {
     * 
     *     map _'uemployee_2_Employee_address\\nuemployee_2_Employee_name\\nuemployee_2_Employee_salary' {
     * lEmployee := loop0;
     * }}
     *   for loop0 : companies::employee in _'\\u00ABjoin-employee-0\\u00BB' {
     * 
     *     map uemployee_2_Employee_mentor {
     * lEmployee := loop0;
     * }}
     */
    protected boolean MAP___root__() throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_company_0 = idResolver.getClass(CLSSid_company, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_0 = idResolver.getClass(CLSSid_department, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_employees_0 = idResolver.getClass(CLSSid_department_employees, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_manager_0 = idResolver.getClass(CLSSid_department_manager, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_employee_0 = idResolver.getClass(CLSSid_employee, null);
        // variable assignments
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue rootObjects = RootObjectsOperation.INSTANCE.evaluate(executor, SET_CLSSid_OclElement, models[0/*leftCS*/]);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, rootObjects, TYP_companies_c_c_company_0);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind_0 = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, rootObjects, TYP_companies_c_c_department_0);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind_1 = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, rootObjects, TYP_companies_c_c_department_employees_0);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind_2 = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, rootObjects, TYP_companies_c_c_department_manager_0);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind_3 = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, rootObjects, TYP_companies_c_c_employee_0);
        // connection variables
        final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_m_0_92_u00BB_3 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_department);
        for (department iterator : ValueUtil.typedIterable(department.class, selectByKind_0)) {
            _92_u00ABjoin_m_department_m_0_92_u00BB_3.add(iterator);
        }
        final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_m_1_92_u00BB_1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_department);
        for (department iterator_0 : ValueUtil.typedIterable(department.class, selectByKind_0)) {
            _92_u00ABjoin_m_department_m_1_92_u00BB_1.add(iterator_0);
        }
        final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_employees_m_0_92_u00BB_1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_department_employees);
        for (department_employees iterator_1 : ValueUtil.typedIterable(department_employees.class, selectByKind_1)) {
            _92_u00ABjoin_m_department_employees_m_0_92_u00BB_1.add(iterator_1);
        }
        final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_manager_m_0_92_u00BB_1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_department_manager);
        for (department_manager iterator_2 : ValueUtil.typedIterable(department_manager.class, selectByKind_2)) {
            _92_u00ABjoin_m_department_manager_m_0_92_u00BB_1.add(iterator_2);
        }
        final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_employee_m_0_92_u00BB_3 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_employee);
        for (employee iterator_3 : ValueUtil.typedIterable(employee.class, selectByKind_3)) {
            _92_u00ABjoin_m_employee_m_0_92_u00BB_3.add(iterator_3);
        }
        // mapping statements
        for (company loop0 : ValueUtil.typedIterable(company.class, selectByKind)) {
            if (loop0 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company symbol_0 = (company)loop0;
                MAP_companies_58_58company_58_58deparment(_92_u00ABjoin_m_department_m_0_92_u00BB_3, _92_u00ABjoin_m_department_m_1_92_u00BB_1, symbol_0);
            }
        }
        for (department loop0_0 : ValueUtil.typedIterable(department.class, _92_u00ABjoin_m_department_m_1_92_u00BB_1)) {
            if (loop0_0 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_2 = (department)loop0_0;
                MAP_companies_58_58department_58_58deparment(_92_u00ABjoin_m_department_m_0_92_u00BB_3, symbol_2);
            }
        }
        for (department loop0_1 : ValueUtil.typedIterable(department.class, _92_u00ABjoin_m_department_m_0_92_u00BB_3)) {
            if (loop0_1 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_4 = (department)loop0_1;
                MAP_companies_58_58department_58_58department_employees(_92_u00ABjoin_m_department_employees_m_0_92_u00BB_1, symbol_4);
            }
        }
        for (department loop0_2 : ValueUtil.typedIterable(department.class, _92_u00ABjoin_m_department_m_0_92_u00BB_3)) {
            if (loop0_2 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_6 = (department)loop0_2;
                MAP_companies_58_58department_58_58department_manager(_92_u00ABjoin_m_department_manager_m_0_92_u00BB_1, symbol_6);
            }
        }
        for (department_employees loop0_3 : ValueUtil.typedIterable(department_employees.class, _92_u00ABjoin_m_department_employees_m_0_92_u00BB_1)) {
            if (loop0_3 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department_employees symbol_8 = (department_employees)loop0_3;
                MAP_companies_58_58department_employees_58_58employee(_92_u00ABjoin_m_employee_m_0_92_u00BB_3, symbol_8);
            }
        }
        for (department_manager loop0_4 : ValueUtil.typedIterable(department_manager.class, _92_u00ABjoin_m_department_manager_m_0_92_u00BB_1)) {
            if (loop0_4 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department_manager symbol_10 = (department_manager)loop0_4;
                MAP_companies_58_58department_manager_58_58employee(_92_u00ABjoin_m_employee_m_0_92_u00BB_3, symbol_10);
            }
        }
        for (company loop0_5 : ValueUtil.typedIterable(company.class, selectByKind)) {
            if (loop0_5 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company symbol_12 = (company)loop0_5;
                if (symbol_12 != null) {
                    MAP_ccompany_2_Company(symbol_12);
                }
            }
        }
        for (department loop0_6 : ValueUtil.typedIterable(department.class, _92_u00ABjoin_m_department_m_0_92_u00BB_3)) {
            if (loop0_6 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_14 = (department)loop0_6;
                if (symbol_14 != null) {
                    MAP_cdepartment_2_Department(symbol_14);
                }
            }
        }
        for (employee loop0_7 : ValueUtil.typedIterable(employee.class, _92_u00ABjoin_m_employee_m_0_92_u00BB_3)) {
            if (loop0_7 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee symbol_16 = (employee)loop0_7;
                if (symbol_16 != null) {
                    MAP_cemployee_2_Employee(symbol_16);
                }
            }
        }
        for (company loop0_8 : ValueUtil.typedIterable(company.class, selectByKind)) {
            if (loop0_8 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company symbol_18 = (company)loop0_8;
                if (symbol_18 != null) {
                    MAP_ucompany_2_Company_depts_92nucompany_2_Company_name(symbol_18);
                }
            }
        }
        for (department loop0_9 : ValueUtil.typedIterable(department.class, _92_u00ABjoin_m_department_m_0_92_u00BB_3)) {
            if (loop0_9 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_20 = (department)loop0_9;
                if (symbol_20 != null) {
                    MAP_udepartment_2_Department_employees_92nudepartment_2_Department_name_92nudepartment_2_Department_subdepts(symbol_20);
                }
            }
        }
        for (department loop0_10 : ValueUtil.typedIterable(department.class, _92_u00ABjoin_m_department_m_0_92_u00BB_3)) {
            if (loop0_10 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_22 = (department)loop0_10;
                if (symbol_22 != null) {
                    MAP_udepartment_2_Department_manager(symbol_22);
                }
            }
        }
        for (employee loop0_11 : ValueUtil.typedIterable(employee.class, _92_u00ABjoin_m_employee_m_0_92_u00BB_3)) {
            if (loop0_11 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee symbol_24 = (employee)loop0_11;
                if (symbol_24 != null) {
                    MAP_uemployee_2_Employee_address_92nuemployee_2_Employee_name_92nuemployee_2_Employee_salary(symbol_24);
                }
            }
        }
        for (employee loop0_12 : ValueUtil.typedIterable(employee.class, _92_u00ABjoin_m_employee_m_0_92_u00BB_3)) {
            if (loop0_12 != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee symbol_26 = (employee)loop0_12;
                if (symbol_26 != null) {
                    MAP_uemployee_2_Employee_mentor(symbol_26);
                }
            }
        }
        return true;
    }
    
    /**
     * 
     * map ccompany_2_Company in companies_qvtp_qvtcas {
     * leftCS (lCompany : companies::company[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rCompany : company::Company[1];
     *  |}
     * where ( |)
     * { |
     * lCompany.ast := rCompany;
     * }
     * 
     */
    protected boolean MAP_ccompany_2_Company(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Company rCompany = CompanyFactory.eINSTANCE.createCompany();
        assert rCompany != null;
        models[1/*rightAS*/].add(rCompany);
        // property assignments
        lCompany.setAst(rCompany);
        return true;
    }
    
    /**
     * 
     * map cdepartment_2_Department in companies_qvtp_qvtcas {
     * leftCS (lDepartment : companies::department[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rDepartment : company::Department[1];
     *  |}
     * where ( |)
     * { |
     * lDepartment.ast := rDepartment;
     * }
     * 
     */
    protected boolean MAP_cdepartment_2_Department(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Department rDepartment = CompanyFactory.eINSTANCE.createDepartment();
        assert rDepartment != null;
        models[1/*rightAS*/].add(rDepartment);
        // property assignments
        lDepartment.setAst(rDepartment);
        return true;
    }
    
    /**
     * 
     * map cemployee_2_Employee in companies_qvtp_qvtcas {
     * leftCS (lEmployee : companies::employee[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rEmployee : company::Employee[1];
     *  |}
     * where ( |)
     * { |
     * lEmployee.ast := rEmployee;
     * }
     * 
     */
    protected boolean MAP_cemployee_2_Employee(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee rEmployee = CompanyFactory.eINSTANCE.createEmployee();
        assert rEmployee != null;
        models[1/*rightAS*/].add(rEmployee);
        // property assignments
        lEmployee.setAst(rEmployee);
        return true;
    }
    
    /**
     * 
     * map _'companies::company::deparment' in companies_qvtp_qvtcas {
     * 
     *   leftCS (_'\\u00ABparent\\u00BB' : companies::company[1];
     *  |)
     * { |}
     * where (_'\\u00ABjoin-department-1\\u00BB' : UniqueCollection(companies::department[*|1]);
     * _'\\u00ABjoin-department-0\\u00BB' : UniqueCollection(companies::department[*|1]);
     *  |)
     * {allChildren : OrderedSet(companies::department) = _'\\u00ABparent\\u00BB'.deparment->selectByKind(companies::department)
     *   ;
     * _'\u00ABchild-department\u00BB' : OrderedSet(companies::department[*|1]) = allChildren->selectByKind(companies::department);
     *  |
     * _'\\u00ABjoin-department-1\\u00BB' += _'\u00ABchild-department\u00BB';
     * _'\\u00ABjoin-department-0\\u00BB' += _'\u00ABchild-department\u00BB';
     * }
     * 
     */
    protected boolean MAP_companies_58_58company_58_58deparment(final CollectionValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_m_0_92_u00BB, final CollectionValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_m_1_92_u00BB, final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company _92_u00ABparent_92_u00BB) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_1 = idResolver.getClass(CLSSid_department, null);
        // variable assignments
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = _92_u00ABparent_92_u00BB.getDeparment();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_deparment, TYP_companies_c_c_department_1);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind_0 = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, selectByKind, TYP_companies_c_c_department_1);
        // connection assignments
        for (department iterator : ValueUtil.typedIterable(department.class, selectByKind_0)) {
            if (iterator instanceof department) {
                _92_u00ABjoin_m_department_m_1_92_u00BB.add(iterator);
            }
        }
        for (department iterator_0 : ValueUtil.typedIterable(department.class, selectByKind_0)) {
            if (iterator_0 instanceof department) {
                _92_u00ABjoin_m_department_m_0_92_u00BB.add(iterator_0);
            }
        }
        return true;
    }
    
    /**
     * 
     * map _'companies::department::deparment' in companies_qvtp_qvtcas {
     * 
     *   leftCS (_'\\u00ABparent\\u00BB' : companies::department[1];
     *  |)
     * { |}
     * where (_'\\u00ABjoin-department-0\\u00BB' : UniqueCollection(companies::department[*|1]);
     *  |)
     * {allChildren : OrderedSet(companies::department) = _'\\u00ABparent\\u00BB'.deparment->selectByKind(companies::department)
     *   ;
     * _'\u00ABchild-department\u00BB' : OrderedSet(companies::department[*|1]) = allChildren->selectByKind(companies::department)
     *   ;
     *  |
     * _'\\u00ABjoin-department-0\\u00BB' += _'\u00ABchild-department\u00BB';
     * }
     * for aChild : companies::department in allChildren {
     * 
     *     map _'companies::department::deparment' {
     * _'\\u00ABjoin-department-0\\u00BB' := _'\\u00ABjoin-department-0\\u00BB';
     * _'\\u00ABparent\\u00BB' := aChild;
     * }}
     */
    protected boolean MAP_companies_58_58department_58_58deparment(final CollectionValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_m_0_92_u00BB_0, final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department _92_u00ABparent_92_u00BB_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_1 = idResolver.getClass(CLSSid_department, null);
        // variable assignments
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = _92_u00ABparent_92_u00BB_0.getDeparment();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_deparment, TYP_companies_c_c_department_1);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind_0 = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, selectByKind, TYP_companies_c_c_department_1);
        // connection assignments
        for (department iterator : ValueUtil.typedIterable(department.class, selectByKind_0)) {
            if (iterator instanceof department) {
                _92_u00ABjoin_m_department_m_0_92_u00BB_0.add(iterator);
            }
        }
        // mapping statements
        for (department aChild : ValueUtil.typedIterable(department.class, selectByKind)) {
            if (aChild != null) {
                final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department symbol_0 = (department)aChild;
                MAP_companies_58_58department_58_58deparment(_92_u00ABjoin_m_department_m_0_92_u00BB_0, symbol_0);
            }
        }
        return true;
    }
    
    /**
     * 
     * map _'companies::department::department_employees' in companies_qvtp_qvtcas {
     * 
     *   leftCS (_'\\u00ABparent\\u00BB' : companies::department[1];
     *  |)
     * { |}
     * where (_'\\u00ABjoin-department_employees-0\\u00BB' : Set(companies::department_employees[*|1]);
     *  |)
     * {allChildren : Set(companies::department_employees[*|1]) = _'\\u00ABparent\\u00BB'.department_employees.oclAsSet()
     *   ;
     * _'\u00ABchild-department_employees\u00BB' : Set(companies::department_employees[*|1]) = allChildren->selectByKind(companies::department_employees);
     *  |
     * _'\\u00ABjoin-department_employees-0\\u00BB' += _'\u00ABchild-department_employees\u00BB';
     * }
     * 
     */
    protected boolean MAP_companies_58_58department_58_58department_employees(final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_employees_m_0_92_u00BB, final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department _92_u00ABparent_92_u00BB_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_employees_0 = idResolver.getClass(CLSSid_department_employees, null);
        // variable assignments
        final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_employees department_employees = _92_u00ABparent_92_u00BB_1.getDepartment_employees();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_department_employees, department_employees);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, oclAsSet, TYP_companies_c_c_department_employees_0);
        // connection assignments
        for (department_employees iterator : ValueUtil.typedIterable(department_employees.class, selectByKind)) {
            if (iterator instanceof department_employees) {
                _92_u00ABjoin_m_department_employees_m_0_92_u00BB.add(iterator);
            }
        }
        return true;
    }
    
    /**
     * 
     * map _'companies::department::department_manager' in companies_qvtp_qvtcas {
     * 
     *   leftCS (_'\\u00ABparent\\u00BB' : companies::department[1];
     *  |)
     * { |}
     * where (_'\\u00ABjoin-department_manager-0\\u00BB' : Set(companies::department_manager[*|1]);
     *  |)
     * {allChildren : Set(companies::department_manager[*|1]) = _'\\u00ABparent\\u00BB'.department_manager.oclAsSet()
     *   ;
     * _'\u00ABchild-department_manager\u00BB' : Set(companies::department_manager[*|1]) = allChildren->selectByKind(companies::department_manager);
     *  |
     * _'\\u00ABjoin-department_manager-0\\u00BB' += _'\u00ABchild-department_manager\u00BB';
     * }
     * 
     */
    protected boolean MAP_companies_58_58department_58_58department_manager(final SetValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_department_manager_m_0_92_u00BB, final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department _92_u00ABparent_92_u00BB_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_manager_0 = idResolver.getClass(CLSSid_department_manager, null);
        // variable assignments
        final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_manager department_manager = _92_u00ABparent_92_u00BB_2.getDepartment_manager();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_department_manager, department_manager);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, oclAsSet, TYP_companies_c_c_department_manager_0);
        // connection assignments
        for (department_manager iterator : ValueUtil.typedIterable(department_manager.class, selectByKind)) {
            if (iterator instanceof department_manager) {
                _92_u00ABjoin_m_department_manager_m_0_92_u00BB.add(iterator);
            }
        }
        return true;
    }
    
    /**
     * 
     * map _'companies::department_employees::employee' in companies_qvtp_qvtcas {
     * 
     *   leftCS (_'\\u00ABparent\\u00BB' : companies::department_employees[1];
     *  |)
     * { |}
     * where (_'\\u00ABjoin-employee-0\\u00BB' : UniqueCollection(companies::employee[*|1]);
     *  |)
     * {allChildren : OrderedSet(companies::employee) = _'\\u00ABparent\\u00BB'.employee->selectByKind(companies::employee)
     *   ;
     * _'\u00ABchild-employee\u00BB' : OrderedSet(companies::employee[*|1]) = allChildren->selectByKind(companies::employee);
     *  |
     * _'\\u00ABjoin-employee-0\\u00BB' += _'\u00ABchild-employee\u00BB';
     * }
     * 
     */
    protected boolean MAP_companies_58_58department_employees_58_58employee(final CollectionValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_employee_m_0_92_u00BB, final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department_employees _92_u00ABparent_92_u00BB_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_employee_1 = idResolver.getClass(CLSSid_employee, null);
        // variable assignments
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<employee> employee = _92_u00ABparent_92_u00BB_3.getEmployee();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_employee = idResolver.createOrderedSetOfAll(ORD_CLSSid_employee, employee);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_employee, TYP_companies_c_c_employee_1);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind_0 = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, selectByKind, TYP_companies_c_c_employee_1);
        // connection assignments
        for (employee iterator : ValueUtil.typedIterable(employee.class, selectByKind_0)) {
            if (iterator instanceof employee) {
                _92_u00ABjoin_m_employee_m_0_92_u00BB.add(iterator);
            }
        }
        return true;
    }
    
    /**
     * 
     * map _'companies::department_manager::employee' in companies_qvtp_qvtcas {
     * 
     *   leftCS (_'\\u00ABparent\\u00BB' : companies::department_manager[1];
     *  |)
     * { |}
     * where (_'\\u00ABjoin-employee-0\\u00BB' : UniqueCollection(companies::employee[*|1]);
     *  |)
     * {allChildren : Set(companies::employee[*|1]) = _'\\u00ABparent\\u00BB'.employee.oclAsSet()
     *   ;
     * _'\u00ABchild-employee\u00BB' : Set(companies::employee[*|1]) = allChildren->selectByKind(companies::employee);
     *  |
     * _'\\u00ABjoin-employee-0\\u00BB' += _'\u00ABchild-employee\u00BB';
     * }
     * 
     */
    protected boolean MAP_companies_58_58department_manager_58_58employee(final CollectionValue./*@NonNull*/ Accumulator _92_u00ABjoin_m_employee_m_0_92_u00BB_0, final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department_manager _92_u00ABparent_92_u00BB_4) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_employee_0 = idResolver.getClass(CLSSid_employee, null);
        // variable assignments
        final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable employee employee = _92_u00ABparent_92_u00BB_4.getEmployee();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_employee, employee);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue selectByKind = (SetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, oclAsSet, TYP_companies_c_c_employee_0);
        // connection assignments
        for (employee iterator : ValueUtil.typedIterable(employee.class, selectByKind)) {
            if (iterator instanceof employee) {
                _92_u00ABjoin_m_employee_m_0_92_u00BB_0.add(iterator);
            }
        }
        return true;
    }
    
    /**
     * 
     * map _'ucompany_2_Company_depts\\nucompany_2_Company_name' in companies_qvtp_qvtcas {
     * 
     *   leftCS (lCompany : companies::company[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {ast : ecore::EObject[?] = lCompany.ast;
     * name : String[?] = lCompany.name;
     * deparment : OrderedSet(companies::department) = lCompany.deparment;
     * aCompany : company::Company[1] = ast.oclAsType(company::Company)
     *   ;
     * _'\\u00ABcollect\\u00BB' : Sequence(company::Department) = deparment->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Department));
     *  |
     * aCompany.depts := _'\\u00ABcollect\\u00BB';
     * aCompany.name := name;
     * }
     * 
     */
    protected boolean MAP_ucompany_2_Company_depts_92nucompany_2_Company_name(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Company_0 = idResolver.getClass(CLSSid_Company, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lCompany_0.getAst();
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lCompany_0.getName();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = lCompany_0.getDeparment();
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Company oclAsType = ClassUtil.nonNullState((Company)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Company_0));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_deparment.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department _1 = (department)ITERATOR__1.next();
            /**
             * _'1_'.ast.oclAsType(company::Department)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
            if (_1 == null) {
                throw throwNull(lCompany_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
            }
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = _1.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
        oclAsType.getDepts().addAll(ECORE_collect);
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map _'udepartment_2_Department_employees\\nudepartment_2_Department_name\\nudepartment_2_Department_subdepts' in companies_qvtp_qvtcas {
     * 
     *   leftCS (lDepartment : companies::department[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {ast : ecore::EObject[?] = lDepartment.ast;
     * name : String[?] = lDepartment.name;
     * deparment : OrderedSet(companies::department) = lDepartment.deparment;
     * department_employees : companies::department_employees[?] = lDepartment.department_employees;
     * aDepartment : company::Department[1] = ast.oclAsType(company::Department)
     *   ;
     * employee : OrderedSet(companies::employee) = department_employees.employee;
     * _'\\u00ABcollect\\u00BB' : Sequence(company::Department) = deparment->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Department))
     *   ;
     * _'\\u00ABcollect\\u00BB1' : Sequence(company::Employee) = employee->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Employee));
     *  |
     * aDepartment.employees := _'\\u00ABcollect\\u00BB1';
     * aDepartment.name := name;
     * aDepartment.subdepts := _'\\u00ABcollect\\u00BB';
     * }
     * 
     */
    protected boolean MAP_udepartment_2_Department_employees_92nudepartment_2_Department_name_92nudepartment_2_Department_subdepts(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_0.getAst();
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lDepartment_0.getName();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = lDepartment_0.getDeparment();
        final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_employees department_employees = lDepartment_0.getDepartment_employees();
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
        if (department_employees == null) {
            throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_employees::employee\'");
        }
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<employee> employee = department_employees.getEmployee();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_deparment.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department _1 = (department)ITERATOR__1.next();
            /**
             * _'1_'.ast.oclAsType(company::Department)
             */
            if (_1 == null) {
                throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
            }
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = _1.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
            //
            accumulator.add(oclAsType_0);
        }
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_employee = idResolver.createOrderedSetOfAll(ORD_CLSSid_employee, employee);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Employee);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = BOXED_employee.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect_0 = accumulator_0;
                break;
            }
            /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable employee _1_0 = (employee)ITERATOR__1_0.next();
            /**
             * _'1_'.ast.oclAsType(company::Employee)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
            if (_1_0 == null) {
                throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
            }
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1_0.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType_1 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_company_c_c_Employee_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> ECORE_collect_0 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, collect_0);
        oclAsType.getEmployees().addAll(ECORE_collect_0);
        oclAsType.setName(name);
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
        oclAsType.getSubdepts().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map udepartment_2_Department_manager in companies_qvtp_qvtcas {
     * 
     *   leftCS (lDepartment : companies::department[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {ast : ecore::EObject[?] = lDepartment.ast;
     * department_manager : companies::department_manager[?] = lDepartment.department_manager;
     * aDepartment : company::Department[1] = ast.oclAsType(company::Department)
     *   ;
     * employee : companies::employee[?] = department_manager.employee;
     * ast1 : ecore::EObject[?] = employee.ast;
     * aEmployee : company::Employee[1] = ast1.oclAsType(company::Employee);
     *  |
     * aDepartment.manager := aEmployee;
     * }
     * 
     */
    protected boolean MAP_udepartment_2_Department_manager(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_1.getAst();
        final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_manager department_manager = lDepartment_1.getDepartment_manager();
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
        if (department_manager == null) {
            throw throwNull(lDepartment_1, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_manager::employee\'");
        }
        final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable employee employee = department_manager.getEmployee();
        if (employee == null) {
            throw throwNull(lDepartment_1, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
        }
        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = employee.getAst();
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType_0 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Employee_0));
        // property assignments
        oclAsType.setManager(oclAsType_0);
        return true;
    }
    
    /**
     * 
     * map _'uemployee_2_Employee_address\\nuemployee_2_Employee_name\\nuemployee_2_Employee_salary' in companies_qvtp_qvtcas {
     * 
     *   leftCS (lEmployee : companies::employee[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {ast : ecore::EObject[?] = lEmployee.ast;
     * name : String[?] = lEmployee.name;
     * address : String[?] = lEmployee.address;
     * salary : ecore::EDouble[?] = lEmployee.salary;
     * aEmployee : company::Employee[1] = ast.oclAsType(company::Employee);
     *  |
     * aEmployee.address := address;
     * aEmployee.name := name;
     * aEmployee.salary := salary;
     * }
     * 
     */
    protected boolean MAP_uemployee_2_Employee_address_92nuemployee_2_Employee_name_92nuemployee_2_Employee_salary(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lEmployee_0.getAst();
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lEmployee_0.getName();
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String address = lEmployee_0.getAddress();
        final /*@Thrown*/ double salary = lEmployee_0.getSalary();
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
        // property assignments
        oclAsType.setAddress(address);
        oclAsType.setName(name);
        oclAsType.setSalary(salary);
        return true;
    }
    
    /**
     * 
     * map uemployee_2_Employee_mentor in companies_qvtp_qvtcas {
     * 
     *   leftCS (lEmployee : companies::employee[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {ast : ecore::EObject[?] = lEmployee.ast;
     * mentor : String[?] = lEmployee.mentor;
     * aEmployee : company::Employee[1] = ast.oclAsType(company::Employee)
     *   ;
     * mentor1 : company::Employee[?] = aEmployee.lookupEmployee(mentor);
     *  |
     * aEmployee.mentor := mentor1;
     * }
     * 
     */
    protected boolean MAP_uemployee_2_Employee_mentor(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lEmployee_1.getAst();
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String mentor = lEmployee_1.getMentor();
        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
        final /*@Thrown*/ boolean eq = mentor == null;
        /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee symbol_0;
        if (eq) {
            symbol_0 = null;
        }
        else {
            CompanyLookupResult<Employee> _lookupResult = lookupSolver._lookupEmployee(oclAsType, mentor);
            Employee _lookupEmployee = null;
            if (_lookupResult.size() == 1) {
                _lookupEmployee = _lookupResult.getSingleResult();
            } else {
                handleLookupError(lEmployee_1,mentor);
            };
            symbol_0 = _lookupEmployee;
        }
        // property assignments
        oclAsType.setMentor(symbol_0);
        return true;
    }
}
