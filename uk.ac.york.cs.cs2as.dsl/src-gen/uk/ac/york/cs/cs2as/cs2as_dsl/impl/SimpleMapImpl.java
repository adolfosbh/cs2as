/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SimpleMapImpl#getMappedProperties <em>Mapped Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleMapImpl extends MinimalEObjectImpl.Container implements SimpleMap
{
  /**
   * The cached value of the '{@link #getMappedProperties() <em>Mapped Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedProperties()
   * @generated
   * @ordered
   */
  protected EList<PropertyMap> mappedProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleMapImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Cs2as_dslPackage.Literals.SIMPLE_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyMap> getMappedProperties()
  {
    if (mappedProperties == null)
    {
      mappedProperties = new EObjectContainmentEList<PropertyMap>(PropertyMap.class, this, Cs2as_dslPackage.SIMPLE_MAP__MAPPED_PROPERTIES);
    }
    return mappedProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.SIMPLE_MAP__MAPPED_PROPERTIES:
        return ((InternalEList<?>)getMappedProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.SIMPLE_MAP__MAPPED_PROPERTIES:
        return getMappedProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.SIMPLE_MAP__MAPPED_PROPERTIES:
        getMappedProperties().clear();
        getMappedProperties().addAll((Collection<? extends PropertyMap>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.SIMPLE_MAP__MAPPED_PROPERTIES:
        getMappedProperties().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.SIMPLE_MAP__MAPPED_PROPERTIES:
        return mappedProperties != null && !mappedProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleMapImpl
