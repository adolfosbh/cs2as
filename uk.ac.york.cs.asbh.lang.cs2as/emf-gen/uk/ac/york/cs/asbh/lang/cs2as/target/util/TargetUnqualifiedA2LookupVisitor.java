/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupUnqualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package uk.ac.york.cs.asbh.lang.cs2as.target.util;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import uk.ac.york.cs.asbh.lang.cs2as.target.A;
import uk.ac.york.cs.asbh.lang.cs2as.target.TRoot;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.AbstractTargetCommonLookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;

public class TargetUnqualifiedA2LookupVisitor
	extends AbstractTargetCommonLookupVisitor
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_lookup_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/lookup/1.0", null, LookupEnvironmentPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0", null, TargetPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_java_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_target_util = IdManager.getRootPackageId("java://uk.ac.york.cs.asbh.lang.cs2as.target.util");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_A = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_lookup_s_1_0.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TRoot = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("TRoot", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TargetUnqualifiedA2LookupVisitor = PACKid_java_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_target_util.getClassId("TargetUnqualifiedA2LookupVisitor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_A = TypeId.ORDERED_SET.getSpecializedId(CLSSid_A);
    
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.evaluation.@org.eclipse.jdt.annotation.NonNull Executor executor;
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver;
    protected /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child;
    
    public TargetUnqualifiedA2LookupVisitor(@NonNull LookupEnvironment context) {
        super(context);
        this.executor = context.getExecutor();
        this.idResolver = executor.getIdResolver();
    }
    
    @Override
    protected @Nullable LookupEnvironment doVisiting(@NonNull Visitable visitable) {
        return parentEnv((EObject)visitable);
    }
    
    /**
     * Continue the search for matches in the parent of element.
     */
    protected @Nullable LookupEnvironment parentEnv(@NonNull EObject element) {
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
     * visitTRoot(element : target::TRoot[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitTRoot(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull TRoot element) {
        @SuppressWarnings("null")
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<A> ownedA = element.getOwnedA();
        @SuppressWarnings("null")
        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = context.addElements((EList<A>)ownedA);
        final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
        /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
        if (hasFinalResult) {
            symbol_0 = inner;
        }
        else {
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element);
            symbol_0 = parentEnv;
        }
        return symbol_0;
    }
}
