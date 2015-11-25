package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
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
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap;
import uk.ac.york.cs.cs2as.generator.CS2ASDSL_To_OCLBaseVisitor;

@SuppressWarnings("all")
public class CS2ASDSL_To_OCLMappingsVisitor extends CS2ASDSL_To_OCLBaseVisitor {
  private Map<String, ClassMap[]> csElement2AmbiguousRules;
  
  private String baseFileName;
  
  public CS2ASDSL_To_OCLMappingsVisitor(final String baseFileName) {
    this.baseFileName = baseFileName;
  }
  
  @Override
  public String caseModel(final Model object) {
    String _xblockexpression = null;
    {
      MappingSect _mappingSect = object.getMappingSect();
      DisambiguationSect _disambiguationSect = object.getDisambiguationSect();
      Map<String, ClassMap[]> _csElementToAmbiguousRules = this.csElementToAmbiguousRules(_mappingSect, _disambiguationSect);
      this.csElement2AmbiguousRules = _csElementToAmbiguousRules;
      final StringBuilder sb = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
      CSDecl _csDecl = object.getCsDecl();
      String _doSwitch = this.doSwitch(_csDecl);
      _builder.append(_doSwitch, "");
      _builder.newLineIfNotEmpty();
      ASDecl _asDecl = object.getAsDecl();
      String _doSwitch_1 = this.doSwitch(_asDecl);
      _builder.append(_doSwitch_1, "");
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
      CSDecl _csDecl_1 = object.getCsDecl();
      EList<ImportCS> _metamodels = _csDecl_1.getMetamodels();
      ImportCS _get = _metamodels.get(0);
      String _name = _get.getName();
      _builder_1.append(_name, "");
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
      EList<ClassMap> _mappings = object.getMappings();
      for (final ClassMap classMap : _mappings) {
        {
          PathNameCS _from = classMap.getFrom();
          final String csName = this.doSwitch(_from);
          boolean shouldProcess = true;
          boolean _containsKey = this.csElement2AmbiguousRules.containsKey(csName);
          if (_containsKey) {
            ClassMap[] _get = this.csElement2AmbiguousRules.get(csName);
            ClassMap _get_1 = _get[0];
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
  
  @Override
  public String caseClassMap(final ClassMap object) {
    String _xblockexpression = null;
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
      _builder.append(to, "");
      _builder.append(" =");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createClassMapContent = this.createClassMapContent(object);
      _builder.append(_createClassMapContent, "\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private CharSequence createClassMapContent(final ClassMap object) {
    CharSequence _xblockexpression = null;
    {
      PathNameCS _from = object.getFrom();
      final String csName = this.doSwitch(_from);
      CharSequence _xifexpression = null;
      boolean _containsKey = this.csElement2AmbiguousRules.containsKey(csName);
      if (_containsKey) {
        CharSequence _xblockexpression_1 = null;
        {
          final ClassMap[] ambiguousRules = this.csElement2AmbiguousRules.get(csName);
          final int ambiguousMapIndex = ((List<ClassMap>)Conversions.doWrapArray(ambiguousRules)).indexOf(object);
          CharSequence _xifexpression_1 = null;
          int _size = ((List<ClassMap>)Conversions.doWrapArray(ambiguousRules)).size();
          int _minus = (_size - 1);
          boolean _equals = (ambiguousMapIndex == _minus);
          if (_equals) {
            _xifexpression_1 = this.createAmbiguousCase(object, null);
          } else {
            ClassMap _get = ambiguousRules[(ambiguousMapIndex + 1)];
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
  
  private CharSequence createNormalCase(final ClassMap object) {
    CharSequence _xblockexpression = null;
    {
      PathNameCS _to = object.getTo();
      final String to = this.doSwitch(_to);
      EList<ClassMapStmnt> _statements = object.getStatements();
      EList<ClassMapStmnt> _statements_1 = object.getStatements();
      int _size = _statements_1.size();
      int _minus = (_size - 1);
      final ClassMapStmnt lastStmnt = _statements.get(_minus);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(to, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      {
        EList<ClassMapStmnt> _statements_2 = object.getStatements();
        for(final ClassMapStmnt stmnt : _statements_2) {
          String _doSwitch = this.doSwitch(stmnt);
          _builder.append(_doSwitch, "\t");
          {
            boolean _notEquals = (!Objects.equal(stmnt, lastStmnt));
            if (_notEquals) {
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
  
  private CharSequence createAmbiguousCase(final ClassMap object, final ClassMap nextAmbiguous) {
    CharSequence _xblockexpression = null;
    {
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(nextAmbiguous, null);
      if (_equals) {
        _xifexpression = "invalid";
      } else {
        _xifexpression = this.createClassMapContent(nextAmbiguous);
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
  
  @Override
  public String casePropertyMap(final PropertyMap object) {
    StringConcatenation _builder = new StringConcatenation();
    String _propName = object.getPropName();
    _builder.append(_propName, "");
    _builder.append(" = ");
    ExpCS _propInit = object.getPropInit();
    String _doSwitch = this.doSwitch(_propInit);
    _builder.append(_doSwitch, "");
    return _builder.toString();
  }
  
  private Map<String, ClassMap[]> csElementToAmbiguousRules(final MappingSect mappingSect, final DisambiguationSect disambSect) {
    HashMap<String, Map<String, Integer>> csName2Map = new HashMap<String, Map<String, Integer>>();
    EList<ClassDisambiguation> _disambiguations = disambSect.getDisambiguations();
    for (final ClassDisambiguation disambiguation : _disambiguations) {
      {
        PathNameCS _class_ = disambiguation.getClass_();
        final String csName = this.doSwitch(_class_);
        final HashMap<String, Integer> ruleName2PosMap = new HashMap<String, Integer>();
        csName2Map.put(csName, ruleName2PosMap);
        {
          int i = 0;
          final EList<ClassDisambiguationStmnt> statements = disambiguation.getStatements();
          int _size = statements.size();
          boolean _lessThan = (i < _size);
          boolean _while = _lessThan;
          while (_while) {
            {
              final ClassDisambiguationStmnt statement = statements.get(i);
              if ((statement instanceof DisambiguationDef)) {
                String _name = ((DisambiguationDef)statement).getName();
                ruleName2PosMap.put(_name, Integer.valueOf(i));
              }
            }
            i++;
            int _size_1 = statements.size();
            boolean _lessThan_1 = (i < _size_1);
            _while = _lessThan_1;
          }
        }
      }
    }
    final LinkedHashMap<String, ClassMap[]> result = new LinkedHashMap<String, ClassMap[]>();
    EList<ClassMap> _mappings = mappingSect.getMappings();
    for (final ClassMap classMap : _mappings) {
      {
        PathNameCS _from = classMap.getFrom();
        final String csName = this.doSwitch(_from);
        final Map<String, Integer> ruleName2PosMap = csName2Map.get(csName);
        boolean _notEquals = (!Objects.equal(ruleName2PosMap, null));
        if (_notEquals) {
          ClassMap[] mappings = result.get(csName);
          boolean _equals = Objects.equal(mappings, null);
          if (_equals) {
            int _size = ruleName2PosMap.size();
            ClassMap[] _newArrayOfSize = new ClassMap[_size];
            mappings = _newArrayOfSize;
            result.put(csName, mappings);
          }
          String _rule = classMap.getRule();
          Integer _get = ruleName2PosMap.get(_rule);
          mappings[(_get).intValue()] = classMap;
        }
      }
    }
    return result;
  }
}
