/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.companies.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\internal\cs2as\CS2ASTransformer.java
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
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.xtext.example.companies.tx;

import java.util.List;

import org.xtext.example.companies.tx.Transformer;

public interface CS2ASTransformer extends Transformer {

	public List<CS2ASDiagnostic> getErrors();
}
