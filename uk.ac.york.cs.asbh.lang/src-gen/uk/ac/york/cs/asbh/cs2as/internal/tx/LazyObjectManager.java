/**
 * This file was copied and re-packaged automatically by
 *     uk.ac.york.cs.asbh.ASBHLang
 * from 
 *     ..\..\org.eclipse.qvtd-master\plugins\org.eclipse.qvtd.runtime\src\org\eclipse\qvtd\runtime\internal\evaluation\LazyObjectManager.java
 *
 * Do not edit this file. 
 */
/*******************************************************************************
 * Copyright (c) 2013, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package uk.ac.york.cs.asbh.cs2as.internal.tx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage;
import uk.ac.york.cs.asbh.cs2as.tx.AbstractObjectManager;
import uk.ac.york.cs.asbh.cs2as.tx.AbstractSlotState;
import uk.ac.york.cs.asbh.cs2as.tx.AbstractTransformer;
import uk.ac.york.cs.asbh.cs2as.tx.Invocation;
import uk.ac.york.cs.asbh.cs2as.tx.InvocationFailedException;
import uk.ac.york.cs.asbh.cs2as.tx.ObjectManager;
import uk.ac.york.cs.asbh.cs2as.tx.SlotState;

/**
 * @since 1.1
 */
public class LazyObjectManager extends AbstractObjectManager
{
	/**
	 * EOppositeReferenceImpl is used internally to reify the missing EReference.eOpposite. The instances should not be used
	 * externally since they violate many WFRs. Only getEOpposite() is useful.
	 */
	protected static class EOppositeReferenceImpl extends EReferenceImpl
	{
		public EOppositeReferenceImpl(@NonNull EReference eReference) {
			assert eReference.getEOpposite() == null;
			setEOpposite(eReference);
		}

		@Override
		public EClass basicGetEReferenceType() {
			throw new UnsupportedOperationException();
		}

		@Override
		public EClassifier basicGetEType() {
			throw new UnsupportedOperationException();
		}

		@Override
		public EClass getEContainingClass() {
			return getEOpposite().getEReferenceType();
		}

		@Override
		public EGenericType getEGenericType() {
			throw new UnsupportedOperationException();
		}

		@Override
		public EClass getEReferenceType() {
			return getEOpposite().getEContainingClass();
		}

		@Override
		public EClassifier getEType() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int getLowerBound() {
			throw new UnsupportedOperationException();
		}

		@Override
		public String getName() {
			return "«opposite»" + getEOpposite().getName();
		}

		@Override
		public String getNameGen() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int getUpperBound() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isChangeable() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isContainer() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isContainment() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isDerived() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isOrdered() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isTransient() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isUnique() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isVolatile() {
			throw new UnsupportedOperationException();
		}
	}
	
	/**
	 * Simple SlotState describing a DataType element or 1:1 Object navigation.
	 */
	public static abstract class BasicSlotState extends AbstractSlotState
	{
		public enum SlotMode {
			ASSIGNABLE,		// No assignment has been performed, object reads are blocked (collections reads may be unblocked)
			ASSIGNED		// Last assignment has been performed, reads are unblocked
		}
		
		protected final @NonNull Object debug_eObject; 
		protected final @NonNull EStructuralFeature debug_eFeature; 
		protected @NonNull SlotMode mode;
		private @Nullable Object blockedInvocations = null;
		
		protected BasicSlotState(@NonNull Object eObject, @NonNull EStructuralFeature eFeature) {
			mode = SlotMode.ASSIGNABLE;	
			this.debug_eObject = eObject;
			this.debug_eFeature = eFeature;
		}

		protected BasicSlotState(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			mode = SlotMode.ASSIGNED;	
			this.debug_eObject = eObject;
			this.debug_eFeature = eFeature;
			assert !(eFeature instanceof EOppositeReferenceImpl);
		}

		public synchronized void assigned(@NonNull LazyObjectManager objectManager, @NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			switch (mode) {
				case ASSIGNABLE:
					mode = SlotMode.ASSIGNED;
					unblock(objectManager);
					break;
				case ASSIGNED:
					System.out.println("Re-assignment of " + eFeature.getEContainingClass().getName() + "::" + eFeature.getName() + " for " + eObject + " with " + ecoreValue);
					break;
			}
		}
		
