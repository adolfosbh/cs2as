/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements Contrib Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl#isIsPreceding <em>Is Preceding</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl#isIsImported <em>Is Imported</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementsContribExpImpl extends MinimalEObjectImpl.Container implements ElementsContribExp
{
  /**
   * The default value of the '{@link #isIsPreceding() <em>Is Preceding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPreceding()
   * @generated
   * @ordered
   */
  protected static final boolean IS_PRECEDING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsPreceding() <em>Is Preceding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPreceding()
   * @generated
   * @ordered
   */
  protected boolean isPreceding = IS_PRECEDING_EDEFAULT;

  /**
   * The default value of the '{@link #isIsImported() <em>Is Imported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsImported()
   * @generated
   * @ordered
   */
  protected static final boolean IS_IMPORTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsImported() <em>Is Imported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsImported()
   * @generated
   * @ordered
   */
  protected boolean isImported = IS_IMPORTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementsContribExpImpl()
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
    return Cs2as_dslPackage.Literals.ELEMENTS_CONTRIB_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsPreceding()
  {
    return isPreceding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPreceding(boolean newIsPreceding)
  {
    boolean oldIsPreceding = isPreceding;
    isPreceding = newIsPreceding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_PRECEDING, oldIsPreceding, isPreceding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsImported()
  {
    return isImported;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsImported(boolean newIsImported)
  {
    boolean oldIsImported = isImported;
    isImported = newIsImported;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_IMPORTED, oldIsImported, isImported));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, newExpression, newExpression));
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_PRECEDING:
        return isIsPreceding();
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_IMPORTED:
        return isIsImported();
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        return getExpression();
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_PRECEDING:
        setIsPreceding((Boolean)newValue);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_IMPORTED:
        setIsImported((Boolean)newValue);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        setExpression((XExpression)newValue);
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_PRECEDING:
        setIsPreceding(IS_PRECEDING_EDEFAULT);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_IMPORTED:
        setIsImported(IS_IMPORTED_EDEFAULT);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        setExpression((XExpression)null);
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_PRECEDING:
        return isPreceding != IS_PRECEDING_EDEFAULT;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__IS_IMPORTED:
        return isImported != IS_IMPORTED_EDEFAULT;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isPreceding: ");
    result.append(isPreceding);
    result.append(", isImported: ");
    result.append(isImported);
    result.append(')');
    return result.toString();
  }

} //ElementsContribExpImpl
