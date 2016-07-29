package uk.ac.york.cs.cs2as.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCS2ASDSLLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int RULE_HEX=6;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalCS2ASDSLLexer() {;} 
    public InternalCS2ASDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCS2ASDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:11:7: ( '=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:12:7: ( '||' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:12:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:13:7: ( '&&' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:13:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:14:7: ( 'scopes' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:14:9: 'scopes'
            {
            match("scopes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:15:7: ( 'scopes-occluding' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:15:9: 'scopes-occluding'
            {
            match("scopes-occluding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:16:7: ( 'lookup' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:16:9: 'lookup'
            {
            match("lookup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:17:7: ( 'void' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:17:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:18:7: ( '?' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:18:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:19:7: ( '*' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:19:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:20:7: ( '+' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:21:7: ( 'get' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:21:9: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:22:7: ( 'isSet' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:22:9: 'isSet'
            {
            match("isSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:23:7: ( 'set' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:23:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:24:7: ( 'unset' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:24:9: 'unset'
            {
            match("unset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:25:7: ( 'abstract' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:25:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:26:7: ( 'annotation' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:26:9: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:27:7: ( 'as' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:27:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:28:7: ( 'class' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:28:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:29:7: ( 'container' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:29:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:30:7: ( 'contains' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:30:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:31:7: ( 'convert' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:31:9: 'convert'
            {
            match("convert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:32:7: ( 'create' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:32:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:33:7: ( 'derived' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:33:9: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:34:7: ( 'enum' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:34:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:35:7: ( 'extends' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:35:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:36:7: ( 'extension' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:36:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37:7: ( 'id' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38:7: ( 'import' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:39:7: ( 'keys' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:39:9: 'keys'
            {
            match("keys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:40:7: ( 'interface' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:40:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:41:7: ( 'local' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:41:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:42:7: ( 'op' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:42:9: 'op'
            {
            match("op"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:43:7: ( 'opposite' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:43:9: 'opposite'
            {
            match("opposite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:44:7: ( 'package' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:44:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:45:7: ( 'readonly' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:45:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:46:7: ( 'refers' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:46:9: 'refers'
            {
            match("refers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:47:7: ( 'resolving' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:47:9: 'resolving'
            {
            match("resolving"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:48:7: ( 'static' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:48:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:49:7: ( 'throws' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:49:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:50:7: ( 'transient' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:50:9: 'transient'
            {
            match("transient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:51:7: ( 'unique' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:51:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:52:7: ( 'unordered' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:52:9: 'unordered'
            {
            match("unordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:53:7: ( 'unsettable' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:53:9: 'unsettable'
            {
            match("unsettable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:54:7: ( 'volatile' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:54:9: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:55:7: ( 'wraps' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:55:9: 'wraps'
            {
            match("wraps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:56:7: ( '+=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:56:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:57:7: ( '-=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:57:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:58:7: ( '*=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:58:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:59:7: ( '/=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:59:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:60:7: ( '%=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:60:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:61:7: ( '==' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:61:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:62:7: ( '!=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:62:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:63:7: ( '===' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:63:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:64:7: ( '!==' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:64:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:65:7: ( '>=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:65:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:66:7: ( '>' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:66:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:67:7: ( '<' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:67:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:68:7: ( '->' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:68:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:69:7: ( '..<' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:69:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:70:7: ( '..' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:70:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:71:7: ( '=>' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:71:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:72:7: ( '<>' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:72:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:73:7: ( '?:' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:73:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:74:7: ( '-' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:74:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:75:7: ( '**' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:75:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:76:7: ( '/' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:76:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:77:7: ( '%' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:77:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:78:7: ( '!' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:78:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:79:7: ( '++' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:79:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:80:7: ( '--' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:80:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:81:7: ( '.' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:81:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:82:7: ( 'val' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:82:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:83:7: ( 'super' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:83:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:84:7: ( 'false' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:84:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:85:7: ( 'source' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:85:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:86:7: ( 'target' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:86:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:87:7: ( 'mappings' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:87:9: 'mappings'
            {
            match("mappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:88:7: ( '{' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:88:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:89:7: ( '}' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:89:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:90:7: ( 'map' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:90:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:91:7: ( 'from' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:91:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:92:7: ( 'when' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:92:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:93:7: ( ';' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:93:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:94:7: ( ':=' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:94:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:95:7: ( 'disambiguation' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:95:9: 'disambiguation'
            {
            match("disambiguation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:96:7: ( 'nameresolution' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:96:9: 'nameresolution'
            {
            match("nameresolution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:97:7: ( 'named-element' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:97:9: 'named-element'
            {
            match("named-element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:98:8: ( 'name-property' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:98:10: 'name-property'
            {
            match("name-property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:99:8: ( 'name-referencer' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:99:10: 'name-referencer'
            {
            match("name-referencer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:100:8: ( 'name-qualifier' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:100:10: 'name-qualifier'
            {
            match("name-qualifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:101:8: ( 'name-segments-property' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:101:10: 'name-segments-property'
            {
            match("name-segments-property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:102:8: ( 'qualifies' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:102:10: 'qualifies'
            {
            match("qualifies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:103:8: ( ',' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:103:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:104:8: ( 'filtered' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:104:10: 'filtered'
            {
            match("filtered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:105:8: ( 'by' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:105:10: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:106:8: ( 'using' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:106:10: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:107:8: ( 'occluding' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:107:10: 'occluding'
            {
            match("occluding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:108:8: ( 'for' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:108:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:109:8: ( 'all' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:109:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:110:8: ( 'excepting' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:110:10: 'excepting'
            {
            match("excepting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:111:8: ( 'exports' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:111:10: 'exports'
            {
            match("exports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:112:8: ( 'helpers' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:112:10: 'helpers'
            {
            match("helpers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:113:8: ( '(' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:113:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:114:8: ( ')' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:114:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:115:8: ( ':' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:115:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:116:8: ( 'trace' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:116:10: 'trace'
            {
            match("trace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:117:8: ( '@' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:117:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:118:8: ( 'type' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:118:10: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:119:8: ( '&' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:119:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:120:8: ( '[' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:120:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:121:8: ( ']' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:121:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:122:8: ( 'instanceof' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:122:10: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:123:8: ( '#' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:123:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:124:8: ( 'if' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:124:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:125:8: ( 'else' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:125:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:126:8: ( 'switch' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:126:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:127:8: ( 'default' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:127:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:128:8: ( 'case' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:128:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:129:8: ( 'while' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:129:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:130:8: ( 'do' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:130:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:131:8: ( 'new' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:131:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:132:8: ( 'null' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:132:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:133:8: ( 'typeof' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:133:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:134:8: ( 'throw' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:134:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:135:8: ( 'return' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:135:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:136:8: ( 'try' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:136:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:137:8: ( 'finally' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:137:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:138:8: ( 'synchronized' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:138:10: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:139:8: ( 'catch' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:139:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:140:8: ( 'redefine' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:140:10: 'redefine'
            {
            match("redefine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:141:8: ( 'preceding' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:141:10: 'preceding'
            {
            match("preceding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:142:8: ( 'imported' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:142:10: 'imported'
            {
            match("imported"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:143:8: ( 'scopes-adding' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:143:10: 'scopes-adding'
            {
            match("scopes-adding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:144:8: ( 'scopes-resetting' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:144:10: 'scopes-resetting'
            {
            match("scopes-resetting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:145:8: ( 'also-exports' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:145:10: 'also-exports'
            {
            match("also-exports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:146:8: ( 'lookupFrom' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:146:10: 'lookupFrom'
            {
            match("lookupFrom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:147:8: ( '::' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:147:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:148:8: ( '?.' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:148:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:149:8: ( '|' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:149:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:150:8: ( 'var' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:150:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:151:8: ( 'true' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:151:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37996:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37998:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37998:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:37998:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='B'||LA8_0=='b') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D'||LA8_0=='F'||LA8_0=='L'||LA8_0=='d'||LA8_0=='f'||LA8_0=='l') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38000:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38002:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38002:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38002:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38002:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38002:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:44: ( '\"' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\"') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:79: ( '\\'' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38004:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38006:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38006:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38006:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38006:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:41: ( '\\r' )? '\\n'
                    {
                    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38008:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38010:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38010:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38010:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38012:16: ( . )
            // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:38012:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=150;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:478: T__91
                {
                mT__91(); 

                }
                break;
            case 80 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:484: T__92
                {
                mT__92(); 

                }
                break;
            case 81 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:490: T__93
                {
                mT__93(); 

                }
                break;
            case 82 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:496: T__94
                {
                mT__94(); 

                }
                break;
            case 83 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:502: T__95
                {
                mT__95(); 

                }
                break;
            case 84 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:508: T__96
                {
                mT__96(); 

                }
                break;
            case 85 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:514: T__97
                {
                mT__97(); 

                }
                break;
            case 86 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:520: T__98
                {
                mT__98(); 

                }
                break;
            case 87 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:526: T__99
                {
                mT__99(); 

                }
                break;
            case 88 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:532: T__100
                {
                mT__100(); 

                }
                break;
            case 89 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:539: T__101
                {
                mT__101(); 

                }
                break;
            case 90 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:546: T__102
                {
                mT__102(); 

                }
                break;
            case 91 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:553: T__103
                {
                mT__103(); 

                }
                break;
            case 92 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:560: T__104
                {
                mT__104(); 

                }
                break;
            case 93 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:567: T__105
                {
                mT__105(); 

                }
                break;
            case 94 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:574: T__106
                {
                mT__106(); 

                }
                break;
            case 95 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:581: T__107
                {
                mT__107(); 

                }
                break;
            case 96 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:588: T__108
                {
                mT__108(); 

                }
                break;
            case 97 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:595: T__109
                {
                mT__109(); 

                }
                break;
            case 98 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:602: T__110
                {
                mT__110(); 

                }
                break;
            case 99 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:609: T__111
                {
                mT__111(); 

                }
                break;
            case 100 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:616: T__112
                {
                mT__112(); 

                }
                break;
            case 101 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:623: T__113
                {
                mT__113(); 

                }
                break;
            case 102 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:630: T__114
                {
                mT__114(); 

                }
                break;
            case 103 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:637: T__115
                {
                mT__115(); 

                }
                break;
            case 104 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:644: T__116
                {
                mT__116(); 

                }
                break;
            case 105 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:651: T__117
                {
                mT__117(); 

                }
                break;
            case 106 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:658: T__118
                {
                mT__118(); 

                }
                break;
            case 107 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:665: T__119
                {
                mT__119(); 

                }
                break;
            case 108 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:672: T__120
                {
                mT__120(); 

                }
                break;
            case 109 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:679: T__121
                {
                mT__121(); 

                }
                break;
            case 110 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:686: T__122
                {
                mT__122(); 

                }
                break;
            case 111 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:693: T__123
                {
                mT__123(); 

                }
                break;
            case 112 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:700: T__124
                {
                mT__124(); 

                }
                break;
            case 113 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:707: T__125
                {
                mT__125(); 

                }
                break;
            case 114 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:714: T__126
                {
                mT__126(); 

                }
                break;
            case 115 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:721: T__127
                {
                mT__127(); 

                }
                break;
            case 116 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:728: T__128
                {
                mT__128(); 

                }
                break;
            case 117 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:735: T__129
                {
                mT__129(); 

                }
                break;
            case 118 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:742: T__130
                {
                mT__130(); 

                }
                break;
            case 119 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:749: T__131
                {
                mT__131(); 

                }
                break;
            case 120 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:756: T__132
                {
                mT__132(); 

                }
                break;
            case 121 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:763: T__133
                {
                mT__133(); 

                }
                break;
            case 122 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:770: T__134
                {
                mT__134(); 

                }
                break;
            case 123 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:777: T__135
                {
                mT__135(); 

                }
                break;
            case 124 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:784: T__136
                {
                mT__136(); 

                }
                break;
            case 125 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:791: T__137
                {
                mT__137(); 

                }
                break;
            case 126 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:798: T__138
                {
                mT__138(); 

                }
                break;
            case 127 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:805: T__139
                {
                mT__139(); 

                }
                break;
            case 128 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:812: T__140
                {
                mT__140(); 

                }
                break;
            case 129 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:819: T__141
                {
                mT__141(); 

                }
                break;
            case 130 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:826: T__142
                {
                mT__142(); 

                }
                break;
            case 131 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:833: T__143
                {
                mT__143(); 

                }
                break;
            case 132 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:840: T__144
                {
                mT__144(); 

                }
                break;
            case 133 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:847: T__145
                {
                mT__145(); 

                }
                break;
            case 134 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:854: T__146
                {
                mT__146(); 

                }
                break;
            case 135 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:861: T__147
                {
                mT__147(); 

                }
                break;
            case 136 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:868: T__148
                {
                mT__148(); 

                }
                break;
            case 137 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:875: T__149
                {
                mT__149(); 

                }
                break;
            case 138 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:882: T__150
                {
                mT__150(); 

                }
                break;
            case 139 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:889: T__151
                {
                mT__151(); 

                }
                break;
            case 140 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:896: T__152
                {
                mT__152(); 

                }
                break;
            case 141 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:903: T__153
                {
                mT__153(); 

                }
                break;
            case 142 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:910: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 143 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:919: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 144 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:928: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 145 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:941: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 146 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:949: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 147 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:961: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 148 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:977: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 149 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:993: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 150 :
                // ../uk.ac.york.cs.cs2as.dsl.ui/src-gen/uk/ac/york/cs/cs2as/ui/contentassist/antlr/internal/InternalCS2ASDSL.g:1:1001: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\71\1\73\1\75\3\105\1\113\1\116\1\121\15\105\1\167\1"+
        "\173\1\175\1\177\1\u0081\1\u0083\1\u0085\2\105\3\uffff\1\u0090\2"+
        "\105\1\uffff\2\105\6\uffff\2\u009f\1\66\5\uffff\1\u00a5\6\uffff"+
        "\7\105\1\uffff\3\105\11\uffff\2\105\1\u00b5\2\105\1\u00b9\4\105"+
        "\1\u00c0\7\105\1\u00cb\4\105\1\u00d3\12\105\12\uffff\1\u00e6\5\uffff"+
        "\1\u00e8\1\uffff\5\105\6\uffff\4\105\1\uffff\1\u00f3\1\105\10\uffff"+
        "\1\u009f\5\uffff\1\105\1\u00f6\11\105\1\u0100\1\u0101\1\u0102\1"+
        "\105\1\uffff\3\105\1\uffff\6\105\1\uffff\1\u010d\11\105\1\uffff"+
        "\7\105\1\uffff\12\105\1\u012a\6\105\4\uffff\4\105\1\u0135\1\u0137"+
        "\1\105\1\u0139\2\105\1\uffff\2\105\1\uffff\7\105\1\u0145\1\105\3"+
        "\uffff\12\105\1\uffff\5\105\1\u0156\4\105\1\u015b\3\105\1\u015f"+
        "\1\u0160\14\105\1\uffff\1\u016d\1\105\1\u0170\1\105\1\u0172\2\105"+
        "\1\u0175\2\105\1\uffff\1\105\1\uffff\1\105\1\uffff\1\u017c\4\105"+
        "\1\u0181\4\105\1\u0186\1\uffff\1\105\1\u0188\3\105\1\u018d\2\105"+
        "\1\u0190\2\105\1\uffff\1\u0193\3\105\1\uffff\1\u0197\3\105\1\uffff"+
        "\3\105\2\uffff\11\105\1\u01a9\1\105\1\u01ab\1\uffff\2\105\1\uffff"+
        "\1\u01ae\1\uffff\1\u01af\1\u01b0\1\uffff\5\105\2\uffff\2\105\1\u01bd"+
        "\1\u01be\1\uffff\1\u01bf\1\u01c0\1\105\1\u01c3\1\uffff\1\105\1\uffff"+
        "\1\u01c6\3\105\1\uffff\1\u01ca\1\105\1\uffff\2\105\1\uffff\2\105"+
        "\1\u01d0\1\uffff\14\105\1\u01dd\1\105\1\u01df\1\105\1\u01e1\1\uffff"+
        "\1\105\1\uffff\1\u01e3\1\u01e4\3\uffff\4\105\5\uffff\2\105\5\uffff"+
        "\2\105\1\uffff\2\105\1\uffff\3\105\1\uffff\4\105\1\u01fa\1\uffff"+
        "\1\u01fb\1\u01fc\1\105\1\u01fe\2\105\1\u0201\2\105\1\u0204\2\105"+
        "\1\uffff\1\105\1\uffff\1\105\1\uffff\1\105\2\uffff\1\105\1\u020b"+
        "\3\105\1\u020f\3\uffff\2\105\1\u0212\1\u0213\4\105\1\u0218\2\105"+
        "\1\u021b\3\uffff\1\105\1\uffff\2\105\1\uffff\1\u021f\1\105\1\uffff"+
        "\1\105\1\u0222\1\105\1\u0224\1\105\1\u0226\1\uffff\1\u0227\2\105"+
        "\1\uffff\2\105\2\uffff\1\u022c\2\105\1\u022f\1\uffff\1\105\1\u0231"+
        "\1\uffff\1\105\1\u0233\1\u0234\1\uffff\1\u0235\1\u0236\1\uffff\1"+
        "\u0237\1\uffff\1\u0238\2\uffff\1\105\1\u023a\1\105\1\u023c\1\uffff"+
        "\1\u023d\1\u023e\1\uffff\1\u023f\1\uffff\1\105\6\uffff\1\105\1\uffff"+
        "\1\105\4\uffff\2\105\1\u0245\2\105\1\uffff\2\105\1\u024a\1\u024b"+
        "\2\uffff";
    static final String DFA21_eofS =
        "\u024c\uffff";
    static final String DFA21_minS =
        "\1\0\1\75\1\174\1\46\1\143\1\157\1\141\1\56\1\52\1\53\1\145\1\144"+
        "\1\156\1\142\1\141\1\145\1\154\1\145\1\143\1\141\1\145\1\141\1\150"+
        "\1\55\1\52\3\75\1\76\1\56\2\141\3\uffff\1\72\1\141\1\165\1\uffff"+
        "\1\171\1\145\6\uffff\2\60\1\44\5\uffff\1\75\6\uffff\1\157\1\164"+
        "\1\141\1\160\1\165\1\151\1\156\1\uffff\1\143\1\151\1\154\11\uffff"+
        "\1\164\1\123\1\44\1\160\1\163\1\44\2\151\1\163\1\156\1\44\1\154"+
        "\1\141\1\156\1\145\1\163\1\146\1\163\1\44\1\165\1\143\1\163\1\171"+
        "\1\44\2\143\1\145\1\141\1\162\1\141\1\162\1\160\1\141\1\145\12\uffff"+
        "\1\75\5\uffff\1\74\1\uffff\1\154\1\157\1\154\1\162\1\160\6\uffff"+
        "\1\155\1\167\1\154\1\141\1\uffff\1\44\1\154\10\uffff\1\60\5\uffff"+
        "\1\160\1\44\1\164\1\145\1\162\1\164\1\143\1\153\1\141\1\144\1\141"+
        "\3\44\1\145\1\uffff\1\157\1\145\1\164\1\uffff\1\145\1\161\1\162"+
        "\1\156\1\164\1\157\1\uffff\1\44\1\157\1\163\1\164\1\141\1\145\1"+
        "\143\1\151\2\141\1\uffff\1\155\2\145\1\157\1\145\1\163\1\157\1\uffff"+
        "\1\154\1\153\1\143\1\144\1\145\1\157\1\165\1\145\1\157\1\143\1\44"+
        "\1\145\1\147\1\145\1\160\1\156\1\154\4\uffff\1\163\1\155\1\164\1"+
        "\141\2\44\1\145\1\44\2\154\1\uffff\1\160\1\145\1\uffff\1\151\1\162"+
        "\2\143\1\150\1\165\1\154\1\44\1\164\3\uffff\1\164\2\162\1\141\1"+
        "\164\1\165\1\144\1\147\1\162\1\164\1\uffff\1\55\1\163\1\141\1\145"+
        "\1\164\1\44\1\150\1\166\1\165\1\155\1\44\1\156\1\160\1\162\2\44"+
        "\1\163\1\165\1\141\1\145\1\157\1\162\1\154\1\162\1\146\1\167\1\163"+
        "\1\145\1\uffff\1\44\1\145\1\44\1\163\1\44\2\145\1\44\1\145\1\154"+
        "\1\uffff\1\151\1\uffff\1\55\1\uffff\1\44\1\151\1\145\1\163\1\143"+
        "\1\44\1\145\1\150\1\162\1\160\1\44\1\uffff\1\151\1\44\1\164\1\146"+
        "\1\156\1\44\2\145\1\44\2\141\1\uffff\1\44\1\151\1\162\1\145\1\uffff"+
        "\1\44\1\145\1\154\1\142\1\uffff\1\144\2\164\2\uffff\1\151\1\144"+
        "\1\147\1\144\1\156\1\163\1\166\1\156\1\151\1\44\1\151\1\44\1\uffff"+
        "\1\164\1\146\1\uffff\1\44\1\uffff\2\44\1\uffff\1\162\1\154\1\156"+
        "\1\145\1\55\1\160\1\uffff\1\146\1\162\2\44\1\uffff\2\44\1\157\1"+
        "\44\1\uffff\1\154\1\uffff\1\44\1\141\1\143\1\141\1\uffff\1\44\1"+
        "\162\1\uffff\1\143\1\164\1\uffff\1\156\1\164\1\44\1\uffff\1\144"+
        "\1\164\1\151\1\163\2\151\1\163\1\164\1\151\1\145\1\151\1\154\1\44"+
        "\1\151\1\44\1\156\1\44\1\uffff\1\145\1\uffff\2\44\3\uffff\1\145"+
        "\1\171\1\147\1\163\5\uffff\1\151\1\163\1\141\4\uffff\1\156\1\162"+
        "\1\uffff\1\145\1\144\1\uffff\1\143\1\145\1\142\1\uffff\1\145\1\164"+
        "\1\151\1\145\1\44\1\uffff\2\44\1\147\1\44\1\157\1\156\1\44\1\145"+
        "\1\156\1\44\1\156\1\171\1\uffff\1\156\1\uffff\1\145\1\uffff\1\156"+
        "\2\uffff\1\144\1\44\1\163\1\157\1\145\1\44\3\uffff\1\151\1\157\2"+
        "\44\1\145\1\157\1\154\1\144\1\44\1\157\1\162\1\44\3\uffff\1\165"+
        "\1\uffff\1\156\1\147\1\uffff\1\44\1\147\1\uffff\1\147\1\44\1\147"+
        "\1\44\1\164\1\44\1\uffff\1\44\1\154\1\163\1\uffff\1\172\1\155\2"+
        "\uffff\1\44\1\146\1\145\1\44\1\uffff\1\156\1\44\1\uffff\1\141\2"+
        "\44\1\uffff\2\44\1\uffff\1\44\1\uffff\1\44\2\uffff\1\165\1\44\1"+
        "\145\1\44\1\uffff\2\44\1\uffff\1\44\1\uffff\1\164\6\uffff\1\164"+
        "\1\uffff\1\144\4\uffff\2\151\1\44\2\157\1\uffff\2\156\2\44\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\76\1\174\1\46\1\171\2\157\1\72\2\75\1\145\3\163\1\162"+
        "\1\157\1\170\1\145\1\160\1\162\1\145\1\171\1\162\1\76\4\75\1\76"+
        "\1\56\1\162\1\141\3\uffff\1\75\2\165\1\uffff\1\171\1\145\6\uffff"+
        "\1\170\1\154\1\172\5\uffff\1\75\6\uffff\1\157\1\164\1\141\1\160"+
        "\1\165\1\151\1\156\1\uffff\1\157\1\154\1\162\11\uffff\1\164\1\123"+
        "\1\172\1\160\1\164\1\172\1\163\1\151\1\163\1\156\1\172\1\163\1\141"+
        "\1\156\1\145\1\164\1\162\1\163\1\172\1\165\1\164\1\163\1\171\1\172"+
        "\2\143\1\145\1\164\1\162\1\171\1\162\1\160\1\141\1\151\12\uffff"+
        "\1\75\5\uffff\1\74\1\uffff\1\154\1\157\1\156\1\162\1\160\6\uffff"+
        "\1\155\1\167\1\154\1\141\1\uffff\1\172\1\154\10\uffff\1\154\5\uffff"+
        "\1\160\1\172\1\164\1\145\1\162\1\164\1\143\1\153\1\141\1\144\1\141"+
        "\3\172\1\145\1\uffff\1\157\1\145\1\164\1\uffff\1\145\1\161\1\162"+
        "\1\156\1\164\1\157\1\uffff\1\172\1\157\1\163\1\166\1\141\1\145\1"+
        "\143\1\151\2\141\1\uffff\1\155\2\145\1\157\1\145\1\163\1\157\1\uffff"+
        "\1\154\1\153\1\143\1\144\1\145\1\157\1\165\1\145\1\157\1\156\1\172"+
        "\1\145\1\147\1\145\1\160\1\156\1\154\4\uffff\1\163\1\155\1\164\1"+
        "\141\2\172\1\145\1\172\2\154\1\uffff\1\160\1\145\1\uffff\1\151\1"+
        "\162\2\143\1\150\1\165\1\154\1\172\1\164\3\uffff\1\164\2\162\1\141"+
        "\1\164\1\165\1\144\1\147\1\162\1\164\1\uffff\1\55\1\163\1\141\1"+
        "\145\1\164\1\172\1\150\1\166\1\165\1\155\1\172\1\156\1\160\1\162"+
        "\2\172\1\163\1\165\1\141\1\145\1\157\1\162\1\154\1\162\1\146\1\167"+
        "\1\163\1\145\1\uffff\1\172\1\145\1\172\1\163\1\172\2\145\1\172\1"+
        "\145\1\154\1\uffff\1\151\1\uffff\1\162\1\uffff\1\172\1\151\1\145"+
        "\1\163\1\143\1\172\1\145\1\150\1\162\1\160\1\172\1\uffff\1\151\1"+
        "\172\1\164\1\146\1\156\1\172\2\145\1\172\2\141\1\uffff\1\172\1\151"+
        "\1\162\1\145\1\uffff\1\172\1\145\1\154\1\142\1\uffff\1\163\2\164"+
        "\2\uffff\1\151\1\144\1\147\1\144\1\156\1\163\1\166\1\156\1\151\1"+
        "\172\1\151\1\172\1\uffff\1\164\1\146\1\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\1\162\1\154\1\156\1\145\1\55\1\163\1\uffff\1\146\1\162"+
        "\2\172\1\uffff\2\172\1\157\1\172\1\uffff\1\154\1\uffff\1\172\1\141"+
        "\1\143\1\141\1\uffff\1\172\1\162\1\uffff\1\143\1\164\1\uffff\1\156"+
        "\1\164\1\172\1\uffff\1\144\1\164\1\151\1\163\2\151\1\163\1\164\1"+
        "\151\1\145\1\151\1\154\1\172\1\151\1\172\1\156\1\172\1\uffff\1\145"+
        "\1\uffff\2\172\3\uffff\1\145\1\171\1\147\1\163\5\uffff\1\151\1\163"+
        "\1\162\4\uffff\1\156\1\162\1\uffff\1\145\1\144\1\uffff\1\143\1\145"+
        "\1\142\1\uffff\1\145\1\164\1\151\1\163\1\172\1\uffff\2\172\1\147"+
        "\1\172\1\157\1\156\1\172\1\145\1\156\1\172\1\156\1\171\1\uffff\1"+
        "\156\1\uffff\1\145\1\uffff\1\156\2\uffff\1\144\1\172\1\163\1\157"+
        "\1\145\1\172\3\uffff\1\151\1\157\2\172\1\145\1\157\1\154\1\144\1"+
        "\172\1\157\1\162\1\172\3\uffff\1\165\1\uffff\1\156\1\147\1\uffff"+
        "\1\172\1\147\1\uffff\1\147\1\172\1\147\1\172\1\164\1\172\1\uffff"+
        "\1\172\1\154\1\163\1\uffff\1\172\1\155\2\uffff\1\172\1\146\1\145"+
        "\1\172\1\uffff\1\156\1\172\1\uffff\1\141\2\172\1\uffff\2\172\1\uffff"+
        "\1\172\1\uffff\1\172\2\uffff\1\165\1\172\1\145\1\172\1\uffff\2\172"+
        "\1\uffff\1\172\1\uffff\1\164\6\uffff\1\164\1\uffff\1\144\4\uffff"+
        "\2\151\1\172\2\157\1\uffff\2\156\2\172\2\uffff";
    static final String DFA21_acceptS =
        "\40\uffff\1\116\1\117\1\123\3\uffff\1\135\2\uffff\1\147\1\150\1"+
        "\153\1\156\1\157\1\161\3\uffff\1\u0091\2\u0092\1\u0095\1\u0096\1"+
        "\uffff\1\75\1\1\1\2\1\u008b\1\3\1\155\7\uffff\1\u0091\3\uffff\1"+
        "\77\1\u008a\1\10\1\60\1\101\1\11\1\56\1\105\1\12\42\uffff\1\57\1"+
        "\72\1\106\1\100\1\61\1\u0093\1\u0094\1\102\1\62\1\103\1\uffff\1"+
        "\104\1\67\1\70\1\76\1\71\1\uffff\1\107\5\uffff\1\116\1\117\1\123"+
        "\1\124\1\u0089\1\151\4\uffff\1\135\2\uffff\1\147\1\150\1\153\1\156"+
        "\1\157\1\161\1\u008e\1\u008f\1\uffff\1\u0090\1\u0092\1\u0095\1\65"+
        "\1\63\17\uffff\1\33\3\uffff\1\162\6\uffff\1\21\12\uffff\1\170\7"+
        "\uffff\1\40\21\uffff\1\66\1\64\1\73\1\74\12\uffff\1\137\2\uffff"+
        "\1\15\11\uffff\1\110\1\u008c\1\13\12\uffff\1\143\34\uffff\1\176"+
        "\12\uffff\1\142\1\uffff\1\120\1\uffff\1\171\13\uffff\1\7\13\uffff"+
        "\1\u0087\4\uffff\1\166\4\uffff\1\30\3\uffff\1\163\1\35\14\uffff"+
        "\1\u008d\2\uffff\1\154\1\uffff\1\122\2\uffff\1\121\6\uffff\1\172"+
        "\4\uffff\1\111\4\uffff\1\37\1\uffff\1\14\4\uffff\1\16\2\uffff\1"+
        "\140\2\uffff\1\22\3\uffff\1\u0081\21\uffff\1\174\1\uffff\1\152\2"+
        "\uffff\1\55\1\167\1\112\4\uffff\1\127\1\130\1\131\1\132\1\133\3"+
        "\uffff\1\4\1\46\1\113\1\164\2\uffff\1\6\2\uffff\1\34\3\uffff\1\51"+
        "\5\uffff\1\26\14\uffff\1\44\1\uffff\1\175\1\uffff\1\47\1\uffff\1"+
        "\114\1\173\6\uffff\1\5\1\u0085\1\u0086\14\uffff\1\25\1\27\1\165"+
        "\1\uffff\1\31\2\uffff\1\145\2\uffff\1\42\6\uffff\1\177\3\uffff\1"+
        "\146\2\uffff\1\54\1\u0084\4\uffff\1\17\2\uffff\1\24\3\uffff\1\41"+
        "\2\uffff\1\43\1\uffff\1\u0082\1\uffff\1\136\1\115\4\uffff\1\36\2"+
        "\uffff\1\52\1\uffff\1\23\1\uffff\1\32\1\144\1\141\1\u0083\1\45\1"+
        "\50\1\uffff\1\134\1\uffff\1\u0088\1\160\1\53\1\20\5\uffff\1\u0080"+
        "\4\uffff\1\125\1\126";
    static final String DFA21_specialS =
        "\1\0\u024b\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\32\1\63\1\56\1\62\1\31\1"+
            "\3\1\64\1\51\1\52\1\10\1\11\1\46\1\27\1\35\1\30\1\57\11\60\1"+
            "\43\1\42\1\34\1\1\1\33\1\7\1\53\32\62\1\54\1\66\1\55\1\61\1"+
            "\62\1\66\1\15\1\47\1\16\1\17\1\20\1\36\1\12\1\50\1\13\1\62\1"+
            "\21\1\5\1\37\1\44\1\22\1\23\1\45\1\24\1\4\1\25\1\14\1\6\1\26"+
            "\3\62\1\40\1\2\1\41\uff82\66",
            "\1\67\1\70",
            "\1\72",
            "\1\74",
            "\1\76\1\uffff\1\77\11\uffff\1\102\4\uffff\1\100\1\101\1\uffff"+
            "\1\103\1\uffff\1\104",
            "\1\106",
            "\1\110\15\uffff\1\107",
            "\1\112\13\uffff\1\111",
            "\1\115\22\uffff\1\114",
            "\1\120\21\uffff\1\117",
            "\1\122",
            "\1\124\1\uffff\1\127\6\uffff\1\125\1\126\4\uffff\1\123",
            "\1\130\4\uffff\1\131",
            "\1\132\11\uffff\1\135\1\uffff\1\133\4\uffff\1\134",
            "\1\141\12\uffff\1\136\2\uffff\1\137\2\uffff\1\140",
            "\1\142\3\uffff\1\143\5\uffff\1\144",
            "\1\147\1\uffff\1\145\11\uffff\1\146",
            "\1\150",
            "\1\152\14\uffff\1\151",
            "\1\153\20\uffff\1\154",
            "\1\155",
            "\1\160\6\uffff\1\156\11\uffff\1\157\6\uffff\1\161",
            "\1\163\11\uffff\1\162",
            "\1\166\17\uffff\1\164\1\165",
            "\1\171\4\uffff\1\172\15\uffff\1\170",
            "\1\174",
            "\1\176",
            "\1\u0080",
            "\1\u0082",
            "\1\u0084",
            "\1\u0086\7\uffff\1\u0088\5\uffff\1\u0089\2\uffff\1\u0087",
            "\1\u008a",
            "",
            "",
            "",
            "\1\u008f\2\uffff\1\u008e",
            "\1\u0091\3\uffff\1\u0092\17\uffff\1\u0093",
            "\1\u0094",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a0\10\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1\u00a1"+
            "\13\uffff\1\u009e\6\uffff\1\u00a0\2\uffff\1\u00a1\1\uffff\3"+
            "\u00a1\5\uffff\1\u00a1\13\uffff\1\u009e",
            "\12\u00a0\10\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1\u00a1"+
            "\22\uffff\1\u00a0\2\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1"+
            "\u00a1",
            "\1\105\34\uffff\32\105\4\uffff\1\105\1\uffff\32\105",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ae\13\uffff\1\u00ad",
            "\1\u00af\2\uffff\1\u00b0",
            "\1\u00b1\5\uffff\1\u00b2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u00b6",
            "\1\u00b8\1\u00b7",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u00bb\5\uffff\1\u00bc\3\uffff\1\u00ba",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u00c1\6\uffff\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6\1\u00c7",
            "\1\u00c9\13\uffff\1\u00c8",
            "\1\u00ca",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u00cc",
            "\1\u00ce\14\uffff\1\u00cf\3\uffff\1\u00cd",
            "\1\u00d0",
            "\1\u00d1",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\17\105\1\u00d2\12\105",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\2\uffff\1\u00db\1\uffff\1\u00d8\14\uffff\1\u00d9"+
            "\1\u00da",
            "\1\u00dc",
            "\1\u00dd\23\uffff\1\u00df\3\uffff\1\u00de",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3\3\uffff\1\u00e4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e5",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb\1\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u00f4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a0\10\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1\u00a1"+
            "\22\uffff\1\u00a0\2\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1"+
            "\u00a1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f5",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110\1\uffff\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0129\12\uffff\1\u0128",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "",
            "",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\17\105\1\u0136\12\105",
            "\1\u0138",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0146",
            "",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u016e",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\16\105\1\u016f\13\105",
            "\1\u0171",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0173",
            "\1\u0174",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "",
            "\1\u017b\66\uffff\1\u017a\15\uffff\1\u0179",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u0187",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\23\105\1\u018c\6\105",
            "\1\u018e",
            "\1\u018f",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "",
            "\1\u019b\16\uffff\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\22\105\1\u01a8\7\105",
            "\1\u01aa",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6\1\u01b8\1\u01b7\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\105\10\uffff\1\u01bc\2\uffff\12\105\7\uffff\32\105\4\uffff"+
            "\1\105\1\uffff\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u01c1",
            "\1\105\13\uffff\12\105\7\uffff\5\105\1\u01c2\24\105\4\uffff"+
            "\1\105\1\uffff\32\105",
            "",
            "\1\u01c4",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\4\105\1\u01c5\25\105",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u01de",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u01e0",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u01e2",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "",
            "",
            "",
            "",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01ec\15\uffff\1\u01eb\2\uffff\1\u01ed",
            "",
            "",
            "",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8\15\uffff\1\u01f9",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u01fd",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u01ff",
            "\1\u0200",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0202",
            "\1\u0203",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0205",
            "\1\u0206",
            "",
            "\1\u0207",
            "",
            "\1\u0208",
            "",
            "\1\u0209",
            "",
            "",
            "\1\u020a",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "",
            "",
            "\1\u0210",
            "\1\u0211",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0219",
            "\1\u021a",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "",
            "",
            "\1\u021c",
            "",
            "\1\u021d",
            "\1\u021e",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0220",
            "",
            "\1\u0221",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0223",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0225",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0228",
            "\1\u0229",
            "",
            "\1\u022a",
            "\1\u022b",
            "",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u022d",
            "\1\u022e",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u0230",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u0232",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "",
            "\1\u0239",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u023b",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            "\1\u0240",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0241",
            "",
            "\1\u0242",
            "",
            "",
            "",
            "",
            "\1\u0243",
            "\1\u0244",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\u0246",
            "\1\u0247",
            "",
            "\1\u0248",
            "\1\u0249",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\13\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    static class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='=') ) {s = 1;}

                        else if ( (LA21_0=='|') ) {s = 2;}

                        else if ( (LA21_0=='&') ) {s = 3;}

                        else if ( (LA21_0=='s') ) {s = 4;}

                        else if ( (LA21_0=='l') ) {s = 5;}

                        else if ( (LA21_0=='v') ) {s = 6;}

                        else if ( (LA21_0=='?') ) {s = 7;}

                        else if ( (LA21_0=='*') ) {s = 8;}

                        else if ( (LA21_0=='+') ) {s = 9;}

                        else if ( (LA21_0=='g') ) {s = 10;}

                        else if ( (LA21_0=='i') ) {s = 11;}

                        else if ( (LA21_0=='u') ) {s = 12;}

                        else if ( (LA21_0=='a') ) {s = 13;}

                        else if ( (LA21_0=='c') ) {s = 14;}

                        else if ( (LA21_0=='d') ) {s = 15;}

                        else if ( (LA21_0=='e') ) {s = 16;}

                        else if ( (LA21_0=='k') ) {s = 17;}

                        else if ( (LA21_0=='o') ) {s = 18;}

                        else if ( (LA21_0=='p') ) {s = 19;}

                        else if ( (LA21_0=='r') ) {s = 20;}

                        else if ( (LA21_0=='t') ) {s = 21;}

                        else if ( (LA21_0=='w') ) {s = 22;}

                        else if ( (LA21_0=='-') ) {s = 23;}

                        else if ( (LA21_0=='/') ) {s = 24;}

                        else if ( (LA21_0=='%') ) {s = 25;}

                        else if ( (LA21_0=='!') ) {s = 26;}

                        else if ( (LA21_0=='>') ) {s = 27;}

                        else if ( (LA21_0=='<') ) {s = 28;}

                        else if ( (LA21_0=='.') ) {s = 29;}

                        else if ( (LA21_0=='f') ) {s = 30;}

                        else if ( (LA21_0=='m') ) {s = 31;}

                        else if ( (LA21_0=='{') ) {s = 32;}

                        else if ( (LA21_0=='}') ) {s = 33;}

                        else if ( (LA21_0==';') ) {s = 34;}

                        else if ( (LA21_0==':') ) {s = 35;}

                        else if ( (LA21_0=='n') ) {s = 36;}

                        else if ( (LA21_0=='q') ) {s = 37;}

                        else if ( (LA21_0==',') ) {s = 38;}

                        else if ( (LA21_0=='b') ) {s = 39;}

                        else if ( (LA21_0=='h') ) {s = 40;}

                        else if ( (LA21_0=='(') ) {s = 41;}

                        else if ( (LA21_0==')') ) {s = 42;}

                        else if ( (LA21_0=='@') ) {s = 43;}

                        else if ( (LA21_0=='[') ) {s = 44;}

                        else if ( (LA21_0==']') ) {s = 45;}

                        else if ( (LA21_0=='#') ) {s = 46;}

                        else if ( (LA21_0=='0') ) {s = 47;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 48;}

                        else if ( (LA21_0=='^') ) {s = 49;}

                        else if ( (LA21_0=='$'||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='j'||(LA21_0>='x' && LA21_0<='z')) ) {s = 50;}

                        else if ( (LA21_0=='\"') ) {s = 51;}

                        else if ( (LA21_0=='\'') ) {s = 52;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 53;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}