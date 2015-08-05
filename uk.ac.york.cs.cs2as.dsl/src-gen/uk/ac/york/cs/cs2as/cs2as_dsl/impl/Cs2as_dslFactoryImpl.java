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
      case Cs2as_dslPackage.CLASS_MAP: return createClassMap();
      case Cs2as_dslPackage.DISAMBIGUATION_MAP: return createDisambiguationMap();
      case Cs2as_dslPackage.SIMPLE_MAP: return createSimpleMap();
      case Cs2as_dslPackage.PROPERTY_MAP: return createPropertyMap();
      case Cs2as_dslPackage.MAP_EXP_CS: return createMapExpCS();
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
  public DisambiguationMap createDisambiguationMap()
  {
    DisambiguationMapImpl disambiguationMap = new DisambiguationMapImpl();
    return disambiguationMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMap createSimpleMap()
  {
    SimpleMapImpl simpleMap = new SimpleMapImpl();
    return simpleMap;
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
  public MapExpCS createMapExpCS()
  {
    MapExpCSImpl mapExpCS = new MapExpCSImpl();
    return mapExpCS;
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
