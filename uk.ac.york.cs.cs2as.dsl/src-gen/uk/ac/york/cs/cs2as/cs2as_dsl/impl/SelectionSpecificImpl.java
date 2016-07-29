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

import org.eclipse.xtext.xbase.XExpression;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Specific</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionSpecificImpl#getSelectedProperties <em>Selected Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionSpecificImpl extends SelectionDefImpl implements SelectionSpecific
{
  /**
   * The cached value of the '{@link #getSelectedProperties() <em>Selected Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedProperties()
   * @generated
   * @ordered
   */
  protected EList<XExpression> selectedProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionSpecificImpl()
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
    return Cs2as_dslPackage.Literals.SELECTION_SPECIFIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getSelectedProperties()
  {
    if (selectedProperties == null)
    {
      selectedProperties = new EObjectContainmentEList<XExpression>(XExpression.class, this, Cs2as_dslPackage.SELECTION_SPECIFIC__SELECTED_PROPERTIES);
    }
    return selectedProperties;
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
      case Cs2as_dslPackage.SELECTION_SPECIFIC__SELECTED_PROPERTIES:
        return ((InternalEList<?>)getSelectedProperties()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.SELECTION_SPECIFIC__SELECTED_PROPERTIES:
        return getSelectedProperties();
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
      case Cs2as_dslPackage.SELECTION_SPECIFIC__SELECTED_PROPERTIES:
        getSelectedProperties().clear();
        getSelectedProperties().addAll((Collection<? extends XExpression>)newValue);
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
      case Cs2as_dslPackage.SELECTION_SPECIFIC__SELECTED_PROPERTIES:
        getSelectedProperties().clear();
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
      case Cs2as_dslPackage.SELECTION_SPECIFIC__SELECTED_PROPERTIES:
        return selectedProperties != null && !selectedProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectionSpecificImpl
