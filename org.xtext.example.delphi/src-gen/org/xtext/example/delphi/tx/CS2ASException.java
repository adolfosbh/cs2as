/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.delphi.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\internal\cs2as\CS2ASException.java
 *
 * Do not edit this file. 
 */
/*******************************************************************************
 * Copyright (c) 2015, 2016 Willink Transformations Ltd, University of York and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Adolfo Sanchez-Barbudo Herrera (UoY) - Initial API and implementation
 *******************************************************************************/
package org.xtext.example.delphi.tx;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.values.InvalidValueException;

public class CS2ASException extends InvalidValueException
{
	private static final long serialVersionUID = 1L;

	protected final @NonNull EObject csObject;

	public CS2ASException(@NonNull EObject csObject, @NonNull String message) {
		super(message);
		this.csObject = csObject;
	}

	public @NonNull EObject getCSObject() {
		return csObject;
	}
}
