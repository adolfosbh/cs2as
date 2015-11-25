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
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occluding Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl#getContibution <em>Contibution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccludingDefImpl extends MinimalEObjectImpl.Container implements OccludingDef
{
  /**
   * The cached value of the '{@link #getContibution() <em>Contibution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContibution()
   * @generated
   * @ordered
   */
  protected EList<ElementsContribExp> contibution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OccludingDefImpl()
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
    return Cs2as_dslPackage.Literals.OCCLUDING_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementsContribExp> getContibution()
  {
    if (contibution == null)
    {
      contibution = new EObjectContainmentEList<ElementsContribExp>(ElementsContribExp.class, this, Cs2as_dslPackage.OCCLUDING_DEF__CONTIBUTION);
    }
    return contibution;
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTIBUTION:
        return ((InternalEList<?>)getContibution()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTIBUTION:
        return getContibution();
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTIBUTION:
        getContibution().clear();
        getContibution().addAll((Collection<? extends ElementsContribExp>)newValue);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTIBUTION:
        getContibution().clear();
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTIBUTION:
        return contibution != null && !contibution.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OccludingDefImpl
