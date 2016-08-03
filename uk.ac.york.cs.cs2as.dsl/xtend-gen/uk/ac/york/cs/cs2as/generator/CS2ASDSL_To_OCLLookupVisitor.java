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
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Input;
import uk.ac.york.cs.cs2as.cs2as_dsl.Inputs;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultipleClassRef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provider;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.Providers;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;
import uk.ac.york.cs.cs2as.cs2as_dsl.Target;
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
  
  private Map<String, ScopeDef> feaName2scopes = CollectionLiterals.<String, ScopeDef>newHashMap();
  
  private Map<String, ExportDef> feaName2exports = CollectionLiterals.<String, ExportDef>newHashMap();
  
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
          ClassRef _classRef = target.getClassRef();
          PathNameCS _className = _classRef.getClassName();
          final String className = this.doSwitch(_className);
          final String nClassName = this.normalizeString(className);
          this.normalizedTargetElements.add(nClassName);
          EList<QualificationDef> _qualifications = target.getQualifications();
          for (final QualificationDef qDef : _qualifications) {
            MultipleClassRef _targetsDef = qDef.getTargetsDef();
            EList<PathNameCS> _classNames = _targetsDef.getClassNames();
            for (final PathNameCS targetClass : _classNames) {
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
    EList<Provider> _providers = providersDef.getProviders();
    for (final Provider provider : _providers) {
      {
        PathNameCS _classRef = provider.getClassRef();
        final String className = this.doSwitch(_classRef);
        EList<ProviderStmnt> _statements = provider.getStatements();
        for (final ProviderStmnt statemnt : _statements) {
          if ((statemnt instanceof ScopeDef)) {
            SelectionDef _selectionDef = ((ScopeDef)statemnt).getSelectionDef();
            this.<ScopeDef>addStatement2Map(((ScopeDef)statemnt), this.feaName2scopes, _selectionDef, className);
          } else {
            if ((statemnt instanceof ExportDef)) {
              EList<ProvisionDef> _provisionDefs = ((ExportDef)statemnt).getProvisionDefs();
              for (final ProvisionDef pDefg : _provisionDefs) {
                MultipleClassRef _targetsDef = pDefg.getTargetsDef();
                EList<PathNameCS> _classNames = _targetsDef.getClassNames();
                for (final PathNameCS targetClass : _classNames) {
                  {
                    final String exportedElement = this.doSwitch(targetClass);
                    String _normalizeString = this.normalizeString(exportedElement);
                    this.normalizedExportedElements.add(_normalizeString);
                  }
                }
              }
              SelectionDef _selectionDef_1 = ((ExportDef)statemnt).getSelectionDef();
              this.<ExportDef>addStatement2Map(((ExportDef)statemnt), this.feaName2exports, _selectionDef_1, className);
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
          ClassRef _classRef = target.getClassRef();
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
          if (!(!foundNR)) {
            _and = false;
          } else {
            boolean _isQualifier = input.isQualifier();
            boolean _not = (!_isQualifier);
            _and = _not;
          }
          if (_and) {
            ClassRef _classRef_1 = input.getClassRef();
            String _doSwitch_2 = this.doSwitch(_classRef_1);
            this.defaultNR = _doSwitch_2;
            PathNameCS _propRef_2 = input.getPropRef();
            String _doSwitch_3 = this.doSwitch(_propRef_2);
            this.defaultNRP = _doSwitch_3;
            foundNR = true;
          }
          boolean _and_1 = false;
          if (!(!foundNQ)) {
            _and_1 = false;
          } else {
            boolean _isQualifier_1 = input.isQualifier();
            _and_1 = _isQualifier_1;
          }
          if (_and_1) {
            ClassRef _classRef_2 = input.getClassRef();
            String _doSwitch_4 = this.doSwitch(_classRef_2);
            this.defaultNQ = _doSwitch_4;
            PathNameCS _propRef_3 = input.getPropRef();
            String _doSwitch_5 = this.doSwitch(_propRef_3);
            this.defaultNQP = _doSwitch_5;
            foundNQ = true;
          }
        }
      }
    }
  }
  
  private <Def extends ProviderStmnt> Def addStatement2Map(final Def statmnt, final Map<String, Def> result, final SelectionDef selection, final String className) {
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
      final EList<QualificationDef> qualificationDefs = object.getQualifications();
      final FilterDef filterDef = object.getFilter();
      boolean _or = false;
      boolean _isEmpty = qualificationDefs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _or = true;
      } else {
        boolean _notEquals = (!Objects.equal(filterDef, null));
        _or = _notEquals;
      }
      if (_or) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("context ");
        ClassRef _classRef = object.getClassRef();
        String _doSwitch = this.doSwitch(_classRef);
        _builder.append(_doSwitch, "");
        _builder.newLineIfNotEmpty();
        sb.append(_builder);
        for (final QualificationDef qualification : qualificationDefs) {
          MultipleClassRef _targetsDef = qualification.getTargetsDef();
          EList<PathNameCS> _classNames = _targetsDef.getClassNames();
          for (final PathNameCS targetClass : _classNames) {
            {
              final String className = this.doSwitch(targetClass);
              final String nClassName = this.normalizeString(className);
              String _lowerCase = className.toLowerCase();
              char _charAt = _lowerCase.charAt(0);
              final String nameParam = (Character.valueOf(_charAt) + "Name");
              final FilterDef filter = this.element2filter.get(className);
              final String filterParams = this.getOptionalAddedParamsText(filter);
              final String filterArgs = this.getOptionalAddedArgsText(filter);
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("\t");
              _builder_1.newLine();
              _builder_1.append("def : _lookupQualified");
              _builder_1.append(nClassName, "");
              _builder_1.append("(");
              _builder_1.append(nameParam, "");
              _builder_1.append(" : String");
              _builder_1.append(filterParams, "");
              _builder_1.append(") : ");
              _builder_1.append(className, "");
              _builder_1.append("[?] =");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("   ");
              _builder_1.append("let found");
              _builder_1.append(nClassName, "   ");
              _builder_1.append(" = _lookup");
              _builder_1.append(nClassName, "   ");
              _builder_1.append("(_qualified_env_");
              _builder_1.append(nClassName, "   ");
              _builder_1.append("(), ");
              _builder_1.append(nameParam, "   ");
              _builder_1.append(filterArgs, "   ");
              _builder_1.append(")");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("   ");
              _builder_1.append("in  if found");
              _builder_1.append(nClassName, "   ");
              _builder_1.append("->isEmpty()");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("      ");
              _builder_1.append("then null");
              _builder_1.newLine();
              _builder_1.append("      ");
              _builder_1.append("else found");
              _builder_1.append(nClassName, "      ");
              _builder_1.append("->first()");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("      ");
              _builder_1.append("endif");
              _builder_1.newLine();
              _builder_1.append("def : _qualified_env_");
              _builder_1.append(nClassName, "");
              _builder_1.append("() : ");
              _builder_1.append(this.lookupPck, "");
              _builder_1.append("::");
              _builder_1.append(this.lookupEnv, "");
              _builder_1.append(" =");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("   ");
              _builder_1.append("let env = ");
              _builder_1.append(this.lookupPck, "   ");
              _builder_1.append("::");
              _builder_1.append(this.lookupEnv, "   ");
              _builder_1.append("{}");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("   ");
              _builder_1.append("in env");
              _builder_1.newLine();
              _builder_1.append("   ");
              {
                EList<ElementsContribExp> _contribution = qualification.getContribution();
                for(final ElementsContribExp contrib : _contribution) {
                  String _doSwitch_1 = this.doSwitch(contrib);
                  _builder_1.append(_doSwitch_1, "   ");
                  _builder_1.newLineIfNotEmpty();
                }
              }
              {
                boolean _notEquals_1 = (!Objects.equal(this.defaultNR, null));
                if (_notEquals_1) {
                  CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className, "", ("Qualified" + nClassName), filterParams, filterArgs);
                  _builder_1.append(_provideLookupByNameReferencerMethod, "");
                }
              }
              _builder_1.newLineIfNotEmpty();
              sb.append(_builder_1);
            }
          }
        }
        boolean _notEquals_1 = (!Objects.equal(filterDef, null));
        if (_notEquals_1) {
          ClassRef _classRef_1 = object.getClassRef();
          final String className = this.doSwitch(_classRef_1);
          final String nClassName = this.normalizeString(className);
          final String filterParams = this.getParamsText(filterDef);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("   ");
          _builder_1.newLine();
          _builder_1.append("def : ");
          String _filterOpName = this.getFilterOpName(nClassName);
          _builder_1.append(_filterOpName, "");
          _builder_1.append("(");
          _builder_1.append(filterParams, "");
          _builder_1.append(") : Boolean =");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("   ");
          ExpCS _expression = filterDef.getExpression();
          String _doSwitch_1 = this.doSwitch(_expression);
          _builder_1.append(_doSwitch_1, "   ");
          _builder_1.newLineIfNotEmpty();
          sb.append(_builder_1);
        }
        sb.toString();
      }
      ClassRef _classRef_2 = object.getClassRef();
      final String className_1 = this.doSwitch(_classRef_2);
      final String nClassName_1 = this.normalizeString(className_1);
      String _lowerCase = className_1.toLowerCase();
      char _charAt = _lowerCase.charAt(0);
      final String nameParam = (Character.valueOf(_charAt) + "Name");
      String _xifexpression = null;
      PathNameCS _propRef = object.getPropRef();
      boolean _notEquals_2 = (!Objects.equal(_propRef, null));
      if (_notEquals_2) {
        PathNameCS _propRef_1 = object.getPropRef();
        _xifexpression = this.doSwitch(_propRef_1);
      } else {
        _xifexpression = this.defaultNEP;
      }
      final String nameProp = _xifexpression;
      final FilterDef filter = object.getFilter();
      final String filterParams_1 = this.getOptionalAddedParamsText(filter);
      final String filterArgs = this.getOptionalAddedArgsText(filter);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("context Visitable");
      _builder_2.newLine();
      _builder_2.append("-- ");
      _builder_2.append(nClassName_1, "");
      _builder_2.append(" unqualified lookup");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("def : _lookup");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("(env : ");
      _builder_2.append(this.lookupPck, "");
      _builder_2.append("::");
      _builder_2.append(this.lookupEnv, "");
      _builder_2.append(", ");
      _builder_2.append(nameParam, "");
      _builder_2.append(" : String");
      _builder_2.append(filterParams_1, "");
      _builder_2.append(") : OrderedSet(");
      _builder_2.append(className_1, "");
      _builder_2.append(") =");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("let found");
      _builder_2.append(nClassName_1, "");
      _builder_2.append(" = env.namedElements->selectByKind(");
      _builder_2.append(className_1, "");
      _builder_2.append(")->select(");
      _builder_2.append(nameProp, "");
      _builder_2.append(" = ");
      _builder_2.append(nameParam, "");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("                                         ");
      {
        boolean _notEquals_3 = (!Objects.equal(filter, null));
        if (_notEquals_3) {
          _builder_2.append("->select(");
          String _filterOpName_1 = this.getFilterOpName(nClassName_1);
          _builder_2.append(_filterOpName_1, "                                         ");
          _builder_2.append("(");
          String _argsText = this.getArgsText(filter);
          _builder_2.append(_argsText, "                                         ");
          _builder_2.append("))");
        }
      }
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("in  if found");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("->isEmpty() and not (env.parentEnv = null)");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.append("then _lookup");
      _builder_2.append(nClassName_1, "   ");
      _builder_2.append("(env.parentEnv, ");
      _builder_2.append(nameParam, "   ");
      _builder_2.append(filterArgs, "   ");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.append("else found");
      _builder_2.append(nClassName_1, "   ");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.append("endif");
      _builder_2.newLine();
      _builder_2.append("   ");
      _builder_2.newLine();
      _builder_2.append("-- Note: when calling this method, the source element of the argument passed to this method, will be the contextual ");
      _builder_2.newLine();
      _builder_2.append("-- object on which error reports will be handled");
      _builder_2.newLine();
      _builder_2.append("def : _lookupUnqualified");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("(");
      _builder_2.append(nameParam, "");
      _builder_2.append(" : String");
      _builder_2.append(filterParams_1, "");
      _builder_2.append(") : ");
      _builder_2.append(className_1, "");
      _builder_2.append("[?] =");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("let found");
      _builder_2.append(nClassName_1, "");
      _builder_2.append(" = _lookup");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("(unqualified_env_");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("(), ");
      _builder_2.append(nameParam, "");
      _builder_2.append(filterArgs, "");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("in  if found");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("->isEmpty()");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.append("then null");
      _builder_2.newLine();
      _builder_2.append("   ");
      _builder_2.append("else found");
      _builder_2.append(nClassName_1, "   ");
      _builder_2.append("->first() -- LookupVisitor will report ambiguous result");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.append("endif");
      _builder_2.newLine();
      _builder_2.append("   ");
      _builder_2.newLine();
      _builder_2.append("def : lookup");
      _builder_2.append(nClassName_1, "");
      _builder_2.append("(");
      _builder_2.append(nameParam, "");
      _builder_2.append(" : String");
      _builder_2.append(filterParams_1, "");
      _builder_2.append(") : ");
      _builder_2.append(className_1, "");
      _builder_2.append("[?] =");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.append("_lookupUnqualified");
      _builder_2.append(nClassName_1, "   ");
      _builder_2.append("(");
      _builder_2.append(nameParam, "   ");
      _builder_2.append(filterArgs, "   ");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      {
        boolean _notEquals_4 = (!Objects.equal(this.defaultNR, null));
        if (_notEquals_4) {
          CharSequence _provideLookupByNameReferencerMethod = this.provideLookupByNameReferencerMethod(className_1, "Unqualified", nClassName_1, filterParams_1, filterArgs);
          _builder_2.append(_provideLookupByNameReferencerMethod, "");
        }
      }
      _builder_2.append("\t\t");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("-- End of ");
      _builder_2.append(nClassName_1, "");
      _builder_2.append(" unqualified lookup ");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("   ");
      _builder_2.newLine();
      {
        List<String> _get = this.element2qualifiers.get(className_1);
        boolean _notEquals_5 = (!Objects.equal(_get, null));
        if (_notEquals_5) {
          CharSequence _provideQualifiedLookupMethods = this.provideQualifiedLookupMethods(className_1, nClassName_1, filterParams_1, filterArgs);
          _builder_2.append(_provideQualifiedLookupMethods, "");
        }
      }
      _builder_2.newLineIfNotEmpty();
      sb.append(_builder_2);
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
    EList<ProviderStmnt> _statements = object.getStatements();
    Iterable<ExportDef> _filter = Iterables.<ExportDef>filter(_statements, ExportDef.class);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    final boolean containsExports = (!_isEmpty);
    EList<ProviderStmnt> _statements_1 = object.getStatements();
    Iterable<ScopeDef> _filter_1 = Iterables.<ScopeDef>filter(_statements_1, ScopeDef.class);
    boolean _isEmpty_1 = IterableExtensions.isEmpty(_filter_1);
    final boolean containsScopes = (!_isEmpty_1);
    boolean _or = false;
    if (containsExports) {
      _or = true;
    } else {
      _or = containsScopes;
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("context ");
      PathNameCS _classRef = object.getClassRef();
      String _doSwitch = this.doSwitch(_classRef);
      _builder.append(_doSwitch, "");
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
      sb.append(_builder);
    }
    if (containsExports) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("context Visitable");
      _builder_1.newLine();
      String _provideLookupFromMethods = this.provideLookupFromMethods(object);
      _builder_1.append(_provideLookupFromMethods, "");
      _builder_1.newLineIfNotEmpty();
      sb.append(_builder_1);
    }
    return sb.toString();
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
  
  @Override
  public String caseClassRef(final ClassRef object) {
    StringConcatenation _builder = new StringConcatenation();
    PathNameCS _className = object.getClassName();
    String _doSwitch = this.doSwitch(_className);
    _builder.append(_doSwitch, "");
    return _builder.toString();
  }
  
  private String provideLookupFromMethods(final Provider provider) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      EList<ProviderStmnt> _statements = provider.getStatements();
      for (final ProviderStmnt statmt : _statements) {
        {
          PathNameCS _classRef = provider.getClassRef();
          final String className = this.doSwitch(_classRef);
          final String nClassName = this.normalizeString(className);
          String _lowerCase = className.toLowerCase();
          char _charAt = _lowerCase.charAt(0);
          final String nameParam = (Character.valueOf(_charAt) + "Name");
          if ((statmt instanceof ExportDef)) {
            EList<ProvisionDef> _provisionDefs = ((ExportDef)statmt).getProvisionDefs();
            for (final ProvisionDef providerDef : _provisionDefs) {
              {
                MultipleClassRef _targetsDef = providerDef.getTargetsDef();
                EList<PathNameCS> _classNames = _targetsDef.getClassNames();
                PathNameCS _get = _classNames.get(0);
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
  
  private String provideUnqualifiedEnvMethods(final Provider provider) {
    String _xblockexpression = null;
    {
      final List<ProvisionDef> provisionDefs = CollectionLiterals.<ProvisionDef>newArrayList();
      EList<ProviderStmnt> _statements = provider.getStatements();
      Iterable<ScopeDef> _filter = Iterables.<ScopeDef>filter(_statements, ScopeDef.class);
      for (final ScopeDef statmnt : _filter) {
        EList<ProvisionDef> _provisionDefs = statmnt.getProvisionDefs();
        provisionDefs.addAll(_provisionDefs);
      }
      final StringBuilder sb = new StringBuilder();
      PathNameCS _classRef = provider.getClassRef();
      final String scopingClassName = this.doSwitch(_classRef);
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
      _builder.append("   ");
      String _provideScopeContributionsQuery = this.provideScopeContributionsQuery(scopedClassName, featureNames, allChildrenName);
      _builder.append(_provideScopeContributionsQuery, "   ");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String provideExportedEnvMethods(final Provider provider) {
    String _xblockexpression = null;
    {
      final List<ProvisionDef> provisionDefs = CollectionLiterals.<ProvisionDef>newArrayList();
      EList<ProviderStmnt> _statements = provider.getStatements();
      Iterable<ExportDef> _filter = Iterables.<ExportDef>filter(_statements, ExportDef.class);
      for (final ExportDef statmnt : _filter) {
        EList<ProvisionDef> _provisionDefs = statmnt.getProvisionDefs();
        provisionDefs.addAll(_provisionDefs);
      }
      final StringBuilder sb = new StringBuilder();
      PathNameCS _classRef = provider.getClassRef();
      final String exportingClassName = this.doSwitch(_classRef);
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
      _builder.append("   ");
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
      _builder_1.append("   ");
      EList<ProvisionDef> _provisionDefs = object.getProvisionDefs();
      String _provideProvisionDefsContribution = this.provideProvisionDefsContribution(_provisionDefs, scopedClassName);
      _builder_1.append(_provideProvisionDefsContribution, "   ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   ");
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
          MultipleClassRef _targetsDef = provisionDef.getTargetsDef();
          EList<PathNameCS> _classNames = _targetsDef.getClassNames();
          final Function1<PathNameCS, String> _function = (PathNameCS x) -> {
            return this.doSwitch(x);
          };
          List<String> _map = ListExtensions.<PathNameCS, String>map(_classNames, _function);
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
    _builder.append("   ");
    EList<ProvisionDef> _provisionDefs = object.getProvisionDefs();
    String _provideProvisionDefsContribution = this.provideProvisionDefsContribution(_provisionDefs, exportedClassName);
    _builder.append(_provideProvisionDefsContribution, "   ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String provideExporterLookupMethod(final Provider provider) {
    String _xblockexpression = null;
    {
      EList<ProviderStmnt> _statements = provider.getStatements();
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
              MultipleClassRef _targetsDef = provisionDef.getTargetsDef();
              EList<PathNameCS> _classNames = _targetsDef.getClassNames();
              PathNameCS _get = _classNames.get(0);
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
      MultipleClassRef _targetsDef = provisionDef.getTargetsDef();
      EList<PathNameCS> _classNames = _targetsDef.getClassNames();
      for (final PathNameCS targetClass : _classNames) {
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
