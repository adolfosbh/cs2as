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

import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetsDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provision Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl#getTargetsDef <em>Targets Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl#getOccludingDefs <em>Occluding Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvisionDefImpl extends MinimalEObjectImpl.Container implements ProvisionDef
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
   * The cached value of the '{@link #getContribution() <em>Contribution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected ContributionDef contribution;

  /**
   * The cached value of the '{@link #getOccludingDefs() <em>Occluding Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccludingDefs()
   * @generated
   * @ordered
   */
  protected EList<OccludingDef> occludingDefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvisionDefImpl()
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
    return Cs2as_dslPackage.Literals.PROVISION_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF, oldTargetsDef, newTargetsDef);
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
        msgs = ((InternalEObject)targetsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF, null, msgs);
      if (newTargetsDef != null)
        msgs = ((InternalEObject)newTargetsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF, null, msgs);
      msgs = basicSetTargetsDef(newTargetsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF, newTargetsDef, newTargetsDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionDef getContribution()
  {
    return contribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContribution(ContributionDef newContribution, NotificationChain msgs)
  {
    ContributionDef oldContribution = contribution;
    contribution = newContribution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION, oldContribution, newContribution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContribution(ContributionDef newContribution)
  {
    if (newContribution != contribution)
    {
      NotificationChain msgs = null;
      if (contribution != null)
        msgs = ((InternalEObject)contribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION, null, msgs);
      if (newContribution != null)
        msgs = ((InternalEObject)newContribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION, null, msgs);
      msgs = basicSetContribution(newContribution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION, newContribution, newContribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OccludingDef> getOccludingDefs()
  {
    if (occludingDefs == null)
    {
      occludingDefs = new EObjectContainmentEList<OccludingDef>(OccludingDef.class, this, Cs2as_dslPackage.PROVISION_DEF__OCCLUDING_DEFS);
    }
    return occludingDefs;
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
      case Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF:
        return basicSetTargetsDef(null, msgs);
      case Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION:
        return basicSetContribution(null, msgs);
      case Cs2as_dslPackage.PROVISION_DEF__OCCLUDING_DEFS:
        return ((InternalEList<?>)getOccludingDefs()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF:
        return getTargetsDef();
      case Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION:
        return getContribution();
      case Cs2as_dslPackage.PROVISION_DEF__OCCLUDING_DEFS:
        return getOccludingDefs();
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
      case Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF:
        setTargetsDef((TargetsDef)newValue);
        return;
      case Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION:
        setContribution((ContributionDef)newValue);
        return;
      case Cs2as_dslPackage.PROVISION_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        getOccludingDefs().addAll((Collection<? extends OccludingDef>)newValue);
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
      case Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF:
        setTargetsDef((TargetsDef)null);
        return;
      case Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION:
        setContribution((ContributionDef)null);
        return;
      case Cs2as_dslPackage.PROVISION_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
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
      case Cs2as_dslPackage.PROVISION_DEF__TARGETS_DEF:
        return targetsDef != null;
      case Cs2as_dslPackage.PROVISION_DEF__CONTRIBUTION:
        return contribution != null;
      case Cs2as_dslPackage.PROVISION_DEF__OCCLUDING_DEFS:
        return occludingDefs != null && !occludingDefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProvisionDefImpl
