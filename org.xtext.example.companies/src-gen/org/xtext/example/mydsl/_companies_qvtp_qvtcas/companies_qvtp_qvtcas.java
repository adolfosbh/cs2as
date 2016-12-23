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
@SuppressWarnings({"nls","unused"})
public class companies_qvtp_qvtcas extends AbstractCS2ASTransformer
{
	public static final /*@NonInvalid*/ @NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_company_com = IdManager.getNsURIPackageId("http://www.company.com", null, CompanyPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_xtext_org_s_example_s_mydsl_s_Companies = IdManager.getNsURIPackageId("http://www.xtext.org/example/mydsl/Companies", null, CompaniesPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies_s_lookup = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies/lookup", null, LookupPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Company = PACKid_http_c_s_s_www_company_com.getClassId("Company", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Department = PACKid_http_c_s_s_www_company_com.getClassId("Department", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Employee = PACKid_http_c_s_s_www_company_com.getClassId("Employee", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies_s_lookup.getClassId("LookupEnvironment", 0);
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
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_parentEnv = CLSSid_LookupEnvironment.getPropertyId("parentEnv");
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Department = TypeId.SEQUENCE.getSpecializedId(CLSSid_Department);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Employee = TypeId.SEQUENCE.getSpecializedId(CLSSid_Employee);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Department = TypeId.SET.getSpecializedId(CLSSid_Department);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Employee = TypeId.SET.getSpecializedId(CLSSid_Employee);

	/*
	 * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
	 */
	private static final @NonNull ClassId @NonNull [] classIndex2classId = new @NonNull ClassId[]{
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
		final @NonNull Connection ji_company = models[0/*leftCS*/].getConnection(0/*companies::company*/);
		final @NonNull Connection ji_department = models[0/*leftCS*/].getConnection(1/*companies::department*/);
		final @NonNull Connection ji_employee = models[0/*leftCS*/].getConnection(2/*companies::employee*/);
		return MAP_r___root__(ji_company, ji_department, ji_employee) && invocationManager.flush();
	}

	/**
	 * company::Visitable::_lookupEmployee(env : lookup::LookupEnvironment[?], eName : String[?]) : OrderedSet(company::Employee)
	 *
	 *
	 * let
	 *   foundEmployee : OrderedSet(company::Employee) = env.namedElements->selectByKind(Employee)
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
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies/lookup\'::LookupEnvironment::namedElements\'");
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
						throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies/lookup\'::LookupEnvironment::parentEnv\'");
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
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies/lookup\'::LookupEnvironment::parentEnv\'");
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
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Company self_2 = (/*@NonInvalid*/ @NonNull Company)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Object child = (/*@NonInvalid*/ @Nullable Object)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @NonNull LookupEnvironment self_6 = INSTANCE_OclElement_parentEnv_Employee.evaluate(self_2);
			final /*@NonInvalid*/ @NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_6);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<Department> depts = self_2.getDepts();
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
				 * ::_'null' : Set(company::Employee)
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

