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

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl#getQualifiedClass <em>Qualified Class</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl#getContribution <em>Contribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationDefImpl extends MinimalEObjectImpl.Container implements QualificationDef
{
  /**
   * The cached value of the '{@link #getQualifiedClass() <em>Qualified Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedClass()
   * @generated
   * @ordered
   */
  protected TypedRefCS qualifiedClass;

  /**
   * The cached value of the '{@link #getContribution() <em>Contribution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected EList<ElementsContribExp> contribution;

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
  public TypedRefCS getQualifiedClass()
  {
    return qualifiedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiedClass(TypedRefCS newQualifiedClass, NotificationChain msgs)
  {
    TypedRefCS oldQualifiedClass = qualifiedClass;
    qualifiedClass = newQualifiedClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS, oldQualifiedClass, newQualifiedClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedClass(TypedRefCS newQualifiedClass)
  {
    if (newQualifiedClass != qualifiedClass)
    {
      NotificationChain msgs = null;
      if (qualifiedClass != null)
        msgs = ((InternalEObject)qualifiedClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS, null, msgs);
      if (newQualifiedClass != null)
        msgs = ((InternalEObject)newQualifiedClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS, null, msgs);
      msgs = basicSetQualifiedClass(newQualifiedClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS, newQualifiedClass, newQualifiedClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementsContribExp> getContribution()
  {
    if (contribution == null)
    {
      contribution = new EObjectContainmentEList<ElementsContribExp>(ElementsContribExp.class, this, Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION);
    }
    return contribution;
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS:
        return basicSetQualifiedClass(null, msgs);
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        return ((InternalEList<?>)getContribution()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS:
        return getQualifiedClass();
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        return getContribution();
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS:
        setQualifiedClass((TypedRefCS)newValue);
        return;
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        getContribution().clear();
        getContribution().addAll((Collection<? extends ElementsContribExp>)newValue);
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS:
        setQualifiedClass((TypedRefCS)null);
        return;
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        getContribution().clear();
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
      case Cs2as_dslPackage.QUALIFICATION_DEF__QUALIFIED_CLASS:
        return qualifiedClass != null;
      case Cs2as_dslPackage.QUALIFICATION_DEF__CONTRIBUTION:
        return contribution != null && !contribution.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QualificationDefImpl
