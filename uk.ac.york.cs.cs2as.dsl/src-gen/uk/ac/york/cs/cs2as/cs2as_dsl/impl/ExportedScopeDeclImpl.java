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
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exported Scope Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeDeclImpl#getProvisionDefs <em>Provision Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportedScopeDeclImpl extends MinimalEObjectImpl.Container implements ExportedScopeDecl
{
  /**
   * The cached value of the '{@link #getProvisionDefs() <em>Provision Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvisionDefs()
   * @generated
   * @ordered
   */
  protected EList<ExportedScopeProvisionDef> provisionDefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportedScopeDeclImpl()
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
    return Cs2as_dslPackage.Literals.EXPORTED_SCOPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExportedScopeProvisionDef> getProvisionDefs()
  {
    if (provisionDefs == null)
    {
      provisionDefs = new EObjectContainmentEList<ExportedScopeProvisionDef>(ExportedScopeProvisionDef.class, this, Cs2as_dslPackage.EXPORTED_SCOPE_DECL__PROVISION_DEFS);
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL__PROVISION_DEFS:
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL__PROVISION_DEFS:
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL__PROVISION_DEFS:
        getProvisionDefs().clear();
        getProvisionDefs().addAll((Collection<? extends ExportedScopeProvisionDef>)newValue);
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL__PROVISION_DEFS:
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
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL__PROVISION_DEFS:
        return provisionDefs != null && !provisionDefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExportedScopeDeclImpl
