package uk.ac.york.cs.cs2as.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.util.Cs2as_dslSwitch;
import uk.ac.york.cs.cs2as.generator.EssentialOCLCSToStringVisitor;

@SuppressWarnings("all")
public abstract class CS2ASDSL_To_OCLBaseVisitor extends Cs2as_dslSwitch<String> {
  private EssentialOCLCSToStringVisitor essentialOclVisitor = new EssentialOCLCSToStringVisitor();
  
  @Override
  public String defaultCase(final EObject object) {
    return this.essentialOclVisitor.doSwitch(object);
  }
  
  @Override
  public String caseSourceDomain(final SourceDomain object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ImportCS> _metamodels = object.getMetamodels();
      for(final ImportCS mm : _metamodels) {
        String _doSwitch = this.doSwitch(mm);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String caseTargetDomain(final TargetDomain object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ImportCS> _metamodels = object.getMetamodels();
      for(final ImportCS mm : _metamodels) {
        String _doSwitch = this.doSwitch(mm);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
