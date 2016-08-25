/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provider;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl#getVarsDecl <em>Vars Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl#getCurrentScope <em>Current Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl#getExportedScope <em>Exported Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends MinimalEObjectImpl.Container implements Provider
{
  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected PathNameCS classRef;

  /**
   * The cached value of the '{@link #getVarsDecl() <em>Vars Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarsDecl()
   * @generated
   * @ordered
   */
  protected ProviderVarsDecl varsDecl;

  /**
   * The cached value of the '{@link #getCurrentScope() <em>Current Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentScope()
   * @generated
   * @ordered
   */
  protected CurrentScopeDecl currentScope;

  /**
   * The cached value of the '{@link #getExportedScope() <em>Exported Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportedScope()
   * @generated
   * @ordered
   */
  protected ExportedScopeDecl exportedScope;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProviderImpl()
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
    return Cs2as_dslPackage.Literals.PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathNameCS getClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassRef(PathNameCS newClassRef, NotificationChain msgs)
  {
    PathNameCS oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__CLASS_REF, oldClassRef, newClassRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(PathNameCS newClassRef)
  {
    if (newClassRef != classRef)
    {
      NotificationChain msgs = null;
      if (classRef != null)
        msgs = ((InternalEObject)classRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__CLASS_REF, null, msgs);
      if (newClassRef != null)
        msgs = ((InternalEObject)newClassRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__CLASS_REF, null, msgs);
      msgs = basicSetClassRef(newClassRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__CLASS_REF, newClassRef, newClassRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderVarsDecl getVarsDecl()
  {
    return varsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarsDecl(ProviderVarsDecl newVarsDecl, NotificationChain msgs)
  {
    ProviderVarsDecl oldVarsDecl = varsDecl;
    varsDecl = newVarsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__VARS_DECL, oldVarsDecl, newVarsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarsDecl(ProviderVarsDecl newVarsDecl)
  {
    if (newVarsDecl != varsDecl)
    {
      NotificationChain msgs = null;
      if (varsDecl != null)
        msgs = ((InternalEObject)varsDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__VARS_DECL, null, msgs);
      if (newVarsDecl != null)
        msgs = ((InternalEObject)newVarsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__VARS_DECL, null, msgs);
      msgs = basicSetVarsDecl(newVarsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__VARS_DECL, newVarsDecl, newVarsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentScopeDecl getCurrentScope()
  {
    return currentScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrentScope(CurrentScopeDecl newCurrentScope, NotificationChain msgs)
  {
    CurrentScopeDecl oldCurrentScope = currentScope;
    currentScope = newCurrentScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE, oldCurrentScope, newCurrentScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentScope(CurrentScopeDecl newCurrentScope)
  {
    if (newCurrentScope != currentScope)
    {
      NotificationChain msgs = null;
      if (currentScope != null)
        msgs = ((InternalEObject)currentScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE, null, msgs);
      if (newCurrentScope != null)
        msgs = ((InternalEObject)newCurrentScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE, null, msgs);
      msgs = basicSetCurrentScope(newCurrentScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE, newCurrentScope, newCurrentScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportedScopeDecl getExportedScope()
  {
    return exportedScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExportedScope(ExportedScopeDecl newExportedScope, NotificationChain msgs)
  {
    ExportedScopeDecl oldExportedScope = exportedScope;
    exportedScope = newExportedScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE, oldExportedScope, newExportedScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExportedScope(ExportedScopeDecl newExportedScope)
  {
    if (newExportedScope != exportedScope)
    {
      NotificationChain msgs = null;
      if (exportedScope != null)
        msgs = ((InternalEObject)exportedScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE, null, msgs);
      if (newExportedScope != null)
        msgs = ((InternalEObject)newExportedScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE, null, msgs);
      msgs = basicSetExportedScope(newExportedScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE, newExportedScope, newExportedScope));
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
      case Cs2as_dslPackage.PROVIDER__CLASS_REF:
        return basicSetClassRef(null, msgs);
      case Cs2as_dslPackage.PROVIDER__VARS_DECL:
        return basicSetVarsDecl(null, msgs);
      case Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE:
        return basicSetCurrentScope(null, msgs);
      case Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE:
        return basicSetExportedScope(null, msgs);
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
      case Cs2as_dslPackage.PROVIDER__CLASS_REF:
        return getClassRef();
      case Cs2as_dslPackage.PROVIDER__VARS_DECL:
        return getVarsDecl();
      case Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE:
        return getCurrentScope();
      case Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE:
        return getExportedScope();
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
      case Cs2as_dslPackage.PROVIDER__CLASS_REF:
        setClassRef((PathNameCS)newValue);
        return;
      case Cs2as_dslPackage.PROVIDER__VARS_DECL:
        setVarsDecl((ProviderVarsDecl)newValue);
        return;
      case Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE:
        setCurrentScope((CurrentScopeDecl)newValue);
        return;
      case Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE:
        setExportedScope((ExportedScopeDecl)newValue);
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
      case Cs2as_dslPackage.PROVIDER__CLASS_REF:
        setClassRef((PathNameCS)null);
        return;
      case Cs2as_dslPackage.PROVIDER__VARS_DECL:
        setVarsDecl((ProviderVarsDecl)null);
        return;
      case Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE:
        setCurrentScope((CurrentScopeDecl)null);
        return;
      case Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE:
        setExportedScope((ExportedScopeDecl)null);
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
      case Cs2as_dslPackage.PROVIDER__CLASS_REF:
        return classRef != null;
      case Cs2as_dslPackage.PROVIDER__VARS_DECL:
        return varsDecl != null;
      case Cs2as_dslPackage.PROVIDER__CURRENT_SCOPE:
        return currentScope != null;
      case Cs2as_dslPackage.PROVIDER__EXPORTED_SCOPE:
        return exportedScope != null;
    }
    return super.eIsSet(featureID);
  }

} //ProviderImpl
