package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.AbstractNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.CurlyBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.IfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InvalidLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS;
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NullLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PrefixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.RoundBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.SelfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.SquareBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.util.EssentialOCLCSSwitch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS;
import uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS;
import uk.ac.york.cs.cs2as.generator.BaseCSToStringVisitor;

@SuppressWarnings("all")
public class EssentialOCLCSToStringVisitor extends EssentialOCLCSSwitch<String> {
  private BaseCSToStringVisitor baseVisitor = new BaseCSToStringVisitor();
  
  @Override
  public String defaultCase(final EObject object) {
    String _xifexpression = null;
    if ((object instanceof TraceExpCS)) {
      _xifexpression = this.caseTraceExp(((TraceExpCS)object));
    } else {
      String _xifexpression_1 = null;
      if ((object instanceof LookupExpCS)) {
        _xifexpression_1 = this.caseLookupExp(((LookupExpCS)object));
      } else {
        String _xifexpression_2 = null;
        if ((object instanceof ParameterCS)) {
          _xifexpression_2 = this.caseParameterCS(((ParameterCS)object));
        } else {
          _xifexpression_2 = this.baseVisitor.doSwitch(object);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public String caseInfixExpCS(final InfixExpCS object) {
    String _xblockexpression = null;
    {
      final String opName = object.getName();
      String _xifexpression = null;
      boolean _or = false;
      boolean _equals = ".".equals(opName);
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = "->".equals(opName);
        _or = _equals_1;
      }
      if (_or) {
        _xifexpression = opName;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        String _name = object.getName();
        _builder.append(_name, " ");
        _builder.append(" ");
        _xifexpression = _builder.toString();
      }
      final String op = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      ExpCS _ownedLeft = object.getOwnedLeft();
      String _doSwitch = this.doSwitch(_ownedLeft);
      _builder_1.append(_doSwitch, "");
      _builder_1.append(op, "");
      ExpCS _ownedRight = object.getOwnedRight();
      String _doSwitch_1 = this.doSwitch(_ownedRight);
      _builder_1.append(_doSwitch_1, "");
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String casePrefixExpCS(final PrefixExpCS object) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = object.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    ExpCS _ownedRight = object.getOwnedRight();
    String _doSwitch = this.doSwitch(_ownedRight);
    _builder.append(_doSwitch, "");
    return _builder.toString();
  }
  
  @Override
  public String caseNameExpCS(final NameExpCS object) {
    String _xblockexpression = null;
    {
      final RoundBracketedClauseCS rBracket = object.getOwnedRoundBracketedClause();
      final boolean hasRBracket = (!Objects.equal(rBracket, null));
      final CurlyBracketedClauseCS cBracket = object.getOwnedCurlyBracketedClause();
      final boolean hasCBracket = (!Objects.equal(cBracket, null));
      final EList<SquareBracketedClauseCS> sBrackets = object.getOwnedSquareBracketedClauses();
      final boolean hasSBrackets = (!Objects.equal(sBrackets, null));
      StringConcatenation _builder = new StringConcatenation();
      PathNameCS _ownedPathName = object.getOwnedPathName();
      _builder.append(_ownedPathName, "");
      {
        if (hasRBracket) {
          String _doSwitch = this.doSwitch(rBracket);
          _builder.append(_doSwitch, "");
        } else {
          {
            if (hasCBracket) {
              String _doSwitch_1 = this.doSwitch(cBracket);
              _builder.append(_doSwitch_1, "");
            } else {
              {
                if (hasSBrackets) {
                  {
                    for(final SquareBracketedClauseCS s : sBrackets) {
                      String _doSwitch_2 = this.doSwitch(s);
                      _builder.append(_doSwitch_2, "");
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseNestedExpCS(final NestedExpCS object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ExpCS _ownedExpression = object.getOwnedExpression();
    String _doSwitch = this.doSwitch(_ownedExpression);
    _builder.append(_doSwitch, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseIfExpCS(final IfExpCS object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ");
    ExpCS _ownedCondition = object.getOwnedCondition();
    String _doSwitch = this.doSwitch(_ownedCondition);
    _builder.append(_doSwitch, "");
    _builder.append(" then ");
    ExpCS _ownedThenExpression = object.getOwnedThenExpression();
    String _doSwitch_1 = this.doSwitch(_ownedThenExpression);
    _builder.append(_doSwitch_1, "");
    _builder.append(" else ");
    ExpCS _ownedElseExpression = object.getOwnedElseExpression();
    String _doSwitch_2 = this.doSwitch(_ownedElseExpression);
    _builder.append(_doSwitch_2, "");
    _builder.append(" endif");
    return _builder.toString();
  }
  
  @Override
  public String caseCurlyBracketedClauseCS(final CurlyBracketedClauseCS object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    return _builder.toString();
  }
  
  @Override
  public String caseRoundBracketedClauseCS(final RoundBracketedClauseCS object) {
    String _xblockexpression = null;
    {
      AbstractNameExpCS _owningNameExp = object.getOwningNameExp();
      final NameExpCS nameExp = ((NameExpCS) _owningNameExp);
      String _xifexpression = null;
      PathNameCS _ownedPathName = nameExp.getOwnedPathName();
      String _string = _ownedPathName.toString();
      boolean _contains = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("exists", "forAll", "collect")).contains(_string);
      if (_contains) {
        _xifexpression = " | ";
      } else {
        _xifexpression = ", ";
      }
      final String sep = _xifexpression;
      EList<NavigatingArgCS> args = object.getOwnedArguments();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      {
        for(final NavigatingArgCS arg : args) {
          {
            int _indexOf = args.indexOf(arg);
            boolean _notEquals = (_indexOf != 0);
            if (_notEquals) {
              _builder.append(sep, "");
            }
          }
          String _doSwitch = this.doSwitch(arg);
          _builder.append(_doSwitch, "");
        }
      }
      _builder.append(")");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseNavigatingArgCS(final NavigatingArgCS object) {
    String _xblockexpression = null;
    {
      ExpCS _ownedNameExpression = object.getOwnedNameExpression();
      String _doSwitch = null;
      if (_ownedNameExpression!=null) {
        _doSwitch=this.doSwitch(_ownedNameExpression);
      }
      final String name = _doSwitch;
      TypedRefCS _ownedType = object.getOwnedType();
      String _doSwitch_1 = null;
      if (_ownedType!=null) {
        _doSwitch_1=this.doSwitch(_ownedType);
      }
      final String optType = _doSwitch_1;
      ExpCS _ownedInitExpression = object.getOwnedInitExpression();
      String _doSwitch_2 = null;
      if (_ownedInitExpression!=null) {
        _doSwitch_2=this.doSwitch(_ownedInitExpression);
      }
      final String optInitExp = _doSwitch_2;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(name, "");
      {
        boolean _notEquals = (!Objects.equal(optType, null));
        if (_notEquals) {
          _builder.append(" ");
          _builder.append(optType, "");
        }
      }
      {
        boolean _notEquals_1 = (!Objects.equal(optInitExp, null));
        if (_notEquals_1) {
          _builder.append(" = ");
          _builder.append(optInitExp, "");
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseNullLiteralExpCS(final NullLiteralExpCS object) {
    return "null";
  }
  
  @Override
  public String caseInvalidLiteralExpCS(final InvalidLiteralExpCS object) {
    return "invalid";
  }
  
  @Override
  public String caseStringLiteralExpCS(final StringLiteralExpCS object) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<String> _segments = object.getSegments();
        for(final String segment : _segments) {
          _builder.append(" ");
          _builder.append(segment, "");
        }
      }
      final String allSegments = _builder.toString();
      String _xifexpression = null;
      String _trim = allSegments.trim();
      boolean _startsWith = _trim.startsWith("\'");
      if (_startsWith) {
        _xifexpression = allSegments;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\'");
        _builder_1.append(allSegments, "");
        _builder_1.append("\' ");
        _xifexpression = _builder_1.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseTypeNameExpCS(final TypeNameExpCS object) {
    PathNameCS _ownedPathName = object.getOwnedPathName();
    return this.doSwitch(_ownedPathName);
  }
  
  @Override
  public String caseCollectionTypeCS(final CollectionTypeCS object) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = object.getName();
    _builder.append(_name, "");
    _builder.append("(");
    TypedRefCS _ownedType = object.getOwnedType();
    String _doSwitch = this.doSwitch(_ownedType);
    _builder.append(_doSwitch, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseSelfExpCS(final SelfExpCS object) {
    return "self";
  }
  
  public String caseParameterCS(final ParameterCS object) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = object.getName();
    _builder.append(_name, "");
    _builder.append(" : ");
    TypedRefCS _ownedType = object.getOwnedType();
    String _doSwitch = this.doSwitch(_ownedType);
    _builder.append(_doSwitch, "");
    return _builder.toString();
  }
  
  @Override
  public String caseLetExpCS(final LetExpCS object) {
    String _xblockexpression = null;
    {
      final EList<LetVariableCS> letVars = object.getOwnedVariables();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("let ");
      {
        for(final LetVariableCS letVar : letVars) {
          {
            int _indexOf = letVars.indexOf(letVar);
            boolean _greaterThan = (_indexOf > 0);
            if (_greaterThan) {
              _builder.append(", ");
            }
          }
          String _doSwitch = this.doSwitch(letVar);
          _builder.append(_doSwitch, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("in ");
      ExpCS _ownedInExpression = object.getOwnedInExpression();
      String _doSwitch_1 = this.doSwitch(_ownedInExpression);
      _builder.append(_doSwitch_1, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseVariableCS(final VariableCS object) {
    String _xblockexpression = null;
    {
      final TypedRefCS type = object.getOwnedType();
      final ExpCS init = object.getOwnedInitExpression();
      StringConcatenation _builder = new StringConcatenation();
      String _name = object.getName();
      _builder.append(_name, "");
      _builder.append(" ");
      {
        boolean _notEquals = (!Objects.equal(type, null));
        if (_notEquals) {
          _builder.append(" : ");
          String _doSwitch = this.doSwitch(type);
          _builder.append(_doSwitch, "");
        }
      }
      {
        boolean _notEquals_1 = (!Objects.equal(init, null));
        if (_notEquals_1) {
          _builder.append(" = ");
          String _doSwitch_1 = this.doSwitch(init);
          _builder.append(_doSwitch_1, "");
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String caseTraceExp(final TraceExpCS object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ast()");
    return _builder.toString();
  }
  
  public String caseLookupExp(final LookupExpCS object) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _isIsExported = object.isIsExported();
      if (_isIsExported) {
        _xifexpression = "From";
      } else {
        _xifexpression = "";
      }
      final String lookupOpSuffix = _xifexpression;
      final EList<ExpCS> args = object.getArgs();
      final ExpCS firstArg = args.get(0);
      final ArrayList<ExpCS> remainingArgs = CollectionLiterals.<ExpCS>newArrayList();
      for (int i = 1; (i < args.size()); i++) {
        ExpCS _get = args.get(i);
        remainingArgs.add(_get);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("lookup");
      String _doSwitch = this.doSwitch(firstArg);
      _builder.append(_doSwitch, "");
      _builder.append(lookupOpSuffix, "");
      _builder.append("(");
      {
        for(final ExpCS arg : remainingArgs) {
          {
            int _indexOf = args.indexOf(arg);
            boolean _greaterThan = (_indexOf > 1);
            if (_greaterThan) {
              _builder.append(", ");
            }
          }
          String _doSwitch_1 = this.doSwitch(arg);
          _builder.append(_doSwitch_1, "");
        }
      }
      _builder.append(")");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
