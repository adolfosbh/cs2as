/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.Qualification;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl#getQualifications <em>Qualifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationDefImpl extends MinimalEObjectImpl.Container implements QualificationDef
{
  /**
   * The cached value of the '{@link #getQualifications() <em>Qualifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifications()
   * @generated
   * @ordered
   */
  protected EList<Qualification> qualifications;

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
  public EList<Qualification> getQualifications()
  {
    if (qualifications == null)
    {
      qualifications = new EObjectContainmentEList<Qualification>(Qualification.class, this, Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFICATIONS);
    }
    return qualifications;
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFICATIONS:
        return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFICATIONS:
        return getQualifications();
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFICATIONS:
        getQualifications().clear();
        getQualifications().addAll((Collection<? extends Qualification>)newValue);
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFICATIONS:
        getQualifications().clear();
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFICATIONS:
        return qualifications != null && !qualifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QualificationDefImpl
