/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.companies.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\evaluation\TransformationExecutor.java
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
package org.xtext.example.companies.tx;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.Executor;

/**
 * A TransformationExecutor supervises the execution of an auto-generated transformation.
 *
 * @noimplement
 */
public interface TransformationExecutor extends Executor
{
	@NonNull Transformer getTransformer();
}
