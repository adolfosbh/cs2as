/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.qvtd.cs2as.compiler.internal.CS2ASJavaCompilerImpl$1
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
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.AbstractEvaluationOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.qvtd.runtime.internal.cs2as.AbstractCS2ASTransformer;
import org.eclipse.qvtd.runtime.library.model.ModelObjectsOfKindOperation;
import org.xtext.example.company.Company;
import org.xtext.example.company.CompanyFactory;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.company.Department;
import org.xtext.example.company.Employee;
import org.xtext.example.company.lookup.LookupEnvironment;
import org.xtext.example.company.lookup.LookupPackage;
import org.xtext.example.company.lookup.util.CompanyLookupSolver;
import org.xtext.example.company.util.Visitable;
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
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Company = PACKid_http_c_s_s_www_company_com.getClassId("Company", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Department = PACKid_http_c_s_s_www_company_com.getClassId("Department", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_EObject = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Employee = PACKid_http_c_s_s_www_company_com.getClassId("Employee", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Model = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary.getClassId("Model", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Visitable = PACKid_http_c_s_s_www_company_com.getClassId("Visitable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_company = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("company", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department_employees = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_employees", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_department_manager = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_manager", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_employee = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("employee", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull DataTypeId DATAid_EDouble = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Employee = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Employee);
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
    public companies_qvtp_qvtcas(final @NonNull Executor executor) {
        super(executor, new @NonNull String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    @Override
    public boolean run() {
        return MAP___root__() && invocationManager.flush();
    }
    
    /**
     * company::Visitable::_lookupEmployee(env : lookup::LookupEnvironment[?], eName : String[?]) : OrderedSet(company::Employee)
     * 
     * 
     * let
     *   foundEmployee : OrderedSet(company::Employee)[*|1] = env.namedElements->selectByKind(Employee)
     *   ->select(name = eName)
     * in
     *   if
     *     foundEmployee->isEmpty() and
     *     not (env.parentEnv = null
     *     )
     *   then _lookupEmployee(env.parentEnv, eName)
     *   else foundEmployee
     *   endif
     */
    protected class CACHE_Visitable__lookupEmployee extends AbstractEvaluationOperation
    {
        @Override
        public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
            @SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.company.util.@org.eclipse.jdt.annotation.NonNull Visitable self_0 = (/*@NonInvalid*/ org.xtext.example.company.util.@org.eclipse.jdt.annotation.NonNull Visitable)sourceAndArgumentValues[0];
            final /*@NonInvalid*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment env = (/*@NonInvalid*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment)sourceAndArgumentValues[1];
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String eName = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String)sourceAndArgumentValues[2];
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            /*@Caught*/ @NonNull Object CAUGHT_foundEmployee;
            try {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
                if (env == null) {
                    throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::namedElements\'");
                }
                @SuppressWarnings("null")
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> namedElements = env.getNamedElements();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_Employee, namedElements);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_namedElements, TYP_company_c_c_Employee_0);
                /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_Employee);
                @NonNull Iterator<Object> ITERATOR__1 = selectByKind.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundEmployee;
                while (true) {
                    if (!ITERATOR__1.hasNext()) {
                        foundEmployee = accumulator;
                        break;
                    }
                    @SuppressWarnings("null")
                    /*@NonInvalid*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee _1 = (Employee)ITERATOR__1.next();
                    /**
                     * name = eName
                     */
                    @SuppressWarnings("null")
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name = _1.getName();
                    final /*@Thrown*/ boolean eq = name.equals(eName);
                    //
                    if (eq == ValueUtil.TRUE_VALUE) {
                        accumulator.add(_1);
                    }
                }
                CAUGHT_foundEmployee = foundEmployee;
            }
            catch (Exception e) {
                CAUGHT_foundEmployee = ValueUtil.createInvalidValue(e);
            }
            /*@Caught*/ @NonNull Object CAUGHT_isEmpty;
            try {
                if (CAUGHT_foundEmployee instanceof InvalidValueException) {
                    throw (InvalidValueException)CAUGHT_foundEmployee;
                }
                final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(CAUGHT_foundEmployee).booleanValue();
                CAUGHT_isEmpty = isEmpty;
            }
            catch (Exception e) {
                CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
            }
            /*@Caught*/ @Nullable Object CAUGHT_not;
            try {
                /*@Caught*/ @NonNull Object CAUGHT_eq_0;
                try {
                    if (env == null) {
                        throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
                    }
                    final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = env.getParentEnv();
                    final /*@Thrown*/ boolean eq_0 = parentEnv == null;
                    CAUGHT_eq_0 = eq_0;
                }
                catch (Exception e) {
                    CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
                }
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq_0);
                CAUGHT_not = not;
            }
            catch (Exception e) {
                CAUGHT_not = ValueUtil.createInvalidValue(e);
            }
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_not);
            if (and == null) {
                throw new InvalidValueException("Null if condition");
            }
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue symbol_0;
            if (and) {
                if (env == null) {
                    throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
                }
                final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = env.getParentEnv();
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> _lookupEmployee = INST_Visitable__lookupEmployee.evaluate(self_0, parentEnv_0, eName);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED__lookupEmployee = idResolver.createOrderedSetOfAll(ORD_CLSSid_Employee, _lookupEmployee);
                symbol_0 = BOXED__lookupEmployee;
            }
            else {
                if (CAUGHT_foundEmployee instanceof InvalidValueException) {
                    throw (InvalidValueException)CAUGHT_foundEmployee;
                }
                symbol_0 = (OrderedSetValue)CAUGHT_foundEmployee;
            }
            return symbol_0;
        }
        
        @SuppressWarnings("unchecked")
        public java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> evaluate(final /*@NonInvalid*/ org.xtext.example.company.util.@org.eclipse.jdt.annotation.NonNull Visitable self_0, final /*@NonInvalid*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment env, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String eName) {
            return (java.util.@org.eclipse.jdt.annotation.NonNull List<Employee>)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_0, env, eName});
        }
    }
    
    protected final @NonNull CACHE_Visitable__lookupEmployee INST_Visitable__lookupEmployee = new CACHE_Visitable__lookupEmployee();
    
    /**
     * ocl::OclElement::parentEnv_Employee() : lookup::LookupEnvironment[1]
     * 
     * 
     * let parent : OclElement[?] = oclContainer()
     * in
     *   if parent = null
     *   then lookup::LookupEnvironment{}
     *   else parent._unqualified_env_Employee(self)
     *   endif
     */
    protected class CACHE_OclElement_parentEnv_Employee extends AbstractEvaluationOperation
    {
        @Override
        public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
            @SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_2 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object parent = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, self_2);
            final /*@NonInvalid*/ boolean eq = parent == null;
            /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_1;
            if (eq) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
                final /*@NonInvalid*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
                models[-1/*null*/].add(symbol_0);
                symbol_1 = symbol_0;
            }
            else {
                if (parent == null) {
                    throw new InvalidValueException("Null where non-null value required");
                }
                final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment parentEnv_Employee = INST_OclElement_parentEnv_Employee.evaluate(parent);
                symbol_1 = parentEnv_Employee;
            }
            return symbol_1;
        }
        
        @SuppressWarnings("null")
        public org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_2) {
            return (org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_2});
        }
    }
    
    protected final @NonNull CACHE_OclElement_parentEnv_Employee INST_OclElement_parentEnv_Employee = new CACHE_OclElement_parentEnv_Employee();
    
    /**
     * ocl::OclElement::env_Employee() : lookup::LookupEnvironment[1]
     * 
     * _unqualified_env_Employee(null)
     */
    protected class CACHE_OclElement_env_Employee extends AbstractEvaluationOperation
    {
        @Override
        public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
            @SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_1 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
            final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment parentEnv_Employee = INST_OclElement_parentEnv_Employee.evaluate(self_1);
            return parentEnv_Employee;
        }
        
        @SuppressWarnings("null")
        public org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_1) {
            return (org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_1});
        }
    }
    
    protected final @NonNull CACHE_OclElement_env_Employee INST_OclElement_env_Employee = new CACHE_OclElement_env_Employee();
    
    /**
     * 
     * map __root__ in companies_qvtp_qvtcas {
     *   where ( |)
     * {_'\u00ABcompany\u00BB' : Set(companies::company) = leftCS.objectsOfKind(companies::company)
     *   ;
     * _'\u00ABdepartment\u00BB' : Set(companies::department) = leftCS.objectsOfKind(companies::department)
     *   ;
     * _'\u00ABemployee\u00BB' : Set(companies::employee) = leftCS.objectsOfKind(companies::employee)
     *   ;
     * ji_company : Set(companies::company)[*|1] = _'\u00ABcompany\u00BB';
     * ji_department : Set(companies::department)[*|1] = _'\u00ABdepartment\u00BB';
     * ji_employee : Set(companies::employee)[*|1] = _'\u00ABemployee\u00BB';
     *  |}
     * for loop0 : companies::company in ji_company {
     *     call m_Company_company {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::department in ji_department {
     *     call m_Department_department {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::employee in ji_employee {
     *     call m_Employee_employee {
     * lEmployee := loop0;
     * }}
     *   for loop0 : companies::company in ji_company {
     *     call m_company_ast_deparment {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::company in ji_company {
     *     call m_company_ast_name {
     * lCompany := loop0;
     * }}
     *   for loop0 : companies::department in ji_department {
     *     call m_department_ast_department__employees {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::department in ji_department {
     *     call m_department_ast_department__manager {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::department in ji_department {
     *     call m_department_ast_name {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::department in ji_department {
     *     call m_department_ast_deparment {
     * lDepartment := loop0;
     * }}
     *   for loop0 : companies::employee in ji_employee {
     *     call m_employee_address_ast_name_salary {
     * lEmployee := loop0;
     * }}
     *   for loop0 : companies::employee in ji_employee {
     *     call m_employee_ast_mentor {
     * lEmployee := loop0;
     * }}
     */
    protected boolean MAP___root__()  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_company_0 = idResolver.getClass(CLSSid_company, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_company, models[0/*leftCS*/], TYP_companies_c_c_company_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_department_0 = idResolver.getClass(CLSSid_department, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_0 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_department, models[0/*leftCS*/], TYP_companies_c_c_department_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_companies_c_c_employee_0 = idResolver.getClass(CLSSid_employee, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_1 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_employee, models[0/*leftCS*/], TYP_companies_c_c_employee_0);
            // connection variables
            final SetValue.@NonNull Accumulator ji_company = createUnenforcedSetAccumulatorValue(SET_CLSSid_company);
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company iterator : ValueUtil.typedIterable(company.class, objectsOfKind)) {
                ji_company.add(iterator);
            }
            final SetValue.@NonNull Accumulator ji_department = createUnenforcedSetAccumulatorValue(SET_CLSSid_department);
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department iterator_0 : ValueUtil.typedIterable(department.class, objectsOfKind_0)) {
                ji_department.add(iterator_0);
            }
            final SetValue.@NonNull Accumulator ji_employee = createUnenforcedSetAccumulatorValue(SET_CLSSid_employee);
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee iterator_1 : ValueUtil.typedIterable(employee.class, objectsOfKind_1)) {
                ji_employee.add(iterator_1);
            }
            // mapping statements
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company loop0 : ValueUtil.typedIterable(company.class, ji_company)) {
                MAP_m_Company_company(loop0);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_0 : ValueUtil.typedIterable(department.class, ji_department)) {
                MAP_m_Department_department(loop0_0);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee loop0_1 : ValueUtil.typedIterable(employee.class, ji_employee)) {
                MAP_m_Employee_employee(loop0_1);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company loop0_2 : ValueUtil.typedIterable(company.class, ji_company)) {
                MAP_m_company_ast_deparment(loop0_2);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company loop0_3 : ValueUtil.typedIterable(company.class, ji_company)) {
                MAP_m_company_ast_name(loop0_3);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_4 : ValueUtil.typedIterable(department.class, ji_department)) {
                MAP_m_department_ast_department__employees(loop0_4);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_5 : ValueUtil.typedIterable(department.class, ji_department)) {
                MAP_m_department_ast_department__manager(loop0_5);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_6 : ValueUtil.typedIterable(department.class, ji_department)) {
                MAP_m_department_ast_name(loop0_6);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department loop0_7 : ValueUtil.typedIterable(department.class, ji_department)) {
                MAP_m_department_ast_deparment(loop0_7);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee loop0_8 : ValueUtil.typedIterable(employee.class, ji_employee)) {
                MAP_m_employee_address_ast_name_salary(loop0_8);
            }
            for (org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee loop0_9 : ValueUtil.typedIterable(employee.class, ji_employee)) {
                MAP_m_employee_ast_mentor(loop0_9);
            }
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean __root__ = ValueUtil.TRUE_VALUE;
            return __root__;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP___root__", e);
        }
    }
    
    /**
     * 
     * map m_Company_company in companies_qvtp_qvtcas {leftCS (lCompany : companies::company[1];
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
    protected boolean MAP_m_Company_company(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany)  {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Company rCompany = CompanyFactory.eINSTANCE.createCompany();
            assert rCompany != null;
            models[1/*rightAS*/].add(rCompany);
            // property assignments
            lCompany.setAst(rCompany);
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_Company_company = ValueUtil.TRUE_VALUE;
            return m_Company_company;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Company_company", e);
        }
    }
    
    /**
     * 
     * map m_Department_department in companies_qvtp_qvtcas {leftCS (lDepartment : companies::department[1];
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
    protected boolean MAP_m_Department_department(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment)  {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Department rDepartment = CompanyFactory.eINSTANCE.createDepartment();
            assert rDepartment != null;
            models[1/*rightAS*/].add(rDepartment);
            // property assignments
            lDepartment.setAst(rDepartment);
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_Department_department = ValueUtil.TRUE_VALUE;
            return m_Department_department;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Department_department", e);
        }
    }
    
    /**
     * 
     * map m_Employee_employee in companies_qvtp_qvtcas {leftCS (lEmployee : companies::employee[1];
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
    protected boolean MAP_m_Employee_employee(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee)  {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee rEmployee = CompanyFactory.eINSTANCE.createEmployee();
            assert rEmployee != null;
            models[1/*rightAS*/].add(rEmployee);
            // property assignments
            lEmployee.setAst(rEmployee);
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_Employee_employee = ValueUtil.TRUE_VALUE;
            return m_Employee_employee;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Employee_employee", e);
        }
    }
    
    /**
     * 
     * map m_company_ast_deparment in companies_qvtp_qvtcas {
     *   leftCS (lCompany : companies::company[1];
     *  |)
     * {deparment : OrderedSet(companies::department)[*|1];
     *  |}
     * rightAS ( |)
     * {aCompany : company::Company[1];
     * _'\u00ABcollect\u00BB' : Sequence(company::Department);
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     *  |
     * ast := lCompany.ast;
     * deparment := lCompany.deparment;
     * aCompany := ast.oclAsType(company::Company)
     *   ;
     * _'\u00ABcollect\u00BB' := deparment->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Department));
     * aCompany.depts := _'\u00ABcollect\u00BB';
     * }
     * 
     */
    protected boolean MAP_m_company_ast_deparment(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany_0)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lCompany_0.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lCompany_0, "Null where non-null value required");
                }
                @SuppressWarnings("null")
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = lCompany_0.getDeparment();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Company_0 = idResolver.getClass(CLSSid_Company, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Company oclAsType = ClassUtil.nonNullState((Company)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Company_0));
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
                @NonNull Iterator<Object> ITERATOR__1 = BOXED_deparment.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
                while (true) {
                    if (!ITERATOR__1.hasNext()) {
                        collect = accumulator;
                        break;
                    }
                    @SuppressWarnings("null")
                    /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department _1 = (department)ITERATOR__1.next();
                    /**
                     * _'1_'.ast.oclAsType(company::Department)
                     */
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = _1.getAst();
                    final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
                    //
                    accumulator.add(oclAsType_0);
                }
                // property assignments
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
                oclAsType.getDepts().addAll(ECORE_collect);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_company_ast_deparment = ValueUtil.TRUE_VALUE;
                raw_ast = m_company_ast_deparment;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_company_ast_deparment", e);
        }
    }
    
    /**
     * 
     * map m_company_ast_name in companies_qvtp_qvtcas {
     *   leftCS (lCompany : companies::company[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {aCompany : company::Company[1];
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     * name : String[?];
     *  |
     * ast := lCompany.ast;
     * name := lCompany.name;
     * aCompany := ast.oclAsType(company::Company);
     * aCompany.name := name;
     * }
     * 
     */
    protected boolean MAP_m_company_ast_name(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull company lCompany_1)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lCompany_1.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lCompany_1, "Null where non-null value required");
                }
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lCompany_1.getName();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Company_0 = idResolver.getClass(CLSSid_Company, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Company oclAsType = ClassUtil.nonNullState((Company)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Company_0));
                // property assignments
                if (name == null) {
                    throw throwNull(lCompany_1, "Null value for company::Company::name assignment");
                }
                oclAsType.setName(name);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_company_ast_name = ValueUtil.TRUE_VALUE;
                raw_ast = m_company_ast_name;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_company_ast_name", e);
        }
    }
    
    /**
     * 
     * map m_department_ast_deparment in companies_qvtp_qvtcas {
     *   leftCS (lDepartment : companies::department[1];
     *  |)
     * {deparment : OrderedSet(companies::department)[*|1];
     *  |}
     * rightAS ( |)
     * {aDepartment : company::Department[1];
     * _'\u00ABcollect\u00BB' : Sequence(company::Department);
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     *  |
     * ast := lDepartment.ast;
     * deparment := lDepartment.deparment;
     * aDepartment := ast.oclAsType(company::Department)
     *   ;
     * _'\u00ABcollect\u00BB' := deparment->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Department));
     * aDepartment.subdepts := _'\u00ABcollect\u00BB';
     * }
     * 
     */
    protected boolean MAP_m_department_ast_deparment(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_0)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_0.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lDepartment_0, "Null where non-null value required");
                }
                @SuppressWarnings("null")
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<department> deparment = lDepartment_0.getDeparment();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
                @NonNull Iterator<Object> ITERATOR__1 = BOXED_deparment.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
                while (true) {
                    if (!ITERATOR__1.hasNext()) {
                        collect = accumulator;
                        break;
                    }
                    @SuppressWarnings("null")
                    /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department _1 = (department)ITERATOR__1.next();
                    /**
                     * _'1_'.ast.oclAsType(company::Department)
                     */
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = _1.getAst();
                    final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
                    //
                    accumulator.add(oclAsType_0);
                }
                // property assignments
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
                oclAsType.getSubdepts().addAll(ECORE_collect);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_department_ast_deparment = ValueUtil.TRUE_VALUE;
                raw_ast = m_department_ast_deparment;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast_deparment", e);
        }
    }
    
    /**
     * 
     * map m_department_ast_department__employees in companies_qvtp_qvtcas {
     *   leftCS (lDepartment : companies::department[1];
     *  |)
     * {department_employees : companies::department_employees[?];
     * employee : OrderedSet(companies::employee)[*|1];
     *  |}
     * rightAS ( |)
     * {aDepartment : company::Department[1];
     * _'\u00ABcollect\u00BB' : Sequence(company::Employee);
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     *  |
     * ast := lDepartment.ast;
     * department_employees := lDepartment.department_employees;
     * aDepartment := ast.oclAsType(company::Department)
     *   ;
     * employee := department_employees.employee;
     * _'\u00ABcollect\u00BB' := employee->collect(_'1_' |
     *     _'1_'.ast.oclAsType(company::Employee));
     * aDepartment.employees := _'\u00ABcollect\u00BB';
     * }
     * 
     */
    protected boolean MAP_m_department_ast_department__employees(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_1)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_1.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lDepartment_1, "Null where non-null value required");
                }
                final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_employees department_employees = lDepartment_1.getDepartment_employees();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
                if (department_employees == null) {
                    throw throwNull(lDepartment_1, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_employees::employee\'");
                }
                @SuppressWarnings("null")
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<employee> employee = department_employees.getEmployee();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_employee = idResolver.createOrderedSetOfAll(ORD_CLSSid_employee, employee);
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Employee);
                @NonNull Iterator<Object> ITERATOR__1 = BOXED_employee.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
                while (true) {
                    if (!ITERATOR__1.hasNext()) {
                        collect = accumulator;
                        break;
                    }
                    @SuppressWarnings("null")
                    /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee _1 = (employee)ITERATOR__1.next();
                    /**
                     * _'1_'.ast.oclAsType(company::Employee)
                     */
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = _1.getAst();
                    final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType_0 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Employee_0));
                    //
                    accumulator.add(oclAsType_0);
                }
                // property assignments
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, collect);
                oclAsType.getEmployees().addAll(ECORE_collect);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_department_ast_department__employees = ValueUtil.TRUE_VALUE;
                raw_ast = m_department_ast_department__employees;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast_department__employees", e);
        }
    }
    
    /**
     * 
     * map m_department_ast_department__manager in companies_qvtp_qvtcas {
     *   leftCS (lDepartment : companies::department[1];
     *  |)
     * {department_manager : companies::department_manager[?];
     * employee : companies::employee[?];
     *  |}
     * rightAS ( |)
     * {aDepartment : company::Department[1];
     * aEmployee : company::Employee[1];
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     * ast1 : ecore::EObject[?];
     *  |
     * ast := lDepartment.ast;
     * department_manager := lDepartment.department_manager;
     * aDepartment := ast.oclAsType(company::Department)
     *   ;
     * employee := department_manager.employee;
     * ast1 := employee.ast;
     * aEmployee := ast1.oclAsType(company::Employee);
     * aDepartment.manager := aEmployee;
     * }
     * 
     */
    protected boolean MAP_m_department_ast_department__manager(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_2)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_2.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lDepartment_2, "Null where non-null value required");
                }
                final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable department_manager department_manager = lDepartment_2.getDepartment_manager();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
                if (department_manager == null) {
                    throw throwNull(lDepartment_2, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_manager::employee\'");
                }
                final /*@Thrown*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.Nullable employee employee = department_manager.getEmployee();
                if (employee == null) {
                    throw throwNull(lDepartment_2, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::traceable::ast\'");
                }
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = employee.getAst();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType_0 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Employee_0));
                // property assignments
                oclAsType.setManager(oclAsType_0);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_department_ast_department__manager = ValueUtil.TRUE_VALUE;
                raw_ast = m_department_ast_department__manager;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast_department__manager", e);
        }
    }
    
    /**
     * 
     * map m_department_ast_name in companies_qvtp_qvtcas {
     *   leftCS (lDepartment : companies::department[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {aDepartment : company::Department[1];
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     * name : String[?];
     *  |
     * ast := lDepartment.ast;
     * name := lDepartment.name;
     * aDepartment := ast.oclAsType(company::Department);
     * aDepartment.name := name;
     * }
     * 
     */
    protected boolean MAP_m_department_ast_name(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull department lDepartment_3)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lDepartment_3.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lDepartment_3, "Null where non-null value required");
                }
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lDepartment_3.getName();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
                // property assignments
                if (name == null) {
                    throw throwNull(lDepartment_3, "Null value for company::Department::name assignment");
                }
                oclAsType.setName(name);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_department_ast_name = ValueUtil.TRUE_VALUE;
                raw_ast = m_department_ast_name;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_department_ast_name", e);
        }
    }
    
    /**
     * 
     * map m_employee_address_ast_name_salary in companies_qvtp_qvtcas {
     *   leftCS (lEmployee : companies::employee[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {aEmployee : company::Employee[1];
     *  |}
     * where ( |)
     * {address : String[?];
     * ast : ecore::EObject[1];
     * name : String[?];
     * salary : ecore::EDouble[?];
     *  |
     * address := lEmployee.address;
     * ast := lEmployee.ast;
     * name := lEmployee.name;
     * salary := lEmployee.salary;
     * aEmployee := ast.oclAsType(company::Employee);
     * aEmployee.address := address;
     * aEmployee.name := name;
     * aEmployee.salary := salary;
     * }
     * 
     */
    protected boolean MAP_m_employee_address_ast_name_salary(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee_0)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String address = lEmployee_0.getAddress();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lEmployee_0.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lEmployee_0, "Null where non-null value required");
                }
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lEmployee_0.getName();
                final /*@Thrown*/ double salary = lEmployee_0.getSalary();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
                // property assignments
                if (address == null) {
                    throw throwNull(lEmployee_0, "Null value for company::Employee::address assignment");
                }
                oclAsType.setAddress(address);
                if (name == null) {
                    throw throwNull(lEmployee_0, "Null value for company::Employee::name assignment");
                }
                oclAsType.setName(name);
                oclAsType.setSalary(salary);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_employee_address_ast_name_salary = ValueUtil.TRUE_VALUE;
                raw_ast = m_employee_address_ast_name_salary;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_employee_address_ast_name_salary", e);
        }
    }
    
    /**
     * 
     * map m_employee_ast_mentor in companies_qvtp_qvtcas {
     *   leftCS (lEmployee : companies::employee[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {aEmployee : company::Employee[1];
     * lookupEmployee : company::Employee[?];
     *  |}
     * where ( |)
     * {ast : ecore::EObject[1];
     * mentor : String[?];
     *  |
     * ast := lEmployee.ast;
     * mentor := lEmployee.mentor;
     * aEmployee := ast.oclAsType(company::Employee)
     *   ;
     * lookupEmployee := aEmployee.lookupEmployee(mentor);
     * aEmployee.mentor := lookupEmployee;
     * }
     * 
     */
    protected boolean MAP_m_employee_ast_mentor(final /*@NonInvalid*/ org.xtext.example.mydsl.companies.@org.eclipse.jdt.annotation.NonNull employee lEmployee_1)  {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lEmployee_1.getAst();
            final /*@Thrown*/ boolean symbol_0 = ast != null;
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
            if (symbol_0) {
                if (ast == null) {
                    throw throwNull(lEmployee_1, "Null where non-null value required");
                }
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String mentor = lEmployee_1.getMentor();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
                final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
                final /*@Thrown*/ boolean eq = mentor == null;
                /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee symbol_2;
                if (eq) {
                    symbol_2 = null;
                }
                else {
                    final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment env_Employee = INST_OclElement_env_Employee.evaluate(oclAsType);
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> foundEmployee = INST_Visitable__lookupEmployee.evaluate(oclAsType, env_Employee, mentor);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_foundEmployee_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_Employee, foundEmployee);
                    final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_foundEmployee_0).booleanValue();
                    /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee symbol_1;
                    if (isEmpty) {
                        symbol_1 = null;
                    }
                    else {
                        final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Employee first = (Employee)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_foundEmployee_0);
                        symbol_1 = first;
                    }
                    symbol_2 = symbol_1;
                }
                // property assignments
                oclAsType.setMentor(symbol_2);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_employee_ast_mentor = ValueUtil.TRUE_VALUE;
                raw_ast = m_employee_ast_mentor;
            }
            else {
                raw_ast = ValueUtil.FALSE_VALUE;
            }
            return raw_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_employee_ast_mentor", e);
        }
    }
}
