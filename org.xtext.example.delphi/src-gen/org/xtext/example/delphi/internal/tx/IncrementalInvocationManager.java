/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.delphi.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\internal\evaluation\IncrementalInvocationManager.java
 *
 * Do not edit this file. 
 */
/*******************************************************************************
 * Copyright (c) 2013, 2016 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.xtext.example.delphi.internal.tx;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.Executor;

/**
 * InvocationManager supervises and provides thread safety for the lists of blocked and waiting invocations.
 */
public class IncrementalInvocationManager extends AbstractInvocationManagerInternal
{
	public IncrementalInvocationManager(@NonNull Executor executor) {
		super(executor);
	}
}