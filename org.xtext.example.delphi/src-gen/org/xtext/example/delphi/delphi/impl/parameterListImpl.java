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
import org.xtext.example.delphi.delphi.identList;
import org.xtext.example.delphi.delphi.parameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.parameterListImpl#getIdList <em>Id List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class parameterListImpl extends parameterImpl implements parameterList
{
  /**
	 * The cached value of the '{@link #getIdList() <em>Id List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIdList()
	 * @generated
	 * @ordered
	 */
  protected identList idList;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected parameterListImpl()
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
		return DelphiPackage.Literals.PARAMETER_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public identList getIdList()
  {
		return idList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetIdList(identList newIdList, NotificationChain msgs)
  {
		identList oldIdList = idList;
		idList = newIdList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.PARAMETER_LIST__ID_LIST, oldIdList, newIdList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIdList(identList newIdList)
  {
		if (newIdList != idList) {
			NotificationChain msgs = null;
			if (idList != null)
				msgs = ((InternalEObject)idList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.PARAMETER_LIST__ID_LIST, null, msgs);
			if (newIdList != null)
				msgs = ((InternalEObject)newIdList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.PARAMETER_LIST__ID_LIST, null, msgs);
			msgs = basicSetIdList(newIdList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.PARAMETER_LIST__ID_LIST, newIdList, newIdList));
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
			case DelphiPackage.PARAMETER_LIST__ID_LIST:
				return basicSetIdList(null, msgs);
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
			case DelphiPackage.PARAMETER_LIST__ID_LIST:
				return getIdList();
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
		switch (featureID) {
			case DelphiPackage.PARAMETER_LIST__ID_LIST:
				setIdList((identList)newValue);
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
			case DelphiPackage.PARAMETER_LIST__ID_LIST:
				setIdList((identList)null);
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
			case DelphiPackage.PARAMETER_LIST__ID_LIST:
				return idList != null;
		}
		return super.eIsSet(featureID);
	}

} //parameterListImpl
