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

import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl#getProvidedClasses <em>Provided Classes</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl#getContributionsDef <em>Contributions Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl#getOccludingDefs <em>Occluding Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvisionImpl extends MinimalEObjectImpl.Container implements Provision
{
  /**
   * The cached value of the '{@link #getProvidedClasses() <em>Provided Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedClasses()
   * @generated
   * @ordered
   */
  protected MultiplePathNames providedClasses;

  /**
   * The cached value of the '{@link #getContributionsDef() <em>Contributions Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributionsDef()
   * @generated
   * @ordered
   */
  protected ContributionsDef contributionsDef;

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
  protected ProvisionImpl()
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
    return Cs2as_dslPackage.Literals.PROVISION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplePathNames getProvidedClasses()
  {
    return providedClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvidedClasses(MultiplePathNames newProvidedClasses, NotificationChain msgs)
  {
    MultiplePathNames oldProvidedClasses = providedClasses;
    providedClasses = newProvidedClasses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES, oldProvidedClasses, newProvidedClasses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvidedClasses(MultiplePathNames newProvidedClasses)
  {
    if (newProvidedClasses != providedClasses)
    {
      NotificationChain msgs = null;
      if (providedClasses != null)
        msgs = ((InternalEObject)providedClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES, null, msgs);
      if (newProvidedClasses != null)
        msgs = ((InternalEObject)newProvidedClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES, null, msgs);
      msgs = basicSetProvidedClasses(newProvidedClasses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES, newProvidedClasses, newProvidedClasses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionsDef getContributionsDef()
  {
    return contributionsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContributionsDef(ContributionsDef newContributionsDef, NotificationChain msgs)
  {
    ContributionsDef oldContributionsDef = contributionsDef;
    contributionsDef = newContributionsDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF, oldContributionsDef, newContributionsDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContributionsDef(ContributionsDef newContributionsDef)
  {
    if (newContributionsDef != contributionsDef)
    {
      NotificationChain msgs = null;
      if (contributionsDef != null)
        msgs = ((InternalEObject)contributionsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF, null, msgs);
      if (newContributionsDef != null)
        msgs = ((InternalEObject)newContributionsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF, null, msgs);
      msgs = basicSetContributionsDef(newContributionsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF, newContributionsDef, newContributionsDef));
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
      occludingDefs = new EObjectContainmentEList<OccludingDef>(OccludingDef.class, this, Cs2as_dslPackage.PROVISION__OCCLUDING_DEFS);
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
      case Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES:
        return basicSetProvidedClasses(null, msgs);
      case Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF:
        return basicSetContributionsDef(null, msgs);
      case Cs2as_dslPackage.PROVISION__OCCLUDING_DEFS:
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
      case Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES:
        return getProvidedClasses();
      case Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF:
        return getContributionsDef();
      case Cs2as_dslPackage.PROVISION__OCCLUDING_DEFS:
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
      case Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES:
        setProvidedClasses((MultiplePathNames)newValue);
        return;
      case Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF:
        setContributionsDef((ContributionsDef)newValue);
        return;
      case Cs2as_dslPackage.PROVISION__OCCLUDING_DEFS:
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
      case Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES:
        setProvidedClasses((MultiplePathNames)null);
        return;
      case Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF:
        setContributionsDef((ContributionsDef)null);
        return;
      case Cs2as_dslPackage.PROVISION__OCCLUDING_DEFS:
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
      case Cs2as_dslPackage.PROVISION__PROVIDED_CLASSES:
        return providedClasses != null;
      case Cs2as_dslPackage.PROVISION__CONTRIBUTIONS_DEF:
        return contributionsDef != null;
      case Cs2as_dslPackage.PROVISION__OCCLUDING_DEFS:
        return occludingDefs != null && !occludingDefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProvisionImpl
