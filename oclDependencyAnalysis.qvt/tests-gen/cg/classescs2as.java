/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package cg;

import classes.Class;
import classes.ClassesFactory;
import classes.ClassesPackage;
import classes.Package;
import classes.Root;
import classescs.ClassCS;
import classescs.ClassescsPackage;
import classescs.PackageCS;
import classescs.RootCS;
import classescstraces.ClassCS2Class;
import classescstraces.ClassescstracesFactory;
import classescstraces.ClassescstracesPackage;
import classescstraces.PackageCS2Package;
import classescstraces.RootCS2Root;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.AbstractTransformation;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.ids.ClassId;
import org.eclipse.ocl.examples.domain.ids.CollectionTypeId;
import org.eclipse.ocl.examples.domain.ids.IdManager;
import org.eclipse.ocl.examples.domain.ids.NsURIPackageId;
import org.eclipse.ocl.examples.domain.ids.TypeId;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation;

/**
 * The classescs2as transformation:
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
public class classescs2as extends AbstractTransformation
{
    public static final @NonNull /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_ocldependencyanalysis_s_classes_s_1_0 = IdManager.getNsURIPackageId("http://ocldependencyanalysis/classes/1.0", "classes", ClassesPackage.eINSTANCE);
    public static final @NonNull /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_ocldependencyanalysis_s_classescs_s_1_0 = IdManager.getNsURIPackageId("http://ocldependencyanalysis/classescs/1.0", null, ClassescsPackage.eINSTANCE);
    public static final @NonNull /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_tracesmodel_s_1_0_s_classescstraces = IdManager.getNsURIPackageId("http://tracesmodel/1.0/classescstraces", "classescstraces", ClassescstracesPackage.eINSTANCE);
    public static final @NonNull /*@NonInvalid*/ CollectionTypeId SET_PRIMid_OclSelf = TypeId.SET.getSpecializedId(TypeId.OCL_SELF);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_Class = PACKid_http_c_s_s_ocldependencyanalysis_s_classes_s_1_0.getClassId("Class", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_ClassCS = PACKid_http_c_s_s_ocldependencyanalysis_s_classescs_s_1_0.getClassId("ClassCS", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_ClassCS2Class = PACKid_http_c_s_s_tracesmodel_s_1_0_s_classescstraces.getClassId("ClassCS2Class", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_Package = PACKid_http_c_s_s_ocldependencyanalysis_s_classes_s_1_0.getClassId("Package", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_PackageCS = PACKid_http_c_s_s_ocldependencyanalysis_s_classescs_s_1_0.getClassId("PackageCS", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_PackageCS2Package = PACKid_http_c_s_s_tracesmodel_s_1_0_s_classescstraces.getClassId("PackageCS2Package", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_Root = PACKid_http_c_s_s_ocldependencyanalysis_s_classes_s_1_0.getClassId("Root", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_RootCS = PACKid_http_c_s_s_ocldependencyanalysis_s_classescs_s_1_0.getClassId("RootCS", 0);
    public static final @NonNull /*@NonInvalid*/ ClassId CLSSid_RootCS2Root = PACKid_http_c_s_s_tracesmodel_s_1_0_s_classescstraces.getClassId("RootCS2Root", 0);
    public static final @NonNull /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ClassCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ClassCS);
    public static final @NonNull /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Class = TypeId.SEQUENCE.getSpecializedId(CLSSid_Class);
    
    /* Outer-to-Middle Property navigation caches */
    protected final @NonNull Map<ClassCS,ClassCS2Class> OPPOSITE_OF_ClassCS2Class_classCS = new HashMap<ClassCS,ClassCS2Class>();
    protected final @NonNull Map<PackageCS,PackageCS2Package> OPPOSITE_OF_PackageCS2Package_packageCS = new HashMap<PackageCS,PackageCS2Package>();
    protected final @NonNull Map<RootCS,RootCS2Root> OPPOSITE_OF_RootCS2Root_rootCS = new HashMap<RootCS,RootCS2Root>();
    
    public classescs2as(final @NonNull DomainEvaluator evaluator) {
        super(evaluator, new String[] {"leftCS", "rightAS", "middle"});
    }
    
    public boolean run() {
        final EClass ECLASS_classCS = ClassescsPackage.Literals.CLASS_CS;
        assert ECLASS_classCS != null;
        List<? extends ClassCS> LIST_classCS = getObjectsByType(ClassCS.class, 0/*leftCS*/, ECLASS_classCS);
        for (ClassCS classCS : LIST_classCS) {
            if (classCS != null) {
                mClassCS2Class_LM(classCS);
            }
        }
        return true;
    }
    
    /**
     * 
     * map mClassCS2Class_LM in classescs2as) {
     * leftCS (classCS : classescs::ClassCS;
     *  |
     * )
     * { |
     * }
     * middle ( |
     * )
     * {realize c2c : classescstraces::ClassCS2Class;
     *  |
     * }
     * where ( |
     * )
     * { |
     * }
     * 
     * }
     */
    protected boolean mClassCS2Class_LM(final @NonNull /*@NonInvalid*/ ClassCS classCS) {
        try {
            // predicates
            // creations
            final /*@Thrown*/ ClassCS2Class c2c = ClassescstracesFactory.eINSTANCE.createClassCS2Class();
            assert c2c != null;
            modelObjects[2/*middle*/].add(c2c);
            // assignments
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map mRootCS2Root_LM in classescs2as) {
     * leftCS (rootCS : classescs::RootCS;
     *  |
     * )
     * { |
     * }
     * middle ( |
     * )
     * {realize r2r : classescstraces::RootCS2Root;
     *  |
     * }
     * where ( |
     * )
     * { |
     * }
     * 
     * }
     */
    protected boolean mRootCS2Root_LM(final @NonNull /*@NonInvalid*/ RootCS rootCS) {
        try {
            // predicates
            // creations
            final /*@Thrown*/ RootCS2Root r2r = ClassescstracesFactory.eINSTANCE.createRootCS2Root();
            assert r2r != null;
            modelObjects[2/*middle*/].add(r2r);
            // assignments
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map mPackageCS2Package_LM in classescs2as) {
     * leftCS (packageCS : classescs::PackageCS;
     *  |
     * )
     * { |
     * }
     * middle ( |
     * )
     * {realize p2p : classescstraces::PackageCS2Package;
     *  |
     * }
     * where ( |
     * )
     * { |
     * }
     * 
     * }
     */
    protected boolean mPackageCS2Package_LM(final @NonNull /*@NonInvalid*/ PackageCS packageCS) {
        try {
            // predicates
            // creations
            final /*@Thrown*/ PackageCS2Package p2p = ClassescstracesFactory.eINSTANCE.createPackageCS2Package();
            assert p2p != null;
            modelObjects[2/*middle*/].add(p2p);
            // assignments
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map mClassCS2Class_MR in classescs2as) {
     * middle (c2c : classescstraces::ClassCS2Class;
     *  |
     * )
     * { |
     * }
     * rightAS ( |
     * )
     * {realize class : classes::Class;
     *  |
     * }
     * where ( |
     * )
     * { |
     * }
     * 
     * }
     */
    protected boolean mClassCS2Class_MR(final @NonNull /*@NonInvalid*/ ClassCS2Class c2c) {
        try {
            // predicates
            // creations
            final /*@Thrown*/ Class class = ClassesFactory.eINSTANCE.createClass();
            assert class != null;
            modelObjects[1/*rightAS*/].add(class);
            // assignments
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map mRootCS2Root_MR in classescs2as) {
     * middle (r2r : classescstraces::RootCS2Root;
     *  |
     * )
     * { |
     * }
     * rightAS ( |
     * )
     * {realize root : classes::Root;
     *  |
     * }
     * where ( |
     * )
     * { |
     * }
     * 
     * }
     */
    protected boolean mRootCS2Root_MR(final @NonNull /*@NonInvalid*/ RootCS2Root r2r) {
        try {
            // predicates
            // creations
            final /*@Thrown*/ Root root = ClassesFactory.eINSTANCE.createRoot();
            assert root != null;
            modelObjects[1/*rightAS*/].add(root);
            // assignments
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map mPackageCS2Package_MR in classescs2as) {
     * middle (p2p : classescstraces::PackageCS2Package;
     *  |
     * )
     * { |
     * }
     * rightAS ( |
     * )
     * {realize package : classes::Package;
     *  |
     * }
     * where ( |
     * )
     * { |
     * }
     * 
     * }
     */
    protected boolean mPackageCS2Package_MR(final @NonNull /*@NonInvalid*/ PackageCS2Package p2p) {
        try {
            // predicates
            // creations
            final /*@Thrown*/ Package package = ClassesFactory.eINSTANCE.createPackage();
            assert package != null;
            modelObjects[1/*rightAS*/].add(package);
            // assignments
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map uClass_name in classescs2as) {
     * rightAS (class : classes::Class;
     *  |
     * )
     * { |
     * }
     * leftCS (classCS : classescs::ClassCS;
     *  |
     * )
     * { |
     * }
     * where ( |
     * classCS.ClassCS2Class.class = class)
     * { |
     * class = name;
     * }
     * 
     * }
     */
    protected boolean uClass_name(final @NonNull /*@NonInvalid*/ Class symbol_0, final @NonNull /*@NonInvalid*/ ClassCS classCS_0) {
        try {
            // predicates
            final @NonNull /*@Thrown*/ ClassCS2Class ClassCS2Class = DomainUtil.nonNullState (OPPOSITE_OF_ClassCS2Class_classCS.get(classCS_0));
            final @Nullable /*@Thrown*/ Class symbol_3 = ClassCS2Class.getClass_();
            final /*@Thrown*/ boolean eq = symbol_0.equals(symbol_3);
            if (!eq) {
                return false;
            }
            // creations
            // assignments
            final @Nullable /*@Thrown*/ String name = classCS_0.getName();
            symbol_0.setName(name);
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map uRoot_ownedPackages in classescs2as) {
     * rightAS (root : classes::Root;
     *  |
     * )
     * { |
     * }
     * leftCS (rootCS : classescs::RootCS;
     *  |
     * )
     * { |
     * }
     * where ( |
     * rootCS.RootCS2Root.root = root)
     * { |
     * root = ownedPackage.PackageCS2Package.package;
     * }
     * 
     * }
     */
    protected boolean uRoot_ownedPackages(final @NonNull /*@NonInvalid*/ Root root, final @NonNull /*@NonInvalid*/ RootCS rootCS_0) {
        try {
            // predicates
            final @NonNull /*@Thrown*/ RootCS2Root RootCS2Root = DomainUtil.nonNullState (OPPOSITE_OF_RootCS2Root_rootCS.get(rootCS_0));
            final @Nullable /*@Thrown*/ Root root_0 = RootCS2Root.getRoot();
            final /*@Thrown*/ boolean eq = root.equals(root_0);
            if (!eq) {
                return false;
            }
            // creations
            // assignments
            final @Nullable /*@Thrown*/ PackageCS ownedPackage = rootCS_0.getOwnedPackage();
            if (ownedPackage == null) {
                throw new InvalidValueException("Null source for \'classescstraces::PackageCS2Package::packageCS\'");
            }
            final @NonNull /*@Thrown*/ PackageCS2Package PackageCS2Package = DomainUtil.nonNullState (OPPOSITE_OF_PackageCS2Package_packageCS.get(ownedPackage));
            final @Nullable /*@Thrown*/ Package symbol_3 = PackageCS2Package.getPackage();
            root.getOwnedPackages().addAll(symbol_3);
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map uPackage_name in classescs2as) {
     * rightAS (package : classes::Package;
     *  |
     * )
     * { |
     * }
     * leftCS (packageCS : classescs::PackageCS;
     *  |
     * )
     * { |
     * }
     * where ( |
     * packageCS.PackageCS2Package.package = package)
     * { |
     * package = name;
     * }
     * 
     * }
     */
    protected boolean uPackage_name(final @NonNull /*@NonInvalid*/ Package symbol_1, final @NonNull /*@NonInvalid*/ PackageCS packageCS_0) {
        try {
            // predicates
            final @NonNull /*@Thrown*/ PackageCS2Package PackageCS2Package = DomainUtil.nonNullState (OPPOSITE_OF_PackageCS2Package_packageCS.get(packageCS_0));
            final @Nullable /*@Thrown*/ Package symbol_3 = PackageCS2Package.getPackage();
            final /*@Thrown*/ boolean eq = symbol_1.equals(symbol_3);
            if (!eq) {
                return false;
            }
            // creations
            // assignments
            final @Nullable /*@Thrown*/ String name = packageCS_0.getName();
            symbol_1.setName(name);
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map uPackage_ownedClasses in classescs2as) {
     * rightAS (package : classes::Package;
     *  |
     * )
     * { |
     * }
     * leftCS (packageCS : classescs::PackageCS;
     *  |
     * )
     * { |
     * }
     * where ( |
     * packageCS.PackageCS2Package.package = package)
     * { |
     * package = ownedClasses.ClassCS2Class.class;
     * }
     * 
     * }
     */
    protected boolean uPackage_ownedClasses(final @NonNull /*@NonInvalid*/ Package symbol_2, final @NonNull /*@NonInvalid*/ PackageCS packageCS_1) {
        try {
            // predicates
            final @NonNull /*@Thrown*/ PackageCS2Package PackageCS2Package = DomainUtil.nonNullState (OPPOSITE_OF_PackageCS2Package_packageCS.get(packageCS_1));
            final @Nullable /*@Thrown*/ Package symbol_3 = PackageCS2Package.getPackage();
            final /*@Thrown*/ boolean eq = symbol_2.equals(symbol_3);
            if (!eq) {
                return false;
            }
            final @NonNull /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
            // creations
            // assignments
            final @Nullable /*@Thrown*/ List<ClassCS> ownedClasses = packageCS_1.getOwnedClasses();
            assert ownedClasses != null;
            final @NonNull /*@Thrown*/ OrderedSetValue BOXED_ownedClasses = idResolver.createOrderedSetOfAll(ORD_CLSSid_ClassCS, ownedClasses);
            @NonNull /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Class);
            @Nullable Iterator<?> ITERATOR__1 = BOXED_ownedClasses.iterator();
            @NonNull /*@Thrown*/ SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator;
                    break;
                }
                @Nullable /*@NonInvalid*/ ClassCS _1 = (ClassCS)ITERATOR__1.next();
                /**
                 * ClassCS2Class.class
                 */
                if (_1 == null) {
                    throw new InvalidValueException("Null source for \'classescstraces::ClassCS2Class::classCS\'");
                }
                final @NonNull /*@Thrown*/ ClassCS2Class ClassCS2Class = DomainUtil.nonNullState (OPPOSITE_OF_ClassCS2Class_classCS.get(_1));
                final @Nullable /*@Thrown*/ Class symbol_4 = ClassCS2Class.getClass_();
                //
                accumulator.add(symbol_4);
            }
            final List<Class> UNBOXED_collect = collect.asEcoreObjects(idResolver, Class.class);
            assert UNBOXED_collect != null;
            symbol_2.getOwnedClasses().addAll(UNBOXED_collect);
            // mapping statements
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    /**
     * 
     * map __root__ in classescs2as) {
     * 
     *   where ( |
     * )
     * { |
     * }
     * for packageCS : classescs::PackageCS in classescs::PackageCS.allInstances()
     *    {
     * map mPackageCS2Package_LM {
     * packageCS := packageCS;
     * }}
     *   for p2p : classescstraces::PackageCS2Package in classescstraces::PackageCS2Package.allInstances()
     *    {
     * map mPackageCS2Package_MR {
     * p2p := p2p;
     * }}
     *   for package : classes::Package in classes::Package.allInstances()
     *    {
     * 
     *     for packageCS : classescs::PackageCS in classescs::PackageCS.allInstances()
     *      {
     * map uPackage_name {
     * packageCS := packageCS;
     * package := package;
     * }}}
     *   for package : classes::Package in classes::Package.allInstances()
     *    {
     * 
     *     for packageCS : classescs::PackageCS in classescs::PackageCS.allInstances()
     *      {
     * 
     *       map uPackage_ownedClasses {
     * packageCS := packageCS;
     * package := package;
     * }}}
     *   for classCS : classescs::ClassCS in classescs::ClassCS.allInstances()
     *    {
     * map mClassCS2Class_LM {
     * classCS := classCS;
     * }}
     *   for c2c : classescstraces::ClassCS2Class in classescstraces::ClassCS2Class.allInstances()
     *    {
     * map mClassCS2Class_MR {
     * c2c := c2c;
     * }}
     *   for class : classes::Class in classes::Class.allInstances()
     *    {
     * 
     *     for classCS : classescs::ClassCS in classescs::ClassCS.allInstances()
     *      {
     * map uClass_name {
     * classCS := classCS;
     * class := class;
     * }}}
     *   for rootCS : classescs::RootCS in classescs::RootCS.allInstances()
     *    {
     * map mRootCS2Root_LM {
     * rootCS := rootCS;
     * }}
     *   for r2r : classescstraces::RootCS2Root in classescstraces::RootCS2Root.allInstances()
     *    {
     * map mRootCS2Root_MR {
     * r2r := r2r;
     * }}
     *   for root : classes::Root in classes::Root.allInstances()
     *    {
     * 
     *     for rootCS : classescs::RootCS in classescs::RootCS.allInstances()
     *      {
     * map uRoot_ownedPackages {
     * rootCS := rootCS;
     * root := root;
     * }}}
     * }
     */
    protected boolean __root__() {
        try {
            // predicates
            final @NonNull /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
            final @NonNull /*@NonInvalid*/ DomainType TYP_classes_c_c_Class_0 = idResolver.getType(CLSSid_Class, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classes_c_c_Package_1 = idResolver.getType(CLSSid_Package, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classes_c_c_Root_0 = idResolver.getType(CLSSid_Root, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classescs_c_c_ClassCS_0 = idResolver.getType(CLSSid_ClassCS, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classescs_c_c_PackageCS_0 = idResolver.getType(CLSSid_PackageCS, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classescs_c_c_RootCS_0 = idResolver.getType(CLSSid_RootCS, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classescstraces_c_c_ClassCS2Class_0 = idResolver.getType(CLSSid_ClassCS2Class, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classescstraces_c_c_PackageCS2Package_0 = idResolver.getType(CLSSid_PackageCS2Package, null);
            final @NonNull /*@NonInvalid*/ DomainType TYP_classescstraces_c_c_RootCS2Root_0 = idResolver.getType(CLSSid_RootCS2Root, null);
            final @NonNull /*@Thrown*/ SetValue allInstances_3 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classes_c_c_Package_1);
            final @NonNull /*@Thrown*/ SetValue allInstances_5 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classescs_c_c_ClassCS_0);
            final @NonNull /*@Thrown*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classescs_c_c_PackageCS_0);
            final @NonNull /*@Thrown*/ SetValue allInstances_9 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classescs_c_c_RootCS_0);
            final List<? extends Object> UNBOXED_allInstances_3 = allInstances_3.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_3 != null;
            final List<? extends Object> UNBOXED_allInstances_5 = allInstances_5.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_5 != null;
            final List<? extends Object> UNBOXED_allInstances = allInstances.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances != null;
            final List<? extends Object> UNBOXED_allInstances_9 = allInstances_9.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_9 != null;
            // creations
            // assignments
            // mapping statements
            ;
            for (PackageCS packageCS_5 : UNBOXED_allInstances) {
                final @NonNull /*@NonInvalid*/ PackageCS symbol_7 = (PackageCS)packageCS_5;
                mPackageCS2Package_LM(symbol_7);
            }
            final @NonNull /*@Thrown*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classescstraces_c_c_PackageCS2Package_0);
            final List<? extends Object> UNBOXED_allInstances_0 = allInstances_0.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_0 != null;
            ;
            for (PackageCS2Package p2p_1 : UNBOXED_allInstances_0) {
                final @NonNull /*@NonInvalid*/ PackageCS2Package symbol_11 = (PackageCS2Package)p2p_1;
                mPackageCS2Package_MR(symbol_11);
            }
            ;
            for (Package symbol_21 : UNBOXED_allInstances_3) {
                ;
                for (PackageCS packageCS_6 : UNBOXED_allInstances) {
                    final @NonNull /*@NonInvalid*/ Package symbol_16 = (Package)symbol_21;
                    final @NonNull /*@NonInvalid*/ PackageCS symbol_17 = (PackageCS)packageCS_6;
                    uPackage_name(symbol_16, symbol_17);
                }
            }
            ;
            for (Package symbol_29 : UNBOXED_allInstances_3) {
                ;
                for (PackageCS packageCS_7 : UNBOXED_allInstances) {
                    final @NonNull /*@NonInvalid*/ Package symbol_24 = (Package)symbol_29;
                    final @NonNull /*@NonInvalid*/ PackageCS symbol_25 = (PackageCS)packageCS_7;
                    uPackage_ownedClasses(symbol_24, symbol_25);
                }
            }
            ;
            for (ClassCS classCS_3 : UNBOXED_allInstances_5) {
                final @NonNull /*@NonInvalid*/ ClassCS symbol_31 = (ClassCS)classCS_3;
                mClassCS2Class_LM(symbol_31);
            }
            final @NonNull /*@Thrown*/ SetValue allInstances_6 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classescstraces_c_c_ClassCS2Class_0);
            final List<? extends Object> UNBOXED_allInstances_6 = allInstances_6.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_6 != null;
            ;
            for (ClassCS2Class c2c_1 : UNBOXED_allInstances_6) {
                final @NonNull /*@NonInvalid*/ ClassCS2Class symbol_35 = (ClassCS2Class)c2c_1;
                mClassCS2Class_MR(symbol_35);
            }
            final @NonNull /*@Thrown*/ SetValue allInstances_7 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classes_c_c_Class_0);
            final List<? extends Object> UNBOXED_allInstances_7 = allInstances_7.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_7 != null;
            ;
            for (Class symbol_45 : UNBOXED_allInstances_7) {
                ;
                for (ClassCS classCS_4 : UNBOXED_allInstances_5) {
                    final @NonNull /*@NonInvalid*/ Class symbol_40 = (Class)symbol_45;
                    final @NonNull /*@NonInvalid*/ ClassCS symbol_41 = (ClassCS)classCS_4;
                    uClass_name(symbol_40, symbol_41);
                }
            }
            ;
            for (RootCS rootCS_3 : UNBOXED_allInstances_9) {
                final @NonNull /*@NonInvalid*/ RootCS symbol_47 = (RootCS)rootCS_3;
                mRootCS2Root_LM(symbol_47);
            }
            final @NonNull /*@Thrown*/ SetValue allInstances_10 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classescstraces_c_c_RootCS2Root_0);
            final List<? extends Object> UNBOXED_allInstances_10 = allInstances_10.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_10 != null;
            ;
            for (RootCS2Root r2r_1 : UNBOXED_allInstances_10) {
                final @NonNull /*@NonInvalid*/ RootCS2Root symbol_51 = (RootCS2Root)r2r_1;
                mRootCS2Root_MR(symbol_51);
            }
            final @NonNull /*@Thrown*/ SetValue allInstances_11 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_PRIMid_OclSelf, TYP_classes_c_c_Root_0);
            final List<? extends Object> UNBOXED_allInstances_11 = allInstances_11.asEcoreObjects(idResolver, Object.class);
            assert UNBOXED_allInstances_11 != null;
            ;
            for (Root root_1 : UNBOXED_allInstances_11) {
                ;
                for (RootCS rootCS_4 : UNBOXED_allInstances_9) {
                    final @NonNull /*@NonInvalid*/ Root symbol_56 = (Root)root_1;
                    final @NonNull /*@NonInvalid*/ RootCS symbol_57 = (RootCS)rootCS_4;
                    uRoot_ownedPackages(symbol_56, symbol_57);
                }
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
