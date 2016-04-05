/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupUnqualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.xtext.example.company.util;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.company.Department;
import org.xtext.example.company.Employee;
import org.xtext.example.company.lookup.LookupEnvironment;
import org.xtext.example.company.lookup.LookupPackage;
import org.xtext.example.company.util.AbstractCompanyCommonLookupVisitor;
import org.xtext.example.company.util.Visitable;

public class CompanyUnqualifiedEmployeeLookupVisitor
	extends AbstractCompanyCommonLookupVisitor
{
    public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_company_com = IdManager.getNsURIPackageId("http://www.company.com", null, CompanyPackage.eINSTANCE);
    public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ RootPackageId PACKid_java_c_s_s_org_xtext_example_company_util = IdManager.getRootPackageId("java://org.xtext.example.company.util");
    public static final /*@NonInvalid*/ RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ ClassId CLSSid_CompanyUnqualifiedEmployeeLookupVisitor = PACKid_java_c_s_s_org_xtext_example_company_util.getClassId("CompanyUnqualifiedEmployeeLookupVisitor", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_Department = PACKid_http_c_s_s_www_company_com.getClassId("Department", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_Employee = PACKid_http_c_s_s_www_company_com.getClassId("Employee", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Employee = TypeId.SET.getSpecializedId(CLSSid_Employee);
    
    protected final /*@Thrown*/ Executor executor;
    protected final /*@Thrown*/ IdResolver idResolver;
    protected /*@Thrown*/ Object child;
    
    public CompanyUnqualifiedEmployeeLookupVisitor(/*@NonNull*/ LookupEnvironment context) {
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
     * visitDepartment(element : company::Department[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDepartment(final /*@NonInvalid*/ Department element) {
        final /*@Thrown*/ LookupEnvironment parentEnv = this.parentEnv(element);
        if (parentEnv == null) {
            throw new InvalidValueException("Null source for \'lookup::LookupEnvironment::addElements(NE)(Collection(addElements.NE)) : lookup::LookupEnvironment[1]\'");
        }
        final /*@Thrown*/ List<Employee> employees = element.getEmployees();
        final /*@Thrown*/ SetValue BOXED_employees = idResolver.createSetOfAll(SET_CLSSid_Employee, employees);
        final /*@Thrown*/ Employee manager = element.getManager();
        final /*@Thrown*/ SetValue including = (SetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_employees, manager);
        final /*@Thrown*/ List<Employee> ECORE_including = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, including);
        final /*@Thrown*/ LookupEnvironment addElements = parentEnv.addElements(ECORE_including);
        return addElements;
    }
}
