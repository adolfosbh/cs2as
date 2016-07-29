package uk.ac.york.cs.cs2as.generator;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xcore.XClass;
import org.eclipse.xtend2.lib.StringConcatenation;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method ownedPathElements is undefined for the type CS2ASDSL_To_OCLHelpersVisitor"
      + "\nget cannot be resolved"
      + "\nname cannot be resolved");
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
    XClass _context = object.getContext();
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method ownedSignature is undefined for the type CS2ASDSL_To_OCLHelpersVisitor"
      + "\nThe method ownedSignature is undefined for the type CS2ASDSL_To_OCLHelpersVisitor"
      + "\n== cannot be resolved"
      + "\ndoSwitch cannot be resolved");
  }
}
