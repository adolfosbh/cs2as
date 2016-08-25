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

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames;
import uk.ac.york.cs.cs2as.cs2as_dsl.Qualification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationImpl#getQualifiedClasses <em>Qualified Classes</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationImpl#getContributions <em>Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationImpl extends MinimalEObjectImpl.Container implements Qualification
{
  /**
   * The cached value of the '{@link #getQualifiedClasses() <em>Qualified Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedClasses()
   * @generated
   * @ordered
   */
  protected MultiplePathNames qualifiedClasses;

  /**
   * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributions()
   * @generated
   * @ordered
   */
  protected EList<ExpCS> contributions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualificationImpl()
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
    return Cs2as_dslPackage.Literals.QUALIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplePathNames getQualifiedClasses()
  {
    return qualifiedClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiedClasses(MultiplePathNames newQualifiedClasses, NotificationChain msgs)
  {
    MultiplePathNames oldQualifiedClasses = qualifiedClasses;
    qualifiedClasses = newQualifiedClasses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES, oldQualifiedClasses, newQualifiedClasses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedClasses(MultiplePathNames newQualifiedClasses)
  {
    if (newQualifiedClasses != qualifiedClasses)
    {
      NotificationChain msgs = null;
      if (qualifiedClasses != null)
        msgs = ((InternalEObject)qualifiedClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES, null, msgs);
      if (newQualifiedClasses != null)
        msgs = ((InternalEObject)newQualifiedClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES, null, msgs);
      msgs = basicSetQualifiedClasses(newQualifiedClasses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES, newQualifiedClasses, newQualifiedClasses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpCS> getContributions()
  {
    if (contributions == null)
    {
      contributions = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, Cs2as_dslPackage.QUALIFICATION__CONTRIBUTIONS);
    }
    return contributions;
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
      case Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES:
        return basicSetQualifiedClasses(null, msgs);
      case Cs2as_dslPackage.QUALIFICATION__CONTRIBUTIONS:
        return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES:
        return getQualifiedClasses();
      case Cs2as_dslPackage.QUALIFICATION__CONTRIBUTIONS:
        return getContributions();
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
      case Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES:
        setQualifiedClasses((MultiplePathNames)newValue);
        return;
      case Cs2as_dslPackage.QUALIFICATION__CONTRIBUTIONS:
        getContributions().clear();
        getContributions().addAll((Collection<? extends ExpCS>)newValue);
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
      case Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES:
        setQualifiedClasses((MultiplePathNames)null);
        return;
      case Cs2as_dslPackage.QUALIFICATION__CONTRIBUTIONS:
        getContributions().clear();
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
      case Cs2as_dslPackage.QUALIFICATION__QUALIFIED_CLASSES:
        return qualifiedClasses != null;
      case Cs2as_dslPackage.QUALIFICATION__CONTRIBUTIONS:
        return contributions != null && !contributions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QualificationImpl
