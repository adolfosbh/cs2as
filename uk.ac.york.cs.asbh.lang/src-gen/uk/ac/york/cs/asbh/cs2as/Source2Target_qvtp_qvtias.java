/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package uk.ac.york.cs.asbh.cs2as;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionLastOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedSetSubOrderedSetOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.qvtd.cs2as.runtime.CS2ASTransformationExecutor;
import uk.ac.yor.cs.asbh.cs2as.LookupEnvironment;
import uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor;
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
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;
import uk.ac.york.cs.asbh.lang.cs2as.target.Namespace;
import uk.ac.york.cs.asbh.lang.cs2as.target.TRoot;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetFactory;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;

/**
 * The Source2Target_qvtp_qvtias transformation:
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
public class Source2Target_qvtp_qvtias extends CS2ASTransformationExecutor
{
    public static final /*@NonNull*/ /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0", null, SourcePackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0 = IdManager.getNsURIPackageId("http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0", null, TargetPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_A = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_A1 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A1", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_A2 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A2", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_A3 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("A3", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_B = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("B", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_C = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("C", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_D = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("D", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_EObject = PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Namespace = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("Namespace", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_PathElementCS = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("PathElementCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_PathNameCS = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("PathNameCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_SRoot = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("SRoot", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_TRoot = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("TRoot", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Visitable = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_targetMM_s_1_0.getClassId("Visitable", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_X = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("X", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Y = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Y", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Y1 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Y1", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Y2 = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Y2", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Z = PACKid_http_c_s_s_uk_ac_york_cs_asbh_lang_cs2as_s_sourceMM_s_1_0.getClassId("Z", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PathElementCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_PathElementCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_X = TypeId.ORDERED_SET.getSpecializedId(CLSSid_X);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Y = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Y);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_A = TypeId.SEQUENCE.getSpecializedId(CLSSid_A);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_B = TypeId.SEQUENCE.getSpecializedId(CLSSid_B);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_C = TypeId.SEQUENCE.getSpecializedId(CLSSid_C);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Y1 = TypeId.SEQUENCE.getSpecializedId(CLSSid_Y1);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Y2 = TypeId.SEQUENCE.getSpecializedId(CLSSid_Y2);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_SRoot = TypeId.SET.getSpecializedId(CLSSid_SRoot);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_X = TypeId.SET.getSpecializedId(CLSSid_X);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Y1 = TypeId.SET.getSpecializedId(CLSSid_Y1);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Y2 = TypeId.SET.getSpecializedId(CLSSid_Y2);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Z = TypeId.SET.getSpecializedId(CLSSid_Z);
    
    /*
     * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
     */
    private static final /*@NonNull*/ ClassId[] classIndex2classId = new ClassId[]{
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
    private final static /*@NonNull*/ int[][] classIndex2allClassIndexes = new int[][] {
        {0},                    // 0 : SRoot -> {SRoot}
        {1},                    // 1 : X -> {X}
        {2},                    // 2 : Y1 -> {Y1}
        {3},                    // 3 : Y2 -> {Y2}
        {4}                     // 4 : Z -> {Z}
    };
    
    public Source2Target_qvtp_qvtias(final /*@NonNull*/ Evaluator evaluator) {
        super(evaluator, new String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    public boolean run() {
        return __root__();
    }
    
    /**
     * target::Visitable::lookupNamespace(pathSeq : OrderedSet(source::PathElementCS)) : target::Namespace[?]
     * 
     * 
     * if pathSeq->size() = 1
     * then
     *   _lookupNamespace(pathSeq->first(), false)
     * else
     *   lookupNamespace(
     *     pathSeq->subOrderedSet(1, pathSeq->size() - 1))
     *   ?._lookupNamespace(pathSeq->last(), true)
     * endif
     */
    public /*@Nullable*/ /*@NonInvalid*/ Namespace lookupNamespace(final /*@NonNull*/ /*@NonInvalid*/ Visitable self_0, final /*@NonNull*/ /*@NonInvalid*/ List<PathElementCS> pathSeq) {
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ OrderedSetValue BOXED_pathSeq_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, pathSeq);
        final /*@NonNull*/ /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
        final /*@Thrown*/ boolean eq = size.equals(INT_1);
        /*@Nullable*/ /*@Thrown*/ Namespace symbol_1;
        if (eq) {
            final /*@Nullable*/ /*@Thrown*/ PathElementCS first = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
            LookupEnvironment _lookupEnv = new uk.ac.yor.cs.asbh.cs2as.LookupEnvironment(evaluator,first, ValueUtil.FALSE_VALUE);
            TargetLookupVisitor _lookupVisitor = new uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor(_lookupEnv);
            EList<NamedElement> _lookupResult = self_0.accept(_lookupVisitor).getNamedElements();
            Namespace _lookupNamespace = null;
            if (_lookupResult.size() == 1) {
                _lookupNamespace = (Namespace)_lookupResult.get(0);
            } else {
                handleLookupError(pathSeq,first);
            };
            symbol_1 = _lookupNamespace;
        }
        else {
            final /*@NonNull*/ /*@Thrown*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue subOrderedSet = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_pathSeq_0, INT_1, diff);
            final List<PathElementCS> UNBOXED_subOrderedSet = subOrderedSet.asEcoreObjects(idResolver, PathElementCS.class);
            assert UNBOXED_subOrderedSet != null;
            final /*@Nullable*/ /*@Thrown*/ Namespace lookupNamespace = this.lookupNamespace(self_0, UNBOXED_subOrderedSet);
            final /*@Thrown*/ boolean symbol_0 = lookupNamespace == null;
            /*@Nullable*/ /*@Thrown*/ Namespace safe__lookupNamespace;
            if (symbol_0) {
                safe__lookupNamespace = null;
            }
            else {
                final /*@Nullable*/ /*@Thrown*/ PathElementCS last = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
                LookupEnvironment _lookupEnv_0 = new uk.ac.yor.cs.asbh.cs2as.LookupEnvironment(evaluator,last, ValueUtil.TRUE_VALUE);
                TargetLookupVisitor _lookupVisitor_0 = new uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor(_lookupEnv_0);
                EList<NamedElement> _lookupResult_0 = lookupNamespace.accept(_lookupVisitor_0).getNamedElements();
                Namespace _lookupNamespace_0 = null;
                if (_lookupResult_0.size() == 1) {
                    _lookupNamespace_0 = (Namespace)_lookupResult_0.get(0);
                } else {
                    handleLookupError(pathSeq,last);
                };
                safe__lookupNamespace = _lookupNamespace_0;
            }
            symbol_1 = safe__lookupNamespace;
        }
        return symbol_1;
    }
    
    /**
     * 
     * map cSRoot_2_TRoot in Source2Target_qvtp_qvtias {
     * leftCS (sRoot : source::SRoot[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize tRoot : target::TRoot[1];
     *  |}
     * where ( |)
     * { |
     * sRoot.ast := tRoot;
     * }
     * 
     */
    protected boolean cSRoot_2_TRoot(final /*@NonNull*/ /*@NonInvalid*/ SRoot sRoot) {
        // predicates
        // creations
        final /*@Thrown*/ TRoot tRoot = TargetFactory.eINSTANCE.createTRoot();
        assert tRoot != null;
        models[1/*rightAS*/].add(tRoot);
        // assignments
        sRoot.setAst(tRoot);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cX_2_A3 in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize a3 : target::A3[1];
     *  |}
     * where ( |
     * not disambiguatesToA1()
     *   not disambiguatesToA2())
     * { |
     * x.ast := a3;
     * }
     * 
     */
    protected boolean cX_2_A3(final /*@NonNull*/ /*@NonInvalid*/ X x) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x.isIsA2();
        final /*@Nullable*/ /*@Thrown*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(isA2);
        if (not_0 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ A3 a3 = TargetFactory.eINSTANCE.createA3();
        assert a3 != null;
        models[1/*rightAS*/].add(a3);
        // assignments
        x.setAst(a3);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cX_2_A2 in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize a2 : target::A2[1];
     *  |}
     * where ( |
     * not disambiguatesToA1()
     *   disambiguatesToA2())
     * { |
     * x.ast := a2;
     * }
     * 
     */
    protected boolean cX_2_A2(final /*@NonNull*/ /*@NonInvalid*/ X x_0) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_0.isIsA2();
        if (isA2 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_0.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ A2 a2 = TargetFactory.eINSTANCE.createA2();
        assert a2 != null;
        models[1/*rightAS*/].add(a2);
        // assignments
        x_0.setAst(a2);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cX_2_A1 in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize a1 : target::A1[1];
     *  |}
     * where ( |
     * disambiguatesToA1())
     * { |
     * x.ast := a1;
     * }
     * 
     */
    protected boolean cX_2_A1(final /*@NonNull*/ /*@NonInvalid*/ X x_1) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_1.isIsA1();
        if (isA1 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ A1 a1 = TargetFactory.eINSTANCE.createA1();
        assert a1 != null;
        models[1/*rightAS*/].add(a1);
        // assignments
        x_1.setAst(a1);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cY1_2_B in Source2Target_qvtp_qvtias {
     * leftCS (y1 : source::Y1[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize b : target::B[1];
     *  |}
     * where ( |)
     * { |
     * y1.ast := b;
     * }
     * 
     */
    protected boolean cY1_2_B(final /*@NonNull*/ /*@NonInvalid*/ Y1 y1) {
        // predicates
        // creations
        final /*@Thrown*/ B b = TargetFactory.eINSTANCE.createB();
        assert b != null;
        models[1/*rightAS*/].add(b);
        // assignments
        y1.setAst(b);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cY2_2_C in Source2Target_qvtp_qvtias {
     * leftCS (y2 : source::Y2[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize c : target::C[1];
     *  |}
     * where ( |)
     * { |
     * y2.ast := c;
     * }
     * 
     */
    protected boolean cY2_2_C(final /*@NonNull*/ /*@NonInvalid*/ Y2 y2) {
        // predicates
        // creations
        final /*@Thrown*/ C c = TargetFactory.eINSTANCE.createC();
        assert c != null;
        models[1/*rightAS*/].add(c);
        // assignments
        y2.setAst(c);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cZ_2_D_0 in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (z : source::Z[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize d : target::D[1];
     *  |}
     * where ( |
     * not toY.oclIsKindOf(source::Y1))
     * { |
     * z.ast := d;
     * }
     * 
     */
    protected boolean cZ_2_D_0(final /*@NonNull*/ /*@NonInvalid*/ Z z) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ D d = TargetFactory.eINSTANCE.createD();
        assert d != null;
        models[1/*rightAS*/].add(d);
        // assignments
        z.setAst(d);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cZ_2_D_1 in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (z : source::Z[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize d : target::D[1];
     *  |}
     * where ( |
     * toY.oclIsKindOf(source::Y1))
     * { |
     * z.ast := d;
     * }
     * 
     */
    protected boolean cZ_2_D_1(final /*@NonNull*/ /*@NonInvalid*/ Z z_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_0.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        // creations
        final /*@Thrown*/ D d = TargetFactory.eINSTANCE.createD();
        assert d != null;
        models[1/*rightAS*/].add(d);
        // assignments
        z_0.setAst(d);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uTRoot_ownedA in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (sRoot : source::SRoot[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * sRoot.ast.oclAsType(target::TRoot)
     *   .ownedA := ownedX.ast.oclAsType(target::A);
     * }
     * 
     */
    protected boolean uTRoot_ownedA(final /*@NonNull*/ /*@NonInvalid*/ SRoot sRoot_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_TRoot_0 = idResolver.getClass(CLSSid_TRoot, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = sRoot_0.getAst();
        final /*@Nullable*/ /*@Thrown*/ TRoot oclAsType = (TRoot)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_TRoot_0);
        final /*@Nullable*/ /*@Thrown*/ List<X> ownedX = sRoot_0.getOwnedX();
        assert ownedX != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedX = idResolver.createOrderedSetOfAll(ORD_CLSSid_X, ownedX);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_A);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedX.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ X _1 = (X)ITERATOR__1.next();
            /**
             * ast.oclAsType(target::A)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A_0 = idResolver.getClass(CLSSid_A, null);
            if (_1 == null) {
                throwNull(sRoot_0, "Null source for \'source::SElement::ast\'");
            }
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1.getAst();
            final /*@Nullable*/ /*@Thrown*/ A oclAsType_0 = (A)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_A_0);
            //
            accumulator.add(oclAsType_0);
        }
        final List<A> UNBOXED_collect = collect.asEcoreObjects(idResolver, A.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedA().addAll(UNBOXED_collect);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uA3_name in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not disambiguatesToA1()
     *   not disambiguatesToA2()
     *   )
     * { |
     * x.ast.oclAsType(target::A3).name := name;
     * }
     * 
     */
    protected boolean uA3_name(final /*@NonNull*/ /*@NonInvalid*/ X x_2) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_2.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_2.isIsA2();
        final /*@Nullable*/ /*@Thrown*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(isA2);
        if (not_0 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A3_0 = idResolver.getClass(CLSSid_A3, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_2.getAst();
        final /*@Nullable*/ /*@Thrown*/ A3 oclAsType = (A3)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_A3_0);
        final /*@Nullable*/ /*@Thrown*/ String name = x_2.getName();
        oclAsType.setName(name);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uA3_ownsC in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not disambiguatesToA1()
     *   not disambiguatesToA2()
     *   )
     * { |
     * x.ast.oclAsType(target::A3)
     *   .ownsC := ownsY.oclAsType(source::Y2)
     *   .ast.oclAsType(target::C);
     * }
     * 
     */
    protected boolean uA3_ownsC(final /*@NonNull*/ /*@NonInvalid*/ X x_3) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_3.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_3.isIsA2();
        final /*@Nullable*/ /*@Thrown*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(isA2);
        if (not_0 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A3_0 = idResolver.getClass(CLSSid_A3, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_3.getAst();
        final /*@Nullable*/ /*@Thrown*/ A3 oclAsType = (A3)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_A3_0);
        final /*@Nullable*/ /*@Thrown*/ List<Y> ownsY = x_3.getOwnsY();
        assert ownsY != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownsY = idResolver.createOrderedSetOfAll(ORD_CLSSid_Y, ownsY);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Y2);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownsY.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Y _1 = (Y)ITERATOR__1.next();
            /**
             * oclAsType(source::Y2)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
            final /*@Nullable*/ /*@Thrown*/ Y2 oclAsType_0 = (Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1, TYP_source_c_c_Y2_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_C);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Y2 _1_0 = (Y2)ITERATOR__1_0.next();
            /**
             * ast.oclAsType(target::C)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
            if (_1_0 == null) {
                throwNull(x_3, "Null source for \'source::SElement::ast\'");
            }
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1_0.getAst();
            final /*@Nullable*/ /*@Thrown*/ C oclAsType_1 = (C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_C_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<C> UNBOXED_collect = collect.asEcoreObjects(idResolver, C.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnsC().addAll(UNBOXED_collect);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uA2_name in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not disambiguatesToA1()
     *   disambiguatesToA2()
     *   )
     * { |
     * x.ast.oclAsType(target::A2).name := name;
     * }
     * 
     */
    protected boolean uA2_name(final /*@NonNull*/ /*@NonInvalid*/ X x_4) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_4.isIsA2();
        if (isA2 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_4.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A2_0 = idResolver.getClass(CLSSid_A2, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_4.getAst();
        final /*@Nullable*/ /*@Thrown*/ A2 oclAsType = (A2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_A2_0);
        final /*@Nullable*/ /*@Thrown*/ String name = x_4.getName();
        oclAsType.setName(name);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uA2_ownsC in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not disambiguatesToA1()
     *   disambiguatesToA2()
     *   )
     * { |
     * x.ast.oclAsType(target::A2)
     *   .ownsC := ownsY.oclAsType(source::Y2)
     *   .ast.oclAsType(target::C);
     * }
     * 
     */
    protected boolean uA2_ownsC(final /*@NonNull*/ /*@NonInvalid*/ X x_5) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_5.isIsA2();
        if (isA2 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_5.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A2_0 = idResolver.getClass(CLSSid_A2, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_5.getAst();
        final /*@Nullable*/ /*@Thrown*/ A2 oclAsType = (A2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_A2_0);
        final /*@Nullable*/ /*@Thrown*/ List<Y> ownsY = x_5.getOwnsY();
        assert ownsY != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownsY = idResolver.createOrderedSetOfAll(ORD_CLSSid_Y, ownsY);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Y2);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownsY.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Y _1 = (Y)ITERATOR__1.next();
            /**
             * oclAsType(source::Y2)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
            final /*@Nullable*/ /*@Thrown*/ Y2 oclAsType_0 = (Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1, TYP_source_c_c_Y2_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_C);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Y2 _1_0 = (Y2)ITERATOR__1_0.next();
            /**
             * ast.oclAsType(target::C)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
            if (_1_0 == null) {
                throwNull(x_5, "Null source for \'source::SElement::ast\'");
            }
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1_0.getAst();
            final /*@Nullable*/ /*@Thrown*/ C oclAsType_1 = (C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_C_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<C> UNBOXED_collect = collect.asEcoreObjects(idResolver, C.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnsC().addAll(UNBOXED_collect);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uA1_name in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * disambiguatesToA1()
     *   )
     * { |
     * x.ast.oclAsType(target::A1).name := name;
     * }
     * 
     */
    protected boolean uA1_name(final /*@NonNull*/ /*@NonInvalid*/ X x_6) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_6.isIsA1();
        if (isA1 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A1_0 = idResolver.getClass(CLSSid_A1, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_6.getAst();
        final /*@Nullable*/ /*@Thrown*/ A1 oclAsType = (A1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_A1_0);
        final /*@Nullable*/ /*@Thrown*/ String name = x_6.getName();
        oclAsType.setName(name);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uA1_ownsB in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (x : source::X[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * disambiguatesToA1()
     *   )
     * { |
     * x.ast.oclAsType(target::A1)
     *   .ownsB := ownsY.oclAsType(source::Y1)
     *   .ast.oclAsType(target::B);
     * }
     * 
     */
    protected boolean uA1_ownsB(final /*@NonNull*/ /*@NonInvalid*/ X x_7) {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_7.isIsA1();
        if (isA1 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A1_0 = idResolver.getClass(CLSSid_A1, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_7.getAst();
        final /*@Nullable*/ /*@Thrown*/ A1 oclAsType = (A1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_A1_0);
        final /*@Nullable*/ /*@Thrown*/ List<Y> ownsY = x_7.getOwnsY();
        assert ownsY != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownsY = idResolver.createOrderedSetOfAll(ORD_CLSSid_Y, ownsY);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Y1);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownsY.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Y _1 = (Y)ITERATOR__1.next();
            /**
             * oclAsType(source::Y1)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
            final /*@Nullable*/ /*@Thrown*/ Y1 oclAsType_0 = (Y1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1, TYP_source_c_c_Y1_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_B);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Y1 _1_0 = (Y1)ITERATOR__1_0.next();
            /**
             * ast.oclAsType(target::B)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
            if (_1_0 == null) {
                throwNull(x_7, "Null source for \'source::SElement::ast\'");
            }
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1_0.getAst();
            final /*@Nullable*/ /*@Thrown*/ B oclAsType_1 = (B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_B_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<B> UNBOXED_collect = collect.asEcoreObjects(idResolver, B.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnsB().addAll(UNBOXED_collect);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uB_name in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (y1 : source::Y1[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * y1.ast.oclAsType(target::B).name := name;
     * }
     * 
     */
    protected boolean uB_name(final /*@NonNull*/ /*@NonInvalid*/ Y1 y1_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y1_0.getAst();
        final /*@Nullable*/ /*@Thrown*/ B oclAsType = (B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_B_0);
        final /*@Nullable*/ /*@Thrown*/ String name = y1_0.getName();
        oclAsType.setName(name);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uB_ownsD in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (y1 : source::Y1[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * y1.ast.oclAsType(target::B)
     *   .ownsD := ownsZ.ast.oclAsType(target::D);
     * }
     * 
     */
    protected boolean uB_ownsD(final /*@NonNull*/ /*@NonInvalid*/ Y1 y1_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y1_1.getAst();
        final /*@Nullable*/ /*@Thrown*/ B oclAsType = (B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_B_0);
        final /*@Nullable*/ /*@Thrown*/ Z ownsZ = y1_1.getOwnsZ();
        if (ownsZ == null) {
            throwNull(y1_1, "Null source for \'source::SElement::ast\'");
        }
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = ownsZ.getAst();
        final /*@Nullable*/ /*@Thrown*/ D oclAsType_0 = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_D_0);
        oclAsType.setOwnsD(oclAsType_0);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uC_name in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (y2 : source::Y2[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * y2.ast.oclAsType(target::C).name := name;
     * }
     * 
     */
    protected boolean uC_name(final /*@NonNull*/ /*@NonInvalid*/ Y2 y2_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y2_0.getAst();
        final /*@Nullable*/ /*@Thrown*/ C oclAsType = (C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_C_0);
        final /*@Nullable*/ /*@Thrown*/ String name = y2_0.getName();
        oclAsType.setName(name);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uC_ownsD in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (y2 : source::Y2[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * y2.ast.oclAsType(target::C)
     *   .ownsD := ownsZ.ast.oclAsType(target::D);
     * }
     * 
     */
    protected boolean uC_ownsD(final /*@NonNull*/ /*@NonInvalid*/ Y2 y2_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y2_1.getAst();
        final /*@Nullable*/ /*@Thrown*/ C oclAsType = (C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_C_0);
        final /*@Nullable*/ /*@Thrown*/ Z ownsZ = y2_1.getOwnsZ();
        if (ownsZ == null) {
            throwNull(y2_1, "Null source for \'source::SElement::ast\'");
        }
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = ownsZ.getAst();
        final /*@Nullable*/ /*@Thrown*/ D oclAsType_0 = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_D_0);
        oclAsType.setOwnsD(oclAsType_0);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uD_0_toA in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (z : source::Z[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not toY.oclIsKindOf(source::Y1)
     *   )
     * { |
     * z.ast.oclAsType(target::D)
     *   .toA := toY.oclAsType(source::Y2)
     *   .ast.oclAsType(target::C).toA2;
     * }
     * 
     */
    protected boolean uD_0_toA(final /*@NonNull*/ /*@NonInvalid*/ Z z_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_1.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_1.getAst();
        final /*@Nullable*/ /*@Thrown*/ D oclAsType = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_D_0);
        final /*@Nullable*/ /*@Thrown*/ Y2 oclAsType_0 = (Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y2_0);
        if (oclAsType_0 == null) {
            throwNull(z_1, "Null source for \'source::SElement::ast\'");
        }
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = oclAsType_0.getAst();
        final /*@Nullable*/ /*@Thrown*/ C oclAsType_1 = (C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_C_0);
        if (oclAsType_1 == null) {
            throwNull(z_1, "Null source for \'target::C::toA2\'");
        }
        final /*@Nullable*/ /*@Thrown*/ A2 toA2 = oclAsType_1.getToA2();
        oclAsType.setToA(toA2);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uD_0_refsC in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (z : source::Z[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not toY.oclIsKindOf(source::Y1)
     *   )
     * { |
     * z.ast.oclAsType(target::D)
     *   .refsC := ast.oclAsType(target::D)
     *   .lookupC(z);
     * }
     * 
     */
    protected boolean uD_0_refsC(final /*@NonNull*/ /*@NonInvalid*/ Z z_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_2.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_2.getAst();
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ D oclAsType = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_D_0);
        final /*@Nullable*/ /*@Thrown*/ D self_1 = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_D_0);
        final /*@Nullable*/ /*@Thrown*/ PathNameCS refers = z_2.getRefers();
        final /*@Thrown*/ boolean eq = refers == null;
        /*@Nullable*/ /*@Thrown*/ C symbol_2;
        if (eq) {
            symbol_2 = null;
        }
        else {
            if (refers == null) {
                throwNull(z_2, "Null source for \'source::PathNameCS::path\'");
            }
            final /*@Nullable*/ /*@Thrown*/ List<PathElementCS> pathSeq_0 = refers.getPath();
            assert pathSeq_0 != null;
            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_pathSeq_0_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, pathSeq_0);
            final /*@NonNull*/ /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0);
            final /*@Thrown*/ boolean eq_0 = size.equals(INT_1);
            /*@Nullable*/ /*@Thrown*/ C symbol_1;
            if (eq_0) {
                final /*@Nullable*/ /*@Thrown*/ PathElementCS first = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0);
                LookupEnvironment _lookupEnv = new uk.ac.yor.cs.asbh.cs2as.LookupEnvironment(evaluator,first, ValueUtil.FALSE_VALUE);
                TargetLookupVisitor _lookupVisitor = new uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor(_lookupEnv);
                EList<NamedElement> _lookupResult = self_1.accept(_lookupVisitor).getNamedElements();
                C _lookupC = null;
                if (_lookupResult.size() == 1) {
                    _lookupC = (C)_lookupResult.get(0);
                } else {
                    handleLookupError(z_2,first);
                };
                symbol_1 = _lookupC;
            }
            else {
                if (self_1 == null) {
                    throwNull(z_2, "Null source for \'target::Visitable::lookupNamespace(OrderedSet(source::PathElementCS)) : target::Namespace[?]\'");
                }
                final /*@NonNull*/ /*@Thrown*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue subOrderedSet = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0, INT_1, diff);
                final List<PathElementCS> UNBOXED_subOrderedSet = subOrderedSet.asEcoreObjects(idResolver, PathElementCS.class);
                assert UNBOXED_subOrderedSet != null;
                final /*@Nullable*/ /*@Thrown*/ Namespace lookupNamespace = this.lookupNamespace(self_1, UNBOXED_subOrderedSet);
                final /*@Thrown*/ boolean symbol_0 = lookupNamespace == null;
                /*@Nullable*/ /*@Thrown*/ C safe__lookupC;
                if (symbol_0) {
                    safe__lookupC = null;
                }
                else {
                    final /*@Nullable*/ /*@Thrown*/ PathElementCS last = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0);
                    LookupEnvironment _lookupEnv_0 = new uk.ac.yor.cs.asbh.cs2as.LookupEnvironment(evaluator,last, ValueUtil.TRUE_VALUE);
                    TargetLookupVisitor _lookupVisitor_0 = new uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor(_lookupEnv_0);
                    EList<NamedElement> _lookupResult_0 = lookupNamespace.accept(_lookupVisitor_0).getNamedElements();
                    C _lookupC_0 = null;
                    if (_lookupResult_0.size() == 1) {
                        _lookupC_0 = (C)_lookupResult_0.get(0);
                    } else {
                        handleLookupError(z_2,last);
                    };
                    safe__lookupC = _lookupC_0;
                }
                symbol_1 = safe__lookupC;
            }
            symbol_2 = symbol_1;
        }
        oclAsType.setRefsC(symbol_2);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uD_1_toA in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (z : source::Z[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * toY.oclIsKindOf(source::Y1)
     *   )
     * { |
     * z.ast.oclAsType(target::D)
     *   .toA := toY.oclAsType(source::Y1)
     *   .ast.oclAsType(target::B).toA1;
     * }
     * 
     */
    protected boolean uD_1_toA(final /*@NonNull*/ /*@NonInvalid*/ Z z_3) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_3.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_3.getAst();
        final /*@Nullable*/ /*@Thrown*/ D oclAsType = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_D_0);
        final /*@Nullable*/ /*@Thrown*/ Y1 oclAsType_0 = (Y1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0);
        if (oclAsType_0 == null) {
            throwNull(z_3, "Null source for \'source::SElement::ast\'");
        }
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = oclAsType_0.getAst();
        final /*@Nullable*/ /*@Thrown*/ B oclAsType_1 = (B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast_0, TYP_target_c_c_B_0);
        if (oclAsType_1 == null) {
            throwNull(z_3, "Null source for \'target::B::toA1\'");
        }
        final /*@Nullable*/ /*@Thrown*/ A1 toA1 = oclAsType_1.getToA1();
        oclAsType.setToA(toA1);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uD_1_refsB in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (z : source::Z[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * toY.oclIsKindOf(source::Y1)
     *   )
     * { |
     * z.ast.oclAsType(target::D)
     *   .refsB := ast.oclAsType(target::D)
     *   .lookupB(z);
     * }
     * 
     */
    protected boolean uD_1_refsB(final /*@NonNull*/ /*@NonInvalid*/ Z z_4) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_4.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, toY, TYP_source_c_c_Y1_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_4.getAst();
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ D oclAsType = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_D_0);
        final /*@Nullable*/ /*@Thrown*/ D self_1 = (D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, ast, TYP_target_c_c_D_0);
        final /*@Nullable*/ /*@Thrown*/ PathNameCS refers = z_4.getRefers();
        final /*@Thrown*/ boolean eq = refers == null;
        /*@Nullable*/ /*@Thrown*/ B symbol_2;
        if (eq) {
            symbol_2 = null;
        }
        else {
            if (refers == null) {
                throwNull(z_4, "Null source for \'source::PathNameCS::path\'");
            }
            final /*@Nullable*/ /*@Thrown*/ List<PathElementCS> pathSeq_0 = refers.getPath();
            assert pathSeq_0 != null;
            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_pathSeq_0_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, pathSeq_0);
            final /*@NonNull*/ /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0);
            final /*@Thrown*/ boolean eq_0 = size.equals(INT_1);
            /*@Nullable*/ /*@Thrown*/ B symbol_1;
            if (eq_0) {
                final /*@Nullable*/ /*@Thrown*/ PathElementCS first = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0);
                LookupEnvironment _lookupEnv = new uk.ac.yor.cs.asbh.cs2as.LookupEnvironment(evaluator,first, ValueUtil.FALSE_VALUE);
                TargetLookupVisitor _lookupVisitor = new uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor(_lookupEnv);
                EList<NamedElement> _lookupResult = self_1.accept(_lookupVisitor).getNamedElements();
                B _lookupB = null;
                if (_lookupResult.size() == 1) {
                    _lookupB = (B)_lookupResult.get(0);
                } else {
                    handleLookupError(z_4,first);
                };
                symbol_1 = _lookupB;
            }
            else {
                if (self_1 == null) {
                    throwNull(z_4, "Null source for \'target::Visitable::lookupNamespace(OrderedSet(source::PathElementCS)) : target::Namespace[?]\'");
                }
                final /*@NonNull*/ /*@Thrown*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue subOrderedSet = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0, INT_1, diff);
                final List<PathElementCS> UNBOXED_subOrderedSet = subOrderedSet.asEcoreObjects(idResolver, PathElementCS.class);
                assert UNBOXED_subOrderedSet != null;
                final /*@Nullable*/ /*@Thrown*/ Namespace lookupNamespace = this.lookupNamespace(self_1, UNBOXED_subOrderedSet);
                final /*@Thrown*/ boolean symbol_0 = lookupNamespace == null;
                /*@Nullable*/ /*@Thrown*/ B safe__lookupB;
                if (symbol_0) {
                    safe__lookupB = null;
                }
                else {
                    final /*@Nullable*/ /*@Thrown*/ PathElementCS last = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq_0_0);
                    LookupEnvironment _lookupEnv_0 = new uk.ac.yor.cs.asbh.cs2as.LookupEnvironment(evaluator,last, ValueUtil.TRUE_VALUE);
                    TargetLookupVisitor _lookupVisitor_0 = new uk.ac.yor.cs.asbh.cs2as.TargetLookupVisitor(_lookupEnv_0);
                    EList<NamedElement> _lookupResult_0 = lookupNamespace.accept(_lookupVisitor_0).getNamedElements();
                    B _lookupB_0 = null;
                    if (_lookupResult_0.size() == 1) {
                        _lookupB_0 = (B)_lookupResult_0.get(0);
                    } else {
                        handleLookupError(z_4,last);
                    };
                    safe__lookupB = _lookupB_0;
                }
                symbol_1 = safe__lookupB;
            }
            symbol_2 = symbol_1;
        }
        oclAsType.setRefsB(symbol_2);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map __root__ in Source2Target_qvtp_qvtias {
     * 
     *   where ( |)
     * { |}
     * for sRoot : source::SRoot in source::SRoot.allInstances()
     *    {
     * map cSRoot_2_TRoot {
     * sRoot := sRoot;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map cX_2_A1 {
     * x := x;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map cX_2_A2 {
     * x := x;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map cX_2_A3 {
     * x := x;
     * }}
     *   for sRoot : source::SRoot in source::SRoot.allInstances()
     *    {
     * map uTRoot_ownedA {
     * sRoot := sRoot;
     * }}
     *   for y1 : source::Y1 in source::Y1.allInstances()
     *    {
     * map cY1_2_B {
     * y1 := y1;
     * }}
     *   for y2 : source::Y2 in source::Y2.allInstances()
     *    {
     * map cY2_2_C {
     * y2 := y2;
     * }}
     *   for z : source::Z in source::Z.allInstances()
     *    {
     * map cZ_2_D_0 {
     * z := z;
     * }}
     *   for z : source::Z in source::Z.allInstances()
     *    {
     * map cZ_2_D_1 {
     * z := z;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map uA2_ownsC {
     * x := x;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map uA3_ownsC {
     * x := x;
     * }}
     *   for z : source::Z in source::Z.allInstances()
     *    {
     * map uD_0_toA {
     * z := z;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map uA1_name {
     * x := x;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map uA1_ownsB {
     * x := x;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map uA2_name {
     * x := x;
     * }}
     *   for x : source::X in source::X.allInstances()
     *    {
     * map uA3_name {
     * x := x;
     * }}
     *   for y1 : source::Y1 in source::Y1.allInstances()
     *    {
     * map uB_name {
     * y1 := y1;
     * }}
     *   for y1 : source::Y1 in source::Y1.allInstances()
     *    {
     * map uB_ownsD {
     * y1 := y1;
     * }}
     *   for y2 : source::Y2 in source::Y2.allInstances()
     *    {
     * map uC_ownsD {
     * y2 := y2;
     * }}
     *   for z : source::Z in source::Z.allInstances()
     *    {
     * map uD_1_refsB {
     * z := z;
     * }}
     *   for y2 : source::Y2 in source::Y2.allInstances()
     *    {
     * map uC_name {
     * y2 := y2;
     * }}
     *   for z : source::Z in source::Z.allInstances()
     *    {
     * map uD_0_refsC {
     * z := z;
     * }}
     *   for z : source::Z in source::Z.allInstances()
     *    {
     * map uD_1_toA {
     * z := z;
     * }}
     */
    protected boolean __root__() {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_SRoot_1 = idResolver.getClass(CLSSid_SRoot, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_X_8 = idResolver.getClass(CLSSid_X, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_2 = idResolver.getClass(CLSSid_Y1, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y2_2 = idResolver.getClass(CLSSid_Y2, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Z_5 = idResolver.getClass(CLSSid_Z, null);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_3 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_SRoot, TYP_source_c_c_SRoot_1);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_1 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_X, TYP_source_c_c_X_8);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_15 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_Y1, TYP_source_c_c_Y1_2);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_17 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_Y2, TYP_source_c_c_Y2_2);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_7 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_Z, TYP_source_c_c_Z_5);
        final List<SRoot> UNBOXED_allInstances_3 = allInstances_3.asEcoreObjects(idResolver, SRoot.class);
        assert UNBOXED_allInstances_3 != null;
        final List<X> UNBOXED_allInstances_1 = allInstances_1.asEcoreObjects(idResolver, X.class);
        assert UNBOXED_allInstances_1 != null;
        final List<Y1> UNBOXED_allInstances_15 = allInstances_15.asEcoreObjects(idResolver, Y1.class);
        assert UNBOXED_allInstances_15 != null;
        final List<Y2> UNBOXED_allInstances_17 = allInstances_17.asEcoreObjects(idResolver, Y2.class);
        assert UNBOXED_allInstances_17 != null;
        final List<Z> UNBOXED_allInstances_7 = allInstances_7.asEcoreObjects(idResolver, Z.class);
        assert UNBOXED_allInstances_7 != null;
        // creations
        // assignments
        // mapping statements
        ;
        for (SRoot sRoot_3 : UNBOXED_allInstances_3) {
            if (sRoot_3 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ SRoot symbol_1 = (SRoot)sRoot_3;
                cSRoot_2_TRoot(symbol_1);
            }
        }
        ;
        for (X x_17 : UNBOXED_allInstances_1) {
            if (x_17 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_5 = (X)x_17;
                cX_2_A1(symbol_5);
            }
        }
        ;
        for (X x_18 : UNBOXED_allInstances_1) {
            if (x_18 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_9 = (X)x_18;
                cX_2_A2(symbol_9);
            }
        }
        ;
        for (X x_19 : UNBOXED_allInstances_1) {
            if (x_19 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_13 = (X)x_19;
                cX_2_A3(symbol_13);
            }
        }
        ;
        for (SRoot sRoot_4 : UNBOXED_allInstances_3) {
            if (sRoot_4 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ SRoot symbol_17 = (SRoot)sRoot_4;
                uTRoot_ownedA(symbol_17);
            }
        }
        ;
        for (Y1 y1_5 : UNBOXED_allInstances_15) {
            if (y1_5 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y1 symbol_21 = (Y1)y1_5;
                cY1_2_B(symbol_21);
            }
        }
        ;
        for (Y2 y2_5 : UNBOXED_allInstances_17) {
            if (y2_5 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y2 symbol_25 = (Y2)y2_5;
                cY2_2_C(symbol_25);
            }
        }
        ;
        for (Z z_11 : UNBOXED_allInstances_7) {
            if (z_11 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_29 = (Z)z_11;
                cZ_2_D_0(symbol_29);
            }
        }
        ;
        for (Z z_12 : UNBOXED_allInstances_7) {
            if (z_12 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_33 = (Z)z_12;
                cZ_2_D_1(symbol_33);
            }
        }
        ;
        for (X x_20 : UNBOXED_allInstances_1) {
            if (x_20 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_37 = (X)x_20;
                uA2_ownsC(symbol_37);
            }
        }
        ;
        for (X x_21 : UNBOXED_allInstances_1) {
            if (x_21 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_41 = (X)x_21;
                uA3_ownsC(symbol_41);
            }
        }
        ;
        for (Z z_13 : UNBOXED_allInstances_7) {
            if (z_13 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_45 = (Z)z_13;
                uD_0_toA(symbol_45);
            }
        }
        ;
        for (X x_22 : UNBOXED_allInstances_1) {
            if (x_22 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_49 = (X)x_22;
                uA1_name(symbol_49);
            }
        }
        ;
        for (X x_23 : UNBOXED_allInstances_1) {
            if (x_23 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_53 = (X)x_23;
                uA1_ownsB(symbol_53);
            }
        }
        ;
        for (X x_24 : UNBOXED_allInstances_1) {
            if (x_24 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_57 = (X)x_24;
                uA2_name(symbol_57);
            }
        }
        ;
        for (X x_25 : UNBOXED_allInstances_1) {
            if (x_25 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_61 = (X)x_25;
                uA3_name(symbol_61);
            }
        }
        ;
        for (Y1 y1_6 : UNBOXED_allInstances_15) {
            if (y1_6 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y1 symbol_65 = (Y1)y1_6;
                uB_name(symbol_65);
            }
        }
        ;
        for (Y1 y1_7 : UNBOXED_allInstances_15) {
            if (y1_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y1 symbol_69 = (Y1)y1_7;
                uB_ownsD(symbol_69);
            }
        }
        ;
        for (Y2 y2_6 : UNBOXED_allInstances_17) {
            if (y2_6 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y2 symbol_73 = (Y2)y2_6;
                uC_ownsD(symbol_73);
            }
        }
        ;
        for (Z z_14 : UNBOXED_allInstances_7) {
            if (z_14 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_77 = (Z)z_14;
                uD_1_refsB(symbol_77);
            }
        }
        ;
        for (Y2 y2_7 : UNBOXED_allInstances_17) {
            if (y2_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y2 symbol_81 = (Y2)y2_7;
                uC_name(symbol_81);
            }
        }
        ;
        for (Z z_15 : UNBOXED_allInstances_7) {
            if (z_15 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_85 = (Z)z_15;
                uD_0_refsC(symbol_85);
            }
        }
        ;
        for (Z z_16 : UNBOXED_allInstances_7) {
            if (z_16 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_89 = (Z)z_16;
                uD_1_toA(symbol_89);
            }
        }
        return true;
    }
}
