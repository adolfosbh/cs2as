package uk.ac.york.cs.cs2as.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.PathElementCS;
import org.eclipse.ocl.xtext.basecs.PathElementWithURICS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.util.BaseCSSwitch;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BaseCSToStringVisitor extends BaseCSSwitch<String> {
  @Override
  public String defaultCase(final EObject object) {
    Class<? extends BaseCSToStringVisitor> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + " doesn\'t implement ");
    EClass _eClass = object.eClass();
    String _name_1 = _eClass.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + " case");
    throw new IllegalStateException(_plus_2);
  }
  
  @Override
  public String caseImportCS(final ImportCS object) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      String _name = object.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        String _name_1 = object.getName();
        _builder.append(_name_1, " ");
        _builder.append(" :");
        _xifexpression = _builder.toString();
      } else {
        _xifexpression = "";
      }
      String importName = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import ");
      _builder_1.append(importName, "");
      _builder_1.append(" ");
      PathNameCS _ownedPathName = object.getOwnedPathName();
      String _doSwitch = this.doSwitch(_ownedPathName);
      _builder_1.append(_doSwitch, "");
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String casePathNameCS(final PathNameCS object) {
    String _xblockexpression = null;
    {
      EList<PathElementCS> _ownedPathElements = object.getOwnedPathElements();
      PathElementCS firstPathElmnt = _ownedPathElements.get(0);
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<PathElementCS> _ownedPathElements_1 = object.getOwnedPathElements();
        for(final PathElementCS pElement : _ownedPathElements_1) {
          {
            boolean _notEquals = (!Objects.equal(pElement, firstPathElmnt));
            if (_notEquals) {
              _builder.append("::");
            }
          }
          String _doSwitch = this.doSwitch(pElement);
          _builder.append(_doSwitch, "");
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String casePathElementCS(final PathElementCS object) {
    return object.getName();
  }
  
  @Override
  public String casePathElementWithURICS(final PathElementWithURICS object) {
    return object.getUri();
  }
}
