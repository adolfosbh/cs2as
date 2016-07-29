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

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disambiguation Sect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl#getDisambiguations <em>Disambiguations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisambiguationSectImpl extends MinimalEObjectImpl.Container implements DisambiguationSect
{
  /**
   * The cached value of the '{@link #getDisambiguations() <em>Disambiguations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisambiguations()
   * @generated
   * @ordered
   */
  protected EList<ClassDisambiguation> disambiguations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisambiguationSectImpl()
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
    return Cs2as_dslPackage.Literals.DISAMBIGUATION_SECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassDisambiguation> getDisambiguations()
  {
    if (disambiguations == null)
    {
      disambiguations = new EObjectContainmentEList<ClassDisambiguation>(ClassDisambiguation.class, this, Cs2as_dslPackage.DISAMBIGUATION_SECT__DISAMBIGUATIONS);
    }
    return disambiguations;
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
      case Cs2as_dslPackage.DISAMBIGUATION_SECT__DISAMBIGUATIONS:
        return ((InternalEList<?>)getDisambiguations()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.DISAMBIGUATION_SECT__DISAMBIGUATIONS:
        return getDisambiguations();
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
      case Cs2as_dslPackage.DISAMBIGUATION_SECT__DISAMBIGUATIONS:
        getDisambiguations().clear();
        getDisambiguations().addAll((Collection<? extends ClassDisambiguation>)newValue);
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
      case Cs2as_dslPackage.DISAMBIGUATION_SECT__DISAMBIGUATIONS:
        getDisambiguations().clear();
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
      case Cs2as_dslPackage.DISAMBIGUATION_SECT__DISAMBIGUATIONS:
        return disambiguations != null && !disambiguations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DisambiguationSectImpl
