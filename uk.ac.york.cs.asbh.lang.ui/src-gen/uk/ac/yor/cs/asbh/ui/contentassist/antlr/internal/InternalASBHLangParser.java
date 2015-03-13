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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'X'", "'Z'", "'Y1'", "'Y2'", "'isA1'", "'isA2'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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


    // $ANTLR start "rule__Y__Alternatives"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:228:1: rule__Y__Alternatives : ( ( ruleY1 ) | ( ruleY2 ) );
    public final void rule__Y__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:232:1: ( ( ruleY1 ) | ( ruleY2 ) )
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
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:233:1: ( ruleY1 )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:233:1: ( ruleY1 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:234:1: ruleY1
                    {
                     before(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleY1_in_rule__Y__Alternatives430);
                    ruleY1();

                    state._fsp--;

                     after(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:239:6: ( ruleY2 )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:239:6: ( ruleY2 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:240:1: ruleY2
                    {
                     before(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleY2_in_rule__Y__Alternatives447);
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


    // $ANTLR start "rule__X__Alternatives_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:250:1: rule__X__Alternatives_2 : ( ( ( rule__X__IsA1Assignment_2_0 ) ) | ( ( rule__X__IsA2Assignment_2_1 ) ) );
    public final void rule__X__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:254:1: ( ( ( rule__X__IsA1Assignment_2_0 ) ) | ( ( rule__X__IsA2Assignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:255:1: ( ( rule__X__IsA1Assignment_2_0 ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:255:1: ( ( rule__X__IsA1Assignment_2_0 ) )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:256:1: ( rule__X__IsA1Assignment_2_0 )
                    {
                     before(grammarAccess.getXAccess().getIsA1Assignment_2_0()); 
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:257:1: ( rule__X__IsA1Assignment_2_0 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:257:2: rule__X__IsA1Assignment_2_0
                    {
                    pushFollow(FOLLOW_rule__X__IsA1Assignment_2_0_in_rule__X__Alternatives_2479);
                    rule__X__IsA1Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXAccess().getIsA1Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:261:6: ( ( rule__X__IsA2Assignment_2_1 ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:261:6: ( ( rule__X__IsA2Assignment_2_1 ) )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:262:1: ( rule__X__IsA2Assignment_2_1 )
                    {
                     before(grammarAccess.getXAccess().getIsA2Assignment_2_1()); 
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:263:1: ( rule__X__IsA2Assignment_2_1 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:263:2: rule__X__IsA2Assignment_2_1
                    {
                    pushFollow(FOLLOW_rule__X__IsA2Assignment_2_1_in_rule__X__Alternatives_2497);
                    rule__X__IsA2Assignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXAccess().getIsA2Assignment_2_1()); 

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
    // $ANTLR end "rule__X__Alternatives_2"


    // $ANTLR start "rule__Root__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:274:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:278:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:279:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0528);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0531);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:286:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:290:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:291:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:291:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:292:1: ()
            {
             before(grammarAccess.getRootAccess().getSRootAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:293:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:295:1: 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:305:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:309:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:310:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1589);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__2_in_rule__Root__Group__1592);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:317:1: rule__Root__Group__1__Impl : ( 'Root' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:321:1: ( ( 'Root' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:322:1: ( 'Root' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:322:1: ( 'Root' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:323:1: 'Root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Root__Group__1__Impl620); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:336:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:340:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:341:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__2651);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__3_in_rule__Root__Group__2654);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:348:1: rule__Root__Group__2__Impl : ( '{' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:352:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:353:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:353:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:354:1: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Root__Group__2__Impl682); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:367:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:371:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:372:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_rule__Root__Group__3__Impl_in_rule__Root__Group__3713);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Root__Group__4_in_rule__Root__Group__3716);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:379:1: rule__Root__Group__3__Impl : ( ( rule__Root__OwnedXAssignment_3 )* ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:383:1: ( ( ( rule__Root__OwnedXAssignment_3 )* ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:384:1: ( ( rule__Root__OwnedXAssignment_3 )* )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:384:1: ( ( rule__Root__OwnedXAssignment_3 )* )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:385:1: ( rule__Root__OwnedXAssignment_3 )*
            {
             before(grammarAccess.getRootAccess().getOwnedXAssignment_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:386:1: ( rule__Root__OwnedXAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:386:2: rule__Root__OwnedXAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Root__OwnedXAssignment_3_in_rule__Root__Group__3__Impl743);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:396:1: rule__Root__Group__4 : rule__Root__Group__4__Impl ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:400:1: ( rule__Root__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:401:2: rule__Root__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Root__Group__4__Impl_in_rule__Root__Group__4774);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:407:1: rule__Root__Group__4__Impl : ( '}' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:411:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:412:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:412:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:413:1: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Root__Group__4__Impl802); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:436:1: rule__X__Group__0 : rule__X__Group__0__Impl rule__X__Group__1 ;
    public final void rule__X__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:440:1: ( rule__X__Group__0__Impl rule__X__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:441:2: rule__X__Group__0__Impl rule__X__Group__1
            {
            pushFollow(FOLLOW_rule__X__Group__0__Impl_in_rule__X__Group__0843);
            rule__X__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__1_in_rule__X__Group__0846);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:448:1: rule__X__Group__0__Impl : ( () ) ;
    public final void rule__X__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:452:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:453:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:453:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:454:1: ()
            {
             before(grammarAccess.getXAccess().getXAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:455:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:457:1: 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:467:1: rule__X__Group__1 : rule__X__Group__1__Impl rule__X__Group__2 ;
    public final void rule__X__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:471:1: ( rule__X__Group__1__Impl rule__X__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:472:2: rule__X__Group__1__Impl rule__X__Group__2
            {
            pushFollow(FOLLOW_rule__X__Group__1__Impl_in_rule__X__Group__1904);
            rule__X__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__2_in_rule__X__Group__1907);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:479:1: rule__X__Group__1__Impl : ( 'X' ) ;
    public final void rule__X__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:483:1: ( ( 'X' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:484:1: ( 'X' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:484:1: ( 'X' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:485:1: 'X'
            {
             before(grammarAccess.getXAccess().getXKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__X__Group__1__Impl935); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:498:1: rule__X__Group__2 : rule__X__Group__2__Impl rule__X__Group__3 ;
    public final void rule__X__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:502:1: ( rule__X__Group__2__Impl rule__X__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:503:2: rule__X__Group__2__Impl rule__X__Group__3
            {
            pushFollow(FOLLOW_rule__X__Group__2__Impl_in_rule__X__Group__2966);
            rule__X__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__3_in_rule__X__Group__2969);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:510:1: rule__X__Group__2__Impl : ( ( rule__X__Alternatives_2 )? ) ;
    public final void rule__X__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:514:1: ( ( ( rule__X__Alternatives_2 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:515:1: ( ( rule__X__Alternatives_2 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:515:1: ( ( rule__X__Alternatives_2 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:516:1: ( rule__X__Alternatives_2 )?
            {
             before(grammarAccess.getXAccess().getAlternatives_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:517:1: ( rule__X__Alternatives_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:517:2: rule__X__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__X__Alternatives_2_in_rule__X__Group__2__Impl996);
                    rule__X__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAccess().getAlternatives_2()); 

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:527:1: rule__X__Group__3 : rule__X__Group__3__Impl rule__X__Group__4 ;
    public final void rule__X__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:531:1: ( rule__X__Group__3__Impl rule__X__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:532:2: rule__X__Group__3__Impl rule__X__Group__4
            {
            pushFollow(FOLLOW_rule__X__Group__3__Impl_in_rule__X__Group__31027);
            rule__X__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__4_in_rule__X__Group__31030);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:539:1: rule__X__Group__3__Impl : ( '{' ) ;
    public final void rule__X__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:543:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:544:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:544:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:545:1: '{'
            {
             before(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__X__Group__3__Impl1058); 
             after(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:558:1: rule__X__Group__4 : rule__X__Group__4__Impl rule__X__Group__5 ;
    public final void rule__X__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:562:1: ( rule__X__Group__4__Impl rule__X__Group__5 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:563:2: rule__X__Group__4__Impl rule__X__Group__5
            {
            pushFollow(FOLLOW_rule__X__Group__4__Impl_in_rule__X__Group__41089);
            rule__X__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__X__Group__5_in_rule__X__Group__41092);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:570:1: rule__X__Group__4__Impl : ( ( rule__X__OwnsYAssignment_4 )* ) ;
    public final void rule__X__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:574:1: ( ( ( rule__X__OwnsYAssignment_4 )* ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:575:1: ( ( rule__X__OwnsYAssignment_4 )* )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:575:1: ( ( rule__X__OwnsYAssignment_4 )* )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:576:1: ( rule__X__OwnsYAssignment_4 )*
            {
             before(grammarAccess.getXAccess().getOwnsYAssignment_4()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:577:1: ( rule__X__OwnsYAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:577:2: rule__X__OwnsYAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__X__OwnsYAssignment_4_in_rule__X__Group__4__Impl1119);
            	    rule__X__OwnsYAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getXAccess().getOwnsYAssignment_4()); 

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:587:1: rule__X__Group__5 : rule__X__Group__5__Impl ;
    public final void rule__X__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:591:1: ( rule__X__Group__5__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:592:2: rule__X__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__X__Group__5__Impl_in_rule__X__Group__51150);
            rule__X__Group__5__Impl();

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:598:1: rule__X__Group__5__Impl : ( '}' ) ;
    public final void rule__X__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:602:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:603:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:603:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:604:1: '}'
            {
             before(grammarAccess.getXAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__X__Group__5__Impl1178); 
             after(grammarAccess.getXAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Z__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:629:1: rule__Z__Group__0 : rule__Z__Group__0__Impl rule__Z__Group__1 ;
    public final void rule__Z__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:633:1: ( rule__Z__Group__0__Impl rule__Z__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:634:2: rule__Z__Group__0__Impl rule__Z__Group__1
            {
            pushFollow(FOLLOW_rule__Z__Group__0__Impl_in_rule__Z__Group__01221);
            rule__Z__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Z__Group__1_in_rule__Z__Group__01224);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:641:1: rule__Z__Group__0__Impl : ( () ) ;
    public final void rule__Z__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:645:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:646:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:646:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:647:1: ()
            {
             before(grammarAccess.getZAccess().getZAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:648:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:650:1: 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:660:1: rule__Z__Group__1 : rule__Z__Group__1__Impl rule__Z__Group__2 ;
    public final void rule__Z__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:664:1: ( rule__Z__Group__1__Impl rule__Z__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:665:2: rule__Z__Group__1__Impl rule__Z__Group__2
            {
            pushFollow(FOLLOW_rule__Z__Group__1__Impl_in_rule__Z__Group__11282);
            rule__Z__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Z__Group__2_in_rule__Z__Group__11285);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:672:1: rule__Z__Group__1__Impl : ( 'Z' ) ;
    public final void rule__Z__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:676:1: ( ( 'Z' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:677:1: ( 'Z' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:677:1: ( 'Z' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:678:1: 'Z'
            {
             before(grammarAccess.getZAccess().getZKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Z__Group__1__Impl1313); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:691:1: rule__Z__Group__2 : rule__Z__Group__2__Impl ;
    public final void rule__Z__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:695:1: ( rule__Z__Group__2__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:696:2: rule__Z__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Z__Group__2__Impl_in_rule__Z__Group__21344);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:702:1: rule__Z__Group__2__Impl : ( ( rule__Z__NameAssignment_2 )? ) ;
    public final void rule__Z__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:706:1: ( ( ( rule__Z__NameAssignment_2 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:707:1: ( ( rule__Z__NameAssignment_2 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:707:1: ( ( rule__Z__NameAssignment_2 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:708:1: ( rule__Z__NameAssignment_2 )?
            {
             before(grammarAccess.getZAccess().getNameAssignment_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:709:1: ( rule__Z__NameAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:709:2: rule__Z__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Z__NameAssignment_2_in_rule__Z__Group__2__Impl1371);
                    rule__Z__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZAccess().getNameAssignment_2()); 

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:725:1: rule__Y1__Group__0 : rule__Y1__Group__0__Impl rule__Y1__Group__1 ;
    public final void rule__Y1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:729:1: ( rule__Y1__Group__0__Impl rule__Y1__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:730:2: rule__Y1__Group__0__Impl rule__Y1__Group__1
            {
            pushFollow(FOLLOW_rule__Y1__Group__0__Impl_in_rule__Y1__Group__01408);
            rule__Y1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__1_in_rule__Y1__Group__01411);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:737:1: rule__Y1__Group__0__Impl : ( 'Y1' ) ;
    public final void rule__Y1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:741:1: ( ( 'Y1' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:742:1: ( 'Y1' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:742:1: ( 'Y1' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:743:1: 'Y1'
            {
             before(grammarAccess.getY1Access().getY1Keyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Y1__Group__0__Impl1439); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:756:1: rule__Y1__Group__1 : rule__Y1__Group__1__Impl rule__Y1__Group__2 ;
    public final void rule__Y1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:760:1: ( rule__Y1__Group__1__Impl rule__Y1__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:761:2: rule__Y1__Group__1__Impl rule__Y1__Group__2
            {
            pushFollow(FOLLOW_rule__Y1__Group__1__Impl_in_rule__Y1__Group__11470);
            rule__Y1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__2_in_rule__Y1__Group__11473);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:768:1: rule__Y1__Group__1__Impl : ( ( rule__Y1__NameAssignment_1 ) ) ;
    public final void rule__Y1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:772:1: ( ( ( rule__Y1__NameAssignment_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:773:1: ( ( rule__Y1__NameAssignment_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:773:1: ( ( rule__Y1__NameAssignment_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:774:1: ( rule__Y1__NameAssignment_1 )
            {
             before(grammarAccess.getY1Access().getNameAssignment_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:775:1: ( rule__Y1__NameAssignment_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:775:2: rule__Y1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Y1__NameAssignment_1_in_rule__Y1__Group__1__Impl1500);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:785:1: rule__Y1__Group__2 : rule__Y1__Group__2__Impl rule__Y1__Group__3 ;
    public final void rule__Y1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:789:1: ( rule__Y1__Group__2__Impl rule__Y1__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:790:2: rule__Y1__Group__2__Impl rule__Y1__Group__3
            {
            pushFollow(FOLLOW_rule__Y1__Group__2__Impl_in_rule__Y1__Group__21530);
            rule__Y1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__3_in_rule__Y1__Group__21533);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:797:1: rule__Y1__Group__2__Impl : ( '{' ) ;
    public final void rule__Y1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:801:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:802:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:802:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:803:1: '{'
            {
             before(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Y1__Group__2__Impl1561); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:816:1: rule__Y1__Group__3 : rule__Y1__Group__3__Impl rule__Y1__Group__4 ;
    public final void rule__Y1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:820:1: ( rule__Y1__Group__3__Impl rule__Y1__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:821:2: rule__Y1__Group__3__Impl rule__Y1__Group__4
            {
            pushFollow(FOLLOW_rule__Y1__Group__3__Impl_in_rule__Y1__Group__31592);
            rule__Y1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y1__Group__4_in_rule__Y1__Group__31595);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:828:1: rule__Y1__Group__3__Impl : ( ( rule__Y1__OwnsZAssignment_3 )? ) ;
    public final void rule__Y1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:832:1: ( ( ( rule__Y1__OwnsZAssignment_3 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:833:1: ( ( rule__Y1__OwnsZAssignment_3 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:833:1: ( ( rule__Y1__OwnsZAssignment_3 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:834:1: ( rule__Y1__OwnsZAssignment_3 )?
            {
             before(grammarAccess.getY1Access().getOwnsZAssignment_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:835:1: ( rule__Y1__OwnsZAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:835:2: rule__Y1__OwnsZAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Y1__OwnsZAssignment_3_in_rule__Y1__Group__3__Impl1622);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:845:1: rule__Y1__Group__4 : rule__Y1__Group__4__Impl ;
    public final void rule__Y1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:849:1: ( rule__Y1__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:850:2: rule__Y1__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Y1__Group__4__Impl_in_rule__Y1__Group__41653);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:856:1: rule__Y1__Group__4__Impl : ( '}' ) ;
    public final void rule__Y1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:860:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:861:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:861:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:862:1: '}'
            {
             before(grammarAccess.getY1Access().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Y1__Group__4__Impl1681); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:885:1: rule__Y2__Group__0 : rule__Y2__Group__0__Impl rule__Y2__Group__1 ;
    public final void rule__Y2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:889:1: ( rule__Y2__Group__0__Impl rule__Y2__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:890:2: rule__Y2__Group__0__Impl rule__Y2__Group__1
            {
            pushFollow(FOLLOW_rule__Y2__Group__0__Impl_in_rule__Y2__Group__01722);
            rule__Y2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__1_in_rule__Y2__Group__01725);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:897:1: rule__Y2__Group__0__Impl : ( 'Y2' ) ;
    public final void rule__Y2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:901:1: ( ( 'Y2' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:902:1: ( 'Y2' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:902:1: ( 'Y2' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:903:1: 'Y2'
            {
             before(grammarAccess.getY2Access().getY2Keyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Y2__Group__0__Impl1753); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:916:1: rule__Y2__Group__1 : rule__Y2__Group__1__Impl rule__Y2__Group__2 ;
    public final void rule__Y2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:920:1: ( rule__Y2__Group__1__Impl rule__Y2__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:921:2: rule__Y2__Group__1__Impl rule__Y2__Group__2
            {
            pushFollow(FOLLOW_rule__Y2__Group__1__Impl_in_rule__Y2__Group__11784);
            rule__Y2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__2_in_rule__Y2__Group__11787);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:928:1: rule__Y2__Group__1__Impl : ( ( rule__Y2__NameAssignment_1 ) ) ;
    public final void rule__Y2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:932:1: ( ( ( rule__Y2__NameAssignment_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:933:1: ( ( rule__Y2__NameAssignment_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:933:1: ( ( rule__Y2__NameAssignment_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:934:1: ( rule__Y2__NameAssignment_1 )
            {
             before(grammarAccess.getY2Access().getNameAssignment_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:935:1: ( rule__Y2__NameAssignment_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:935:2: rule__Y2__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Y2__NameAssignment_1_in_rule__Y2__Group__1__Impl1814);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:945:1: rule__Y2__Group__2 : rule__Y2__Group__2__Impl rule__Y2__Group__3 ;
    public final void rule__Y2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:949:1: ( rule__Y2__Group__2__Impl rule__Y2__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:950:2: rule__Y2__Group__2__Impl rule__Y2__Group__3
            {
            pushFollow(FOLLOW_rule__Y2__Group__2__Impl_in_rule__Y2__Group__21844);
            rule__Y2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__3_in_rule__Y2__Group__21847);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:957:1: rule__Y2__Group__2__Impl : ( '{' ) ;
    public final void rule__Y2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:961:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:962:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:962:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:963:1: '{'
            {
             before(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Y2__Group__2__Impl1875); 
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:976:1: rule__Y2__Group__3 : rule__Y2__Group__3__Impl rule__Y2__Group__4 ;
    public final void rule__Y2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:980:1: ( rule__Y2__Group__3__Impl rule__Y2__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:981:2: rule__Y2__Group__3__Impl rule__Y2__Group__4
            {
            pushFollow(FOLLOW_rule__Y2__Group__3__Impl_in_rule__Y2__Group__31906);
            rule__Y2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Y2__Group__4_in_rule__Y2__Group__31909);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:988:1: rule__Y2__Group__3__Impl : ( ( rule__Y2__OwnsZAssignment_3 )? ) ;
    public final void rule__Y2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:992:1: ( ( ( rule__Y2__OwnsZAssignment_3 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:993:1: ( ( rule__Y2__OwnsZAssignment_3 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:993:1: ( ( rule__Y2__OwnsZAssignment_3 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:994:1: ( rule__Y2__OwnsZAssignment_3 )?
            {
             before(grammarAccess.getY2Access().getOwnsZAssignment_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:995:1: ( rule__Y2__OwnsZAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:995:2: rule__Y2__OwnsZAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Y2__OwnsZAssignment_3_in_rule__Y2__Group__3__Impl1936);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1005:1: rule__Y2__Group__4 : rule__Y2__Group__4__Impl ;
    public final void rule__Y2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1009:1: ( rule__Y2__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1010:2: rule__Y2__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Y2__Group__4__Impl_in_rule__Y2__Group__41967);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1016:1: rule__Y2__Group__4__Impl : ( '}' ) ;
    public final void rule__Y2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1020:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1021:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1021:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1022:1: '}'
            {
             before(grammarAccess.getY2Access().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Y2__Group__4__Impl1995); 
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


    // $ANTLR start "rule__Root__OwnedXAssignment_3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1046:1: rule__Root__OwnedXAssignment_3 : ( ruleX ) ;
    public final void rule__Root__OwnedXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1050:1: ( ( ruleX ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1051:1: ( ruleX )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1051:1: ( ruleX )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1052:1: ruleX
            {
             before(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_32041);
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


    // $ANTLR start "rule__X__IsA1Assignment_2_0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1061:1: rule__X__IsA1Assignment_2_0 : ( ( 'isA1' ) ) ;
    public final void rule__X__IsA1Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1065:1: ( ( ( 'isA1' ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1066:1: ( ( 'isA1' ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1066:1: ( ( 'isA1' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1067:1: ( 'isA1' )
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_2_0_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1068:1: ( 'isA1' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1069:1: 'isA1'
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_2_0_0()); 
            match(input,18,FOLLOW_18_in_rule__X__IsA1Assignment_2_02077); 
             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_2_0_0()); 

            }

             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_2_0_0()); 

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
    // $ANTLR end "rule__X__IsA1Assignment_2_0"


    // $ANTLR start "rule__X__IsA2Assignment_2_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1084:1: rule__X__IsA2Assignment_2_1 : ( ( 'isA2' ) ) ;
    public final void rule__X__IsA2Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1088:1: ( ( ( 'isA2' ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1089:1: ( ( 'isA2' ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1089:1: ( ( 'isA2' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1090:1: ( 'isA2' )
            {
             before(grammarAccess.getXAccess().getIsA2IsA2Keyword_2_1_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1091:1: ( 'isA2' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1092:1: 'isA2'
            {
             before(grammarAccess.getXAccess().getIsA2IsA2Keyword_2_1_0()); 
            match(input,19,FOLLOW_19_in_rule__X__IsA2Assignment_2_12121); 
             after(grammarAccess.getXAccess().getIsA2IsA2Keyword_2_1_0()); 

            }

             after(grammarAccess.getXAccess().getIsA2IsA2Keyword_2_1_0()); 

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
    // $ANTLR end "rule__X__IsA2Assignment_2_1"


    // $ANTLR start "rule__X__OwnsYAssignment_4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1107:1: rule__X__OwnsYAssignment_4 : ( ruleY ) ;
    public final void rule__X__OwnsYAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1111:1: ( ( ruleY ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1112:1: ( ruleY )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1112:1: ( ruleY )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1113:1: ruleY
            {
             before(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleY_in_rule__X__OwnsYAssignment_42160);
            ruleY();

            state._fsp--;

             after(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__X__OwnsYAssignment_4"


    // $ANTLR start "rule__Z__NameAssignment_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1122:1: rule__Z__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Z__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1126:1: ( ( RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1127:1: ( RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1127:1: ( RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1128:1: RULE_STRING
            {
             before(grammarAccess.getZAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Z__NameAssignment_22191); 
             after(grammarAccess.getZAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Z__NameAssignment_2"


    // $ANTLR start "rule__Y1__NameAssignment_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1137:1: rule__Y1__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Y1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1141:1: ( ( RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1142:1: ( RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1142:1: ( RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1143:1: RULE_STRING
            {
             before(grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Y1__NameAssignment_12222); 
             after(grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1152:1: rule__Y1__OwnsZAssignment_3 : ( ruleZ ) ;
    public final void rule__Y1__OwnsZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1156:1: ( ( ruleZ ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1157:1: ( ruleZ )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1157:1: ( ruleZ )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1158:1: ruleZ
            {
             before(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleZ_in_rule__Y1__OwnsZAssignment_32253);
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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1167:1: rule__Y2__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Y2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1171:1: ( ( RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1172:1: ( RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1172:1: ( RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1173:1: RULE_STRING
            {
             before(grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Y2__NameAssignment_12284); 
             after(grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1182:1: rule__Y2__OwnsZAssignment_3 : ( ruleZ ) ;
    public final void rule__Y2__OwnsZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1186:1: ( ( ruleZ ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1187:1: ( ruleZ )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1187:1: ( ruleZ )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1188:1: ruleZ
            {
             before(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleZ_in_rule__Y2__OwnsZAssignment_32315);
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
    public static final BitSet FOLLOW_ruleY1_in_rule__Y__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY2_in_rule__Y__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__IsA1Assignment_2_0_in_rule__X__Alternatives_2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__IsA2Assignment_2_1_in_rule__X__Alternatives_2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0528 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Root__Group__1__Impl620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__2651 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Root__Group__3_in_rule__Root__Group__2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Root__Group__2__Impl682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__Group__3__Impl_in_rule__Root__Group__3713 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Root__Group__4_in_rule__Root__Group__3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__OwnedXAssignment_3_in_rule__Root__Group__3__Impl743 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Root__Group__4__Impl_in_rule__Root__Group__4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Root__Group__4__Impl802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__0__Impl_in_rule__X__Group__0843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__X__Group__1_in_rule__X__Group__0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__1__Impl_in_rule__X__Group__1904 = new BitSet(new long[]{0x00000000000C1000L});
    public static final BitSet FOLLOW_rule__X__Group__2_in_rule__X__Group__1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__X__Group__1__Impl935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__2__Impl_in_rule__X__Group__2966 = new BitSet(new long[]{0x00000000000C1000L});
    public static final BitSet FOLLOW_rule__X__Group__3_in_rule__X__Group__2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Alternatives_2_in_rule__X__Group__2__Impl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__3__Impl_in_rule__X__Group__31027 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_rule__X__Group__4_in_rule__X__Group__31030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__X__Group__3__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__Group__4__Impl_in_rule__X__Group__41089 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_rule__X__Group__5_in_rule__X__Group__41092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__X__OwnsYAssignment_4_in_rule__X__Group__4__Impl1119 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__X__Group__5__Impl_in_rule__X__Group__51150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__X__Group__5__Impl1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__0__Impl_in_rule__Z__Group__01221 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Z__Group__1_in_rule__Z__Group__01224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__1__Impl_in_rule__Z__Group__11282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Z__Group__2_in_rule__Z__Group__11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Z__Group__1__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__Group__2__Impl_in_rule__Z__Group__21344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Z__NameAssignment_2_in_rule__Z__Group__2__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__0__Impl_in_rule__Y1__Group__01408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Y1__Group__1_in_rule__Y1__Group__01411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Y1__Group__0__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__1__Impl_in_rule__Y1__Group__11470 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Y1__Group__2_in_rule__Y1__Group__11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__NameAssignment_1_in_rule__Y1__Group__1__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__2__Impl_in_rule__Y1__Group__21530 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y1__Group__3_in_rule__Y1__Group__21533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Y1__Group__2__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__3__Impl_in_rule__Y1__Group__31592 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y1__Group__4_in_rule__Y1__Group__31595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__OwnsZAssignment_3_in_rule__Y1__Group__3__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y1__Group__4__Impl_in_rule__Y1__Group__41653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Y1__Group__4__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__0__Impl_in_rule__Y2__Group__01722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Y2__Group__1_in_rule__Y2__Group__01725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Y2__Group__0__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__1__Impl_in_rule__Y2__Group__11784 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Y2__Group__2_in_rule__Y2__Group__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__NameAssignment_1_in_rule__Y2__Group__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__2__Impl_in_rule__Y2__Group__21844 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y2__Group__3_in_rule__Y2__Group__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Y2__Group__2__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__3__Impl_in_rule__Y2__Group__31906 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Y2__Group__4_in_rule__Y2__Group__31909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__OwnsZAssignment_3_in_rule__Y2__Group__3__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Y2__Group__4__Impl_in_rule__Y2__Group__41967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Y2__Group__4__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_32041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__X__IsA1Assignment_2_02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__X__IsA2Assignment_2_12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY_in_rule__X__OwnsYAssignment_42160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Z__NameAssignment_22191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Y1__NameAssignment_12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZ_in_rule__Y1__OwnsZAssignment_32253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Y2__NameAssignment_12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZ_in_rule__Y2__OwnsZAssignment_32315 = new BitSet(new long[]{0x0000000000000002L});

}