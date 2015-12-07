package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathElementCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.TemplateSignatureCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.generator.CS2ASDSL_To_OCLBaseVisitor;

@SuppressWarnings("all")
public class CS2ASDSL_To_OCLHelpersVisitor extends CS2ASDSL_To_OCLBaseVisitor {
  private Map<String, List<ClassHelper>> package2classHelpers;
  
  private Map<String, List<ClassHelper>> computePackage2classHelpers(final HelpersSect sect) {
    boolean _equals = Objects.equal(sect, null);
    if (_equals) {
      return CollectionLiterals.<String, List<ClassHelper>>emptyMap();
    }
    final Map<String, List<ClassHelper>> result = CollectionLiterals.<String, List<ClassHelper>>newHashMap();
    EList<ClassHelper> _classHelpers = sect.getClassHelpers();
    for (final ClassHelper classHelper : _classHelpers) {
      {
        PathNameCS _context = classHelper.getContext();
        EList<PathElementCS> _ownedPathElements = _context.getOwnedPathElements();
        PathElementCS _get = _ownedPathElements.get(0);
        final String packageName = _get.getName();
        List<ClassHelper> classHelpers = result.get(packageName);
        boolean _equals_1 = Objects.equal(classHelpers, null);
        if (_equals_1) {
          ArrayList<ClassHelper> _newArrayList = CollectionLiterals.<ClassHelper>newArrayList();
          classHelpers = _newArrayList;
          result.put(packageName, classHelpers);
        }
        classHelpers.add(classHelper);
      }
    }
    return result;
  }
  
  @Override
  public String caseModel(final Model object) {
    String _xblockexpression = null;
    {
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
      sb.append(_builder);
      HelpersSect _helpersSect = object.getHelpersSect();
      Map<String, List<ClassHelper>> _computePackage2classHelpers = this.computePackage2classHelpers(_helpersSect);
      this.package2classHelpers = _computePackage2classHelpers;
      Set<Map.Entry<String, List<ClassHelper>>> _entrySet = this.package2classHelpers.entrySet();
      for (final Map.Entry<String, List<ClassHelper>> entry : _entrySet) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package ");
        String _key = entry.getKey();
        _builder_1.append(_key, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        {
          List<ClassHelper> _value = entry.getValue();
          for(final ClassHelper classHelper : _value) {
            String _doSwitch_2 = this.doSwitch(classHelper);
            _builder_1.append(_doSwitch_2, "");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.newLine();
        _builder_1.append("endpackage");
        _builder_1.newLine();
        sb.append(_builder_1);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseClassHelper(final ClassHelper object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("context ");
    PathNameCS _context = object.getContext();
    String _doSwitch = this.doSwitch(_context);
    _builder.append(_doSwitch, "");
    _builder.newLineIfNotEmpty();
    {
      EList<HelperDef> _helpers = object.getHelpers();
      for(final HelperDef helper : _helpers) {
        String _doSwitch_1 = this.doSwitch(helper);
        _builder.append(_doSwitch_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String caseHelperDef(final HelperDef object) {
    String _xblockexpression = null;
    {
      final EList<ParameterCS> params = object.getParams();
      String _xifexpression = null;
      TypedRefCS _ownedType = object.getOwnedType();
      boolean _equals = Objects.equal(_ownedType, null);
      if (_equals) {
        _xifexpression = ":";
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(":");
        TypedRefCS _ownedType_1 = object.getOwnedType();
        String _doSwitch = this.doSwitch(_ownedType_1);
        _builder.append(_doSwitch, "");
        _xifexpression = _builder.toString();
      }
      final String type = _xifexpression;
      String _xifexpression_1 = null;
      TemplateSignatureCS _ownedSignature = object.getOwnedSignature();
      boolean _equals_1 = Objects.equal(_ownedSignature, null);
      if (_equals_1) {
        _xifexpression_1 = "";
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        TemplateSignatureCS _ownedSignature_1 = object.getOwnedSignature();
        String _doSwitch_1 = this.doSwitch(_ownedSignature_1);
        _builder_1.append(_doSwitch_1, "");
        _builder_1.append(" ");
        _xifexpression_1 = _builder_1.toString();
      }
      final String template = _xifexpression_1;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("def : ");
      _builder_2.append(template, "");
      String _name = object.getName();
      _builder_2.append(_name, "");
      _builder_2.append("(");
      {
        for(final ParameterCS param : params) {
          {
            int _indexOf = params.indexOf(param);
            boolean _greaterThan = (_indexOf > 0);
            if (_greaterThan) {
              _builder_2.append(", ");
            }
          }
          String _doSwitch_2 = this.doSwitch(param);
          _builder_2.append(_doSwitch_2, "");
        }
      }
      _builder_2.append(") ");
      _builder_2.append(type, "");
      _builder_2.append(" =");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      ExpCS _helperBody = object.getHelperBody();
      String _doSwitch_3 = this.doSwitch(_helperBody);
      _builder_2.append(_doSwitch_3, "\t");
      _builder_2.newLineIfNotEmpty();
      _xblockexpression = _builder_2.toString();
    }
    return _xblockexpression;
  }
}
