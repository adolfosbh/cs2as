/**
 * This file was copied and re-packaged automatically by
 *     uk.ac.york.cs.asbh.ASBHLang
 * from 
 *     ..\..\org.eclipse.qvtd-master\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\library\model\ModelObjectsOfKindOperation.java
 *
 * Do not edit this file. 
 */
/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package uk.ac.york.cs.asbh.cs2as.library.model;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import uk.ac.york.cs.asbh.cs2as.tx.TypedModelInstance;

/**
 * ModelObjectsOfKindOperation realises the Model::objectsOfKind() library operation.
 * @since 1.1
 */
public class ModelObjectsOfKindOperation extends AbstractBinaryOperation
{
	public static final @NonNull ModelObjectsOfKindOperation INSTANCE = new ModelObjectsOfKindOperation();

	@Override
	public @NonNull SetValue evaluate(@NonNull Executor executor, @NonNull TypeId returnTypeId, @Nullable Object sourceVal, @Nullable Object typeVal) {
		org.eclipse.ocl.pivot.Class type = asClass(typeVal);
		if (!(sourceVal instanceof TypedModelInstance)) {
			throw new InvalidValueException(PivotMessages.TypedValueRequired, "TypedModelInstance", getTypeName(sourceVal));
		}
		TypedModelInstance typedModelInstance = (TypedModelInstance)sourceVal;
		Collection<@NonNull ? extends Object> results = typedModelInstance.getObjectsOfKind(type);
		return createSetValue((CollectionTypeId)returnTypeId, new ArrayList<@NonNull Object>(results));
	}
}
