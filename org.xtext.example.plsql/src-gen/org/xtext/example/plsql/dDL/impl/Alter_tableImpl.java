/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.plsql.dDL.Alter_table;
import org.xtext.example.plsql.dDL.Constraint;
import org.xtext.example.plsql.dDL.DDLPackage;
import org.xtext.example.plsql.dDL.Tabname;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.plsql.dDL.impl.Alter_tableImpl#getTabname <em>Tabname</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.impl.Alter_tableImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.impl.Alter_tableImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.impl.Alter_tableImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.impl.Alter_tableImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Alter_tableImpl extends DefinitionImpl implements Alter_table
{
  /**
   * The cached value of the '{@link #getTabname() <em>Tabname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabname()
   * @generated
   * @ordered
   */
  protected Tabname tabname;

  /**
   * The default value of the '{@link #getAdd() <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected static final String ADD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected String add = ADD_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected Constraint constraint;

  /**
   * The default value of the '{@link #getEnable() <em>Enable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnable()
   * @generated
   * @ordered
   */
  protected static final String ENABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnable() <em>Enable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnable()
   * @generated
   * @ordered
   */
  protected String enable = ENABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Alter_tableImpl()
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
    return DDLPackage.Literals.ALTER_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tabname getTabname()
  {
    return tabname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTabname(Tabname newTabname, NotificationChain msgs)
  {
    Tabname oldTabname = tabname;
    tabname = newTabname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__TABNAME, oldTabname, newTabname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTabname(Tabname newTabname)
  {
    if (newTabname != tabname)
    {
      NotificationChain msgs = null;
      if (tabname != null)
        msgs = ((InternalEObject)tabname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DDLPackage.ALTER_TABLE__TABNAME, null, msgs);
      if (newTabname != null)
        msgs = ((InternalEObject)newTabname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DDLPackage.ALTER_TABLE__TABNAME, null, msgs);
      msgs = basicSetTabname(newTabname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__TABNAME, newTabname, newTabname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdd()
  {
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdd(String newAdd)
  {
    String oldAdd = add;
    add = newAdd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__ADD, oldAdd, add));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs)
  {
    Constraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(Constraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DDLPackage.ALTER_TABLE__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DDLPackage.ALTER_TABLE__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnable()
  {
    return enable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnable(String newEnable)
  {
    String oldEnable = enable;
    enable = newEnable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__ENABLE, oldEnable, enable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DDLPackage.ALTER_TABLE__ID, oldId, id));
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
      case DDLPackage.ALTER_TABLE__TABNAME:
        return basicSetTabname(null, msgs);
      case DDLPackage.ALTER_TABLE__CONSTRAINT:
        return basicSetConstraint(null, msgs);
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
      case DDLPackage.ALTER_TABLE__TABNAME:
        return getTabname();
      case DDLPackage.ALTER_TABLE__ADD:
        return getAdd();
      case DDLPackage.ALTER_TABLE__CONSTRAINT:
        return getConstraint();
      case DDLPackage.ALTER_TABLE__ENABLE:
        return getEnable();
      case DDLPackage.ALTER_TABLE__ID:
        return getId();
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
      case DDLPackage.ALTER_TABLE__TABNAME:
        setTabname((Tabname)newValue);
        return;
      case DDLPackage.ALTER_TABLE__ADD:
        setAdd((String)newValue);
        return;
      case DDLPackage.ALTER_TABLE__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case DDLPackage.ALTER_TABLE__ENABLE:
        setEnable((String)newValue);
        return;
      case DDLPackage.ALTER_TABLE__ID:
        setId((String)newValue);
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
      case DDLPackage.ALTER_TABLE__TABNAME:
        setTabname((Tabname)null);
        return;
      case DDLPackage.ALTER_TABLE__ADD:
        setAdd(ADD_EDEFAULT);
        return;
      case DDLPackage.ALTER_TABLE__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case DDLPackage.ALTER_TABLE__ENABLE:
        setEnable(ENABLE_EDEFAULT);
        return;
      case DDLPackage.ALTER_TABLE__ID:
        setId(ID_EDEFAULT);
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
      case DDLPackage.ALTER_TABLE__TABNAME:
        return tabname != null;
      case DDLPackage.ALTER_TABLE__ADD:
        return ADD_EDEFAULT == null ? add != null : !ADD_EDEFAULT.equals(add);
      case DDLPackage.ALTER_TABLE__CONSTRAINT:
        return constraint != null;
      case DDLPackage.ALTER_TABLE__ENABLE:
        return ENABLE_EDEFAULT == null ? enable != null : !ENABLE_EDEFAULT.equals(enable);
      case DDLPackage.ALTER_TABLE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
    result.append(" (add: ");
    result.append(add);
    result.append(", enable: ");
    result.append(enable);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //Alter_tableImpl
