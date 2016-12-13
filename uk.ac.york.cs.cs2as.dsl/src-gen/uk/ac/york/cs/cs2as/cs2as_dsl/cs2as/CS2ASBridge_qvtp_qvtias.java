/*******************************************************************************
 * �codeGenHelper.getCopyright(' * ')�
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package uk.ac.york.cs.cs2as.cs2as_dsl.cs2as;

import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Import;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.qvtd.runtime.evaluation.TransformationExecutor;
import org.eclipse.qvtd.runtime.internal.cs2as.AbstractCS2ASTransformer;

/**
 * The CS2ASBridge_qvtp_qvtias transformation:
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
public class CS2ASBridge_qvtp_qvtias extends AbstractCS2ASTransformer
{
    public static final /*@NonNull*/ /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/BaseCS", null, BaseCSPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Element = PACKid_$metamodel$.getClassId("Element", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Import = PACKid_$metamodel$.getClassId("Import", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ImportCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("ImportCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Namespace = PACKid_$metamodel$.getClassId("Namespace", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ImportCS = TypeId.SET.getSpecializedId(CLSSid_ImportCS);
    
    /*
     * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
     */
    private static final /*@NonNull*/ ClassId[] classIndex2classId = new ClassId[]{
        CLSSid_ImportCS                 // 0 => ImportCS
    };
    
    /*
     * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
     * may contribute results to an allInstances() invocation.
     * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
     * instance of the derived classId contributes to derived and inherited ClassIndexes.
     */
    private final static /*@NonNull*/ int[][] classIndex2allClassIndexes = new int[][] {
        {0}                     // 0 : ImportCS -> {ImportCS}
    };
    
    
    public CS2ASBridge_qvtp_qvtias(final /*@NonNull*/ TransformationExecutor executor) throws ReflectiveOperationException {
        super(executor, new String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    public boolean run() throws ReflectiveOperationException {
        boolean returnStatus = MAP___root__();
        invocationManager.flush();
        return returnStatus;
    }
    
    /**
     * 
     * map cImportCS_2_Import in CS2ASBridge_qvtp_qvtias {
     * leftCS (importCS : basecs::ImportCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize import : Import[1];
     *  |}
     * where ( |)
     * { |
     * importCS.pivot := import;
     * }
     * 
     */
    protected boolean MAP_cImportCS_2_Import(final /*@NonNull*/ /*@NonInvalid*/ ImportCS importCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ Import symbol_0 = PivotFactory.eINSTANCE.createImport();
        assert symbol_0 != null;
        models[1/*rightAS*/].add(symbol_0);
        // property assignments
        importCS.setPivot(symbol_0);
        return true;
    }
    
    /**
     * 
     * map uImport_name in CS2ASBridge_qvtp_qvtias {
     * 
     *   leftCS (importCS : basecs::ImportCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Import[1];
     * _1 : String[?];
     *  |
     * _0 := importCS.pivot.oclAsType(Import);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uImport_name(final /*@NonNull*/ /*@NonInvalid*/ ImportCS importCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Import_0 = idResolver.getClass(CLSSid_Import, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = importCS_0.getPivot();
        final /*@NonNull*/ /*@Thrown*/ Import oclAsType = ClassUtil.nonNullState((Import)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Import_0));
        final /*@Nullable*/ /*@Thrown*/ String name = importCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uImport_importedNamespace in CS2ASBridge_qvtp_qvtias {
     * 
     *   leftCS (importCS : basecs::ImportCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Import[1];
     * _1 : Namespace[?];
     *  |
     * _0 := importCS.pivot.oclAsType(Import);
     * _1 := referredNamespace;
     * _0.importedNamespace := _1;
     * }
     * 
     */
    protected boolean MAP_uImport_importedNamespace(final /*@NonNull*/ /*@NonInvalid*/ ImportCS importCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Import_0 = idResolver.getClass(CLSSid_Import, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = importCS_1.getPivot();
        final /*@NonNull*/ /*@Thrown*/ Import oclAsType = ClassUtil.nonNullState((Import)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Import_0));
        final /*@Nullable*/ /*@Thrown*/ Namespace referredNamespace = importCS_1.getReferredNamespace();
        // property assignments
        oclAsType.setImportedNamespace(referredNamespace);
        return true;
    }
    
    /**
     * 
     * map __root__ in CS2ASBridge_qvtp_qvtias {
     * 
     *   where ( |)
     * { |}
     * for importCS : basecs::ImportCS in basecs::ImportCS.allInstances()
     *    {
     * map cImportCS_2_Import {
     * importCS := importCS;
     * }}
     *   for importCS : basecs::ImportCS in basecs::ImportCS.allInstances()
     *    {
     * map uImport_name {
     * importCS := importCS;
     * }}
     *   for importCS : basecs::ImportCS in basecs::ImportCS.allInstances()
     *    {
     * map uImport_importedNamespace {
     * importCS := importCS;
     * }}
     */
    protected boolean MAP___root__() throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_basecs_c_c_ImportCS_2 = idResolver.getClass(CLSSid_ImportCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_ImportCS, TYP_basecs_c_c_ImportCS_2);
        // mapping statements
        for (ImportCS importCS_5 : ValueUtil.typedIterable(ImportCS.class, allInstances_0)) {
            if (importCS_5 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ImportCS symbol_0 = (ImportCS)importCS_5;
                MAP_cImportCS_2_Import(symbol_0);
            }
        }
        for (ImportCS importCS_6 : ValueUtil.typedIterable(ImportCS.class, allInstances_0)) {
            if (importCS_6 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ImportCS symbol_3 = (ImportCS)importCS_6;
                MAP_uImport_name(symbol_3);
            }
        }
        for (ImportCS importCS_7 : ValueUtil.typedIterable(ImportCS.class, allInstances_0)) {
            if (importCS_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ImportCS symbol_6 = (ImportCS)importCS_7;
                MAP_uImport_importedNamespace(symbol_6);
            }
        }
        return true;
    }
}
