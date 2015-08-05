/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;

import org.eclipse.ocl.xtext.basecs.util.VisitableCS;

import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage
 * @generated
 */
public class Cs2as_dslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Cs2as_dslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Cs2as_dslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Cs2as_dslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = caseContextCS(model);
        if (result == null) result = caseNamedElementCS(model);
        if (result == null) result = caseRootCS(model);
        if (result == null) result = caseModelElementCS(model);
        if (result == null) result = caseNameable(model);
        if (result == null) result = casePivotableElementCS(model);
        if (result == null) result = caseElementCS(model);
        if (result == null) result = casePivotable(model);
        if (result == null) result = caseVisitableCS(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CS_DECL:
      {
        CSDecl csDecl = (CSDecl)theEObject;
        T result = caseCSDecl(csDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.AS_DECL:
      {
        ASDecl asDecl = (ASDecl)theEObject;
        T result = caseASDecl(asDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_MAP:
      {
        ClassMap classMap = (ClassMap)theEObject;
        T result = caseClassMap(classMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DISAMBIGUATION_MAP:
      {
        DisambiguationMap disambiguationMap = (DisambiguationMap)theEObject;
        T result = caseDisambiguationMap(disambiguationMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SIMPLE_MAP:
      {
        SimpleMap simpleMap = (SimpleMap)theEObject;
        T result = caseSimpleMap(simpleMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROPERTY_MAP:
      {
        PropertyMap propertyMap = (PropertyMap)theEObject;
        T result = casePropertyMap(propertyMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MAP_EXP_CS:
      {
        MapExpCS mapExpCS = (MapExpCS)theEObject;
        T result = caseMapExpCS(mapExpCS);
        if (result == null) result = caseExpCS(mapExpCS);
        if (result == null) result = caseModelElementCS(mapExpCS);
        if (result == null) result = casePivotableElementCS(mapExpCS);
        if (result == null) result = caseElementCS(mapExpCS);
        if (result == null) result = casePivotable(mapExpCS);
        if (result == null) result = caseVisitableCS(mapExpCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.LOOKUP_EXP_CS:
      {
        LookupExpCS lookupExpCS = (LookupExpCS)theEObject;
        T result = caseLookupExpCS(lookupExpCS);
        if (result == null) result = caseExpCS(lookupExpCS);
        if (result == null) result = caseModelElementCS(lookupExpCS);
        if (result == null) result = casePivotableElementCS(lookupExpCS);
        if (result == null) result = caseElementCS(lookupExpCS);
        if (result == null) result = casePivotable(lookupExpCS);
        if (result == null) result = caseVisitableCS(lookupExpCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CS Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CS Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSDecl(CSDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AS Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AS Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASDecl(ASDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassMap(ClassMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disambiguation Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disambiguation Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisambiguationMap(DisambiguationMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleMap(SimpleMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyMap(PropertyMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapExpCS(MapExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lookup Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookup Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookupExpCS(LookupExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisitableCS(VisitableCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementCS(ElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pivotable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pivotable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePivotable(Pivotable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePivotableElementCS(PivotableElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElementCS(ModelElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameable(Nameable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElementCS(NamedElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRootCS(RootCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextCS(ContextCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpCS(ExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Cs2as_dslSwitch
