/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package ocldependencyanalysis.graphml;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.xml.XmlModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

/**
 * Copied from EpsilonStandalonExample and modified by
 * @author asbh500
 *
 */
public abstract class AbstractEolLauncher {
	  
	  protected IEolExecutableModule module;
	  
	  protected Object result;
	  
	  public abstract IEolExecutableModule createModule();
	  
	  public abstract String getSource() throws Exception;
	  
	  public abstract List<IModel> getModels() throws Exception;
	  
	  public void postProcess() {};
	  
	  public void preProcess() {};
	  
	/**
	 * @throws Exception when either loading models or executing the EOL script
	 *  
	 */
	public void execute() throws Exception {
	    
	    module = createModule();
	    module.parse(getFile(getSource()));
	    
	    if (module.getParseProblems().size() > 0) {
	      System.err.println("Parse errors occured...");
	      for (ParseProblem problem : module.getParseProblems()) {
	        System.err.println(problem.toString());
	      }
	      System.exit(-1);
	    }
	    
	    for (IModel model : getModels()) {
	      module.getContext().getModelRepository().addModel(model);
	    }
	    
	    preProcess();
	    result = execute(module);
	    postProcess();
	    
	    module.getContext().getModelRepository().dispose();
	  }
	  
	  protected Object execute(IEolExecutableModule module) 
	      throws EolRuntimeException {
	    return module.execute();
	  }
	  
	  protected EmfModel createEmfModel(String name, String model, 
	      String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
	          throws EolModelLoadingException, URISyntaxException {
	    EmfModel emfModel = new EmfModel();
	    StringProperties properties = new StringProperties();
	    properties.put(EmfModel.PROPERTY_NAME, name);
	    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
	        getFile(metamodel).toURI().toString());
	    properties.put(EmfModel.PROPERTY_MODEL_URI, 
	        getFile(model).toURI().toString());
	    properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
	    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
	        storeOnDisposal + "");
	    emfModel.load(properties);
	    return emfModel;
	  }

	protected EmfModel createEmfModelByURI(String name, String modelURI, 
	      String metamodelURI, boolean readOnLoad, boolean storeOnDisposal) 
	          throws EolModelLoadingException, URISyntaxException {
	    EmfModel emfModel = new EmfModel();
	    StringProperties properties = new StringProperties();
	    properties.put(EmfModel.PROPERTY_NAME, name);
	    properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
	    properties.put(EmfModel.PROPERTY_MODEL_URI,  modelURI);
	    properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
	    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
	        storeOnDisposal + "");
	    emfModel.load(properties);
	    return emfModel;
	  }
	  
	protected XmlModel createXmlModel(String name, String uri, String xsdURI,
			  boolean readOnLoad, boolean storeOnDisposal) 
		          throws EolModelLoadingException, URISyntaxException {
		  	XmlModel xmlModel = new XmlModel();
		    StringProperties properties = new StringProperties();
		    properties.put(XmlModel.PROPERTY_NAME, name);
		    properties.put(XmlModel.PROPERTY_MODEL_FILE, uri);
		    properties.put(XmlModel.PROPERTY_XSD_FILE, xsdURI);
		    properties.put(XmlModel.PROPERTY_READONLOAD, readOnLoad + "");
		    properties.put(XmlModel.PROPERTY_STOREONDISPOSAL, 
		        storeOnDisposal + "");
		    xmlModel.load(properties);
		    return xmlModel;
	}
	  
	  protected File getFile(String fileName) throws URISyntaxException {
	    
	    URI binUri = this.getClass().
	        getResource(fileName).toURI();
	    URI uri = null;
	    
	    if (binUri.toString().indexOf("bin") > -1) {
	      uri = new URI(binUri.toString().replaceAll("bin", "src"));
	    }
	    else {
	      uri = binUri;
	    }
	    
	    return new File(uri);
	  }
	  
	
}
