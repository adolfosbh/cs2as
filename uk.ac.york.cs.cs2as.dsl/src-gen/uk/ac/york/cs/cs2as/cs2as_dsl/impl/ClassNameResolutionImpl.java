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

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Name Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassNameResolutionImpl extends MinimalEObjectImpl.Container implements ClassNameResolution
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected PathNameCS class_;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<ClassNameResolutionStmnt> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassNameResolutionImpl()
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
    return Cs2as_dslPackage.Literals.CLASS_NAME_RESOLUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathNameCS getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(PathNameCS newClass, NotificationChain msgs)
  {
    PathNameCS oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(PathNameCS newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassNameResolutionStmnt> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<ClassNameResolutionStmnt>(ClassNameResolutionStmnt.class, this, Cs2as_dslPackage.CLASS_NAME_RESOLUTION__STATEMENTS);
    }
    return statements;
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
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS:
        return basicSetClass(null, msgs);
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS:
        return getClass_();
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__STATEMENTS:
        return getStatements();
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
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS:
        setClass((PathNameCS)newValue);
        return;
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends ClassNameResolutionStmnt>)newValue);
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
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS:
        setClass((PathNameCS)null);
        return;
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__STATEMENTS:
        getStatements().clear();
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
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__CLASS:
        return class_ != null;
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassNameResolutionImpl
