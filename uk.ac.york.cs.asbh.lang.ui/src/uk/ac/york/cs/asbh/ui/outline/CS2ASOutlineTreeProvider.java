package uk.ac.york.cs.asbh.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

import uk.ac.york.cs.asbh.lang.cs2as.source.SElement;

// TODO This should be auto generated in the src-gen folder
public class CS2ASOutlineTreeProvider extends DefaultOutlineTreeProvider {
		
	protected void _createNode(IOutlineNode parentNode, SElement csElement) {
		super._createNode(parentNode, csElement.getAst());
	}

}
