/*******************************************************************************
 * Copyright (c) 2010, 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package uk.ac.york.cs.cs2as.linker;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.base.cs2as.tx.CS2ASDiagnostic;
import org.eclipse.ocl.xtext.base.cs2as.tx.CS2ASException;
import org.eclipse.ocl.xtext.base.cs2as.tx.CS2ASTransformationExecutor;
import org.eclipse.ocl.xtext.base.cs2as.tx.CS2ASTransformer;
import org.eclipse.qvtd.cs2as.xtext.runtime.CS2ASExceptionDiagnostic;
import org.eclipse.xtext.diagnostics.ExceptionDiagnostic;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;

import uk.ac.york.cs.cs2as.cs2as_dsl.cs2as.CS2ASBridge_qvtp_qvtias;


/**
 * CS2ASLinker ensures that the CS 2 Pivot mappings are refreshed after
 * and CS Resource modification is committed.
 */
public class CS2ASLinker extends LazyLinker
{
	
	@Override
	protected void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		Resource eResource = model.eResource();
		if ((diagnosticsConsumer != null) ) {
			List<Diagnostic> errors = eResource.getErrors();
			if (!hasSyntaxError(errors)) {
				ResourceSet rSet = eResource.getResourceSet();
				CS2ASTransformer tx = null;		
				OCL ocl = OCL.newInstance(rSet);
				try {
					CS2ASTransformationExecutor txExecutor= new CS2ASTransformationExecutor(ocl.getEnvironmentFactory(), CS2ASBridge_qvtp_qvtias.class);
					tx = txExecutor.getTransformer();
					
					tx.addRootObjects("leftCS", ClassUtil.nonNullState(eResource.getContents()));
					if (tx.run()) {
						URI asModelURI = eResource.getURI().appendFileExtension("xmi");
						Resource outputResource = rSet.getResource(asModelURI, false);
						if (outputResource == null) {
							outputResource = rSet.createResource(asModelURI);
						}
						outputResource.getContents().clear();
						outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
						outputResource.save(null);
					}
				}
				catch (CS2ASException exception) {
					errors.add(new CS2ASExceptionDiagnostic(exception));
				}
				catch (Exception exception) {	// Never let an Exception leak out to abort Xtext
				    Exception cause = exception instanceof Resource.IOWrappedException ? (Exception)exception.getCause() : exception;
				    errors.add(new ExceptionDiagnostic(cause));
				} finally {
					if (tx != null) {
						for (CS2ASDiagnostic diagnostic : tx.getErrors()) {							
							errors.add(createLinkingDiagnostic(diagnostic));	
						}						
					}
					ocl.dispose();
				}
			}
		}
	}
	
	protected org.eclipse.xtext.diagnostics.Diagnostic createLinkingDiagnostic(CS2ASDiagnostic diagnostic) {
		
		return new XtextLinkingDiagnostic(NodeModelUtils.getNode(diagnostic.getCSObject()),
				diagnostic.getMessage(),
				diagnostic.getSource());
	}

	// TODO factor out
	private static boolean hasSyntaxError(List<Diagnostic> diagnostics) {
		for (Diagnostic diagnostic : diagnostics) {
			if (diagnostic instanceof XtextSyntaxDiagnostic) {
				return true;
			}
		}
		return false;
	}
}