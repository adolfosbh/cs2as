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
package uk.ac.yor.cs.asbh.linker;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.qvtd.cs2as.runtime.CS2ASException;
import org.eclipse.qvtd.cs2as.runtime.CS2ASTransformation;
import org.eclipse.qvtd.cs2as.runtime.EObjectDiagnostic;
import org.eclipse.qvtd.cs2as.runtime.QVTiTxHelper;
import org.eclipse.qvtd.cs2as.xtext.runtime.CS2ASExceptionDiagnostic;
import org.eclipse.qvtd.pivot.qvtbase.evaluation.TransformationEvaluator;
import org.eclipse.qvtd.pivot.qvtimperative.utilities.QVTimperative;
import org.eclipse.xtext.diagnostics.ExceptionDiagnostic;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import uk.ac.york.cs.asbh.cs2as.Source2Target_qvtp_qvtias;

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
			if (!LinkerUtil.hasSyntaxError(errors)) {
				CS2ASTransformation tx = null;
				ResourceSet rSet = eResource.getResourceSet();
				QVTimperative qvt = QVTimperative.newInstance(QVTimperative.NO_PROJECTS, rSet);
				QVTiTxHelper txHelper = new QVTiTxHelper(qvt); 
				try {
					TransformationEvaluator evaluator = txHelper.createTxEvaluator(Source2Target_qvtp_qvtias.class);
					tx = (CS2ASTransformation) evaluator.getExecutor();
					
					tx.addRootObjects("leftCS", ClassUtil.nonNullState(eResource.getContents()));
					if (tx.run()) {
						URI asModelURI = eResource.getURI().appendFileExtension("xmi");
						Resource outputResource = rSet.getResource(asModelURI, false);
						if (outputResource == null) {
							outputResource = rSet.createResource(asModelURI);
						}
						outputResource.getContents().clear();
						outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
						outputResource.save(null); // FIXME
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
						for (EObjectDiagnostic diagnostic : tx.getErrors()) {							
							errors.add(createLinkingDiagnostic(diagnostic));	
						}						
					}
					qvt.dispose();
				}
			}
		}
	}
	
	protected org.eclipse.xtext.diagnostics.Diagnostic createLinkingDiagnostic(EObjectDiagnostic diagnostic) {
		
		return new XtextLinkingDiagnostic(NodeModelUtils.getNode(diagnostic.getEObject()),
				diagnostic.getMessage(),
				diagnostic.getSource());
	}
}