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
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exported Scope Provision Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeProvisionDefImpl#getProvisions <em>Provisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportedScopeProvisionDefImpl extends MinimalEObjectImpl.Container implements ExportedScopeProvisionDef
{
  /**
   * The cached value of the '{@link #getProvisions() <em>Provisions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvisions()
   * @generated
   * @ordered
   */
  protected EList<Provision> provisions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportedScopeProvisionDefImpl()
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
    return Cs2as_dslPackage.Literals.EXPORTED_SCOPE_PROVISION_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Provision> getProvisions()
  {
    if (provisions == null)
    {
      provisions = new EObjectContainmentEList<Provision>(Provision.class, this, Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS);
    }
    return provisions;
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS:
        return ((InternalEList<?>)getProvisions()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS:
        return getProvisions();
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS:
        getProvisions().clear();
        getProvisions().addAll((Collection<? extends Provision>)newValue);
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS:
        getProvisions().clear();
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS:
        return provisions != null && !provisions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExportedScopeProvisionDefImpl
