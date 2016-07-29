package uk.ac.york.cs.cs2as.generator;

import org.eclipse.emf.ecore.EObject;
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.util.Cs2as_dslSwitch;

@SuppressWarnings("all")
public abstract class CS2ASDSL_To_OCLBaseVisitor extends Cs2as_dslSwitch<String> {
  private /* EssentialOCLCSToStringVisitor */Object essentialOclVisitor /* Skipped initializer because of errors */;
  
  @Override
  public String defaultCase(final EObject object) {
    throw new Error("Unresolved compilation problems:"
      + "\ndoSwitch cannot be resolved");
  }
  
  @Override
  public String caseASDecl(final ASDecl object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method metamodels is undefined for the type CS2ASDSL_To_OCLBaseVisitor"
      + "\ndoSwitch cannot be resolved");
  }
  
  @Override
  public String caseCSDecl(final CSDecl object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method metamodels is undefined for the type CS2ASDSL_To_OCLBaseVisitor"
      + "\ndoSwitch cannot be resolved");
  }
}
