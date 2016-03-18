package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetsDef;
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
  
  private Map<String, List<String>> element2qualifiers = CollectionLiterals.<String, List<String>>newHashMap();
  
  private Map<String, FilterDef> element2filter = CollectionLiterals.<String, FilterDef>newHashMap();
  
  private Map<String, ScopeDef> feaName2scopes = CollectionLiterals.<String, ScopeDef>newHashMap();
  
  private Map<String, ExportDef> feaName2exports = CollectionLiterals.<String, ExportDef>newHashMap();
  
  private Set<String> normalizedTargetElements = CollectionLiterals.<String>newHashSet();
  
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
  
  private String baseFileName;
  
  public CS2ASDSL_To_OCLLookupVisitor(final String baseFileName) {
    this.baseFileName = baseFileName;
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
      _builder.append("import \'Lookup.ecore\'");
      _builder.newLine();
      _builder.append("import \'");
      _builder.append(this.baseFileName, "");
      _builder.append("Helpers.ocl\'");
      _builder.newLineIfNotEmpty();
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
      final NameResolutionSect nameresoSect = object.getNameresoSect();
      boolean _equals = Objects.equal(nameresoSect, null);
      if (_equals) {
        return sb.toString();
      }
      NameResolutionSect _nameresoSect = object.getNameresoSect();
      this.computeInitialMaps(_nameresoSect);
      final DefaultNamedElementDef namedElement = nameresoSect.getNamedElement();
      boolean _notEquals = (!Objects.equal(namedElement, null));
      if (_notEquals) {
        NameResolutionSect _nameresoSect_1 = object.getNameresoSect();
        DefaultNamedElementDef _namedElement = _nameresoSect_1.getNamedElement();
        String _nameElement = _namedElement.getNameElement();
        this.defaultNE = _nameElement;
        NameResolutionSect _nameresoSect_2 = object.getNameresoSect();
        DefaultNamedElementDef _namedElement_1 = _nameresoSect_2.getNamedElement();
        NameExpCS _nameProperty = _namedElement_1.getNameProperty();
        String _doSwitch_2 = this.doSwitch(_nameProperty);
        this.defaultNEP = _doSwitch_2;
      }
      final DefaultNameReferencerDef nameRef = nameresoSect.getNameReferencer();
      boolean _notEquals_1 = (!Objects.equal(nameRef, null));
      if (_notEquals_1) {
        NameResolutionSect _nameresoSect_3 = object.getNameresoSect();
        DefaultNameReferencerDef _nameReferencer = _nameresoSect_3.getNameReferencer();
        String _nameReferencer_1 = _nameReferencer.getNameReferencer();
        this.defaultNR = _nameReferencer_1;
        NameResolutionSect _nameresoSect_4 = object.getNameresoSect();
        DefaultNameReferencerDef _nameReferencer_2 = _nameresoSect_4.getNameReferencer();
        NameExpCS _nameProperty_1 = _nameReferencer_2.getNameProperty();
        String _doSwitch_3 = this.doSwitch(_nameProperty_1);
        this.defaultNRP = _doSwitch_3;
      }
      final NameQualifierDef nameQuali = nameresoSect.getNameQualifier();
      boolean _notEquals_2 = (!Objects.equal(nameQuali, null));
      if (_notEquals_2) {
        NameResolutionSect _nameresoSect_5 = object.getNameresoSect();
        NameQualifierDef _nameQualifier = _nameresoSect_5.getNameQualifier();
        String _nameQualifier_1 = _nameQualifier.getNameQualifier();
        this.defaultNQ = _nameQualifier_1;
        NameResolutionSect _nameresoSect_6 = object.getNameresoSect();
        NameQualifierDef _nameQualifier_2 = _nameresoSect_6.getNameQualifier();
        NameExpCS _segmentsProp = _nameQualifier_2.getSegmentsProp();
        String _doSwitch_4 = this.doSwitch(_segmentsProp);
        this.defaultNQP = _doSwitch_4;
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      CharSequence _commonLookupInfrastructure = this.commonLookupInfrastructure();
      _builder_1.append(_commonLookupInfrastructure, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("package ");
      _builder_1.append(this.targetPckName, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      NameResolutionSect _nameresoSect_7 = object.getNameresoSect();
      String _doSwitch_5 = this.doSwitch(_nameresoSect_7);
      _builder_1.append(_doSwitch_5, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("context Visitable");
      _builder_1.newLine();
      NameResolutionSect _nameresoSect_8 = object.getNameresoSect();
      String _provideLookupMethods = this.provideLookupMethods(_nameresoSect_8);
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
    _builder.newLine();
    _builder.append("context OclElement");
    _builder.newLine();
    _builder.append("-- Domain specific default functionality");
    _builder.newLine();
    CharSequence _commonEnvironmentOps = this.commonEnvironmentOps();
    _builder.append(_commonEnvironmentOps, "");
    _builder.newLineIfNotEmpty();
    _builder.append("-- End of domain specific default functionality");
    _builder.newLine();
    _builder.append("endpackage ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(this.lookupPck, "");
    _builder.newLineIfNotEmpty();
    _builder.append("-- Some common lookup functionality");
    _builder.newLine();
    _builder.append("context ");
    _builder.append(this.lookupEnv, "");
    _builder.newLineIfNotEmpty();
    _builder.append("def : nestedEnv() : ");
    _builder.append(this.lookupEnv, "");
    _builder.append("[1] =");
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
    _builder.append("-- End of common lookup functionality");
    _builder.newLine();
    _builder.append("endpackage");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence commonEnvironmentOps() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String namedElement : this.normalizedTargetElements) {
        _builder.append("def : unqualified_env_");
        _builder.append(namedElement, "");
        _builder.append("() : lookup::LookupEnvironment[1] =");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("_unqualified_env_");
        _builder.append(namedElement, "\t");
        _builder.append("(null)");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final String namedElement_1 : this.normalizedTargetElements) {
        _builder.append("def : _unqualified_env_");
        _builder.append(namedElement_1, "");
        _builder.append("(child : OclElement) : lookup::LookupEnvironment[1] =");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("parentEnv_");
        _builder.append(namedElement_1, "\t");
        _builder.append("()");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final String namedElement_2 : this.normalizedTargetElements) {
        _builder.append("def : parentEnv_");
        _builder.append(namedElement_2, "");
        _builder.append("() : lookup::LookupEnvironment[1] =");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("let parent = oclContainer() in if parent = null then lookup::LookupEnvironment { } else parent._unqualified_env_");
        _builder.append(namedElement_2, "\t");
        _builder.append("(self) endif");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final String namedElement_3 : this.normalizedTargetElements) {
        _builder.append("def : _exported_env_");
        _builder.append(namedElement_3, "");
        _builder.append("(importer : OclElement) : ");
        _builder.append(this.lookupPck, "");
        _builder.append("::");
        _builder.append(this.lookupEnv, "");
        _builder.append("[1] =");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(this.lookupPck, "\t");
        _builder.append("::");
        _builder.append(this.lookupEnv, "\t");
        _builder.append(" { }");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private void computeInitialMaps(final NameResolutionSect nrSect) {
    EList<ClassNameResolution> _nameResolutions = nrSect.getNameResolutions();
    for (final ClassNameResolution nameReso : _nameResolutions) {
      {
        PathNameCS _class_ = nameReso.getClass_();
        final String className = this.doSwitch(_class_);
        final String nClassName = this.normalizeString(className);
        EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
        for (final ClassNameResolutionStmnt statemnt : _statements) {
          {
            if ((statemnt instanceof NamedElementDef)) {
              this.normalizedTargetElements.add(nClassName);
              EList<QualificationDef> _qualifications = ((NamedElementDef)statemnt).getQualifications();
              for (final QualificationDef qDef : _qualifications) {
                TargetsDef _targetsDef = qDef.getTargetsDef();
                EList<TypedRefCS> _targetClasses = _targetsDef.getTargetClasses();
                for (final TypedRefCS targetClass : _targetClasses) {
                  {
                    final String qualifiedElement = this.doSwitch(targetClass);
                    List<String> qualifiers = this.element2qualifiers.get(qualifiedElement);
                    boolean _equals = Objects.equal(qualifiers, null);
                    if (_equals) {
                      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
                      qualifiers = _newArrayList;
                      this.element2qualifiers.put(qualifiedElement, qualifiers);
                    }
                    qualifiers.add(className);
                  }
                }
              }
              FilterDef _filter = ((NamedElementDef)statemnt).getFilter();
              this.element2filter.put(className, _filter);
            }
            if ((statemnt instanceof ScopeDef)) {
              SelectionDef _selectionDef = ((ScopeDef)statemnt).getSelectionDef();
              this.<ScopeDef>addStatement2Map(((ScopeDef)statemnt), this.feaName2scopes, _selectionDef, className);
            } else {
              if ((statemnt instanceof ExportDef)) {
                SelectionDef _selectionDef_1 = ((ExportDef)statemnt).getSelectionDef();
                this.<ExportDef>addStatement2Map(((ExportDef)statemnt), this.feaName2exports, _selectionDef_1, className);
              }
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
      EList<ClassNameResolutionStmnt> _statements_1 = object.getStatements();
      Iterable<ScopeDef> _filter_1 = Iterables.<ScopeDef>filter(_statements_1, ScopeDef.class);
      boolean _isEmpty_1 = IterableExtensions.isEmpty(_filter_1);
      final boolean containsScopes = (!_isEmpty_1);
      EList<ClassNameResolutionStmnt> _statements_2 = object.getStatements();
      Iterable<NamedElementDef> _filter_2 = Iterables.<NamedElementDef>filter(_statements_2, NamedElementDef.class);
      final Function1<NamedElementDef, Boolean> _function = (NamedElementDef x) -> {
        EList<QualificationDef> _qualifications = x.getQualifications();
        boolean _isEmpty_2 = _qualifications.isEmpty();
        return Boolean.valueOf((!_isEmpty_2));
      };
      final boolean containsQualifies = IterableExtensions.<NamedElementDef>exists(_filter_2, _function);
      EList<ClassNameResolutionStmnt> _statements_3 = object.getStatements();
      Iterable<NamedElementDef> _filter_3 = Iterables.<NamedElementDef>filter(_statements_3, NamedElementDef.class);
      final Function1<NamedElementDef, Boolean> _function_1 = (NamedElementDef x) -> {
        FilterDef _filter_4 = x.getFilter();
        return Boolean.valueOf((!Objects.equal(_filter_4, null)));
      };
      final boolean containsFilters = IterableExtensions.<NamedElementDef>exists(_filter_3, _function_1);
      String _xifexpression = null;
      boolean _or = false;
      if (((containsExports || containsScopes) || containsQualifies)) {
        _or = true;
      } else {
        _or = containsFilters;
      }
      if (_or) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("context ");
        PathNameCS _class_ = object.getClass_();
        String _doSwitch = this.doSwitch(_class_);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
        {
          EList<ClassNameResolutionStmnt> _statements_4 = object.getStatements();
          Iterable<NamedElementDef> _filter_4 = Iterables.<NamedElementDef>filter(_statements_4, NamedElementDef.class);
          for(final NamedElementDef statement : _filter_4) {
            String _doSwitch_1 = this.doSwitch(statement);
            _builder.append(_doSwitch_1, "");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if (containsScopes) {
            String _provideUnqualifiedEnvMethods = this.provideUnqualifiedEnvMethods(object);
            _builder.append(_provideUnqualifiedEnvMethods, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if (containsExports) {
            String _provideExportedEnvMethods = this.provideExportedEnvMethods(object);
            _builder.append(_provideExportedEnvMethods, "");
            _builder.newLineIfNotEmpty();
            String _provideExporterLookupMethod = this.provideExporterLookupMethod(object);
            _builder.append(_provideExporterLookupMethod, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _xifexpression = _builder.toString();
      } else {
        _xifexpression = "";
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseNamedElementDef(final NamedElementDef object) {
    String _xblockexpression = null;
    {
      final EList<QualificationDef> qualifications = object.getQualifications();
      final StringBuilder sb = new StringBuilder();
      boolean _notEquals = (!Objects.equal(qualifications, null));
      if (_notEquals) {
        final List<ElementsContribExp> qualificationConstribs = CollectionLiterals.<ElementsContribExp>newArrayList();
        for (final QualificationDef qualification : qualifications) {
          TargetsDef _targetsDef = qualification.getTargetsDef();
          EList<TypedRefCS> _targetClasses = _targetsDef.getTargetClasses();
          for (final TypedRefCS targetClass : _targetClasses) {
            {
              final String className = this.doSwitch(targetClass);
              final String nClassName = this.normalizeString(className);
              String _lowerCase = className.toLowerCase();
              char _charAt = _lowerCase.charAt(0);
              final String nameParam = (Character.valueOf(_charAt) + "Name");
              final FilterDef filter = this.element2filter.get(className);
              final String filterParams = this.getOptionalAddedParamsText(filter);
              final String filterArgs = this.getOptionalAddedArgsText(filter);
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("def : _lookupQualified");
              _builder.append(nClassName, "");
              _builder.append("(");
              _builder.append(nameParam, "");
              _builder.append(" : String");
              _builder.append(filterParams, "");
              _builder.append(") : ");
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
              _builder.append(filterArgs, "\t");
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
                boolean _notEquals_1 = (!Objects.equal(this.defaultNR, null));
                if (_notEquals_1) {
                  CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, "", ("Qualified" + nClassName), filterParams, filterArgs);
                  _builder.append(_provideLookupByNameReferencerMethod, "");
                }
              }
              _builder.newLineIfNotEmpty();
              sb.append(_builder);
              EList<ElementsContribExp> _contribution = qualification.getContribution();
              qualificationConstribs.addAll(_contribution);
            }
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
      }
      final FilterDef filter = object.getFilter();
      boolean _notEquals_1 = (!Objects.equal(filter, null));
      if (_notEquals_1) {
        EObject _eContainer = object.eContainer();
        PathNameCS _class_ = ((ClassNameResolution) _eContainer).getClass_();
        final String className = this.doSwitch(_class_);
        final String nClassName = this.normalizeString(className);
        final String filterParams = this.getParamsText(filter);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("def : ");
        String _filterOpName = this.getFilterOpName(nClassName);
        _builder_1.append(_filterOpName, "");
        _builder_1.append("(");
        _builder_1.append(filterParams, "");
        _builder_1.append(") : Boolean =");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        ExpCS _expression = filter.getExpression();
        String _doSwitch_1 = this.doSwitch(_expression);
        _builder_1.append(_doSwitch_1, "\t");
        _builder_1.newLineIfNotEmpty();
        sb.append(_builder_1);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseElementsContribExp(final ElementsContribExp object) {
    String _xifexpression = null;
    boolean _isIsPreceding = object.isIsPreceding();
    if (_isIsPreceding) {
      String _xblockexpression = null;
      {
        EObject _eContainer = object.eContainer();
        EObject _eContainer_1 = _eContainer.eContainer();
        EObject _eContainer_2 = _eContainer_1.eContainer();
        final ScopeDef scopeDef = ((ScopeDef) _eContainer_2);
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
  public String caseProvisionDef(final ProvisionDef object) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      final EList<OccludingDef> occludingDefs = object.getOccludingDefs();
      for (int i = (occludingDefs.size() - 1); (i >= 0); i--) {
        OccludingDef _get = occludingDefs.get(i);
        String _doSwitch = this.doSwitch(_get);
        sb.append(_doSwitch);
      }
      ContributionDef _contribution = object.getContribution();
      String _doSwitch = this.doSwitch(_contribution);
      sb.append(_doSwitch);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseOccludingDef(final OccludingDef object) {
    StringConcatenation _builder = new StringConcatenation();
    ContributionDef _contribution = object.getContribution();
    String _doSwitch = this.doSwitch(_contribution);
    _builder.append(_doSwitch, "");
    _builder.newLineIfNotEmpty();
    _builder.append(".nestedEnv()");
    _builder.newLine();
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
              final FilterDef filter = ((NamedElementDef)statmt).getFilter();
              final String filterParams = this.getOptionalAddedParamsText(filter);
              final String filterArgs = this.getOptionalAddedArgsText(filter);
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
              _builder.append(" : String");
              _builder.append(filterParams, "");
              _builder.append(") : OrderedSet(");
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
              _builder.append("                                         ");
              {
                boolean _notEquals_1 = (!Objects.equal(filter, null));
                if (_notEquals_1) {
                  _builder.append("->select(");
                  String _filterOpName = this.getFilterOpName(nClassName);
                  _builder.append(_filterOpName, "                                         ");
                  _builder.append("(");
                  String _argsText = this.getArgsText(filter);
                  _builder.append(_argsText, "                                         ");
                  _builder.append("))");
                }
              }
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
              _builder.append(filterArgs, "\t");
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
              _builder.append("def : _lookupUnqualified");
              _builder.append(nClassName, "");
              _builder.append("(");
              _builder.append(nameParam, "");
              _builder.append(" : String");
              _builder.append(filterParams, "");
              _builder.append(") : ");
              _builder.append(className, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("let found");
              _builder.append(nClassName, "");
              _builder.append(" = _lookup");
              _builder.append(nClassName, "");
              _builder.append("(unqualified_env_");
              _builder.append(nClassName, "");
              _builder.append("(), ");
              _builder.append(nameParam, "");
              _builder.append(filterArgs, "");
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
                boolean _notEquals_2 = (!Objects.equal(this.defaultNR, null));
                if (_notEquals_2) {
                  CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, "Unqualified", nClassName, filterParams, filterArgs);
                  _builder.append(_provideLookupByNameReferencerMethod, "");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                List<String> _get = this.element2qualifiers.get(className);
                boolean _notEquals_3 = (!Objects.equal(_get, null));
                if (_notEquals_3) {
                  CharSequence _provideQualifiedLookupMethods = this.provideQualifiedLookupMethods(className, nClassName, filterParams, filterArgs);
                  _builder.append(_provideQualifiedLookupMethods, "");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              sb.append(_builder);
            } else {
              if ((statmt instanceof ExportDef)) {
                EList<ProvisionDef> _provisionDefs = ((ExportDef)statmt).getProvisionDefs();
                for (final ProvisionDef providerDef : _provisionDefs) {
                  {
                    TargetsDef _targetsDef = providerDef.getTargetsDef();
                    EList<TypedRefCS> _targetClasses = _targetsDef.getTargetClasses();
                    TypedRefCS _get_1 = _targetClasses.get(0);
                    final String exportedClassName = this.doSwitch(_get_1);
                    final String nExportedClassName = this.normalizeString(exportedClassName);
                    final FilterDef filter_1 = this.element2filter.get(exportedClassName);
                    final String filterParams_1 = this.getOptionalAddedParamsText(filter_1);
                    final String filterArgs_1 = this.getOptionalAddedArgsText(filter_1);
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
                        _builder_1.append(" : String");
                        _builder_1.append(filterParams_1, "");
                        _builder_1.append(") : ");
                        _builder_1.append(exportedClassName, "");
                        _builder_1.append("[?] =");
                        _builder_1.newLineIfNotEmpty();
                        _builder_1.append("\t");
                        _builder_1.append("exporter.lookupExported");
                        _builder_1.append(nExportedClassName, "\t");
                        _builder_1.append("(self, ");
                        _builder_1.append(nameParam, "\t");
                        _builder_1.append(filterArgs_1, "\t");
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
                        _builder_1.append(filterParams_1, "");
                        _builder_1.append(") : ");
                        _builder_1.append(exportedClassName, "");
                        _builder_1.append("[?] =");
                        _builder_1.newLineIfNotEmpty();
                        _builder_1.append("\t");
                        _builder_1.append("exporter.lookupExported");
                        _builder_1.append(nExportedClassName, "\t");
                        _builder_1.append("(self, a");
                        _builder_1.append(this.defaultNR, "\t");
                        _builder_1.append(filterArgs_1, "\t");
                        _builder_1.append(")");
                        _builder_1.newLineIfNotEmpty();
                      }
                    }
                    _builder_1.newLine();
                    {
                      List<String> _get_2 = this.element2qualifiers.get(exportedClassName);
                      boolean _notEquals_4 = (!Objects.equal(_get_2, null));
                      if (_notEquals_4) {
                        String _provideQualifiedLookupFromMethods = this.provideQualifiedLookupFromMethods(exportedClassName, nExportedClassName, className, filterParams_1, filterArgs_1);
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
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private CharSequence provideLookupByNameReferencerMethod(final String className, final String protocol, final String nClassName, final String filterParams, final String filterArgs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def : lookup");
    _builder.append(nClassName, "");
    _builder.append("(a");
    _builder.append(this.defaultNR, "");
    _builder.append(" : ");
    _builder.append(this.sourcePckName, "");
    _builder.append("::");
    _builder.append(this.defaultNR, "");
    _builder.append(filterParams, "");
    _builder.append(") : ");
    _builder.append(className, "");
    _builder.append("[?] =");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("_lookup");
    _builder.append(protocol, "   ");
    _builder.append(nClassName, "   ");
    _builder.append("(a");
    _builder.append(this.defaultNR, "   ");
    _builder.append(".");
    _builder.append(this.defaultNRP, "   ");
    _builder.append(filterArgs, "   ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence provideQualifiedLookupMethods(final String className, final String nClassName, final String filterParams, final String filterArgs) {
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
      _builder_1.append(filterParams, "");
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
      _builder_1.append(filterArgs, "   ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("def : lookup");
      _builder_1.append(nClassName, "");
      _builder_1.append("(segments : ");
      _builder_1.append(qualifierSegments, "");
      _builder_1.append(filterParams, "");
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
      _builder_1.append("(segments->first()");
      _builder_1.append(filterArgs, "   ");
      _builder_1.append(")");
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
      _builder_1.append("(segments->last()");
      _builder_1.append(filterArgs, "        ");
      _builder_1.append(")");
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
  
  private String provideQualifiedLookupFromMethods(final String className, final String nClassName, final String exporterClassName, final String filterParms, final String filterArgs) {
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
      _builder_1.append(filterParms, "");
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
      _builder_1.append(filterArgs, "   ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("def : lookup");
      _builder_1.append(nClassName, "");
      _builder_1.append("From(exporter : ");
      _builder_1.append(exporterClassName, "");
      _builder_1.append(", segments : ");
      _builder_1.append(qualifierSegments, "");
      _builder_1.append(filterParms, "");
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
      _builder_1.append("From(exporter, segments->first()");
      _builder_1.append(filterArgs, "   ");
      _builder_1.append(")");
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
      _builder_1.append("(segments->last()");
      _builder_1.append(filterArgs, "        ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.append("endif");
      _builder_1.newLine();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private String provideUnqualifiedEnvMethods(final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      final List<ProvisionDef> provisionDefs = CollectionLiterals.<ProvisionDef>newArrayList();
      EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
      Iterable<ScopeDef> _filter = Iterables.<ScopeDef>filter(_statements, ScopeDef.class);
      for (final ScopeDef statmnt : _filter) {
        EList<ProvisionDef> _provisionDefs = statmnt.getProvisionDefs();
        provisionDefs.addAll(_provisionDefs);
      }
      final StringBuilder sb = new StringBuilder();
      PathNameCS _class_ = nameReso.getClass_();
      final String scopingClassName = this.doSwitch(_class_);
      final Map<String, Set<ProvisionDef>> scopedClasses = this.computeTargetClasses(provisionDefs);
      Set<String> _keySet = scopedClasses.keySet();
      for (final String scopedClassName : _keySet) {
        Set<ProvisionDef> _get = scopedClasses.get(scopedClassName);
        String _provideUnqualifiedEnvMethod = this.provideUnqualifiedEnvMethod(scopingClassName, scopedClassName, _get);
        sb.append(_provideUnqualifiedEnvMethod);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private String provideUnqualifiedEnvMethod(final String scopingClassName, final String scopedClassName, final Set<ProvisionDef> provisionDefs) {
    String _xblockexpression = null;
    {
      String allChildrenName = null;
      final List<String> featureNames = CollectionLiterals.<String>newArrayList();
      for (final ProvisionDef provisionDef : provisionDefs) {
        {
          EObject _eContainer = provisionDef.eContainer();
          final ScopeDef scopeDef = ((ScopeDef) _eContainer);
          final SelectionDef propagation = scopeDef.getSelectionDef();
          if ((propagation instanceof SelectionSpecific)) {
            EList<ExpCS> _selectedProperties = ((SelectionSpecific)propagation).getSelectedProperties();
            for (final ExpCS property : _selectedProperties) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(scopingClassName, "");
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
            _builder_1.append(scopingClassName, "");
            _builder_1.append("::");
            _builder_1.append(this.ALL_CHILDREN, "");
            allChildrenName = _builder_1.toString();
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("def : _unqualified_env_");
      String _normalizeString = this.normalizeString(scopedClassName);
      _builder.append(_normalizeString, "");
      _builder.append("(child : ocl::OclElement) : ");
      _builder.append(this.lookupPck, "");
      _builder.append("::");
      _builder.append(this.lookupEnv, "");
      _builder.append(" =");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(scopedClassName, featureNames, allChildrenName);
      _builder.append(_provideScopeContributionsQuery, "\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportedEnvMethods(final ClassNameResolution nameReso) {
    String _xblockexpression = null;
    {
      final List<ProvisionDef> provisionDefs = CollectionLiterals.<ProvisionDef>newArrayList();
      EList<ClassNameResolutionStmnt> _statements = nameReso.getStatements();
      Iterable<ExportDef> _filter = Iterables.<ExportDef>filter(_statements, ExportDef.class);
      for (final ExportDef statmnt : _filter) {
        EList<ProvisionDef> _provisionDefs = statmnt.getProvisionDefs();
        provisionDefs.addAll(_provisionDefs);
      }
      final StringBuilder sb = new StringBuilder();
      PathNameCS _class_ = nameReso.getClass_();
      final String exportingClassName = this.doSwitch(_class_);
      final Map<String, Set<ProvisionDef>> exportedClasses = this.computeTargetClasses(provisionDefs);
      Set<String> _keySet = exportedClasses.keySet();
      for (final String exportedClassName : _keySet) {
        Set<ProvisionDef> _get = exportedClasses.get(exportedClassName);
        String _provideExportedEnvMethod = this.provideExportedEnvMethod(exportingClassName, exportedClassName, _get);
        sb.append(_provideExportedEnvMethod);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportedEnvMethod(final String exportingClassName, final String exportedClassName, final Set<ProvisionDef> provisionDefs) {
    String _xblockexpression = null;
    {
      String allChildrenName = null;
      final List<String> featureNames = CollectionLiterals.<String>newArrayList();
      for (final ProvisionDef provisionDef : provisionDefs) {
        {
          EObject _eContainer = provisionDef.eContainer();
          final ExportDef exportsDef = ((ExportDef) _eContainer);
          final SelectionDef propagation = exportsDef.getSelectionDef();
          if ((propagation instanceof SelectionSpecific)) {
            EList<ExpCS> _selectedProperties = ((SelectionSpecific)propagation).getSelectedProperties();
            for (final ExpCS property : _selectedProperties) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(exportingClassName, "");
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
            _builder_1.append(exportingClassName, "");
            _builder_1.append("::");
            _builder_1.append(this.ALL_CHILDREN, "");
            allChildrenName = _builder_1.toString();
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("def : _exported_env_");
      String _normalizeString = this.normalizeString(exportedClassName);
      _builder.append(_normalizeString, "");
      _builder.append("(importer : ocl::OclElement) : ");
      _builder.append(this.lookupPck, "");
      _builder.append("::");
      _builder.append(this.lookupEnv, "");
      _builder.append(" =");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _provideExportsContributionsQuery = this.provideExportsContributionsQuery(exportedClassName, featureNames, allChildrenName);
      _builder.append(_provideExportsContributionsQuery, "\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideScopeContributionsQuery(final String scopedClassName, final List<String> featureNames, final String allChildrenName) {
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
          _builder.append("parentEnv_");
          _builder.append(scopedClassName, "");
          _builder.append("()");
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
              _xifexpression_3 = this.provideScopeContributionsQuery(scopeDef, scopedClassName);
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
              String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(scopeDef, scopedClassName);
              _builder_1.append(_provideScopeContributionsQuery, "");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("else parentEnv_");
              _builder_1.append(scopedClassName, "");
              _builder_1.append("()");
              _builder_1.newLineIfNotEmpty();
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
          String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(scopeDef, scopedClassName);
          _builder_1.append(_provideScopeContributionsQuery, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("else ");
          String _provideScopeContributionsQuery_1 = this.provideScopeContributionsQuery(scopedClassName, residualFeaNames, allChildrenName);
          _builder_1.append(_provideScopeContributionsQuery_1, "");
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
  
  private String provideScopeContributionsQuery(final ScopeDef object, final String scopedClassName) {
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
        _builder.append(" {}");
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
          _builder_1.append("parentEnv_");
          _builder_1.append(scopedClassName, "");
          _builder_1.append("()");
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
      EList<ProvisionDef> _provisionDefs = object.getProvisionDefs();
      String _provideProvisionDefsContribution = this.provideProvisionDefsContribution(_provisionDefs, scopedClassName);
      _builder_1.append(_provideProvisionDefsContribution, "\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.newLine();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private String provideProvisionDefsContribution(final List<ProvisionDef> provisionDefs, final String targetClassName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final ProvisionDef provisionDef : provisionDefs) {
        {
          TargetsDef _targetsDef = provisionDef.getTargetsDef();
          EList<TypedRefCS> _targetClasses = _targetsDef.getTargetClasses();
          final Function1<TypedRefCS, String> _function = (TypedRefCS x) -> {
            return this.doSwitch(x);
          };
          List<String> _map = ListExtensions.<TypedRefCS, String>map(_targetClasses, _function);
          boolean _contains = _map.contains(targetClassName);
          if (_contains) {
            String _doSwitch = this.doSwitch(provisionDef);
            _builder.append(_doSwitch, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private String provideExportsContributionsQuery(final String exportedClassName, final List<String> featureNames, final String allChildrenName) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _equals = Objects.equal(allChildrenName, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _xifexpression = _builder.toString();
      } else {
        ExportDef _get = this.feaName2exports.get(allChildrenName);
        _xifexpression = this.provideExportContributionsQuery(_get, exportedClassName);
      }
      final String allChildrenExpression = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(allChildrenExpression, "");
      _builder_1.newLineIfNotEmpty();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportContributionsQuery(final ExportDef object, final String exportedClassName) {
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
    EList<ProvisionDef> _provisionDefs = object.getProvisionDefs();
    String _provideProvisionDefsContribution = this.provideProvisionDefsContribution(_provisionDefs, exportedClassName);
    _builder.append(_provideProvisionDefsContribution, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
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
          final Function1<ExportDef, EList<ProvisionDef>> _function = (ExportDef x) -> {
            return x.getProvisionDefs();
          };
          Iterable<EList<ProvisionDef>> _map = IterableExtensions.<ExportDef, EList<ProvisionDef>>map(exports, _function);
          Iterable<ProvisionDef> _flatten = Iterables.<ProvisionDef>concat(_map);
          for (final ProvisionDef provisionDef : _flatten) {
            {
              TargetsDef _targetsDef = provisionDef.getTargetsDef();
              EList<TypedRefCS> _targetClasses = _targetsDef.getTargetClasses();
              TypedRefCS _get = _targetClasses.get(0);
              final String className = this.doSwitch(_get);
              final String nClassName = this.normalizeString(className);
              String _lowerCase = className.toLowerCase();
              char _charAt = _lowerCase.charAt(0);
              final String nameParam = (Character.valueOf(_charAt) + "Name");
              final FilterDef filter = this.element2filter.get(className);
              final String filterParams = this.getOptionalAddedParamsText(filter);
              final String filterArgs = this.getOptionalAddedArgsText(filter);
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("def : _lookupExported");
              _builder.append(nClassName, "");
              _builder.append("(importer : ocl::OclElement, ");
              _builder.append(nameParam, "");
              _builder.append(" : String");
              _builder.append(filterParams, "");
              _builder.append(") : ");
              _builder.append(className, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("let found");
              _builder.append(nClassName, "\t");
              _builder.append(" = _lookup");
              _builder.append(nClassName, "\t");
              _builder.append("(_exported_env_");
              _builder.append(nClassName, "\t");
              _builder.append("(importer), ");
              _builder.append(nameParam, "\t");
              _builder.append(filterArgs, "\t");
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
                  _builder.append("(importer : ocl::OclElement, ");
                  _builder.append(nameParam, "");
                  _builder.append(" : String");
                  _builder.append(filterParams, "");
                  _builder.append(") : ");
                  _builder.append(nClassName, "");
                  _builder.append("[?] =");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("_lookupExported");
                  _builder.append(nClassName, "\t");
                  _builder.append("(importer, nameParam»");
                  _builder.append(filterArgs, "\t");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("def : lookupExported");
                  _builder.append(nClassName, "");
                  _builder.append("(importer : ocl::OclElement, a");
                  _builder.append(this.defaultNR, "");
                  _builder.append(" : ");
                  _builder.append(this.sourcePckName, "");
                  _builder.append("::");
                  _builder.append(this.defaultNR, "");
                  _builder.append(filterParams, "");
                  _builder.append(") : ");
                  _builder.append(nClassName, "");
                  _builder.append("[?] =");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("_lookupExported");
                  _builder.append(nClassName, "\t");
                  _builder.append("(importer, a");
                  _builder.append(this.defaultNR, "\t");
                  _builder.append(".");
                  _builder.append(this.defaultNRP, "\t");
                  _builder.append(filterArgs, "\t");
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
  
  private String getFilterOpName(final String filteredClassName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("_appliesFilter_");
    _builder.append(filteredClassName, "");
    return _builder.toString();
  }
  
  private String getOptionalAddedParamsText(final FilterDef filter) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(filter, null);
    if (_equals) {
      _xifexpression = "";
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(", ");
      String _paramsText = this.getParamsText(filter);
      _builder.append(_paramsText, "");
      _xifexpression = _builder.toString();
    }
    return _xifexpression;
  }
  
  private String getParamsText(final FilterDef filter) {
    String _xblockexpression = null;
    {
      final EList<ParameterCS> params = filter.getParams();
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final ParameterCS param : params) {
          {
            int _indexOf = params.indexOf(param);
            boolean _greaterThan = (_indexOf > 0);
            if (_greaterThan) {
              _builder.append(", ");
            }
          }
          String _doSwitch = this.doSwitch(param);
          _builder.append(_doSwitch, "");
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String getOptionalAddedArgsText(final FilterDef filter) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(filter, null);
    if (_equals) {
      _xifexpression = "";
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(", ");
      String _argsText = this.getArgsText(filter);
      _builder.append(_argsText, "");
      _xifexpression = _builder.toString();
    }
    return _xifexpression;
  }
  
  private String getArgsText(final FilterDef filter) {
    String _xblockexpression = null;
    {
      final EList<ParameterCS> params = filter.getParams();
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final ParameterCS param : params) {
          {
            int _indexOf = params.indexOf(param);
            boolean _greaterThan = (_indexOf > 0);
            if (_greaterThan) {
              _builder.append(", ");
            }
          }
          String _name = param.getName();
          _builder.append(_name, "");
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private Map<String, Set<ProvisionDef>> computeTargetClasses(final List<ProvisionDef> provisionDefs) {
    final Map<String, Set<ProvisionDef>> targetClasses = CollectionLiterals.<String, Set<ProvisionDef>>newLinkedHashMap();
    for (final ProvisionDef provisionDef : provisionDefs) {
      TargetsDef _targetsDef = provisionDef.getTargetsDef();
      EList<TypedRefCS> _targetClasses = _targetsDef.getTargetClasses();
      for (final TypedRefCS targetClass : _targetClasses) {
        {
          final String targetClassName = this.doSwitch(targetClass);
          Set<ProvisionDef> scopingDefs = targetClasses.get(targetClassName);
          boolean _equals = Objects.equal(scopingDefs, null);
          if (_equals) {
            LinkedHashSet<ProvisionDef> _newLinkedHashSet = CollectionLiterals.<ProvisionDef>newLinkedHashSet();
            scopingDefs = _newLinkedHashSet;
            targetClasses.put(targetClassName, scopingDefs);
          }
          scopingDefs.add(provisionDef);
        }
      }
    }
    return targetClasses;
  }
  
  private String normalizeString(final String string) {
    return string.replace("::", "_");
  }
}
