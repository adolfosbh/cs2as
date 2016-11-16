/**
 */
package org.xtext.example.delphi.astm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.CatchBlock;
import org.xtext.example.delphi.astm.Statement;
import org.xtext.example.delphi.astm.TryStatement;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.TryStatementImpl#getGuardedStatement <em>Guarded Statement</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.TryStatementImpl#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.TryStatementImpl#getFinalStatement <em>Final Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
	/**
	 * The cached value of the '{@link #getGuardedStatement() <em>Guarded Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardedStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement guardedStatement;

	/**
	 * The cached value of the '{@link #getCatchBlocks() <em>Catch Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchBlock> catchBlocks;

	/**
	 * The cached value of the '{@link #getFinalStatement() <em>Final Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement finalStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.TRY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getGuardedStatement() {
		return guardedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardedStatement(Statement newGuardedStatement, NotificationChain msgs) {
		Statement oldGuardedStatement = guardedStatement;
		guardedStatement = newGuardedStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT, oldGuardedStatement, newGuardedStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardedStatement(Statement newGuardedStatement) {
		if (newGuardedStatement != guardedStatement) {
			NotificationChain msgs = null;
			if (guardedStatement != null)
				msgs = ((InternalEObject)guardedStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT, null, msgs);
			if (newGuardedStatement != null)
				msgs = ((InternalEObject)newGuardedStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT, null, msgs);
			msgs = basicSetGuardedStatement(newGuardedStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT, newGuardedStatement, newGuardedStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchBlock> getCatchBlocks() {
		if (catchBlocks == null) {
			catchBlocks = new EObjectContainmentEList<CatchBlock>(CatchBlock.class, this, AstmPackage.TRY_STATEMENT__CATCH_BLOCKS);
		}
		return catchBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getFinalStatement() {
		return finalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalStatement(Statement newFinalStatement, NotificationChain msgs) {
		Statement oldFinalStatement = finalStatement;
		finalStatement = newFinalStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.TRY_STATEMENT__FINAL_STATEMENT, oldFinalStatement, newFinalStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalStatement(Statement newFinalStatement) {
		if (newFinalStatement != finalStatement) {
			NotificationChain msgs = null;
			if (finalStatement != null)
				msgs = ((InternalEObject)finalStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.TRY_STATEMENT__FINAL_STATEMENT, null, msgs);
			if (newFinalStatement != null)
				msgs = ((InternalEObject)newFinalStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.TRY_STATEMENT__FINAL_STATEMENT, null, msgs);
			msgs = basicSetFinalStatement(newFinalStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.TRY_STATEMENT__FINAL_STATEMENT, newFinalStatement, newFinalStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				return basicSetGuardedStatement(null, msgs);
			case AstmPackage.TRY_STATEMENT__CATCH_BLOCKS:
				return ((InternalEList<?>)getCatchBlocks()).basicRemove(otherEnd, msgs);
			case AstmPackage.TRY_STATEMENT__FINAL_STATEMENT:
				return basicSetFinalStatement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				return getGuardedStatement();
			case AstmPackage.TRY_STATEMENT__CATCH_BLOCKS:
				return getCatchBlocks();
			case AstmPackage.TRY_STATEMENT__FINAL_STATEMENT:
				return getFinalStatement();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				setGuardedStatement((Statement)newValue);
				return;
			case AstmPackage.TRY_STATEMENT__CATCH_BLOCKS:
				getCatchBlocks().clear();
				getCatchBlocks().addAll((Collection<? extends CatchBlock>)newValue);
				return;
			case AstmPackage.TRY_STATEMENT__FINAL_STATEMENT:
				setFinalStatement((Statement)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				setGuardedStatement((Statement)null);
				return;
			case AstmPackage.TRY_STATEMENT__CATCH_BLOCKS:
				getCatchBlocks().clear();
				return;
			case AstmPackage.TRY_STATEMENT__FINAL_STATEMENT:
				setFinalStatement((Statement)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AstmPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				return guardedStatement != null;
			case AstmPackage.TRY_STATEMENT__CATCH_BLOCKS:
				return catchBlocks != null && !catchBlocks.isEmpty();
			case AstmPackage.TRY_STATEMENT__FINAL_STATEMENT:
				return finalStatement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitTryStatement(this);
	}

} //TryStatementImpl
