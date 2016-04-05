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
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.model.ModelObjectsOfKindOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.xtext.base.cs2as.tx.AbstractCS2ASTransformer;
import org.xtext.example.company.Company;
import org.xtext.example.company.CompanyFactory;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.company.Department;
import org.xtext.example.company.Employee;
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
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_company = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("company", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department_employees = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_employees", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department_manager = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_manager", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_employee = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("employee", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull DataTypeId DATAid_EDouble = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_department = TypeId.ORDERED_SET.getSpecializedId(CLSSid_department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_employee = TypeId.ORDERED_SET.getSpecializedId(CLSSid_employee);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Department = TypeId.SEQUENCE.getSpecializedId(CLSSid_Department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Employee = TypeId.SEQUENCE.getSpecializedId(CLSSid_Employee);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_company = TypeId.SET.getSpecializedId(CLSSid_company);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_department = TypeId.SET.getSpecializedId(CLSSid_department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_employee = TypeId.SET.getSpecializedId(CLSSid_employee);
    
    /*
     * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
     */
    private static final @NonNull ClassId[] classIndex2classId = new @NonNull ClassId[]{
        CLSSid_company,                 // 0 => company
        CLSSid_department,              // 1 => department
        CLSSid_employee                 // 2 => employee
    };
    
    /*
     * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
     * may contribute results to an allInstances() invocation.
     * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
     * instance of the derived classId contributes to derived and inherited ClassIndexes.
     */
    private final static int @NonNull [] @NonNull [] classIndex2allClassIndexes = new int @NonNull [] @NonNull [] {
        {0},                    // 0 : company -> {company}
        {1},                    // 1 : department -> {department}
        {2}                     // 2 : employee -> {employee}
    };
    
    private final CompanyLookupSolver lookupSolver = new CompanyLookupSolver(executor);
    
    public companies_qvtp_qvtcas(final @NonNull Executor executor) throws ReflectiveOperationException {
        super(executor, new @NonNull String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    @Override
    public boolean run() throws ReflectiveOperationException {
        return MAP___root__() && invocationManager.flush();
    }
    
    /**
     * 
     * map __root__ in companies_qvtp_qvtcas {
     *   where ( |)
     * {_'\u00ABcompany\u00BB' : Set(companies::company) = leftCS.objectsOfKind(companies::company)
     *   ;
     * ji_company1 : Set(companies::company[*|1]) = _'\u00ABcompany\u00BB';
     * _'\u00ABdepartment\u00BB' : Set(companies::department) = leftCS.objectsOfKind(companies::department)
     *   ;
     * ji_department1 : Set(companies::department[*|1]) = _'\u00ABdepartment\u00BB';
     * _'\u00ABemployee\u00BB' : Set(companies::employee) = leftCS.objectsOfKind(companies::employee)
     *   ;
     * ji_employee1 : Set(companies::employee[*|1]) = _'\u00ABemployee\u00BB';
     *  |}
     * for loop0 : companies::company in ji_company1 {
     *     call m_company_ast {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::department in ji_department1 {
     *     call m_department_ast {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::employee in ji_employee1 {
     *     call m_employee_ast {
     * lEmployee := loop0;
     * }}
     *   for loop0 : companies::company in ji_company1 {
     *     call m_company_ast_deparment_name {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::department in ji_department1 {
     *     call m_department_ast_deparment_department__employees_n {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::department in ji_department1 {
     *     call m_department_ast_department__manager {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::employee in ji_employee1 {
     *     call m_employee_address_ast_name_salary {
     * lEmployee := loop0;
     * }}
     */
    protected boolean MAP___root__() throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_company_0 = idResolver.getClass(CLSSid_company, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_company_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_company, models[0/*leftCS*/], TYP_companies_c_c_company_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_0 = idResolver.getClass(CLSSid_department, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_department_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_department, models[0/*leftCS*/], TYP_companies_c_c_department_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_employee_0 = idResolver.getClass(CLSSid_employee, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_employee_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_employee, models[0/*leftCS*/], TYP_companies_c_c_employee_0);
            // connection variables
            final SetValue.@NonNull Accumulator ji_company1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_company);
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company iterator : ValueUtil.typedIterable(company.class, _171_company_187)) {
                ji_company1.add(iterator);
            }
            final SetValue.@NonNull Accumulator ji_department1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_department);
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department iterator_0 : ValueUtil.typedIterable(department.class, _171_department_187)) {
                ji_department1.add(iterator_0);
            }
            final SetValue.@NonNull Accumulator ji_employee1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_employee);
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee iterator_1 : ValueUtil.typedIterable(employee.class, _171_employee_187)) {
                ji_employee1.add(iterator_1);
            }
            // mapping statements
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company loop0 : ValueUtil.typedIterable(company.class, ji_company1)) {
                MAP_m_company_ast(loop0);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_0 : ValueUtil.typedIterable(department.class, ji_department1)) {
                MAP_m_department_ast(loop0_0);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee loop0_1 : ValueUtil.typedIterable(employee.class, ji_employee1)) {
                MAP_m_employee_ast(loop0_1);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company loop0_2 : ValueUtil.typedIterable(company.class, ji_company1)) {
                MAP_m_company_ast_deparment_name(loop0_2);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_3 : ValueUtil.typedIterable(department.class, ji_department1)) {
                MAP_m_department_ast_deparment_department__employees_n(loop0_3);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_4 : ValueUtil.typedIterable(department.class, ji_department1)) {
                MAP_m_department_ast_department__manager(loop0_4);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee loop0_5 : ValueUtil.typedIterable(employee.class, ji_employee1)) {
                MAP_m_employee_address_ast_name_salary(loop0_5);
            }
            boolean __root__ = ValueUtil.TRUE_VALUE;
            return __root__;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP___root__", e);
        }
    }
    
    /**
     * 
     * map m_company_ast in companies_qvtp_qvtcas {leftCS (lCompany : companies::company[?];
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
    protected boolean MAP_m_company_ast(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Company rCompany = CompanyFactory.eINSTANCE.createCompany();
            assert rCompany != null;
            models[1/*rightAS*/].add(rCompany);
            // property assignments
            lCompany.setAst(rCompany);
            boolean m_company_ast = ValueUtil.TRUE_VALUE;
            return m_company_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_company_ast", e);
        }
    }
    
    /**
     * 
     * map m_company_ast_deparment_name in companies_qvtp_qvtcas {
     *   leftCS (lCompany : companies::company[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {deparment : OrderedSet(companies::department) = lCompany.deparment;
     * name : String[?] = lCompany.name;
     * ast : ecore::EObject[?] = lCompany.ast;
     * aCompany : company::Company[1] = lCompany.ast.oclAsType(company::Company)
     *   ;
     * _'\u00ABcollect\u00BB' : Sequence(company::Department) = deparment->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Department));
     *  |
     * aCompany.depts := _'\u00ABcollect\u00BB';
     * aCompany.name := name;
     * }
     * 
     */
    protected boolean MAP_m_company_ast_deparment_name(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            @SuppressWarnings("null")
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = lCompany_0.getDeparment();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lCompany_0.getName();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lCompany_0.getAst();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Company_0 = idResolver.getClass(CLSSid_Company, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lCompany_0.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Company aCompany = ClassUtil.nonNullState((Company)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Company_0));
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
            @Nullable Iterator<Object> ITERATOR__1 = BOXED_deparment.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    _171_collect_187 = accumulator;
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
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1.getAst();
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_company_c_c_Department_0));
                //
                accumulator.add(oclAsType);
            }
            // property assignments
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> ECORE__171_collect_187 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, _171_collect_187);
            aCompany.getDepts().addAll(ECORE__171_collect_187);
            if (name == null) {
                throw throwNull(lCompany_0, "Null value");
            }
            aCompany.setName(name);
            boolean m_company_ast_deparment_name = ValueUtil.TRUE_VALUE;
            return m_company_ast_deparment_name;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_company_ast_deparment_name", e);
        }
    }
    
    /**
     * 
     * map m_department_ast in companies_qvtp_qvtcas {leftCS (lDepartment : companies::department[?];
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
    protected boolean MAP_m_department_ast(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Department rDepartment = CompanyFactory.eINSTANCE.createDepartment();
            assert rDepartment != null;
            models[1/*rightAS*/].add(rDepartment);
            // property assignments
            lDepartment.setAst(rDepartment);
            boolean m_department_ast = ValueUtil.TRUE_VALUE;
            return m_department_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast", e);
        }
    }
    
    /**
     * 
     * map m_department_ast_deparment_department__employees_n in companies_qvtp_qvtcas {
     *   leftCS (lDepartment : companies::department[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {deparment : OrderedSet(companies::department) = lDepartment.deparment;
     * department_employees : companies::department_employees[?] = lDepartment.department_employees;
     * name : String[?] = lDepartment.name;
     * ast : ecore::EObject[?] = lDepartment.ast;
     * employee : OrderedSet(companies::employee) = department_employees.employee;
     * aDepartment : company::Department[1] = lDepartment.ast.oclAsType(company::Department)
     *   ;
     * _'\u00ABcollect\u00BB' : Sequence(company::Employee) = employee->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Employee))
     *   ;
     * _'\u00ABcollect\u00BB1' : Sequence(company::Department) = deparment->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Department));
     *  |
     * aDepartment.employees := _'\u00ABcollect\u00BB';
     * aDepartment.name := name;
     * aDepartment.subdepts := _'\u00ABcollect\u00BB1';
     * }
     * 
     */
    protected boolean MAP_m_department_ast_deparment_department__employees_n(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            @SuppressWarnings("null")
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = lDepartment_0.getDeparment();
            final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_employees department_employees = lDepartment_0.getDepartment_employees();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lDepartment_0.getName();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_0.getAst();
            if (department_employees == null) {
                throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_employees::employee\'");
            }
            @SuppressWarnings("null")
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<employee> employee = department_employees.getEmployee();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lDepartment_0.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department aDepartment = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_employee = idResolver.createOrderedSetOfAll(ORD_CLSSid_employee, employee);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Employee);
            @Nullable Iterator<Object> ITERATOR__1 = BOXED_employee.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    _171_collect_187 = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable employee _1 = (employee)ITERATOR__1.next();
                /**
                 * _'1_'.ast.oclAsType(company::Employee)
                 */
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
                if (_1 == null) {
                    throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
                }
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1.getAst();
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_company_c_c_Employee_0));
                //
                accumulator.add(oclAsType);
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
            @Nullable Iterator<Object> ITERATOR__1_0 = BOXED_deparment.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187_1;
            while (true) {
                if (!ITERATOR__1_0.hasNext()) {
                    _171_collect_187_1 = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department _1_0 = (department)ITERATOR__1_0.next();
                /**
                 * _'1_'.ast.oclAsType(company::Department)
                 */
                if (_1_0 == null) {
                    throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
                }
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_2 = _1_0.getAst();
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_2, TYP_company_c_c_Department_0));
                //
                accumulator_0.add(oclAsType_0);
            }
            // property assignments
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> ECORE__171_collect_187 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, _171_collect_187);
            aDepartment.getEmployees().addAll(ECORE__171_collect_187);
            if (name == null) {
                throw throwNull(lDepartment_0, "Null value");
            }
            aDepartment.setName(name);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> ECORE__171_collect_187_1 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, _171_collect_187_1);
            aDepartment.getSubdepts().addAll(ECORE__171_collect_187_1);
            boolean m_department_ast_deparment_department__employees_n = ValueUtil.TRUE_VALUE;
            return m_department_ast_deparment_department__employees_n;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast_deparment_department__employees_n", e);
        }
    }
    
    /**
     * 
     * map m_department_ast_department__manager in companies_qvtp_qvtcas {
     *   leftCS (lDepartment : companies::department[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {department_manager : companies::department_manager[?] = lDepartment.department_manager;
     * ast : ecore::EObject[?] = lDepartment.ast;
     * employee : companies::employee[?] = department_manager.employee;
     * ast1 : ecore::EObject[?] = employee.ast;
     * aDepartment : company::Department[1] = lDepartment.ast.oclAsType(company::Department)
     *   ;
     * aEmployee : company::Employee[1] = employee.ast.oclAsType(company::Employee);
     *  |
     * aDepartment.manager := aEmployee;
     * }
     * 
     */
    protected boolean MAP_m_department_ast_department__manager(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_1) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_manager department_manager = lDepartment_1.getDepartment_manager();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_1.getAst();
            if (department_manager == null) {
                throw throwNull(lDepartment_1, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_manager::employee\'");
            }
            final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable employee employee = department_manager.getEmployee();
            if (employee == null) {
                throw throwNull(lDepartment_1, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
            }
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast1 = employee.getAst();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lDepartment_1.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department aDepartment = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = employee.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee aEmployee = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_company_c_c_Employee_0));
            // property assignments
            aDepartment.setManager(aEmployee);
            boolean m_department_ast_department__manager = ValueUtil.TRUE_VALUE;
            return m_department_ast_department__manager;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast_department__manager", e);
        }
    }
    
    /**
     * 
     * map m_employee_address_ast_name_salary in companies_qvtp_qvtcas {
     *   leftCS (lEmployee : companies::employee[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {address : String[?] = lEmployee.address;
     * name : String[?] = lEmployee.name;
     * salary : ecore::EDouble[?] = lEmployee.salary;
     * ast : ecore::EObject[?] = lEmployee.ast;
     * aEmployee : company::Employee[1] = lEmployee.ast.oclAsType(company::Employee);
     *  |
     * aEmployee.address := address;
     * aEmployee.name := name;
     * aEmployee.salary := salary;
     * }
     * 
     */
    protected boolean MAP_m_employee_address_ast_name_salary(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String address = lEmployee.getAddress();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lEmployee.getName();
            final /*@Thrown*/ double salary = lEmployee.getSalary();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lEmployee.getAst();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lEmployee.getAst();
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee aEmployee = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Employee_0));
            // property assignments
            if (address == null) {
                throw throwNull(lEmployee, "Null value");
            }
            aEmployee.setAddress(address);
            if (name == null) {
                throw throwNull(lEmployee, "Null value");
            }
            aEmployee.setName(name);
            aEmployee.setSalary(salary);
            boolean m_employee_address_ast_name_salary = ValueUtil.TRUE_VALUE;
            return m_employee_address_ast_name_salary;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_employee_address_ast_name_salary", e);
        }
    }
    
    /**
     * 
     * map m_employee_ast in companies_qvtp_qvtcas {leftCS (lEmployee : companies::employee[?];
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
    protected boolean MAP_m_employee_ast(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee rEmployee = CompanyFactory.eINSTANCE.createEmployee();
            assert rEmployee != null;
            models[1/*rightAS*/].add(rEmployee);
            // property assignments
            lEmployee_0.setAst(rEmployee);
            boolean m_employee_ast = ValueUtil.TRUE_VALUE;
            return m_employee_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_employee_ast", e);
        }
    }
}