		public LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Company self_2, final /*@NonInvalid*/ @Nullable Object child) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_2, child});
		}
	}

	protected final @NonNull CACHE_Company__unqualified_env_Employee INST_Company__unqualified_env_Employee = new CACHE_Company__unqualified_env_Employee();

	/**
	 * ocl::OclElement::_unqualified_env_Employee(child : OclElement[?]) : lookup::LookupEnvironment[1]
	 *
	 * parentEnv_Employee()
	 */
	public class CACHE_OclElement__unqualified_env_Employee extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Object self_4 = (/*@NonInvalid*/ @NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Object child_0 = (/*@NonInvalid*/ @Nullable Object)sourceAndArgumentValues[1];
			final /*@Thrown*/ @NonNull LookupEnvironment parentEnv_Employee = INSTANCE_OclElement_parentEnv_Employee.evaluate(self_4);
			return parentEnv_Employee;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Object self_4, final /*@NonInvalid*/ @Nullable Object child_0) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_4, child_0});
		}
	}

	protected final @NonNull CACHE_OclElement__unqualified_env_Employee INST_OclElement__unqualified_env_Employee = new CACHE_OclElement__unqualified_env_Employee();

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
			install(Company.class, INST_Company__unqualified_env_Employee);
			install(Object.class, INST_OclElement__unqualified_env_Employee);
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Object self_4, final /*@NonInvalid*/ @Nullable Object child_0) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_4, child_0});
		}
	}

	protected final @NonNull VCACHE_OclElement__unqualified_env_Employee INSTANCE_OclElement__unqualified_env_Employee = new VCACHE_OclElement__unqualified_env_Employee();

	/**
	 *
	 * map r___root__ in companies_qvtp_qvtcas {
	 *
	 *   append ji_company  : companies::company[1];
	 * append ji_department  : companies::department[1];
	 * append ji_employee  : companies::employee[1];
	 * install m_Company_name_e {
	 * lCompany consumes append ji_company  : companies::company[1];
	 * ;
	 * }
	 *   install m_Department_name_e {
	 * lDepartment consumes append ji_department  : companies::department[1];
	 * ;
	 * }
	 *   install m_Employee_address_name_salary_e {
	 * lEmployee consumes append ji_employee  : companies::employee[1];
	 * ;
	 * }
	 *   install m_Visitable__depts {
	 * lCompany consumes append ji_company  : companies::company[1];
	 * ;
	 * }
	 *   install m_Visitable__Department_employees_manager_subdepts_lc {
	 * lDepartment consumes append ji_department  : companies::department[1];
	 * ;
	 * }
	 *   install m_Visitable__mentor {
	 * lEmployee consumes append ji_employee  : companies::employee[1];
	 * ;
	 * }
	 */
	protected boolean MAP_r___root__(final @NonNull Connection ji_company, final @NonNull Connection ji_department, final @NonNull Connection ji_employee)  {
		try {
			// mapping statements
			for (@NonNull company lCompany_1 : ji_company.typedIterable(company.class)) {
				MAP_m_Company_name_e(lCompany_1);
			}
			for (@NonNull department lDepartment_1 : ji_department.typedIterable(department.class)) {
				MAP_m_Department_name_e(lDepartment_1);
			}
			for (@NonNull employee lEmployee_1 : ji_employee.typedIterable(employee.class)) {
				MAP_m_Employee_address_name_salary_e(lEmployee_1);
			}
			for (@NonNull company lCompany_2 : ji_company.typedIterable(company.class)) {
				MAP_m_Visitable__depts(lCompany_2);
			}
			for (@NonNull department lDepartment_2 : ji_department.typedIterable(department.class)) {
				MAP_m_Visitable__Department_employees_manager_subdepts_lc(lDepartment_2);
			}
			for (@NonNull employee lEmployee_2 : ji_employee.typedIterable(employee.class)) {
				MAP_m_Visitable__mentor(lEmployee_2);
			}
			final /*@Thrown*/ @Nullable Boolean r___root__ = ValueUtil.TRUE_VALUE;
			return r___root__;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_r___root__", e);
		}
	}

	/**
	 *
	 * map m_Company_name_e in companies_qvtp_qvtcas {
	 * guard:leftCS lCompany  : companies::company[1];
	 * var name : String[?] := lCompany.name;
	 * new:rightAS rCompany : company::Company[1];
	 * set lCompany.ast := rCompany;
	 * set rCompany.name := name;
	 *
	 */
	protected boolean MAP_m_Company_name_e(final /*@NonInvalid*/ @NonNull company lCompany)  {
		try {
			final /*@Thrown*/ @Nullable String name = lCompany.getName();
			// creations
			final @SuppressWarnings("null")@NonNull Company rCompany = CompanyFactory.eINSTANCE.createCompany();
			models[1/*rightAS*/].add(rCompany, false);
			// mapping statements
			lCompany.setAst(rCompany);
			if (name == null) {
				throw throwNull(lCompany, "Null value for company::Company::name assignment");
			}
			rCompany.setName(name);
			final /*@Thrown*/ @Nullable Boolean m_Company_name_e = ValueUtil.TRUE_VALUE;
			return m_Company_name_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Company_name_e", e);
		}
	}

	/**
	 *
	 * map m_Department_name_e in companies_qvtp_qvtcas {
	 * guard:leftCS lDepartment  : companies::department[1];
	 * var name : String[?] := lDepartment.name;
	 * new:rightAS rDepartment : company::Department[1];
	 * set lDepartment.ast := rDepartment;
	 * set rDepartment.name := name;
	 *
	 */
	protected boolean MAP_m_Department_name_e(final /*@NonInvalid*/ @NonNull department lDepartment)  {
		try {
			final /*@Thrown*/ @Nullable String name = lDepartment.getName();
			// creations
			final @SuppressWarnings("null")@NonNull Department rDepartment = CompanyFactory.eINSTANCE.createDepartment();
			models[1/*rightAS*/].add(rDepartment, false);
			// mapping statements
			lDepartment.setAst(rDepartment);
			if (name == null) {
				throw throwNull(lDepartment, "Null value for company::Department::name assignment");
			}
			rDepartment.setName(name);
			final /*@Thrown*/ @Nullable Boolean m_Department_name_e = ValueUtil.TRUE_VALUE;
			return m_Department_name_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Department_name_e", e);
		}
	}

	/**
	 *
	 * map m_Employee_address_name_salary_e in companies_qvtp_qvtcas {
	 * guard:leftCS lEmployee  : companies::employee[1];
	 * var address : String[?] := lEmployee.address;
	 * var name : String[?] := lEmployee.name;
	 * var salary : ecore::EDouble[?] := lEmployee.salary;
	 * new:rightAS rEmployee : company::Employee[1];
	 * set lEmployee.ast := rEmployee;
	 * set rEmployee.address := address;
	 * set rEmployee.name := name;
	 * set rEmployee.salary := salary;
	 *
	 */
	protected boolean MAP_m_Employee_address_name_salary_e(final /*@NonInvalid*/ @NonNull employee lEmployee)  {
		try {
			final /*@Thrown*/ @Nullable String address = lEmployee.getAddress();
			final /*@Thrown*/ @Nullable String name = lEmployee.getName();
			final /*@Thrown*/ double salary = lEmployee.getSalary();
			// creations
			final @SuppressWarnings("null")@NonNull Employee rEmployee = CompanyFactory.eINSTANCE.createEmployee();
			models[1/*rightAS*/].add(rEmployee, false);
			// mapping statements
			lEmployee.setAst(rEmployee);
			if (address == null) {
				throw throwNull(lEmployee, "Null value for company::Employee::address assignment");
			}
			rEmployee.setAddress(address);
			if (name == null) {
				throw throwNull(lEmployee, "Null value for company::Employee::name assignment");
			}
			rEmployee.setName(name);
			rEmployee.setSalary(salary);
			final /*@Thrown*/ @Nullable Boolean m_Employee_address_name_salary_e = ValueUtil.TRUE_VALUE;
			return m_Employee_address_name_salary_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Employee_address_name_salary_e", e);
		}
	}

	/**
	 *
	 * map m_Visitable__depts in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCompany  : companies::company[1];
	 * var ast : company::Visitable[1] := lCompany.ast;
	 * var deparment : OrderedSet(companies::department) := lCompany.deparment;
	 * var aCompany : company::Company[1] := ast.oclAsType(company::Company)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(company::Department)[*|?] := deparment->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(company::Department));
	 * set aCompany.depts := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_Visitable__depts(final /*@NonInvalid*/ @NonNull company lCompany_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lCompany_0.getAst();
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
					final /*@Thrown*/ @Nullable Visitable ast_0 = _1.getAst();
					final /*@Thrown*/ @NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_company_c_c_Department_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
				oclAsType.getDepts().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__depts = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__depts;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__depts", e);
		}
	}

	/**
	 *
	 * map m_Visitable__Department_employees_manager_subdepts_lc in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDepartment  : companies::department[1];
	 * var ast : company::Visitable[1] := lDepartment.ast;
	 * var ast2 : company::Visitable[1] := lDepartment.ast;
	 * var ast3 : company::Visitable[1] := lDepartment.ast;
	 * var deparment : OrderedSet(companies::department) := lDepartment.deparment;
	 * var department_employees1 : companies::department_employees[?] := lDepartment.department_employees;
	 * var department_manager1 : companies::department_manager[?] := lDepartment.department_manager;
	 * var aDepartment : company::Department[1] := ast.oclAsType(company::Department);
	 * var employee1 : OrderedSet(companies::employee) := department_employees1.employee;
	 * var employee2 : companies::employee[?] := department_manager1.employee;
	 * check ast2 = lDepartment.ast;
	 * check ast3 =
	 *   lDepartment.ast;
	 * var ast1 : company::Visitable[?] := employee2.ast;
	 * var _'\u00ABcollect\u00BB1' : Sequence(company::Department)[*|?] := deparment->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(company::Department))
	 *   ;
	 * var aEmployee : company::Employee[1] := ast1.oclAsType(company::Employee)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(company::Employee)[*|?] := employee1->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(company::Employee));
	 * set aDepartment.subdepts := _'\u00ABcollect\u00BB1';
	 * set aDepartment.employees := _'\u00ABcollect\u00BB';
	 * set aDepartment.manager := aEmployee;
	 *
	 */
	protected boolean MAP_m_Visitable__Department_employees_manager_subdepts_lc(final /*@NonInvalid*/ @NonNull department lDepartment_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lDepartment_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDepartment_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast2;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lDepartment_0, "Null where non-null value required");
					}
					final /*@Thrown*/ boolean symbol_2 = ast != null;
					/*@Thrown*/ @Nullable Boolean raw_ast3;
					if (symbol_2) {
						if (ast == null) {
							throw throwNull(lDepartment_0, "Null where non-null value required");
						}
						@SuppressWarnings("null")
						final /*@Thrown*/ @NonNull List<department> deparment = lDepartment_0.getDeparment();
						final /*@Thrown*/ @Nullable department_employees department_employees = lDepartment_0.getDepartment_employees();
						final /*@Thrown*/ @Nullable department_manager department_manager = lDepartment_0.getDepartment_manager();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Department_0 = idResolver.getClass(CLSSid_Department, null);
						final /*@Thrown*/ @NonNull Department oclAsType = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_company_c_c_Department_0));
						if (department_employees == null) {
							throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_employees::employee\'");
						}
						@SuppressWarnings("null")
						final /*@Thrown*/ @NonNull List<employee> employee = department_employees.getEmployee();
						if (department_manager == null) {
							throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::department_manager::employee\'");
						}
						final /*@Thrown*/ @Nullable employee employee_0 = department_manager.getEmployee();
						final /*@Thrown*/ boolean symbol_3 = ast.equals(ast);
						/*@Thrown*/ @Nullable Boolean symbol_10;
						if (symbol_3) {
							final /*@Thrown*/ boolean symbol_4 = ast.equals(ast);
							/*@Thrown*/ @Nullable Boolean symbol_9;
							if (symbol_4) {
								if (employee_0 == null) {
									throw throwNull(lDepartment_0, "Null source for \'\'http://www.xtext.org/example/mydsl/Companies\'::CSTrace::ast\'");
								}
								final /*@Thrown*/ @Nullable Visitable ast_4 = employee_0.getAst();
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
									final /*@Thrown*/ @Nullable Visitable ast_5 = _1.getAst();
									final /*@Thrown*/ @NonNull Department oclAsType_0 = ClassUtil.nonNullState((Department)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_5, TYP_company_c_c_Department_0));
									//
									accumulator.add(oclAsType_0);
								}
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CLSSid_Employee, null);
								final /*@Thrown*/ @NonNull Employee oclAsType_1 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_4, TYP_company_c_c_Employee_0));
								final /*@Thrown*/ @NonNull OrderedSetValue BOXED_employee = idResolver.createOrderedSetOfAll(ORD_CLSSid_employee, employee);
								/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Employee);
								@NonNull Iterator<Object> ITERATOR__1_0 = BOXED_employee.iterator();
								/*@Thrown*/ @NonNull SequenceValue collect_0;
								while (true) {
									if (!ITERATOR__1_0.hasNext()) {
										collect_0 = accumulator_0;
										break;
									}
									@SuppressWarnings("null")
									/*@NonInvalid*/ @NonNull employee _1_0 = (employee)ITERATOR__1_0.next();
									/**
									 * _'1_'.ast.oclAsType(company::Employee)
									 */
									final /*@Thrown*/ @Nullable Visitable ast_6 = _1_0.getAst();
									final /*@Thrown*/ @NonNull Employee oclAsType_2 = ClassUtil.nonNullState((Employee)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_6, TYP_company_c_c_Employee_0));
									//
									accumulator_0.add(oclAsType_2);
								}
								// mapping statements
								final /*@Thrown*/ @NonNull List<Department> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Department.class, collect);
								oclAsType.getSubdepts().addAll(ECORE_collect);
								final /*@Thrown*/ @NonNull List<Employee> ECORE_collect_0 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, collect_0);
								oclAsType.getEmployees().addAll(ECORE_collect_0);
								oclAsType.setManager(oclAsType_1);
								final /*@Thrown*/ @Nullable Boolean m_Visitable__Department_employees_manager_subdepts_lc = ValueUtil.TRUE_VALUE;
								symbol_9 = m_Visitable__Department_employees_manager_subdepts_lc;
							}
							else {
								symbol_9 = ValueUtil.FALSE_VALUE;
							}
							symbol_10 = symbol_9;
						}
						else {
							symbol_10 = ValueUtil.FALSE_VALUE;
						}
						raw_ast3 = symbol_10;
					}
					else {
						raw_ast3 = ValueUtil.FALSE_VALUE;
					}
					raw_ast2 = raw_ast3;
				}
				else {
					raw_ast2 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast2;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__Department_employees_manager_subdepts_lc", e);
		}
	}

	/**
	 *
	 * map m_Visitable__mentor in companies_qvtp_qvtcas {
	 *
	 *   guard:leftCS lEmployee  : companies::employee[1];
	 * var ast : company::Visitable[1] := lEmployee.ast;
	 * var mentor : String[?] := lEmployee.mentor;
	 * var aEmployee : company::Employee[1] := ast.oclAsType(company::Employee)
	 *   ;
	 * var lookupEmployee : company::Employee[?] := aEmployee.lookupEmployee(mentor);
	 * set aEmployee.mentor := lookupEmployee;
	 *
	 */
	protected boolean MAP_m_Visitable__mentor(final /*@NonInvalid*/ @NonNull employee lEmployee_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lEmployee_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lEmployee_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable String mentor = lEmployee_0.getMentor();
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
				final /*@Thrown*/ @Nullable Boolean m_Visitable__mentor = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__mentor;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__mentor", e);
		}
	}
}
