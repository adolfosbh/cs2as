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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetsDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl#getTargetsDef <em>Targets Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl#getContribution <em>Contribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationDefImpl extends MinimalEObjectImpl.Container implements QualificationDef
{
  /**
   * The cached value of the '{@link #getTargetsDef() <em>Targets Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetsDef()
   * @generated
   * @ordered
   */
  protected TargetsDef targetsDef;

  /**
   * The cached value of the '{@link #getContribution() <em>Contribution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected EList<ElementsContribExp> contribution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualificationDefImpl()
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
    return Cs2as_dslPackage.Literals.QUALIFICATION_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetsDef getTargetsDef()
  {
    return targetsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetsDef(TargetsDef newTargetsDef, NotificationChain msgs)
  {
    TargetsDef oldTargetsDef = targetsDef;
    targetsDef = newTargetsDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF, oldTargetsDef, newTargetsDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetsDef(TargetsDef newTargetsDef)
  {
    if (newTargetsDef != targetsDef)
    {
      NotificationChain msgs = null;
      if (targetsDef != null)
        msgs = ((InternalEObject)targetsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF, null, msgs);
      if (newTargetsDef != null)
        msgs = ((InternalEObject)newTargetsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF, null, msgs);
      msgs = basicSetTargetsDef(newTargetsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF, newTargetsDef, newTargetsDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementsContribExp> getContribution()
  {
    if (contribution == null)
    {
      contribution = new EObjectContainmentEList<ElementsContribExp>(ElementsContribExp.class, this, Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION);
    }
    return contribution;
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF:
        return basicSetTargetsDef(null, msgs);
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        return ((InternalEList<?>)getContribution()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF:
        return getTargetsDef();
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        return getContribution();
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF:
        setTargetsDef((TargetsDef)newValue);
        return;
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        getContribution().clear();
        getContribution().addAll((Collection<? extends ElementsContribExp>)newValue);
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF:
        setTargetsDef((TargetsDef)null);
        return;
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        getContribution().clear();
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__TARGETS_DEF:
        return targetsDef != null;
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        return contribution != null && !contribution.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QualificationDefImpl
