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
import uk.ac.york.cs.cs2as.cs2as_dsl.PropagationSelective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation Selective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropagationSelectiveImpl#getPropagatingProperties <em>Propagating Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagationSelectiveImpl extends PropagationDefImpl implements PropagationSelective
{
  /**
   * The cached value of the '{@link #getPropagatingProperties() <em>Propagating Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagatingProperties()
   * @generated
   * @ordered
   */
  protected EList<ExpCS> propagatingProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropagationSelectiveImpl()
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
    return Cs2as_dslPackage.Literals.PROPAGATION_SELECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpCS> getPropagatingProperties()
  {
    if (propagatingProperties == null)
    {
      propagatingProperties = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, Cs2as_dslPackage.PROPAGATION_SELECTIVE__PROPAGATING_PROPERTIES);
    }
    return propagatingProperties;
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
      case Cs2as_dslPackage.PROPAGATION_SELECTIVE__PROPAGATING_PROPERTIES:
        return ((InternalEList<?>)getPropagatingProperties()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.PROPAGATION_SELECTIVE__PROPAGATING_PROPERTIES:
        return getPropagatingProperties();
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
      case Cs2as_dslPackage.PROPAGATION_SELECTIVE__PROPAGATING_PROPERTIES:
        getPropagatingProperties().clear();
        getPropagatingProperties().addAll((Collection<? extends ExpCS>)newValue);
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
      case Cs2as_dslPackage.PROPAGATION_SELECTIVE__PROPAGATING_PROPERTIES:
        getPropagatingProperties().clear();
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
      case Cs2as_dslPackage.PROPAGATION_SELECTIVE__PROPAGATING_PROPERTIES:
        return propagatingProperties != null && !propagatingProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropagationSelectiveImpl
