package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain;
import uk.ac.york.cs.cs2as.generator.CS2ASDSL_To_OCLBaseVisitor;

@SuppressWarnings("all")
public class CS2ASDSL_To_OCLMappingsVisitor extends CS2ASDSL_To_OCLBaseVisitor {
  private Map<String, MappingCreation[]> csElement2AmbiguousRules;
  
  private String baseFileName;
  
  private String asMetamodelName;
  
  private String csMetamodelName;
  
  public CS2ASDSL_To_OCLMappingsVisitor(final String baseFileName) {
    this.baseFileName = baseFileName;
  }
  
  @Override
  public String caseCS2ASModel(final CS2ASModel object) {
    String _xblockexpression = null;
    {
      MappingSect _mappingSect = object.getMappingSect();
      DisambiguationSect _disambiguationSect = object.getDisambiguationSect();
      Map<String, MappingCreation[]> _csElementToAmbiguousRules = this.csElementToAmbiguousRules(_mappingSect, _disambiguationSect);
      this.csElement2AmbiguousRules = _csElementToAmbiguousRules;
      SourceDomain _source = object.getSource();
      EList<ImportCS> _metamodels = _source.getMetamodels();
      ImportCS _get = _metamodels.get(0);
      String _name = _get.getName();
      this.csMetamodelName = _name;
      TargetDomain _target = object.getTarget();
      EList<ImportCS> _metamodels_1 = _target.getMetamodels();
      ImportCS _get_1 = _metamodels_1.get(0);
      String _name_1 = _get_1.getName();
      this.asMetamodelName = _name_1;
      final StringBuilder sb = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
      SourceDomain _source_1 = object.getSource();
      String _doSwitch = this.doSwitch(_source_1);
      _builder.append(_doSwitch, "");
      _builder.newLineIfNotEmpty();
      TargetDomain _target_1 = object.getTarget();
      String _doSwitch_1 = this.doSwitch(_target_1);
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
      _builder.append("import \'");
      _builder.append(this.baseFileName, "");
      _builder.append("Disambiguation.ocl\'");
      _builder.newLineIfNotEmpty();
      sb.append(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package ");
      _builder_1.append(this.csMetamodelName, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      MappingSect _mappingSect_1 = object.getMappingSect();
      String _doSwitch_2 = this.doSwitch(_mappingSect_1);
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
  public String caseMappingSect(final MappingSect object) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      EList<MappingDef> _mappings = object.getMappings();
      for (final MappingDef classMap : _mappings) {
        {
          PathNameCS _from = classMap.getFrom();
          final String csName = this.doSwitch(_from);
          boolean shouldProcess = true;
          boolean _containsKey = this.csElement2AmbiguousRules.containsKey(csName);
          if (_containsKey) {
            MappingCreation[] _get = this.csElement2AmbiguousRules.get(csName);
            MappingCreation _get_1 = _get[0];
            boolean _notEquals = (!Objects.equal(_get_1, classMap));
            if (_notEquals) {
              shouldProcess = false;
            }
          }
          if (shouldProcess) {
            String _doSwitch = this.doSwitch(classMap);
            sb.append(_doSwitch);
          }
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private CharSequence createAstOpDeclaration(final MappingDef object) {
    CharSequence _xblockexpression = null;
    {
      PathNameCS _from = object.getFrom();
      final String from = this.doSwitch(_from);
      PathNameCS _to = object.getTo();
      final String to = this.doSwitch(_to);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("context ");
      _builder.append(from, "");
      _builder.newLineIfNotEmpty();
      _builder.append("def : ast() : ");
      _builder.append(this.asMetamodelName, "");
      _builder.append("::");
      _builder.append(to, "");
      _builder.append(" =");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseMappingCreation(final MappingCreation object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createAstOpDeclaration = this.createAstOpDeclaration(object);
    _builder.append(_createAstOpDeclaration, "");
    CharSequence _createAstOpBody = this.createAstOpBody(object);
    _builder.append(_createAstOpBody, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String caseMappingReference(final MappingReference object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createAstOpDeclaration = this.createAstOpDeclaration(object);
    _builder.append(_createAstOpDeclaration, "");
    CharSequence _createAstOpBody = this.createAstOpBody(object);
    _builder.append(_createAstOpBody, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private CharSequence createAstOpBody(final MappingCreation object) {
    CharSequence _xblockexpression = null;
    {
      PathNameCS _from = object.getFrom();
      final String csName = this.doSwitch(_from);
      CharSequence _xifexpression = null;
      boolean _containsKey = this.csElement2AmbiguousRules.containsKey(csName);
      if (_containsKey) {
        CharSequence _xblockexpression_1 = null;
        {
          final MappingCreation[] ambiguousRules = this.csElement2AmbiguousRules.get(csName);
          final int ambiguousMapIndex = ((List<MappingCreation>)Conversions.doWrapArray(ambiguousRules)).indexOf(object);
          CharSequence _xifexpression_1 = null;
          int _size = ((List<MappingCreation>)Conversions.doWrapArray(ambiguousRules)).size();
          int _minus = (_size - 1);
          boolean _equals = (ambiguousMapIndex == _minus);
          if (_equals) {
            CharSequence _xifexpression_2 = null;
            boolean _isIsFallback = object.isIsFallback();
            if (_isIsFallback) {
              _xifexpression_2 = this.createNormalCase(object);
            } else {
              _xifexpression_2 = this.createAmbiguousCase(object, null);
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            MappingCreation _get = ambiguousRules[(ambiguousMapIndex + 1)];
            _xifexpression_1 = this.createAmbiguousCase(object, _get);
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = this.createNormalCase(object);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private CharSequence createNormalCase(final MappingCreation object) {
    CharSequence _xblockexpression = null;
    {
      PathNameCS _to = object.getTo();
      final String to = this.doSwitch(_to);
      final EList<PropertyDef> propAssigns = object.getProperties();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.asMetamodelName, "");
      _builder.append("::");
      _builder.append(to, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      {
        for(final PropertyDef stmnt : propAssigns) {
          String _doSwitch = this.doSwitch(stmnt);
          _builder.append(_doSwitch, "\t");
          {
            int _indexOf = propAssigns.indexOf(stmnt);
            int _size = propAssigns.size();
            int _minus = (_size - 1);
            boolean _lessThan = (_indexOf < _minus);
            if (_lessThan) {
              _builder.append(",");
            }
          }
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence createAmbiguousCase(final MappingCreation object, final MappingCreation nextAmbiguous) {
    CharSequence _xblockexpression = null;
    {
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(nextAmbiguous, null);
      if (_equals) {
        _xifexpression = "invalid";
      } else {
        _xifexpression = this.createAstOpBody(nextAmbiguous);
      }
      final CharSequence elseCase = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if ");
      String _rule = object.getRule();
      _builder.append(_rule, "");
      _builder.append("()");
      _builder.newLineIfNotEmpty();
      _builder.append("then ");
      CharSequence _createNormalCase = this.createNormalCase(object);
      _builder.append(_createNormalCase, "");
      _builder.newLineIfNotEmpty();
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(elseCase, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("endif");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence createAstOpBody(final MappingReference object) {
    StringConcatenation _builder = new StringConcatenation();
    ExpCS _expression = object.getExpression();
    String _doSwitch = this.doSwitch(_expression);
    _builder.append(_doSwitch, "");
    return _builder;
  }
  
  @Override
  public String casePropertyDef(final PropertyDef object) {
    StringConcatenation _builder = new StringConcatenation();
    PathNameCS _propRef = object.getPropRef();
    String _doSwitch = this.doSwitch(_propRef);
    _builder.append(_doSwitch, "");
    _builder.append(" = ");
    ExpCS _propInit = object.getPropInit();
    String _doSwitch_1 = this.doSwitch(_propInit);
    _builder.append(_doSwitch_1, "");
    return _builder.toString();
  }
  
  private Map<String, MappingCreation[]> csElementToAmbiguousRules(final MappingSect mappingSect, final DisambiguationSect disambSect) {
    HashMap<String, Map<String, Integer>> csName2rulesPosMap = new HashMap<String, Map<String, Integer>>();
    EList<DisambiguationDef> _disambiguations = disambSect.getDisambiguations();
    for (final DisambiguationDef disambiguation : _disambiguations) {
      {
        PathNameCS _classRef = disambiguation.getClassRef();
        final String csName = this.doSwitch(_classRef);
        final HashMap<String, Integer> ruleName2Pos = new HashMap<String, Integer>();
        csName2rulesPosMap.put(csName, ruleName2Pos);
        {
          int i = 0;
          final EList<DisambiguationRule> rules = disambiguation.getRules();
          int _size = rules.size();
          boolean _lessThan = (i < _size);
          boolean _while = _lessThan;
          while (_while) {
            {
              final DisambiguationRule statement = rules.get(i);
              String _name = statement.getName();
              ruleName2Pos.put(_name, Integer.valueOf(i));
            }
            i++;
            int _size_1 = rules.size();
            boolean _lessThan_1 = (i < _size_1);
            _while = _lessThan_1;
          }
        }
      }
    }
    final LinkedHashMap<String, MappingCreation[]> result = new LinkedHashMap<String, MappingCreation[]>();
    EList<MappingDef> _mappings = mappingSect.getMappings();
    Iterable<MappingCreation> _filter = Iterables.<MappingCreation>filter(_mappings, MappingCreation.class);
    for (final MappingCreation classMap : _filter) {
      {
        PathNameCS _from = classMap.getFrom();
        final String csName = this.doSwitch(_from);
        final Map<String, Integer> ruleName2PosMap = csName2rulesPosMap.get(csName);
        boolean _notEquals = (!Objects.equal(ruleName2PosMap, null));
        if (_notEquals) {
          MappingCreation[] mappings = result.get(csName);
          boolean _equals = Objects.equal(mappings, null);
          if (_equals) {
            int _size = ruleName2PosMap.size();
            MappingCreation[] _newArrayOfSize = new MappingCreation[_size];
            mappings = _newArrayOfSize;
            result.put(csName, mappings);
          }
          boolean _isIsFallback = classMap.isIsFallback();
          if (_isIsFallback) {
            final MappingCreation[] _converted_mappings = (MappingCreation[])mappings;
            int _size_1 = ((List<MappingCreation>)Conversions.doWrapArray(_converted_mappings)).size();
            int _plus = (_size_1 + 1);
            MappingCreation[] newMappings = new MappingCreation[_plus];
            for (int i = 0; (i < ((List<MappingCreation>)Conversions.doWrapArray(mappings)).size()); i++) {
              MappingCreation _get = mappings[i];
              newMappings[i] = _get;
            }
            final MappingCreation[] _converted_mappings_1 = (MappingCreation[])mappings;
            int _size_2 = ((List<MappingCreation>)Conversions.doWrapArray(_converted_mappings_1)).size();
            newMappings[_size_2] = classMap;
            result.put(csName, newMappings);
          } else {
            String _rule = classMap.getRule();
            Integer _get = ruleName2PosMap.get(_rule);
            mappings[(_get).intValue()] = classMap;
          }
        }
      }
    }
    return result;
  }
}
