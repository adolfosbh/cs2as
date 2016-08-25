package uk.ac.york.cs.cs2as.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain;
import uk.ac.york.cs.cs2as.generator.CS2ASDSL_To_OCLBaseVisitor;

@SuppressWarnings("all")
public class CS2ASDSL_To_OCLDisambiguationVisitor extends CS2ASDSL_To_OCLBaseVisitor {
  private String baseFileName;
  
  public CS2ASDSL_To_OCLDisambiguationVisitor(final String baseFileName) {
    this.baseFileName = baseFileName;
  }
  
  @Override
  public String caseCS2ASModel(final CS2ASModel object) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
      SourceDomain _source = object.getSource();
      String _doSwitch = this.doSwitch(_source);
      _builder.append(_doSwitch, "");
      _builder.newLineIfNotEmpty();
      TargetDomain _target = object.getTarget();
      String _doSwitch_1 = this.doSwitch(_target);
      _builder.append(_doSwitch_1, "");
      _builder.newLineIfNotEmpty();
      _builder.append("import \'");
      _builder.append(this.baseFileName, "");
      _builder.append("Helpers.ocl\'");
      _builder.newLineIfNotEmpty();
      _builder.append("import \'");
      _builder.append(this.baseFileName, "");
      _builder.append("Lookup.ocl\'");
      _builder.newLineIfNotEmpty();
      sb.append(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package ");
      SourceDomain _source_1 = object.getSource();
      EList<ImportCS> _metamodels = _source_1.getMetamodels();
      ImportCS _get = _metamodels.get(0);
      String _name = _get.getName();
      _builder_1.append(_name, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      DisambiguationSect _disambiguationSect = object.getDisambiguationSect();
      String _doSwitch_2 = this.doSwitch(_disambiguationSect);
      _builder_1.append(_doSwitch_2, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("endpackage");
      _builder_1.newLine();
      StringBuilder _append = sb.append(_builder_1);
      _xblockexpression = _append.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseDisambiguationSect(final DisambiguationSect object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DisambiguationDef> _disambiguations = object.getDisambiguations();
      for(final DisambiguationDef disambiguation : _disambiguations) {
        String _doSwitch = this.doSwitch(disambiguation);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String caseDisambiguationDef(final DisambiguationDef object) {
    String _xblockexpression = null;
    {
      PathNameCS _classRef = object.getClassRef();
      final String context = this.doSwitch(_classRef);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("context ");
      _builder.append(context, "");
      _builder.newLineIfNotEmpty();
      {
        EList<DisambiguationRule> _rules = object.getRules();
        for(final DisambiguationRule disambiguationRule : _rules) {
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
  public String caseDisambiguationRule(final DisambiguationRule object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def : ");
    String _name = object.getName();
    _builder.append(_name, "");
    _builder.append("() : Boolean =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ExpCS _exp = object.getExp();
    String _doSwitch = this.doSwitch(_exp);
    _builder.append(_doSwitch, "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
