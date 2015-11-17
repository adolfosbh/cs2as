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

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import org.eclipse.ocl.xtext.essentialoclcs.impl.ExpCSImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl#isFromExp <em>From Exp</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupExpCSImpl extends ExpCSImpl implements LookupExpCS
{
  /**
   * The default value of the '{@link #isFromExp() <em>From Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFromExp()
   * @generated
   * @ordered
   */
  protected static final boolean FROM_EXP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFromExp() <em>From Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFromExp()
   * @generated
   * @ordered
   */
  protected boolean fromExp = FROM_EXP_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<ExpCS> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LookupExpCSImpl()
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
    return Cs2as_dslPackage.Literals.LOOKUP_EXP_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFromExp()
  {
    return fromExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromExp(boolean newFromExp)
  {
    boolean oldFromExp = fromExp;
    fromExp = newFromExp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.LOOKUP_EXP_CS__FROM_EXP, oldFromExp, fromExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpCS> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, Cs2as_dslPackage.LOOKUP_EXP_CS__ARGS);
    }
    return args;
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
      case Cs2as_dslPackage.LOOKUP_EXP_CS__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.LOOKUP_EXP_CS__FROM_EXP:
        return isFromExp();
      case Cs2as_dslPackage.LOOKUP_EXP_CS__ARGS:
        return getArgs();
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
      case Cs2as_dslPackage.LOOKUP_EXP_CS__FROM_EXP:
        setFromExp((Boolean)newValue);
        return;
      case Cs2as_dslPackage.LOOKUP_EXP_CS__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends ExpCS>)newValue);
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
      case Cs2as_dslPackage.LOOKUP_EXP_CS__FROM_EXP:
        setFromExp(FROM_EXP_EDEFAULT);
        return;
      case Cs2as_dslPackage.LOOKUP_EXP_CS__ARGS:
        getArgs().clear();
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
      case Cs2as_dslPackage.LOOKUP_EXP_CS__FROM_EXP:
        return fromExp != FROM_EXP_EDEFAULT;
      case Cs2as_dslPackage.LOOKUP_EXP_CS__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (fromExp: ");
    result.append(fromExp);
    result.append(')');
    return result.toString();
  }

} //LookupExpCSImpl
