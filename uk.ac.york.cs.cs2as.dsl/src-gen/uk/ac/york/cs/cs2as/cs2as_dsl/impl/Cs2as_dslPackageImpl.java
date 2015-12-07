/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslFactory;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ResolveExpCS;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cs2as_dslPackageImpl extends EPackageImpl implements Cs2as_dslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classMapStmntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disambiguationSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDisambiguationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDisambiguationStmntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disambiguationDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameResolutionSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultNamedElementDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultNameReferencerDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameQualifierDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classNameResolutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classNameResolutionStmntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualificationDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementsContribExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass occludingDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helpersSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classHelperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resolveExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookupExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionSpecificEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Cs2as_dslPackageImpl()
  {
    super(eNS_URI, Cs2as_dslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Cs2as_dslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Cs2as_dslPackage init()
  {
    if (isInited) return (Cs2as_dslPackage)EPackage.Registry.INSTANCE.getEPackage(Cs2as_dslPackage.eNS_URI);

    // Obtain or create and register package
    Cs2as_dslPackageImpl theCs2as_dslPackage = (Cs2as_dslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cs2as_dslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cs2as_dslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EssentialOCLCSPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCs2as_dslPackage.createPackageContents();

    // Initialize created meta-data
    theCs2as_dslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCs2as_dslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Cs2as_dslPackage.eNS_URI, theCs2as_dslPackage);
    return theCs2as_dslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_CsDecl()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_AsDecl()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_MappingSect()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_DisambiguationSect()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_NameresoSect()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_HelpersSect()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSDecl()
  {
    return csDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSDecl_Metamodels()
  {
    return (EReference)csDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASDecl()
  {
    return asDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getASDecl_Metamodels()
  {
    return (EReference)asDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingSect()
  {
    return mappingSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingSect_Mappings()
  {
    return (EReference)mappingSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassMap()
  {
    return classMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMap_To()
  {
    return (EReference)classMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMap_From()
  {
    return (EReference)classMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassMap_Rule()
  {
    return (EAttribute)classMapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMap_Statements()
  {
    return (EReference)classMapEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassMapStmnt()
  {
    return classMapStmntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyMap()
  {
    return propertyMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyMap_Redefine()
  {
    return (EAttribute)propertyMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyMap_PropName()
  {
    return (EAttribute)propertyMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyMap_PropInit()
  {
    return (EReference)propertyMapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisambiguationSect()
  {
    return disambiguationSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisambiguationSect_Disambiguations()
  {
    return (EReference)disambiguationSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDisambiguation()
  {
    return classDisambiguationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDisambiguation_Class()
  {
    return (EReference)classDisambiguationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDisambiguation_Statements()
  {
    return (EReference)classDisambiguationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDisambiguationStmnt()
  {
    return classDisambiguationStmntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisambiguationDef()
  {
    return disambiguationDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisambiguationDef_Name()
  {
    return (EAttribute)disambiguationDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisambiguationDef_Exp()
  {
    return (EReference)disambiguationDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameResolutionSect()
  {
    return nameResolutionSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_NamedElement()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_NameReferencer()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_NameQualifier()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_NameResolutions()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultNamedElementDef()
  {
    return defaultNamedElementDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultNamedElementDef_NameElement()
  {
    return (EAttribute)defaultNamedElementDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultNamedElementDef_NameProperty()
  {
    return (EReference)defaultNamedElementDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultNameReferencerDef()
  {
    return defaultNameReferencerDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultNameReferencerDef_NameReferencer()
  {
    return (EAttribute)defaultNameReferencerDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultNameReferencerDef_NameProperty()
  {
    return (EReference)defaultNameReferencerDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameQualifierDef()
  {
    return nameQualifierDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameQualifierDef_NameQualifier()
  {
    return (EAttribute)nameQualifierDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameQualifierDef_SegmentsProp()
  {
    return (EReference)nameQualifierDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassNameResolution()
  {
    return classNameResolutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassNameResolution_Class()
  {
    return (EReference)classNameResolutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassNameResolution_Statements()
  {
    return (EReference)classNameResolutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassNameResolutionStmnt()
  {
    return classNameResolutionStmntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElementDef()
  {
    return namedElementDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElementDef_NamePoperty()
  {
    return (EReference)namedElementDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElementDef_Filter()
  {
    return (EReference)namedElementDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElementDef_Qualifications()
  {
    return (EReference)namedElementDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterDef()
  {
    return filterDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterDef_Params()
  {
    return (EReference)filterDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterDef_Expression()
  {
    return (EReference)filterDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualificationDef()
  {
    return qualificationDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualificationDef_QualifiedClass()
  {
    return (EReference)qualificationDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualificationDef_Contribution()
  {
    return (EReference)qualificationDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementsContribExp()
  {
    return elementsContribExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementsContribExp_IsFollowing()
  {
    return (EAttribute)elementsContribExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementsContribExp_IsImported()
  {
    return (EAttribute)elementsContribExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementsContribExp_Expression()
  {
    return (EReference)elementsContribExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScopeDef()
  {
    return scopeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopeDef_SelectionDef()
  {
    return (EReference)scopeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopeDef_SameScope()
  {
    return (EAttribute)scopeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopeDef_EmptyScope()
  {
    return (EAttribute)scopeDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopeDef_AlsoExports()
  {
    return (EAttribute)scopeDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopeDef_Contribution()
  {
    return (EReference)scopeDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopeDef_OccludingDefs()
  {
    return (EReference)scopeDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOccludingDef()
  {
    return occludingDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOccludingDef_Contribution()
  {
    return (EReference)occludingDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionDef()
  {
    return contributionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionDef_Contributions()
  {
    return (EReference)contributionDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionDef()
  {
    return selectionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportDef()
  {
    return exportDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportDef_SelectionDef()
  {
    return (EReference)exportDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportDef_ExportedClass()
  {
    return (EReference)exportDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportDef_Contribution()
  {
    return (EReference)exportDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportDef_OccludingDefs()
  {
    return (EReference)exportDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelpersSect()
  {
    return helpersSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelpersSect_ClassHelpers()
  {
    return (EReference)helpersSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassHelper()
  {
    return classHelperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassHelper_Context()
  {
    return (EReference)classHelperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassHelper_Helpers()
  {
    return (EReference)classHelperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelperDef()
  {
    return helperDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperDef_OwnedSignature()
  {
    return (EReference)helperDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelperDef_Name()
  {
    return (EAttribute)helperDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperDef_Params()
  {
    return (EReference)helperDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperDef_OwnedType()
  {
    return (EReference)helperDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperDef_HelperBody()
  {
    return (EReference)helperDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResolveExpCS()
  {
    return resolveExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLookupExpCS()
  {
    return lookupExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookupExpCS_FromExp()
  {
    return (EAttribute)lookupExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLookupExpCS_Args()
  {
    return (EReference)lookupExpCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionAll()
  {
    return selectionAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionAll_ExceptionProperties()
  {
    return (EReference)selectionAllEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionSpecific()
  {
    return selectionSpecificEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionSpecific_SelectedProperties()
  {
    return (EReference)selectionSpecificEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslFactory getCs2as_dslFactory()
  {
    return (Cs2as_dslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__CS_DECL);
    createEReference(modelEClass, MODEL__AS_DECL);
    createEReference(modelEClass, MODEL__MAPPING_SECT);
    createEReference(modelEClass, MODEL__DISAMBIGUATION_SECT);
    createEReference(modelEClass, MODEL__NAMERESO_SECT);
    createEReference(modelEClass, MODEL__HELPERS_SECT);

    csDeclEClass = createEClass(CS_DECL);
    createEReference(csDeclEClass, CS_DECL__METAMODELS);

    asDeclEClass = createEClass(AS_DECL);
    createEReference(asDeclEClass, AS_DECL__METAMODELS);

    mappingSectEClass = createEClass(MAPPING_SECT);
    createEReference(mappingSectEClass, MAPPING_SECT__MAPPINGS);

    classMapEClass = createEClass(CLASS_MAP);
    createEReference(classMapEClass, CLASS_MAP__TO);
    createEReference(classMapEClass, CLASS_MAP__FROM);
    createEAttribute(classMapEClass, CLASS_MAP__RULE);
    createEReference(classMapEClass, CLASS_MAP__STATEMENTS);

    classMapStmntEClass = createEClass(CLASS_MAP_STMNT);

    propertyMapEClass = createEClass(PROPERTY_MAP);
    createEAttribute(propertyMapEClass, PROPERTY_MAP__REDEFINE);
    createEAttribute(propertyMapEClass, PROPERTY_MAP__PROP_NAME);
    createEReference(propertyMapEClass, PROPERTY_MAP__PROP_INIT);

    disambiguationSectEClass = createEClass(DISAMBIGUATION_SECT);
    createEReference(disambiguationSectEClass, DISAMBIGUATION_SECT__DISAMBIGUATIONS);

    classDisambiguationEClass = createEClass(CLASS_DISAMBIGUATION);
    createEReference(classDisambiguationEClass, CLASS_DISAMBIGUATION__CLASS);
    createEReference(classDisambiguationEClass, CLASS_DISAMBIGUATION__STATEMENTS);

    classDisambiguationStmntEClass = createEClass(CLASS_DISAMBIGUATION_STMNT);

    disambiguationDefEClass = createEClass(DISAMBIGUATION_DEF);
    createEAttribute(disambiguationDefEClass, DISAMBIGUATION_DEF__NAME);
    createEReference(disambiguationDefEClass, DISAMBIGUATION_DEF__EXP);

    nameResolutionSectEClass = createEClass(NAME_RESOLUTION_SECT);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__NAMED_ELEMENT);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__NAME_REFERENCER);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__NAME_QUALIFIER);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__NAME_RESOLUTIONS);

    defaultNamedElementDefEClass = createEClass(DEFAULT_NAMED_ELEMENT_DEF);
    createEAttribute(defaultNamedElementDefEClass, DEFAULT_NAMED_ELEMENT_DEF__NAME_ELEMENT);
    createEReference(defaultNamedElementDefEClass, DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY);

    defaultNameReferencerDefEClass = createEClass(DEFAULT_NAME_REFERENCER_DEF);
    createEAttribute(defaultNameReferencerDefEClass, DEFAULT_NAME_REFERENCER_DEF__NAME_REFERENCER);
    createEReference(defaultNameReferencerDefEClass, DEFAULT_NAME_REFERENCER_DEF__NAME_PROPERTY);

    nameQualifierDefEClass = createEClass(NAME_QUALIFIER_DEF);
    createEAttribute(nameQualifierDefEClass, NAME_QUALIFIER_DEF__NAME_QUALIFIER);
    createEReference(nameQualifierDefEClass, NAME_QUALIFIER_DEF__SEGMENTS_PROP);

    classNameResolutionEClass = createEClass(CLASS_NAME_RESOLUTION);
    createEReference(classNameResolutionEClass, CLASS_NAME_RESOLUTION__CLASS);
    createEReference(classNameResolutionEClass, CLASS_NAME_RESOLUTION__STATEMENTS);

    classNameResolutionStmntEClass = createEClass(CLASS_NAME_RESOLUTION_STMNT);

    namedElementDefEClass = createEClass(NAMED_ELEMENT_DEF);
    createEReference(namedElementDefEClass, NAMED_ELEMENT_DEF__NAME_POPERTY);
    createEReference(namedElementDefEClass, NAMED_ELEMENT_DEF__FILTER);
    createEReference(namedElementDefEClass, NAMED_ELEMENT_DEF__QUALIFICATIONS);

    filterDefEClass = createEClass(FILTER_DEF);
    createEReference(filterDefEClass, FILTER_DEF__PARAMS);
    createEReference(filterDefEClass, FILTER_DEF__EXPRESSION);

    qualificationDefEClass = createEClass(QUALIFICATION_DEF);
    createEReference(qualificationDefEClass, QUALIFICATION_DEF__QUALIFIED_CLASS);
    createEReference(qualificationDefEClass, QUALIFICATION_DEF__CONTRIBUTION);

    elementsContribExpEClass = createEClass(ELEMENTS_CONTRIB_EXP);
    createEAttribute(elementsContribExpEClass, ELEMENTS_CONTRIB_EXP__IS_FOLLOWING);
    createEAttribute(elementsContribExpEClass, ELEMENTS_CONTRIB_EXP__IS_IMPORTED);
    createEReference(elementsContribExpEClass, ELEMENTS_CONTRIB_EXP__EXPRESSION);

    scopeDefEClass = createEClass(SCOPE_DEF);
    createEReference(scopeDefEClass, SCOPE_DEF__SELECTION_DEF);
    createEAttribute(scopeDefEClass, SCOPE_DEF__SAME_SCOPE);
    createEAttribute(scopeDefEClass, SCOPE_DEF__EMPTY_SCOPE);
    createEAttribute(scopeDefEClass, SCOPE_DEF__ALSO_EXPORTS);
    createEReference(scopeDefEClass, SCOPE_DEF__CONTRIBUTION);
    createEReference(scopeDefEClass, SCOPE_DEF__OCCLUDING_DEFS);

    occludingDefEClass = createEClass(OCCLUDING_DEF);
    createEReference(occludingDefEClass, OCCLUDING_DEF__CONTRIBUTION);

    contributionDefEClass = createEClass(CONTRIBUTION_DEF);
    createEReference(contributionDefEClass, CONTRIBUTION_DEF__CONTRIBUTIONS);

    selectionDefEClass = createEClass(SELECTION_DEF);

    exportDefEClass = createEClass(EXPORT_DEF);
    createEReference(exportDefEClass, EXPORT_DEF__SELECTION_DEF);
    createEReference(exportDefEClass, EXPORT_DEF__EXPORTED_CLASS);
    createEReference(exportDefEClass, EXPORT_DEF__CONTRIBUTION);
    createEReference(exportDefEClass, EXPORT_DEF__OCCLUDING_DEFS);

    helpersSectEClass = createEClass(HELPERS_SECT);
    createEReference(helpersSectEClass, HELPERS_SECT__CLASS_HELPERS);

    classHelperEClass = createEClass(CLASS_HELPER);
    createEReference(classHelperEClass, CLASS_HELPER__CONTEXT);
    createEReference(classHelperEClass, CLASS_HELPER__HELPERS);

    helperDefEClass = createEClass(HELPER_DEF);
    createEReference(helperDefEClass, HELPER_DEF__OWNED_SIGNATURE);
    createEAttribute(helperDefEClass, HELPER_DEF__NAME);
    createEReference(helperDefEClass, HELPER_DEF__PARAMS);
    createEReference(helperDefEClass, HELPER_DEF__OWNED_TYPE);
    createEReference(helperDefEClass, HELPER_DEF__HELPER_BODY);

    resolveExpCSEClass = createEClass(RESOLVE_EXP_CS);

    lookupExpCSEClass = createEClass(LOOKUP_EXP_CS);
    createEAttribute(lookupExpCSEClass, LOOKUP_EXP_CS__FROM_EXP);
    createEReference(lookupExpCSEClass, LOOKUP_EXP_CS__ARGS);

    selectionAllEClass = createEClass(SELECTION_ALL);
    createEReference(selectionAllEClass, SELECTION_ALL__EXCEPTION_PROPERTIES);

    selectionSpecificEClass = createEClass(SELECTION_SPECIFIC);
    createEReference(selectionSpecificEClass, SELECTION_SPECIFIC__SELECTED_PROPERTIES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);
    BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    modelEClass.getESuperTypes().add(theEssentialOCLCSPackage.getContextCS());
    propertyMapEClass.getESuperTypes().add(this.getClassMapStmnt());
    disambiguationDefEClass.getESuperTypes().add(this.getClassDisambiguationStmnt());
    namedElementDefEClass.getESuperTypes().add(this.getClassNameResolutionStmnt());
    scopeDefEClass.getESuperTypes().add(this.getClassNameResolutionStmnt());
    exportDefEClass.getESuperTypes().add(this.getClassNameResolutionStmnt());
    resolveExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
    lookupExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
    selectionAllEClass.getESuperTypes().add(this.getSelectionDef());
    selectionSpecificEClass.getESuperTypes().add(this.getSelectionDef());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_CsDecl(), this.getCSDecl(), null, "csDecl", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_AsDecl(), this.getASDecl(), null, "asDecl", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_MappingSect(), this.getMappingSect(), null, "mappingSect", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_DisambiguationSect(), this.getDisambiguationSect(), null, "disambiguationSect", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_NameresoSect(), this.getNameResolutionSect(), null, "nameresoSect", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_HelpersSect(), this.getHelpersSect(), null, "helpersSect", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csDeclEClass, CSDecl.class, "CSDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSDecl_Metamodels(), theBaseCSPackage.getImportCS(), null, "metamodels", null, 0, -1, CSDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asDeclEClass, ASDecl.class, "ASDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getASDecl_Metamodels(), theBaseCSPackage.getImportCS(), null, "metamodels", null, 0, -1, ASDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingSectEClass, MappingSect.class, "MappingSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingSect_Mappings(), this.getClassMap(), null, "mappings", null, 0, -1, MappingSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classMapEClass, ClassMap.class, "ClassMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassMap_To(), theBaseCSPackage.getPathNameCS(), null, "to", null, 0, 1, ClassMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMap_From(), theBaseCSPackage.getPathNameCS(), null, "from", null, 0, 1, ClassMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassMap_Rule(), theEcorePackage.getEString(), "rule", null, 0, 1, ClassMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMap_Statements(), this.getClassMapStmnt(), null, "statements", null, 0, -1, ClassMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classMapStmntEClass, ClassMapStmnt.class, "ClassMapStmnt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyMapEClass, PropertyMap.class, "PropertyMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyMap_Redefine(), theEcorePackage.getEBoolean(), "redefine", null, 0, 1, PropertyMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyMap_PropName(), theEcorePackage.getEString(), "propName", null, 0, 1, PropertyMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyMap_PropInit(), theEssentialOCLCSPackage.getExpCS(), null, "propInit", null, 0, 1, PropertyMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disambiguationSectEClass, DisambiguationSect.class, "DisambiguationSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisambiguationSect_Disambiguations(), this.getClassDisambiguation(), null, "disambiguations", null, 0, -1, DisambiguationSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDisambiguationEClass, ClassDisambiguation.class, "ClassDisambiguation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassDisambiguation_Class(), theBaseCSPackage.getPathNameCS(), null, "class", null, 0, 1, ClassDisambiguation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDisambiguation_Statements(), this.getClassDisambiguationStmnt(), null, "statements", null, 0, -1, ClassDisambiguation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDisambiguationStmntEClass, ClassDisambiguationStmnt.class, "ClassDisambiguationStmnt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(disambiguationDefEClass, DisambiguationDef.class, "DisambiguationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDisambiguationDef_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DisambiguationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisambiguationDef_Exp(), theEssentialOCLCSPackage.getExpCS(), null, "exp", null, 0, 1, DisambiguationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameResolutionSectEClass, NameResolutionSect.class, "NameResolutionSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameResolutionSect_NamedElement(), this.getDefaultNamedElementDef(), null, "namedElement", null, 0, 1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameResolutionSect_NameReferencer(), this.getDefaultNameReferencerDef(), null, "nameReferencer", null, 0, 1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameResolutionSect_NameQualifier(), this.getNameQualifierDef(), null, "nameQualifier", null, 0, 1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameResolutionSect_NameResolutions(), this.getClassNameResolution(), null, "nameResolutions", null, 0, -1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultNamedElementDefEClass, DefaultNamedElementDef.class, "DefaultNamedElementDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefaultNamedElementDef_NameElement(), theEcorePackage.getEString(), "nameElement", null, 0, 1, DefaultNamedElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefaultNamedElementDef_NameProperty(), theEssentialOCLCSPackage.getNameExpCS(), null, "nameProperty", null, 0, 1, DefaultNamedElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultNameReferencerDefEClass, DefaultNameReferencerDef.class, "DefaultNameReferencerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefaultNameReferencerDef_NameReferencer(), theEcorePackage.getEString(), "nameReferencer", null, 0, 1, DefaultNameReferencerDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefaultNameReferencerDef_NameProperty(), theEssentialOCLCSPackage.getNameExpCS(), null, "nameProperty", null, 0, 1, DefaultNameReferencerDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameQualifierDefEClass, NameQualifierDef.class, "NameQualifierDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameQualifierDef_NameQualifier(), theEcorePackage.getEString(), "nameQualifier", null, 0, 1, NameQualifierDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameQualifierDef_SegmentsProp(), theEssentialOCLCSPackage.getNameExpCS(), null, "segmentsProp", null, 0, 1, NameQualifierDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classNameResolutionEClass, ClassNameResolution.class, "ClassNameResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassNameResolution_Class(), theBaseCSPackage.getPathNameCS(), null, "class", null, 0, 1, ClassNameResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassNameResolution_Statements(), this.getClassNameResolutionStmnt(), null, "statements", null, 0, -1, ClassNameResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classNameResolutionStmntEClass, ClassNameResolutionStmnt.class, "ClassNameResolutionStmnt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedElementDefEClass, NamedElementDef.class, "NamedElementDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedElementDef_NamePoperty(), theEssentialOCLCSPackage.getNameExpCS(), null, "namePoperty", null, 0, 1, NamedElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedElementDef_Filter(), this.getFilterDef(), null, "filter", null, 0, 1, NamedElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedElementDef_Qualifications(), this.getQualificationDef(), null, "qualifications", null, 0, -1, NamedElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterDefEClass, FilterDef.class, "FilterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterDef_Params(), theBaseCSPackage.getParameterCS(), null, "params", null, 0, -1, FilterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterDef_Expression(), theEssentialOCLCSPackage.getExpCS(), null, "expression", null, 0, 1, FilterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualificationDefEClass, QualificationDef.class, "QualificationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualificationDef_QualifiedClass(), theBaseCSPackage.getTypedRefCS(), null, "qualifiedClass", null, 0, 1, QualificationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualificationDef_Contribution(), this.getElementsContribExp(), null, "contribution", null, 0, -1, QualificationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementsContribExpEClass, ElementsContribExp.class, "ElementsContribExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementsContribExp_IsFollowing(), theEcorePackage.getEBoolean(), "isFollowing", null, 0, 1, ElementsContribExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementsContribExp_IsImported(), theEcorePackage.getEBoolean(), "isImported", null, 0, 1, ElementsContribExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementsContribExp_Expression(), theEssentialOCLCSPackage.getExpCS(), null, "expression", null, 0, 1, ElementsContribExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeDefEClass, ScopeDef.class, "ScopeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScopeDef_SelectionDef(), this.getSelectionDef(), null, "selectionDef", null, 0, 1, ScopeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScopeDef_SameScope(), theEcorePackage.getEBoolean(), "sameScope", null, 0, 1, ScopeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScopeDef_EmptyScope(), theEcorePackage.getEBoolean(), "emptyScope", null, 0, 1, ScopeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScopeDef_AlsoExports(), theEcorePackage.getEBoolean(), "alsoExports", null, 0, 1, ScopeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeDef_Contribution(), this.getContributionDef(), null, "contribution", null, 0, 1, ScopeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeDef_OccludingDefs(), this.getOccludingDef(), null, "occludingDefs", null, 0, -1, ScopeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(occludingDefEClass, OccludingDef.class, "OccludingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOccludingDef_Contribution(), this.getContributionDef(), null, "contribution", null, 0, 1, OccludingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionDefEClass, ContributionDef.class, "ContributionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContributionDef_Contributions(), this.getElementsContribExp(), null, "contributions", null, 0, -1, ContributionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionDefEClass, SelectionDef.class, "SelectionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exportDefEClass, ExportDef.class, "ExportDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExportDef_SelectionDef(), this.getSelectionDef(), null, "selectionDef", null, 0, 1, ExportDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExportDef_ExportedClass(), theBaseCSPackage.getTypedRefCS(), null, "exportedClass", null, 0, 1, ExportDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExportDef_Contribution(), this.getContributionDef(), null, "contribution", null, 0, 1, ExportDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExportDef_OccludingDefs(), this.getOccludingDef(), null, "occludingDefs", null, 0, -1, ExportDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helpersSectEClass, HelpersSect.class, "HelpersSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHelpersSect_ClassHelpers(), this.getClassHelper(), null, "classHelpers", null, 0, -1, HelpersSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classHelperEClass, ClassHelper.class, "ClassHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassHelper_Context(), theBaseCSPackage.getPathNameCS(), null, "context", null, 0, 1, ClassHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassHelper_Helpers(), this.getHelperDef(), null, "helpers", null, 0, -1, ClassHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperDefEClass, HelperDef.class, "HelperDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHelperDef_OwnedSignature(), theBaseCSPackage.getTemplateSignatureCS(), null, "ownedSignature", null, 0, 1, HelperDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelperDef_Name(), theEcorePackage.getEString(), "name", null, 0, 1, HelperDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperDef_Params(), theBaseCSPackage.getParameterCS(), null, "params", null, 0, -1, HelperDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperDef_OwnedType(), theBaseCSPackage.getTypedRefCS(), null, "ownedType", null, 0, 1, HelperDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperDef_HelperBody(), theEssentialOCLCSPackage.getExpCS(), null, "helperBody", null, 0, 1, HelperDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resolveExpCSEClass, ResolveExpCS.class, "ResolveExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lookupExpCSEClass, LookupExpCS.class, "LookupExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookupExpCS_FromExp(), theEcorePackage.getEBoolean(), "fromExp", null, 0, 1, LookupExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookupExpCS_Args(), theEssentialOCLCSPackage.getExpCS(), null, "args", null, 0, -1, LookupExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionAllEClass, SelectionAll.class, "SelectionAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionAll_ExceptionProperties(), theEssentialOCLCSPackage.getExpCS(), null, "exceptionProperties", null, 0, -1, SelectionAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionSpecificEClass, SelectionSpecific.class, "SelectionSpecific", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionSpecific_SelectedProperties(), theEssentialOCLCSPackage.getExpCS(), null, "selectedProperties", null, 0, -1, SelectionSpecific.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Cs2as_dslPackageImpl
