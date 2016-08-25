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
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Scope Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeDeclImpl#getProvisionDefs <em>Provision Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentScopeDeclImpl extends MinimalEObjectImpl.Container implements CurrentScopeDecl
{
  /**
   * The cached value of the '{@link #getProvisionDefs() <em>Provision Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvisionDefs()
   * @generated
   * @ordered
   */
  protected EList<CurrentScopeProvisionDef> provisionDefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CurrentScopeDeclImpl()
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
    return Cs2as_dslPackage.Literals.CURRENT_SCOPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CurrentScopeProvisionDef> getProvisionDefs()
  {
    if (provisionDefs == null)
    {
      provisionDefs = new EObjectContainmentEList<CurrentScopeProvisionDef>(CurrentScopeProvisionDef.class, this, Cs2as_dslPackage.CURRENT_SCOPE_DECL__PROVISION_DEFS);
    }
    return provisionDefs;
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
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL__PROVISION_DEFS:
        return ((InternalEList<?>)getProvisionDefs()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL__PROVISION_DEFS:
        return getProvisionDefs();
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
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL__PROVISION_DEFS:
        getProvisionDefs().clear();
        getProvisionDefs().addAll((Collection<? extends CurrentScopeProvisionDef>)newValue);
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
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL__PROVISION_DEFS:
        getProvisionDefs().clear();
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
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL__PROVISION_DEFS:
        return provisionDefs != null && !provisionDefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CurrentScopeDeclImpl
