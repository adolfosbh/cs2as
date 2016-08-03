/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isSameScope <em>Same Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isEmptyScope <em>Empty Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isAlsoExports <em>Also Exports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeDefImpl extends ProviderStmntImpl implements ScopeDef
{
  /**
   * The default value of the '{@link #isSameScope() <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameScope()
   * @generated
   * @ordered
   */
  protected static final boolean SAME_SCOPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSameScope() <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameScope()
   * @generated
   * @ordered
   */
  protected boolean sameScope = SAME_SCOPE_EDEFAULT;

  /**
   * The default value of the '{@link #isEmptyScope() <em>Empty Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyScope()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_SCOPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmptyScope() <em>Empty Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyScope()
   * @generated
   * @ordered
   */
  protected boolean emptyScope = EMPTY_SCOPE_EDEFAULT;

  /**
   * The default value of the '{@link #isAlsoExports() <em>Also Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlsoExports()
   * @generated
   * @ordered
   */
  protected static final boolean ALSO_EXPORTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAlsoExports() <em>Also Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlsoExports()
   * @generated
   * @ordered
   */
  protected boolean alsoExports = ALSO_EXPORTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeDefImpl()
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
    return Cs2as_dslPackage.Literals.SCOPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSameScope()
  {
    return sameScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSameScope(boolean newSameScope)
  {
    boolean oldSameScope = sameScope;
    sameScope = newSameScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE, oldSameScope, sameScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmptyScope()
  {
    return emptyScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyScope(boolean newEmptyScope)
  {
    boolean oldEmptyScope = emptyScope;
    emptyScope = newEmptyScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE, oldEmptyScope, emptyScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAlsoExports()
  {
    return alsoExports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlsoExports(boolean newAlsoExports)
  {
    boolean oldAlsoExports = alsoExports;
    alsoExports = newAlsoExports;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS, oldAlsoExports, alsoExports));
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return isSameScope();
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        return isEmptyScope();
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        return isAlsoExports();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        setEmptyScope((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        setAlsoExports((Boolean)newValue);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope(SAME_SCOPE_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        setEmptyScope(EMPTY_SCOPE_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        setAlsoExports(ALSO_EXPORTS_EDEFAULT);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return sameScope != SAME_SCOPE_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        return emptyScope != EMPTY_SCOPE_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        return alsoExports != ALSO_EXPORTS_EDEFAULT;
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
    result.append(" (sameScope: ");
    result.append(sameScope);
    result.append(", emptyScope: ");
    result.append(emptyScope);
    result.append(", alsoExports: ");
    result.append(alsoExports);
    result.append(')');
    return result.toString();
  }

} //ScopeDefImpl
