/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupQualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package uk.ac.york.cs.asbh.lang.cs2as.target.util;

import java.util.List;
import org.eclipse.emf.common.util.EList;
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
import uk.ac.york.cs.asbh.lang.cs2as.target.A2;
import uk.ac.york.cs.asbh.lang.cs2as.target.C;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.AbstractTargetCommonLookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;

public class TargetQualifiedCLookupVisitor
	extends AbstractTargetCommonLookupVisitor
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_lookup_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/lookup/1.0", null, LookupEnvironmentPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0", null, TargetPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_A2 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A2", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_C = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("C", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_lookup_s_1_0.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_C = TypeId.ORDERED_SET.getSpecializedId(CLSSid_C);
    
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.evaluation.@org.eclipse.jdt.annotation.NonNull Executor executor;
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver;
    
    public TargetQualifiedCLookupVisitor(@NonNull LookupEnvironment context) {
        super(context);
        this.executor = context.getExecutor();
        this.idResolver = executor.getIdResolver();
    }
    
    @Override
    protected @Nullable LookupEnvironment doVisiting(@NonNull Visitable visitable) {
        return context;
    }
    
    /**
     * visitA2(element : target::A2[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitA2(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull A2 element) {
        @SuppressWarnings("null")
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<C> ownsC = element.getOwnsC();
        @SuppressWarnings("null")
        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements((EList<C>)ownsC);
        return addElements;
    }
}
