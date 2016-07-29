package uk.ac.york.cs.cs2as.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xcore.XClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.generator.CS2ASDSL_To_OCLBaseVisitor;

@SuppressWarnings("all")
public class CS2ASDSL_To_OCLDisambiguationVisitor extends CS2ASDSL_To_OCLBaseVisitor {
  private String baseFileName;
  
  public CS2ASDSL_To_OCLDisambiguationVisitor(final String baseFileName) {
    this.baseFileName = baseFileName;
  }
  
  @Override
  public String caseModel(final Model object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method metamodels is undefined for the type CS2ASDSL_To_OCLDisambiguationVisitor"
      + "\nget cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String caseDisambiguationSect(final DisambiguationSect object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ClassDisambiguation> _disambiguations = object.getDisambiguations();
      for(final ClassDisambiguation disambiguation : _disambiguations) {
        String _doSwitch = this.doSwitch(disambiguation);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String caseClassDisambiguation(final ClassDisambiguation object) {
    String _xblockexpression = null;
    {
      XClass _class_ = object.getClass_();
      final String context = this.doSwitch(_class_);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("context ");
      _builder.append(context, "");
      _builder.newLineIfNotEmpty();
      {
        EList<ClassDisambiguationStmnt> _statements = object.getStatements();
        for(final ClassDisambiguationStmnt disambiguationRule : _statements) {
          String _doSwitch = this.doSwitch(disambiguationRule);
          _builder.append(_doSwitch, "");
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseDisambiguationDef(final DisambiguationDef object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def : ");
    String _name = object.getName();
    _builder.append(_name, "");
    _builder.append("() : Boolean =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    XExpression _exp = object.getExp();
    String _doSwitch = this.doSwitch(_exp);
    _builder.append(_doSwitch, "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
