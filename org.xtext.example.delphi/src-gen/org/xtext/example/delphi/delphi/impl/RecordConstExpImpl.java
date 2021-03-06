/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.RecordConstExp;
import org.xtext.example.delphi.delphi.recordConstExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Const Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.RecordConstExpImpl#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordConstExpImpl extends constExprImpl implements RecordConstExp
{
  /**
	 * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExps()
	 * @generated
	 * @ordered
	 */
  protected EList<recordConstExpr> exps;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RecordConstExpImpl()
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
		return DelphiPackage.Literals.RECORD_CONST_EXP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<recordConstExpr> getExps()
  {
		if (exps == null) {
			exps = new EObjectContainmentEList<recordConstExpr>(recordConstExpr.class, this, DelphiPackage.RECORD_CONST_EXP__EXPS);
		}
		return exps;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DelphiPackage.RECORD_CONST_EXP__EXPS:
				return ((InternalEList<?>)getExps()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case DelphiPackage.RECORD_CONST_EXP__EXPS:
				return getExps();
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
		switch (featureID) {
			case DelphiPackage.RECORD_CONST_EXP__EXPS:
				getExps().clear();
				getExps().addAll((Collection<? extends recordConstExpr>)newValue);
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
		switch (featureID) {
			case DelphiPackage.RECORD_CONST_EXP__EXPS:
				getExps().clear();
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
		switch (featureID) {
			case DelphiPackage.RECORD_CONST_EXP__EXPS:
				return exps != null && !exps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordConstExpImpl
