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

import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Contribution;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl#isIsPreceding <em>Is Preceding</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl#isIsExported <em>Is Exported</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl#getTypeRefs <em>Type Refs</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl#isIsLoaded <em>Is Loaded</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributionImpl extends MinimalEObjectImpl.Container implements Contribution
{
  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected ParameterCS child;

  /**
   * The default value of the '{@link #isIsPreceding() <em>Is Preceding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPreceding()
   * @generated
   * @ordered
   */
  protected static final boolean IS_PRECEDING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsPreceding() <em>Is Preceding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPreceding()
   * @generated
   * @ordered
   */
  protected boolean isPreceding = IS_PRECEDING_EDEFAULT;

  /**
   * The default value of the '{@link #isIsExported() <em>Is Exported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExported()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXPORTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExported() <em>Is Exported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExported()
   * @generated
   * @ordered
   */
  protected boolean isExported = IS_EXPORTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeRefs() <em>Type Refs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRefs()
   * @generated
   * @ordered
   */
  protected EList<PathNameCS> typeRefs;

  /**
   * The default value of the '{@link #isIsLoaded() <em>Is Loaded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLoaded()
   * @generated
   * @ordered
   */
  protected static final boolean IS_LOADED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsLoaded() <em>Is Loaded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLoaded()
   * @generated
   * @ordered
   */
  protected boolean isLoaded = IS_LOADED_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected ExpCS expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContributionImpl()
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
    return Cs2as_dslPackage.Literals.CONTRIBUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterCS getChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChild(ParameterCS newChild, NotificationChain msgs)
  {
    ParameterCS oldChild = child;
    child = newChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__CHILD, oldChild, newChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(ParameterCS newChild)
  {
    if (newChild != child)
    {
      NotificationChain msgs = null;
      if (child != null)
        msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CONTRIBUTION__CHILD, null, msgs);
      if (newChild != null)
        msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CONTRIBUTION__CHILD, null, msgs);
      msgs = basicSetChild(newChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__CHILD, newChild, newChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsPreceding()
  {
    return isPreceding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPreceding(boolean newIsPreceding)
  {
    boolean oldIsPreceding = isPreceding;
    isPreceding = newIsPreceding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__IS_PRECEDING, oldIsPreceding, isPreceding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExported()
  {
    return isExported;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExported(boolean newIsExported)
  {
    boolean oldIsExported = isExported;
    isExported = newIsExported;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__IS_EXPORTED, oldIsExported, isExported));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PathNameCS> getTypeRefs()
  {
    if (typeRefs == null)
    {
      typeRefs = new EObjectContainmentEList<PathNameCS>(PathNameCS.class, this, Cs2as_dslPackage.CONTRIBUTION__TYPE_REFS);
    }
    return typeRefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsLoaded()
  {
    return isLoaded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsLoaded(boolean newIsLoaded)
  {
    boolean oldIsLoaded = isLoaded;
    isLoaded = newIsLoaded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__IS_LOADED, oldIsLoaded, isLoaded));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(ExpCS newExpression, NotificationChain msgs)
  {
    ExpCS oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(ExpCS newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CONTRIBUTION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CONTRIBUTION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CONTRIBUTION__EXPRESSION, newExpression, newExpression));
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
      case Cs2as_dslPackage.CONTRIBUTION__CHILD:
        return basicSetChild(null, msgs);
      case Cs2as_dslPackage.CONTRIBUTION__TYPE_REFS:
        return ((InternalEList<?>)getTypeRefs()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.CONTRIBUTION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case Cs2as_dslPackage.CONTRIBUTION__CHILD:
        return getChild();
      case Cs2as_dslPackage.CONTRIBUTION__IS_PRECEDING:
        return isIsPreceding();
      case Cs2as_dslPackage.CONTRIBUTION__IS_EXPORTED:
        return isIsExported();
      case Cs2as_dslPackage.CONTRIBUTION__TYPE_REFS:
        return getTypeRefs();
      case Cs2as_dslPackage.CONTRIBUTION__IS_LOADED:
        return isIsLoaded();
      case Cs2as_dslPackage.CONTRIBUTION__EXPRESSION:
        return getExpression();
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
      case Cs2as_dslPackage.CONTRIBUTION__CHILD:
        setChild((ParameterCS)newValue);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__IS_PRECEDING:
        setIsPreceding((Boolean)newValue);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__IS_EXPORTED:
        setIsExported((Boolean)newValue);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__TYPE_REFS:
        getTypeRefs().clear();
        getTypeRefs().addAll((Collection<? extends PathNameCS>)newValue);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__IS_LOADED:
        setIsLoaded((Boolean)newValue);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__EXPRESSION:
        setExpression((ExpCS)newValue);
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
      case Cs2as_dslPackage.CONTRIBUTION__CHILD:
        setChild((ParameterCS)null);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__IS_PRECEDING:
        setIsPreceding(IS_PRECEDING_EDEFAULT);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__IS_EXPORTED:
        setIsExported(IS_EXPORTED_EDEFAULT);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__TYPE_REFS:
        getTypeRefs().clear();
        return;
      case Cs2as_dslPackage.CONTRIBUTION__IS_LOADED:
        setIsLoaded(IS_LOADED_EDEFAULT);
        return;
      case Cs2as_dslPackage.CONTRIBUTION__EXPRESSION:
        setExpression((ExpCS)null);
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
      case Cs2as_dslPackage.CONTRIBUTION__CHILD:
        return child != null;
      case Cs2as_dslPackage.CONTRIBUTION__IS_PRECEDING:
        return isPreceding != IS_PRECEDING_EDEFAULT;
      case Cs2as_dslPackage.CONTRIBUTION__IS_EXPORTED:
        return isExported != IS_EXPORTED_EDEFAULT;
      case Cs2as_dslPackage.CONTRIBUTION__TYPE_REFS:
        return typeRefs != null && !typeRefs.isEmpty();
      case Cs2as_dslPackage.CONTRIBUTION__IS_LOADED:
        return isLoaded != IS_LOADED_EDEFAULT;
      case Cs2as_dslPackage.CONTRIBUTION__EXPRESSION:
        return expression != null;
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
    result.append(" (isPreceding: ");
    result.append(isPreceding);
    result.append(", isExported: ");
    result.append(isExported);
    result.append(", isLoaded: ");
    result.append(isLoaded);
    result.append(')');
    return result.toString();
  }

} //ContributionImpl
