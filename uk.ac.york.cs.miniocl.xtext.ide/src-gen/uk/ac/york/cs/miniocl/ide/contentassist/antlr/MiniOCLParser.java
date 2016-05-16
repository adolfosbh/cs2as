/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import uk.ac.york.cs.miniocl.ide.contentassist.antlr.internal.InternalMiniOCLParser;
import uk.ac.york.cs.miniocl.services.MiniOCLGrammarAccess;

public class MiniOCLParser extends AbstractContentAssistParser {

	@Inject
	private MiniOCLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMiniOCLParser createParser() {
		InternalMiniOCLParser result = new InternalMiniOCLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRootCSAccess().getAlternatives(), "rule__RootCS__Alternatives");
					put(grammarAccess.getPackageCSAccess().getAlternatives_3(), "rule__PackageCS__Alternatives_3");
					put(grammarAccess.getClassCSAccess().getAlternatives_4(), "rule__ClassCS__Alternatives_4");
					put(grammarAccess.getLogicExpCSAccess().getOpAlternatives_1_1_0(), "rule__LogicExpCS__OpAlternatives_1_1_0");
					put(grammarAccess.getCallExpCSAccess().getOpAlternatives_1_1_0(), "rule__CallExpCS__OpAlternatives_1_1_0");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives(), "rule__PrimaryExpCS__Alternatives");
					put(grammarAccess.getLiteralExpCSAccess().getAlternatives(), "rule__LiteralExpCS__Alternatives");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives_1(), "rule__BooleanLiteralExpCS__Alternatives_1");
					put(grammarAccess.getPackageCSAccess().getGroup(), "rule__PackageCS__Group__0");
					put(grammarAccess.getClassCSAccess().getGroup(), "rule__ClassCS__Group__0");
					put(grammarAccess.getClassCSAccess().getGroup_2(), "rule__ClassCS__Group_2__0");
					put(grammarAccess.getPropertyCSAccess().getGroup(), "rule__PropertyCS__Group__0");
					put(grammarAccess.getOperationCSAccess().getGroup(), "rule__OperationCS__Group__0");
					put(grammarAccess.getOperationCSAccess().getGroup_3(), "rule__OperationCS__Group_3__0");
					put(grammarAccess.getOperationCSAccess().getGroup_3_1(), "rule__OperationCS__Group_3_1__0");
					put(grammarAccess.getParameterCSAccess().getGroup(), "rule__ParameterCS__Group__0");
					put(grammarAccess.getConstraintCSAccess().getGroup(), "rule__ConstraintCS__Group__0");
					put(grammarAccess.getInvariantCSAccess().getGroup(), "rule__InvariantCS__Group__0");
					put(grammarAccess.getLogicExpCSAccess().getGroup(), "rule__LogicExpCS__Group__0");
					put(grammarAccess.getLogicExpCSAccess().getGroup_1(), "rule__LogicExpCS__Group_1__0");
					put(grammarAccess.getCallExpCSAccess().getGroup(), "rule__CallExpCS__Group__0");
					put(grammarAccess.getCallExpCSAccess().getGroup_1(), "rule__CallExpCS__Group_1__0");
					put(grammarAccess.getNameExpCSAccess().getGroup(), "rule__NameExpCS__Group__0");
					put(grammarAccess.getRoundedBracketClauseCSAccess().getGroup(), "rule__RoundedBracketClauseCS__Group__0");
					put(grammarAccess.getRoundedBracketClauseCSAccess().getGroup_2(), "rule__RoundedBracketClauseCS__Group_2__0");
					put(grammarAccess.getRoundedBracketClauseCSAccess().getGroup_2_1(), "rule__RoundedBracketClauseCS__Group_2_1__0");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getGroup(), "rule__BooleanLiteralExpCS__Group__0");
					put(grammarAccess.getPathNameCSAccess().getGroup(), "rule__PathNameCS__Group__0");
					put(grammarAccess.getPathNameCSAccess().getGroup_1(), "rule__PathNameCS__Group_1__0");
					put(grammarAccess.getRootCSAccess().getPackagesAssignment_0(), "rule__RootCS__PackagesAssignment_0");
					put(grammarAccess.getRootCSAccess().getContraintsAssignment_1(), "rule__RootCS__ContraintsAssignment_1");
					put(grammarAccess.getPackageCSAccess().getNameAssignment_1(), "rule__PackageCS__NameAssignment_1");
					put(grammarAccess.getPackageCSAccess().getPackagesAssignment_3_0(), "rule__PackageCS__PackagesAssignment_3_0");
					put(grammarAccess.getPackageCSAccess().getClassesAssignment_3_1(), "rule__PackageCS__ClassesAssignment_3_1");
					put(grammarAccess.getClassCSAccess().getNameAssignment_1(), "rule__ClassCS__NameAssignment_1");
					put(grammarAccess.getClassCSAccess().getExtendsAssignment_2_1(), "rule__ClassCS__ExtendsAssignment_2_1");
					put(grammarAccess.getClassCSAccess().getPropertiesAssignment_4_0(), "rule__ClassCS__PropertiesAssignment_4_0");
					put(grammarAccess.getClassCSAccess().getOperationsAssignment_4_1(), "rule__ClassCS__OperationsAssignment_4_1");
					put(grammarAccess.getPropertyCSAccess().getNameAssignment_1(), "rule__PropertyCS__NameAssignment_1");
					put(grammarAccess.getPropertyCSAccess().getTypeRefAssignment_3(), "rule__PropertyCS__TypeRefAssignment_3");
					put(grammarAccess.getOperationCSAccess().getNameAssignment_1(), "rule__OperationCS__NameAssignment_1");
					put(grammarAccess.getOperationCSAccess().getParamsAssignment_3_0(), "rule__OperationCS__ParamsAssignment_3_0");
					put(grammarAccess.getOperationCSAccess().getParamsAssignment_3_1_1(), "rule__OperationCS__ParamsAssignment_3_1_1");
					put(grammarAccess.getOperationCSAccess().getResultRefAssignment_6(), "rule__OperationCS__ResultRefAssignment_6");
					put(grammarAccess.getOperationCSAccess().getBodyAssignment_8(), "rule__OperationCS__BodyAssignment_8");
					put(grammarAccess.getParameterCSAccess().getNameAssignment_0(), "rule__ParameterCS__NameAssignment_0");
					put(grammarAccess.getParameterCSAccess().getTypeRefAssignment_2(), "rule__ParameterCS__TypeRefAssignment_2");
					put(grammarAccess.getConstraintCSAccess().getTypeRefAssignment_1(), "rule__ConstraintCS__TypeRefAssignment_1");
					put(grammarAccess.getConstraintCSAccess().getInvariantsAssignment_3(), "rule__ConstraintCS__InvariantsAssignment_3");
					put(grammarAccess.getInvariantCSAccess().getExpAssignment_2(), "rule__InvariantCS__ExpAssignment_2");
					put(grammarAccess.getLogicExpCSAccess().getOpAssignment_1_1(), "rule__LogicExpCS__OpAssignment_1_1");
					put(grammarAccess.getLogicExpCSAccess().getRightAssignment_1_2(), "rule__LogicExpCS__RightAssignment_1_2");
					put(grammarAccess.getCallExpCSAccess().getOpAssignment_1_1(), "rule__CallExpCS__OpAssignment_1_1");
					put(grammarAccess.getCallExpCSAccess().getNameExpAssignment_1_2(), "rule__CallExpCS__NameExpAssignment_1_2");
					put(grammarAccess.getNameExpCSAccess().getExpNameAssignment_0(), "rule__NameExpCS__ExpNameAssignment_0");
					put(grammarAccess.getNameExpCSAccess().getRoundedBracketsAssignment_1(), "rule__NameExpCS__RoundedBracketsAssignment_1");
					put(grammarAccess.getNameExpCSAccess().getCallExpAssignment_2(), "rule__NameExpCS__CallExpAssignment_2");
					put(grammarAccess.getRoundedBracketClauseCSAccess().getArgsAssignment_2_0(), "rule__RoundedBracketClauseCS__ArgsAssignment_2_0");
					put(grammarAccess.getRoundedBracketClauseCSAccess().getArgsAssignment_2_1_1(), "rule__RoundedBracketClauseCS__ArgsAssignment_2_1_1");
					put(grammarAccess.getIntLiteralExpCSAccess().getIntSymbolAssignment(), "rule__IntLiteralExpCS__IntSymbolAssignment");
					put(grammarAccess.getStringLiteralExpCSAccess().getStringSymbolAssignment(), "rule__StringLiteralExpCS__StringSymbolAssignment");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getBoolSymbolAssignment_1_0(), "rule__BooleanLiteralExpCS__BoolSymbolAssignment_1_0");
					put(grammarAccess.getPathNameCSAccess().getPathAssignment_0(), "rule__PathNameCS__PathAssignment_0");
					put(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1(), "rule__PathNameCS__PathAssignment_1_1");
					put(grammarAccess.getPathElementCSAccess().getPathNameAssignment(), "rule__PathElementCS__PathNameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMiniOCLParser typedParser = (InternalMiniOCLParser) parser;
			typedParser.entryRuleRootCS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MiniOCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MiniOCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