		@Override
		public synchronized void block(@NonNull Invocation invocation) {
			final Object blockedInvocations2 = blockedInvocations;
			if (blockedInvocations2 == null) {
				blockedInvocations = invocation;
			}
			else if (blockedInvocations2 instanceof Invocation) {
				List<Invocation> blockedInvocationList = new ArrayList<Invocation>();
				blockedInvocationList.add((Invocation) blockedInvocations2);
				blockedInvocationList.add(invocation);
				blockedInvocations = blockedInvocationList;
			}
			else {
				@SuppressWarnings("unchecked")
				List<Invocation> blockedInvocationList = (List<Invocation>)blockedInvocations2;
				blockedInvocationList.add(invocation);
			}
		}
		
		@Override
		public synchronized void getting(@NonNull Object eObject, @NonNull EStructuralFeature eFeature) {
			switch (mode) {
				case ASSIGNABLE:
					throw new InvocationFailedException(this);
				case ASSIGNED:
					break;
			}
		}

		protected boolean isAssigned() {
			return mode == SlotMode.ASSIGNED;
		}

		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			s.append(getClass().getSimpleName());
			s.append("@");
			s.append(Integer.toHexString(System.identityHashCode(this)));
			s.append("[");
			s.append(debug_eFeature.getEContainingClass().getName());
			s.append("::");
			s.append(debug_eFeature.getName());
			s.append(" for ");
			s.append(debug_eObject);
			s.append("]");
			return s.toString();
		}

