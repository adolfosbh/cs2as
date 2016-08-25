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
import uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence;
import uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escape Sequence Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceDefImpl#getEscapes <em>Escapes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EscapeSequenceDefImpl extends MinimalEObjectImpl.Container implements EscapeSequenceDef
{
  /**
   * The cached value of the '{@link #getEscapes() <em>Escapes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscapes()
   * @generated
   * @ordered
   */
  protected EList<EscapeSequence> escapes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EscapeSequenceDefImpl()
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
    return Cs2as_dslPackage.Literals.ESCAPE_SEQUENCE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EscapeSequence> getEscapes()
  {
    if (escapes == null)
    {
      escapes = new EObjectContainmentEList<EscapeSequence>(EscapeSequence.class, this, Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF__ESCAPES);
    }
    return escapes;
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
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF__ESCAPES:
        return ((InternalEList<?>)getEscapes()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF__ESCAPES:
        return getEscapes();
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
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF__ESCAPES:
        getEscapes().clear();
        getEscapes().addAll((Collection<? extends EscapeSequence>)newValue);
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
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF__ESCAPES:
        getEscapes().clear();
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
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF__ESCAPES:
        return escapes != null && !escapes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EscapeSequenceDefImpl
