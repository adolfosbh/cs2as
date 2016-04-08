/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.qvtd.cs2as.compiler.internal.CS2ASJavaCompilerImpl$1
 *
 * Do not edit it.
 ********************************************************************************/

package uk.ac.york.cs.asbh.cs2as._Source2Target_qvtp_qvtcas;

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
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionLastOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedSetSubOrderedSetOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import uk.ac.york.cs.asbh.cs2as.tx.AbstractCS2ASTransformer;
import uk.ac.york.cs.asbh.cs2as.library.model.ModelObjectsOfKindOperation;
import uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS;
import uk.ac.york.cs.asbh.lang.cs2as.source.PathNameCS;
import uk.ac.york.cs.asbh.lang.cs2as.source.SRoot;
import uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage;
import uk.ac.york.cs.asbh.lang.cs2as.source.X;
import uk.ac.york.cs.asbh.lang.cs2as.source.Y;
import uk.ac.york.cs.asbh.lang.cs2as.source.Y1;
import uk.ac.york.cs.asbh.lang.cs2as.source.Y2;
import uk.ac.york.cs.asbh.lang.cs2as.source.Z;
import uk.ac.york.cs.asbh.lang.cs2as.target.A;
import uk.ac.york.cs.asbh.lang.cs2as.target.A1;
import uk.ac.york.cs.asbh.lang.cs2as.target.A2;
import uk.ac.york.cs.asbh.lang.cs2as.target.A3;
import uk.ac.york.cs.asbh.lang.cs2as.target.B;
import uk.ac.york.cs.asbh.lang.cs2as.target.C;
import uk.ac.york.cs.asbh.lang.cs2as.target.D;
import uk.ac.york.cs.asbh.lang.cs2as.target.TRoot;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetFactory;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.util.TargetLookupResult;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.util.TargetLookupSolver;