		protected synchronized void unblock(@NonNull ObjectManager objectManager) {
			final Object blockedInvocations2 = blockedInvocations;
			if (blockedInvocations2 instanceof Invocation) {
				objectManager.unblock((Invocation) blockedInvocations2);
			}
			else if (blockedInvocations2 != null) {
				@SuppressWarnings("unchecked")
				List<Invocation> blockedInvocationList = (List<Invocation>)blockedInvocations2;
				for (@SuppressWarnings("null")@NonNull Invocation invocation : blockedInvocationList) {
					objectManager.unblock(invocation);
				}
			}
			blockedInvocations = null;
		}
	}
	
	/**
	 * SlotState describing the contained element side of a 1:N Object navigation.
	 * A single OneToManyContainedSlotState is shared by each of the possible containing features and also the
	 * generic OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER corresponding to eContainer().
	 * The eGet() must therefore check not only that the proprty is assigned but also that it is
	 * assigned to the containing feature of interest.
	 * <br>
	 * Lifecycle (read first, write later):
	 * Create due to
	 * - get of an aggregator => ASSIGNABLE, blocked
	 * Unblock
	 * - assign of possibly null aggregator for the element, ASSIGNABLE, blocked => ASSIGNED, not blocked
	 * - non-null aggregator is notified to unblock 
	 * Thereafter
	 * - get of aggregator ASSIGNED => ASSIGNED
	 * <br>
	 * Lifecycle (write first):
	 * Create due to
	 * - assign of a possibly null aggregator => ASSIGNED, unblocked
	 * - non-null aggregator is notified to unblock 
	 * Thereafter
	 * - get of aggregator ASSIGNED => ASSIGNED
	 *
	private static class ContainedSlotState extends SlotState
	{
		public static @NonNull SlotState create(@NonNull ObjectManager objectManager,
				@NonNull EObject eObject, @NonNull EReference eFeature, @Nullable EReference eOppositeFeature, @Nullable EObject eContainer) {
			if (eOppositeFeature == null) {
				eOppositeFeature = OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER;
				assert eOppositeFeature != null;
			}
			if (eContainer != null) {
				ContainerSlotState aggregatorSlotState = (ContainerSlotState) objectManager.getSlotState(eContainer, eOppositeFeature);
				aggregatorSlotState.assignedElement(objectManager, eContainer, eOppositeFeature, eObject);
			}
			return new ContainedSlotState(eObject, eFeature, eContainer);
		}
		
		public ContainedSlotState(@NonNull EObject eObject, @NonNull EReference eFeature) {
			super(eObject, eFeature);
			assert !eFeature.isMany();
			if (eFeature != OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {	// FIXME ensure oclContainer() composes
				assert eFeature.isContainment();
				assert eFeature.getEOpposite() != null;
			}
//			assert eFeature.getEOpposite().isMany();
		}
		
		private ContainedSlotState(@NonNull EObject eObject, @NonNull EReference eFeature, @Nullable EObject eContainer) {
			super(eObject, eFeature, eContainer);
			assert !eFeature.isMany();
			if (eFeature != OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {	// FIXME ensure oclContainer() composes
				assert eFeature.isContainment();
			}
//			assert eFeature.getEOpposite().isMany();
			assert eObject.eContainer() == eContainer;
		}

		@Override
		public synchronized void assigned(@NonNull ObjectManager objectManager, @NonNull EObject eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			if (!isAssigned() && (ecoreValue != null)) {
				EObject eOpposite = (EObject) ecoreValue;
				EReference eOppositeReference = ((EReference)eFeature).getEOpposite();
				assert eOppositeReference != null;
				ContainerSlotState aggregatorSlotState = (ContainerSlotState) objectManager.getSlotState(eOpposite, eOppositeReference);
				aggregatorSlotState.assignedElement(objectManager, eOpposite, eOppositeReference, eObject);
			}
			super.assigned(objectManager, eObject, eFeature, ecoreValue);
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public synchronized @Nullable <G> G get(@NonNull ObjectManager objectManager, @NonNull EObject eObject, @NonNull EStructuralFeature eFeature) {
			switch (mode) {
				case ASSIGNABLE:
					throw new InvocationFailedException(this);
				case ASSIGNED:
					break;
			}
			if (eFeature != OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
				EStructuralFeature eContainingFeature = eObject.eContainingFeature();
				if (eContainingFeature != eFeature) {
					return null;
				}
			}
			return (G) eObject.eContainer();
		}
	} */
	
	/**
	 * SlotState describing the container side of a 1:N Object navigation.
	 * <br>
	 * Lifecycle:
	 * Create due to
	 * - get of all elements => ASSIGNABLE, blocked
	 * NO: - get of a container => ASSIGNABLE, blocked
	 * Create due to
	 * - assign of all elements => ASSIGNABLE => ASSIGNED, not blocked
	 * - assign of a first element to the container => ASSIGNABLE, not blocked
	 * Update due to
	 * - assign of a further element to the container => ASSIGNABLE => ASSIGNABLE
	 * Unblock due to
	 * - get of a container ASSIGNABLE => ASSIGNED
	 * - get of all elements ASSIGNABLE => ASSIGNED
	 * Thereafter
	 * - get of a container ASSIGNED => ASSIGNED
	 * - get of all elements ASSIGNED => ASSIGNED
	 * <br>
	 * Lifecycle 2: read first
	 * Create due to
	 * - get of elements => ASSIGNABLE, blocked
	 * Unblock due to
	 * - assign of an element to the container => ASSIGNABLE => ASSIGNED, not blocked
	 * Thereafter
	 * - get of either end ASSIGNED => ASSIGNED
	 * - (assign of either end is an ignored error)
	 *
	private static class ContainerSlotState extends SlotState
	{
		public static @NonNull SlotState create(@NonNull ObjectManager objectManager,
				@NonNull EObject eObject, @NonNull EReference eFeature, @NonNull EReference eOppositeFeature, @Nullable EObject eContent) {
			if (eContent != null) {
				ContainedSlotState containedSlotState = (ContainedSlotState) objectManager.getSlotState(eContent, eOppositeFeature);
				containedSlotState.assigned(objectManager, eContent, eOppositeFeature, eObject);
			}
			return new ContainerSlotState(eObject, eFeature, eContent);
		}
		
		public ContainerSlotState(@NonNull EObject eContainer, @NonNull EReference eFeature) {
			super(eContainer, eFeature);
			assert eFeature.isContainer();
//			assert eFeature.isMany();
//			assert eFeature.getEOpposite() != null;
//			assert eFeature.getEOpposite().isMany();
		}

		public ContainerSlotState(@NonNull EObject eContainer, @NonNull EReference eFeature, @Nullable Object elements) {
			super(eContainer, eFeature, elements);
			assert eFeature.isContainer();
//			assert eFeature.isMany();
//			assert eFeature.getEOpposite() != null;
//			assert eFeature.getEOpposite().isMany();
			assert eContainer.eGet(eFeature) == eContainer;
		}

		@Override
		public synchronized void assigned(@NonNull ObjectManager objectManager, @NonNull EObject eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			assert ecoreValue != null;
			@SuppressWarnings("unchecked")
			List<? extends EObject> ecoreValues = (List<? extends EObject>)ecoreValue;
			EReference eOppositeReference = ((EReference)eFeature).getEOpposite();
			for (EObject element : ecoreValues) {
				if (element != null) {
					Map<EStructuralFeature, SlotState> elementObjectState = objectManager.getObjectState(element);
					elementObjectState.put(eOppositeReference, this);
				}
			}
			super.assigned(objectManager, eObject, eFeature, ecoreValue);

		}
		
		public void assignedElement(@NonNull ObjectManager objectManager,
				@NonNull EObject eContainer, @NonNull EReference eReference, EObject eObject) {
			super.assigned(objectManager, eContainer, eReference, eObject);
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public synchronized @Nullable <G> G get(@NonNull ObjectManager objectManager, @NonNull EObject eObject, @NonNull EStructuralFeature eFeature) {
			switch (mode) {
				case ASSIGNABLE:
					mode = PropertyMode.ASSIGNED;
					unblock(objectManager);
					break;
				case ASSIGNED:
					break;
			}
			return (G) eObject.eGet(eFeature);
		}
	} */
	
	/**
	 * SlotState describing an M:N Object navigation.
	 */
	class ManyToManySlotState extends BasicSlotState
	{	
		public ManyToManySlotState(@NonNull Object eObject, @NonNull EStructuralFeature eFeature) {
			super(eObject, eFeature);
			throw new UnsupportedOperationException();
		}

		@Override
		public synchronized void assigned(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			throw new UnsupportedOperationException();
		}
	}
	
	/**
	 * SlotState describing the aggregator side of a 1:N Object navigation.
	 * <br>
	 * Lifecycle:
	 * Create due to
	 * - get of all elements => ASSIGNABLE, blocked
	 * NO: - get of an aggregator => ASSIGNABLE, blocked
	 * Create due to
	 * - assign of all elements => ASSIGNABLE => ASSIGNED, not blocked
	 * - assign of a first element to the aggregator => ASSIGNABLE, not blocked
	 * Update due to
	 * - assign of a further element to the aggregator => ASSIGNABLE => ASSIGNABLE
	 * Unblock due to
	 * - get of an aggregator ASSIGNABLE => ASSIGNED
	 * - get of all elements ASSIGNABLE => ASSIGNED
	 * Thereafter
	 * - get of an aggregator ASSIGNED => ASSIGNED
	 * - get of all elements ASSIGNED => ASSIGNED
	 * <br>
	 * Lifecycle 2: read first
	 * Create due to
	 * - get of elements => ASSIGNABLE, blocked
	 * Unblock due to
	 * - assign of an element to the aggregator => ASSIGNABLE => ASSIGNED, not blocked
	 * Thereafter
	 * - get of either end ASSIGNED => ASSIGNED
	 * - (assign of either end is an ignored error)
	 */
	class OneToManyAggregatorSlotState extends BasicSlotState
	{

//		public static @NonNull  SlotState create(@NonNull ObjectManager objectManager,
//				EObject eObject, @NonNull EReference eFeature, EReference eOppositeReference, Object ecoreValue) {
//			// TODO Auto-generated method stub
//			return null;
//		}
		
		public OneToManyAggregatorSlotState(@NonNull Object eContainer, @NonNull EStructuralFeature eFeature) {
			super(eContainer, eFeature);
			assert eFeature.isMany();
//			assert eFeature.getEOpposite() != null;
//			assert eFeature.getEOpposite().isMany();
		}

		private OneToManyAggregatorSlotState(@NonNull Object eContainer, @NonNull EStructuralFeature eFeature, @Nullable Object eContents) {
			super(eContainer, eFeature, eContents);
			assert eFeature.isMany();
//			assert eFeature.getEOpposite() != null;
//			assert eFeature.getEOpposite().isMany();
			assert ((EObject)eContainer).eGet(eFeature).equals(eContents);
		}

		@Override
		public synchronized void assigned(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			assert ecoreValue != null;
			@SuppressWarnings("unchecked")
			List<? extends EObject> ecoreValues = (List<? extends EObject>)ecoreValue;
			EReference eOppositeReference = ((EReference)eFeature).getEOpposite();
			for (EObject element : ecoreValues) {
				if (element != null) {
					Map<EStructuralFeature, SlotState> elementObjectState = getObjectState(element);
					elementObjectState.put(eOppositeReference, this);
				}
			}
//			super.assigned(objectManager, eObject, eFeature, ecoreValue);
			assignedElement(eObject, (EReference)eFeature, (EObject)ecoreValue);
		}
		
		public void assignedElement(@NonNull Object eContainer, @NonNull EReference eReference, Object eObject) {
//			super.assigned(objectManager, eContainer, eReference, eObject);
			switch (mode) {
				case ASSIGNABLE:
					mode = SlotMode.ASSIGNED;
					unblock(LazyObjectManager.this);
					break;
				case ASSIGNED:
					break;
			}
		}
		
		@Override
		public synchronized void getting(@NonNull Object eObject, @NonNull EStructuralFeature eFeature) {
			switch (mode) {
				case ASSIGNABLE:
					mode = SlotMode.ASSIGNED;
					unblock(LazyObjectManager.this);
					break;
				case ASSIGNED:
					break;
			}
		}
	}
	
	/**
	 * SlotState describing the element side of a 1:N Object navigation.
	 * <br>
	 * Lifecycle (read first, write later):
	 * Create due to
	 * - get of an aggregator => ASSIGNABLE, blocked
	 * Unblock
	 * - assign of possibly null aggregator for the element, ASSIGNABLE, blocked => ASSIGNED, not blocked
	 * - non-null aggregator is notified to unblock 
	 * Thereafter
	 * - get of aggregator ASSIGNED => ASSIGNED
	 * <br>
	 * Lifecycle (write first):
	 * Create due to
	 * - assign of a possibly null aggregator => ASSIGNED, unblocked
	 * - non-null aggregator is notified to unblock 
	 * Thereafter
	 * - get of aggregator ASSIGNED => ASSIGNED
	 */
	class OneToManyElementSlotState extends BasicSlotState
	{
		public OneToManyElementSlotState(@NonNull Object eObject, @NonNull EReference eFeature) {
			super(eObject, eFeature);
			assert !eFeature.isMany();
			if (eFeature == OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
				assert eFeature.getEOpposite() == null;
			}
			else {
				assert eFeature.getEOpposite() != null;
				assert eFeature.getEOpposite().isMany();
			}
		}
		
		public OneToManyElementSlotState(@NonNull Object eObject, @NonNull EReference eFeature, @NonNull Object eAggregator) {
			super(eObject, eFeature, eAggregator);
			assert !eFeature.isMany();
			assert eFeature.getEOpposite() != null;
			assert eFeature.getEOpposite().isMany();
			if (eFeature == OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
				assert ((EObject)eObject).eContainer() == eAggregator;
			}
			else {
				assert ((EObject)eObject).eGet(eFeature) == eAggregator;
			}
		}

		@Override
		public synchronized void assigned(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			if (!isAssigned() && (ecoreValue != null)) {
				EObject eOpposite = (EObject) ecoreValue;
				EReference eOppositeReference = ((EReference)eFeature).getEOpposite();
				if (eFeature == OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
					eOppositeReference = ((EObject)eObject).eContainmentFeature();
					assert eOppositeReference != null;
					SlotState aggregatorSlotState = getSlotState(eOpposite, eOppositeReference);
					aggregatorSlotState.assigned(eOpposite, eOppositeReference, eObject);
				}
				else {
					assert eOppositeReference != null;
					OneToManyAggregatorSlotState aggregatorSlotState = (OneToManyAggregatorSlotState) getSlotState(eOpposite, eOppositeReference);
					aggregatorSlotState.assignedElement(eOpposite, eOppositeReference, eObject);
				}
			}
			assigned(LazyObjectManager.this, eObject, eFeature, ecoreValue);
		}
	}
	
	/**
	 * SlotState describing a 1:1 Object navigation. Both ends are assigned exactly once. The remote assignment
	 * may be null.
	 * <br>
	 * Lifecycle 1: write first
	 * Create due to
	 * - assign of possibly null eOpposite => ASSIGNED
	 * Thereafter
	 * - get of either end ASSIGNED => ASSIGNED
	 * - (assign of either end is an ignored error)
	 * <br>
	 * Lifecycle 2: read first
	 * Create due to
	 * - get of other end => ASSIGNABLE_BLOCKED
	 * Unblock due to
	 * - assign of a further element to the aggregator => ASSIGNABLE_BLOCKED => ASSIGNED
	 * Thereafter
	 * - get of either end ASSIGNED => ASSIGNED
	 * - (assign of either end is an ignored error)
	 */
	class OneToOneSlotState extends BasicSlotState
	{
/*		public static @NonNull <G,S> SlotState createContainer(@NonNull ObjectManager objectManager,
				@NonNull EObject eObject, @NonNull EReference eFeature, @Nullable EReference eOppositeFeature, @Nullable EObject eOpposite) {
			Map<EStructuralFeature, SlotState> oppositeObjectState = null;
			if (eOpposite != null) {
				oppositeObjectState = objectManager.getObjectState(eObject);
				SlotState slotState = oppositeObjectState.get(eOppositeFeature);
				if (slotState != null) {
					return slotState;
				}		
			}
			SlotState slotState = new OneToOneSlotState(eObject, eFeature, eOpposite);
			if (oppositeObjectState != null) {
				oppositeObjectState.put(eOppositeFeature, slotState);
			}
			return slotState;
		} */
		
		public OneToOneSlotState(@NonNull Object eObject, @NonNull EReference eFeature) {
			super(eObject, eFeature);
			if (eFeature instanceof EOppositeReferenceImpl) {
				assert !(((EOppositeReferenceImpl)eFeature).getEOpposite().isMany());
			}
			else {
				assert !eFeature.isMany();
				if (eFeature.isContainer()) {
	//				assert eObject.eContainer() == eOpposite;
				}
				else if (eFeature.isContainment()) {
	//				assert eOpposite != null;
	//				assert eObject == eOpposite.eContainer();
				}
				else if (eFeature == OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
	//				slotState = new OneToOneSlotState(eObject, eReference);
				}
				else {
					assert eFeature.getEOpposite() != null;
					assert !eFeature.getEOpposite().isMany();
				}
			}
		}

		private OneToOneSlotState(@NonNull Object eObject, @NonNull EReference eFeature, @Nullable Object eOpposite) {
			super(eObject, eFeature, eOpposite);
			assert !eFeature.isMany();
			if (eFeature.isContainer()) {
				assert ((EObject)eObject).eContainer() == eOpposite;
			}
			else if (eFeature.isContainment()) {
				assert eOpposite != null;
				assert eObject == ((EObject)eOpposite).eContainer();
			}
			else {
				assert eFeature.getEOpposite() != null;
				assert !eFeature.getEOpposite().isMany();
				assert ((EObject)eObject).eGet(eFeature) == eOpposite;
			}
		}

		@Override
		public void assigned(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			assigned(LazyObjectManager.this, eObject, eFeature, ecoreValue);
		}
	}
	
	/**
	 * Simple SlotState describing a DataType element or 1:1 Object navigation.
	 */
	class SimpleSlotState extends BasicSlotState
	{
		public SimpleSlotState(@NonNull Object eObject, @NonNull EStructuralFeature eFeature) {
			super(eObject, eFeature);
		}

		public SimpleSlotState(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			super(eObject, eFeature, ecoreValue);
		}

		@Override
		public void assigned(@NonNull Object eObject, @NonNull EStructuralFeature eFeature, @Nullable Object ecoreValue) {
			assigned(LazyObjectManager.this, eObject, eFeature, ecoreValue);
		}
	}

	protected final boolean debugTracing = AbstractTransformer.INVOCATIONS.isActive();
	
	/**
	 * This unpleasant Map of Maps is a pathfinder before embarking on slotted objects that merge user and overhead
	 * in a single object. The first map is then a null lookup and the nested map is an index within the object. 
	 */
	private @NonNull Map<@NonNull Object, @NonNull Map<@NonNull EStructuralFeature, @NonNull SlotState>> object2feature2slotState = new HashMap<@NonNull Object, @NonNull Map<@NonNull EStructuralFeature, @NonNull SlotState>>();

	/**
	 * Map of helper objects to reify missing EReference::eOpposites. Only used as a semantically inverse handle on the available EReference.
	 */
	private @NonNull Map<@NonNull EReference, @NonNull EOppositeReferenceImpl> eReference2eOppositeReference = new HashMap<@NonNull EReference, @NonNull EOppositeReferenceImpl>();
	
	public LazyObjectManager(@NonNull LazyInvocationManager invocationManager) {
		super(invocationManager);
	}

	@Override
	public synchronized void assigned(@NonNull Object eObject, /*@NonNull*/ EStructuralFeature eFeature, @Nullable Object ecoreValue, @Nullable Object childKey) {
		assert eFeature != null;
		if (debugTracing) {
			AbstractTransformer.INVOCATIONS.println("assigned " + eFeature.getEContainingClass().getName() + "::" + eFeature.getName() + " for " + eObject + " = " + ecoreValue);
		}
		Map<EStructuralFeature, SlotState> objectState = getObjectState(eObject);
		SlotState slotState = objectState.get(eFeature);
		if (slotState != null) {
			slotState.assigned(eObject, eFeature, ecoreValue);		
		}
		else {
			if (eFeature instanceof EAttribute) {
				slotState = new SimpleSlotState(eObject, eFeature, ecoreValue);
			}
			else {
				EReference eReference = (EReference)eFeature;
				EReference eOppositeReference = eReference.getEOpposite();
				if (eOppositeReference != null) {
//					if (ecoreValue != null) {
//						Map<EStructuralFeature, SlotState> oppositeObjectState = getObjectState((EObject) ecoreValue);
//						SlotState oppositeSlotState = oppositeObjectState.get(eOppositeReference);
//					}
					if (eReference.isMany()) {
						assert ecoreValue != null;
						if (eOppositeReference.isMany()) {
							slotState = createManyToManySlotState(eObject, eReference, eOppositeReference);
						}
						else {
							slotState = createOneToManyAggregatorSlotState(eObject, eReference, eOppositeReference, ecoreValue);
						}
					}
					else if (ecoreValue != null) {
						if (eOppositeReference.isMany()) {
							slotState = createOneToManyElementSlotState(eObject, eReference, eOppositeReference, ecoreValue);
						}
//						else if (isIncremental) {
//							slotState = OneToOneSlotState.create(this, eObject, eReference, eOppositeReference, ecoreValue);
//						}
					}
				}
				else if (eReference.isContainment()) {
					assert ecoreValue != null;
					eOppositeReference = OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER;
					assert eOppositeReference != null;
					if (eReference.isMany()) {
						slotState = createOneToManyAggregatorSlotState(eObject, eReference, eOppositeReference, ecoreValue);
					}
					else {
						Map<@NonNull EStructuralFeature, @NonNull SlotState> oppositeObjectState = getObjectState(ecoreValue);
						slotState = oppositeObjectState.get(eOppositeReference);
						if (slotState != null) {
							slotState.assigned(ecoreValue, eOppositeReference, eObject);		
						}
						else {
							slotState = createOneToOneSlotState(eObject, eReference, eOppositeReference, (EObject)ecoreValue);
						}
					}
				}
//				else if (eReference == OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
//					slotState = OneToOneSlotState.create(this, eObject, eReference, eOppositeReference, (EObject)ecoreValue);
//				}
				else {						// Unidirectional non-containment EReference
					if (ecoreValue != null) {
						eOppositeReference = getEOppositeReference(eReference);
						Map<EStructuralFeature, SlotState> oppositeObjectState = getObjectState(ecoreValue);
						slotState = oppositeObjectState.get(eOppositeReference);
						if (slotState == null) {
							slotState = new SimpleSlotState(eObject, eFeature, ecoreValue);
							oppositeObjectState.put(eOppositeReference, slotState);
						}
						else {
							slotState.assigned(ecoreValue, eOppositeReference, eObject);		
						}
					}
					else {
						slotState = new SimpleSlotState(eObject, eFeature, ecoreValue);
						
					}
				}
			}
			objectState.put(eFeature, slotState);
		}
	}

	@Override
	public void assigned(Invocation.@NonNull Incremental invocation, @NonNull Object eObject, EStructuralFeature eFeature, @Nullable Object ecoreValue, @Nullable Object childKey) {
		assigned(eObject, eFeature, ecoreValue, childKey);		// Delegate incremental API to non-incremental API
	}

	@NonNull SlotState createManyToManySlotState(
			@NonNull Object eObject, @NonNull EReference eFeature, @NonNull EReference eOppositeFeature) {
		throw new UnsupportedOperationException();
	}

	@NonNull SlotState createOneToManyAggregatorSlotState(
			@NonNull Object eObject, @NonNull EReference eFeature, @NonNull EReference eOppositeFeature, @Nullable Object eContents) {
		if (eContents != null) {
//			SlotState containedSlotState = objectManager.getSlotState(eContent, eOppositeFeature);
//			containedSlotState.assigned(objectManager, eContent, eOppositeFeature, eObject);
		}
		return new OneToManyAggregatorSlotState(eObject, eFeature, eContents);
	}

	@NonNull SlotState createOneToManyElementSlotState(
			@NonNull Object eObject, @NonNull EReference eFeature, @NonNull EReference eOppositeFeature, @NonNull Object eAggregator) {
		OneToManyAggregatorSlotState aggregatorSlotState = (OneToManyAggregatorSlotState) getSlotState(eAggregator, eOppositeFeature);
		aggregatorSlotState.assignedElement(eAggregator, eOppositeFeature, eObject);
		return new OneToManyElementSlotState(eObject, eFeature, eAggregator);
	}

	@NonNull <G,S> SlotState createOneToOneSlotState(
			@NonNull Object eObject, @NonNull EReference eFeature, @NonNull EReference eOppositeFeature, @Nullable Object eOpposite) {
		Map<EStructuralFeature, SlotState> oppositeObjectState = null;
		if (eOpposite != null) {
			oppositeObjectState = getObjectState(eOpposite);
			SlotState slotState = oppositeObjectState.get(eOppositeFeature);
			if (slotState != null) {
				return slotState;
			}
		}
		SlotState slotState = new OneToOneSlotState(eObject, eFeature, eOpposite);
		if (oppositeObjectState != null) {
			oppositeObjectState.put(eOppositeFeature, slotState);
		}
		return slotState;
	}

	@Override
	public void created(Invocation.@NonNull Incremental invocation, @NonNull Object eObject) {
		// Ignore incremental API
	}

	protected @NonNull EReference getEOppositeReference(@NonNull EReference eReference) {
		EReference eOppositeReference = eReference.getEOpposite();
		if (eOppositeReference == null) {
			EOppositeReferenceImpl eOppositeReference2 = eReference2eOppositeReference.get(eReference);
			if (eOppositeReference2 == null) {
				eOppositeReference2 = new EOppositeReferenceImpl(eReference);
				eReference2eOppositeReference.put(eReference, eOppositeReference2);
			}
			eOppositeReference = eOppositeReference2;
		}
		return eOppositeReference;
	}
	
	public @NonNull Map<@NonNull EStructuralFeature, @NonNull SlotState> getObjectState(@NonNull Object eObject) {
		Map<@NonNull EStructuralFeature, @NonNull SlotState> feature2state = object2feature2slotState.get(eObject);
		if (feature2state == null) {
			feature2state = new HashMap<@NonNull EStructuralFeature, @NonNull SlotState>();
			object2feature2slotState.put(eObject, feature2state);
		}
		return feature2state;
	}

	@Override
	public @NonNull Iterable<@NonNull ? extends Object> getObjects() {
		@NonNull Set<@NonNull Object> keySet = object2feature2slotState.keySet();
		return keySet;
	}

	public synchronized @NonNull SlotState getSlotState(@NonNull Object eObject, @NonNull EStructuralFeature eFeature) {
		assert eFeature != null;
		Map<@NonNull EStructuralFeature, @NonNull SlotState> objectState = getObjectState(eObject);
		SlotState slotState = objectState.get(eFeature);
		if (slotState == null) {
			if (eFeature instanceof EAttribute) {
				slotState = new SimpleSlotState(eObject, eFeature);
			}
			else {
				EReference eReference = (EReference)eFeature;
				EReference eOppositeReference = eReference.getEOpposite();			// FIXME there is always a Pivot opposite
				if (eReference instanceof EOppositeReferenceImpl) {
					if (eOppositeReference.isMany()) {
						slotState = new OneToManyElementSlotState(eObject, eReference);
					}
					else {
						slotState = new OneToOneSlotState(eObject, eReference);
					}
				}
				else if (eOppositeReference != null) {
					if (eReference.isMany()) {
						if (eOppositeReference.isMany()) {
							slotState = new ManyToManySlotState(eObject, eReference);
						}
						else {
							slotState = new OneToManyAggregatorSlotState(eObject, eReference);
						}
					}
					else {
						if (eOppositeReference.isMany()) {
							slotState = new OneToManyElementSlotState(eObject, eReference);
						}
						else {
							slotState = new OneToOneSlotState(eObject, eReference);
						}
					}
				}
				else if (eReference.isContainment()) {
					if (eReference.isMany()) {
						slotState = new OneToManyAggregatorSlotState(eObject, eReference);
					}
					else {
						slotState = new OneToOneSlotState(eObject, eReference);
					}
				}
				else if (eReference == OCLstdlibPackage.Literals.OCL_ELEMENT__OCL_CONTAINER) {
					slotState = new OneToManyElementSlotState(eObject, eReference); //FIXME may be many
				}
				else {						// Unidirectional non-containment EReference
					slotState = new SimpleSlotState(eObject, eFeature);
				}
			}
			objectState.put(eFeature, slotState);
		}
		return slotState;
	}

	@Override
	public @NonNull Iterable<@NonNull SlotState> getSlotStates(@NonNull Object object) {
		Map<@NonNull EStructuralFeature, @NonNull SlotState> feature2slotState = object2feature2slotState.get(object);
		if (feature2slotState != null) {
			@NonNull Collection<@NonNull SlotState> values = feature2slotState.values();
			return values;
		}
		else {
			return EMPTY_SLOT_STATE_LIST;
		}
	}

	@Override
	public synchronized void getting(@NonNull Object eObject, /*@NonNull*/ EStructuralFeature eFeature, boolean isOpposite) {
		assert eFeature != null;
		if (debugTracing) {
			AbstractTransformer.INVOCATIONS.println("getting " + eFeature.getEContainingClass().getName() + "::" + eFeature.getName() + (isOpposite ? "<opposite> " : "") + " for " + eObject);
		}
		if (isOpposite) {
			eFeature = getEOppositeReference((EReference) eFeature);
		}
		SlotState slotState = getSlotState(eObject, eFeature);
		slotState.getting(eObject, eFeature);
	}

	@Override
	public void got(Invocation.@NonNull Incremental invocation, @NonNull Object eObject, EStructuralFeature eFeature, @Nullable Object ecoreValue) {
		// Ignore incremental API
	}
}