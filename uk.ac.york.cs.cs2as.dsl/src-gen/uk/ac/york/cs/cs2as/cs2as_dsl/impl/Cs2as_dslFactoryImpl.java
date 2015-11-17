/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cs2as_dslFactoryImpl extends EFactoryImpl implements Cs2as_dslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Cs2as_dslFactory init()
  {
    try
    {
      Cs2as_dslFactory theCs2as_dslFactory = (Cs2as_dslFactory)EPackage.Registry.INSTANCE.getEFactory(Cs2as_dslPackage.eNS_URI);
      if (theCs2as_dslFactory != null)
      {
        return theCs2as_dslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Cs2as_dslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Cs2as_dslPackage.MODEL: return createModel();
      case Cs2as_dslPackage.CS_DECL: return createCSDecl();
      case Cs2as_dslPackage.AS_DECL: return createASDecl();
      case Cs2as_dslPackage.MAPPING_SECT: return createMappingSect();
      case Cs2as_dslPackage.CLASS_MAP: return createClassMap();
      case Cs2as_dslPackage.CLASS_MAP_STMNT: return createClassMapStmnt();
      case Cs2as_dslPackage.PROPERTY_MAP: return createPropertyMap();
      case Cs2as_dslPackage.DISAMBIGUATION_SECT: return createDisambiguationSect();
      case Cs2as_dslPackage.CLASS_DISAMBIGUATION: return createClassDisambiguation();
      case Cs2as_dslPackage.CLASS_DISAMBIGUATION_STMNT: return createClassDisambiguationStmnt();
      case Cs2as_dslPackage.DISAMBIGUATION_DEF: return createDisambiguationDef();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT: return createNameResolutionSect();
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF: return createDefaultNamedElementDef();
      case Cs2as_dslPackage.DEFAULT_NAME_REFERENCER_DEF: return createDefaultNameReferencerDef();
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF: return createNameQualifierDef();
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION: return createClassNameResolution();
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION_STMNT: return createClassNameResolutionStmnt();
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF: return createNamedElementDef();
      case Cs2as_dslPackage.SCOPE_DEF: return createScopeDef();
      case Cs2as_dslPackage.RESOLVE_EXP_CS: return createResolveExpCS();
      case Cs2as_dslPackage.LOOKUP_EXP_CS: return createLookupExpCS();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSDecl createCSDecl()
  {
    CSDeclImpl csDecl = new CSDeclImpl();
    return csDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASDecl createASDecl()
  {
    ASDeclImpl asDecl = new ASDeclImpl();
    return asDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingSect createMappingSect()
  {
    MappingSectImpl mappingSect = new MappingSectImpl();
    return mappingSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMap createClassMap()
  {
    ClassMapImpl classMap = new ClassMapImpl();
    return classMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMapStmnt createClassMapStmnt()
  {
    ClassMapStmntImpl classMapStmnt = new ClassMapStmntImpl();
    return classMapStmnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyMap createPropertyMap()
  {
    PropertyMapImpl propertyMap = new PropertyMapImpl();
    return propertyMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisambiguationSect createDisambiguationSect()
  {
    DisambiguationSectImpl disambiguationSect = new DisambiguationSectImpl();
    return disambiguationSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDisambiguation createClassDisambiguation()
  {
    ClassDisambiguationImpl classDisambiguation = new ClassDisambiguationImpl();
    return classDisambiguation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDisambiguationStmnt createClassDisambiguationStmnt()
  {
    ClassDisambiguationStmntImpl classDisambiguationStmnt = new ClassDisambiguationStmntImpl();
    return classDisambiguationStmnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisambiguationDef createDisambiguationDef()
  {
    DisambiguationDefImpl disambiguationDef = new DisambiguationDefImpl();
    return disambiguationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameResolutionSect createNameResolutionSect()
  {
    NameResolutionSectImpl nameResolutionSect = new NameResolutionSectImpl();
    return nameResolutionSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNamedElementDef createDefaultNamedElementDef()
  {
    DefaultNamedElementDefImpl defaultNamedElementDef = new DefaultNamedElementDefImpl();
    return defaultNamedElementDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNameReferencerDef createDefaultNameReferencerDef()
  {
    DefaultNameReferencerDefImpl defaultNameReferencerDef = new DefaultNameReferencerDefImpl();
    return defaultNameReferencerDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameQualifierDef createNameQualifierDef()
  {
    NameQualifierDefImpl nameQualifierDef = new NameQualifierDefImpl();
    return nameQualifierDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassNameResolution createClassNameResolution()
  {
    ClassNameResolutionImpl classNameResolution = new ClassNameResolutionImpl();
    return classNameResolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassNameResolutionStmnt createClassNameResolutionStmnt()
  {
    ClassNameResolutionStmntImpl classNameResolutionStmnt = new ClassNameResolutionStmntImpl();
    return classNameResolutionStmnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElementDef createNamedElementDef()
  {
    NamedElementDefImpl namedElementDef = new NamedElementDefImpl();
    return namedElementDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDef createScopeDef()
  {
    ScopeDefImpl scopeDef = new ScopeDefImpl();
    return scopeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResolveExpCS createResolveExpCS()
  {
    ResolveExpCSImpl resolveExpCS = new ResolveExpCSImpl();
    return resolveExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupExpCS createLookupExpCS()
  {
    LookupExpCSImpl lookupExpCS = new LookupExpCSImpl();
    return lookupExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslPackage getCs2as_dslPackage()
  {
    return (Cs2as_dslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Cs2as_dslPackage getPackage()
  {
    return Cs2as_dslPackage.eINSTANCE;
  }

} //Cs2as_dslFactoryImpl