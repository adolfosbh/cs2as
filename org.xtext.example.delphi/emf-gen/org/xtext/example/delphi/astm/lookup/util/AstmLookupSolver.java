/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.delphi/model/astm.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.delphi.astm.lookup.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.xtext.example.delphi.astm.util.AstmUnqualifiedVariableDefinitionLookupVisitor;
import org.xtext.example.delphi.astm.util.AstmUnqualifiedFunctionDefinitionLookupVisitor;


public class AstmLookupSolver {
	
	protected final @NonNull Executor executor;
	
	public AstmLookupSolver (@NonNull Executor executor) {
		this.executor = executor;
	}
	
	
	public AstmLookupResult<org.xtext.example.delphi.astm.FunctionDefinition> _lookupUnqualifiedFunctionDefinition(org.xtext.example.delphi.astm.util.Visitable context, java.lang.String fName) {
		AstmSingleResultLookupEnvironment _lookupEnv = new AstmSingleResultLookupEnvironment(executor, org.xtext.example.delphi.astm.AstmPackage.Literals.FUNCTION_DEFINITION,fName);
		AstmUnqualifiedFunctionDefinitionLookupVisitor _lookupVisitor = new AstmUnqualifiedFunctionDefinitionLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new AstmLookupResultImpl<org.xtext.example.delphi.astm.FunctionDefinition>
				(_lookupEnv.getNamedElementsByKind(org.xtext.example.delphi.astm.FunctionDefinition.class));
	}
	
	public AstmLookupResult<org.xtext.example.delphi.astm.VariableDefinition> _lookupUnqualifiedVariableDefinition(org.xtext.example.delphi.astm.util.Visitable context, java.lang.String vName) {
		AstmSingleResultLookupEnvironment _lookupEnv = new AstmSingleResultLookupEnvironment(executor, org.xtext.example.delphi.astm.AstmPackage.Literals.VARIABLE_DEFINITION,vName);
		AstmUnqualifiedVariableDefinitionLookupVisitor _lookupVisitor = new AstmUnqualifiedVariableDefinitionLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new AstmLookupResultImpl<org.xtext.example.delphi.astm.VariableDefinition>
				(_lookupEnv.getNamedElementsByKind(org.xtext.example.delphi.astm.VariableDefinition.class));
	}
}
