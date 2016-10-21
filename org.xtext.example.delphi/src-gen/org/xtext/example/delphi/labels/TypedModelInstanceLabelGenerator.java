/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.delphi.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd-master\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\labels\TypedModelInstanceLabelGenerator.java
 *
 * Do not edit this file. 
 */
/*******************************************************************************
 * Copyright (c) 2015, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.xtext.example.delphi.labels;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.labels.AbstractLabelGenerator;
import org.xtext.example.delphi.tx.TypedModelInstance;

/**
 * at-since 1.1
 */
public final class TypedModelInstanceLabelGenerator extends AbstractLabelGenerator<TypedModelInstance>
{
	public static void initialize(Registry registry) {
		registry.install(TypedModelInstance.class, new TypedModelInstanceLabelGenerator());		
	}
	
	public TypedModelInstanceLabelGenerator() {
		super(TypedModelInstance.class);
	}

	@Override
	public void buildLabelFor(@NonNull Builder labelBuilder, @NonNull TypedModelInstance element) {
		labelBuilder.appendString(element.getName());
	}
}