/**
 * The Source2Target_qvtp_qvtcas transformation:
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
public class Source2Target_qvtp_qvtcas extends AbstractCS2ASTransformer
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0", null, SourcePackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0", null, TargetPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/2015/QVTbaseLibrary", "qvtbaselib", null);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_A = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_A1 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A1", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_A2 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A2", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_A3 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A3", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_B = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("B", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_C = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("C", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_D = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("D", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_EObject = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Model = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary.getClassId("Model", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_PathElementCS = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("PathElementCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_PathNameCS = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("PathNameCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_SRoot = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("SRoot", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TRoot = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("TRoot", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Visitable = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("Visitable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_X = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("X", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Y = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Y", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Y1 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Y1", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Y2 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Y2", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Z = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Z", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_1 = ValueUtil.integerValueOf("1");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_PathElementCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_PathElementCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_X = TypeId.ORDERED_SET.getSpecializedId(CLSSid_X);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Y = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Y);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_A = TypeId.SEQUENCE.getSpecializedId(CLSSid_A);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_B = TypeId.SEQUENCE.getSpecializedId(CLSSid_B);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_C = TypeId.SEQUENCE.getSpecializedId(CLSSid_C);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Y1 = TypeId.SEQUENCE.getSpecializedId(CLSSid_Y1);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Y2 = TypeId.SEQUENCE.getSpecializedId(CLSSid_Y2);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_SRoot = TypeId.SET.getSpecializedId(CLSSid_SRoot);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_X = TypeId.SET.getSpecializedId(CLSSid_X);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Y1 = TypeId.SET.getSpecializedId(CLSSid_Y1);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Y2 = TypeId.SET.getSpecializedId(CLSSid_Y2);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Z = TypeId.SET.getSpecializedId(CLSSid_Z);
    
    /*
     * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
     */
    private static final @NonNull ClassId[] classIndex2classId = new @NonNull ClassId[]{
        CLSSid_SRoot,                   // 0 => SRoot
        CLSSid_X,                       // 1 => X
        CLSSid_Y1,                      // 2 => Y1
        CLSSid_Y2,                      // 3 => Y2
        CLSSid_Z                        // 4 => Z
    };
    
    /*
     * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
     * may contribute results to an allInstances() invocation.
     * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
     * instance of the derived classId contributes to derived and inherited ClassIndexes.
     */
    private final static int @NonNull [] @NonNull [] classIndex2allClassIndexes = new int @NonNull [] @NonNull [] {
        {0},                    // 0 : SRoot -> {SRoot}
        {1},                    // 1 : X -> {X}
        {2},                    // 2 : Y1 -> {Y1}
        {3},                    // 3 : Y2 -> {Y2}
        {4}                     // 4 : Z -> {Z}
    };
    
    private final TargetLookupSolver lookupSolver = new TargetLookupSolver(executor);
    
    public Source2Target_qvtp_qvtcas(final @NonNull Executor executor) throws ReflectiveOperationException {
        super(executor, new @NonNull String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    @Override
    public boolean run() throws ReflectiveOperationException {
        return MAP___root__() && invocationManager.flush();
    }
    
    /**
     * 
     * map __root__ in Source2Target_qvtp_qvtcas {
     *   leftCS ( |)
     * { |}
     * where ( |)
     * {_'\u00ABSRoot\u00BB' : Set(source::SRoot) = leftCS.objectsOfKind(source::SRoot)
     *   ;
     * _'\u00ABX\u00BB' : Set(source::X) = leftCS.objectsOfKind(source::X)
     *   ;
     * _'\u00ABY1\u00BB' : Set(source::Y1) = leftCS.objectsOfKind(source::Y1)
     *   ;
     * _'\u00ABY2\u00BB' : Set(source::Y2) = leftCS.objectsOfKind(source::Y2)
     *   ;
     * _'\u00ABZ\u00BB' : Set(source::Z) = leftCS.objectsOfKind(source::Z)
     *   ;
     * ji_SRoot : Set(source::SRoot[*|1]) = _'\u00ABSRoot\u00BB';
     * ji_X : Set(source::X[*|1]) = _'\u00ABX\u00BB';
     * ji_Y1 : Set(source::Y1[*|1]) = _'\u00ABY1\u00BB';
     * ji_Y2 : Set(source::Y2[*|1]) = _'\u00ABY2\u00BB';
     * ji_Z : Set(source::Z[*|1]) = _'\u00ABZ\u00BB';
     * ji_Z_1 : Set(source::Z[*|1]) = _'\u00ABZ\u00BB'->select(i | i.toY <> null)
     *   ;
     *  |}
     * for loop0 : source::SRoot in ji_SRoot {
     *     call m_SRoot_ast {
     * lSRoot := loop0;
     * }}
     *   for loop0 : source::X in ji_X {call m_X_ast {
     * lX := loop0;
     * }}
     *   for loop0 : source::X in ji_X {call m_X_ast_1 {
     * lX := loop0;
     * }}
     *   for loop0 : source::X in ji_X {call m_X_ast_2 {
     * lX := loop0;
     * }}
     *   for loop0 : source::Y1 in ji_Y1 {call m_Y1_ast {
     * lY1 := loop0;
     * }}
     *   for loop0 : source::Y2 in ji_Y2 {call m_Y2_ast {
     * lY2 := loop0;
     * }}
     *   for loop0 : source::Z in ji_Z {call m_Z_ast {
     * lZ := loop0;
     * }}
     *   for loop0 : source::Z in ji_Z {call m_Z_ast_1 {
     * lZ := loop0;
     * }}
     *   for loop0 : source::SRoot in ji_SRoot {
     *     call m_SRoot_ast_ownedX {
     * lSRoot := loop0;
     * }}
     *   for loop0 : source::X in ji_X {call m_X_ast_name_ownsY {
     * lX := loop0;
     * }}
     *   for loop0 : source::X in ji_X {call m_X_ast_name_ownsY_1 {
     * lX := loop0;
     * }}
     *   for loop0 : source::X in ji_X {call m_X_ast_name_ownsY_2 {
     * lX := loop0;
     * }}
     *   for loop0 : source::Y1 in ji_Y1 {call m_Y1_ast_name {
     * lY1 := loop0;
     * }}
     *   for loop0 : source::Y1 in ji_Y1 {call m_Y1_ast_ownsZ {
     * lY1 := loop0;
     * }}
     *   for loop0 : source::Y2 in ji_Y2 {call m_Y2_ast_name {
     * lY2 := loop0;
     * }}
     *   for loop0 : source::Y2 in ji_Y2 {call m_Y2_ast_ownsZ {
     * lY2 := loop0;
     * }}
     *   for loop0 : source::Z in ji_Z {call m_Z_ast_refers {
     * lZ := loop0;
     * }}
     *   for loop0 : source::Z in ji_Z_1 {call m_Z_ast_toY {
     * lZ := loop0;
     * }}
     *   for loop0 : source::Z in ji_Z {call m_Z_ast_refers_1 {
     * lZ := loop0;
     * }}
     *   for loop0 : source::Z in ji_Z_1 {call m_Z_ast_toY_1 {
     * lZ := loop0;
     * }}
     */
    protected boolean MAP___root__() throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_SRoot_0 = idResolver.getClass(CLSSid_SRoot, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_SRoot_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_SRoot, models[0/*leftCS*/], TYP_source_c_c_SRoot_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_X_0 = idResolver.getClass(CLSSid_X, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_X_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_X, models[0/*leftCS*/], TYP_source_c_c_X_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_Y1_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_Y1, models[0/*leftCS*/], TYP_source_c_c_Y1_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_Y2_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_Y2, models[0/*leftCS*/], TYP_source_c_c_Y2_0);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Z_0 = idResolver.getClass(CLSSid_Z, null);
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue _171_Z_187 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_Z, models[0/*leftCS*/], TYP_source_c_c_Z_0);
            // connection variables
            final SetValue.@NonNull Accumulator ji_SRoot = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_SRoot);
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull SRoot iterator : ValueUtil.typedIterable(SRoot.class, _171_SRoot_187)) {
                ji_SRoot.add(iterator);
            }
            final SetValue.@NonNull Accumulator ji_X = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_X);
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X iterator_0 : ValueUtil.typedIterable(X.class, _171_X_187)) {
                ji_X.add(iterator_0);
            }
            final SetValue.@NonNull Accumulator ji_Y1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_Y1);
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 iterator_1 : ValueUtil.typedIterable(Y1.class, _171_Y1_187)) {
                ji_Y1.add(iterator_1);
            }
            final SetValue.@NonNull Accumulator ji_Y2 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_Y2);
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 iterator_2 : ValueUtil.typedIterable(Y2.class, _171_Y2_187)) {
                ji_Y2.add(iterator_2);
            }
            final SetValue.@NonNull Accumulator ji_Z = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_Z);
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z iterator_3 : ValueUtil.typedIterable(Z.class, _171_Z_187)) {
                ji_Z.add(iterator_3);
            }
            final SetValue.@NonNull Accumulator ji_Z_1 = (SetValue.Accumulator)ValueUtil.createCollectionAccumulatorValue(SET_CLSSid_Z);
            /*@Thrown*/ SetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSetAccumulatorValue(SET_CLSSid_Z);
            @NonNull Iterator<Object> ITERATOR_i = _171_Z_187.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue select;
            while (true) {
                if (!ITERATOR_i.hasNext()) {
                    select = accumulator;
                    break;
                }
                @SuppressWarnings("null")
                /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z i = (Z)ITERATOR_i.next();
                /**
                 * i.toY <> null
                 */
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y toY = i.getToY();
                final /*@Thrown*/ boolean symbol_21 = toY != null;
                //
                if (symbol_21 == ValueUtil.TRUE_VALUE) {
                    accumulator.add(i);
                }
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z iterator_4 : ValueUtil.typedIterable(Z.class, select)) {
                ji_Z_1.add(iterator_4);
            }
            // mapping statements
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull SRoot loop0 : ValueUtil.typedIterable(SRoot.class, ji_SRoot)) {
                MAP_m_SRoot_ast(loop0);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X loop0_0 : ValueUtil.typedIterable(X.class, ji_X)) {
                MAP_m_X_ast(loop0_0);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X loop0_1 : ValueUtil.typedIterable(X.class, ji_X)) {
                MAP_m_X_ast_1(loop0_1);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X loop0_2 : ValueUtil.typedIterable(X.class, ji_X)) {
                MAP_m_X_ast_2(loop0_2);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 loop0_3 : ValueUtil.typedIterable(Y1.class, ji_Y1)) {
                MAP_m_Y1_ast(loop0_3);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 loop0_4 : ValueUtil.typedIterable(Y2.class, ji_Y2)) {
                MAP_m_Y2_ast(loop0_4);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z loop0_5 : ValueUtil.typedIterable(Z.class, ji_Z)) {
                MAP_m_Z_ast(loop0_5);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z loop0_6 : ValueUtil.typedIterable(Z.class, ji_Z)) {
                MAP_m_Z_ast_1(loop0_6);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull SRoot loop0_7 : ValueUtil.typedIterable(SRoot.class, ji_SRoot)) {
                MAP_m_SRoot_ast_ownedX(loop0_7);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X loop0_8 : ValueUtil.typedIterable(X.class, ji_X)) {
                MAP_m_X_ast_name_ownsY(loop0_8);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X loop0_9 : ValueUtil.typedIterable(X.class, ji_X)) {
                MAP_m_X_ast_name_ownsY_1(loop0_9);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X loop0_10 : ValueUtil.typedIterable(X.class, ji_X)) {
                MAP_m_X_ast_name_ownsY_2(loop0_10);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 loop0_11 : ValueUtil.typedIterable(Y1.class, ji_Y1)) {
                MAP_m_Y1_ast_name(loop0_11);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 loop0_12 : ValueUtil.typedIterable(Y1.class, ji_Y1)) {
                MAP_m_Y1_ast_ownsZ(loop0_12);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 loop0_13 : ValueUtil.typedIterable(Y2.class, ji_Y2)) {
                MAP_m_Y2_ast_name(loop0_13);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 loop0_14 : ValueUtil.typedIterable(Y2.class, ji_Y2)) {
                MAP_m_Y2_ast_ownsZ(loop0_14);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z loop0_15 : ValueUtil.typedIterable(Z.class, ji_Z)) {
                MAP_m_Z_ast_refers(loop0_15);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z loop0_16 : ValueUtil.typedIterable(Z.class, ji_Z_1)) {
                MAP_m_Z_ast_toY(loop0_16);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z loop0_17 : ValueUtil.typedIterable(Z.class, ji_Z)) {
                MAP_m_Z_ast_refers_1(loop0_17);
            }
            for (uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z loop0_18 : ValueUtil.typedIterable(Z.class, ji_Z_1)) {
                MAP_m_Z_ast_toY_1(loop0_18);
            }
            boolean __root__ = ValueUtil.TRUE_VALUE;
            return __root__;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP___root__", e);
        }
    }
    
    /**
     * 
     * map m_SRoot_ast in Source2Target_qvtp_qvtcas {leftCS (lSRoot : source::SRoot[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rTRoot : target::TRoot[1];
     *  |}
     * where ( |)
     * { |
     * lSRoot.ast := rTRoot;
     * }
     * 
     */
    protected boolean MAP_m_SRoot_ast(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull SRoot lSRoot) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable TRoot rTRoot = TargetFactory.eINSTANCE.createTRoot();
            assert rTRoot != null;
            models[1/*rightAS*/].add(rTRoot);
            // property assignments
            lSRoot.setAst(rTRoot);
            boolean m_SRoot_ast = ValueUtil.TRUE_VALUE;
            return m_SRoot_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_SRoot_ast", e);
        }
    }
    
    /**
     * 
     * map m_SRoot_ast_ownedX in Source2Target_qvtp_qvtcas {
     *   leftCS (lSRoot : source::SRoot[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {aTRoot : target::TRoot[1] = lSRoot.ast.oclAsType(target::TRoot)
     *   ;
     * ast : ecore::EObject[?] = lSRoot.ast;
     * ownedX : OrderedSet(source::X) = lSRoot.ownedX;
     * _'\u00ABcollect\u00BB' : Sequence(target::A) = ownedX->collect(_'1_' |
     *     _'1_'.ast.oclAsType(target::A));
     *  |
     * aTRoot.ownedA := _'\u00ABcollect\u00BB';
     * }
     * 
     */
    protected boolean MAP_m_SRoot_ast_ownedX(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull SRoot lSRoot_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_TRoot_0 = idResolver.getClass(CLSSid_TRoot, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lSRoot_0.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull TRoot aTRoot = ClassUtil.nonNullState((TRoot)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_TRoot_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lSRoot_0.getAst();
            @SuppressWarnings("null")
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<X> ownedX = lSRoot_0.getOwnedX();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedX = idResolver.createOrderedSetOfAll(ORD_CLSSid_X, ownedX);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_A);
            @Nullable Iterator<Object> ITERATOR__1 = BOXED_ownedX.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    _171_collect_187 = accumulator;
                    break;
                }
                /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable X _1 = (X)ITERATOR__1.next();
                /**
                 * _'1_'.ast.oclAsType(target::A)
                 */
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_A_0 = idResolver.getClass(CLSSid_A, null);
                if (_1 == null) {
                    throw throwNull(lSRoot_0, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::SElement::ast\'");
                }
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull A oclAsType = ClassUtil.nonNullState((A)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_A_0));
                //
                accumulator.add(oclAsType);
            }
            // property assignments
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<A> ECORE__171_collect_187 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(A.class, _171_collect_187);
            aTRoot.getOwnedA().addAll(ECORE__171_collect_187);
            boolean m_SRoot_ast_ownedX = ValueUtil.TRUE_VALUE;
            return m_SRoot_ast_ownedX;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_SRoot_ast_ownedX", e);
        }
    }
    
    /**
     * 
     * map m_X_ast in Source2Target_qvtp_qvtcas {
     *   leftCS (lX : source::X[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rA1 : target::A1[1];
     *  |}
     * where ( |
     * lX.isA1())
     * { |
     * lX.ast := rA1;
     * }
     * 
     */
    protected boolean MAP_m_X_ast(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X lX) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1 = lX.isIsA1();
            if (isA1 == null) {
                throw throwNull(lX, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
            if (isA1) {
                // creations
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable A1 rA1 = TargetFactory.eINSTANCE.createA1();
                assert rA1 != null;
                models[1/*rightAS*/].add(rA1);
                // property assignments
                lX.setAst(rA1);
                boolean m_X_ast = ValueUtil.TRUE_VALUE;
                symbol_1 = m_X_ast;
            }
            else {
                symbol_1 = ValueUtil.FALSE_VALUE;
            }
            return symbol_1;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_X_ast", e);
        }
    }
    
    /**
     * 
     * map m_X_ast_1 in Source2Target_qvtp_qvtcas {
     *   leftCS (lX : source::X[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rA2 : target::A2[1];
     *  |}
     * where ( |
     * lX.isA2()
     *   not lX.isA1())
     * { |
     * lX.ast := rA2;
     * }
     * 
     */
    protected boolean MAP_m_X_ast_1(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X lX_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA2 = lX_0.isIsA2();
            if (isA2 == null) {
                throw throwNull(lX_0, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
            if (isA2) {
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1 = lX_0.isIsA1();
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
                if (not == null) {
                    throw throwNull(lX_0, "Null if condition");
                }
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
                if (not) {
                    // creations
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable A2 rA2 = TargetFactory.eINSTANCE.createA2();
                    assert rA2 != null;
                    models[1/*rightAS*/].add(rA2);
                    // property assignments
                    lX_0.setAst(rA2);
                    boolean m_X_ast_1 = ValueUtil.TRUE_VALUE;
                    symbol_1 = m_X_ast_1;
                }
                else {
                    symbol_1 = ValueUtil.FALSE_VALUE;
                }
                symbol_2 = symbol_1;
            }
            else {
                symbol_2 = ValueUtil.FALSE_VALUE;
            }
            return symbol_2;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_X_ast_1", e);
        }
    }
    
    /**
     * 
     * map m_X_ast_2 in Source2Target_qvtp_qvtcas {
     *   leftCS (lX : source::X[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rA3 : target::A3[1];
     *  |}
     * where ( |
     * not lX.isA1()
     *   lX.isA3()
     *   not lX.isA2())
     * { |
     * lX.ast := rA3;
     * }
     * 
     */
    protected boolean MAP_m_X_ast_2(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X lX_1) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1 = lX_1.isIsA1();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
            if (not == null) {
                throw throwNull(lX_1, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
            if (not) {
                /*@Caught*/ @Nullable Object CAUGHT_isA1_0;
                try {
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1_0 = lX_1.isIsA1();
                    CAUGHT_isA1_0 = isA1_0;
                }
                catch (Exception e) {
                    CAUGHT_isA1_0 = ValueUtil.createInvalidValue(e);
                }
                /*@Caught*/ @Nullable Object CAUGHT_isA2;
                try {
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA2 = lX_1.isIsA2();
                    CAUGHT_isA2 = isA2;
                }
                catch (Exception e) {
                    CAUGHT_isA2 = ValueUtil.createInvalidValue(e);
                }
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_isA1_0, CAUGHT_isA2);
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(or);
                if (not_0 == null) {
                    throw throwNull(lX_1, "Null if condition");
                }
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
                if (not_0) {
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA2_0 = lX_1.isIsA2();
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_1 = BooleanNotOperation.INSTANCE.evaluate(isA2_0);
                    if (not_1 == null) {
                        throw throwNull(lX_1, "Null if condition");
                    }
                    /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
                    if (not_1) {
                        // creations
                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable A3 rA3 = TargetFactory.eINSTANCE.createA3();
                        assert rA3 != null;
                        models[1/*rightAS*/].add(rA3);
                        // property assignments
                        lX_1.setAst(rA3);
                        boolean m_X_ast_2 = ValueUtil.TRUE_VALUE;
                        symbol_1 = m_X_ast_2;
                    }
                    else {
                        symbol_1 = ValueUtil.FALSE_VALUE;
                    }
                    symbol_2 = symbol_1;
                }
                else {
                    symbol_2 = ValueUtil.FALSE_VALUE;
                }
                symbol_3 = symbol_2;
            }
            else {
                symbol_3 = ValueUtil.FALSE_VALUE;
            }
            return symbol_3;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_X_ast_2", e);
        }
    }
    
    /**
     * 
     * map m_X_ast_name_ownsY in Source2Target_qvtp_qvtcas {
     *   leftCS (lX : source::X[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * lX.isA1()
     *   lX.isA1()
     *   )
     * {aA1 : target::A1[1] = lX.ast.oclAsType(target::A1)
     *   ;
     * ast : ecore::EObject[?] = lX.ast;
     * name : String[?] = lX.name;
     * ownsY : OrderedSet(source::Y) = lX.ownsY;
     * _'\u00ABcollect\u00BB' : Sequence(source::Y1[*|1]) = ownsY->collect(_'1_' |
     *     _'1_'.oclAsType(source::Y1))
     *   ;
     * _'\u00ABcollect\u00BB1' : Sequence(target::B) = _'\u00ABcollect\u00BB'->collect(_'1_' |
     *     _'1_'.ast.oclAsType(target::B));
     *  |
     * aA1.name := name;
     * aA1.ownsB := _'\u00ABcollect\u00BB1';
     * }
     * 
     */
    protected boolean MAP_m_X_ast_name_ownsY(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X lX_2) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1 = lX_2.isIsA1();
            if (isA1 == null) {
                throw throwNull(lX_2, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
            if (isA1) {
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
                if (isA1) {
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_A1_0 = idResolver.getClass(CLSSid_A1, null);
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lX_2.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull A1 aA1 = ClassUtil.nonNullState((A1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A1_0));
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lX_2.getAst();
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lX_2.getName();
                    @SuppressWarnings("null")
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Y> ownsY = lX_2.getOwnsY();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownsY = idResolver.createOrderedSetOfAll(ORD_CLSSid_Y, ownsY);
                    /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Y1);
                    @Nullable Iterator<Object> ITERATOR__1 = BOXED_ownsY.iterator();
                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187;
                    while (true) {
                        if (!ITERATOR__1.hasNext()) {
                            _171_collect_187 = accumulator;
                            break;
                        }
                        /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y _1 = (Y)ITERATOR__1.next();
                        /**
                         * _'1_'.oclAsType(source::Y1)
                         */
                        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 oclAsType = ClassUtil.nonNullState((Y1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_source_c_c_Y1_0));
                        //
                        accumulator.add(oclAsType);
                    }
                    /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_B);
                    @NonNull Iterator<Object> ITERATOR__1_0 = _171_collect_187.iterator();
                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187_1;
                    while (true) {
                        if (!ITERATOR__1_0.hasNext()) {
                            _171_collect_187_1 = accumulator_0;
                            break;
                        }
                        @SuppressWarnings("null")
                        /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 _1_0 = (Y1)ITERATOR__1_0.next();
                        /**
                         * _'1_'.ast.oclAsType(target::B)
                         */
                        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
                        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1_0.getAst();
                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull B oclAsType_0 = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_B_0));
                        //
                        accumulator_0.add(oclAsType_0);
                    }
                    // property assignments
                    aA1.setName(name);
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<B> ECORE__171_collect_187_1 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(B.class, _171_collect_187_1);
                    aA1.getOwnsB().addAll(ECORE__171_collect_187_1);
                    boolean m_X_ast_name_ownsY = ValueUtil.TRUE_VALUE;
                    symbol_2 = m_X_ast_name_ownsY;
                }
                else {
                    symbol_2 = ValueUtil.FALSE_VALUE;
                }
                symbol_3 = symbol_2;
            }
            else {
                symbol_3 = ValueUtil.FALSE_VALUE;
            }
            return symbol_3;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_X_ast_name_ownsY", e);
        }
    }
    
    /**
     * 
     * map m_X_ast_name_ownsY_1 in Source2Target_qvtp_qvtcas {
     *   leftCS (lX : source::X[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * lX.isA2()
     *   lX.isA2()
     *   not lX.isA1()
     *   not lX.isA1()
     *   )
     * {aA2 : target::A2[1] = lX.ast.oclAsType(target::A2)
     *   ;
     * ast : ecore::EObject[?] = lX.ast;
     * name : String[?] = lX.name;
     * ownsY : OrderedSet(source::Y) = lX.ownsY;
     * _'\u00ABcollect\u00BB' : Sequence(source::Y2[*|1]) = ownsY->collect(_'1_' |
     *     _'1_'.oclAsType(source::Y2))
     *   ;
     * _'\u00ABcollect\u00BB1' : Sequence(target::C) = _'\u00ABcollect\u00BB'->collect(_'1_' |
     *     _'1_'.ast.oclAsType(target::C));
     *  |
     * aA2.name := name;
     * aA2.ownsC := _'\u00ABcollect\u00BB1';
     * }
     * 
     */
    protected boolean MAP_m_X_ast_name_ownsY_1(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X lX_3) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA2 = lX_3.isIsA2();
            if (isA2 == null) {
                throw throwNull(lX_3, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_5;
            if (isA2) {
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
                if (isA2) {
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1 = lX_3.isIsA1();
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
                    if (not == null) {
                        throw throwNull(lX_3, "Null if condition");
                    }
                    /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
                    if (not) {
                        /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
                        if (not) {
                            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_A2_0 = idResolver.getClass(CLSSid_A2, null);
                            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lX_3.getAst();
                            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull A2 aA2 = ClassUtil.nonNullState((A2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A2_0));
                            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lX_3.getAst();
                            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lX_3.getName();
                            @SuppressWarnings("null")
                            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Y> ownsY = lX_3.getOwnsY();
                            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownsY = idResolver.createOrderedSetOfAll(ORD_CLSSid_Y, ownsY);
                            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Y2);
                            @Nullable Iterator<Object> ITERATOR__1 = BOXED_ownsY.iterator();
                            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187;
                            while (true) {
                                if (!ITERATOR__1.hasNext()) {
                                    _171_collect_187 = accumulator;
                                    break;
                                }
                                /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y _1 = (Y)ITERATOR__1.next();
                                /**
                                 * _'1_'.oclAsType(source::Y2)
                                 */
                                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
                                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 oclAsType = ClassUtil.nonNullState((Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_source_c_c_Y2_0));
                                //
                                accumulator.add(oclAsType);
                            }
                            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_C);
                            @NonNull Iterator<Object> ITERATOR__1_0 = _171_collect_187.iterator();
                            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187_1;
                            while (true) {
                                if (!ITERATOR__1_0.hasNext()) {
                                    _171_collect_187_1 = accumulator_0;
                                    break;
                                }
                                @SuppressWarnings("null")
                                /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 _1_0 = (Y2)ITERATOR__1_0.next();
                                /**
                                 * _'1_'.ast.oclAsType(target::C)
                                 */
                                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
                                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1_0.getAst();
                                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull C oclAsType_0 = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_C_0));
                                //
                                accumulator_0.add(oclAsType_0);
                            }
                            // property assignments
                            aA2.setName(name);
                            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<C> ECORE__171_collect_187_1 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(C.class, _171_collect_187_1);
                            aA2.getOwnsC().addAll(ECORE__171_collect_187_1);
                            boolean m_X_ast_name_ownsY_1 = ValueUtil.TRUE_VALUE;
                            symbol_2 = m_X_ast_name_ownsY_1;
                        }
                        else {
                            symbol_2 = ValueUtil.FALSE_VALUE;
                        }
                        symbol_3 = symbol_2;
                    }
                    else {
                        symbol_3 = ValueUtil.FALSE_VALUE;
                    }
                    symbol_4 = symbol_3;
                }
                else {
                    symbol_4 = ValueUtil.FALSE_VALUE;
                }
                symbol_5 = symbol_4;
            }
            else {
                symbol_5 = ValueUtil.FALSE_VALUE;
            }
            return symbol_5;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_X_ast_name_ownsY_1", e);
        }
    }
    
    /**
     * 
     * map m_X_ast_name_ownsY_2 in Source2Target_qvtp_qvtcas {
     *   leftCS (lX : source::X[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not lX.isA2()
     *   not lX.isA2()
     *   lX.isA3()
     *   lX.isA3()
     *   not lX.isA1()
     *   not lX.isA1()
     *   )
     * {aA3 : target::A3[1] = lX.ast.oclAsType(target::A3)
     *   ;
     * ast : ecore::EObject[?] = lX.ast;
     * name : String[?] = lX.name;
     * ownsY : OrderedSet(source::Y) = lX.ownsY;
     * _'\u00ABcollect\u00BB' : Sequence(source::Y2[*|1]) = ownsY->collect(_'1_' |
     *     _'1_'.oclAsType(source::Y2))
     *   ;
     * _'\u00ABcollect\u00BB1' : Sequence(target::C) = _'\u00ABcollect\u00BB'->collect(_'1_' |
     *     _'1_'.ast.oclAsType(target::C));
     *  |
     * aA3.name := name;
     * aA3.ownsC := _'\u00ABcollect\u00BB1';
     * }
     * 
     */
    protected boolean MAP_m_X_ast_name_ownsY_2(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull X lX_4) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA2 = lX_4.isIsA2();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA2);
            if (not == null) {
                throw throwNull(lX_4, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_7;
            if (not) {
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_6;
                if (not) {
                    /*@Caught*/ @Nullable Object CAUGHT_isA1;
                    try {
                        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1 = lX_4.isIsA1();
                        CAUGHT_isA1 = isA1;
                    }
                    catch (Exception e) {
                        CAUGHT_isA1 = ValueUtil.createInvalidValue(e);
                    }
                    /*@Caught*/ @Nullable Object CAUGHT_isA2_1;
                    try {
                        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA2_1 = lX_4.isIsA2();
                        CAUGHT_isA2_1 = isA2_1;
                    }
                    catch (Exception e) {
                        CAUGHT_isA2_1 = ValueUtil.createInvalidValue(e);
                    }
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_isA1, CAUGHT_isA2_1);
                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_1 = BooleanNotOperation.INSTANCE.evaluate(or);
                    if (not_1 == null) {
                        throw throwNull(lX_4, "Null if condition");
                    }
                    /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_5;
                    if (not_1) {
                        /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
                        if (not_1) {
                            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean isA1_1 = lX_4.isIsA1();
                            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_3 = BooleanNotOperation.INSTANCE.evaluate(isA1_1);
                            if (not_3 == null) {
                                throw throwNull(lX_4, "Null if condition");
                            }
                            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
                            if (not_3) {
                                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
                                if (not_3) {
                                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_A3_0 = idResolver.getClass(CLSSid_A3, null);
                                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lX_4.getAst();
                                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull A3 aA3 = ClassUtil.nonNullState((A3)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A3_0));
                                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lX_4.getAst();
                                    final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lX_4.getName();
                                    @SuppressWarnings("null")
                                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Y> ownsY = lX_4.getOwnsY();
                                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownsY = idResolver.createOrderedSetOfAll(ORD_CLSSid_Y, ownsY);
                                    /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Y2);
                                    @Nullable Iterator<Object> ITERATOR__1 = BOXED_ownsY.iterator();
                                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187;
                                    while (true) {
                                        if (!ITERATOR__1.hasNext()) {
                                            _171_collect_187 = accumulator;
                                            break;
                                        }
                                        /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y _1 = (Y)ITERATOR__1.next();
                                        /**
                                         * _'1_'.oclAsType(source::Y2)
                                         */
                                        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
                                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 oclAsType = ClassUtil.nonNullState((Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_source_c_c_Y2_0));
                                        //
                                        accumulator.add(oclAsType);
                                    }
                                    /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_C);
                                    @NonNull Iterator<Object> ITERATOR__1_0 = _171_collect_187.iterator();
                                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue _171_collect_187_1;
                                    while (true) {
                                        if (!ITERATOR__1_0.hasNext()) {
                                            _171_collect_187_1 = accumulator_0;
                                            break;
                                        }
                                        @SuppressWarnings("null")
                                        /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 _1_0 = (Y2)ITERATOR__1_0.next();
                                        /**
                                         * _'1_'.ast.oclAsType(target::C)
                                         */
                                        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
                                        final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = _1_0.getAst();
                                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull C oclAsType_0 = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_C_0));
                                        //
                                        accumulator_0.add(oclAsType_0);
                                    }
                                    // property assignments
                                    aA3.setName(name);
                                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<C> ECORE__171_collect_187_1 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(C.class, _171_collect_187_1);
                                    aA3.getOwnsC().addAll(ECORE__171_collect_187_1);
                                    boolean m_X_ast_name_ownsY_2 = ValueUtil.TRUE_VALUE;
                                    symbol_2 = m_X_ast_name_ownsY_2;
                                }
                                else {
                                    symbol_2 = ValueUtil.FALSE_VALUE;
                                }
                                symbol_3 = symbol_2;
                            }
                            else {
                                symbol_3 = ValueUtil.FALSE_VALUE;
                            }
                            symbol_4 = symbol_3;
                        }
                        else {
                            symbol_4 = ValueUtil.FALSE_VALUE;
                        }
                        symbol_5 = symbol_4;
                    }
                    else {
                        symbol_5 = ValueUtil.FALSE_VALUE;
                    }
                    symbol_6 = symbol_5;
                }
                else {
                    symbol_6 = ValueUtil.FALSE_VALUE;
                }
                symbol_7 = symbol_6;
            }
            else {
                symbol_7 = ValueUtil.FALSE_VALUE;
            }
            return symbol_7;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_X_ast_name_ownsY_2", e);
        }
    }
    
    /**
     * 
     * map m_Y1_ast in Source2Target_qvtp_qvtcas {leftCS (lY1 : source::Y1[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rB : target::B[1];
     *  |}
     * where ( |)
     * { |
     * lY1.ast := rB;
     * }
     * 
     */
    protected boolean MAP_m_Y1_ast(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 lY1) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable B rB = TargetFactory.eINSTANCE.createB();
            assert rB != null;
            models[1/*rightAS*/].add(rB);
            // property assignments
            lY1.setAst(rB);
            boolean m_Y1_ast = ValueUtil.TRUE_VALUE;
            return m_Y1_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Y1_ast", e);
        }
    }
    
    /**
     * 
     * map m_Y1_ast_name in Source2Target_qvtp_qvtcas {
     *   leftCS (lY1 : source::Y1[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {aB : target::B[1] = lY1.ast.oclAsType(target::B);
     * ast : ecore::EObject[?] = lY1.ast;
     * name : String[?] = lY1.name;
     *  |
     * aB.name := name;
     * }
     * 
     */
    protected boolean MAP_m_Y1_ast_name(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 lY1_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lY1_0.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull B aB = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_B_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lY1_0.getAst();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lY1_0.getName();
            // property assignments
            aB.setName(name);
            boolean m_Y1_ast_name = ValueUtil.TRUE_VALUE;
            return m_Y1_ast_name;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Y1_ast_name", e);
        }
    }
    
    /**
     * 
     * map m_Y1_ast_ownsZ in Source2Target_qvtp_qvtcas {
     *   leftCS (lY1 : source::Y1[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {aB : target::B[1] = lY1.ast.oclAsType(target::B)
     *   ;
     * ast : ecore::EObject[?] = lY1.ast;
     * ownsZ : source::Z[?] = lY1.ownsZ;
     * aD : target::D[1] = ownsZ.ast.oclAsType(target::D);
     * ast1 : ecore::EObject[?] = ownsZ.ast;
     *  |
     * aB.ownsD := aD;
     * }
     * 
     */
    protected boolean MAP_m_Y1_ast_ownsZ(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 lY1_1) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lY1_1.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull B aB = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_B_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lY1_1.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Z ownsZ = lY1_1.getOwnsZ();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
            if (ownsZ == null) {
                throw throwNull(lY1_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::SElement::ast\'");
            }
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = ownsZ.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull D aD = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_D_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast1 = ownsZ.getAst();
            // property assignments
            aB.setOwnsD(aD);
            boolean m_Y1_ast_ownsZ = ValueUtil.TRUE_VALUE;
            return m_Y1_ast_ownsZ;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Y1_ast_ownsZ", e);
        }
    }
    
    /**
     * 
     * map m_Y2_ast in Source2Target_qvtp_qvtcas {leftCS (lY2 : source::Y2[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rC : target::C[1];
     *  |}
     * where ( |)
     * { |
     * lY2.ast := rC;
     * }
     * 
     */
    protected boolean MAP_m_Y2_ast(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 lY2) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            // creations
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable C rC = TargetFactory.eINSTANCE.createC();
            assert rC != null;
            models[1/*rightAS*/].add(rC);
            // property assignments
            lY2.setAst(rC);
            boolean m_Y2_ast = ValueUtil.TRUE_VALUE;
            return m_Y2_ast;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Y2_ast", e);
        }
    }
    
    /**
     * 
     * map m_Y2_ast_name in Source2Target_qvtp_qvtcas {
     *   leftCS (lY2 : source::Y2[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {aC : target::C[1] = lY2.ast.oclAsType(target::C);
     * ast : ecore::EObject[?] = lY2.ast;
     * name : String[?] = lY2.name;
     *  |
     * aC.name := name;
     * }
     * 
     */
    protected boolean MAP_m_Y2_ast_name(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 lY2_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lY2_0.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull C aC = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_C_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lY2_0.getAst();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = lY2_0.getName();
            // property assignments
            aC.setName(name);
            boolean m_Y2_ast_name = ValueUtil.TRUE_VALUE;
            return m_Y2_ast_name;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Y2_ast_name", e);
        }
    }
    
    /**
     * 
     * map m_Y2_ast_ownsZ in Source2Target_qvtp_qvtcas {
     *   leftCS (lY2 : source::Y2[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {aC : target::C[1] = lY2.ast.oclAsType(target::C)
     *   ;
     * ast : ecore::EObject[?] = lY2.ast;
     * ownsZ : source::Z[?] = lY2.ownsZ;
     * aD : target::D[1] = ownsZ.ast.oclAsType(target::D);
     * ast1 : ecore::EObject[?] = ownsZ.ast;
     *  |
     * aC.ownsD := aD;
     * }
     * 
     */
    protected boolean MAP_m_Y2_ast_ownsZ(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 lY2_1) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lY2_1.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull C aC = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_C_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lY2_1.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Z ownsZ = lY2_1.getOwnsZ();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
            if (ownsZ == null) {
                throw throwNull(lY2_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::SElement::ast\'");
            }
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = ownsZ.getAst();
            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull D aD = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_D_0));
            final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast1 = ownsZ.getAst();
            // property assignments
            aC.setOwnsD(aD);
            boolean m_Y2_ast_ownsZ = ValueUtil.TRUE_VALUE;
            return m_Y2_ast_ownsZ;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Y2_ast_ownsZ", e);
        }
    }
    
    /**
     * 
     * map m_Z_ast in Source2Target_qvtp_qvtcas {
     *   leftCS (lZ : source::Z[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rD : target::D[1];
     *  |}
     * where ( |
     * not lZ.parentIsY1()
     *   lZ.parentIsY2())
     * { |
     * lZ.ast := rD;
     * }
     * 
     */
    protected boolean MAP_m_Z_ast(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z lZ) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ);
            final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_source_c_c_Y1_0).booleanValue();
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsTypeOf);
            if (not == null) {
                throw throwNull(lZ, "Null if condition");
            }
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
            if (not) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
                final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ);
                final /*@Thrown*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_source_c_c_Y2_0).booleanValue();
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
                if (oclIsTypeOf_0) {
                    // creations
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable D rD = TargetFactory.eINSTANCE.createD();
                    assert rD != null;
                    models[1/*rightAS*/].add(rD);
                    // property assignments
                    lZ.setAst(rD);
                    boolean m_Z_ast = ValueUtil.TRUE_VALUE;
                    symbol_1 = m_Z_ast;
                }
                else {
                    symbol_1 = ValueUtil.FALSE_VALUE;
                }
                symbol_2 = symbol_1;
            }
            else {
                symbol_2 = ValueUtil.FALSE_VALUE;
            }
            return symbol_2;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Z_ast", e);
        }
    }
    
    /**
     * 
     * map m_Z_ast_1 in Source2Target_qvtp_qvtcas {
     *   leftCS (lZ : source::Z[?];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize rD : target::D[1];
     *  |}
     * where ( |
     * lZ.parentIsY1())
     * { |
     * lZ.ast := rD;
     * }
     * 
     */
    protected boolean MAP_m_Z_ast_1(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z lZ_0) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_0);
            final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_source_c_c_Y1_0).booleanValue();
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
            if (oclIsTypeOf) {
                // creations
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable D rD = TargetFactory.eINSTANCE.createD();
                assert rD != null;
                models[1/*rightAS*/].add(rD);
                // property assignments
                lZ_0.setAst(rD);
                boolean m_Z_ast_1 = ValueUtil.TRUE_VALUE;
                symbol_1 = m_Z_ast_1;
            }
            else {
                symbol_1 = ValueUtil.FALSE_VALUE;
            }
            return symbol_1;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Z_ast_1", e);
        }
    }
    
    /**
     * 
     * map m_Z_ast_refers in Source2Target_qvtp_qvtcas {
     *   leftCS (lZ : source::Z[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * lZ.parentIsY2()
     *   not lZ.parentIsY1()
     *   )
     * {aD : target::D[1] = lZ.ast.oclAsType(target::D);
     * ast : ecore::EObject[?] = lZ.ast;
     * refers : source::PathNameCS[?] = lZ.refers;
     * _'=' : Boolean[1] = refers =
     *   null;
     * refsC : target::C[?] = if _'='
     *   then null
     *   else aD.lookupC(refers)
     *   endif;
     *  |
     * aD.refsC := refsC;
     * }
     * 
     */
    protected boolean MAP_m_Z_ast_refers(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z lZ_1) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_1);
            final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_source_c_c_Y2_0).booleanValue();
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
            if (oclIsTypeOf) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
                final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_1);
                final /*@Thrown*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_source_c_c_Y1_0).booleanValue();
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsTypeOf_0);
                if (not == null) {
                    throw throwNull(lZ_1, "Null if condition");
                }
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
                if (not) {
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lZ_1.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull D aD = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lZ_1.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathNameCS refers = lZ_1.getRefers();
                    final /*@Thrown*/ boolean eq = refers == null;
                    /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable C refsC;
                    if (eq) {
                        refsC = null;
                    }
                    else {
                        if (refers == null) {
                            throw throwNull(lZ_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathNameCS::path\'");
                        }
                        @SuppressWarnings("null")
                        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<PathElementCS> segments = refers.getPath();
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_segments = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, segments);
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_segments);
                        final /*@Thrown*/ boolean eq_0 = size.equals(INT_1);
                        /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable C symbol_1;
                        if (eq_0) {
                            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathElementCS aPathElementCS = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_segments);
                            if (aPathElementCS == null) {
                                throw throwNull(lZ_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                            }
                            @SuppressWarnings("null")
                            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name = aPathElementCS.getName();
                            TargetLookupResult<C> _lookupResult = lookupSolver._lookupUnqualifiedC(aD, name);
                            C _lookupUnqualifiedC = null;
                            if (_lookupResult.size() == 1) {
                                _lookupUnqualifiedC = _lookupResult.getSingleResult();
                            } else {
                                handleLookupError(aPathElementCS,name);
                            };
                            symbol_1 = _lookupUnqualifiedC;
                        }
                        else {
                            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
                            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue qualifierSegments = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_segments, INT_1, diff);
                            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathElementCS aPathElementCS_0 = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(qualifierSegments);
                            if (aPathElementCS_0 == null) {
                                throw throwNull(lZ_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                            }
                            @SuppressWarnings("null")
                            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name_0 = aPathElementCS_0.getName();
                            TargetLookupResult<A2> _lookupResult_0 = lookupSolver._lookupUnqualifiedA2(aD, name_0);
                            A2 _lookupUnqualifiedA2 = null;
                            if (_lookupResult_0.size() == 1) {
                                _lookupUnqualifiedA2 = _lookupResult_0.getSingleResult();
                            } else {
                                handleLookupError(aPathElementCS_0,name_0);
                            };
                            /*@Caught*/ @Nullable Object CAUGHT__lookupUnqualifiedA2;
                            try {
                                CAUGHT__lookupUnqualifiedA2 = _lookupUnqualifiedA2;
                            }
                            catch (Exception e) {
                                CAUGHT__lookupUnqualifiedA2 = ValueUtil.createInvalidValue(e);
                            }
                            final /*@NonInvalid*/ @NonNull Object symbol_0 = CAUGHT__lookupUnqualifiedA2 == null;
                            /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable C safe_lookupQualifiedC_source;
                            if (symbol_0 == Boolean.TRUE) {
                                safe_lookupQualifiedC_source = null;
                            }
                            else {
                                if (_lookupUnqualifiedA2 == null) {
                                    throw throwNull(lZ_1, "Null where non-null value required");
                                }
                                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathElementCS aPathElementCS_1 = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_segments);
                                if (aPathElementCS_1 == null) {
                                    throw throwNull(lZ_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                                }
                                @SuppressWarnings("null")
                                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name_1 = aPathElementCS_1.getName();
                                TargetLookupResult<C> _lookupResult_1 = lookupSolver._lookupQualifiedC(_lookupUnqualifiedA2, name_1);
                                C _lookupQualifiedC = null;
                                if (_lookupResult_1.size() == 1) {
                                    _lookupQualifiedC = _lookupResult_1.getSingleResult();
                                } else {
                                    handleLookupError(aPathElementCS_1,name_1);
                                };
                                safe_lookupQualifiedC_source = _lookupQualifiedC;
                            }
                            symbol_1 = safe_lookupQualifiedC_source;
                        }
                        refsC = symbol_1;
                    }
                    // property assignments
                    aD.setRefsC(refsC);
                    boolean m_Z_ast_refers = ValueUtil.TRUE_VALUE;
                    symbol_3 = m_Z_ast_refers;
                }
                else {
                    symbol_3 = ValueUtil.FALSE_VALUE;
                }
                symbol_4 = symbol_3;
            }
            else {
                symbol_4 = ValueUtil.FALSE_VALUE;
            }
            return symbol_4;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Z_ast_refers", e);
        }
    }
    
    /**
     * 
     * map m_Z_ast_refers_1 in Source2Target_qvtp_qvtcas {
     *   leftCS (lZ : source::Z[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * lZ.parentIsY1()
     *   )
     * {aD : target::D[1] = lZ.ast.oclAsType(target::D);
     * ast : ecore::EObject[?] = lZ.ast;
     * refers : source::PathNameCS[?] = lZ.refers;
     * _'=' : Boolean[1] = refers =
     *   null;
     * refsB : target::B[?] = if _'='
     *   then null
     *   else aD.lookupB(refers)
     *   endif;
     *  |
     * aD.refsB := refsB;
     * }
     * 
     */
    protected boolean MAP_m_Z_ast_refers_1(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z lZ_2) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_2);
            final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_source_c_c_Y1_0).booleanValue();
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
            if (oclIsTypeOf) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lZ_2.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull D aD = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lZ_2.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathNameCS refers = lZ_2.getRefers();
                final /*@Thrown*/ boolean eq = refers == null;
                /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable B refsB;
                if (eq) {
                    refsB = null;
                }
                else {
                    if (refers == null) {
                        throw throwNull(lZ_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathNameCS::path\'");
                    }
                    @SuppressWarnings("null")
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<PathElementCS> segments = refers.getPath();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_segments = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, segments);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_segments);
                    final /*@Thrown*/ boolean eq_0 = size.equals(INT_1);
                    /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable B symbol_1;
                    if (eq_0) {
                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathElementCS aPathElementCS = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_segments);
                        if (aPathElementCS == null) {
                            throw throwNull(lZ_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                        }
                        @SuppressWarnings("null")
                        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name = aPathElementCS.getName();
                        TargetLookupResult<B> _lookupResult = lookupSolver._lookupUnqualifiedB(aD, name);
                        B _lookupUnqualifiedB = null;
                        if (_lookupResult.size() == 1) {
                            _lookupUnqualifiedB = _lookupResult.getSingleResult();
                        } else {
                            handleLookupError(aPathElementCS,name);
                        };
                        symbol_1 = _lookupUnqualifiedB;
                    }
                    else {
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue qualifierSegments = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_segments, INT_1, diff);
                        final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathElementCS aPathElementCS_0 = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(qualifierSegments);
                        if (aPathElementCS_0 == null) {
                            throw throwNull(lZ_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                        }
                        @SuppressWarnings("null")
                        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name_0 = aPathElementCS_0.getName();
                        TargetLookupResult<A1> _lookupResult_0 = lookupSolver._lookupUnqualifiedA1(aD, name_0);
                        A1 _lookupUnqualifiedA1 = null;
                        if (_lookupResult_0.size() == 1) {
                            _lookupUnqualifiedA1 = _lookupResult_0.getSingleResult();
                        } else {
                            handleLookupError(aPathElementCS_0,name_0);
                        };
                        /*@Caught*/ @Nullable Object CAUGHT__lookupUnqualifiedA1;
                        try {
                            CAUGHT__lookupUnqualifiedA1 = _lookupUnqualifiedA1;
                        }
                        catch (Exception e) {
                            CAUGHT__lookupUnqualifiedA1 = ValueUtil.createInvalidValue(e);
                        }
                        final /*@NonInvalid*/ @NonNull Object symbol_0 = CAUGHT__lookupUnqualifiedA1 == null;
                        /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable B safe_lookupQualifiedB_source;
                        if (symbol_0 == Boolean.TRUE) {
                            safe_lookupQualifiedB_source = null;
                        }
                        else {
                            if (_lookupUnqualifiedA1 == null) {
                                throw throwNull(lZ_2, "Null where non-null value required");
                            }
                            final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable PathElementCS aPathElementCS_1 = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_segments);
                            if (aPathElementCS_1 == null) {
                                throw throwNull(lZ_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                            }
                            @SuppressWarnings("null")
                            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull String name_1 = aPathElementCS_1.getName();
                            TargetLookupResult<B> _lookupResult_1 = lookupSolver._lookupQualifiedB(_lookupUnqualifiedA1, name_1);
                            B _lookupQualifiedB = null;
                            if (_lookupResult_1.size() == 1) {
                                _lookupQualifiedB = _lookupResult_1.getSingleResult();
                            } else {
                                handleLookupError(aPathElementCS_1,name_1);
                            };
                            safe_lookupQualifiedB_source = _lookupQualifiedB;
                        }
                        symbol_1 = safe_lookupQualifiedB_source;
                    }
                    refsB = symbol_1;
                }
                // property assignments
                aD.setRefsB(refsB);
                boolean m_Z_ast_refers_1 = ValueUtil.TRUE_VALUE;
                symbol_3 = m_Z_ast_refers_1;
            }
            else {
                symbol_3 = ValueUtil.FALSE_VALUE;
            }
            return symbol_3;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Z_ast_refers_1", e);
        }
    }
    
    /**
     * 
     * map m_Z_ast_toY in Source2Target_qvtp_qvtcas {
     *   leftCS (lZ : source::Z[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * lZ.parentIsY2()
     *   not lZ.parentIsY1()
     *   )
     * {aD : target::D[1] = lZ.ast.oclAsType(target::D)
     *   ;
     * aY2 : source::Y2[1] = lZ.toY.oclAsType(source::Y2)
     *   ;
     * ast : ecore::EObject[?] = lZ.ast;
     * toY : source::Y[?] = lZ.toY;
     * aC : target::C[1] = aY2.ast.oclAsType(target::C);
     * ast1 : ecore::EObject[?] = aY2.ast;
     * toA2 : target::A2[?] = aC.toA2;
     *  |
     * aD.toA := toA2;
     * }
     * 
     */
    protected boolean MAP_m_Z_ast_toY(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z lZ_3) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_3);
            final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_source_c_c_Y2_0).booleanValue();
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
            if (oclIsTypeOf) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
                final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_3);
                final /*@Thrown*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_source_c_c_Y1_0).booleanValue();
                final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsTypeOf_0);
                if (not == null) {
                    throw throwNull(lZ_3, "Null if condition");
                }
                /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
                if (not) {
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lZ_3.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull D aD = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y2_1 = idResolver.getClass(CLSSid_Y2, null);
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y toY = lZ_3.getToY();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y2 aY2 = ClassUtil.nonNullState((Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y2_1));
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lZ_3.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y toY_0 = lZ_3.getToY();
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = aY2.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull C aC = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_C_0));
                    final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast1 = aY2.getAst();
                    final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable A2 toA2 = aC.getToA2();
                    // property assignments
                    if (toA2 == null) {
                        throw throwNull(lZ_3, "Null value");
                    }
                    aD.setToA(toA2);
                    boolean m_Z_ast_toY = ValueUtil.TRUE_VALUE;
                    symbol_1 = m_Z_ast_toY;
                }
                else {
                    symbol_1 = ValueUtil.FALSE_VALUE;
                }
                symbol_2 = symbol_1;
            }
            else {
                symbol_2 = ValueUtil.FALSE_VALUE;
            }
            return symbol_2;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Z_ast_toY", e);
        }
    }
    
    /**
     * 
     * map m_Z_ast_toY_1 in Source2Target_qvtp_qvtcas {
     *   leftCS (lZ : source::Z[?];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * lZ.parentIsY1()
     *   )
     * {aD : target::D[1] = lZ.ast.oclAsType(target::D)
     *   ;
     * aY1 : source::Y1[1] = lZ.toY.oclAsType(source::Y1)
     *   ;
     * ast : ecore::EObject[?] = lZ.ast;
     * toY : source::Y[?] = lZ.toY;
     * aB : target::B[1] = aY1.ast.oclAsType(target::B);
     * ast1 : ecore::EObject[?] = aY1.ast;
     * toA1 : target::A1[?] = aB.toA1;
     *  |
     * aD.toA := toA1;
     * }
     * 
     */
    protected boolean MAP_m_Z_ast_toY_1(final /*@NonInvalid*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Z lZ_4) throws ReflectiveOperationException {
        try {
            // predicates and unrealized variables
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
            final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, lZ_4);
            final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_source_c_c_Y1_0).booleanValue();
            /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_1;
            if (oclIsTypeOf) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast = lZ_4.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull D aD = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_source_c_c_Y1_1 = idResolver.getClass(CLSSid_Y1, null);
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y toY = lZ_4.getToY();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.NonNull Y1 aY1 = ClassUtil.nonNullState((Y1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_1));
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_0 = lZ_4.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.source.@org.eclipse.jdt.annotation.Nullable Y toY_0 = lZ_4.getToY();
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast_1 = aY1.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.NonNull B aB = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_target_c_c_B_0));
                final /*@Thrown*/ org.eclipse.emf.ecore.@org.eclipse.jdt.annotation.Nullable EObject ast1 = aY1.getAst();
                final /*@Thrown*/ uk.ac.york.cs.asbh.lang.cs2as.target.@org.eclipse.jdt.annotation.Nullable A1 toA1 = aB.getToA1();
                // property assignments
                if (toA1 == null) {
                    throw throwNull(lZ_4, "Null value");
                }
                aD.setToA(toA1);
                boolean m_Z_ast_toY_1 = ValueUtil.TRUE_VALUE;
                symbol_1 = m_Z_ast_toY_1;
            }
            else {
                symbol_1 = ValueUtil.FALSE_VALUE;
            }
            return symbol_1;
        } catch (Throwable e) {
            return handleExecutionFailure("MAP_m_Z_ast_toY_1", e);
        }
    }
}
