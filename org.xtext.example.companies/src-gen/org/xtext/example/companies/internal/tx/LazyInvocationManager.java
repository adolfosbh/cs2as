/**
 * This file was copied and re-packaged automatically by
 *     org.xtext.example.companies.build.GenerateCS2AST
 * from 
 *     ..\..\org.eclipse.qvtd-master\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\internal\evaluation\LazyInvocationManager.java
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
package org.xtext.example.companies.internal.tx;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.xtext.example.companies.tx.AbstractInvocationManager;
import org.xtext.example.companies.tx.AbstractTransformer;
import org.xtext.example.companies.tx.Invocation;
import org.xtext.example.companies.tx.InvocationFailedException;
import org.xtext.example.companies.tx.SlotState;

/**
 * InvocationManager supervises and provides thread safety for the lists of blocked and waiting invocations.
 * at-since 1.1
 */
public class LazyInvocationManager extends AbstractInvocationManager
{
	/**
	 * Head of doubly linked list of blocked invocations.
	 */
	private @Nullable AbstractInvocationInternal blockedInvocations = null;

	/**
	 * Head of doubly linked list of unblocked invocations waiting for a re-execution attempt.
	 */
	private @Nullable AbstractInvocationInternal waitingInvocations = null;

	private synchronized void block(@NonNull Invocation invocation, @NonNull SlotState slotState) {
		AbstractInvocationInternal castInvocation = (AbstractInvocationInternal) invocation;
		assert castInvocation.debug_blockedBy == null;
		castInvocation.debug_blockedBy = slotState;
		AbstractInvocationInternal blockedInvocations2 = blockedInvocations;
		if (blockedInvocations2 == null) {
			blockedInvocations = castInvocation;
		}
		else {
			castInvocation.insertAfter(blockedInvocations2.prev);
		}
		slotState.block(invocation);
		if (debugInvocations) {
			AbstractTransformer.INVOCATIONS.println("block " + invocation + " for " + slotState);
		}
	}

	@Override
	public boolean flush() {
		flushInternal();
		AbstractInvocationInternal blockedInvocation = blockedInvocations;
		if (blockedInvocation == null) {
			return true;
		}
		do {
			if (debugInvocations) {
				AbstractTransformer.INVOCATIONS.println("still blocked " + blockedInvocation + " by " + blockedInvocation.debug_blockedBy);
			}
			blockedInvocation = blockedInvocation.next;
		}
		while (blockedInvocation != blockedInvocations);
		return false;
	}

	private void flushInternal() {
		while (waitingInvocations != null) {
			AbstractInvocationInternal invocation = null;
			synchronized (this) {
				AbstractInvocationInternal waitingInvocations2 = waitingInvocations;
				if (waitingInvocations2 != null) {
					invocation = waitingInvocations2;
					waitingInvocations = waitingInvocations2.next;
					if (waitingInvocations == invocation) {
						waitingInvocations = null;
					}
					invocation.remove();
				}
			}
			if (invocation != null) {
				if (debugInvocations) {
					AbstractTransformer.INVOCATIONS.println("re-invoke " + invocation);
				}
				invoke(invocation, false);
			}
		}
	}

	@Override
	public void invoke(@NonNull Invocation invocation, boolean doFlush) {
		try {
			invocation.execute();
			if (debugInvocations) {
				AbstractTransformer.INVOCATIONS.println("done " + invocation);
			}
			if (doFlush) {
				flushInternal();
			}
		}
		catch (InvocationFailedException e) {
			block(invocation, e.slotState);
		}
	}

	@Override
	public synchronized void unblock(@NonNull Invocation invocation) {
		if (debugInvocations) {
			AbstractTransformer.INVOCATIONS.println("unblock " + invocation);
		}
		AbstractInvocationInternal castInvocation = (AbstractInvocationInternal) invocation;
		assert castInvocation.debug_blockedBy != null;
		castInvocation.debug_blockedBy = null;
		if (blockedInvocations == castInvocation) {
			blockedInvocations = castInvocation.next;
			if (blockedInvocations == castInvocation) {
				blockedInvocations = null;
			}
		}
		castInvocation.remove();
		AbstractInvocationInternal waitingInvocations2 = waitingInvocations;
		if (waitingInvocations2 == null) {
			waitingInvocations = castInvocation;
		}
		else {
			castInvocation.insertAfter(waitingInvocations2.prev);
		}
	}
}