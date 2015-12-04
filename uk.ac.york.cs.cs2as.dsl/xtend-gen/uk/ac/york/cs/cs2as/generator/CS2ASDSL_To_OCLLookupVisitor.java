package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;
import uk.ac.york.cs.cs2as.generator.CS2ASDSL_To_OCLBaseVisitor;

@SuppressWarnings("all")
public class CS2ASDSL_To_OCLLookupVisitor extends CS2ASDSL_To_OCLBaseVisitor {
  private final String ALL_CHILDREN = "__all__children";
  
  private String lookupPck = "lookup";
  
  private String lookupEnv = "LookupEnvironment";
  
  private String targetPckName;
  
  private String sourcePckName;
  
  private String defaultNE;
  
  private String defaultNEP;
  
  private Map<String, List<String>> element2qualifiers;
  
  private Map<String, ScopeDef> feaName2scopes = CollectionLiterals.<String, ScopeDef>newHashMap();
  
  private Map<String, ExportDef> feaName2exports = CollectionLiterals.<String, ExportDef>newHashMap();
  
  /**
   * default name referencer
   */
  private String defaultNR;
  
  /**
   * default name referencer property
   */
  private String defaultNRP;
  
  /**
   * default name qualifier
   */
  private String defaultNQ;
  
  /**
   * default name qualifier property
   */
  private String defaultNQP;
  
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
      _builder.append("import \'Lookup.ecore\'");
      _builder.newLine();
      _builder.newLine();
      sb.append(_builder);
      CSDecl _csDecl_1 = object.getCsDecl();
      EList<ImportCS> _metamodels = _csDecl_1.getMetamodels();
      ImportCS _get = _metamodels.get(0);
      String _name = _get.getName();
      this.sourcePckName = _name;
      ASDecl _asDecl_1 = object.getAsDecl();
      EList<ImportCS> _metamodels_1 = _asDecl_1.getMetamodels();
      ImportCS _get_1 = _metamodels_1.get(0);
      String _name_1 = _get_1.getName();
      this.targetPckName = _name_1;
      NameResolutionSect _nameresoSect = object.getNameresoSect();
      Map<String, List<String>> _computeQualifiers = this.computeQualifiers(_nameresoSect);
      this.element2qualifiers = _computeQualifiers;
      NameResolutionSect _nameresoSect_1 = object.getNameresoSect();
      this.computeFeatName2Contribs(_nameresoSect_1, this.feaName2scopes, this.feaName2exports);
      NameResolutionSect _nameresoSect_2 = object.getNameresoSect();
      DefaultNamedElementDef _namedElement = _nameresoSect_2.getNamedElement();
      String _nameElement = _namedElement.getNameElement();
      this.defaultNE = _nameElement;
      NameResolutionSect _nameresoSect_3 = object.getNameresoSect();
      DefaultNamedElementDef _namedElement_1 = _nameresoSect_3.getNamedElement();
      NameExpCS _nameProperty = _namedElement_1.getNameProperty();
      String _doSwitch_2 = this.doSwitch(_nameProperty);
      this.defaultNEP = _doSwitch_2;
      NameResolutionSect _nameresoSect_4 = object.getNameresoSect();
      DefaultNameReferencerDef _nameReferencer = _nameresoSect_4.getNameReferencer();
      String _nameReferencer_1 = _nameReferencer.getNameReferencer();
      this.defaultNR = _nameReferencer_1;
      NameResolutionSect _nameresoSect_5 = object.getNameresoSect();
      DefaultNameReferencerDef _nameReferencer_2 = _nameresoSect_5.getNameReferencer();
      NameExpCS _nameProperty_1 = _nameReferencer_2.getNameProperty();
      String _doSwitch_3 = this.doSwitch(_nameProperty_1);
      this.defaultNRP = _doSwitch_3;
      NameResolutionSect _nameresoSect_6 = object.getNameresoSect();
      NameQualifierDef _nameQualifier = _nameresoSect_6.getNameQualifier();
      String _nameQualifier_1 = _nameQualifier.getNameQualifier();
      this.defaultNQ = _nameQualifier_1;
      NameResolutionSect _nameresoSect_7 = object.getNameresoSect();
      NameQualifierDef _nameQualifier_2 = _nameresoSect_7.getNameQualifier();
      NameExpCS _segmentsProp = _nameQualifier_2.getSegmentsProp();
      String _doSwitch_4 = this.doSwitch(_segmentsProp);
      this.defaultNQP = _doSwitch_4;
      StringConcatenation _builder_1 = new StringConcatenation();
      CharSequence _commonLookupInfrastructure = this.commonLookupInfrastructure();
      _builder_1.append(_commonLookupInfrastructure, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("package ");
      _builder_1.append(this.targetPckName, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      NameResolutionSect _nameresoSect_8 = object.getNameresoSect();
      String _doSwitch_5 = this.doSwitch(_nameresoSect_8);
      _builder_1.append(_doSwitch_5, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("context Visitable");
      _builder_1.newLine();
      NameResolutionSect _nameresoSect_9 = object.getNameresoSect();
      String _provideLookupMethods = this.provideLookupMethods(_nameresoSect_9);
      _builder_1.append(_provideLookupMethods, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("endpackage");
      _builder_1.newLine();
      StringBuilder _append = sb.append(_builder_1);
      _xblockexpression = _append.toString();
    }
    return _xblockexpression;
  }
  
  private CharSequence commonLookupInfrastructure() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ocl");
    _builder.newLine();
    _builder.append("---- Default Environment related functionality");
    _builder.newLine();
    _builder.append("context OclElement");
    _builder.newLine();
    _builder.append("--\t");
    _builder.newLine();
    _builder.append("def : env() : ");
    _builder.append(this.lookupPck, "");
    _builder.append("::");
    _builder.append(this.lookupEnv, "");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("_env(null)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def : _env(child : OclElement) : ");
    _builder.append(this.lookupPck, "");
    _builder.append("::");
    _builder.append(this.lookupEnv, "");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("parentEnv()");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("def : _exported_env(from : OclElement) : ");
    _builder.append(this.lookupPck, "");
    _builder.append("::");
    _builder.append(this.lookupEnv, "");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.lookupPck, "\t");
    _builder.append("::");
    _builder.append(this.lookupEnv, "\t");
    _builder.append(" { }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("def : parentEnv() : ");
    _builder.append(this.lookupPck, "");
    _builder.append("::");
    _builder.append(this.lookupEnv, "");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("let parent = oclContainer() in if parent = null then ");
    _builder.append(this.lookupPck, "\t");
    _builder.append("::");
    _builder.append(this.lookupEnv, "\t");
    _builder.append(" { } else parent._env(self) endif");
    _builder.newLineIfNotEmpty();
    _builder.append("endpackage ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(this.lookupPck, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("context ");
    _builder.append(this.lookupEnv, "");
    _builder.newLineIfNotEmpty();
    _builder.append("def : nestedEnv() : ");
    _builder.append(this.lookupEnv, "");
    _builder.append(" = ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.lookupEnv, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("parentEnv = self");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def : addElementsOf(element : ocl::OclElement) : ");
    _builder.append(this.lookupEnv, "");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("let newEnv = element._env(null)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("in ");
    _builder.append(this.lookupEnv, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("namedElements = self.namedElements->including(newEnv.namedElements)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def : addElementsOf(elements : Collection(ocl::OclElement)) : ");
    _builder.append(this.lookupEnv, "");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("elements->iterate(element ; acc : ");
    _builder.append(this.lookupEnv, "\t");
    _builder.append(" = self ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("| acc.addElementsOf(element))");
    _builder.newLine();
    _builder.newLine();
    _builder.append("endpackage");
    _builder.newLine();
    return _builder;
  }
  
  private Map<String, List<String>> computeQualifiers(final NameResolutionSect nrSect) {
    final Map<String, List<String>> result = CollectionLiterals.<String, List<String>>newLinkedHashMap();
    EList<ClassNameResolution> _nameResolutions = nrSect.getNameResolutions();
    for (final ClassNameResolution nameResolution : _nameResolutions) {
      EList<ClassNameResolutionStmnt> _statements = nameResolution.getStatements();
      for (final ClassNameResolutionStmnt statemnt : _statements) {
        if ((statemnt instanceof NamedElementDef)) {
          EList<QualificationDef> _qualification = ((NamedElementDef)statemnt).getQualification();
          for (final QualificationDef qDef : _qualification) {
            {
              TypedRefCS _qualifiedClass = qDef.getQualifiedClass();
              final String qualifiedElement = this.doSwitch(_qualifiedClass);
              List<String> qualifiers = result.get(qualifiedElement);
              boolean _equals = Objects.equal(qualifiers, null);
              if (_equals) {
                ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
                qualifiers = _newArrayList;
                result.put(qualifiedElement, qualifiers);
              }
              PathNameCS _class_ = nameResolution.getClass_();
              String _doSwitch = this.doSwitch(_class_);
              qualifiers.add(_doSwitch);
            }
          }
        }
      }
    }
    return result;
  }
  
  private void computeFeatName2Contribs(final NameResolutionSect nrSect, final Map<String, ScopeDef> scopes, final Map<String, ExportDef> exports) {
    EList<ClassNameResolution> _nameResolutions = nrSect.getNameResolutions();
    for (final ClassNameResolution nameReso : _nameResolutions) {
      {
        PathNameCS _class_ = nameReso.getClass_();
        final String className = this.doSwitch(_class_);
        EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
        for (final ClassNameResolutionStmnt statmnt : _statements) {
          if ((statmnt instanceof ScopeDef)) {
            SelectionDef _selectionDef = ((ScopeDef)statmnt).getSelectionDef();
            this.<ScopeDef>addStatement2Map(((ScopeDef)statmnt), scopes, _selectionDef, className);
          } else {
            if ((statmnt instanceof ExportDef)) {
              SelectionDef _selectionDef_1 = ((ExportDef)statmnt).getSelectionDef();
              this.<ExportDef>addStatement2Map(((ExportDef)statmnt), exports, _selectionDef_1, className);
            }
          }
        }
      }
    }
  }
  
  private <Def extends ClassNameResolutionStmnt> Def addStatement2Map(final Def statmnt, final Map<String, Def> result, final SelectionDef selection, final String className) {
    Def _xifexpression = null;
    if ((selection instanceof SelectionSpecific)) {
      EList<ExpCS> _selectedProperties = ((SelectionSpecific)selection).getSelectedProperties();
      for (final ExpCS property : _selectedProperties) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(className, "");
        _builder.append("::");
        String _doSwitch = this.doSwitch(property);
        _builder.append(_doSwitch, "");
        result.put(_builder.toString(), statmnt);
      }
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(className, "");
      _builder_1.append("::");
      _builder_1.append(this.ALL_CHILDREN, "");
      _xifexpression = result.put(_builder_1.toString(), statmnt);
    }
    return _xifexpression;
  }
  
  @Override
  public String caseNameResolutionSect(final NameResolutionSect object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ClassNameResolution> _nameResolutions = object.getNameResolutions();
      for(final ClassNameResolution nameResolution : _nameResolutions) {
        String _doSwitch = this.doSwitch(nameResolution);
        _builder.append(_doSwitch, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String caseClassNameResolution(final ClassNameResolution object) {
    String _xblockexpression = null;
    {
      EList<ClassNameResolutionStmnt> _statements = object.getStatements();
      Iterable<ExportDef> _filter = Iterables.<ExportDef>filter(_statements, ExportDef.class);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter);
      final boolean containsExports = (!_isEmpty);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("context ");
      PathNameCS _class_ = object.getClass_();
      String _doSwitch = this.doSwitch(_class_);
      _builder.append(_doSwitch, "");
      _builder.newLineIfNotEmpty();
      {
        EList<ClassNameResolutionStmnt> _statements_1 = object.getStatements();
        Iterable<NamedElementDef> _filter_1 = Iterables.<NamedElementDef>filter(_statements_1, NamedElementDef.class);
        for(final NamedElementDef statement : _filter_1) {
          String _doSwitch_1 = this.doSwitch(statement);
          _builder.append(_doSwitch_1, "");
        }
      }
      _builder.newLineIfNotEmpty();
      String _provideEnvMethod = this.provideEnvMethod(object);
      _builder.append(_provideEnvMethod, "");
      _builder.newLineIfNotEmpty();
      {
        if (containsExports) {
          String _provideExportedEnvMethod = this.provideExportedEnvMethod(object);
          _builder.append(_provideExportedEnvMethod, "");
          _builder.newLineIfNotEmpty();
          String _provideExporterLookupMethod = this.provideExporterLookupMethod(object);
          _builder.append(_provideExporterLookupMethod, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseNamedElementDef(final NamedElementDef object) {
    String _xblockexpression = null;
    {
      final EList<QualificationDef> qualifications = object.getQualification();
      String _xifexpression = null;
      boolean _equals = Objects.equal(qualifications, null);
      if (_equals) {
        return "";
      } else {
        String _xblockexpression_1 = null;
        {
          final StringBuilder sb = new StringBuilder();
          final List<ElementsContribExp> qualificationConstribs = CollectionLiterals.<ElementsContribExp>newArrayList();
          for (final QualificationDef qualification : qualifications) {
            {
              TypedRefCS _qualifiedClass = qualification.getQualifiedClass();
              final String className = this.doSwitch(_qualifiedClass);
              final String nClassName = this.normalizeString(className);
              String _lowerCase = className.toLowerCase();
              char _charAt = _lowerCase.charAt(0);
              final String nameParam = (Character.valueOf(_charAt) + "Name");
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("def : _lookupQualified");
              _builder.append(nClassName, "");
              _builder.append("(");
              _builder.append(nameParam, "");
              _builder.append(" : String) : ");
              _builder.append(className, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("let found");
              _builder.append(nClassName, "\t");
              _builder.append(" = _lookup");
              _builder.append(nClassName, "\t");
              _builder.append("(_qualified_env(), ");
              _builder.append(nameParam, "\t");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("in  if found");
              _builder.append(nClassName, "\t");
              _builder.append("->isEmpty()");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("then null");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("else found");
              _builder.append(nClassName, "\t\t");
              _builder.append("->first()");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("endif");
              _builder.newLine();
              {
                boolean _notEquals = (!Objects.equal(this.defaultNR, null));
                if (_notEquals) {
                  CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, ("Qualified" + nClassName));
                  _builder.append(_provideLookupByNameReferencerMethod, "");
                }
              }
              _builder.newLineIfNotEmpty();
              sb.append(_builder);
              EList<ElementsContribExp> _contribution = qualification.getContribution();
              qualificationConstribs.addAll(_contribution);
            }
          }
          boolean _isEmpty = qualificationConstribs.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("def : _qualified_env() : ");
            _builder.append(this.lookupPck, "");
            _builder.append("::");
            _builder.append(this.lookupEnv, "");
            _builder.append(" =");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("let env = ");
            _builder.append(this.lookupPck, "\t");
            _builder.append("::");
            _builder.append(this.lookupEnv, "\t");
            _builder.append("{}");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("in env");
            _builder.newLine();
            _builder.append("\t\t");
            {
              for(final ElementsContribExp contrib : qualificationConstribs) {
                String _doSwitch = this.doSwitch(contrib);
                _builder.append(_doSwitch, "\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            sb.append(_builder);
          }
          _xblockexpression_1 = sb.toString();
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseElementsContribExp(final ElementsContribExp object) {
    String _xifexpression = null;
    boolean _isIsFollowing = object.isIsFollowing();
    if (_isIsFollowing) {
      String _xblockexpression = null;
      {
        EObject _eContainer = object.eContainer();
        EObject _eContainer_1 = _eContainer.eContainer();
        final ScopeDef scopeDef = ((ScopeDef) _eContainer_1);
        SelectionDef _selectionDef = scopeDef.getSelectionDef();
        EList<ExpCS> _selectedProperties = ((SelectionSpecific) _selectionDef).getSelectedProperties();
        final ExpCS property = _selectedProperties.get(0);
        final String propertyName = this.doSwitch(property);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".addElements(");
        ExpCS _expression = object.getExpression();
        String _doSwitch = this.doSwitch(_expression);
        _builder.append(_doSwitch, "");
        _builder.append("->select(x | self.");
        _builder.append(propertyName, "");
        _builder.append("->indexOf(x) < self.");
        _builder.append(propertyName, "");
        _builder.append("->indexOf(child)))");
        _xblockexpression = _builder.toString();
      }
      _xifexpression = _xblockexpression;
    } else {
      String _xblockexpression_1 = null;
      {
        String _xifexpression_1 = null;
        boolean _isIsImported = object.isIsImported();
        if (_isIsImported) {
          _xifexpression_1 = "._exported_env(self).namedElements";
        } else {
          _xifexpression_1 = "";
        }
        final String exportEnvCall = _xifexpression_1;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".addElements(");
        ExpCS _expression = object.getExpression();
        String _doSwitch = this.doSwitch(_expression);
        _builder.append(_doSwitch, "");
        _builder.append(exportEnvCall, "");
        _builder.append(")");
        _xblockexpression_1 = _builder.toString();
      }
      _xifexpression = _xblockexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public String caseScopeDef(final ScopeDef object) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _isEmptyScope = object.isEmptyScope();
      if (_isEmptyScope) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("let env = ");
        _builder.append(this.lookupPck, "");
        _builder.append("::");
        _builder.append(this.lookupEnv, "");
        _builder.newLineIfNotEmpty();
        _builder.append("in env");
        _xifexpression = _builder.toString();
      } else {
        String _xblockexpression_1 = null;
        {
          String _xifexpression_1 = null;
          boolean _isSameScope = object.isSameScope();
          if (_isSameScope) {
            _xifexpression_1 = "";
          } else {
            _xifexpression_1 = ".nestedEnv()";
          }
          final String openScope = _xifexpression_1;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("parentEnv()");
          _builder_1.append(openScope, "");
          _xblockexpression_1 = _builder_1.toString();
        }
        _xifexpression = _xblockexpression_1;
      }
      final String scope = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(scope, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      ContributionDef _contribution = object.getContribution();
      String _doSwitch = this.doSwitch(_contribution);
      _builder_1.append(_doSwitch, "\t");
      _builder_1.newLineIfNotEmpty();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseExportDef(final ExportDef object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("let env = ");
    _builder.append(this.lookupPck, "");
    _builder.append("::");
    _builder.append(this.lookupEnv, "");
    _builder.append(" {}");
    _builder.newLineIfNotEmpty();
    _builder.append("in env");
    _builder.newLine();
    _builder.append("\t");
    ContributionDef _contribution = object.getContribution();
    String _doSwitch = this.doSwitch(_contribution);
    _builder.append(_doSwitch, "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String caseContributionDef(final ContributionDef object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ElementsContribExp> _contributions = object.getContributions();
      for(final ElementsContribExp contrib : _contributions) {
        String _doSwitch = this.doSwitch(contrib);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String provideLookupMethods(final NameResolutionSect nameResoSect) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      EList<ClassNameResolution> _nameResolutions = nameResoSect.getNameResolutions();
      for (final ClassNameResolution resolution : _nameResolutions) {
        EList<ClassNameResolutionStmnt> _statements = resolution.getStatements();
        for (final ClassNameResolutionStmnt statmt : _statements) {
          {
            PathNameCS _class_ = resolution.getClass_();
            final String className = this.doSwitch(_class_);
            final String nClassName = this.normalizeString(className);
            String _lowerCase = className.toLowerCase();
            char _charAt = _lowerCase.charAt(0);
            final String nameParam = (Character.valueOf(_charAt) + "Name");
            if ((statmt instanceof NamedElementDef)) {
              String _xifexpression = null;
              NameExpCS _namePoperty = ((NamedElementDef)statmt).getNamePoperty();
              boolean _notEquals = (!Objects.equal(_namePoperty, null));
              if (_notEquals) {
                NameExpCS _namePoperty_1 = ((NamedElementDef)statmt).getNamePoperty();
                _xifexpression = this.doSwitch(_namePoperty_1);
              } else {
                _xifexpression = this.defaultNEP;
              }
              final String nameProp = _xifexpression;
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("-- ");
              _builder.append(nClassName, "");
              _builder.append(" lookup");
              _builder.newLineIfNotEmpty();
              _builder.append("def : _lookup");
              _builder.append(nClassName, "");
              _builder.append("(env : ");
              _builder.append(this.lookupPck, "");
              _builder.append("::");
              _builder.append(this.lookupEnv, "");
              _builder.append(", ");
              _builder.append(nameParam, "");
              _builder.append(" : String) : OrderedSet(");
              _builder.append(className, "");
              _builder.append(") =");
              _builder.newLineIfNotEmpty();
              _builder.append("let found");
              _builder.append(nClassName, "");
              _builder.append(" = env.namedElements->selectByKind(");
              _builder.append(className, "");
              _builder.append(")->select(");
              _builder.append(nameProp, "");
              _builder.append(" = ");
              _builder.append(nameParam, "");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("in  if found");
              _builder.append(nClassName, "");
              _builder.append("->isEmpty() and not (env.parentEnv = null)");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("then _lookup");
              _builder.append(nClassName, "\t");
              _builder.append("(env.parentEnv, ");
              _builder.append(nameParam, "\t");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("else found");
              _builder.append(nClassName, "\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("endif");
              _builder.newLine();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("-- Note: when calling this method, the source element of the argument passed to this method, will be the contextual ");
              _builder.newLine();
              _builder.append("-- object on which error reports will be handled");
              _builder.newLine();
              _builder.append("def : _lookup");
              _builder.append(nClassName, "");
              _builder.append("(");
              _builder.append(nameParam, "");
              _builder.append(" : String) : ");
              _builder.append(className, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("let found");
              _builder.append(nClassName, "");
              _builder.append(" = _lookup");
              _builder.append(nClassName, "");
              _builder.append("(env(), ");
              _builder.append(nameParam, "");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("in  if found");
              _builder.append(nClassName, "");
              _builder.append("->isEmpty()");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("then null");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("else found");
              _builder.append(nClassName, "\t");
              _builder.append("->first() -- LookupVisitor will report ambiguous result");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("endif");
              _builder.newLine();
              {
                boolean _notEquals_1 = (!Objects.equal(this.defaultNR, null));
                if (_notEquals_1) {
                  CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, nClassName);
                  _builder.append(_provideLookupByNameReferencerMethod, "");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                List<String> _get = this.element2qualifiers.get(className);
                boolean _notEquals_2 = (!Objects.equal(_get, null));
                if (_notEquals_2) {
                  CharSequence _provideQualifiedLookupMethods = this.provideQualifiedLookupMethods(className, nClassName);
                  _builder.append(_provideQualifiedLookupMethods, "");
                }
              }
              _builder.newLineIfNotEmpty();
              sb.append(_builder);
            } else {
              if ((statmt instanceof ExportDef)) {
                TypedRefCS _exportedClass = ((ExportDef)statmt).getExportedClass();
                final String exportedClassName = this.doSwitch(_exportedClass);
                final String nExportedClassName = this.normalizeString(exportedClassName);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("-- ");
                _builder_1.append(nClassName, "");
                _builder_1.append(" exports ");
                _builder_1.append(nExportedClassName, "");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                _builder_1.newLine();
                {
                  boolean _equals = Objects.equal(this.defaultNR, null);
                  if (_equals) {
                    _builder_1.append("def : lookup");
                    _builder_1.append(nExportedClassName, "");
                    _builder_1.append("From(exporter : ");
                    _builder_1.append(className, "");
                    _builder_1.append(" , ");
                    _builder_1.append(nameParam, "");
                    _builder_1.append(" : String) : ");
                    _builder_1.append(exportedClassName, "");
                    _builder_1.append("[?] =");
                    _builder_1.newLineIfNotEmpty();
                    _builder_1.append("\t");
                    _builder_1.append("exporter.lookupExported");
                    _builder_1.append(nExportedClassName, "\t");
                    _builder_1.append("(self, ");
                    _builder_1.append(nameParam, "\t");
                    _builder_1.append(")");
                    _builder_1.newLineIfNotEmpty();
                  } else {
                    _builder_1.append("def : lookup");
                    _builder_1.append(nExportedClassName, "");
                    _builder_1.append("From(exporter : ");
                    _builder_1.append(className, "");
                    _builder_1.append(", a");
                    _builder_1.append(this.defaultNR, "");
                    _builder_1.append(" : ");
                    _builder_1.append(this.sourcePckName, "");
                    _builder_1.append("::");
                    _builder_1.append(this.defaultNR, "");
                    _builder_1.append(") : ");
                    _builder_1.append(exportedClassName, "");
                    _builder_1.append("[?] =");
                    _builder_1.newLineIfNotEmpty();
                    _builder_1.append("\t");
                    _builder_1.append("exporter.lookupExported");
                    _builder_1.append(nExportedClassName, "\t");
                    _builder_1.append("(self, a");
                    _builder_1.append(this.defaultNR, "\t");
                    _builder_1.append(")");
                    _builder_1.newLineIfNotEmpty();
                  }
                }
                _builder_1.newLine();
                {
                  List<String> _get_1 = this.element2qualifiers.get(exportedClassName);
                  boolean _notEquals_3 = (!Objects.equal(_get_1, null));
                  if (_notEquals_3) {
                    String _provideQualifiedLookupFromMethods = this.provideQualifiedLookupFromMethods(exportedClassName, nExportedClassName, className);
                    _builder_1.append(_provideQualifiedLookupFromMethods, "");
                  }
                }
                _builder_1.append("\t");
                _builder_1.newLineIfNotEmpty();
                sb.append(_builder_1);
              }
            }
          }
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private CharSequence provideLookupByNameReferencerMethod(final String className, final String nClassName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def : lookup");
    _builder.append(nClassName, "");
    _builder.append("(a");
    _builder.append(this.defaultNR, "");
    _builder.append(" : ");
    _builder.append(this.sourcePckName, "");
    _builder.append("::");
    _builder.append(this.defaultNR, "");
    _builder.append(") : ");
    _builder.append(className, "");
    _builder.append("[?] =");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("_lookup");
    _builder.append(nClassName, "   ");
    _builder.append("(a");
    _builder.append(this.defaultNR, "   ");
    _builder.append(".");
    _builder.append(this.defaultNRP, "   ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence provideQualifiedLookupMethods(final String className, final String nClassName) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("OrderedSet(");
      String _elementReferenerType = this.getElementReferenerType();
      _builder.append(_elementReferenerType, "");
      _builder.append(")");
      final String qualifierSegments = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("-- QN ");
      _builder_1.append(className, "");
      _builder_1.append(" lookup");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("def : lookup");
      _builder_1.append(nClassName, "");
      _builder_1.append("(a");
      _builder_1.append(this.defaultNQ, "");
      _builder_1.append(" : ");
      _builder_1.append(this.sourcePckName, "");
      _builder_1.append("::");
      _builder_1.append(this.defaultNQ, "");
      _builder_1.append(") : ");
      _builder_1.append(className, "");
      _builder_1.append("[?] =");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("lookup");
      _builder_1.append(nClassName, "   ");
      _builder_1.append("(a");
      _builder_1.append(this.defaultNQ, "   ");
      _builder_1.append(" .");
      _builder_1.append(this.defaultNQP, "   ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("def : lookup");
      _builder_1.append(nClassName, "");
      _builder_1.append("(segments : ");
      _builder_1.append(qualifierSegments, "");
      _builder_1.append(") : ");
      _builder_1.append(className, "");
      _builder_1.append("[?] =");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("if segments->size() = 1");
      _builder_1.newLine();
      _builder_1.append("   ");
      _builder_1.append("then lookup");
      _builder_1.append(nClassName, "   ");
      _builder_1.append("(segments->first())");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("else let qualifierSegments = segments->subOrderedSet(1,segments->size()-1),");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("qualifier = ");
      List<String> _get = this.element2qualifiers.get(className);
      String[] _clone = ((String[])Conversions.unwrapArray(_get, String.class)).clone();
      String _provideQualfiersLookupQuery = this.provideQualfiersLookupQuery(((List<String>)Conversions.doWrapArray(_clone)));
      _builder_1.append(_provideQualfiersLookupQuery, "            ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("        ");
      _builder_1.append("in qualifier?.lookupQualified");
      _builder_1.append(nClassName, "        ");
      _builder_1.append("(segments->last())");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("endif");
      _builder_1.newLine();
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  private String provideQualfiersLookupQuery(final List<String> qualifiers) {
    String _xblockexpression = null;
    {
      final String qualifier = qualifiers.get(0);
      List<String> _get = this.element2qualifiers.get(qualifier);
      final boolean isQualifierQualified = (!Objects.equal(_get, null));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("lookup");
      _builder.append(qualifier, "");
      _builder.append("(qualifierSegments");
      {
        if ((!isQualifierQualified)) {
          _builder.append("->first()");
        }
      }
      _builder.append(")");
      final String qualifierLookup = _builder.toString();
      String _xifexpression = null;
      int _size = qualifiers.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        _xifexpression = qualifierLookup;
      } else {
        String _xblockexpression_1 = null;
        {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("qualifier");
          int _size_1 = qualifiers.size();
          _builder_1.append(_size_1, "");
          final String letVar = _builder_1.toString();
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("let ");
          _builder_2.append(letVar, "");
          _builder_2.append(" = ");
          _builder_2.append(qualifierLookup, "");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("in if ");
          _builder_2.append(letVar, "");
          _builder_2.append(" = null");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("   ");
          _builder_2.append("then ");
          int _size_2 = qualifiers.size();
          List<String> _subList = qualifiers.subList(1, _size_2);
          String _provideQualfiersLookupQuery = this.provideQualfiersLookupQuery(_subList);
          _builder_2.append(_provideQualfiersLookupQuery, "   ");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("   ");
          _builder_2.append("else ");
          _builder_2.append(letVar, "   ");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("   ");
          _builder_2.append("endif");
          _builder_2.newLine();
          _xblockexpression_1 = _builder_2.toString();
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String provideQualifiedLookupFromMethods(final String className, final String nClassName, final String exporterClassName) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("OrderedSet(");
      String _elementReferenerType = this.getElementReferenerType();
      _builder.append(_elementReferenerType, "");
      _builder.append(")");
      final String qualifierSegments = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("def : lookup");
      _builder_1.append(nClassName, "");
      _builder_1.append("From(exporter : ");
      _builder_1.append(exporterClassName, "");
      _builder_1.append(", a");
      _builder_1.append(this.defaultNQ, "");
      _builder_1.append(" : ");
      _builder_1.append(this.sourcePckName, "");
      _builder_1.append("::");
      _builder_1.append(this.defaultNQ, "");
      _builder_1.append(") : ");
      _builder_1.append(className, "");
      _builder_1.append("[?] =");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("lookup");
      _builder_1.append(nClassName, "   ");
      _builder_1.append("From(exporter, a");
      _builder_1.append(this.defaultNQ, "   ");
      _builder_1.append(".");
      _builder_1.append(this.defaultNQP, "   ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("def : lookup");
      _builder_1.append(nClassName, "");
      _builder_1.append("From(exporter : ");
      _builder_1.append(exporterClassName, "");
      _builder_1.append(", segments : ");
      _builder_1.append(qualifierSegments, "");
      _builder_1.append(") : ");
      _builder_1.append(className, "");
      _builder_1.append("[?] =");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("if segments->size() = 1");
      _builder_1.newLine();
      _builder_1.append("   ");
      _builder_1.append("then lookup");
      _builder_1.append(nClassName, "   ");
      _builder_1.append("From(exporter, segments->first())");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("else let qualifierSegments = segments->subOrderedSet(1,segments->size()-1),");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("qualifier = ");
      List<String> _get = this.element2qualifiers.get(className);
      String[] _clone = ((String[])Conversions.unwrapArray(_get, String.class)).clone();
      String _provideQualfiersLookupQuery = this.provideQualfiersLookupQuery(((List<String>)Conversions.doWrapArray(_clone)));
      _builder_1.append(_provideQualfiersLookupQuery, "            ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("        ");
      _builder_1.append("in qualifier?.lookupQualified");
      _builder_1.append(nClassName, "        ");
      _builder_1.append("(segments->last())");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("endif");
      _builder_1.newLine();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private String provideEnvMethod(final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      String allChildrenName = null;
      final List<String> featureNames = CollectionLiterals.<String>newArrayList();
      PathNameCS _class_ = nameReso.getClass_();
      final String className = this.doSwitch(_class_);
      EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
      Iterable<ScopeDef> _filter = Iterables.<ScopeDef>filter(_statements, ScopeDef.class);
      for (final ScopeDef statmnt : _filter) {
        {
          final SelectionDef propagation = statmnt.getSelectionDef();
          if ((propagation instanceof SelectionSpecific)) {
            EList<ExpCS> _selectedProperties = ((SelectionSpecific)propagation).getSelectedProperties();
            for (final ExpCS property : _selectedProperties) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(className, "");
              _builder.append("::");
              String _doSwitch = this.doSwitch(property);
              _builder.append(_doSwitch, "");
              featureNames.add(_builder.toString());
            }
          }
          boolean _or = false;
          boolean _equals = Objects.equal(propagation, null);
          if (_equals) {
            _or = true;
          } else {
            _or = (propagation instanceof SelectionAll);
          }
          if (_or) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(className, "");
            _builder_1.append("::");
            _builder_1.append(this.ALL_CHILDREN, "");
            allChildrenName = _builder_1.toString();
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("def : _env(child : ocl::OclElement) : ");
      _builder.append(this.lookupPck, "");
      _builder.append("::");
      _builder.append(this.lookupEnv, "");
      _builder.append(" =");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(featureNames, allChildrenName, nameReso);
      _builder.append(_provideScopeContributionsQuery, "\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportedEnvMethod(final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      String allChildrenName = null;
      final List<String> featureNames = CollectionLiterals.<String>newArrayList();
      PathNameCS _class_ = nameReso.getClass_();
      final String className = this.doSwitch(_class_);
      EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
      Iterable<ExportDef> _filter = Iterables.<ExportDef>filter(_statements, ExportDef.class);
      for (final ExportDef statmnt : _filter) {
        {
          final SelectionDef propagation = statmnt.getSelectionDef();
          if ((propagation instanceof SelectionSpecific)) {
            EList<ExpCS> _selectedProperties = ((SelectionSpecific)propagation).getSelectedProperties();
            for (final ExpCS property : _selectedProperties) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(className, "");
              _builder.append("::");
              String _doSwitch = this.doSwitch(property);
              _builder.append(_doSwitch, "");
              featureNames.add(_builder.toString());
            }
          }
          boolean _or = false;
          boolean _equals = Objects.equal(propagation, null);
          if (_equals) {
            _or = true;
          } else {
            _or = (propagation instanceof SelectionAll);
          }
          if (_or) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(className, "");
            _builder_1.append("::");
            _builder_1.append(this.ALL_CHILDREN, "");
            allChildrenName = _builder_1.toString();
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("def : _exported_env(from : ocl::OclElement) : ");
      _builder.append(this.lookupPck, "");
      _builder.append("::");
      _builder.append(this.lookupEnv, "");
      _builder.append(" =");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _provideExportsContributionsQuery = this.provideExportsContributionsQuery(featureNames, allChildrenName, nameReso);
      _builder.append(_provideExportsContributionsQuery, "\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideScopeContributionsQuery(final List<String> featureNames, final String allChildrenName, final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      final int featuresSize = featureNames.size();
      String _xifexpression = null;
      int _size = featureNames.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        String _xifexpression_1 = null;
        boolean _equals_1 = Objects.equal(allChildrenName, null);
        if (_equals_1) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("parentEnv()");
          _xifexpression_1 = _builder.toString();
        } else {
          String _xblockexpression_1 = null;
          {
            final ScopeDef scopeDef = this.feaName2scopes.get(allChildrenName);
            SelectionDef _selectionDef = scopeDef.getSelectionDef();
            final SelectionAll selectionDef = ((SelectionAll) _selectionDef);
            EList<ExpCS> _xifexpression_2 = null;
            boolean _notEquals = (!Objects.equal(selectionDef, null));
            if (_notEquals) {
              _xifexpression_2 = selectionDef.getExceptionProperties();
            } else {
              _xifexpression_2 = null;
            }
            final EList<ExpCS> exceptProps = _xifexpression_2;
            String _xifexpression_3 = null;
            boolean _or = false;
            boolean _equals_2 = Objects.equal(selectionDef, null);
            if (_equals_2) {
              _or = true;
            } else {
              boolean _isEmpty = exceptProps.isEmpty();
              _or = _isEmpty;
            }
            if (_or) {
              _xifexpression_3 = this.doSwitch(scopeDef);
            } else {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("if not (");
              {
                for(final ExpCS exceptProp : exceptProps) {
                  {
                    int _indexOf = exceptProps.indexOf(exceptProp);
                    boolean _greaterThan = (_indexOf > 0);
                    if (_greaterThan) {
                      _builder_1.append("and ");
                    }
                  }
                  String _doSwitch = this.doSwitch(exceptProp);
                  _builder_1.append(_doSwitch, "");
                  _builder_1.append("->includes(child)");
                  _builder_1.newLineIfNotEmpty();
                  _builder_1.append("   ");
                }
              }
              _builder_1.append(")");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("then ");
              String _doSwitch_1 = this.doSwitch(scopeDef);
              _builder_1.append(_doSwitch_1, "");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("else parentEnv()");
              _builder_1.newLine();
              _builder_1.append("endif");
              _builder_1.newLine();
              _xifexpression_3 = _builder_1.toString();
            }
            _xblockexpression_1 = _xifexpression_3;
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xifexpression = _xifexpression_1;
      } else {
        String _xblockexpression_2 = null;
        {
          final String featureName = featureNames.get(0);
          final ScopeDef scopeDef = this.feaName2scopes.get(featureName);
          List<String> _xifexpression_2 = null;
          int _size_1 = featureNames.size();
          boolean _equals_2 = (_size_1 == 1);
          if (_equals_2) {
            _xifexpression_2 = CollectionLiterals.<String>newArrayList();
          } else {
            _xifexpression_2 = featureNames.subList(1, (featuresSize - 1));
          }
          final List<String> residualFeaNames = _xifexpression_2;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if ");
          String[] _split = featureName.split("::");
          String _get = _split[1];
          _builder_1.append(_get, "");
          _builder_1.append("->includes(child)");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("then ");
          String _doSwitch = this.doSwitch(scopeDef);
          _builder_1.append(_doSwitch, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("else ");
          String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(residualFeaNames, allChildrenName, nameReso);
          _builder_1.append(_provideScopeContributionsQuery, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("endif");
          _builder_1.newLine();
          _xblockexpression_2 = _builder_1.toString();
        }
        _xifexpression = _xblockexpression_2;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String provideExportsContributionsQuery(final List<String> featureNames, final String allChildrenName, final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _equals = Objects.equal(allChildrenName, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _xifexpression = _builder.toString();
      } else {
        ExportDef _get = this.feaName2exports.get(allChildrenName);
        _xifexpression = this.doSwitch(_get);
      }
      final String allChildrenExpression = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(allChildrenExpression, "");
      _builder_1.newLineIfNotEmpty();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExporterLookupMethod(final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
      final Iterable<ExportDef> exports = Iterables.<ExportDef>filter(_statements, ExportDef.class);
      String _xifexpression = null;
      boolean _isEmpty = IterableExtensions.isEmpty(exports);
      if (_isEmpty) {
        return "";
      } else {
        String _xblockexpression_1 = null;
        {
          final StringBuilder sb = new StringBuilder();
          for (final ExportDef export : exports) {
            {
              TypedRefCS _exportedClass = export.getExportedClass();
              final String className = this.doSwitch(_exportedClass);
              final String nClassName = this.normalizeString(className);
              String _lowerCase = className.toLowerCase();
              char _charAt = _lowerCase.charAt(0);
              final String nameParam = (Character.valueOf(_charAt) + "Name");
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("def : _lookupExported");
              _builder.append(nClassName, "");
              _builder.append("(from : ocl::OclElement, ");
              _builder.append(nameParam, "");
              _builder.append(" : String) : ");
              _builder.append(className, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("let found");
              _builder.append(nClassName, "\t");
              _builder.append(" = _lookup");
              _builder.append(nClassName, "\t");
              _builder.append("(_exported_env(from), ");
              _builder.append(nameParam, "\t");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("in  if found");
              _builder.append(nClassName, "\t");
              _builder.append("->isEmpty()");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("then null");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("else found");
              _builder.append(nClassName, "\t\t");
              _builder.append("->first()");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("endif");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.newLine();
              {
                boolean _equals = Objects.equal(this.defaultNR, null);
                if (_equals) {
                  _builder.append("def : lookupExported");
                  _builder.append(nClassName, "");
                  _builder.append("(from : ocl::OclElement, ");
                  _builder.append(nameParam, "");
                  _builder.append(" : String) : ");
                  _builder.append(nClassName, "");
                  _builder.append("[?] =");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("_lookupExported");
                  _builder.append(nClassName, "\t");
                  _builder.append("(from, nameParam»)");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("def : lookupExported");
                  _builder.append(nClassName, "");
                  _builder.append("(from : ocl::OclElement, a");
                  _builder.append(this.defaultNR, "");
                  _builder.append(" : ");
                  _builder.append(this.sourcePckName, "");
                  _builder.append("::");
                  _builder.append(this.defaultNR, "");
                  _builder.append(") : ");
                  _builder.append(nClassName, "");
                  _builder.append("[?] =");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("_lookupExported");
                  _builder.append(nClassName, "\t");
                  _builder.append("(from, a");
                  _builder.append(this.defaultNR, "\t");
                  _builder.append(".");
                  _builder.append(this.defaultNRP, "\t");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
              sb.append(_builder);
            }
          }
          _xblockexpression_1 = sb.toString();
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String getElementReferenerType() {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equal(this.defaultNR, null);
      if (_equals) {
        _builder.append("String");
      } else {
        _builder.append(this.sourcePckName, "");
        _builder.append("::");
        _builder.append(this.defaultNR, "");
      }
    }
    return _builder.toString();
  }
  
  private String normalizeString(final String string) {
    return string.replace("::", "_");
  }
}
