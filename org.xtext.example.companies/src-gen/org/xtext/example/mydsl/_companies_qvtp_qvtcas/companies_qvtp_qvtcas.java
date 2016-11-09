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
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty;
import org.eclipse.ocl.pivot.internal.library.executor.AbstractDispatchOperation;
import org.eclipse.ocl.pivot.internal.library.executor.AbstractEvaluationOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.qvtd.runtime.evaluation.Connection;
import org.eclipse.qvtd.runtime.evaluation.TransformationExecutor;
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
	public static final /*@NonInvalid*/ @NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_company_com = IdManager.getNsURIPackageId("http://www.company.com", null, CompanyPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/2015/QVTbaseLibrary", "qvtbaselib", null);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies = IdManager.getNsURIPackageId("http://www.xtext.org/example/mydsl/Companies", null, CompaniesPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies", null, LookupPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Company = PACKid_http_c_s_s_www_company_com.getClassId("Company", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Department = PACKid_http_c_s_s_www_company_com.getClassId("Department", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_EObject = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Employee = PACKid_http_c_s_s_www_company_com.getClassId("Employee", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies.getClassId("LookupEnvironment", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Model = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary.getClassId("Model", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Visitable = PACKid_http_c_s_s_www_company_com.getClassId("Visitable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_company = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("company", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_department = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_department_employees = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_employees", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_department_manager = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("department_manager", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_employee = PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies.getClassId("employee", 0);
	public static final /*@NonInvalid*/ @NonNull DataTypeId DATAid_EDouble = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Employee = TypeId.BAG.getSpecializedId(CLSSid_Employee);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Employee = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Employee);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_department = TypeId.ORDERED_SET.getSpecializedId(CLSSid_department);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_employee = TypeId.ORDERED_SET.getSpecializedId(CLSSid_employee);
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_department_manager = CLSSid_employee.getPropertyId("department_manager");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_parentEnv = CLSSid_LookupEnvironment.getPropertyId("parentEnv");
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Department = TypeId.SEQUENCE.getSpecializedId(CLSSid_Department);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Employee = TypeId.SEQUENCE.getSpecializedId(CLSSid_Employee);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Department = TypeId.SET.getSpecializedId(CLSSid_Department);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Employee = TypeId.SET.getSpecializedId(CLSSid_Employee);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_company = TypeId.SET.getSpecializedId(CLSSid_company);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_department = TypeId.SET.getSpecializedId(CLSSid_department);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_employee = TypeId.SET.getSpecializedId(CLSSid_employee);

	/*
	 * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
	 */
	private static final @NonNull ClassId[] classIndex2classId = new @NonNull ClassId[]{
		CLSSid_company,                       // 0 => company
		CLSSid_department,                    // 1 => department
		CLSSid_employee                       // 2 => employee
	};

	/*
	 * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
	 * may contribute results to an allInstances() invocation.
	 * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
	 * instance of the derived classId contributes to derived and inherited ClassIndexes.
	 */
	private final static int @NonNull [] @NonNull [] classIndex2allClassIndexes = new int @NonNull [] @NonNull [] {
		{0},                          // 0 : company -> {company}
		{1},                          // 1 : department -> {department}
		{2}                           // 2 : employee -> {employee}
	};

	private final CompanyLookupSolver lookupSolver = new CompanyLookupSolver(executor);

	public companies_qvtp_qvtcas(final @NonNull TransformationExecutor executor) {
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
	public class CACHE_Visitable__lookupEmployee extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_0 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable LookupEnvironment env = (/*@NonInvalid*/ @Nullable LookupEnvironment)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @Nullable String eName = (/*@NonInvalid*/ @Nullable String)sourceAndArgumentValues[2];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_foundEmployee;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
				if (env == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::namedElements\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<Employee> namedElements = env.getNamedElements();
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_Employee, namedElements);
				final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_namedElements, TYP_company_c_c_Employee_0);
				/*@Thrown*/ OrderedSetValue.@NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_Employee);
				@NonNull Iterator<Object> ITERATOR__1 = selectByKind.iterator();
				/*@Thrown*/ @NonNull OrderedSetValue foundEmployee;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						foundEmployee = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull Employee _1 = (Employee)ITERATOR__1.next();
					/**
					 * name = eName
					 */
					@SuppressWarnings("null")
					final /*@Thrown*/ @NonNull String name = _1.getName();
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
					final /*@Thrown*/ @Nullable LookupEnvironment parentEnv = env.getParentEnv();
					final /*@Thrown*/ boolean eq_0 = parentEnv == null;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq_0);
				CAUGHT_not = not;
			}
			catch (Exception e) {
				CAUGHT_not = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ @Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_not);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ @NonNull OrderedSetValue symbol_0;
			if (and) {
				if (env == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
				}
				final /*@Thrown*/ @Nullable LookupEnvironment parentEnv_0 = env.getParentEnv();
				final /*@Thrown*/ @NonNull OrderedSetValue _lookupEmployee = INSTANCE_Visitable__lookupEmployee.evaluate(self_0, parentEnv_0, eName);
				symbol_0 = _lookupEmployee;
			}
			else {
				if (CAUGHT_foundEmployee instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_foundEmployee;
				}
				symbol_0 = (OrderedSetValue)CAUGHT_foundEmployee;
			}
			return symbol_0;
		}

		@SuppressWarnings("null")
		public @NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ @NonNull Visitable self_0, final /*@NonInvalid*/ @Nullable LookupEnvironment env, final /*@NonInvalid*/ @Nullable String eName) {
			return (@NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_0, env, eName});
		}
	}

	protected final @NonNull CACHE_Visitable__lookupEmployee INSTANCE_Visitable__lookupEmployee = new CACHE_Visitable__lookupEmployee();

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
	public class CACHE_OclElement_parentEnv_Employee extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Object self_3 = (/*@NonInvalid*/ @NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ @Nullable Object parent = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, self_3);
			final /*@NonInvalid*/ boolean eq = parent == null;
			/*@Thrown*/ @NonNull LookupEnvironment symbol_1;
			if (eq) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
				final /*@NonInvalid*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
				symbol_1 = symbol_0;
			}
			else {
				if (parent == null) {
					throw new InvalidValueException("Null source for \'OclElement::_unqualified_env_Employee(OclElement[?]) : lookup::LookupEnvironment[1]\'");
				}
				final /*@Thrown*/ @NonNull LookupEnvironment _unqualified_env_Employee = INSTANCE_OclElement__unqualified_env_Employee.evaluate(parent, self_3);
				symbol_1 = _unqualified_env_Employee;
			}
			return symbol_1;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Object self_3) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_3});
		}
	}

	protected final @NonNull CACHE_OclElement_parentEnv_Employee INSTANCE_OclElement_parentEnv_Employee = new CACHE_OclElement_parentEnv_Employee();

	/**
	 * ocl::OclElement::_unqualified_env_Employee(child : OclElement[?]) : lookup::LookupEnvironment[1]
	 *
	 * parentEnv_Employee()
	 */
	public class CACHE_OclElement__unqualified_env_Employee extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Object self_2 = (/*@NonInvalid*/ @NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Object child = (/*@NonInvalid*/ @Nullable Object)sourceAndArgumentValues[1];
			final /*@Thrown*/ @NonNull LookupEnvironment parentEnv_Employee = INSTANCE_OclElement_parentEnv_Employee.evaluate(self_2);
			return parentEnv_Employee;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Object self_2, final /*@NonInvalid*/ @Nullable Object child) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_2, child});
		}
	}

	protected final @NonNull CACHE_OclElement__unqualified_env_Employee INST_OclElement__unqualified_env_Employee = new CACHE_OclElement__unqualified_env_Employee();

	/**
	 * company::Department::getEmployees() : Set(company::Employee)
	 *
	 *
	 * subdepts.getEmployees()
	 * ->includingAll(employees)
	 * ->including(manager)
	 * ->asSet()
	 */
	public class CACHE_Department_getEmployees extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Department self_5 = (/*@NonInvalid*/ @NonNull Department)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<Department> subdepts = self_5.getSubdepts();
			final /*@Thrown*/ @NonNull SetValue BOXED_subdepts = idResolver.createSetOfAll(SET_CLSSid_Department, subdepts);
			/*@Thrown*/ BagValue.@NonNull Accumulator accumulator = ValueUtil.createBagAccumulatorValue(BAG_CLSSid_Employee);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_subdepts.iterator();
			/*@Thrown*/ @NonNull BagValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull Department _1 = (Department)ITERATOR__1.next();
				/**
				 * getEmployees()
				 */
				final /*@Thrown*/ @NonNull SetValue getEmployees = INSTANCE_Department_getEmployees.evaluate(_1);
				//
				for (Object value : getEmployees.flatten().getElements()) {
					accumulator.add(value);
				}
			}
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<Employee> employees = self_5.getEmployees();
			final /*@Thrown*/ @NonNull SetValue BOXED_employees = idResolver.createSetOfAll(SET_CLSSid_Employee, employees);
			final /*@Thrown*/ @NonNull BagValue includingAll = (BagValue)CollectionIncludingAllOperation.INSTANCE.evaluate(collect, BOXED_employees);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull Employee manager = self_5.getManager();
			final /*@Thrown*/ @NonNull BagValue including = (BagValue)CollectionIncludingOperation.INSTANCE.evaluate(includingAll, manager);
			final /*@Thrown*/ @NonNull SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(including);
			return asSet;
		}

		@SuppressWarnings("null")
		public @NonNull SetValue evaluate(final /*@NonInvalid*/ @NonNull Department self_5) {
			return (@NonNull SetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_5});
		}
	}

	protected final @NonNull CACHE_Department_getEmployees INSTANCE_Department_getEmployees = new CACHE_Department_getEmployees();

	/**
	 * company::Company::_unqualified_env_Employee(child : OclElement[?]) : lookup::LookupEnvironment[?]
	 *
	 * parentEnv_Employee().nestedEnv().addElements(getEmployees())
	 */
	public class CACHE_Company__unqualified_env_Employee extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Company self_4 = (/*@NonInvalid*/ @NonNull Company)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Object child_0 = (/*@NonInvalid*/ @Nullable Object)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @NonNull LookupEnvironment self_6 = INSTANCE_OclElement_parentEnv_Employee.evaluate(self_4);
			final /*@NonInvalid*/ @NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_6);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<Department> depts = self_4.getDepts();
			final /*@Thrown*/ @NonNull SetValue BOXED_depts = idResolver.createSetOfAll(SET_CLSSid_Department, depts);
			/*@Thrown*/ BagValue.@NonNull Accumulator accumulator = ValueUtil.createBagAccumulatorValue(BAG_CLSSid_Employee);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_depts.iterator();
			/*@Thrown*/ @NonNull BagValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull Department _1 = (Department)ITERATOR__1.next();
				/**
				 * _'null' : Set(company::Employee)
				 */
				final /*@Thrown*/ @NonNull SetValue getEmployees = INSTANCE_Department_getEmployees.evaluate(_1);
				//
				for (Object value : getEmployees.flatten().getElements()) {
					accumulator.add(value);
				}
			}
			final /*@Thrown*/ @NonNull SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
			final /*@Thrown*/ @NonNull List<Employee> ECORE_asSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, asSet);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_asSet);
			return addElements;
		}

		public LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Company self_4, final /*@NonInvalid*/ @Nullable Object child_0) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_4, child_0});
		}
	}

	protected final @NonNull CACHE_Company__unqualified_env_Employee INST_Company__unqualified_env_Employee = new CACHE_Company__unqualified_env_Employee();

	/**
	 * ocl::OclElement::env_Employee() : lookup::LookupEnvironment[1]
	 *
	 * _unqualified_env_Employee(null)
	 */
	public class CACHE_OclElement_env_Employee extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Object self_1 = (/*@NonInvalid*/ @NonNull Object)sourceAndArgumentValues[0];
			final /*@Thrown*/ @NonNull LookupEnvironment _unqualified_env_Employee = INSTANCE_OclElement__unqualified_env_Employee.evaluate(self_1, null);
			return _unqualified_env_Employee;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Object self_1) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_1});
		}
	}

	protected final @NonNull CACHE_OclElement_env_Employee INSTANCE_OclElement_env_Employee = new CACHE_OclElement_env_Employee();

	protected class VCACHE_OclElement__unqualified_env_Employee extends AbstractDispatchOperation
	{
		private VCACHE_OclElement__unqualified_env_Employee() {
			install(Object.class, INST_OclElement__unqualified_env_Employee);
			install(Company.class, INST_Company__unqualified_env_Employee);
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Object self_2, final /*@NonInvalid*/ @Nullable Object child) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_2, child});
		}
	}

	protected final @NonNull VCACHE_OclElement__unqualified_env_Employee INSTANCE_OclElement__unqualified_env_Employee = new VCACHE_OclElement__unqualified_env_Employee();

	/**
	 *
	 * map __root__ in companies_qvtp_qvtcas {
	 *
	 *   var _'\u00ABcompany\u00BB' : Set(companies::company) := leftCS.objectsOfKind(companies::company)
	 *   ;
	 * ::ji_company : companies::company[1]var _'\u00ABdepartment\u00BB' : Set(companies::department) := leftCS.objectsOfKind(companies::department)
	 *   ;
	 * ::ji_department : companies::department[1]var _'\u00ABemployee\u00BB' : Set(companies::employee) := leftCS.objectsOfKind(companies::employee)
	 *   ;
	 * ::ji_employee : companies::employee[1]::ji_employee_1 : companies::employee[1]install m_Company_company {
	 * lCompany consumes ::ji_company : companies::company[1];
	 * }
	 *   install m_Department_department {
	 * lDepartment consumes ::ji_department : companies::department[1];
	 * }
	 *   install m_Employee_employee {
	 * lEmployee consumes ::ji_employee : companies::employee[1];
	 * }
	 *   install m_company_ast_deparment {
	 * lCompany consumes ::ji_company : companies::company[1];
	 * }
	 *   install m_company_ast_name {
	 * lCompany consumes ::ji_company : companies::company[1];
	 * }
	 *   install m_department_ast_department__employees {
	 * lDepartment consumes ::ji_department : companies::department[1];
	 * }
	 *   install m_department_ast_department__manager {
	 * lDepartment consumes ::ji_department : companies::department[1];
	 * lEmployee consumes ::ji_employee_1 : companies::employee[1];
	 * }
	 *   install m_department_ast_name {
	 * lDepartment consumes ::ji_department : companies::department[1];
	 * }
	 *   install m_department_ast_deparment {
	 * lDepartment consumes ::ji_department : companies::department[1];
	 * }
	 *   install m_employee_ast_name_salary {
	 * lEmployee consumes ::ji_employee : companies::employee[1];
	 * }
	 *   install m_employee_ast_mentor {
	 * lEmployee consumes ::ji_employee : companies::employee[1];
	 * }
	 */
	protected boolean MAP___root__()  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_companies_c_c_company_0 = idResolver.getClass(CLSSid_company, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_company, models[0/*leftCS*/], TYP_companies_c_c_company_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_companies_c_c_department_0 = idResolver.getClass(CLSSid_department, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_0 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_department, models[0/*leftCS*/], TYP_companies_c_c_department_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_companies_c_c_employee_0 = idResolver.getClass(CLSSid_employee, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_1 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_employee, models[0/*leftCS*/], TYP_companies_c_c_employee_0);
			// connection variables
			final @NonNull Connection ji_company = createConnection("ji_company", CLSSid_company, false);
			for (@NonNull company iterator : ValueUtil.typedIterable(company.class, objectsOfKind)) {
				ji_company.append(iterator);
			}
			final @NonNull Connection ji_department = createConnection("ji_department", CLSSid_department, false);
			for (@NonNull department iterator_0 : ValueUtil.typedIterable(department.class, objectsOfKind_0)) {
				ji_department.append(iterator_0);
			}
			final @NonNull Connection ji_employee = createConnection("ji_employee", CLSSid_employee, false);
			for (@NonNull employee iterator_1 : ValueUtil.typedIterable(employee.class, objectsOfKind_1)) {
				ji_employee.append(iterator_1);
			}
			final @NonNull Connection ji_employee_1 = createConnection("ji_employee_1", CLSSid_employee, false);
			/*@Thrown*/ SetValue.@NonNull Accumulator accumulator = ValueUtil.createSetAccumulatorValue(SET_CLSSid_employee);
			@NonNull Iterator<Object> ITERATOR_i = objectsOfKind_1.iterator();
			/*@Thrown*/ @NonNull SetValue select;
			while (true) {
				if (!ITERATOR_i.hasNext()) {
					select = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull employee i = (employee)ITERATOR_i.next();
				/**
				 * i.department_manager <> null
				 */
				final /*@NonInvalid*/ @NonNull UnboxedCompositionProperty IMPPROPid_department_manager = new UnboxedCompositionProperty("employee");
				final /*@Thrown*/ @Nullable department_manager department_manager = (department_manager)IMPPROPid_department_manager.evaluate(executor, CLSSid_department_manager, i);
				final /*@Thrown*/ boolean symbol_12 = department_manager != null;
				//
				if (symbol_12 == ValueUtil.TRUE_VALUE) {
					accumulator.add(i);
				}
			}
			for (@NonNull employee iterator_2 : ValueUtil.typedIterable(employee.class, select)) {
				ji_employee_1.append(iterator_2);
			}
			// mapping statements
			for (@NonNull company lCompany_2 : ji_company.typedIterable(company.class)) {
				MAP_m_Company_company(lCompany_2);
			}
			for (@NonNull department lDepartment_4 : ji_department.typedIterable(department.class)) {
				MAP_m_Department_department(lDepartment_4);
			}
			for (@NonNull employee lEmployee_3 : ji_employee.typedIterable(employee.class)) {
				MAP_m_Employee_employee(lEmployee_3);
			}
			for (@NonNull company lCompany_3 : ji_company.typedIterable(company.class)) {
				MAP_m_company_ast_deparment(lCompany_3);
			}
			for (@NonNull company lCompany_4 : ji_company.typedIterable(company.class)) {
				MAP_m_company_ast_name(lCompany_4);
			}
			for (@NonNull department lDepartment_5 : ji_department.typedIterable(department.class)) {
				MAP_m_department_ast_department__employees(lDepartment_5);
			}
			for (@NonNull department lDepartment_6 : ji_department.typedIterable(department.class)) {
				for (@NonNull employee lEmployee_4 : ji_employee_1.typedIterable(employee.class)) {
					MAP_m_department_ast_department__manager(lDepartment_6, lEmployee_4);
				}
			}
			for (@NonNull department lDepartment_7 : ji_department.typedIterable(department.class)) {
				MAP_m_department_ast_name(lDepartment_7);
			}
			for (@NonNull department lDepartment_8 : ji_department.typedIterable(department.class)) {
				MAP_m_department_ast_deparment(lDepartment_8);
			}
			for (@NonNull employee lEmployee_5 : ji_employee.typedIterable(employee.class)) {
				MAP_m_employee_ast_name_salary(lEmployee_5);
			}
			for (@NonNull employee lEmployee_6 : ji_employee.typedIterable(employee.class)) {
				MAP_m_employee_ast_mentor(lEmployee_6);
			}
			final /*@Thrown*/ @Nullable Boolean __root__ = ValueUtil.TRUE_VALUE;
			return __root__;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP___root__", e);
		}
	}

	/**
	 *
	 * map m_Company_company in companies_qvtp_qvtcas {
	 * guard:leftCS lCompany  : companies::company[1];
	 * new:rightAS rCompany : company::Company[1];
	 * set lCompany.ast := rCompany;
	 *
	 */
	protected boolean MAP_m_Company_company(final /*@NonInvalid*/ @NonNull company lCompany)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable Company rCompany = CompanyFactory.eINSTANCE.createCompany();
			assert rCompany != null;
			models[1/*rightAS*/].add(rCompany);
			// mapping statements
			lCompany.setAst(rCompany);
			final /*@Thrown*/ @Nullable Boolean m_Company_company = ValueUtil.TRUE_VALUE;
			return m_Company_company;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Company_company", e);
		}
	}

	/**
	 *
	 * map m_Department_department in companies_qvtp_qvtcas {
	 * guard:leftCS lDepartment  : companies::department[1];
	 * new:rightAS rDepartment : company::Department[1];
	 * set lDepartment.ast := rDepartment;
	 *
	 */
	protected boolean MAP_m_Department_department(final /*@NonInvalid*/ @NonNull department lDepartment)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable Department rDepartment = CompanyFactory.eINSTANCE.createDepartment();
			assert rDepartment != null;
			models[1/*rightAS*/].add(rDepartment);
			// mapping statements
			lDepartment.setAst(rDepartment);
			final /*@Thrown*/ @Nullable Boolean m_Department_department = ValueUtil.TRUE_VALUE;
			return m_Department_department;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Department_department", e);
		}
	}

	/**
	 *
	 * map m_Employee_employee in companies_qvtp_qvtcas {
	 * guard:leftCS lEmployee  : companies::employee[1];
	 * new:rightAS rEmployee : company::Employee[1];
	 * set lEmployee.ast := rEmployee;
	 *
	 */
	protected boolean MAP_m_Employee_employee(final /*@NonInvalid*/ @NonNull employee lEmployee)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable Employee rEmployee = CompanyFactory.eINSTANCE.createEmployee();
			assert rEmployee != null;
			models[1/*rightAS*/].add(rEmployee);
			// mapping statements
			lEmployee.setAst(rEmployee);
			final /*@Thrown*/ @Nullable Boolean m_Employee_employee = ValueUtil.TRUE_VALUE;
			return m_Employee_employee;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Employee_employee", e);
		}
	}

	/**
	 *
	 * map m_company_ast_deparment in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCompany  : companies::company[1];
	 * var ast : ecore::EObject[1] := lCompany.ast;
	 * var deparment : OrderedSet(companies::department)[*|1] := lCompany.deparment;
	 * var aCompany : company::Company[1] := ast.oclAsType(company::Company)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(company::Department) := deparment->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(company::Department));
	 * set aCompany.depts := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_company_ast_deparment(final /*@NonInvalid*/ @NonNull company lCompany_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lCompany_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCompany_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<department> deparment = lCompany_0.getDeparment();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Company_0 = idResolver.getClass(CLSSid_Company, null);
				final /*@Thrown*/ @NonNull Company oclAsType = ClassUtil.nonNullState((Company)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Company_0));
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_deparment.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull department _1 = (department)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(company::Department)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
					final /*@Thrown*/ @Nullable EObject ast_0 = _1.getAst();
					final /*@Thrown*/ @NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
				oclAsType.getDepts().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_company_ast_deparment = ValueUtil.TRUE_VALUE;
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
	 *
	 *   guard:leftCS lCompany  : companies::company[1];
	 * var ast : ecore::EObject[1] := lCompany.ast;
	 * var name : String[?] := lCompany.name;
	 * var aCompany : company::Company[1] := ast.oclAsType(company::Company);
	 * set aCompany.name := name;
	 *
	 */
	protected boolean MAP_m_company_ast_name(final /*@NonInvalid*/ @NonNull company lCompany_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lCompany_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCompany_1, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable String name = lCompany_1.getName();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Company_0 = idResolver.getClass(CLSSid_Company, null);
				final /*@Thrown*/ @NonNull Company oclAsType = ClassUtil.nonNullState((Company)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Company_0));
				// mapping statements
				if (name == null) {
					throw throwNull(lCompany_1, "Null value for company::Company::name assignment");
				}
				oclAsType.setName(name);
				final /*@Thrown*/ @Nullable Boolean m_company_ast_name = ValueUtil.TRUE_VALUE;
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
	 * map m_department_ast_department__employees in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDepartment  : companies::department[1];
	 * var ast : ecore::EObject[1] := lDepartment.ast;
	 * var department_employees1 : companies::department_employees[?] := lDepartment.department_employees;
	 * var aDepartment : company::Department[1] := ast.oclAsType(company::Department)
	 *   ;
	 * var employee1 : OrderedSet(companies::employee)[*|1] := department_employees1.employee;
	 * var _'\u00ABcollect\u00BB' : Sequence(company::Employee) := employee1->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(company::Employee));
	 * set aDepartment.employees := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_department_ast_department__employees(final /*@NonInvalid*/ @NonNull department lDepartment_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lDepartment_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDepartment_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable department_employees department_employees = lDepartment_0.getDepartment_employees();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
				final /*@Thrown*/ @NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
				if (department_employees == null) {
					throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_employees::employee\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<employee> employee = department_employees.getEmployee();
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_employee = idResolver.createOrderedSetOfAll(ORD_CLSSid_employee, employee);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Employee);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_employee.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull employee _1 = (employee)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(company::Employee)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
					final /*@Thrown*/ @Nullable EObject ast_0 = _1.getAst();
					final /*@Thrown*/ @NonNull Employee oclAsType_0 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Employee_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<Employee> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, collect);
				oclAsType.getEmployees().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_department_ast_department__employees = ValueUtil.TRUE_VALUE;
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
	 *
	 *   guard:leftCS lDepartment  : companies::department[1];
	 * guard:leftCS lEmployee  : companies::employee[1];
	 * var ast : ecore::EObject[?] := lEmployee.ast;
	 * var ast1 : ecore::EObject[1] := lDepartment.ast;
	 * var aDepartment : company::Department[1] := ast1.oclAsType(company::Department)
	 *   ;
	 * var aEmployee : company::Employee[1] := ast.oclAsType(company::Employee);
	 * set aEmployee.address := lEmployee.address;
	 * set aDepartment.manager := aEmployee;
	 *
	 */
	protected boolean MAP_m_department_ast_department__manager(final /*@NonInvalid*/ @NonNull department lDepartment_1, final /*@NonInvalid*/ @NonNull employee lEmployee_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lEmployee_0.getAst();
			final /*@Thrown*/ @Nullable EObject ast_0 = lDepartment_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast_0 != null;
			/*@Thrown*/ @Nullable Boolean raw_ast1;
			if (symbol_0) {
				if (ast_0 == null) {
					throw throwNull(lDepartment_1, "Null where non-null value required");
				}
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
				final /*@Thrown*/ @NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
				final /*@Thrown*/ @NonNull Employee oclAsType_0 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
				// mapping statements
				final /*@Thrown*/ @Nullable String address = lEmployee_0.getAddress();
				if (address == null) {
					throw throwNull(lDepartment_1, "Null value for company::Employee::address assignment");
				}
				oclAsType_0.setAddress(address);
				oclAsType.setManager(oclAsType_0);
				final /*@Thrown*/ @Nullable Boolean m_department_ast_department__manager = ValueUtil.TRUE_VALUE;
				raw_ast1 = m_department_ast_department__manager;
			}
			else {
				raw_ast1 = ValueUtil.FALSE_VALUE;
			}
			return raw_ast1;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_department_ast_department__manager", e);
		}
	}

	/**
	 *
	 * map m_department_ast_name in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDepartment  : companies::department[1];
	 * var ast : ecore::EObject[1] := lDepartment.ast;
	 * var name : String[?] := lDepartment.name;
	 * var aDepartment : company::Department[1] := ast.oclAsType(company::Department);
	 * set aDepartment.name := name;
	 *
	 */
	protected boolean MAP_m_department_ast_name(final /*@NonInvalid*/ @NonNull department lDepartment_2)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lDepartment_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDepartment_2, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable String name = lDepartment_2.getName();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
				final /*@Thrown*/ @NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
				// mapping statements
				if (name == null) {
					throw throwNull(lDepartment_2, "Null value for company::Department::name assignment");
				}
				oclAsType.setName(name);
				final /*@Thrown*/ @Nullable Boolean m_department_ast_name = ValueUtil.TRUE_VALUE;
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
	 * map m_department_ast_deparment in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDepartment  : companies::department[1];
	 * var ast : ecore::EObject[1] := lDepartment.ast;
	 * var deparment : OrderedSet(companies::department)[*|1] := lDepartment.deparment;
	 * var aDepartment : company::Department[1] := ast.oclAsType(company::Department)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(company::Department) := deparment->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(company::Department));
	 * set aDepartment.subdepts := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_department_ast_deparment(final /*@NonInvalid*/ @NonNull department lDepartment_3)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lDepartment_3.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDepartment_3, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<department> deparment = lDepartment_3.getDeparment();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
				final /*@Thrown*/ @NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_deparment = idResolver.createOrderedSetOfAll(ORD_CLSSid_department, deparment);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Department);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_deparment.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull department _1 = (department)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(company::Department)
					 */
					final /*@Thrown*/ @Nullable EObject ast_0 = _1.getAst();
					final /*@Thrown*/ @NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
				oclAsType.getSubdepts().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_department_ast_deparment = ValueUtil.TRUE_VALUE;
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
	 * map m_employee_ast_name_salary in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lEmployee  : companies::employee[1];
	 * var ast : ecore::EObject[1] := lEmployee.ast;
	 * var aEmployee : company::Employee[1] := ast.oclAsType(company::Employee);
	 * set aEmployee.name := lEmployee.name;
	 * set aEmployee.salary := lEmployee.salary;
	 *
	 */
	protected boolean MAP_m_employee_ast_name_salary(final /*@NonInvalid*/ @NonNull employee lEmployee_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lEmployee_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lEmployee_1, "Null where non-null value required");
				}
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
				final /*@Thrown*/ @NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
				// mapping statements
				final /*@Thrown*/ @Nullable String name = lEmployee_1.getName();
				if (name == null) {
					throw throwNull(lEmployee_1, "Null value for company::Employee::name assignment");
				}
				oclAsType.setName(name);
				final /*@Thrown*/ double salary = lEmployee_1.getSalary();
				oclAsType.setSalary(salary);
				final /*@Thrown*/ @Nullable Boolean m_employee_ast_name_salary = ValueUtil.TRUE_VALUE;
				raw_ast = m_employee_ast_name_salary;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_employee_ast_name_salary", e);
		}
	}

	/**
	 *
	 * map m_employee_ast_mentor in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lEmployee  : companies::employee[1];
	 * var ast : ecore::EObject[1] := lEmployee.ast;
	 * var mentor : String[?] := lEmployee.mentor;
	 * var aEmployee : company::Employee[1] := ast.oclAsType(company::Employee)
	 *   ;
	 * var lookupEmployee : company::Employee[?] := aEmployee.lookupEmployee(mentor);
	 * set aEmployee.mentor := lookupEmployee;
	 *
	 */
	protected boolean MAP_m_employee_ast_mentor(final /*@NonInvalid*/ @NonNull employee lEmployee_2)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable EObject ast = lEmployee_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lEmployee_2, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable String mentor = lEmployee_2.getMentor();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
				final /*@Thrown*/ @NonNull Employee oclAsType = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Employee_0));
				final /*@Thrown*/ boolean eq = mentor == null;
				/*@Thrown*/ @Nullable Employee symbol_2;
				if (eq) {
					symbol_2 = null;
				}
				else {
					final /*@Thrown*/ @NonNull LookupEnvironment env_Employee = INSTANCE_OclElement_env_Employee.evaluate(oclAsType);
					final /*@Thrown*/ @NonNull OrderedSetValue foundEmployee = INSTANCE_Visitable__lookupEmployee.evaluate(oclAsType, env_Employee, mentor);
					final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(foundEmployee).booleanValue();
					/*@Thrown*/ @Nullable Employee symbol_1;
					if (isEmpty) {
						symbol_1 = null;
					}
					else {
						final /*@Thrown*/ @Nullable Employee first = (Employee)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundEmployee);
						symbol_1 = first;
					}
					symbol_2 = symbol_1;
				}
				// mapping statements
				oclAsType.setMentor(symbol_2);
				final /*@Thrown*/ @Nullable Boolean m_employee_ast_mentor = ValueUtil.TRUE_VALUE;
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
