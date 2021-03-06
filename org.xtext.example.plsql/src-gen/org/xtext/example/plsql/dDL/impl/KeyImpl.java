/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.plsql.dDL.Colname;
import org.xtext.example.plsql.dDL.DDLPackage;
import org.xtext.example.plsql.dDL.Key;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.plsql.dDL.impl.KeyImpl#getColNames <em>Col Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key
{
  /**
   * The cached value of the '{@link #getColNames() <em>Col Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColNames()
   * @generated
   * @ordered
   */
  protected EList<Colname> colNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyImpl()
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
    return DDLPackage.Literals.KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Colname> getColNames()
  {
    if (colNames == null)
    {
      colNames = new EObjectContainmentEList<Colname>(Colname.class, this, DDLPackage.KEY__COL_NAMES);
    }
    return colNames;
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
      case DDLPackage.KEY__COL_NAMES:
        return ((InternalEList<?>)getColNames()).basicRemove(otherEnd, msgs);
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
      case DDLPackage.KEY__COL_NAMES:
        return getColNames();
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
      case DDLPackage.KEY__COL_NAMES:
        getColNames().clear();
        getColNames().addAll((Collection<? extends Colname>)newValue);
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
      case DDLPackage.KEY__COL_NAMES:
        getColNames().clear();
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
      case DDLPackage.KEY__COL_NAMES:
        return colNames != null && !colNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KeyImpl
