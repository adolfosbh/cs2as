/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.xtext.essentialoclcs.impl.ContextCSImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getCsDecl <em>Cs Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getAsDecl <em>As Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ContextCSImpl implements Model
{
  /**
   * The cached value of the '{@link #getCsDecl() <em>Cs Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsDecl()
   * @generated
   * @ordered
   */
  protected CSDecl csDecl;

  /**
   * The cached value of the '{@link #getAsDecl() <em>As Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsDecl()
   * @generated
   * @ordered
   */
  protected ASDecl asDecl;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<ClassMap> mappings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return Cs2as_dslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSDecl getCsDecl()
  {
    return csDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCsDecl(CSDecl newCsDecl, NotificationChain msgs)
  {
    CSDecl oldCsDecl = csDecl;
    csDecl = newCsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__CS_DECL, oldCsDecl, newCsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCsDecl(CSDecl newCsDecl)
  {
    if (newCsDecl != csDecl)
    {
      NotificationChain msgs = null;
      if (csDecl != null)
        msgs = ((InternalEObject)csDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__CS_DECL, null, msgs);
      if (newCsDecl != null)
        msgs = ((InternalEObject)newCsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__CS_DECL, null, msgs);
      msgs = basicSetCsDecl(newCsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__CS_DECL, newCsDecl, newCsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASDecl getAsDecl()
  {
    return asDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsDecl(ASDecl newAsDecl, NotificationChain msgs)
  {
    ASDecl oldAsDecl = asDecl;
    asDecl = newAsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__AS_DECL, oldAsDecl, newAsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsDecl(ASDecl newAsDecl)
  {
    if (newAsDecl != asDecl)
    {
      NotificationChain msgs = null;
      if (asDecl != null)
        msgs = ((InternalEObject)asDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__AS_DECL, null, msgs);
      if (newAsDecl != null)
        msgs = ((InternalEObject)newAsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__AS_DECL, null, msgs);
      msgs = basicSetAsDecl(newAsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__AS_DECL, newAsDecl, newAsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassMap> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<ClassMap>(ClassMap.class, this, Cs2as_dslPackage.MODEL__MAPPINGS);
    }
    return mappings;
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        return basicSetCsDecl(null, msgs);
      case Cs2as_dslPackage.MODEL__AS_DECL:
        return basicSetAsDecl(null, msgs);
      case Cs2as_dslPackage.MODEL__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        return getCsDecl();
      case Cs2as_dslPackage.MODEL__AS_DECL:
        return getAsDecl();
      case Cs2as_dslPackage.MODEL__MAPPINGS:
        return getMappings();
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        setCsDecl((CSDecl)newValue);
        return;
      case Cs2as_dslPackage.MODEL__AS_DECL:
        setAsDecl((ASDecl)newValue);
        return;
      case Cs2as_dslPackage.MODEL__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends ClassMap>)newValue);
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        setCsDecl((CSDecl)null);
        return;
      case Cs2as_dslPackage.MODEL__AS_DECL:
        setAsDecl((ASDecl)null);
        return;
      case Cs2as_dslPackage.MODEL__MAPPINGS:
        getMappings().clear();
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        return csDecl != null;
      case Cs2as_dslPackage.MODEL__AS_DECL:
        return asDecl != null;
      case Cs2as_dslPackage.MODEL__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
