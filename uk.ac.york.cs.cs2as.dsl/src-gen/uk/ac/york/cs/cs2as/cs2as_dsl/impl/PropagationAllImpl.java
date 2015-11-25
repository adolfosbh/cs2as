/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropagationAll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropagationAllImpl#getExceptionProperties <em>Exception Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagationAllImpl extends PropagationDefImpl implements PropagationAll
{
  /**
   * The cached value of the '{@link #getExceptionProperties() <em>Exception Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionProperties()
   * @generated
   * @ordered
   */
  protected EList<ExpCS> exceptionProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropagationAllImpl()
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
    return Cs2as_dslPackage.Literals.PROPAGATION_ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpCS> getExceptionProperties()
  {
    if (exceptionProperties == null)
    {
      exceptionProperties = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, Cs2as_dslPackage.PROPAGATION_ALL__EXCEPTION_PROPERTIES);
    }
    return exceptionProperties;
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
      case Cs2as_dslPackage.PROPAGATION_ALL__EXCEPTION_PROPERTIES:
        return ((InternalEList<?>)getExceptionProperties()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.PROPAGATION_ALL__EXCEPTION_PROPERTIES:
        return getExceptionProperties();
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
      case Cs2as_dslPackage.PROPAGATION_ALL__EXCEPTION_PROPERTIES:
        getExceptionProperties().clear();
        getExceptionProperties().addAll((Collection<? extends ExpCS>)newValue);
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
      case Cs2as_dslPackage.PROPAGATION_ALL__EXCEPTION_PROPERTIES:
        getExceptionProperties().clear();
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
      case Cs2as_dslPackage.PROPAGATION_ALL__EXCEPTION_PROPERTIES:
        return exceptionProperties != null && !exceptionProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropagationAllImpl
