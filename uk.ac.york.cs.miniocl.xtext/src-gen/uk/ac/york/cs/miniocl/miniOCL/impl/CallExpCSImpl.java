/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.miniOCL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.miniocl.miniOCL.CallExpCS;
import uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage;
import uk.ac.york.cs.miniocl.miniOCL.NameExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.impl.CallExpCSImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.impl.CallExpCSImpl#getNameExp <em>Name Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallExpCSImpl extends LogicExpCSImpl implements CallExpCS
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected CallExpCS source;

  /**
   * The cached value of the '{@link #getNameExp() <em>Name Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameExp()
   * @generated
   * @ordered
   */
  protected NameExpCS nameExp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallExpCSImpl()
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
    return MiniOCLPackage.Literals.CALL_EXP_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallExpCS getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(CallExpCS newSource, NotificationChain msgs)
  {
    CallExpCS oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniOCLPackage.CALL_EXP_CS__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(CallExpCS newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniOCLPackage.CALL_EXP_CS__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniOCLPackage.CALL_EXP_CS__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniOCLPackage.CALL_EXP_CS__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpCS getNameExp()
  {
    return nameExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameExp(NameExpCS newNameExp, NotificationChain msgs)
  {
    NameExpCS oldNameExp = nameExp;
    nameExp = newNameExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniOCLPackage.CALL_EXP_CS__NAME_EXP, oldNameExp, newNameExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameExp(NameExpCS newNameExp)
  {
    if (newNameExp != nameExp)
    {
      NotificationChain msgs = null;
      if (nameExp != null)
        msgs = ((InternalEObject)nameExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniOCLPackage.CALL_EXP_CS__NAME_EXP, null, msgs);
      if (newNameExp != null)
        msgs = ((InternalEObject)newNameExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniOCLPackage.CALL_EXP_CS__NAME_EXP, null, msgs);
      msgs = basicSetNameExp(newNameExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniOCLPackage.CALL_EXP_CS__NAME_EXP, newNameExp, newNameExp));
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
      case MiniOCLPackage.CALL_EXP_CS__SOURCE:
        return basicSetSource(null, msgs);
      case MiniOCLPackage.CALL_EXP_CS__NAME_EXP:
        return basicSetNameExp(null, msgs);
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
      case MiniOCLPackage.CALL_EXP_CS__SOURCE:
        return getSource();
      case MiniOCLPackage.CALL_EXP_CS__NAME_EXP:
        return getNameExp();
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
      case MiniOCLPackage.CALL_EXP_CS__SOURCE:
        setSource((CallExpCS)newValue);
        return;
      case MiniOCLPackage.CALL_EXP_CS__NAME_EXP:
        setNameExp((NameExpCS)newValue);
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
      case MiniOCLPackage.CALL_EXP_CS__SOURCE:
        setSource((CallExpCS)null);
        return;
      case MiniOCLPackage.CALL_EXP_CS__NAME_EXP:
        setNameExp((NameExpCS)null);
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
      case MiniOCLPackage.CALL_EXP_CS__SOURCE:
        return source != null;
      case MiniOCLPackage.CALL_EXP_CS__NAME_EXP:
        return nameExp != null;
    }
    return super.eIsSet(featureID);
  }

} //CallExpCSImpl
