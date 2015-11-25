package uk.ac.yor.cs.asbh.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.yor.cs.asbh.services.ASBHLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASBHLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'X'", "'Z'", "'Y1'", "'Y2'", "'.'", "'isA1'", "'isA2'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalASBHLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalASBHLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalASBHLangParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g"; }


     
     	private ASBHLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ASBHLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRoot"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:61:1: ( ruleRoot EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:74:1: ( ( rule__Root__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:76:1: ( rule__Root__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:76:2: rule__Root__Group__0
            {
            pushFollow(FOLLOW_rule__Root__Group__0_in_ruleRoot94);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleY"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:88:1: entryRuleY : ruleY EOF ;
    public final void entryRuleY() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:89:1: ( ruleY EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:90:1: ruleY EOF
            {
             before(grammarAccess.getYRule()); 
            pushFollow(FOLLOW_ruleY_in_entryRuleY121);
            ruleY();

            state._fsp--;

             after(grammarAccess.getYRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleY128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:97:1: ruleY : ( ( rule__Y__Alternatives ) ) ;
    public final void ruleY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:101:2: ( ( ( rule__Y__Alternatives ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:102:1: ( ( rule__Y__Alternatives ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:102:1: ( ( rule__Y__Alternatives ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:103:1: ( rule__Y__Alternatives )
            {
             before(grammarAccess.getYAccess().getAlternatives()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:104:1: ( rule__Y__Alternatives )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:104:2: rule__Y__Alternatives
            {
            pushFollow(FOLLOW_rule__Y__Alternatives_in_ruleY154);
            rule__Y__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleX"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:116:1: entryRuleX : ruleX EOF ;
    public final void entryRuleX() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:117:1: ( ruleX EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:118:1: ruleX EOF
            {
             before(grammarAccess.getXRule()); 
            pushFollow(FOLLOW_ruleX_in_entryRuleX181);
            ruleX();

            state._fsp--;

             after(grammarAccess.getXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleX188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:125:1: ruleX : ( ( rule__X__Group__0 ) ) ;
    public final void ruleX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:129:2: ( ( ( rule__X__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:130:1: ( ( rule__X__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:130:1: ( ( rule__X__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:131:1: ( rule__X__Group__0 )
            {
             before(grammarAccess.getXAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:132:1: ( rule__X__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:132:2: rule__X__Group__0
            {
            pushFollow(FOLLOW_rule__X__Group__0_in_ruleX214);
            rule__X__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleZ"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:144:1: entryRuleZ : ruleZ EOF ;
    public final void entryRuleZ() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:145:1: ( ruleZ EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:146:1: ruleZ EOF
            {
             before(grammarAccess.getZRule()); 
            pushFollow(FOLLOW_ruleZ_in_entryRuleZ241);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getZRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZ248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZ"


    // $ANTLR start "ruleZ"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:153:1: ruleZ : ( ( rule__Z__Group__0 ) ) ;
    public final void ruleZ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:157:2: ( ( ( rule__Z__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:158:1: ( ( rule__Z__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:158:1: ( ( rule__Z__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:159:1: ( rule__Z__Group__0 )
            {
             before(grammarAccess.getZAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:160:1: ( rule__Z__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:160:2: rule__Z__Group__0
            {
            pushFollow(FOLLOW_rule__Z__Group__0_in_ruleZ274);
            rule__Z__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZ"


    // $ANTLR start "entryRuleY1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:172:1: entryRuleY1 : ruleY1 EOF ;
    public final void entryRuleY1() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:173:1: ( ruleY1 EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:174:1: ruleY1 EOF
            {
             before(grammarAccess.getY1Rule()); 
            pushFollow(FOLLOW_ruleY1_in_entryRuleY1301);
            ruleY1();

            state._fsp--;

             after(grammarAccess.getY1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleY1308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY1"


    // $ANTLR start "ruleY1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:181:1: ruleY1 : ( ( rule__Y1__Group__0 ) ) ;
    public final void ruleY1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:185:2: ( ( ( rule__Y1__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:186:1: ( ( rule__Y1__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:186:1: ( ( rule__Y1__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:187:1: ( rule__Y1__Group__0 )
            {
             before(grammarAccess.getY1Access().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:188:1: ( rule__Y1__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:188:2: rule__Y1__Group__0
            {
            pushFollow(FOLLOW_rule__Y1__Group__0_in_ruleY1334);
            rule__Y1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getY1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY1"


    // $ANTLR start "entryRuleY2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:200:1: entryRuleY2 : ruleY2 EOF ;
    public final void entryRuleY2() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:201:1: ( ruleY2 EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:202:1: ruleY2 EOF
            {
             before(grammarAccess.getY2Rule()); 
            pushFollow(FOLLOW_ruleY2_in_entryRuleY2361);
            ruleY2();

            state._fsp--;

             after(grammarAccess.getY2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleY2368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY2"


    // $ANTLR start "ruleY2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:209:1: ruleY2 : ( ( rule__Y2__Group__0 ) ) ;
    public final void ruleY2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:213:2: ( ( ( rule__Y2__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:214:1: ( ( rule__Y2__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:214:1: ( ( rule__Y2__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:215:1: ( rule__Y2__Group__0 )
            {
             before(grammarAccess.getY2Access().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:216:1: ( rule__Y2__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:216:2: rule__Y2__Group__0
            {
            pushFollow(FOLLOW_rule__Y2__Group__0_in_ruleY2394);
            rule__Y2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getY2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY2"


    // $ANTLR start "entryRulePathNameCS"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:228:1: entryRulePathNameCS : rulePathNameCS EOF ;
    public final void entryRulePathNameCS() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:229:1: ( rulePathNameCS EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:230:1: rulePathNameCS EOF
            {
             before(grammarAccess.getPathNameCSRule()); 
            pushFollow(FOLLOW_rulePathNameCS_in_entryRulePathNameCS421);
            rulePathNameCS();

            state._fsp--;

             after(grammarAccess.getPathNameCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathNameCS428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:237:1: rulePathNameCS : ( ( rule__PathNameCS__Group__0 ) ) ;
    public final void rulePathNameCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:241:2: ( ( ( rule__PathNameCS__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:242:1: ( ( rule__PathNameCS__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:242:1: ( ( rule__PathNameCS__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:243:1: ( rule__PathNameCS__Group__0 )
            {
             before(grammarAccess.getPathNameCSAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:244:1: ( rule__PathNameCS__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:244:2: rule__PathNameCS__Group__0
            {
            pushFollow(FOLLOW_rule__PathNameCS__Group__0_in_rulePathNameCS454);
            rule__PathNameCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathNameCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRulePathElementCS"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:256:1: entryRulePathElementCS : rulePathElementCS EOF ;
    public final void entryRulePathElementCS() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:257:1: ( rulePathElementCS EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:258:1: rulePathElementCS EOF
            {
             before(grammarAccess.getPathElementCSRule()); 
            pushFollow(FOLLOW_rulePathElementCS_in_entryRulePathElementCS481);
            rulePathElementCS();

            state._fsp--;

             after(grammarAccess.getPathElementCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElementCS488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathElementCS"


    // $ANTLR start "rulePathElementCS"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:265:1: rulePathElementCS : ( ( rule__PathElementCS__NameAssignment ) ) ;
    public final void rulePathElementCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:269:2: ( ( ( rule__PathElementCS__NameAssignment ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:270:1: ( ( rule__PathElementCS__NameAssignment ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:270:1: ( ( rule__PathElementCS__NameAssignment ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:271:1: ( rule__PathElementCS__NameAssignment )
            {
             before(grammarAccess.getPathElementCSAccess().getNameAssignment()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:272:1: ( rule__PathElementCS__NameAssignment )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:272:2: rule__PathElementCS__NameAssignment
            {
            pushFollow(FOLLOW_rule__PathElementCS__NameAssignment_in_rulePathElementCS514);
            rule__PathElementCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPathElementCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathElementCS"


    // $ANTLR start "rule__Y__Alternatives"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:284:1: rule__Y__Alternatives : ( ( ruleY1 ) | ( ruleY2 ) );
    public final void rule__Y__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:288:1: ( ( ruleY1 ) | ( ruleY2 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:289:1: ( ruleY1 )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:289:1: ( ruleY1 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:290:1: ruleY1
                    {
                     before(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleY1_in_rule__Y__Alternatives550);
                    ruleY1();

                    state._fsp--;

                     after(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:295:6: ( ruleY2 )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:295:6: ( ruleY2 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:296:1: ruleY2
                    {
                     before(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleY2_in_rule__Y__Alternatives567);
                    ruleY2();

                    state._fsp--;

                     after(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Alternatives"


    // $ANTLR start "rule__X__Alternatives_3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:306:1: rule__X__Alternatives_3 : ( ( ( rule__X__IsA1Assignment_3_0 ) ) | ( ( rule__X__IsA2Assignment_3_1 ) ) );
    public final void rule__X__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:310:1: ( ( ( rule__X__IsA1Assignment_3_0 ) ) | ( ( rule__X__IsA2Assignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:311:1: ( ( rule__X__IsA1Assignment_3_0 ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:311:1: ( ( rule__X__IsA1Assignment_3_0 ) )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:312:1: ( rule__X__IsA1Assignment_3_0 )
                    {
                     before(grammarAccess.getXAccess().getIsA1Assignment_3_0()); 
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:313:1: ( rule__X__IsA1Assignment_3_0 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:313:2: rule__X__IsA1Assignment_3_0
                    {
                    pushFollow(FOLLOW_rule__X__IsA1Assignment_3_0_in_rule__X__Alternatives_3599);
                    rule__X__IsA1Assignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXAccess().getIsA1Assignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:317:6: ( ( rule__X__IsA2Assignment_3_1 ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:317:6: ( ( rule__X__IsA2Assignment_3_1 ) )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:318:1: ( rule__X__IsA2Assignment_3_1 )
                    {
                     before(grammarAccess.getXAccess().getIsA2Assignment_3_1()); 
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:319:1: ( rule__X__IsA2Assignment_3_1 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:319:2: rule__X__IsA2Assignment_3_1
                    {
                    pushFollow(FOLLOW_rule__X__IsA2Assignment_3_1_in_rule__X__Alternatives_3617);
                    rule__X__IsA2Assignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXAccess().getIsA2Assignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Alternatives_3"


    // $ANTLR start "rule__Root__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:330:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:334:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:335:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0648);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0651);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:342:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:346:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:347:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:347:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:348:1: ()
            {
             before(grammarAccess.getRootAccess().getSRootAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:349:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:351:1: 
            {
            }

             after(grammarAccess.getRootAccess().getSRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:361:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:365:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:366:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1709);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__2_in_rule__Root__Group__1712);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:373:1: rule__Root__Group__1__Impl : ( 'Root' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:377:1: ( ( 'Root' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:378:1: ( 'Root' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:378:1: ( 'Root' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:379:1: 'Root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Root__Group__1__Impl740); 
             after(grammarAccess.getRootAccess().getRootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:392:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:396:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:397:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__2771);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__3_in_rule__Root__Group__2774);
            rule__Root__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:404:1: rule__Root__Group__2__Impl : ( '{' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:408:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:409:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:409:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:410:1: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Root__Group__2__Impl802); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:423:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:427:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:428:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_rule__Root__Group__3__Impl_in_rule__Root__Group__3833);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__4_in_rule__Root__Group__3836);
            rule__Root__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:435:1: rule__Root__Group__3__Impl : ( ( rule__Root__OwnedXAssignment_3 )* ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:439:1: ( ( ( rule__Root__OwnedXAssignment_3 )* ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:440:1: ( ( rule__Root__OwnedXAssignment_3 )* )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:440:1: ( ( rule__Root__OwnedXAssignment_3 )* )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:441:1: ( rule__Root__OwnedXAssignment_3 )*
            {
             before(grammarAccess.getRootAccess().getOwnedXAssignment_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:442:1: ( rule__Root__OwnedXAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:442:2: rule__Root__OwnedXAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Root__OwnedXAssignment_3_in_rule__Root__Group__3__Impl863);
            	    rule__Root__OwnedXAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getOwnedXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:452:1: rule__Root__Group__4 : rule__Root__Group__4__Impl ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:456:1: ( rule__Root__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:457:2: rule__Root__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Root__Group__4__Impl_in_rule__Root__Group__4894);
            rule__Root__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:463:1: rule__Root__Group__4__Impl : ( '}' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:467:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:468:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:468:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:469:1: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Root__Group__4__Impl922); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__X__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:492:1: rule__X__Group__0 : rule__X__Group__0__Impl rule__X__Group__1 ;
    public final void rule__X__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:496:1: ( rule__X__Group__0__Impl rule__X__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:497:2: rule__X__Group__0__Impl rule__X__Group__1
            {
            pushFollow(FOLLOW_rule__X__Group__0__Impl_in_rule__X__Group__0963);
            rule__X__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__1_in_rule__X__Group__0966);
            rule__X__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__0"


    // $ANTLR start "rule__X__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:504:1: rule__X__Group__0__Impl : ( () ) ;
    public final void rule__X__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:508:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:509:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:509:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:510:1: ()
            {
             before(grammarAccess.getXAccess().getXAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:511:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:513:1: 
            {
            }

             after(grammarAccess.getXAccess().getXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__0__Impl"


    // $ANTLR start "rule__X__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:523:1: rule__X__Group__1 : rule__X__Group__1__Impl rule__X__Group__2 ;
    public final void rule__X__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:527:1: ( rule__X__Group__1__Impl rule__X__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:528:2: rule__X__Group__1__Impl rule__X__Group__2
            {
            pushFollow(FOLLOW_rule__X__Group__1__Impl_in_rule__X__Group__11024);
            rule__X__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__2_in_rule__X__Group__11027);
            rule__X__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__1"


    // $ANTLR start "rule__X__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:535:1: rule__X__Group__1__Impl : ( 'X' ) ;
    public final void rule__X__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:539:1: ( ( 'X' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:540:1: ( 'X' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:540:1: ( 'X' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:541:1: 'X'
            {
             before(grammarAccess.getXAccess().getXKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__X__Group__1__Impl1055); 
             after(grammarAccess.getXAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__1__Impl"


    // $ANTLR start "rule__X__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:554:1: rule__X__Group__2 : rule__X__Group__2__Impl rule__X__Group__3 ;
    public final void rule__X__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:558:1: ( rule__X__Group__2__Impl rule__X__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:559:2: rule__X__Group__2__Impl rule__X__Group__3
            {
            pushFollow(FOLLOW_rule__X__Group__2__Impl_in_rule__X__Group__21086);
            rule__X__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__3_in_rule__X__Group__21089);
            rule__X__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__2"


    // $ANTLR start "rule__X__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:566:1: rule__X__Group__2__Impl : ( ( rule__X__NameAssignment_2 ) ) ;
    public final void rule__X__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:570:1: ( ( ( rule__X__NameAssignment_2 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:571:1: ( ( rule__X__NameAssignment_2 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:571:1: ( ( rule__X__NameAssignment_2 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:572:1: ( rule__X__NameAssignment_2 )
            {
             before(grammarAccess.getXAccess().getNameAssignment_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:573:1: ( rule__X__NameAssignment_2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:573:2: rule__X__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__X__NameAssignment_2_in_rule__X__Group__2__Impl1116);
            rule__X__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__2__Impl"


    // $ANTLR start "rule__X__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:583:1: rule__X__Group__3 : rule__X__Group__3__Impl rule__X__Group__4 ;
    public final void rule__X__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:587:1: ( rule__X__Group__3__Impl rule__X__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:588:2: rule__X__Group__3__Impl rule__X__Group__4
            {
            pushFollow(FOLLOW_rule__X__Group__3__Impl_in_rule__X__Group__31146);
            rule__X__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__4_in_rule__X__Group__31149);
            rule__X__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__3"


    // $ANTLR start "rule__X__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:595:1: rule__X__Group__3__Impl : ( ( rule__X__Alternatives_3 )? ) ;
    public final void rule__X__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:599:1: ( ( ( rule__X__Alternatives_3 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:600:1: ( ( rule__X__Alternatives_3 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:600:1: ( ( rule__X__Alternatives_3 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:601:1: ( rule__X__Alternatives_3 )?
            {
             before(grammarAccess.getXAccess().getAlternatives_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:602:1: ( rule__X__Alternatives_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:602:2: rule__X__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__X__Alternatives_3_in_rule__X__Group__3__Impl1176);
                    rule__X__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__3__Impl"


    // $ANTLR start "rule__X__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:612:1: rule__X__Group__4 : rule__X__Group__4__Impl rule__X__Group__5 ;
    public final void rule__X__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:616:1: ( rule__X__Group__4__Impl rule__X__Group__5 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:617:2: rule__X__Group__4__Impl rule__X__Group__5
            {
            pushFollow(FOLLOW_rule__X__Group__4__Impl_in_rule__X__Group__41207);
            rule__X__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__5_in_rule__X__Group__41210);
            rule__X__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__4"


    // $ANTLR start "rule__X__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:624:1: rule__X__Group__4__Impl : ( '{' ) ;
    public final void rule__X__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:628:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:629:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:629:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:630:1: '{'
            {
             before(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__X__Group__4__Impl1238); 
             after(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__4__Impl"


    // $ANTLR start "rule__X__Group__5"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:643:1: rule__X__Group__5 : rule__X__Group__5__Impl rule__X__Group__6 ;
    public final void rule__X__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:647:1: ( rule__X__Group__5__Impl rule__X__Group__6 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:648:2: rule__X__Group__5__Impl rule__X__Group__6
            {
            pushFollow(FOLLOW_rule__X__Group__5__Impl_in_rule__X__Group__51269);
            rule__X__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__6_in_rule__X__Group__51272);
            rule__X__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__5"


    // $ANTLR start "rule__X__Group__5__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:655:1: rule__X__Group__5__Impl : ( ( rule__X__OwnsYAssignment_5 )* ) ;
    public final void rule__X__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:659:1: ( ( ( rule__X__OwnsYAssignment_5 )* ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:660:1: ( ( rule__X__OwnsYAssignment_5 )* )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:660:1: ( ( rule__X__OwnsYAssignment_5 )* )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:661:1: ( rule__X__OwnsYAssignment_5 )*
            {
             before(grammarAccess.getXAccess().getOwnsYAssignment_5()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:662:1: ( rule__X__OwnsYAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:662:2: rule__X__OwnsYAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__X__OwnsYAssignment_5_in_rule__X__Group__5__Impl1299);
            	    rule__X__OwnsYAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getXAccess().getOwnsYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__5__Impl"


    // $ANTLR start "rule__X__Group__6"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:672:1: rule__X__Group__6 : rule__X__Group__6__Impl ;
    public final void rule__X__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:676:1: ( rule__X__Group__6__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:677:2: rule__X__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__X__Group__6__Impl_in_rule__X__Group__61330);
            rule__X__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__6"


    // $ANTLR start "rule__X__Group__6__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:683:1: rule__X__Group__6__Impl : ( '}' ) ;
    public final void rule__X__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:687:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:688:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:688:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:689:1: '}'
            {
             before(grammarAccess.getXAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__X__Group__6__Impl1358); 
             after(grammarAccess.getXAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__6__Impl"


    // $ANTLR start "rule__Z__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:716:1: rule__Z__Group__0 : rule__Z__Group__0__Impl rule__Z__Group__1 ;
    public final void rule__Z__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:720:1: ( rule__Z__Group__0__Impl rule__Z__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:721:2: rule__Z__Group__0__Impl rule__Z__Group__1
            {
            pushFollow(FOLLOW_rule__Z__Group__0__Impl_in_rule__Z__Group__01403);
            rule__Z__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Z__Group__1_in_rule__Z__Group__01406);
            rule__Z__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__0"


    // $ANTLR start "rule__Z__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:728:1: rule__Z__Group__0__Impl : ( () ) ;
    public final void rule__Z__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:732:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:733:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:733:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:734:1: ()
            {
             before(grammarAccess.getZAccess().getZAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:735:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:737:1: 
            {
            }

             after(grammarAccess.getZAccess().getZAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__0__Impl"


    // $ANTLR start "rule__Z__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:747:1: rule__Z__Group__1 : rule__Z__Group__1__Impl rule__Z__Group__2 ;
    public final void rule__Z__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:751:1: ( rule__Z__Group__1__Impl rule__Z__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:752:2: rule__Z__Group__1__Impl rule__Z__Group__2
            {
            pushFollow(FOLLOW_rule__Z__Group__1__Impl_in_rule__Z__Group__11464);
            rule__Z__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Z__Group__2_in_rule__Z__Group__11467);
            rule__Z__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__1"


    // $ANTLR start "rule__Z__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:759:1: rule__Z__Group__1__Impl : ( 'Z' ) ;
    public final void rule__Z__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:763:1: ( ( 'Z' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:764:1: ( 'Z' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:764:1: ( 'Z' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:765:1: 'Z'
            {
             before(grammarAccess.getZAccess().getZKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Z__Group__1__Impl1495); 
             after(grammarAccess.getZAccess().getZKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__1__Impl"


    // $ANTLR start "rule__Z__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:778:1: rule__Z__Group__2 : rule__Z__Group__2__Impl ;
    public final void rule__Z__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:782:1: ( rule__Z__Group__2__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:783:2: rule__Z__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Z__Group__2__Impl_in_rule__Z__Group__21526);
            rule__Z__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__2"


    // $ANTLR start "rule__Z__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:789:1: rule__Z__Group__2__Impl : ( ( rule__Z__RefersAssignment_2 )? ) ;
    public final void rule__Z__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:793:1: ( ( ( rule__Z__RefersAssignment_2 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:794:1: ( ( rule__Z__RefersAssignment_2 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:794:1: ( ( rule__Z__RefersAssignment_2 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:795:1: ( rule__Z__RefersAssignment_2 )?
            {
             before(grammarAccess.getZAccess().getRefersAssignment_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:796:1: ( rule__Z__RefersAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:796:2: rule__Z__RefersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Z__RefersAssignment_2_in_rule__Z__Group__2__Impl1553);
                    rule__Z__RefersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZAccess().getRefersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__2__Impl"


    // $ANTLR start "rule__Y1__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:812:1: rule__Y1__Group__0 : rule__Y1__Group__0__Impl rule__Y1__Group__1 ;
    public final void rule__Y1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:816:1: ( rule__Y1__Group__0__Impl rule__Y1__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:817:2: rule__Y1__Group__0__Impl rule__Y1__Group__1
            {
            pushFollow(FOLLOW_rule__Y1__Group__0__Impl_in_rule__Y1__Group__01590);
            rule__Y1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__1_in_rule__Y1__Group__01593);
            rule__Y1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__0"


    // $ANTLR start "rule__Y1__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:824:1: rule__Y1__Group__0__Impl : ( 'Y1' ) ;
    public final void rule__Y1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:828:1: ( ( 'Y1' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:829:1: ( 'Y1' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:829:1: ( 'Y1' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:830:1: 'Y1'
            {
             before(grammarAccess.getY1Access().getY1Keyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Y1__Group__0__Impl1621); 
             after(grammarAccess.getY1Access().getY1Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__0__Impl"


    // $ANTLR start "rule__Y1__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:843:1: rule__Y1__Group__1 : rule__Y1__Group__1__Impl rule__Y1__Group__2 ;
    public final void rule__Y1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:847:1: ( rule__Y1__Group__1__Impl rule__Y1__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:848:2: rule__Y1__Group__1__Impl rule__Y1__Group__2
            {
            pushFollow(FOLLOW_rule__Y1__Group__1__Impl_in_rule__Y1__Group__11652);
            rule__Y1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__2_in_rule__Y1__Group__11655);
            rule__Y1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__1"


    // $ANTLR start "rule__Y1__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:855:1: rule__Y1__Group__1__Impl : ( ( rule__Y1__NameAssignment_1 ) ) ;
    public final void rule__Y1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:859:1: ( ( ( rule__Y1__NameAssignment_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:860:1: ( ( rule__Y1__NameAssignment_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:860:1: ( ( rule__Y1__NameAssignment_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:861:1: ( rule__Y1__NameAssignment_1 )
            {
             before(grammarAccess.getY1Access().getNameAssignment_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:862:1: ( rule__Y1__NameAssignment_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:862:2: rule__Y1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Y1__NameAssignment_1_in_rule__Y1__Group__1__Impl1682);
            rule__Y1__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getY1Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__1__Impl"


    // $ANTLR start "rule__Y1__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:872:1: rule__Y1__Group__2 : rule__Y1__Group__2__Impl rule__Y1__Group__3 ;
    public final void rule__Y1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:876:1: ( rule__Y1__Group__2__Impl rule__Y1__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:877:2: rule__Y1__Group__2__Impl rule__Y1__Group__3
            {
            pushFollow(FOLLOW_rule__Y1__Group__2__Impl_in_rule__Y1__Group__21712);
            rule__Y1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__3_in_rule__Y1__Group__21715);
            rule__Y1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__2"


    // $ANTLR start "rule__Y1__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:884:1: rule__Y1__Group__2__Impl : ( '{' ) ;
    public final void rule__Y1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:888:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:889:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:889:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:890:1: '{'
            {
             before(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Y1__Group__2__Impl1743); 
             after(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__2__Impl"


    // $ANTLR start "rule__Y1__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:903:1: rule__Y1__Group__3 : rule__Y1__Group__3__Impl rule__Y1__Group__4 ;
    public final void rule__Y1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:907:1: ( rule__Y1__Group__3__Impl rule__Y1__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:908:2: rule__Y1__Group__3__Impl rule__Y1__Group__4
            {
            pushFollow(FOLLOW_rule__Y1__Group__3__Impl_in_rule__Y1__Group__31774);
            rule__Y1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__4_in_rule__Y1__Group__31777);
            rule__Y1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__3"


    // $ANTLR start "rule__Y1__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:915:1: rule__Y1__Group__3__Impl : ( ( rule__Y1__OwnsZAssignment_3 )? ) ;
    public final void rule__Y1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:919:1: ( ( ( rule__Y1__OwnsZAssignment_3 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:920:1: ( ( rule__Y1__OwnsZAssignment_3 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:920:1: ( ( rule__Y1__OwnsZAssignment_3 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:921:1: ( rule__Y1__OwnsZAssignment_3 )?
            {
             before(grammarAccess.getY1Access().getOwnsZAssignment_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:922:1: ( rule__Y1__OwnsZAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:922:2: rule__Y1__OwnsZAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Y1__OwnsZAssignment_3_in_rule__Y1__Group__3__Impl1804);
                    rule__Y1__OwnsZAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getY1Access().getOwnsZAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__3__Impl"


    // $ANTLR start "rule__Y1__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:932:1: rule__Y1__Group__4 : rule__Y1__Group__4__Impl ;
    public final void rule__Y1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:936:1: ( rule__Y1__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:937:2: rule__Y1__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Y1__Group__4__Impl_in_rule__Y1__Group__41835);
            rule__Y1__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__4"


    // $ANTLR start "rule__Y1__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:943:1: rule__Y1__Group__4__Impl : ( '}' ) ;
    public final void rule__Y1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:947:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:948:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:948:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:949:1: '}'
            {
             before(grammarAccess.getY1Access().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Y1__Group__4__Impl1863); 
             after(grammarAccess.getY1Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__4__Impl"


    // $ANTLR start "rule__Y2__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:972:1: rule__Y2__Group__0 : rule__Y2__Group__0__Impl rule__Y2__Group__1 ;
    public final void rule__Y2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:976:1: ( rule__Y2__Group__0__Impl rule__Y2__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:977:2: rule__Y2__Group__0__Impl rule__Y2__Group__1
            {
            pushFollow(FOLLOW_rule__Y2__Group__0__Impl_in_rule__Y2__Group__01904);
            rule__Y2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__1_in_rule__Y2__Group__01907);
            rule__Y2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__0"


    // $ANTLR start "rule__Y2__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:984:1: rule__Y2__Group__0__Impl : ( 'Y2' ) ;
    public final void rule__Y2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:988:1: ( ( 'Y2' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:989:1: ( 'Y2' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:989:1: ( 'Y2' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:990:1: 'Y2'
            {
             before(grammarAccess.getY2Access().getY2Keyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Y2__Group__0__Impl1935); 
             after(grammarAccess.getY2Access().getY2Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__0__Impl"


    // $ANTLR start "rule__Y2__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1003:1: rule__Y2__Group__1 : rule__Y2__Group__1__Impl rule__Y2__Group__2 ;
    public final void rule__Y2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1007:1: ( rule__Y2__Group__1__Impl rule__Y2__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1008:2: rule__Y2__Group__1__Impl rule__Y2__Group__2
            {
            pushFollow(FOLLOW_rule__Y2__Group__1__Impl_in_rule__Y2__Group__11966);
            rule__Y2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__2_in_rule__Y2__Group__11969);
            rule__Y2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__1"


    // $ANTLR start "rule__Y2__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1015:1: rule__Y2__Group__1__Impl : ( ( rule__Y2__NameAssignment_1 ) ) ;
    public final void rule__Y2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1019:1: ( ( ( rule__Y2__NameAssignment_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1020:1: ( ( rule__Y2__NameAssignment_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1020:1: ( ( rule__Y2__NameAssignment_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1021:1: ( rule__Y2__NameAssignment_1 )
            {
             before(grammarAccess.getY2Access().getNameAssignment_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1022:1: ( rule__Y2__NameAssignment_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1022:2: rule__Y2__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Y2__NameAssignment_1_in_rule__Y2__Group__1__Impl1996);
            rule__Y2__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getY2Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__1__Impl"


    // $ANTLR start "rule__Y2__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1032:1: rule__Y2__Group__2 : rule__Y2__Group__2__Impl rule__Y2__Group__3 ;
    public final void rule__Y2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1036:1: ( rule__Y2__Group__2__Impl rule__Y2__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1037:2: rule__Y2__Group__2__Impl rule__Y2__Group__3
            {
            pushFollow(FOLLOW_rule__Y2__Group__2__Impl_in_rule__Y2__Group__22026);
            rule__Y2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__3_in_rule__Y2__Group__22029);
            rule__Y2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__2"


    // $ANTLR start "rule__Y2__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1044:1: rule__Y2__Group__2__Impl : ( '{' ) ;
    public final void rule__Y2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1048:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1049:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1049:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1050:1: '{'
            {
             before(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Y2__Group__2__Impl2057); 
             after(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__2__Impl"


    // $ANTLR start "rule__Y2__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1063:1: rule__Y2__Group__3 : rule__Y2__Group__3__Impl rule__Y2__Group__4 ;
    public final void rule__Y2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1067:1: ( rule__Y2__Group__3__Impl rule__Y2__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1068:2: rule__Y2__Group__3__Impl rule__Y2__Group__4
            {
            pushFollow(FOLLOW_rule__Y2__Group__3__Impl_in_rule__Y2__Group__32088);
            rule__Y2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__4_in_rule__Y2__Group__32091);
            rule__Y2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__3"


    // $ANTLR start "rule__Y2__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1075:1: rule__Y2__Group__3__Impl : ( ( rule__Y2__OwnsZAssignment_3 )? ) ;
    public final void rule__Y2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1079:1: ( ( ( rule__Y2__OwnsZAssignment_3 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1080:1: ( ( rule__Y2__OwnsZAssignment_3 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1080:1: ( ( rule__Y2__OwnsZAssignment_3 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1081:1: ( rule__Y2__OwnsZAssignment_3 )?
            {
             before(grammarAccess.getY2Access().getOwnsZAssignment_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1082:1: ( rule__Y2__OwnsZAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1082:2: rule__Y2__OwnsZAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Y2__OwnsZAssignment_3_in_rule__Y2__Group__3__Impl2118);
                    rule__Y2__OwnsZAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getY2Access().getOwnsZAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__3__Impl"


    // $ANTLR start "rule__Y2__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1092:1: rule__Y2__Group__4 : rule__Y2__Group__4__Impl ;
    public final void rule__Y2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1096:1: ( rule__Y2__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1097:2: rule__Y2__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Y2__Group__4__Impl_in_rule__Y2__Group__42149);
            rule__Y2__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__4"


    // $ANTLR start "rule__Y2__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1103:1: rule__Y2__Group__4__Impl : ( '}' ) ;
    public final void rule__Y2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1107:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1108:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1108:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1109:1: '}'
            {
             before(grammarAccess.getY2Access().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Y2__Group__4__Impl2177); 
             after(grammarAccess.getY2Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__4__Impl"


    // $ANTLR start "rule__PathNameCS__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1132:1: rule__PathNameCS__Group__0 : rule__PathNameCS__Group__0__Impl rule__PathNameCS__Group__1 ;
    public final void rule__PathNameCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1136:1: ( rule__PathNameCS__Group__0__Impl rule__PathNameCS__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1137:2: rule__PathNameCS__Group__0__Impl rule__PathNameCS__Group__1
            {
            pushFollow(FOLLOW_rule__PathNameCS__Group__0__Impl_in_rule__PathNameCS__Group__02218);
            rule__PathNameCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathNameCS__Group__1_in_rule__PathNameCS__Group__02221);
            rule__PathNameCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group__0"


    // $ANTLR start "rule__PathNameCS__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1144:1: rule__PathNameCS__Group__0__Impl : ( ( rule__PathNameCS__PathAssignment_0 ) ) ;
    public final void rule__PathNameCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1148:1: ( ( ( rule__PathNameCS__PathAssignment_0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1149:1: ( ( rule__PathNameCS__PathAssignment_0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1149:1: ( ( rule__PathNameCS__PathAssignment_0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1150:1: ( rule__PathNameCS__PathAssignment_0 )
            {
             before(grammarAccess.getPathNameCSAccess().getPathAssignment_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1151:1: ( rule__PathNameCS__PathAssignment_0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1151:2: rule__PathNameCS__PathAssignment_0
            {
            pushFollow(FOLLOW_rule__PathNameCS__PathAssignment_0_in_rule__PathNameCS__Group__0__Impl2248);
            rule__PathNameCS__PathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathNameCSAccess().getPathAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group__0__Impl"


    // $ANTLR start "rule__PathNameCS__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1161:1: rule__PathNameCS__Group__1 : rule__PathNameCS__Group__1__Impl ;
    public final void rule__PathNameCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1165:1: ( rule__PathNameCS__Group__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1166:2: rule__PathNameCS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathNameCS__Group__1__Impl_in_rule__PathNameCS__Group__12278);
            rule__PathNameCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group__1"


    // $ANTLR start "rule__PathNameCS__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1172:1: rule__PathNameCS__Group__1__Impl : ( ( rule__PathNameCS__Group_1__0 )* ) ;
    public final void rule__PathNameCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1176:1: ( ( ( rule__PathNameCS__Group_1__0 )* ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1177:1: ( ( rule__PathNameCS__Group_1__0 )* )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1177:1: ( ( rule__PathNameCS__Group_1__0 )* )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1178:1: ( rule__PathNameCS__Group_1__0 )*
            {
             before(grammarAccess.getPathNameCSAccess().getGroup_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1179:1: ( rule__PathNameCS__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1179:2: rule__PathNameCS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PathNameCS__Group_1__0_in_rule__PathNameCS__Group__1__Impl2305);
            	    rule__PathNameCS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPathNameCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group__1__Impl"


    // $ANTLR start "rule__PathNameCS__Group_1__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1193:1: rule__PathNameCS__Group_1__0 : rule__PathNameCS__Group_1__0__Impl rule__PathNameCS__Group_1__1 ;
    public final void rule__PathNameCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1197:1: ( rule__PathNameCS__Group_1__0__Impl rule__PathNameCS__Group_1__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1198:2: rule__PathNameCS__Group_1__0__Impl rule__PathNameCS__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathNameCS__Group_1__0__Impl_in_rule__PathNameCS__Group_1__02340);
            rule__PathNameCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathNameCS__Group_1__1_in_rule__PathNameCS__Group_1__02343);
            rule__PathNameCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group_1__0"


    // $ANTLR start "rule__PathNameCS__Group_1__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1205:1: rule__PathNameCS__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PathNameCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1209:1: ( ( '.' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1210:1: ( '.' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1210:1: ( '.' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1211:1: '.'
            {
             before(grammarAccess.getPathNameCSAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__PathNameCS__Group_1__0__Impl2371); 
             after(grammarAccess.getPathNameCSAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group_1__0__Impl"


    // $ANTLR start "rule__PathNameCS__Group_1__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1224:1: rule__PathNameCS__Group_1__1 : rule__PathNameCS__Group_1__1__Impl ;
    public final void rule__PathNameCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1228:1: ( rule__PathNameCS__Group_1__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1229:2: rule__PathNameCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PathNameCS__Group_1__1__Impl_in_rule__PathNameCS__Group_1__12402);
            rule__PathNameCS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group_1__1"


    // $ANTLR start "rule__PathNameCS__Group_1__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1235:1: rule__PathNameCS__Group_1__1__Impl : ( ( rule__PathNameCS__PathAssignment_1_1 ) ) ;
    public final void rule__PathNameCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1239:1: ( ( ( rule__PathNameCS__PathAssignment_1_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1240:1: ( ( rule__PathNameCS__PathAssignment_1_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1240:1: ( ( rule__PathNameCS__PathAssignment_1_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1241:1: ( rule__PathNameCS__PathAssignment_1_1 )
            {
             before(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1242:1: ( rule__PathNameCS__PathAssignment_1_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1242:2: rule__PathNameCS__PathAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PathNameCS__PathAssignment_1_1_in_rule__PathNameCS__Group_1__1__Impl2429);
            rule__PathNameCS__PathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__Group_1__1__Impl"


    // $ANTLR start "rule__Root__OwnedXAssignment_3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1257:1: rule__Root__OwnedXAssignment_3 : ( ruleX ) ;
    public final void rule__Root__OwnedXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1261:1: ( ( ruleX ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1262:1: ( ruleX )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1262:1: ( ruleX )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1263:1: ruleX
            {
             before(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_32468);
            ruleX();

            state._fsp--;

             after(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__OwnedXAssignment_3"


    // $ANTLR start "rule__X__NameAssignment_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1272:1: rule__X__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__X__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1276:1: ( ( RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1277:1: ( RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1277:1: ( RULE_ID )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1278:1: RULE_ID
            {
             before(grammarAccess.getXAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__X__NameAssignment_22499); 
             after(grammarAccess.getXAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__NameAssignment_2"


    // $ANTLR start "rule__X__IsA1Assignment_3_0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1287:1: rule__X__IsA1Assignment_3_0 : ( ( 'isA1' ) ) ;
    public final void rule__X__IsA1Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1291:1: ( ( ( 'isA1' ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1292:1: ( ( 'isA1' ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1292:1: ( ( 'isA1' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1293:1: ( 'isA1' )
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1294:1: ( 'isA1' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1295:1: 'isA1'
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 
            match(input,19,FOLLOW_19_in_rule__X__IsA1Assignment_3_02535); 
             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 

            }

             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__IsA1Assignment_3_0"


    // $ANTLR start "rule__X__IsA2Assignment_3_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1310:1: rule__X__IsA2Assignment_3_1 : ( ( 'isA2' ) ) ;
    public final void rule__X__IsA2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1314:1: ( ( ( 'isA2' ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1315:1: ( ( 'isA2' ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1315:1: ( ( 'isA2' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1316:1: ( 'isA2' )
            {
             before(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1317:1: ( 'isA2' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1318:1: 'isA2'
            {
             before(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 
            match(input,20,FOLLOW_20_in_rule__X__IsA2Assignment_3_12579); 
             after(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 

            }

             after(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__IsA2Assignment_3_1"


    // $ANTLR start "rule__X__OwnsYAssignment_5"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1333:1: rule__X__OwnsYAssignment_5 : ( ruleY ) ;
    public final void rule__X__OwnsYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1337:1: ( ( ruleY ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1338:1: ( ruleY )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1338:1: ( ruleY )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1339:1: ruleY
            {
             before(grammarAccess.getXAccess().getOwnsYYParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleY_in_rule__X__OwnsYAssignment_52618);
            ruleY();

            state._fsp--;

             after(grammarAccess.getXAccess().getOwnsYYParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__OwnsYAssignment_5"


    // $ANTLR start "rule__Z__RefersAssignment_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1348:1: rule__Z__RefersAssignment_2 : ( rulePathNameCS ) ;
    public final void rule__Z__RefersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1352:1: ( ( rulePathNameCS ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1353:1: ( rulePathNameCS )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1353:1: ( rulePathNameCS )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1354:1: rulePathNameCS
            {
             before(grammarAccess.getZAccess().getRefersPathNameCSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePathNameCS_in_rule__Z__RefersAssignment_22649);
            rulePathNameCS();

            state._fsp--;

             after(grammarAccess.getZAccess().getRefersPathNameCSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__RefersAssignment_2"


    // $ANTLR start "rule__Y1__NameAssignment_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1363:1: rule__Y1__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Y1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1367:1: ( ( RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1368:1: ( RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1368:1: ( RULE_ID )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1369:1: RULE_ID
            {
             before(grammarAccess.getY1Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Y1__NameAssignment_12680); 
             after(grammarAccess.getY1Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__NameAssignment_1"


    // $ANTLR start "rule__Y1__OwnsZAssignment_3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1378:1: rule__Y1__OwnsZAssignment_3 : ( ruleZ ) ;
    public final void rule__Y1__OwnsZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1382:1: ( ( ruleZ ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1383:1: ( ruleZ )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1383:1: ( ruleZ )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1384:1: ruleZ
            {
             before(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleZ_in_rule__Y1__OwnsZAssignment_32711);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__OwnsZAssignment_3"


    // $ANTLR start "rule__Y2__NameAssignment_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1393:1: rule__Y2__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Y2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1397:1: ( ( RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1398:1: ( RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1398:1: ( RULE_ID )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1399:1: RULE_ID
            {
             before(grammarAccess.getY2Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Y2__NameAssignment_12742); 
             after(grammarAccess.getY2Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__NameAssignment_1"


    // $ANTLR start "rule__Y2__OwnsZAssignment_3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1408:1: rule__Y2__OwnsZAssignment_3 : ( ruleZ ) ;
    public final void rule__Y2__OwnsZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1412:1: ( ( ruleZ ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1413:1: ( ruleZ )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1413:1: ( ruleZ )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1414:1: ruleZ
            {
             before(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleZ_in_rule__Y2__OwnsZAssignment_32773);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__OwnsZAssignment_3"


    // $ANTLR start "rule__PathNameCS__PathAssignment_0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1423:1: rule__PathNameCS__PathAssignment_0 : ( rulePathElementCS ) ;
    public final void rule__PathNameCS__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1427:1: ( ( rulePathElementCS ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1428:1: ( rulePathElementCS )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1428:1: ( rulePathElementCS )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1429:1: rulePathElementCS
            {
             before(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathElementCS_in_rule__PathNameCS__PathAssignment_02804);
            rulePathElementCS();

            state._fsp--;

             after(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__PathAssignment_0"


    // $ANTLR start "rule__PathNameCS__PathAssignment_1_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1438:1: rule__PathNameCS__PathAssignment_1_1 : ( rulePathElementCS ) ;
    public final void rule__PathNameCS__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1442:1: ( ( rulePathElementCS ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1443:1: ( rulePathElementCS )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1443:1: ( rulePathElementCS )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1444:1: rulePathElementCS
            {
             before(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePathElementCS_in_rule__PathNameCS__PathAssignment_1_12835);
            rulePathElementCS();

            state._fsp--;

             after(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathNameCS__PathAssignment_1_1"


    // $ANTLR start "rule__PathElementCS__NameAssignment"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1453:1: rule__PathElementCS__NameAssignment : ( RULE_ID ) ;
    public final void rule__PathElementCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1457:1: ( ( RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1458:1: ( RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1458:1: ( RULE_ID )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1459:1: RULE_ID
            {
             before(grammarAccess.getPathElementCSAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathElementCS__NameAssignment2866); 
             after(grammarAccess.getPathElementCSAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElementCS__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__0_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY_in_entryRuleY121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleY128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y__Alternatives_in_ruleY154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_entryRuleX181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleX188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__0_in_ruleX214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZ_in_entryRuleZ241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZ248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__0_in_ruleZ274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY1_in_entryRuleY1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleY1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__0_in_ruleY1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY2_in_entryRuleY2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleY2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__0_in_ruleY2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group__0_in_rulePathNameCS454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElementCS_in_entryRulePathElementCS481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElementCS488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElementCS__NameAssignment_in_rulePathElementCS514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY1_in_rule__Y__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY2_in_rule__Y__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__IsA1Assignment_3_0_in_rule__X__Alternatives_3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__IsA2Assignment_3_1_in_rule__X__Alternatives_3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1709 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Root__Group__1__Impl740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__2771 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Root__Group__3_in_rule__Root__Group__2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Root__Group__2__Impl802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__3__Impl_in_rule__Root__Group__3833 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Root__Group__4_in_rule__Root__Group__3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__OwnedXAssignment_3_in_rule__Root__Group__3__Impl863 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Root__Group__4__Impl_in_rule__Root__Group__4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Root__Group__4__Impl922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__0__Impl_in_rule__X__Group__0963 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__X__Group__1_in_rule__X__Group__0966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__1__Impl_in_rule__X__Group__11024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__X__Group__2_in_rule__X__Group__11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__X__Group__1__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__2__Impl_in_rule__X__Group__21086 = new BitSet(new long[]{0x0000000000181000L});
    public static final BitSet FOLLOW_rule__X__Group__3_in_rule__X__Group__21089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__NameAssignment_2_in_rule__X__Group__2__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__3__Impl_in_rule__X__Group__31146 = new BitSet(new long[]{0x0000000000181000L});
    public static final BitSet FOLLOW_rule__X__Group__4_in_rule__X__Group__31149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Alternatives_3_in_rule__X__Group__3__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__4__Impl_in_rule__X__Group__41207 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_rule__X__Group__5_in_rule__X__Group__41210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__X__Group__4__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__5__Impl_in_rule__X__Group__51269 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_rule__X__Group__6_in_rule__X__Group__51272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__OwnsYAssignment_5_in_rule__X__Group__5__Impl1299 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__X__Group__6__Impl_in_rule__X__Group__61330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__X__Group__6__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__0__Impl_in_rule__Z__Group__01403 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Z__Group__1_in_rule__Z__Group__01406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__1__Impl_in_rule__Z__Group__11464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Z__Group__2_in_rule__Z__Group__11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Z__Group__1__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__2__Impl_in_rule__Z__Group__21526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__RefersAssignment_2_in_rule__Z__Group__2__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__0__Impl_in_rule__Y1__Group__01590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Y1__Group__1_in_rule__Y1__Group__01593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Y1__Group__0__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__1__Impl_in_rule__Y1__Group__11652 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Y1__Group__2_in_rule__Y1__Group__11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__NameAssignment_1_in_rule__Y1__Group__1__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__2__Impl_in_rule__Y1__Group__21712 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y1__Group__3_in_rule__Y1__Group__21715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Y1__Group__2__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__3__Impl_in_rule__Y1__Group__31774 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y1__Group__4_in_rule__Y1__Group__31777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__OwnsZAssignment_3_in_rule__Y1__Group__3__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__4__Impl_in_rule__Y1__Group__41835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Y1__Group__4__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__0__Impl_in_rule__Y2__Group__01904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Y2__Group__1_in_rule__Y2__Group__01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Y2__Group__0__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__1__Impl_in_rule__Y2__Group__11966 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Y2__Group__2_in_rule__Y2__Group__11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__NameAssignment_1_in_rule__Y2__Group__1__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__2__Impl_in_rule__Y2__Group__22026 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y2__Group__3_in_rule__Y2__Group__22029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Y2__Group__2__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__3__Impl_in_rule__Y2__Group__32088 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y2__Group__4_in_rule__Y2__Group__32091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__OwnsZAssignment_3_in_rule__Y2__Group__3__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__4__Impl_in_rule__Y2__Group__42149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Y2__Group__4__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group__0__Impl_in_rule__PathNameCS__Group__02218 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group__1_in_rule__PathNameCS__Group__02221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__PathAssignment_0_in_rule__PathNameCS__Group__0__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group__1__Impl_in_rule__PathNameCS__Group__12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group_1__0_in_rule__PathNameCS__Group__1__Impl2305 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group_1__0__Impl_in_rule__PathNameCS__Group_1__02340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group_1__1_in_rule__PathNameCS__Group_1__02343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PathNameCS__Group_1__0__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__Group_1__1__Impl_in_rule__PathNameCS__Group_1__12402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathNameCS__PathAssignment_1_1_in_rule__PathNameCS__Group_1__1__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_32468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__X__NameAssignment_22499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__X__IsA1Assignment_3_02535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__X__IsA2Assignment_3_12579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY_in_rule__X__OwnsYAssignment_52618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathNameCS_in_rule__Z__RefersAssignment_22649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Y1__NameAssignment_12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZ_in_rule__Y1__OwnsZAssignment_32711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Y2__NameAssignment_12742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZ_in_rule__Y2__OwnsZAssignment_32773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElementCS_in_rule__PathNameCS__PathAssignment_02804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElementCS_in_rule__PathNameCS__PathAssignment_1_12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathElementCS__NameAssignment2866 = new BitSet(new long[]{0x0000000000000002L});

}