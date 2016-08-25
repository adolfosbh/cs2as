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

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Path Names</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultiplePathNamesImpl#getPathNames <em>Path Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplePathNamesImpl extends MinimalEObjectImpl.Container implements MultiplePathNames
{
  /**
   * The cached value of the '{@link #getPathNames() <em>Path Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathNames()
   * @generated
   * @ordered
   */
  protected EList<PathNameCS> pathNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplePathNamesImpl()
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
    return Cs2as_dslPackage.Literals.MULTIPLE_PATH_NAMES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PathNameCS> getPathNames()
  {
    if (pathNames == null)
    {
      pathNames = new EObjectContainmentEList<PathNameCS>(PathNameCS.class, this, Cs2as_dslPackage.MULTIPLE_PATH_NAMES__PATH_NAMES);
    }
    return pathNames;
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
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES__PATH_NAMES:
        return ((InternalEList<?>)getPathNames()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES__PATH_NAMES:
        return getPathNames();
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
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES__PATH_NAMES:
        getPathNames().clear();
        getPathNames().addAll((Collection<? extends PathNameCS>)newValue);
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
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES__PATH_NAMES:
        getPathNames().clear();
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
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES__PATH_NAMES:
        return pathNames != null && !pathNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MultiplePathNamesImpl
