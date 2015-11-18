/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package uk.ac.york.cs.asbh.cs2as._Source2Target_qvtp_qvtias;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.evaluation.Executor;
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
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.xtext.base.cs2as.tx.AbstractCS2ASTransformer;
import uk.ac.yor.cs.asbh.cs2as.LookupResult;
import uk.ac.yor.cs.asbh.cs2as.TargetLookupResolver;
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
public class Source2Target_qvtp_qvtias extends AbstractCS2ASTransformer
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
    
    private final TargetLookupResolver lookupResolver = new TargetLookupResolver(executor);
    
    public Source2Target_qvtp_qvtias(final /*@NonNull*/ Executor executor) throws ReflectiveOperationException {
        super(executor, new String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    public boolean run() throws ReflectiveOperationException {
        boolean returnStatus = MAP___root__();
        invocationManager.flush();
        return returnStatus;
    }
    
    /**
     * target::Visitable::lookupNamespace(pathSeq : OrderedSet(source::PathElementCS)) : target::Namespace[?]
     * 
     * 
     * if pathSeq->size() = 1
     * then lookupNamespace(pathSeq->first())
     * else
     *   lookupNamespace(
     *     pathSeq->subOrderedSet(1, pathSeq->size() - 1))
     *   ?.lookupLocalNamespace(pathSeq->last())
     * endif
     */
    public /*@Nullable*/ /*@NonInvalid*/ Namespace lookupNamespace(final /*@NonNull*/ /*@NonInvalid*/ Visitable self_0, final /*@NonNull*/ /*@NonInvalid*/ List<PathElementCS> pathSeq) {
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ OrderedSetValue BOXED_pathSeq = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, pathSeq);
        final /*@NonNull*/ /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_pathSeq);
        final /*@NonInvalid*/ boolean eq = size.equals(INT_1);
        /*@Nullable*/ /*@Thrown*/ Namespace symbol_1;
        if (eq) {
            final /*@Nullable*/ /*@Thrown*/ PathElementCS pathElement = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_pathSeq);
            if (pathElement == null) {
                throw new InvalidValueException("Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
            }
            final /*@NonNull*/ /*@Thrown*/ String name = pathElement.getName();
            LookupResult<Namespace> _lookupResult = lookupResolver.lookupNamespace(self_0, name, ValueUtil.FALSE_VALUE);
            Namespace _lookupNamespace = null;
            if (_lookupResult.size() == 1) {
                _lookupNamespace = _lookupResult.getSingleResult();
            } else {
                handleLookupError(pathElement,name);
            };
            symbol_1 = _lookupNamespace;
        }
        else {
            final /*@NonNull*/ /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue subOrderedSet = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_pathSeq, INT_1, diff);
            final List<PathElementCS> UNBOXED_subOrderedSet = subOrderedSet.asEcoreObjects(idResolver, PathElementCS.class);
            assert UNBOXED_subOrderedSet != null;
            final /*@Nullable*/ /*@Thrown*/ Namespace lookupNamespace = this.lookupNamespace(self_0, UNBOXED_subOrderedSet);
            /*@Nullable*/ /*@Caught*/ Object CAUGHT_lookupNamespace;
            try {
                CAUGHT_lookupNamespace = lookupNamespace;
            }
            catch (Exception e) {
                CAUGHT_lookupNamespace = ValueUtil.createInvalidValue(e);
            }
            final /*@NonNull*/ /*@NonInvalid*/ Object symbol_0 = CAUGHT_lookupNamespace == null;
            /*@Nullable*/ /*@Thrown*/ Namespace safe_lookupLocalNamespace_source;
            if (symbol_0 == Boolean.TRUE) {
                safe_lookupLocalNamespace_source = null;
            }
            else {
                final /*@Nullable*/ /*@Thrown*/ Namespace self_1 = this.lookupNamespace(self_0, UNBOXED_subOrderedSet);
                final /*@Nullable*/ /*@Thrown*/ PathElementCS pathElement_0 = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq);
                if (pathElement_0 == null) {
                    throw new InvalidValueException("Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                }
                final /*@NonNull*/ /*@Thrown*/ String name_0 = pathElement_0.getName();
                LookupResult<Namespace> _lookupResult_0 = lookupResolver.lookupNamespace(self_1, name_0, ValueUtil.TRUE_VALUE);
                Namespace _lookupNamespace_0 = null;
                if (_lookupResult_0.size() == 1) {
                    _lookupNamespace_0 = _lookupResult_0.getSingleResult();
                } else {
                    handleLookupError(pathElement_0,name_0);
                };
                safe_lookupLocalNamespace_source = _lookupNamespace_0;
            }
            symbol_1 = safe_lookupLocalNamespace_source;
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
    protected boolean MAP_cSRoot_2_TRoot(final /*@NonNull*/ /*@NonInvalid*/ SRoot sRoot) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ TRoot tRoot = TargetFactory.eINSTANCE.createTRoot();
        assert tRoot != null;
        models[1/*rightAS*/].add(tRoot);
        // property assignments
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
     *   not disambiguatesToA2()
     *   )
     * { |
     * x.ast := a3;
     * }
     * map uA3_name {
     * x := x;
     * }
     */
    protected boolean MAP_cX_2_A3(final /*@NonNull*/ /*@NonInvalid*/ X x) throws ReflectiveOperationException {
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
        // property assignments
        x.setAst(a3);
        // mapping statements
        MAP_uA3_name(x);
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
     *   disambiguatesToA2()
     *   )
     * { |
     * x.ast := a2;
     * }
     * map uA2_name {
     * x := x;
     * }
     */
    protected boolean MAP_cX_2_A2(final /*@NonNull*/ /*@NonInvalid*/ X x_0) throws ReflectiveOperationException {
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
        // property assignments
        x_0.setAst(a2);
        // mapping statements
        MAP_uA2_name(x_0);
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
     * disambiguatesToA1()
     *   )
     * { |
     * x.ast := a1;
     * }
     * map uA1_name {
     * x := x;
     * }
     */
    protected boolean MAP_cX_2_A1(final /*@NonNull*/ /*@NonInvalid*/ X x_1) throws ReflectiveOperationException {
        // predicates
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_1.isIsA1();
        if (isA1 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ A1 a1 = TargetFactory.eINSTANCE.createA1();
        assert a1 != null;
        models[1/*rightAS*/].add(a1);
        // property assignments
        x_1.setAst(a1);
        // mapping statements
        MAP_uA1_name(x_1);
        return true;
    }
    
    /**
     * 
     * map cY1_2_B in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (y1 : source::Y1[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize b : target::B[1];
     *  |}
     * where ( |)
     * { |
     * y1.ast := b;
     * }
     * map uB_name {
     * y1 := y1;
     * }
     */
    protected boolean MAP_cY1_2_B(final /*@NonNull*/ /*@NonInvalid*/ Y1 y1) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ B b = TargetFactory.eINSTANCE.createB();
        assert b != null;
        models[1/*rightAS*/].add(b);
        // property assignments
        y1.setAst(b);
        // mapping statements
        MAP_uB_name(y1);
        return true;
    }
    
    /**
     * 
     * map cY2_2_C in Source2Target_qvtp_qvtias {
     * 
     *   leftCS (y2 : source::Y2[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize c : target::C[1];
     *  |}
     * where ( |)
     * { |
     * y2.ast := c;
     * }
     * map uC_name {
     * y2 := y2;
     * }
     */
    protected boolean MAP_cY2_2_C(final /*@NonNull*/ /*@NonInvalid*/ Y2 y2) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ C c = TargetFactory.eINSTANCE.createC();
        assert c != null;
        models[1/*rightAS*/].add(c);
        // property assignments
        y2.setAst(c);
        // mapping statements
        MAP_uC_name(y2);
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
    protected boolean MAP_cZ_2_D_0(final /*@NonNull*/ /*@NonInvalid*/ Z z) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ D d = TargetFactory.eINSTANCE.createD();
        assert d != null;
        models[1/*rightAS*/].add(d);
        // property assignments
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
    protected boolean MAP_cZ_2_D_1(final /*@NonNull*/ /*@NonInvalid*/ Z z_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_0.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        // creations
        final /*@Thrown*/ D d = TargetFactory.eINSTANCE.createD();
        assert d != null;
        models[1/*rightAS*/].add(d);
        // property assignments
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
     * {_0 : target::TRoot[1];
     * _1 : Sequence(target::A);
     *  |
     * _0 := sRoot.ast.oclAsType(target::TRoot)
     *   ;
     * _1 := ownedX.ast.oclAsType(target::A);
     * _0.ownedA := _1;
     * }
     * 
     */
    protected boolean MAP_uTRoot_ownedA(final /*@NonNull*/ /*@NonInvalid*/ SRoot sRoot_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_TRoot_0 = idResolver.getClass(CLSSid_TRoot, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = sRoot_0.getAst();
        final /*@NonNull*/ /*@Thrown*/ TRoot oclAsType = ClassUtil.nonNullState((TRoot)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_TRoot_0));
        final /*@NonNull*/ /*@Thrown*/ List<X> ownedX = sRoot_0.getOwnedX();
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
                throwNull(sRoot_0, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::SElement::ast\'");
            }
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1.getAst();
            final /*@NonNull*/ /*@Thrown*/ A oclAsType_0 = ClassUtil.nonNullState((A)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_A_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonNull*/ /*@NonInvalid*/ List<A> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(A.class, collect);
        oclAsType.getOwnedA().addAll(ECORE_collect);
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
     * {_0 : target::A3[1];
     * _1 : String[?];
     *  |
     * _0 := x.ast.oclAsType(target::A3);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uA3_name(final /*@NonNull*/ /*@NonInvalid*/ X x_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
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
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A3_0 = idResolver.getClass(CLSSid_A3, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_2.getAst();
        final /*@NonNull*/ /*@Thrown*/ A3 oclAsType = ClassUtil.nonNullState((A3)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A3_0));
        final /*@Nullable*/ /*@Thrown*/ String name = x_2.getName();
        // property assignments
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
     * {_0 : target::A3[1];
     * _1 : Sequence(target::C);
     *  |
     * _0 := x.ast.oclAsType(target::A3)
     *   ;
     * _1 := ownsY.oclAsType(source::Y2)
     *   .ast.oclAsType(target::C);
     * _0.ownsC := _1;
     * }
     * 
     */
    protected boolean MAP_uA3_ownsC(final /*@NonNull*/ /*@NonInvalid*/ X x_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
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
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A3_0 = idResolver.getClass(CLSSid_A3, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_3.getAst();
        final /*@NonNull*/ /*@Thrown*/ A3 oclAsType = ClassUtil.nonNullState((A3)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A3_0));
        final /*@NonNull*/ /*@Thrown*/ List<Y> ownsY = x_3.getOwnsY();
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
            final /*@NonNull*/ /*@Thrown*/ Y2 oclAsType_0 = ClassUtil.nonNullState((Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_source_c_c_Y2_0));
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_C);
        /*@NonNull*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@NonNull*/ /*@NonInvalid*/ Y2 _1_0 = (Y2)ITERATOR__1_0.next();
            /**
             * ast.oclAsType(target::C)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1_0.getAst();
            final /*@NonNull*/ /*@Thrown*/ C oclAsType_1 = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_C_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        // property assignments
        final /*@NonNull*/ /*@NonInvalid*/ List<C> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(C.class, collect);
        oclAsType.getOwnsC().addAll(ECORE_collect);
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
     * {_0 : target::A2[1];
     * _1 : String[?];
     *  |
     * _0 := x.ast.oclAsType(target::A2);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uA2_name(final /*@NonNull*/ /*@NonInvalid*/ X x_4) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_4.isIsA2();
        if (isA2 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_4.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A2_0 = idResolver.getClass(CLSSid_A2, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_4.getAst();
        final /*@NonNull*/ /*@Thrown*/ A2 oclAsType = ClassUtil.nonNullState((A2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A2_0));
        final /*@Nullable*/ /*@Thrown*/ String name = x_4.getName();
        // property assignments
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
     * {_0 : target::A2[1];
     * _1 : Sequence(target::C);
     *  |
     * _0 := x.ast.oclAsType(target::A2)
     *   ;
     * _1 := ownsY.oclAsType(source::Y2)
     *   .ast.oclAsType(target::C);
     * _0.ownsC := _1;
     * }
     * 
     */
    protected boolean MAP_uA2_ownsC(final /*@NonNull*/ /*@NonInvalid*/ X x_5) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@Nullable*/ /*@Thrown*/ Boolean isA2 = x_5.isIsA2();
        if (isA2 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_5.isIsA1();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isA1);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A2_0 = idResolver.getClass(CLSSid_A2, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_5.getAst();
        final /*@NonNull*/ /*@Thrown*/ A2 oclAsType = ClassUtil.nonNullState((A2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A2_0));
        final /*@NonNull*/ /*@Thrown*/ List<Y> ownsY = x_5.getOwnsY();
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
            final /*@NonNull*/ /*@Thrown*/ Y2 oclAsType_0 = ClassUtil.nonNullState((Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_source_c_c_Y2_0));
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_C);
        /*@NonNull*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@NonNull*/ /*@NonInvalid*/ Y2 _1_0 = (Y2)ITERATOR__1_0.next();
            /**
             * ast.oclAsType(target::C)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1_0.getAst();
            final /*@NonNull*/ /*@Thrown*/ C oclAsType_1 = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_C_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        // property assignments
        final /*@NonNull*/ /*@NonInvalid*/ List<C> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(C.class, collect);
        oclAsType.getOwnsC().addAll(ECORE_collect);
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
     * {_0 : target::A1[1];
     * _1 : String[?];
     *  |
     * _0 := x.ast.oclAsType(target::A1);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uA1_name(final /*@NonNull*/ /*@NonInvalid*/ X x_6) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_6.isIsA1();
        if (isA1 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A1_0 = idResolver.getClass(CLSSid_A1, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_6.getAst();
        final /*@NonNull*/ /*@Thrown*/ A1 oclAsType = ClassUtil.nonNullState((A1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A1_0));
        final /*@Nullable*/ /*@Thrown*/ String name = x_6.getName();
        // property assignments
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
     * {_0 : target::A1[1];
     * _1 : Sequence(target::B);
     *  |
     * _0 := x.ast.oclAsType(target::A1)
     *   ;
     * _1 := ownsY.oclAsType(source::Y1)
     *   .ast.oclAsType(target::B);
     * _0.ownsB := _1;
     * }
     * 
     */
    protected boolean MAP_uA1_ownsB(final /*@NonNull*/ /*@NonInvalid*/ X x_7) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@Nullable*/ /*@Thrown*/ Boolean isA1 = x_7.isIsA1();
        if (isA1 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_A1_0 = idResolver.getClass(CLSSid_A1, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = x_7.getAst();
        final /*@NonNull*/ /*@Thrown*/ A1 oclAsType = ClassUtil.nonNullState((A1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_A1_0));
        final /*@NonNull*/ /*@Thrown*/ List<Y> ownsY = x_7.getOwnsY();
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
            final /*@NonNull*/ /*@Thrown*/ Y1 oclAsType_0 = ClassUtil.nonNullState((Y1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_source_c_c_Y1_0));
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_B);
        /*@NonNull*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@NonNull*/ /*@NonInvalid*/ Y1 _1_0 = (Y1)ITERATOR__1_0.next();
            /**
             * ast.oclAsType(target::B)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
            final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = _1_0.getAst();
            final /*@NonNull*/ /*@Thrown*/ B oclAsType_1 = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_B_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        // property assignments
        final /*@NonNull*/ /*@NonInvalid*/ List<B> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(B.class, collect);
        oclAsType.getOwnsB().addAll(ECORE_collect);
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
     * {_0 : target::B[1];
     * _1 : String[?];
     *  |
     * _0 := y1.ast.oclAsType(target::B);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uB_name(final /*@NonNull*/ /*@NonInvalid*/ Y1 y1_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y1_0.getAst();
        final /*@NonNull*/ /*@Thrown*/ B oclAsType = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_B_0));
        final /*@Nullable*/ /*@Thrown*/ String name = y1_0.getName();
        // property assignments
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
     * {_0 : target::B[1];
     * _1 : target::D[1];
     *  |
     * _0 := y1.ast.oclAsType(target::B)
     *   ;
     * _1 := ownsZ.ast.oclAsType(target::D);
     * _0.ownsD := _1;
     * }
     * 
     */
    protected boolean MAP_uB_ownsD(final /*@NonNull*/ /*@NonInvalid*/ Y1 y1_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y1_1.getAst();
        final /*@NonNull*/ /*@Thrown*/ B oclAsType = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_B_0));
        final /*@Nullable*/ /*@Thrown*/ Z ownsZ = y1_1.getOwnsZ();
        if (ownsZ == null) {
            throwNull(y1_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::SElement::ast\'");
        }
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = ownsZ.getAst();
        final /*@NonNull*/ /*@Thrown*/ D oclAsType_0 = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_D_0));
        // property assignments
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
     * {_0 : target::C[1];
     * _1 : String[?];
     *  |
     * _0 := y2.ast.oclAsType(target::C);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uC_name(final /*@NonNull*/ /*@NonInvalid*/ Y2 y2_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y2_0.getAst();
        final /*@NonNull*/ /*@Thrown*/ C oclAsType = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_C_0));
        final /*@Nullable*/ /*@Thrown*/ String name = y2_0.getName();
        // property assignments
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
     * {_0 : target::C[1];
     * _1 : target::D[1];
     *  |
     * _0 := y2.ast.oclAsType(target::C)
     *   ;
     * _1 := ownsZ.ast.oclAsType(target::D);
     * _0.ownsD := _1;
     * }
     * 
     */
    protected boolean MAP_uC_ownsD(final /*@NonNull*/ /*@NonInvalid*/ Y2 y2_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = y2_1.getAst();
        final /*@NonNull*/ /*@Thrown*/ C oclAsType = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_C_0));
        final /*@Nullable*/ /*@Thrown*/ Z ownsZ = y2_1.getOwnsZ();
        if (ownsZ == null) {
            throwNull(y2_1, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::SElement::ast\'");
        }
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = ownsZ.getAst();
        final /*@NonNull*/ /*@Thrown*/ D oclAsType_0 = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_D_0));
        // property assignments
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
     * {_0 : target::D[1];
     * _1 : target::A2[?];
     *  |
     * _0 := z.ast.oclAsType(target::D)
     *   ;
     * _1 := toY.oclAsType(source::Y2)
     *   .ast.oclAsType(target::C).toA2;
     * _0.toA := _1;
     * }
     * 
     */
    protected boolean MAP_uD_0_toA(final /*@NonNull*/ /*@NonInvalid*/ Z z_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_1.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y2_0 = idResolver.getClass(CLSSid_Y2, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_C_0 = idResolver.getClass(CLSSid_C, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_1.getAst();
        final /*@NonNull*/ /*@Thrown*/ D oclAsType = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
        final /*@Nullable*/ /*@Thrown*/ Y toY_0 = z_1.getToY();
        final /*@NonNull*/ /*@Thrown*/ Y2 oclAsType_0 = ClassUtil.nonNullState((Y2)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, toY_0, TYP_source_c_c_Y2_0));
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = oclAsType_0.getAst();
        final /*@NonNull*/ /*@Thrown*/ C oclAsType_1 = ClassUtil.nonNullState((C)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_C_0));
        final /*@Nullable*/ /*@Thrown*/ A2 toA2 = oclAsType_1.getToA2();
        // property assignments
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
     * {_0 : target::D[1];
     * _1 : target::C[?];
     *  |
     * _0 := z.ast.oclAsType(target::D)
     *   ;
     * _1 := if refers = null
     *   then null
     *   else ast.oclAsType(target::D).lookupC(refers)
     *   endif;
     * _0.refsC := _1;
     * }
     * 
     */
    protected boolean MAP_uD_0_refsC(final /*@NonNull*/ /*@NonInvalid*/ Z z_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_2.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_2.getAst();
        // variable assignments
        final /*@NonNull*/ /*@Thrown*/ D oclAsType = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
        final /*@Nullable*/ /*@Thrown*/ PathNameCS refers = z_2.getRefers();
        final /*@Thrown*/ boolean eq = refers == null;
        /*@Nullable*/ /*@Thrown*/ C symbol_2;
        if (eq) {
            symbol_2 = null;
        }
        else {
            final /*@NonNull*/ /*@Thrown*/ D self_1 = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
            final /*@Nullable*/ /*@Thrown*/ PathNameCS pathName = z_2.getRefers();
            if (pathName == null) {
                throwNull(z_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathNameCS::path\'");
            }
            final /*@NonNull*/ /*@Thrown*/ List<PathElementCS> pathSeq_0 = pathName.getPath();
            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_pathSeq_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, pathSeq_0);
            final /*@NonNull*/ /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
            final /*@Thrown*/ boolean eq_0 = size.equals(INT_1);
            /*@Nullable*/ /*@Thrown*/ C symbol_1;
            if (eq_0) {
                final /*@Nullable*/ /*@Thrown*/ PathElementCS path = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
                if (path == null) {
                    throwNull(z_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                }
                final /*@NonNull*/ /*@Thrown*/ String name = path.getName();
                LookupResult<C> _lookupResult = lookupResolver.lookupC(self_1, name, ValueUtil.FALSE_VALUE);
                C _lookupC = null;
                if (_lookupResult.size() == 1) {
                    _lookupC = _lookupResult.getSingleResult();
                } else {
                    handleLookupError(path,name);
                };
                symbol_1 = _lookupC;
            }
            else {
                final /*@NonNull*/ /*@Thrown*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue subOrderedSet = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_pathSeq_0, INT_1, diff);
                final List<PathElementCS> UNBOXED_subOrderedSet = subOrderedSet.asEcoreObjects(idResolver, PathElementCS.class);
                assert UNBOXED_subOrderedSet != null;
                final /*@Nullable*/ /*@Thrown*/ Namespace lookupNamespace = this.lookupNamespace(self_1, UNBOXED_subOrderedSet);
                /*@Nullable*/ /*@Caught*/ Object CAUGHT_lookupNamespace;
                try {
                    CAUGHT_lookupNamespace = lookupNamespace;
                }
                catch (Exception e) {
                    CAUGHT_lookupNamespace = ValueUtil.createInvalidValue(e);
                }
                final /*@NonNull*/ /*@NonInvalid*/ Object symbol_0 = CAUGHT_lookupNamespace == null;
                /*@Nullable*/ /*@Thrown*/ C safe_lookupLocalC_source;
                if (symbol_0 == Boolean.TRUE) {
                    safe_lookupLocalC_source = null;
                }
                else {
                    final /*@Nullable*/ /*@Thrown*/ Namespace self_2 = this.lookupNamespace(self_1, UNBOXED_subOrderedSet);
                    final /*@Nullable*/ /*@Thrown*/ PathElementCS path_0 = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
                    if (path_0 == null) {
                        throwNull(z_2, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                    }
                    final /*@NonNull*/ /*@Thrown*/ String name_0 = path_0.getName();
                    LookupResult<C> _lookupResult_0 = lookupResolver.lookupC(self_2, name_0, ValueUtil.TRUE_VALUE);
                    C _lookupC_0 = null;
                    if (_lookupResult_0.size() == 1) {
                        _lookupC_0 = _lookupResult_0.getSingleResult();
                    } else {
                        handleLookupError(path_0,name_0);
                    };
                    safe_lookupLocalC_source = _lookupC_0;
                }
                symbol_1 = safe_lookupLocalC_source;
            }
            symbol_2 = symbol_1;
        }
        // property assignments
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
     * {_0 : target::D[1];
     * _1 : target::A1[?];
     *  |
     * _0 := z.ast.oclAsType(target::D)
     *   ;
     * _1 := toY.oclAsType(source::Y1)
     *   .ast.oclAsType(target::B).toA1;
     * _0.toA := _1;
     * }
     * 
     */
    protected boolean MAP_uD_1_toA(final /*@NonNull*/ /*@NonInvalid*/ Z z_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_3.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_1 = idResolver.getClass(CLSSid_Y1, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_B_0 = idResolver.getClass(CLSSid_B, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        // variable assignments
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_3.getAst();
        final /*@NonNull*/ /*@Thrown*/ D oclAsType = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
        final /*@Nullable*/ /*@Thrown*/ Y toY_0 = z_3.getToY();
        final /*@NonNull*/ /*@Thrown*/ Y1 oclAsType_0 = ClassUtil.nonNullState((Y1)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, toY_0, TYP_source_c_c_Y1_1));
        final /*@Nullable*/ /*@Thrown*/ EObject ast_0 = oclAsType_0.getAst();
        final /*@NonNull*/ /*@Thrown*/ B oclAsType_1 = ClassUtil.nonNullState((B)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_target_c_c_B_0));
        final /*@Nullable*/ /*@Thrown*/ A1 toA1 = oclAsType_1.getToA1();
        // property assignments
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
     * {_0 : target::D[1];
     * _1 : target::B[?];
     *  |
     * _0 := z.ast.oclAsType(target::D)
     *   ;
     * _1 := if refers = null
     *   then null
     *   else ast.oclAsType(target::D).lookupB(refers)
     *   endif;
     * _0.refsB := _1;
     * }
     * 
     */
    protected boolean MAP_uD_1_refsB(final /*@NonNull*/ /*@NonInvalid*/ Z z_4) throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_0 = idResolver.getClass(CLSSid_Y1, null);
        final /*@Nullable*/ /*@Thrown*/ Y toY = z_4.getToY();
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, toY, TYP_source_c_c_Y1_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_target_c_c_D_0 = idResolver.getClass(CLSSid_D, null);
        final /*@Nullable*/ /*@Thrown*/ EObject ast = z_4.getAst();
        // variable assignments
        final /*@NonNull*/ /*@Thrown*/ D oclAsType = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
        final /*@Nullable*/ /*@Thrown*/ PathNameCS refers = z_4.getRefers();
        final /*@Thrown*/ boolean eq = refers == null;
        /*@Nullable*/ /*@Thrown*/ B symbol_2;
        if (eq) {
            symbol_2 = null;
        }
        else {
            final /*@NonNull*/ /*@Thrown*/ D self_1 = ClassUtil.nonNullState((D)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_target_c_c_D_0));
            final /*@Nullable*/ /*@Thrown*/ PathNameCS pathName = z_4.getRefers();
            if (pathName == null) {
                throwNull(z_4, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathNameCS::path\'");
            }
            final /*@NonNull*/ /*@Thrown*/ List<PathElementCS> pathSeq_0 = pathName.getPath();
            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_pathSeq_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElementCS, pathSeq_0);
            final /*@NonNull*/ /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
            final /*@Thrown*/ boolean eq_0 = size.equals(INT_1);
            /*@Nullable*/ /*@Thrown*/ B symbol_1;
            if (eq_0) {
                final /*@Nullable*/ /*@Thrown*/ PathElementCS path = (PathElementCS)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
                if (path == null) {
                    throwNull(z_4, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                }
                final /*@NonNull*/ /*@Thrown*/ String name = path.getName();
                LookupResult<B> _lookupResult = lookupResolver.lookupB(self_1, name, ValueUtil.FALSE_VALUE);
                B _lookupB = null;
                if (_lookupResult.size() == 1) {
                    _lookupB = _lookupResult.getSingleResult();
                } else {
                    handleLookupError(path,name);
                };
                symbol_1 = _lookupB;
            }
            else {
                final /*@NonNull*/ /*@Thrown*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, INT_1);
                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue subOrderedSet = OrderedSetSubOrderedSetOperation.INSTANCE.evaluate(BOXED_pathSeq_0, INT_1, diff);
                final List<PathElementCS> UNBOXED_subOrderedSet = subOrderedSet.asEcoreObjects(idResolver, PathElementCS.class);
                assert UNBOXED_subOrderedSet != null;
                final /*@Nullable*/ /*@Thrown*/ Namespace lookupNamespace = this.lookupNamespace(self_1, UNBOXED_subOrderedSet);
                /*@Nullable*/ /*@Caught*/ Object CAUGHT_lookupNamespace;
                try {
                    CAUGHT_lookupNamespace = lookupNamespace;
                }
                catch (Exception e) {
                    CAUGHT_lookupNamespace = ValueUtil.createInvalidValue(e);
                }
                final /*@NonNull*/ /*@NonInvalid*/ Object symbol_0 = CAUGHT_lookupNamespace == null;
                /*@Nullable*/ /*@Thrown*/ B safe_lookupLocalB_source;
                if (symbol_0 == Boolean.TRUE) {
                    safe_lookupLocalB_source = null;
                }
                else {
                    final /*@Nullable*/ /*@Thrown*/ Namespace self_2 = this.lookupNamespace(self_1, UNBOXED_subOrderedSet);
                    final /*@Nullable*/ /*@Thrown*/ PathElementCS path_0 = (PathElementCS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq_0);
                    if (path_0 == null) {
                        throwNull(z_4, "Null source for \'\'http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0\'::PathElementCS::name\'");
                    }
                    final /*@NonNull*/ /*@Thrown*/ String name_0 = path_0.getName();
                    LookupResult<B> _lookupResult_0 = lookupResolver.lookupB(self_2, name_0, ValueUtil.TRUE_VALUE);
                    B _lookupB_0 = null;
                    if (_lookupResult_0.size() == 1) {
                        _lookupB_0 = _lookupResult_0.getSingleResult();
                    } else {
                        handleLookupError(path_0,name_0);
                    };
                    safe_lookupLocalB_source = _lookupB_0;
                }
                symbol_1 = safe_lookupLocalB_source;
            }
            symbol_2 = symbol_1;
        }
        // property assignments
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
     * for _sRoot_SRoot : source::SRoot in source::SRoot.allInstances()
     *    {
     * map cSRoot_2_TRoot {
     * sRoot := _sRoot_SRoot;
     * }}
     *   for _x_X : source::X in source::X.allInstances()
     *    {
     * map cX_2_A3 {
     * x := _x_X;
     * }}
     *   for _x_X : source::X in source::X.allInstances()
     *    {
     * map cX_2_A2 {
     * x := _x_X;
     * }}
     *   for _x_X : source::X in source::X.allInstances()
     *    {
     * map cX_2_A1 {
     * x := _x_X;
     * }}
     *   for _y1_Y1 : source::Y1 in source::Y1.allInstances()
     *    {
     * map cY1_2_B {
     * y1 := _y1_Y1;
     * }}
     *   for _y2_Y2 : source::Y2 in source::Y2.allInstances()
     *    {
     * map cY2_2_C {
     * y2 := _y2_Y2;
     * }}
     *   for _z_Z : source::Z in source::Z.allInstances()
     *    {
     * map cZ_2_D_1 {
     * z := _z_Z;
     * }}
     *   for _z_Z : source::Z in source::Z.allInstances()
     *    {
     * map cZ_2_D_0 {
     * z := _z_Z;
     * }}
     *   for _sRoot_SRoot : source::SRoot in source::SRoot.allInstances()
     *    {
     * map uTRoot_ownedA {
     * sRoot := _sRoot_SRoot;
     * }}
     *   for _x_X : source::X in source::X.allInstances()
     *    {
     * map uA3_ownsC {
     * x := _x_X;
     * }}
     *   for _x_X : source::X in source::X.allInstances()
     *    {
     * map uA2_ownsC {
     * x := _x_X;
     * }}
     *   for _x_X : source::X in source::X.allInstances()
     *    {
     * map uA1_ownsB {
     * x := _x_X;
     * }}
     *   for _y1_Y1 : source::Y1 in source::Y1.allInstances()
     *    {
     * map uB_ownsD {
     * y1 := _y1_Y1;
     * }}
     *   for _z_Z : source::Z in source::Z.allInstances()
     *    {
     * map uD_1_toA {
     * z := _z_Z;
     * }}
     *   for _y2_Y2 : source::Y2 in source::Y2.allInstances()
     *    {
     * map uC_ownsD {
     * y2 := _y2_Y2;
     * }}
     *   for _z_Z : source::Z in source::Z.allInstances()
     *    {
     * map uD_0_toA {
     * z := _z_Z;
     * }}
     *   for _z_Z : source::Z in source::Z.allInstances()
     *    {
     * map uD_0_refsC {
     * z := _z_Z;
     * }}
     *   for _z_Z : source::Z in source::Z.allInstances()
     *    {
     * map uD_1_refsB {
     * z := _z_Z;
     * }}
     */
    protected boolean MAP___root__() throws ReflectiveOperationException {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_SRoot_1 = idResolver.getClass(CLSSid_SRoot, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_X_5 = idResolver.getClass(CLSSid_X, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y1_1 = idResolver.getClass(CLSSid_Y1, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Y2_1 = idResolver.getClass(CLSSid_Y2, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_source_c_c_Z_5 = idResolver.getClass(CLSSid_Z, null);
        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances_7 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_SRoot, TYP_source_c_c_SRoot_1);
        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances_1 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_X, TYP_source_c_c_X_5);
        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances_11 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_Y1, TYP_source_c_c_Y1_1);
        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances_13 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_Y2, TYP_source_c_c_Y2_1);
        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances_6 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_Z, TYP_source_c_c_Z_5);
        // mapping statements
        for (SRoot _sRoot_SRoot : ValueUtil.typedIterable(SRoot.class, allInstances_7)) {
            if (_sRoot_SRoot != null) {
                final /*@NonNull*/ /*@NonInvalid*/ SRoot symbol_0 = (SRoot)_sRoot_SRoot;
                MAP_cSRoot_2_TRoot(symbol_0);
            }
        }
        for (X _x_X : ValueUtil.typedIterable(X.class, allInstances_1)) {
            if (_x_X != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_2 = (X)_x_X;
                MAP_cX_2_A3(symbol_2);
            }
        }
        for (X _x_X_0 : ValueUtil.typedIterable(X.class, allInstances_1)) {
            if (_x_X_0 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_4 = (X)_x_X_0;
                MAP_cX_2_A2(symbol_4);
            }
        }
        for (X _x_X_1 : ValueUtil.typedIterable(X.class, allInstances_1)) {
            if (_x_X_1 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_6 = (X)_x_X_1;
                MAP_cX_2_A1(symbol_6);
            }
        }
        for (Y1 _y1_Y1 : ValueUtil.typedIterable(Y1.class, allInstances_11)) {
            if (_y1_Y1 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y1 symbol_8 = (Y1)_y1_Y1;
                MAP_cY1_2_B(symbol_8);
            }
        }
        for (Y2 _y2_Y2 : ValueUtil.typedIterable(Y2.class, allInstances_13)) {
            if (_y2_Y2 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y2 symbol_10 = (Y2)_y2_Y2;
                MAP_cY2_2_C(symbol_10);
            }
        }
        for (Z _z_Z : ValueUtil.typedIterable(Z.class, allInstances_6)) {
            if (_z_Z != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_12 = (Z)_z_Z;
                MAP_cZ_2_D_1(symbol_12);
            }
        }
        for (Z _z_Z_0 : ValueUtil.typedIterable(Z.class, allInstances_6)) {
            if (_z_Z_0 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_14 = (Z)_z_Z_0;
                MAP_cZ_2_D_0(symbol_14);
            }
        }
        for (SRoot _sRoot_SRoot_0 : ValueUtil.typedIterable(SRoot.class, allInstances_7)) {
            if (_sRoot_SRoot_0 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ SRoot symbol_16 = (SRoot)_sRoot_SRoot_0;
                MAP_uTRoot_ownedA(symbol_16);
            }
        }
        for (X _x_X_2 : ValueUtil.typedIterable(X.class, allInstances_1)) {
            if (_x_X_2 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_18 = (X)_x_X_2;
                MAP_uA3_ownsC(symbol_18);
            }
        }
        for (X _x_X_3 : ValueUtil.typedIterable(X.class, allInstances_1)) {
            if (_x_X_3 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_20 = (X)_x_X_3;
                MAP_uA2_ownsC(symbol_20);
            }
        }
        for (X _x_X_4 : ValueUtil.typedIterable(X.class, allInstances_1)) {
            if (_x_X_4 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ X symbol_22 = (X)_x_X_4;
                MAP_uA1_ownsB(symbol_22);
            }
        }
        for (Y1 _y1_Y1_0 : ValueUtil.typedIterable(Y1.class, allInstances_11)) {
            if (_y1_Y1_0 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y1 symbol_24 = (Y1)_y1_Y1_0;
                MAP_uB_ownsD(symbol_24);
            }
        }
        for (Z _z_Z_1 : ValueUtil.typedIterable(Z.class, allInstances_6)) {
            if (_z_Z_1 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_26 = (Z)_z_Z_1;
                MAP_uD_1_toA(symbol_26);
            }
        }
        for (Y2 _y2_Y2_0 : ValueUtil.typedIterable(Y2.class, allInstances_13)) {
            if (_y2_Y2_0 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Y2 symbol_28 = (Y2)_y2_Y2_0;
                MAP_uC_ownsD(symbol_28);
            }
        }
        for (Z _z_Z_2 : ValueUtil.typedIterable(Z.class, allInstances_6)) {
            if (_z_Z_2 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_30 = (Z)_z_Z_2;
                MAP_uD_0_toA(symbol_30);
            }
        }
        for (Z _z_Z_3 : ValueUtil.typedIterable(Z.class, allInstances_6)) {
            if (_z_Z_3 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_32 = (Z)_z_Z_3;
                MAP_uD_0_refsC(symbol_32);
            }
        }
        for (Z _z_Z_4 : ValueUtil.typedIterable(Z.class, allInstances_6)) {
            if (_z_Z_4 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ Z symbol_34 = (Z)_z_Z_4;
                MAP_uD_1_refsB(symbol_34);
            }
        }
        return true;
    }
}
