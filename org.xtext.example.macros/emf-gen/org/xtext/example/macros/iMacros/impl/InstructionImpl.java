/**
 */
package org.xtext.example.macros.iMacros.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.macros.iMacros.IMacrosPackage;
import org.xtext.example.macros.iMacros.Instruction;

import org.xtext.example.macros.iMacros.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IMacrosPackage.Literals.INSTRUCTION;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitInstruction(this);
	}

} //InstructionImpl
