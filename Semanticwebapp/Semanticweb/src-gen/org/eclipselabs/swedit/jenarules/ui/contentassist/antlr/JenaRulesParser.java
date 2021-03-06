/*
* generated by Xtext
*/
package org.eclipselabs.swedit.jenarules.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.swedit.jenarules.services.JenaRulesGrammarAccess;

public class JenaRulesParser extends AbstractContentAssistParser {
	
	@Inject
	private JenaRulesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal.InternalJenaRulesParser createParser() {
		org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal.InternalJenaRulesParser result = new org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal.InternalJenaRulesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRuleAccess().getAlternatives(), "rule__Rule__Alternatives");
					put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getRDFTagAccess().getAlternatives(), "rule__RDFTag__Alternatives");
					put(grammarAccess.getJenaRuleDocumentAccess().getGroup(), "rule__JenaRuleDocument__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_1(), "rule__Rule__Group_1__0");
					put(grammarAccess.getRuleAccess().getGroup_2(), "rule__Rule__Group_2__0");
					put(grammarAccess.getPrefixAccess().getGroup(), "rule__Prefix__Group__0");
					put(grammarAccess.getForwardRuleAccess().getGroup(), "rule__ForwardRule__Group__0");
					put(grammarAccess.getForwardRuleAccess().getGroup_1(), "rule__ForwardRule__Group_1__0");
					put(grammarAccess.getForwardRuleAccess().getGroup_4(), "rule__ForwardRule__Group_4__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
					put(grammarAccess.getQNameAccess().getGroup(), "rule__QName__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getIntegerValueAccess().getGroup(), "rule__IntegerValue__Group__0");
					put(grammarAccess.getTypeTagAccess().getGroup(), "rule__TypeTag__Group__0");
					put(grammarAccess.getLangTagAccess().getGroup(), "rule__LangTag__Group__0");
					put(grammarAccess.getJenaRuleDocumentAccess().getPrefixesAssignment_0(), "rule__JenaRuleDocument__PrefixesAssignment_0");
					put(grammarAccess.getJenaRuleDocumentAccess().getRulesAssignment_1(), "rule__JenaRuleDocument__RulesAssignment_1");
					put(grammarAccess.getRuleAccess().getBareRuleAssignment_0(), "rule__Rule__BareRuleAssignment_0");
					put(grammarAccess.getRuleAccess().getBareRuleAssignment_1_1(), "rule__Rule__BareRuleAssignment_1_1");
					put(grammarAccess.getRuleAccess().getRuleNameAssignment_2_1(), "rule__Rule__RuleNameAssignment_2_1");
					put(grammarAccess.getRuleAccess().getBareRuleAssignment_2_3(), "rule__Rule__BareRuleAssignment_2_3");
					put(grammarAccess.getPrefixAccess().getNameAssignment_1(), "rule__Prefix__NameAssignment_1");
					put(grammarAccess.getPrefixAccess().getUriAssignment_3(), "rule__Prefix__UriAssignment_3");
					put(grammarAccess.getForwardRuleAccess().getLeftTermsAssignment_0(), "rule__ForwardRule__LeftTermsAssignment_0");
					put(grammarAccess.getForwardRuleAccess().getLeftTermsAssignment_1_1(), "rule__ForwardRule__LeftTermsAssignment_1_1");
					put(grammarAccess.getForwardRuleAccess().getRightTermsAssignment_3(), "rule__ForwardRule__RightTermsAssignment_3");
					put(grammarAccess.getForwardRuleAccess().getRightTermsAssignment_4_1(), "rule__ForwardRule__RightTermsAssignment_4_1");
					put(grammarAccess.getTermAccess().getSubjectAssignment_1(), "rule__Term__SubjectAssignment_1");
					put(grammarAccess.getTermAccess().getPredicateAssignment_2(), "rule__Term__PredicateAssignment_2");
					put(grammarAccess.getTermAccess().getObjectAssignment_3(), "rule__Term__ObjectAssignment_3");
					put(grammarAccess.getFunctionAccess().getNameAssignment_0(), "rule__Function__NameAssignment_0");
					put(grammarAccess.getFunctionAccess().getNodesAssignment_2(), "rule__Function__NodesAssignment_2");
					put(grammarAccess.getFunctionAccess().getNodesAssignment_3_1(), "rule__Function__NodesAssignment_3_1");
					put(grammarAccess.getURIRefAccess().getUriAssignment(), "rule__URIRef__UriAssignment");
					put(grammarAccess.getQNameAccess().getPrefixAssignment_0(), "rule__QName__PrefixAssignment_0");
					put(grammarAccess.getQNameAccess().getNameAssignment_2(), "rule__QName__NameAssignment_2");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment_0(), "rule__StringValue__ValueAssignment_0");
					put(grammarAccess.getStringValueAccess().getTagAssignment_1(), "rule__StringValue__TagAssignment_1");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment_0(), "rule__IntegerValue__ValueAssignment_0");
					put(grammarAccess.getIntegerValueAccess().getTagAssignment_1(), "rule__IntegerValue__TagAssignment_1");
					put(grammarAccess.getTypeTagAccess().getTypeAssignment_1(), "rule__TypeTag__TypeAssignment_1");
					put(grammarAccess.getLangTagAccess().getLangAssignment_1(), "rule__LangTag__LangAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal.InternalJenaRulesParser typedParser = (org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal.InternalJenaRulesParser) parser;
			typedParser.entryRuleJenaRuleDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JenaRulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JenaRulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
