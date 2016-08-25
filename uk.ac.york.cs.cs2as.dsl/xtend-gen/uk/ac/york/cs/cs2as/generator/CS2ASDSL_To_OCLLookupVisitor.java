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
import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel;
import uk.ac.york.cs.cs2as.cs2as_dsl.Contribution;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Input;
import uk.ac.york.cs.cs2as.cs2as_dsl.Inputs;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provider;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.Providers;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provision;
import uk.ac.york.cs.cs2as.cs2as_dsl.Qualification;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.Target;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.Targets;
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
  
  private Map<String, CurrentScopeProvisionDef> feaName2scopes = CollectionLiterals.<String, CurrentScopeProvisionDef>newHashMap();
  
  private Map<String, ExportedScopeProvisionDef> feaName2exports = CollectionLiterals.<String, ExportedScopeProvisionDef>newHashMap();
  
  private Set<String> normalizedTargetElements = CollectionLiterals.<String>newHashSet();
  
  private Set<String> normalizedExportedElements = CollectionLiterals.<String>newHashSet();
  
  private Set<String> normalizedQualifiedElements = CollectionLiterals.<String>newHashSet();
  
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
      _builder.append("import \'Lookup.ecore\'");
      _builder.newLine();
      _builder.append("import \'");
      _builder.append(this.baseFileName, "");
      _builder.append("Helpers.ocl\'");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      sb.append(_builder);
      SourceDomain _source_1 = object.getSource();
      EList<ImportCS> _metamodels = _source_1.getMetamodels();
      ImportCS _get = _metamodels.get(0);
      String _name = _get.getName();
      this.sourcePckName = _name;
      TargetDomain _target_1 = object.getTarget();
      EList<ImportCS> _metamodels_1 = _target_1.getMetamodels();
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
      NameResolutionSect _nameresoSect_1 = object.getNameresoSect();
      this.computeDefaults(_nameresoSect_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      CharSequence _commonLookupInfrastructure = this.commonLookupInfrastructure();
      _builder_1.append(_commonLookupInfrastructure, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("package ");
      _builder_1.append(this.targetPckName, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      NameResolutionSect _nameresoSect_2 = object.getNameresoSect();
      String _doSwitch_2 = this.doSwitch(_nameresoSect_2);
      _builder_1.append(_doSwitch_2, "");
      _builder_1.append("\t\t");
      _builder_1.newLineIfNotEmpty();
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
    _builder.append("-- Domain specific default functionality");
    _builder.newLine();
    _builder.append("context OclElement");
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
      for(final String namedElement_3 : this.normalizedExportedElements) {
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
    _builder.newLine();
    {
      for(final String namedElement_4 : this.normalizedQualifiedElements) {
        _builder.append("def : _qualified_env_");
        _builder.append(namedElement_4, "");
        _builder.append("(qualifier : OclElement) : ");
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
    final Targets targetsDef = nrSect.getTargetsDef();
    boolean _notEquals = (!Objects.equal(targetsDef, null));
    if (_notEquals) {
      EList<Target> _targets = targetsDef.getTargets();
      for (final Target target : _targets) {
        {
          PathNameCS _classRef = target.getClassRef();
          final String className = this.doSwitch(_classRef);
          final String nClassName = this.normalizeString(className);
          this.normalizedTargetElements.add(nClassName);
          final QualificationDef qDef = target.getQualification();
          boolean _notEquals_1 = (!Objects.equal(qDef, null));
          if (_notEquals_1) {
            EList<Qualification> _qualifications = qDef.getQualifications();
            final Function1<Qualification, EList<PathNameCS>> _function = (Qualification x) -> {
              MultiplePathNames _qualifiedClasses = x.getQualifiedClasses();
              return _qualifiedClasses.getPathNames();
            };
            List<EList<PathNameCS>> _map = ListExtensions.<Qualification, EList<PathNameCS>>map(_qualifications, _function);
            Iterable<PathNameCS> _flatten = Iterables.<PathNameCS>concat(_map);
            for (final PathNameCS targetClass : _flatten) {
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
                String _normalizeString = this.normalizeString(qualifiedElement);
                this.normalizedQualifiedElements.add(_normalizeString);
              }
            }
          }
          FilterDef _filter = target.getFilter();
          this.element2filter.put(className, _filter);
        }
      }
    }
    final Providers providersDef = nrSect.getProvidersDef();
    boolean _notEquals_1 = (!Objects.equal(providersDef, null));
    if (_notEquals_1) {
      EList<Provider> _providers = providersDef.getProviders();
      for (final Provider provider : _providers) {
        {
          PathNameCS _classRef = provider.getClassRef();
          final String className = this.doSwitch(_classRef);
          final CurrentScopeDecl currentScopeDecl = provider.getCurrentScope();
          boolean _notEquals_2 = (!Objects.equal(currentScopeDecl, null));
          if (_notEquals_2) {
            EList<CurrentScopeProvisionDef> _provisionDefs = currentScopeDecl.getProvisionDefs();
            for (final CurrentScopeProvisionDef provisionDef : _provisionDefs) {
              this.addProvision2Map(provisionDef, className);
            }
          }
          final ExportedScopeDecl exportedScopeDecl = provider.getExportedScope();
          boolean _notEquals_3 = (!Objects.equal(exportedScopeDecl, null));
          if (_notEquals_3) {
            EList<ExportedScopeProvisionDef> _provisionDefs_1 = exportedScopeDecl.getProvisionDefs();
            for (final ExportedScopeProvisionDef provisionDef_1 : _provisionDefs_1) {
              EList<Provision> _provisions = provisionDef_1.getProvisions();
              for (final Provision pDefg : _provisions) {
                MultiplePathNames _providedClasses = pDefg.getProvidedClasses();
                EList<PathNameCS> _pathNames = _providedClasses.getPathNames();
                for (final PathNameCS targetClass : _pathNames) {
                  {
                    final String exportedElement = this.doSwitch(targetClass);
                    String _normalizeString = this.normalizeString(exportedElement);
                    this.normalizedExportedElements.add(_normalizeString);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void computeDefaults(final NameResolutionSect nameresoSect) {
    final Targets namedElement = nameresoSect.getTargetsDef();
    boolean _notEquals = (!Objects.equal(namedElement, null));
    if (_notEquals) {
      EList<Target> _targets = namedElement.getTargets();
      for (final Target target : _targets) {
        PathNameCS _propRef = target.getPropRef();
        boolean _notEquals_1 = (!Objects.equal(_propRef, null));
        if (_notEquals_1) {
          PathNameCS _classRef = target.getClassRef();
          String _doSwitch = this.doSwitch(_classRef);
          this.defaultNE = _doSwitch;
          PathNameCS _propRef_1 = target.getPropRef();
          String _doSwitch_1 = this.doSwitch(_propRef_1);
          this.defaultNEP = _doSwitch_1;
        }
      }
    }
    final Inputs nameRef = nameresoSect.getInputsDef();
    boolean _notEquals_2 = (!Objects.equal(nameRef, null));
    if (_notEquals_2) {
      boolean foundNR = false;
      boolean foundNQ = false;
      EList<Input> _inputs = nameRef.getInputs();
      for (final Input input : _inputs) {
        {
          boolean _and = false;
          boolean _and_1 = false;
          if (!(!foundNR)) {
            _and_1 = false;
          } else {
            boolean _isQualifier = input.isQualifier();
            boolean _not = (!_isQualifier);
            _and_1 = _not;
          }
          if (!_and_1) {
            _and = false;
          } else {
            PathNameCS _propRef_2 = input.getPropRef();
            boolean _notEquals_3 = (!Objects.equal(_propRef_2, null));
            _and = _notEquals_3;
          }
          if (_and) {
            PathNameCS _typeRef = input.getTypeRef();
            String _doSwitch_2 = this.doSwitch(_typeRef);
            this.defaultNR = _doSwitch_2;
            PathNameCS _propRef_3 = input.getPropRef();
            String _doSwitch_3 = this.doSwitch(_propRef_3);
            this.defaultNRP = _doSwitch_3;
            foundNR = true;
          }
          boolean _and_2 = false;
          boolean _and_3 = false;
          if (!(!foundNQ)) {
            _and_3 = false;
          } else {
            boolean _isQualifier_1 = input.isQualifier();
            _and_3 = _isQualifier_1;
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            PathNameCS _propRef_4 = input.getPropRef();
            boolean _notEquals_4 = (!Objects.equal(_propRef_4, null));
            _and_2 = _notEquals_4;
          }
          if (_and_2) {
            PathNameCS _typeRef_1 = input.getTypeRef();
            String _doSwitch_4 = this.doSwitch(_typeRef_1);
            this.defaultNQ = _doSwitch_4;
            PathNameCS _propRef_5 = input.getPropRef();
            String _doSwitch_5 = this.doSwitch(_propRef_5);
            this.defaultNQP = _doSwitch_5;
            foundNQ = true;
          }
        }
      }
    }
  }
  
  private CurrentScopeProvisionDef addProvision2Map(final CurrentScopeProvisionDef currentScopeProv, final String className) {
    CurrentScopeProvisionDef _xblockexpression = null;
    {
      final SelectionDef selection = currentScopeProv.getSelectionDef();
      CurrentScopeProvisionDef _xifexpression = null;
      if ((selection instanceof SelectionSpecific)) {
        EList<PathNameCS> _selections = ((SelectionSpecific)selection).getSelections();
        for (final PathNameCS property : _selections) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(className, "");
          _builder.append("::");
          String _doSwitch = this.doSwitch(property);
          _builder.append(_doSwitch, "");
          this.feaName2scopes.put(_builder.toString(), currentScopeProv);
        }
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(className, "");
        _builder_1.append("::");
        _builder_1.append(this.ALL_CHILDREN, "");
        _xifexpression = this.feaName2scopes.put(_builder_1.toString(), currentScopeProv);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseNameResolutionSect(final NameResolutionSect object) {
    final StringBuilder sb = new StringBuilder();
    final Targets targetsDef = object.getTargetsDef();
    boolean _notEquals = (!Objects.equal(targetsDef, null));
    if (_notEquals) {
      String _doSwitch = this.doSwitch(targetsDef);
      sb.append(_doSwitch);
    }
    final Providers providersDef = object.getProvidersDef();
    boolean _notEquals_1 = (!Objects.equal(providersDef, null));
    if (_notEquals_1) {
      String _doSwitch_1 = this.doSwitch(providersDef);
      sb.append(_doSwitch_1);
    }
    return sb.toString();
  }
  
  @Override
  public String caseTargets(final Targets object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Target> _targets = object.getTargets();
      for(final Target target : _targets) {
        String _doSwitch = this.doSwitch(target);
        _builder.append(_doSwitch, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String caseTarget(final Target object) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      final QualificationDef qualificationDef = object.getQualification();
      final FilterDef filterDef = object.getFilter();
      boolean _or = false;
      boolean _notEquals = (!Objects.equal(qualificationDef, null));
      if (_notEquals) {
        _or = true;
      } else {
        boolean _notEquals_1 = (!Objects.equal(filterDef, null));
        _or = _notEquals_1;
      }
      if (_or) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("context ");
        PathNameCS _classRef = object.getClassRef();
        String _doSwitch = this.doSwitch(_classRef);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
        String _provideQualifiedEnvMethods = this.provideQualifiedEnvMethods(object);
        _builder.append(_provideQualifiedEnvMethods, "");
        _builder.newLineIfNotEmpty();
        String _provideFilterMethod = this.provideFilterMethod(object);
        _builder.append(_provideFilterMethod, "");
        _builder.newLineIfNotEmpty();
        sb.append(_builder);
      }
      PathNameCS _classRef_1 = object.getClassRef();
      final String className = this.doSwitch(_classRef_1);
      final String nClassName = this.normalizeString(className);
      final FilterDef filter = object.getFilter();
      final String filterParams = this.getOptionalAddedParamsText(filter);
      final String filterArgs = this.getOptionalAddedArgsText(filter);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("context Visitable");
      _builder_1.newLine();
      String _provideUnqualifiedLookupMethods = this.provideUnqualifiedLookupMethods(object);
      _builder_1.append(_provideUnqualifiedLookupMethods, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.newLine();
      {
        List<String> _get = this.element2qualifiers.get(className);
        boolean _notEquals_2 = (!Objects.equal(_get, null));
        if (_notEquals_2) {
          CharSequence _provideQualifiedLookupMethods = this.provideQualifiedLookupMethods(className, nClassName, filterParams, filterArgs);
          _builder_1.append(_provideQualifiedLookupMethods, "");
        }
      }
      _builder_1.newLineIfNotEmpty();
      sb.append(_builder_1);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseProviders(final Providers object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Provider> _providers = object.getProviders();
      for(final Provider provider : _providers) {
        String _doSwitch = this.doSwitch(provider);
        _builder.append(_doSwitch, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String caseProvider(final Provider object) {
    final StringBuilder sb = new StringBuilder();
    final ProviderVarsDecl varsDecl = object.getVarsDecl();
    final StringBuilder providerVars = new StringBuilder();
    boolean _notEquals = (!Objects.equal(varsDecl, null));
    if (_notEquals) {
      String _doSwitch = this.doSwitch(varsDecl);
      providerVars.append(_doSwitch);
    }
    final ExportedScopeDecl exportedScopeDecl = object.getExportedScope();
    final CurrentScopeDecl currentScopeDecl = object.getCurrentScope();
    PathNameCS _classRef = object.getClassRef();
    final String className = this.doSwitch(_classRef);
    boolean _or = false;
    boolean _notEquals_1 = (!Objects.equal(exportedScopeDecl, null));
    if (_notEquals_1) {
      _or = true;
    } else {
      boolean _notEquals_2 = (!Objects.equal(currentScopeDecl, null));
      _or = _notEquals_2;
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("context ");
      PathNameCS _classRef_1 = object.getClassRef();
      String _doSwitch_1 = this.doSwitch(_classRef_1);
      _builder.append(_doSwitch_1, "");
      _builder.newLineIfNotEmpty();
      {
        boolean _notEquals_3 = (!Objects.equal(currentScopeDecl, null));
        if (_notEquals_3) {
          String _string = providerVars.toString();
          String _provideUnqualifiedEnvMethods = this.provideUnqualifiedEnvMethods(currentScopeDecl, _string, className);
          _builder.append(_provideUnqualifiedEnvMethods, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _notEquals_4 = (!Objects.equal(exportedScopeDecl, null));
        if (_notEquals_4) {
          String _string_1 = providerVars.toString();
          String _provideExportedEnvMethods = this.provideExportedEnvMethods(exportedScopeDecl, _string_1, className);
          _builder.append(_provideExportedEnvMethods, "");
          _builder.newLineIfNotEmpty();
          String _provideExporterLookupMethod = this.provideExporterLookupMethod(exportedScopeDecl);
          _builder.append(_provideExporterLookupMethod, "");
          _builder.newLineIfNotEmpty();
        }
      }
      sb.append(_builder);
    }
    boolean _notEquals_5 = (!Objects.equal(exportedScopeDecl, null));
    if (_notEquals_5) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("context Visitable");
      _builder_1.newLine();
      String _provideLookupFromMethods = this.provideLookupFromMethods(exportedScopeDecl, className);
      _builder_1.append(_provideLookupFromMethods, "");
      _builder_1.newLineIfNotEmpty();
      sb.append(_builder_1);
    }
    return sb.toString();
  }
  
  @Override
  public String caseContribution(final Contribution object) {
    String _xifexpression = null;
    boolean _isIsPreceding = object.isIsPreceding();
    if (_isIsPreceding) {
      String _xblockexpression = null;
      {
        EObject _eContainer = object.eContainer();
        EObject _eContainer_1 = _eContainer.eContainer();
        EObject _eContainer_2 = _eContainer_1.eContainer();
        final CurrentScopeProvisionDef scopeDef = ((CurrentScopeProvisionDef) _eContainer_2);
        SelectionDef _selectionDef = scopeDef.getSelectionDef();
        EList<PathNameCS> _selections = ((SelectionSpecific) _selectionDef).getSelections();
        final PathNameCS property = _selections.get(0);
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
        boolean _isIsExported = object.isIsExported();
        if (_isIsExported) {
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
  public String caseProvision(final Provision object) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      final EList<OccludingDef> occludingDefs = object.getOccludingDefs();
      for (int i = (occludingDefs.size() - 1); (i >= 0); i--) {
        OccludingDef _get = occludingDefs.get(i);
        String _doSwitch = this.doSwitch(_get);
        sb.append(_doSwitch);
      }
      ContributionsDef _contributionsDef = object.getContributionsDef();
      String _doSwitch = this.doSwitch(_contributionsDef);
      sb.append(_doSwitch);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseOccludingDef(final OccludingDef object) {
    StringConcatenation _builder = new StringConcatenation();
    ContributionsDef _contributionsDef = object.getContributionsDef();
    String _doSwitch = this.doSwitch(_contributionsDef);
    _builder.append(_doSwitch, "");
    _builder.newLineIfNotEmpty();
    _builder.append(".nestedEnv()");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String caseContributionsDef(final ContributionsDef object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Contribution> _contributions = object.getContributions();
      for(final Contribution contrib : _contributions) {
        String _doSwitch = this.doSwitch(contrib);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String caseProviderVarsDecl(final ProviderVarsDecl object) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      EList<LetVariableCS> _varDecl = object.getVarDecl();
      for (final LetVariableCS varDecl : _varDecl) {
        {
          final TypedRefCS optType = varDecl.getOwnedType();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("let ");
          String _name = varDecl.getName();
          _builder.append(_name, "");
          {
            boolean _notEquals = (!Objects.equal(optType, null));
            if (_notEquals) {
              _builder.append(" : ");
              String _doSwitch = this.doSwitch(optType);
              _builder.append(_doSwitch, "");
            }
          }
          _builder.append(" = ");
          ExpCS _ownedInitExpression = varDecl.getOwnedInitExpression();
          String _doSwitch_1 = this.doSwitch(_ownedInitExpression);
          _builder.append(_doSwitch_1, "");
          _builder.newLineIfNotEmpty();
          _builder.append("in ");
          _builder.newLine();
          sb.append(_builder);
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private String provideLookupFromMethods(final ExportedScopeDecl provider, final String className) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      final String nClassName = this.normalizeString(className);
      String _lowerCase = className.toLowerCase();
      char _charAt = _lowerCase.charAt(0);
      final String nameParam = (Character.valueOf(_charAt) + "Name");
      EList<ExportedScopeProvisionDef> _provisionDefs = provider.getProvisionDefs();
      final Function1<ExportedScopeProvisionDef, EList<Provision>> _function = (ExportedScopeProvisionDef x) -> {
        return x.getProvisions();
      };
      List<EList<Provision>> _map = ListExtensions.<ExportedScopeProvisionDef, EList<Provision>>map(_provisionDefs, _function);
      Iterable<Provision> _flatten = Iterables.<Provision>concat(_map);
      for (final Provision provision : _flatten) {
        {
          MultiplePathNames _providedClasses = provision.getProvidedClasses();
          EList<PathNameCS> _pathNames = _providedClasses.getPathNames();
          PathNameCS _get = _pathNames.get(0);
          final String exportedClassName = this.doSwitch(_get);
          final String nExportedClassName = this.normalizeString(exportedClassName);
          final FilterDef filter = this.element2filter.get(exportedClassName);
          final String filterParams = this.getOptionalAddedParamsText(filter);
          final String filterArgs = this.getOptionalAddedArgsText(filter);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("-- ");
          _builder.append(nClassName, "");
          _builder.append(" exports ");
          _builder.append(nExportedClassName, "");
          _builder.newLineIfNotEmpty();
          _builder.append("   ");
          _builder.newLine();
          {
            boolean _equals = Objects.equal(this.defaultNR, null);
            if (_equals) {
              _builder.append("def : lookup");
              _builder.append(nExportedClassName, "");
              _builder.append("From(exporter : ");
              _builder.append(className, "");
              _builder.append(" , ");
              _builder.append(nameParam, "");
              _builder.append(" : String");
              _builder.append(filterParams, "");
              _builder.append(") : ");
              _builder.append(exportedClassName, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("   ");
              _builder.append("exporter.lookupExported");
              _builder.append(nExportedClassName, "   ");
              _builder.append("(self, ");
              _builder.append(nameParam, "   ");
              _builder.append(filterArgs, "   ");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("def : lookup");
              _builder.append(nExportedClassName, "");
              _builder.append("From(exporter : ");
              _builder.append(className, "");
              _builder.append(", a");
              _builder.append(this.defaultNR, "");
              _builder.append(" : ");
              _builder.append(this.sourcePckName, "");
              _builder.append("::");
              _builder.append(this.defaultNR, "");
              _builder.append(filterParams, "");
              _builder.append(") : ");
              _builder.append(exportedClassName, "");
              _builder.append("[?] =");
              _builder.newLineIfNotEmpty();
              _builder.append("   ");
              _builder.append("exporter.lookupExported");
              _builder.append(nExportedClassName, "   ");
              _builder.append("(self, a");
              _builder.append(this.defaultNR, "   ");
              _builder.append(filterArgs, "   ");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.newLine();
          {
            List<String> _get_1 = this.element2qualifiers.get(exportedClassName);
            boolean _notEquals = (!Objects.equal(_get_1, null));
            if (_notEquals) {
              String _provideQualifiedLookupFromMethods = this.provideQualifiedLookupFromMethods(exportedClassName, nExportedClassName, className, filterParams, filterArgs);
              _builder.append(_provideQualifiedLookupFromMethods, "");
            }
          }
          _builder.append("\t");
          _builder.newLineIfNotEmpty();
          sb.append(_builder);
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
    return _builder;
  }
  
  private String provideQualifiedEnvMethods(final Target target) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      final QualificationDef qualificationDef = target.getQualification();
      boolean _notEquals = (!Objects.equal(qualificationDef, null));
      if (_notEquals) {
        EList<Qualification> _qualifications = qualificationDef.getQualifications();
        for (final Qualification qualification : _qualifications) {
          MultiplePathNames _qualifiedClasses = qualification.getQualifiedClasses();
          EList<PathNameCS> _pathNames = _qualifiedClasses.getPathNames();
          for (final PathNameCS targetClass : _pathNames) {
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
              _builder.append("   ");
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
              _builder.append("   ");
              _builder.append("let found");
              _builder.append(nClassName, "   ");
              _builder.append(" = _lookup");
              _builder.append(nClassName, "   ");
              _builder.append("(_qualified_env_");
              _builder.append(nClassName, "   ");
              _builder.append("(), ");
              _builder.append(nameParam, "   ");
              _builder.append(filterArgs, "   ");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("   ");
              _builder.append("in  if found");
              _builder.append(nClassName, "   ");
              _builder.append("->isEmpty()");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("then null");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("else found");
              _builder.append(nClassName, "      ");
              _builder.append("->first()");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("endif");
              _builder.newLine();
              _builder.append("def : _qualified_env_");
              _builder.append(nClassName, "");
              _builder.append("() : ");
              _builder.append(this.lookupPck, "");
              _builder.append("::");
              _builder.append(this.lookupEnv, "");
              _builder.append(" =");
              _builder.newLineIfNotEmpty();
              _builder.append("   ");
              _builder.append("let env = ");
              _builder.append(this.lookupPck, "   ");
              _builder.append("::");
              _builder.append(this.lookupEnv, "   ");
              _builder.append("{}");
              _builder.newLineIfNotEmpty();
              _builder.append("   ");
              _builder.append("in env");
              _builder.newLine();
              _builder.append("   ");
              {
                EList<ExpCS> _contributions = qualification.getContributions();
                for(final ExpCS contrib : _contributions) {
                  _builder.append(".addElements(");
                  String _doSwitch = this.doSwitch(contrib);
                  _builder.append(_doSwitch, "   ");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                boolean _notEquals_1 = (!Objects.equal(this.defaultNR, null));
                if (_notEquals_1) {
                  CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, "", ("Qualified" + nClassName), filterParams, filterArgs);
                  _builder.append(_provideLookupByNameReferencerMethod, "");
                }
              }
              _builder.newLineIfNotEmpty();
              sb.append(_builder);
            }
          }
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
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
      _builder_1.append("-- ");
      _builder_1.append(className, "");
      _builder_1.append(" qualified-name lookup");
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
      _builder_1.append("   ");
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
  
  private String provideUnqualifiedEnvMethods(final CurrentScopeDecl currentScope, final String providerVars, final String scopingClassName) {
    String _xblockexpression = null;
    {
      final List<Provision> provisionsInCurrentScope = CollectionLiterals.<Provision>newArrayList();
      EList<CurrentScopeProvisionDef> _provisionDefs = currentScope.getProvisionDefs();
      for (final CurrentScopeProvisionDef currentScopeProv : _provisionDefs) {
        EList<Provision> _provisions = currentScopeProv.getProvisions();
        provisionsInCurrentScope.addAll(_provisions);
      }
      final StringBuilder sb = new StringBuilder();
      final Map<String, Set<Provision>> scopedClasses = this.computeTargetClasses(provisionsInCurrentScope);
      Set<String> _keySet = scopedClasses.keySet();
      for (final String scopedClassName : _keySet) {
        Set<Provision> _get = scopedClasses.get(scopedClassName);
        String _provideUnqualifiedEnvMethod = this.provideUnqualifiedEnvMethod(scopingClassName, scopedClassName, _get, providerVars);
        sb.append(_provideUnqualifiedEnvMethod);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private String provideUnqualifiedEnvMethod(final String scopingClassName, final String scopedClassName, final Set<Provision> provisionDefs, final String providerVars) {
    String _xblockexpression = null;
    {
      String allChildrenName = null;
      final List<String> featureNames = CollectionLiterals.<String>newArrayList();
      for (final Provision provisionDef : provisionDefs) {
        {
          EObject _eContainer = provisionDef.eContainer();
          final CurrentScopeProvisionDef scopeDef = ((CurrentScopeProvisionDef) _eContainer);
          final SelectionDef propagation = scopeDef.getSelectionDef();
          if ((propagation instanceof SelectionSpecific)) {
            EList<PathNameCS> _selections = ((SelectionSpecific)propagation).getSelections();
            for (final PathNameCS property : _selections) {
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
      _builder.append("   ");
      _builder.append(providerVars, "   ");
      String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(scopedClassName, featureNames, allChildrenName);
      _builder.append(_provideScopeContributionsQuery, "   ");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideUnqualifiedLookupMethods(final Target object) {
    String _xblockexpression = null;
    {
      PathNameCS _classRef = object.getClassRef();
      final String className = this.doSwitch(_classRef);
      final String nClassName = this.normalizeString(className);
      String _lowerCase = className.toLowerCase();
      char _charAt = _lowerCase.charAt(0);
      final String nameParam = (Character.valueOf(_charAt) + "Name");
      String _xifexpression = null;
      PathNameCS _propRef = object.getPropRef();
      boolean _notEquals = (!Objects.equal(_propRef, null));
      if (_notEquals) {
        PathNameCS _propRef_1 = object.getPropRef();
        _xifexpression = this.doSwitch(_propRef_1);
      } else {
        _xifexpression = this.defaultNEP;
      }
      final String nameProp = _xifexpression;
      final FilterDef filter = object.getFilter();
      final String filterParams = this.getOptionalAddedParamsText(filter);
      final String filterArgs = this.getOptionalAddedArgsText(filter);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-- ");
      _builder.append(nClassName, "");
      _builder.append(" unqualified lookup");
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
      _builder.append("   ");
      _builder.append("then _lookup");
      _builder.append(nClassName, "   ");
      _builder.append("(env.parentEnv, ");
      _builder.append(nameParam, "   ");
      _builder.append(filterArgs, "   ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("else found");
      _builder.append(nClassName, "   ");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("endif");
      _builder.newLine();
      _builder.append("   ");
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
      _builder.append("   ");
      _builder.append("then null");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("else found");
      _builder.append(nClassName, "   ");
      _builder.append("->first() -- LookupVisitor will report ambiguous result");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("endif");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("def : lookup");
      _builder.append(nClassName, "");
      _builder.append("(");
      _builder.append(nameParam, "");
      _builder.append(" : String");
      _builder.append(filterParams, "");
      _builder.append(") : ");
      _builder.append(className, "");
      _builder.append("[?] =");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("_lookupUnqualified");
      _builder.append(nClassName, "   ");
      _builder.append("(");
      _builder.append(nameParam, "   ");
      _builder.append(filterArgs, "   ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      {
        boolean _notEquals_2 = (!Objects.equal(this.defaultNR, null));
        if (_notEquals_2) {
          CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, "Unqualified", nClassName, filterParams, filterArgs);
          _builder.append(_provideLookupByNameReferencerMethod, "");
        }
      }
      _builder.append("\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("-- End of ");
      _builder.append(nClassName, "");
      _builder.append(" unqualified lookup ");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportedEnvMethods(final ExportedScopeDecl exportedScope, final String providerVars, final String exportingClassName) {
    String _xblockexpression = null;
    {
      final List<Provision> provisionsInExportedScope = CollectionLiterals.<Provision>newArrayList();
      EList<ExportedScopeProvisionDef> _provisionDefs = exportedScope.getProvisionDefs();
      for (final ExportedScopeProvisionDef exportedScopeProv : _provisionDefs) {
        EList<Provision> _provisions = exportedScopeProv.getProvisions();
        provisionsInExportedScope.addAll(_provisions);
      }
      final StringBuilder sb = new StringBuilder();
      final Map<String, Set<Provision>> exportedClasses = this.computeTargetClasses(provisionsInExportedScope);
      Set<String> _keySet = exportedClasses.keySet();
      for (final String exportedClassName : _keySet) {
        Set<Provision> _get = exportedClasses.get(exportedClassName);
        String _provideExportedEnvMethod = this.provideExportedEnvMethod(exportingClassName, exportedClassName, _get, providerVars);
        sb.append(_provideExportedEnvMethod);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportedEnvMethod(final String exportingClassName, final String exportedClassName, final Set<Provision> provisionDefs, final String providerVars) {
    String _xblockexpression = null;
    {
      String allChildrenName = null;
      final List<String> featureNames = CollectionLiterals.<String>newArrayList();
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
      _builder.append("   ");
      _builder.append(providerVars, "   ");
      String _provideExportsContributionsQuery = this.provideExportsContributionsQuery(exportedClassName, featureNames, allChildrenName);
      _builder.append(_provideExportsContributionsQuery, "   ");
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
            final CurrentScopeProvisionDef scopeDef = this.feaName2scopes.get(allChildrenName);
            SelectionDef _selectionDef = scopeDef.getSelectionDef();
            final SelectionAll selectionDef = ((SelectionAll) _selectionDef);
            EList<PathNameCS> _xifexpression_2 = null;
            boolean _notEquals = (!Objects.equal(selectionDef, null));
            if (_notEquals) {
              _xifexpression_2 = selectionDef.getExceptions();
            } else {
              _xifexpression_2 = null;
            }
            final EList<PathNameCS> exceptProps = _xifexpression_2;
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
                for(final PathNameCS exceptProp : exceptProps) {
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
          final CurrentScopeProvisionDef scopeDef = this.feaName2scopes.get(featureName);
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
  
  private String provideScopeContributionsQuery(final CurrentScopeProvisionDef object, final String scopedClassName) {
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
      _builder_1.append("   ");
      EList<Provision> _provisions = object.getProvisions();
      String _provideProvisionDefsContribution = this.provideProvisionDefsContribution(_provisions, scopedClassName);
      _builder_1.append(_provideProvisionDefsContribution, "   ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
      _builder_1.newLine();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private String provideProvisionDefsContribution(final List<Provision> provisionDefs, final String targetClassName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Provision provisionDef : provisionDefs) {
        {
          MultiplePathNames _providedClasses = provisionDef.getProvidedClasses();
          EList<PathNameCS> _pathNames = _providedClasses.getPathNames();
          final Function1<PathNameCS, String> _function = (PathNameCS x) -> {
            return this.doSwitch(x);
          };
          List<String> _map = ListExtensions.<PathNameCS, String>map(_pathNames, _function);
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
        ExportedScopeProvisionDef _get = this.feaName2exports.get(allChildrenName);
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
  
  private String provideExportContributionsQuery(final ExportedScopeProvisionDef object, final String exportedClassName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("let env = ");
    _builder.append(this.lookupPck, "");
    _builder.append("::");
    _builder.append(this.lookupEnv, "");
    _builder.append(" {}");
    _builder.newLineIfNotEmpty();
    _builder.append("in env");
    _builder.newLine();
    _builder.append("   ");
    EList<Provision> _provisions = object.getProvisions();
    String _provideProvisionDefsContribution = this.provideProvisionDefsContribution(_provisions, exportedClassName);
    _builder.append(_provideProvisionDefsContribution, "   ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String provideExporterLookupMethod(final ExportedScopeDecl exports) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      EList<ExportedScopeProvisionDef> _provisionDefs = exports.getProvisionDefs();
      final Function1<ExportedScopeProvisionDef, EList<Provision>> _function = (ExportedScopeProvisionDef x) -> {
        return x.getProvisions();
      };
      List<EList<Provision>> _map = ListExtensions.<ExportedScopeProvisionDef, EList<Provision>>map(_provisionDefs, _function);
      Iterable<Provision> _flatten = Iterables.<Provision>concat(_map);
      for (final Provision provision : _flatten) {
        {
          MultiplePathNames _providedClasses = provision.getProvidedClasses();
          EList<PathNameCS> _pathNames = _providedClasses.getPathNames();
          PathNameCS _get = _pathNames.get(0);
          final String className = this.doSwitch(_get);
          final String nClassName = this.normalizeString(className);
          String _lowerCase = className.toLowerCase();
          char _charAt = _lowerCase.charAt(0);
          final String nameParam = (Character.valueOf(_charAt) + "Name");
          final FilterDef filter = this.element2filter.get(className);
          final String filterParams = this.getOptionalAddedParamsText(filter);
          final String filterArgs = this.getOptionalAddedArgsText(filter);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("   ");
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
          _builder.append("   ");
          _builder.append("let found");
          _builder.append(nClassName, "   ");
          _builder.append(" = _lookup");
          _builder.append(nClassName, "   ");
          _builder.append("(_exported_env_");
          _builder.append(nClassName, "   ");
          _builder.append("(importer), ");
          _builder.append(nameParam, "   ");
          _builder.append(filterArgs, "   ");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("   ");
          _builder.append("in  if found");
          _builder.append(nClassName, "   ");
          _builder.append("->isEmpty()");
          _builder.newLineIfNotEmpty();
          _builder.append("      ");
          _builder.append("then null");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("else found");
          _builder.append(nClassName, "      ");
          _builder.append("->first()");
          _builder.newLineIfNotEmpty();
          _builder.append("      ");
          _builder.append("endif");
          _builder.newLine();
          _builder.append("      ");
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
              _builder.append("   ");
              _builder.append("_lookupExported");
              _builder.append(nClassName, "   ");
              _builder.append("(importer, nameParam»");
              _builder.append(filterArgs, "   ");
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
              _builder.append("   ");
              _builder.append("_lookupExported");
              _builder.append(nClassName, "   ");
              _builder.append("(importer, a");
              _builder.append(this.defaultNR, "   ");
              _builder.append(".");
              _builder.append(this.defaultNRP, "   ");
              _builder.append(filterArgs, "   ");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            }
          }
          sb.append(_builder);
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  private String provideFilterMethod(final Target object) {
    String _xblockexpression = null;
    {
      final FilterDef filterDef = object.getFilter();
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(filterDef, null));
      if (_notEquals) {
        String _xblockexpression_1 = null;
        {
          PathNameCS _classRef = object.getClassRef();
          final String className = this.doSwitch(_classRef);
          final String nClassName = this.normalizeString(className);
          final String filterParams = this.getParamsText(filterDef);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("   ");
          _builder.newLine();
          _builder.append("def : ");
          String _filterOpName = this.getFilterOpName(nClassName);
          _builder.append(_filterOpName, "");
          _builder.append("(");
          _builder.append(filterParams, "");
          _builder.append(") : Boolean =");
          _builder.newLineIfNotEmpty();
          _builder.append("   ");
          ExpCS _expression = filterDef.getExpression();
          String _doSwitch = this.doSwitch(_expression);
          _builder.append(_doSwitch, "   ");
          _builder.newLineIfNotEmpty();
          _xblockexpression_1 = _builder.toString();
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = "";
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
  
  private Map<String, Set<Provision>> computeTargetClasses(final List<Provision> provisionDefs) {
    final Map<String, Set<Provision>> targetClasses = CollectionLiterals.<String, Set<Provision>>newLinkedHashMap();
    for (final Provision provisionDef : provisionDefs) {
      MultiplePathNames _providedClasses = provisionDef.getProvidedClasses();
      EList<PathNameCS> _pathNames = _providedClasses.getPathNames();
      for (final PathNameCS targetClass : _pathNames) {
        {
          final String targetClassName = this.doSwitch(targetClass);
          Set<Provision> scopingDefs = targetClasses.get(targetClassName);
          boolean _equals = Objects.equal(scopingDefs, null);
          if (_equals) {
            LinkedHashSet<Provision> _newLinkedHashSet = CollectionLiterals.<Provision>newLinkedHashSet();
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
