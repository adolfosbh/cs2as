/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.companies.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd-master\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\labels\TransformationInstanceLabelGenerator.java
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
package org.xtext.example.companies.labels;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.labels.AbstractLabelGenerator;
import org.xtext.example.companies.tx.TransformationInstance;

public final class TransformationInstanceLabelGenerator extends AbstractLabelGenerator<TransformationInstance>
{
	public static void initialize(Registry registry) {
		registry.install(TransformationInstance.class, new TransformationInstanceLabelGenerator());
	}

	public TransformationInstanceLabelGenerator() {
		super(TransformationInstance.class);
	}

	@Override
	public void buildLabelFor(@NonNull Builder labelBuilder, @NonNull TransformationInstance element) {
		labelBuilder.appendString(element.getName());
	}
}