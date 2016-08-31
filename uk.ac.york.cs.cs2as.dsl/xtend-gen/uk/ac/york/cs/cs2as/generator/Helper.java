package uk.ac.york.cs.cs2as.generator;

import java.util.Collections;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Helper {
  public static String scapeKeywords(final String string) {
    String _xifexpression = null;
    boolean _contains = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("body", "context")).contains(string);
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("_");
      _builder.append(string, "");
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = string;
    }
    return _xifexpression;
  }
}
