/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.compoundStmt;
import org.xtext.example.delphi.delphi.stmtList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compound Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.compoundStmtImpl#getStatmnts <em>Statmnts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class compoundStmtImpl extends structStmtImpl implements compoundStmt
{
  /**
   * The cached value of the '{@link #getStatmnts() <em>Statmnts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatmnts()
   * @generated
   * @ordered
   */
  protected stmtList statmnts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compoundStmtImpl()
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
    return DelphiPackage.Literals.COMPOUND_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stmtList getStatmnts()
  {
    return statmnts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatmnts(stmtList newStatmnts, NotificationChain msgs)
  {
    stmtList oldStatmnts = statmnts;
    statmnts = newStatmnts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.COMPOUND_STMT__STATMNTS, oldStatmnts, newStatmnts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatmnts(stmtList newStatmnts)
  {
    if (newStatmnts != statmnts)
    {
      NotificationChain msgs = null;
      if (statmnts != null)
        msgs = ((InternalEObject)statmnts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.COMPOUND_STMT__STATMNTS, null, msgs);
      if (newStatmnts != null)
        msgs = ((InternalEObject)newStatmnts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.COMPOUND_STMT__STATMNTS, null, msgs);
      msgs = basicSetStatmnts(newStatmnts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.COMPOUND_STMT__STATMNTS, newStatmnts, newStatmnts));
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
      case DelphiPackage.COMPOUND_STMT__STATMNTS:
        return basicSetStatmnts(null, msgs);
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
      case DelphiPackage.COMPOUND_STMT__STATMNTS:
        return getStatmnts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DelphiPackage.COMPOUND_STMT__STATMNTS:
        setStatmnts((stmtList)newValue);
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
      case DelphiPackage.COMPOUND_STMT__STATMNTS:
        setStatmnts((stmtList)null);
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
      case DelphiPackage.COMPOUND_STMT__STATMNTS:
        return statmnts != null;
    }
    return super.eIsSet(featureID);
  }

} //compoundStmtImpl
