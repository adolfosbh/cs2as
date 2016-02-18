/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupUnqualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.xtext.example.company.util;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.xtext.example.company.Company;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.company.Department;
import org.xtext.example.company.Employee;
import org.xtext.example.company.lookup.LookupEnvironment;
import org.xtext.example.company.lookup.LookupPackage;
import org.xtext.example.company.util.AbstractCompanyCommonLookupVisitor;
import org.xtext.example.company.util.Visitable;

public class CompanyUnqualifiedLookupVisitor
	extends AbstractCompanyCommonLookupVisitor
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_company_com = IdManager.getNsURIPackageId("http://www.company.com", null, CompanyPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_java_c_s_s_org_xtext_example_company_util = IdManager.getRootPackageId("java://org.xtext.example.company.util");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Company = PACKid_http_c_s_s_www_company_com.getClassId("Company", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_CompanyUnqualifiedLookupVisitor = PACKid_java_c_s_s_org_xtext_example_company_util.getClassId("CompanyUnqualifiedLookupVisitor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Department = PACKid_http_c_s_s_www_company_com.getClassId("Department", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Employee = PACKid_http_c_s_s_www_company_com.getClassId("Employee", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId BAG_CLSSid_Employee = TypeId.BAG.getSpecializedId(CLSSid_Employee);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Department = TypeId.SET.getSpecializedId(CLSSid_Department);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Employee = TypeId.SET.getSpecializedId(CLSSid_Employee);
    
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.evaluation.@org.eclipse.jdt.annotation.NonNull Executor executor;
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver;
    protected /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child;
    
    public CompanyUnqualifiedLookupVisitor(/*@NonNull*/ LookupEnvironment context) {
        super(context);
        this.executor = context.getExecutor();
        this.idResolver = executor.getIdResolver();
    }
    
    @Override
    protected /*@Nullable*/ LookupEnvironment doVisiting(/*@NonNull*/ Visitable visitable) {
        return parentEnv((EObject)visitable);
    }
    
    /**
     * Continue the search for matches in the parent of element.
     */
    protected /*@Nullable*/ LookupEnvironment parentEnv(/*@NonNull*/ EObject element) {
        EObject parent = element.eContainer();
        if (parent instanceof Visitable) {
            this.child = element;
            return ((Visitable)parent).accept(this);
        }
        else {
            return context;
        }
    }
    
    /**
     * visitCompany(element : company::Company[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitCompany(final /*@NonInvalid*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Company element) {
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull StandardLibrary standardLibrary = idResolver.getStandardLibrary();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> depts = element.getDepts();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue BOXED_depts = idResolver.createSetOfAll(SET_CLSSid_Department, depts);
        final org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYPE_closure_0 = executor.getStaticTypeOf(BOXED_depts);
        final LibraryIteration.@org.eclipse.jdt.annotation.NonNull LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
        final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, SET_CLSSid_Department, SET_CLSSid_Department);
        /**
         * Implementation of the iterator body.
         */
        final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation()
        {
            /**
             * _'null' : Set(company::Department)
             */
            @Override
            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_depts, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object _1) {
                final /*@NonInvalid*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Department symbol_0 = (Department)_1;
                if (symbol_0 == null) {
                    throw new InvalidValueException("Null source for \'\'http://www.company.com\'::Department::subdepts\'");
                }
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Department> subdepts = symbol_0.getSubdepts();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue BOXED_subdepts = idResolver.createSetOfAll(SET_CLSSid_Department, subdepts);
                return BOXED_subdepts;
            }
        };
        final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, SET_CLSSid_Department, BODY_closure_0, BOXED_depts, ACC_closure_0);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
        /*@Thrown*/ BagValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createBagAccumulatorValue(BAG_CLSSid_Employee);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = closure.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull BagValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.xtext.example.company.@org.eclipse.jdt.annotation.Nullable Department _1_0 = (Department)ITERATOR__1_0.next();
            /**
             * _'null' : Set(company::Employee)
             */
            if (_1_0 == null) {
                throw new InvalidValueException("Null source for \'\'http://www.company.com\'::Department::manager\'");
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> employees = _1_0.getEmployees();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue BOXED_employees = idResolver.createSetOfAll(SET_CLSSid_Employee, employees);
            final /*@Thrown*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee manager = _1_0.getManager();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue including = (SetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_employees, manager);
            //
            for (Object value : including.flatten().getElements()) {
                accumulator.add(value);
            }
        }
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Employee> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, collect);
        final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = context.addElements(ECORE_collect);
        final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
        /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (hasFinalResult) {
            symbol_1 = inner;
        }
        else {
            final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element);
            symbol_1 = parentEnv;
        }
        return symbol_1;
    }
    
    /**
     * visitEmployee(element : company::Employee[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitEmployee(final /*@NonInvalid*/ org.xtext.example.company.@org.eclipse.jdt.annotation.NonNull Employee element_0) {
        final /*@Thrown*/ org.xtext.example.company.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_0);
        return parentEnv;
    }
}
