/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.directive;
import org.xtext.example.delphi.delphi.methodHeading;
import org.xtext.example.delphi.delphi.methodList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.methodListImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.methodListImpl#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class methodListImpl extends CSTraceImpl implements methodList
{
  /**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
  protected methodHeading heading;

  /**
	 * The cached value of the '{@link #getDirective() <em>Directive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDirective()
	 * @generated
	 * @ordered
	 */
  protected EList<directive> directive;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected methodListImpl()
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
		return DelphiPackage.Literals.METHOD_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public methodHeading getHeading()
  {
		return heading;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetHeading(methodHeading newHeading, NotificationChain msgs)
  {
		methodHeading oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.METHOD_LIST__HEADING, oldHeading, newHeading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHeading(methodHeading newHeading)
  {
		if (newHeading != heading) {
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject)heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.METHOD_LIST__HEADING, null, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject)newHeading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.METHOD_LIST__HEADING, null, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.METHOD_LIST__HEADING, newHeading, newHeading));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<directive> getDirective()
  {
		if (directive == null) {
			directive = new EObjectContainmentEList<directive>(directive.class, this, DelphiPackage.METHOD_LIST__DIRECTIVE);
		}
		return directive;
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
			case DelphiPackage.METHOD_LIST__HEADING:
				return basicSetHeading(null, msgs);
			case DelphiPackage.METHOD_LIST__DIRECTIVE:
				return ((InternalEList<?>)getDirective()).basicRemove(otherEnd, msgs);
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
			case DelphiPackage.METHOD_LIST__HEADING:
				return getHeading();
			case DelphiPackage.METHOD_LIST__DIRECTIVE:
				return getDirective();
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
			case DelphiPackage.METHOD_LIST__HEADING:
				setHeading((methodHeading)newValue);
				return;
			case DelphiPackage.METHOD_LIST__DIRECTIVE:
				getDirective().clear();
				getDirective().addAll((Collection<? extends directive>)newValue);
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
			case DelphiPackage.METHOD_LIST__HEADING:
				setHeading((methodHeading)null);
				return;
			case DelphiPackage.METHOD_LIST__DIRECTIVE:
				getDirective().clear();
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
			case DelphiPackage.METHOD_LIST__HEADING:
				return heading != null;
			case DelphiPackage.METHOD_LIST__DIRECTIVE:
				return directive != null && !directive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //methodListImpl
