package org.xtext.example.delphi.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDelphiLexer extends Lexer {
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
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
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
    public static final int RULE_DQVALUE=8;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int RULE_QVALUE=7;
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
    public static final int RULE_LINE_COMMENT=14;
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
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_SLASH=9;
    public static final int RULE_MORECOMMENT=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_QUOTE=10;
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
    public static final int RULE_DOUBLEQUOTE=11;
    public static final int RULE_WS=15;
    public static final int RULE_COMMENT=12;
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

    public InternalDelphiLexer() {;} 
    public InternalDelphiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDelphiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDelphi.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:11:7: ( 'program' )
            // InternalDelphi.g:11:9: 'program'
            {
            match("program"); 


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
            // InternalDelphi.g:12:7: ( '(' )
            // InternalDelphi.g:12:9: '('
            {
            match('('); 

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
            // InternalDelphi.g:13:7: ( ')' )
            // InternalDelphi.g:13:9: ')'
            {
            match(')'); 

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
            // InternalDelphi.g:14:7: ( ';' )
            // InternalDelphi.g:14:9: ';'
            {
            match(';'); 

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
            // InternalDelphi.g:15:7: ( '.' )
            // InternalDelphi.g:15:9: '.'
            {
            match('.'); 

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
            // InternalDelphi.g:16:7: ( 'unit' )
            // InternalDelphi.g:16:9: 'unit'
            {
            match("unit"); 


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
            // InternalDelphi.g:17:7: ( 'package' )
            // InternalDelphi.g:17:9: 'package'
            {
            match("package"); 


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
            // InternalDelphi.g:18:7: ( 'end' )
            // InternalDelphi.g:18:9: 'end'
            {
            match("end"); 


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
            // InternalDelphi.g:19:7: ( 'library' )
            // InternalDelphi.g:19:9: 'library'
            {
            match("library"); 


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
            // InternalDelphi.g:20:7: ( 'uses' )
            // InternalDelphi.g:20:9: 'uses'
            {
            match("uses"); 


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
            // InternalDelphi.g:21:7: ( 'platform' )
            // InternalDelphi.g:21:9: 'platform'
            {
            match("platform"); 


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
            // InternalDelphi.g:22:7: ( 'deprecated' )
            // InternalDelphi.g:22:9: 'deprecated'
            {
            match("deprecated"); 


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
            // InternalDelphi.g:23:7: ( 'interface' )
            // InternalDelphi.g:23:9: 'interface'
            {
            match("interface"); 


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
            // InternalDelphi.g:24:7: ( 'implementation' )
            // InternalDelphi.g:24:9: 'implementation'
            {
            match("implementation"); 


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
            // InternalDelphi.g:25:7: ( 'name' )
            // InternalDelphi.g:25:9: 'name'
            {
            match("name"); 


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
            // InternalDelphi.g:26:7: ( 'index' )
            // InternalDelphi.g:26:9: 'index'
            {
            match("index"); 


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
            // InternalDelphi.g:27:7: ( 'exports' )
            // InternalDelphi.g:27:9: 'exports'
            {
            match("exports"); 


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
            // InternalDelphi.g:28:7: ( ',' )
            // InternalDelphi.g:28:9: ','
            {
            match(','); 

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
            // InternalDelphi.g:29:7: ( 'label' )
            // InternalDelphi.g:29:9: 'label'
            {
            match("label"); 


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
            // InternalDelphi.g:30:7: ( 'const' )
            // InternalDelphi.g:30:9: 'const'
            {
            match("const"); 


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
            // InternalDelphi.g:31:7: ( '=' )
            // InternalDelphi.g:31:9: '='
            {
            match('='); 

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
            // InternalDelphi.g:32:7: ( ':' )
            // InternalDelphi.g:32:9: ':'
            {
            match(':'); 

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
            // InternalDelphi.g:33:7: ( 'type' )
            // InternalDelphi.g:33:9: 'type'
            {
            match("type"); 


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
            // InternalDelphi.g:34:7: ( 'class' )
            // InternalDelphi.g:34:9: 'class'
            {
            match("class"); 


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
            // InternalDelphi.g:35:7: ( 'of' )
            // InternalDelphi.g:35:9: 'of'
            {
            match("of"); 


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
            // InternalDelphi.g:36:7: ( 'real48' )
            // InternalDelphi.g:36:9: 'real48'
            {
            match("real48"); 


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
            // InternalDelphi.g:37:7: ( 'real' )
            // InternalDelphi.g:37:9: 'real'
            {
            match("real"); 


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
            // InternalDelphi.g:38:7: ( 'single' )
            // InternalDelphi.g:38:9: 'single'
            {
            match("single"); 


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
            // InternalDelphi.g:39:7: ( 'double' )
            // InternalDelphi.g:39:9: 'double'
            {
            match("double"); 


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
            // InternalDelphi.g:40:7: ( 'extended' )
            // InternalDelphi.g:40:9: 'extended'
            {
            match("extended"); 


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
            // InternalDelphi.g:41:7: ( 'currency' )
            // InternalDelphi.g:41:9: 'currency'
            {
            match("currency"); 


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
            // InternalDelphi.g:42:7: ( 'comp' )
            // InternalDelphi.g:42:9: 'comp'
            {
            match("comp"); 


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
            // InternalDelphi.g:43:7: ( 'shortint' )
            // InternalDelphi.g:43:9: 'shortint'
            {
            match("shortint"); 


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
            // InternalDelphi.g:44:7: ( 'smallint' )
            // InternalDelphi.g:44:9: 'smallint'
            {
            match("smallint"); 


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
            // InternalDelphi.g:45:7: ( 'integer' )
            // InternalDelphi.g:45:9: 'integer'
            {
            match("integer"); 


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
            // InternalDelphi.g:46:7: ( 'byte' )
            // InternalDelphi.g:46:9: 'byte'
            {
            match("byte"); 


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
            // InternalDelphi.g:47:7: ( 'longint' )
            // InternalDelphi.g:47:9: 'longint'
            {
            match("longint"); 


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
            // InternalDelphi.g:48:7: ( 'int64' )
            // InternalDelphi.g:48:9: 'int64'
            {
            match("int64"); 


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
            // InternalDelphi.g:49:7: ( 'word' )
            // InternalDelphi.g:49:9: 'word'
            {
            match("word"); 


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
            // InternalDelphi.g:50:7: ( 'boolean' )
            // InternalDelphi.g:50:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalDelphi.g:51:7: ( 'char' )
            // InternalDelphi.g:51:9: 'char'
            {
            match("char"); 


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
            // InternalDelphi.g:52:7: ( 'widechar' )
            // InternalDelphi.g:52:9: 'widechar'
            {
            match("widechar"); 


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
            // InternalDelphi.g:53:7: ( 'longword' )
            // InternalDelphi.g:53:9: 'longword'
            {
            match("longword"); 


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
            // InternalDelphi.g:54:7: ( 'pchar' )
            // InternalDelphi.g:54:9: 'pchar'
            {
            match("pchar"); 


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
            // InternalDelphi.g:55:7: ( 'variant' )
            // InternalDelphi.g:55:9: 'variant'
            {
            match("variant"); 


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
            // InternalDelphi.g:56:7: ( 'olevariant' )
            // InternalDelphi.g:56:9: 'olevariant'
            {
            match("olevariant"); 


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
            // InternalDelphi.g:57:7: ( '..' )
            // InternalDelphi.g:57:9: '..'
            {
            match(".."); 


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
            // InternalDelphi.g:58:7: ( 'string' )
            // InternalDelphi.g:58:9: 'string'
            {
            match("string"); 


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
            // InternalDelphi.g:59:7: ( 'ansistring' )
            // InternalDelphi.g:59:9: 'ansistring'
            {
            match("ansistring"); 


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
            // InternalDelphi.g:60:7: ( 'widestring' )
            // InternalDelphi.g:60:9: 'widestring'
            {
            match("widestring"); 


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
            // InternalDelphi.g:61:7: ( 'packed' )
            // InternalDelphi.g:61:9: 'packed'
            {
            match("packed"); 


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
            // InternalDelphi.g:62:7: ( 'array' )
            // InternalDelphi.g:62:9: 'array'
            {
            match("array"); 


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
            // InternalDelphi.g:63:7: ( '[' )
            // InternalDelphi.g:63:9: '['
            {
            match('['); 

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
            // InternalDelphi.g:64:7: ( ']' )
            // InternalDelphi.g:64:9: ']'
            {
            match(']'); 

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
            // InternalDelphi.g:65:7: ( 'record' )
            // InternalDelphi.g:65:9: 'record'
            {
            match("record"); 


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
            // InternalDelphi.g:66:7: ( 'case' )
            // InternalDelphi.g:66:9: 'case'
            {
            match("case"); 


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
            // InternalDelphi.g:67:7: ( 'set' )
            // InternalDelphi.g:67:9: 'set'
            {
            match("set"); 


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
            // InternalDelphi.g:68:7: ( 'file' )
            // InternalDelphi.g:68:9: 'file'
            {
            match("file"); 


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
            // InternalDelphi.g:69:7: ( '^' )
            // InternalDelphi.g:69:9: '^'
            {
            match('^'); 

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
            // InternalDelphi.g:70:7: ( 'object' )
            // InternalDelphi.g:70:9: 'object'
            {
            match("object"); 


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
            // InternalDelphi.g:71:7: ( 'var' )
            // InternalDelphi.g:71:9: 'var'
            {
            match("var"); 


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
            // InternalDelphi.g:72:7: ( 'absolute' )
            // InternalDelphi.g:72:9: 'absolute'
            {
            match("absolute"); 


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
            // InternalDelphi.g:73:7: ( '+' )
            // InternalDelphi.g:73:9: '+'
            {
            match('+'); 

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
            // InternalDelphi.g:74:7: ( '-' )
            // InternalDelphi.g:74:9: '-'
            {
            match('-'); 

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
            // InternalDelphi.g:75:7: ( '@' )
            // InternalDelphi.g:75:9: '@'
            {
            match('@'); 

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
            // InternalDelphi.g:76:7: ( 'nil' )
            // InternalDelphi.g:76:9: 'nil'
            {
            match("nil"); 


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
            // InternalDelphi.g:77:7: ( 'not' )
            // InternalDelphi.g:77:9: 'not'
            {
            match("not"); 


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
            // InternalDelphi.g:78:7: ( '>' )
            // InternalDelphi.g:78:9: '>'
            {
            match('>'); 

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
            // InternalDelphi.g:79:7: ( '<' )
            // InternalDelphi.g:79:9: '<'
            {
            match('<'); 

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
            // InternalDelphi.g:80:7: ( '<=' )
            // InternalDelphi.g:80:9: '<='
            {
            match("<="); 


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
            // InternalDelphi.g:81:7: ( '>=' )
            // InternalDelphi.g:81:9: '>='
            {
            match(">="); 


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
            // InternalDelphi.g:82:7: ( '<>' )
            // InternalDelphi.g:82:9: '<>'
            {
            match("<>"); 


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
            // InternalDelphi.g:83:7: ( 'in' )
            // InternalDelphi.g:83:9: 'in'
            {
            match("in"); 


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
            // InternalDelphi.g:84:7: ( 'is' )
            // InternalDelphi.g:84:9: 'is'
            {
            match("is"); 


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
            // InternalDelphi.g:85:7: ( 'as' )
            // InternalDelphi.g:85:9: 'as'
            {
            match("as"); 


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
            // InternalDelphi.g:86:7: ( 'or' )
            // InternalDelphi.g:86:9: 'or'
            {
            match("or"); 


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
            // InternalDelphi.g:87:7: ( 'xor' )
            // InternalDelphi.g:87:9: 'xor'
            {
            match("xor"); 


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
            // InternalDelphi.g:88:7: ( '*' )
            // InternalDelphi.g:88:9: '*'
            {
            match('*'); 

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
            // InternalDelphi.g:89:7: ( '/' )
            // InternalDelphi.g:89:9: '/'
            {
            match('/'); 

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
            // InternalDelphi.g:90:7: ( 'div' )
            // InternalDelphi.g:90:9: 'div'
            {
            match("div"); 


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
            // InternalDelphi.g:91:7: ( 'mod' )
            // InternalDelphi.g:91:9: 'mod'
            {
            match("mod"); 


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
            // InternalDelphi.g:92:7: ( 'and' )
            // InternalDelphi.g:92:9: 'and'
            {
            match("and"); 


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
            // InternalDelphi.g:93:7: ( 'shl' )
            // InternalDelphi.g:93:9: 'shl'
            {
            match("shl"); 


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
            // InternalDelphi.g:94:7: ( 'shr' )
            // InternalDelphi.g:94:9: 'shr'
            {
            match("shr"); 


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
            // InternalDelphi.g:95:8: ( '&' )
            // InternalDelphi.g:95:10: '&'
            {
            match('&'); 

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
            // InternalDelphi.g:96:8: ( ':=' )
            // InternalDelphi.g:96:10: ':='
            {
            match(":="); 


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
            // InternalDelphi.g:97:8: ( 'inherited' )
            // InternalDelphi.g:97:10: 'inherited'
            {
            match("inherited"); 


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
            // InternalDelphi.g:98:8: ( 'goto' )
            // InternalDelphi.g:98:10: 'goto'
            {
            match("goto"); 


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
            // InternalDelphi.g:99:8: ( 'begin' )
            // InternalDelphi.g:99:10: 'begin'
            {
            match("begin"); 


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
            // InternalDelphi.g:100:8: ( 'if' )
            // InternalDelphi.g:100:10: 'if'
            {
            match("if"); 


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
            // InternalDelphi.g:101:8: ( 'then' )
            // InternalDelphi.g:101:10: 'then'
            {
            match("then"); 


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
            // InternalDelphi.g:102:8: ( 'else' )
            // InternalDelphi.g:102:10: 'else'
            {
            match("else"); 


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
            // InternalDelphi.g:103:8: ( 'repeat' )
            // InternalDelphi.g:103:10: 'repeat'
            {
            match("repeat"); 


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
            // InternalDelphi.g:104:8: ( 'until' )
            // InternalDelphi.g:104:10: 'until'
            {
            match("until"); 


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
            // InternalDelphi.g:105:8: ( 'while' )
            // InternalDelphi.g:105:10: 'while'
            {
            match("while"); 


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
            // InternalDelphi.g:106:8: ( 'do' )
            // InternalDelphi.g:106:10: 'do'
            {
            match("do"); 


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
            // InternalDelphi.g:107:8: ( 'for' )
            // InternalDelphi.g:107:10: 'for'
            {
            match("for"); 


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
            // InternalDelphi.g:108:8: ( 'to' )
            // InternalDelphi.g:108:10: 'to'
            {
            match("to"); 


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
            // InternalDelphi.g:109:8: ( 'downto' )
            // InternalDelphi.g:109:10: 'downto'
            {
            match("downto"); 


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
            // InternalDelphi.g:110:8: ( 'with' )
            // InternalDelphi.g:110:10: 'with'
            {
            match("with"); 


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
            // InternalDelphi.g:111:8: ( 'try' )
            // InternalDelphi.g:111:10: 'try'
            {
            match("try"); 


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
            // InternalDelphi.g:112:8: ( 'except' )
            // InternalDelphi.g:112:10: 'except'
            {
            match("except"); 


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
            // InternalDelphi.g:113:8: ( 'finally' )
            // InternalDelphi.g:113:10: 'finally'
            {
            match("finally"); 


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
            // InternalDelphi.g:114:8: ( 'on' )
            // InternalDelphi.g:114:10: 'on'
            {
            match("on"); 


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
            // InternalDelphi.g:115:8: ( 'id' )
            // InternalDelphi.g:115:10: 'id'
            {
            match("id"); 


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
            // InternalDelphi.g:116:8: ( 'raise' )
            // InternalDelphi.g:116:10: 'raise'
            {
            match("raise"); 


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
            // InternalDelphi.g:117:8: ( 'at' )
            // InternalDelphi.g:117:10: 'at'
            {
            match("at"); 


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
            // InternalDelphi.g:118:8: ( 'asm' )
            // InternalDelphi.g:118:10: 'asm'
            {
            match("asm"); 


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
            // InternalDelphi.g:119:8: ( 'function' )
            // InternalDelphi.g:119:10: 'function'
            {
            match("function"); 


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
            // InternalDelphi.g:120:8: ( 'procedure' )
            // InternalDelphi.g:120:10: 'procedure'
            {
            match("procedure"); 


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
            // InternalDelphi.g:121:8: ( 'out' )
            // InternalDelphi.g:121:10: 'out'
            {
            match("out"); 


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
            // InternalDelphi.g:122:8: ( 'cdecl' )
            // InternalDelphi.g:122:10: 'cdecl'
            {
            match("cdecl"); 


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
            // InternalDelphi.g:123:8: ( 'register' )
            // InternalDelphi.g:123:10: 'register'
            {
            match("register"); 


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
            // InternalDelphi.g:124:8: ( 'dynamic' )
            // InternalDelphi.g:124:10: 'dynamic'
            {
            match("dynamic"); 


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
            // InternalDelphi.g:125:8: ( 'virtual' )
            // InternalDelphi.g:125:10: 'virtual'
            {
            match("virtual"); 


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
            // InternalDelphi.g:126:8: ( 'export' )
            // InternalDelphi.g:126:10: 'export'
            {
            match("export"); 


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
            // InternalDelphi.g:127:8: ( 'external' )
            // InternalDelphi.g:127:10: 'external'
            {
            match("external"); 


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
            // InternalDelphi.g:128:8: ( 'near' )
            // InternalDelphi.g:128:10: 'near'
            {
            match("near"); 


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
            // InternalDelphi.g:129:8: ( 'far' )
            // InternalDelphi.g:129:10: 'far'
            {
            match("far"); 


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
            // InternalDelphi.g:130:8: ( 'forward' )
            // InternalDelphi.g:130:10: 'forward'
            {
            match("forward"); 


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
            // InternalDelphi.g:131:8: ( 'message' )
            // InternalDelphi.g:131:10: 'message'
            {
            match("message"); 


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
            // InternalDelphi.g:132:8: ( 'override' )
            // InternalDelphi.g:132:10: 'override'
            {
            match("override"); 


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
            // InternalDelphi.g:133:8: ( 'overload' )
            // InternalDelphi.g:133:10: 'overload'
            {
            match("overload"); 


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
            // InternalDelphi.g:134:8: ( 'pascal' )
            // InternalDelphi.g:134:10: 'pascal'
            {
            match("pascal"); 


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
            // InternalDelphi.g:135:8: ( 'reintroduce' )
            // InternalDelphi.g:135:10: 'reintroduce'
            {
            match("reintroduce"); 


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
            // InternalDelphi.g:136:8: ( 'safecall' )
            // InternalDelphi.g:136:10: 'safecall'
            {
            match("safecall"); 


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
            // InternalDelphi.g:137:8: ( 'stdcall' )
            // InternalDelphi.g:137:10: 'stdcall'
            {
            match("stdcall"); 


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
            // InternalDelphi.g:138:8: ( 'varargs' )
            // InternalDelphi.g:138:10: 'varargs'
            {
            match("varargs"); 


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
            // InternalDelphi.g:139:8: ( 'local' )
            // InternalDelphi.g:139:10: 'local'
            {
            match("local"); 


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
            // InternalDelphi.g:140:8: ( 'abstract' )
            // InternalDelphi.g:140:10: 'abstract'
            {
            match("abstract"); 


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
            // InternalDelphi.g:141:8: ( 'constructor' )
            // InternalDelphi.g:141:10: 'constructor'
            {
            match("constructor"); 


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
            // InternalDelphi.g:142:8: ( 'destructor' )
            // InternalDelphi.g:142:10: 'destructor'
            {
            match("destructor"); 


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
            // InternalDelphi.g:143:8: ( 'initialization' )
            // InternalDelphi.g:143:10: 'initialization'
            {
            match("initialization"); 


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
            // InternalDelphi.g:144:8: ( 'finalization' )
            // InternalDelphi.g:144:10: 'finalization'
            {
            match("finalization"); 


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
            // InternalDelphi.g:145:8: ( 'public' )
            // InternalDelphi.g:145:10: 'public'
            {
            match("public"); 


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
            // InternalDelphi.g:146:8: ( 'protected' )
            // InternalDelphi.g:146:10: 'protected'
            {
            match("protected"); 


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
            // InternalDelphi.g:147:8: ( 'private' )
            // InternalDelphi.g:147:10: 'private'
            {
            match("private"); 


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
            // InternalDelphi.g:148:8: ( 'published' )
            // InternalDelphi.g:148:10: 'published'
            {
            match("published"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:149:8: ( 'property' )
            // InternalDelphi.g:149:10: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:150:8: ( 'read' )
            // InternalDelphi.g:150:10: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:151:8: ( 'write' )
            // InternalDelphi.g:151:10: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:152:8: ( 'stored' )
            // InternalDelphi.g:152:10: 'stored'
            {
            match("stored"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:153:8: ( 'default' )
            // InternalDelphi.g:153:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:154:8: ( 'nodefault' )
            // InternalDelphi.g:154:10: 'nodefault'
            {
            match("nodefault"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:155:8: ( 'implements' )
            // InternalDelphi.g:155:10: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:156:8: ( 'requires' )
            // InternalDelphi.g:156:10: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:157:8: ( 'contains' )
            // InternalDelphi.g:157:10: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:158:8: ( '#' )
            // InternalDelphi.g:158:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            // InternalDelphi.g:10582:21: ( '\\\\' )
            // InternalDelphi.g:10582:23: '\\\\'
            {
            match('\\'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_QUOTE"
    public final void mRULE_QUOTE() throws RecognitionException {
        try {
            // InternalDelphi.g:10584:21: ( '\\'' )
            // InternalDelphi.g:10584:23: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10586:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | RULE_SLASH | '-' )* )
            // InternalDelphi.g:10586:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | RULE_SLASH | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDelphi.g:10586:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | RULE_SLASH | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='\\'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDelphi.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "RULE_DOUBLEQUOTE"
    public final void mRULE_DOUBLEQUOTE() throws RecognitionException {
        try {
            // InternalDelphi.g:10588:27: ( '\"' )
            // InternalDelphi.g:10588:29: '\"'
            {
            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLEQUOTE"

    // $ANTLR start "RULE_DQVALUE"
    public final void mRULE_DQVALUE() throws RecognitionException {
        try {
            int _type = RULE_DQVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10590:14: ( RULE_DOUBLEQUOTE ( '\\\\' . | ~ ( ( '\\\\' | RULE_DOUBLEQUOTE ) ) )* RULE_DOUBLEQUOTE )
            // InternalDelphi.g:10590:16: RULE_DOUBLEQUOTE ( '\\\\' . | ~ ( ( '\\\\' | RULE_DOUBLEQUOTE ) ) )* RULE_DOUBLEQUOTE
            {
            mRULE_DOUBLEQUOTE(); 
            // InternalDelphi.g:10590:33: ( '\\\\' . | ~ ( ( '\\\\' | RULE_DOUBLEQUOTE ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDelphi.g:10590:34: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDelphi.g:10590:41: ~ ( ( '\\\\' | RULE_DOUBLEQUOTE ) )
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
            	    break loop2;
                }
            } while (true);

            mRULE_DOUBLEQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DQVALUE"

    // $ANTLR start "RULE_QVALUE"
    public final void mRULE_QVALUE() throws RecognitionException {
        try {
            int _type = RULE_QVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10592:13: ( RULE_QUOTE ( '\\\\' . | ~ ( ( '\\\\' | RULE_QUOTE ) ) )* RULE_QUOTE )
            // InternalDelphi.g:10592:15: RULE_QUOTE ( '\\\\' . | ~ ( ( '\\\\' | RULE_QUOTE ) ) )* RULE_QUOTE
            {
            mRULE_QUOTE(); 
            // InternalDelphi.g:10592:26: ( '\\\\' . | ~ ( ( '\\\\' | RULE_QUOTE ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDelphi.g:10592:27: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDelphi.g:10592:34: ~ ( ( '\\\\' | RULE_QUOTE ) )
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
            	    break loop3;
                }
            } while (true);

            mRULE_QUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QVALUE"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10594:10: ( ( '+' | '-' )? '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalDelphi.g:10594:12: ( '+' | '-' )? '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            // InternalDelphi.g:10594:12: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDelphi.g:
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

            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDelphi.g:10594:37: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDelphi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


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
            // InternalDelphi.g:10596:10: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // InternalDelphi.g:10596:12: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // InternalDelphi.g:10596:12: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDelphi.g:
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

            // InternalDelphi.g:10596:23: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDelphi.g:10596:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10598:14: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDelphi.g:10598:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDelphi.g:10598:21: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDelphi.g:10598:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_MORECOMMENT"
    public final void mRULE_MORECOMMENT() throws RecognitionException {
        try {
            int _type = RULE_MORECOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10600:18: ( '{' ( options {greedy=false; } : . )* '}' )
            // InternalDelphi.g:10600:20: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // InternalDelphi.g:10600:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='}') ) {
                    alt9=2;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='|')||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDelphi.g:10600:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MORECOMMENT"

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10602:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDelphi.g:10602:21: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDelphi.g:10602:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDelphi.g:10602:26: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalDelphi.g:10602:42: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDelphi.g:10602:43: ( '\\r' )? '\\n'
                    {
                    // InternalDelphi.g:10602:43: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDelphi.g:10602:43: '\\r'
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
    // $ANTLR end "RULE_LINE_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDelphi.g:10604:9: ( ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' ) )
            // InternalDelphi.g:10604:11: ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalDelphi.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | RULE_ID | RULE_DQVALUE | RULE_QVALUE | RULE_HEX | RULE_INT | RULE_COMMENT | RULE_MORECOMMENT | RULE_LINE_COMMENT | RULE_WS )
        int alt13=157;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalDelphi.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalDelphi.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalDelphi.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalDelphi.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalDelphi.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalDelphi.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalDelphi.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalDelphi.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalDelphi.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalDelphi.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalDelphi.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalDelphi.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalDelphi.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalDelphi.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalDelphi.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalDelphi.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalDelphi.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalDelphi.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalDelphi.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalDelphi.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalDelphi.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalDelphi.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalDelphi.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalDelphi.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalDelphi.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalDelphi.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalDelphi.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalDelphi.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalDelphi.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalDelphi.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalDelphi.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalDelphi.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalDelphi.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalDelphi.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalDelphi.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalDelphi.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalDelphi.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalDelphi.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalDelphi.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalDelphi.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalDelphi.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalDelphi.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalDelphi.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalDelphi.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalDelphi.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalDelphi.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalDelphi.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalDelphi.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalDelphi.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalDelphi.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalDelphi.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalDelphi.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalDelphi.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalDelphi.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalDelphi.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalDelphi.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalDelphi.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalDelphi.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalDelphi.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalDelphi.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalDelphi.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalDelphi.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalDelphi.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalDelphi.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalDelphi.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalDelphi.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalDelphi.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalDelphi.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalDelphi.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalDelphi.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalDelphi.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalDelphi.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalDelphi.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalDelphi.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalDelphi.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalDelphi.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalDelphi.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalDelphi.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalDelphi.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalDelphi.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalDelphi.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalDelphi.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalDelphi.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // InternalDelphi.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // InternalDelphi.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // InternalDelphi.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // InternalDelphi.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // InternalDelphi.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // InternalDelphi.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // InternalDelphi.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // InternalDelphi.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // InternalDelphi.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // InternalDelphi.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // InternalDelphi.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // InternalDelphi.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // InternalDelphi.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // InternalDelphi.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // InternalDelphi.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // InternalDelphi.g:1:612: T__114
                {
                mT__114(); 

                }
                break;
            case 100 :
                // InternalDelphi.g:1:619: T__115
                {
                mT__115(); 

                }
                break;
            case 101 :
                // InternalDelphi.g:1:626: T__116
                {
                mT__116(); 

                }
                break;
            case 102 :
                // InternalDelphi.g:1:633: T__117
                {
                mT__117(); 

                }
                break;
            case 103 :
                // InternalDelphi.g:1:640: T__118
                {
                mT__118(); 

                }
                break;
            case 104 :
                // InternalDelphi.g:1:647: T__119
                {
                mT__119(); 

                }
                break;
            case 105 :
                // InternalDelphi.g:1:654: T__120
                {
                mT__120(); 

                }
                break;
            case 106 :
                // InternalDelphi.g:1:661: T__121
                {
                mT__121(); 

                }
                break;
            case 107 :
                // InternalDelphi.g:1:668: T__122
                {
                mT__122(); 

                }
                break;
            case 108 :
                // InternalDelphi.g:1:675: T__123
                {
                mT__123(); 

                }
                break;
            case 109 :
                // InternalDelphi.g:1:682: T__124
                {
                mT__124(); 

                }
                break;
            case 110 :
                // InternalDelphi.g:1:689: T__125
                {
                mT__125(); 

                }
                break;
            case 111 :
                // InternalDelphi.g:1:696: T__126
                {
                mT__126(); 

                }
                break;
            case 112 :
                // InternalDelphi.g:1:703: T__127
                {
                mT__127(); 

                }
                break;
            case 113 :
                // InternalDelphi.g:1:710: T__128
                {
                mT__128(); 

                }
                break;
            case 114 :
                // InternalDelphi.g:1:717: T__129
                {
                mT__129(); 

                }
                break;
            case 115 :
                // InternalDelphi.g:1:724: T__130
                {
                mT__130(); 

                }
                break;
            case 116 :
                // InternalDelphi.g:1:731: T__131
                {
                mT__131(); 

                }
                break;
            case 117 :
                // InternalDelphi.g:1:738: T__132
                {
                mT__132(); 

                }
                break;
            case 118 :
                // InternalDelphi.g:1:745: T__133
                {
                mT__133(); 

                }
                break;
            case 119 :
                // InternalDelphi.g:1:752: T__134
                {
                mT__134(); 

                }
                break;
            case 120 :
                // InternalDelphi.g:1:759: T__135
                {
                mT__135(); 

                }
                break;
            case 121 :
                // InternalDelphi.g:1:766: T__136
                {
                mT__136(); 

                }
                break;
            case 122 :
                // InternalDelphi.g:1:773: T__137
                {
                mT__137(); 

                }
                break;
            case 123 :
                // InternalDelphi.g:1:780: T__138
                {
                mT__138(); 

                }
                break;
            case 124 :
                // InternalDelphi.g:1:787: T__139
                {
                mT__139(); 

                }
                break;
            case 125 :
                // InternalDelphi.g:1:794: T__140
                {
                mT__140(); 

                }
                break;
            case 126 :
                // InternalDelphi.g:1:801: T__141
                {
                mT__141(); 

                }
                break;
            case 127 :
                // InternalDelphi.g:1:808: T__142
                {
                mT__142(); 

                }
                break;
            case 128 :
                // InternalDelphi.g:1:815: T__143
                {
                mT__143(); 

                }
                break;
            case 129 :
                // InternalDelphi.g:1:822: T__144
                {
                mT__144(); 

                }
                break;
            case 130 :
                // InternalDelphi.g:1:829: T__145
                {
                mT__145(); 

                }
                break;
            case 131 :
                // InternalDelphi.g:1:836: T__146
                {
                mT__146(); 

                }
                break;
            case 132 :
                // InternalDelphi.g:1:843: T__147
                {
                mT__147(); 

                }
                break;
            case 133 :
                // InternalDelphi.g:1:850: T__148
                {
                mT__148(); 

                }
                break;
            case 134 :
                // InternalDelphi.g:1:857: T__149
                {
                mT__149(); 

                }
                break;
            case 135 :
                // InternalDelphi.g:1:864: T__150
                {
                mT__150(); 

                }
                break;
            case 136 :
                // InternalDelphi.g:1:871: T__151
                {
                mT__151(); 

                }
                break;
            case 137 :
                // InternalDelphi.g:1:878: T__152
                {
                mT__152(); 

                }
                break;
            case 138 :
                // InternalDelphi.g:1:885: T__153
                {
                mT__153(); 

                }
                break;
            case 139 :
                // InternalDelphi.g:1:892: T__154
                {
                mT__154(); 

                }
                break;
            case 140 :
                // InternalDelphi.g:1:899: T__155
                {
                mT__155(); 

                }
                break;
            case 141 :
                // InternalDelphi.g:1:906: T__156
                {
                mT__156(); 

                }
                break;
            case 142 :
                // InternalDelphi.g:1:913: T__157
                {
                mT__157(); 

                }
                break;
            case 143 :
                // InternalDelphi.g:1:920: T__158
                {
                mT__158(); 

                }
                break;
            case 144 :
                // InternalDelphi.g:1:927: T__159
                {
                mT__159(); 

                }
                break;
            case 145 :
                // InternalDelphi.g:1:934: T__160
                {
                mT__160(); 

                }
                break;
            case 146 :
                // InternalDelphi.g:1:941: T__161
                {
                mT__161(); 

                }
                break;
            case 147 :
                // InternalDelphi.g:1:948: T__162
                {
                mT__162(); 

                }
                break;
            case 148 :
                // InternalDelphi.g:1:955: T__163
                {
                mT__163(); 

                }
                break;
            case 149 :
                // InternalDelphi.g:1:962: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 150 :
                // InternalDelphi.g:1:970: RULE_DQVALUE
                {
                mRULE_DQVALUE(); 

                }
                break;
            case 151 :
                // InternalDelphi.g:1:983: RULE_QVALUE
                {
                mRULE_QVALUE(); 

                }
                break;
            case 152 :
                // InternalDelphi.g:1:995: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 153 :
                // InternalDelphi.g:1:1004: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 154 :
                // InternalDelphi.g:1:1013: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 155 :
                // InternalDelphi.g:1:1026: RULE_MORECOMMENT
                {
                mRULE_MORECOMMENT(); 

                }
                break;
            case 156 :
                // InternalDelphi.g:1:1043: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 157 :
                // InternalDelphi.g:1:1061: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\50\3\uffff\1\65\6\50\1\uffff\1\50\1\uffff\1\122\10\50\2\uffff\1\50\1\uffff\1\170\1\171\1\uffff\1\173\1\176\1\50\1\uffff\1\u0082\1\50\1\uffff\1\50\4\uffff\1\54\3\uffff\5\50\2\uffff\11\50\1\u009f\2\50\1\u00a6\1\50\1\u00a8\1\u00a9\1\u00aa\12\50\2\uffff\2\50\1\u00b9\1\50\1\u00bb\2\50\1\u00be\1\u00bf\26\50\1\u00e2\1\u00e3\4\50\7\uffff\1\50\3\uffff\3\50\1\uffff\12\50\1\u00fa\15\50\1\uffff\1\u0108\5\50\1\uffff\1\50\3\uffff\1\50\1\u0111\1\u0112\13\50\1\uffff\1\u011f\1\uffff\2\50\2\uffff\1\u0122\12\50\1\u012e\1\u012f\4\50\1\u0134\11\50\1\u0140\2\50\1\u0143\2\50\1\u0147\2\uffff\2\50\1\u014b\1\50\1\u014d\1\u014e\1\u014f\14\50\1\u015d\1\50\1\u015f\1\uffff\3\50\1\u0164\11\50\1\uffff\7\50\1\u0177\2\uffff\1\50\1\u0179\2\50\1\u017c\2\50\1\u017f\1\u0180\1\50\1\u0182\1\u0183\1\uffff\2\50\1\uffff\1\50\1\u0189\1\u018a\10\50\2\uffff\4\50\1\uffff\1\50\1\u0198\2\50\1\u019b\1\50\1\u019e\4\50\1\uffff\2\50\1\uffff\3\50\1\uffff\1\u01a8\2\50\1\uffff\1\50\3\uffff\1\50\1\u01ad\11\50\1\u01b7\1\50\1\uffff\1\u01ba\1\uffff\4\50\1\uffff\1\50\1\u01c0\2\50\1\u01c3\10\50\1\u01cc\1\u01cd\3\50\1\uffff\1\50\1\uffff\1\u01d3\1\50\1\uffff\1\u01d5\1\50\2\uffff\1\u01d7\2\uffff\5\50\2\uffff\5\50\1\u01e2\7\50\1\uffff\1\50\1\u01eb\1\uffff\2\50\1\uffff\1\u01ee\1\u01ef\4\50\1\u01f4\2\50\1\uffff\4\50\1\uffff\6\50\1\u0202\1\u0203\1\50\1\uffff\1\u0205\1\50\1\uffff\1\u0208\2\50\1\u020b\1\50\1\uffff\2\50\1\uffff\3\50\1\u0212\1\u0213\3\50\2\uffff\5\50\1\uffff\1\50\1\uffff\1\50\1\uffff\1\50\1\u021f\2\50\1\u0222\1\u0223\1\u0224\3\50\1\uffff\1\u0228\2\50\1\u022b\1\50\1\u022d\2\50\1\uffff\2\50\2\uffff\4\50\1\uffff\7\50\1\u023d\3\50\1\u0241\1\u0242\2\uffff\1\50\1\uffff\1\50\1\u0245\1\uffff\2\50\1\uffff\1\u0248\1\u0249\3\50\1\u024d\2\uffff\1\u024e\1\50\1\u0250\10\50\1\uffff\2\50\3\uffff\3\50\1\uffff\2\50\1\uffff\1\u0260\1\uffff\1\50\1\u0262\2\50\1\u0265\1\u0266\1\u0267\3\50\1\u026b\1\50\1\u026d\1\50\1\u026f\1\uffff\2\50\1\u0272\2\uffff\1\u0273\1\50\1\uffff\1\u0275\1\u0276\2\uffff\1\u0277\2\50\2\uffff\1\50\1\uffff\5\50\1\u0280\1\u0281\1\50\1\u0283\1\u0284\1\u0285\1\50\1\u0287\1\u0288\1\u0289\1\uffff\1\u028a\1\uffff\1\u028b\1\50\3\uffff\1\50\1\u028e\1\u028f\1\uffff\1\50\1\uffff\1\u0291\1\uffff\1\u0292\1\u0293\2\uffff\1\u0294\3\uffff\2\50\1\u0297\1\u0298\2\50\1\u029c\1\50\2\uffff\1\50\3\uffff\1\50\5\uffff\2\50\2\uffff\1\50\4\uffff\1\u02a3\1\u02a4\2\uffff\2\50\1\u02a7\1\uffff\1\50\1\u02a9\1\50\1\u02ab\1\u02ac\1\50\2\uffff\2\50\1\uffff\1\u02b0\1\uffff\1\u02b1\2\uffff\3\50\2\uffff\1\u02b5\2\50\1\uffff\1\u02b8\1\u02b9\2\uffff";
    static final String DFA13_eofS =
        "\u02ba\uffff";
    static final String DFA13_minS =
        "\1\11\1\141\3\uffff\1\56\1\156\1\154\1\141\1\145\1\144\1\141\1\uffff\1\141\1\uffff\1\75\1\150\1\142\2\141\1\145\1\150\1\141\1\142\2\uffff\1\141\1\uffff\2\60\1\uffff\2\75\1\157\1\uffff\1\52\1\145\1\uffff\1\157\4\uffff\1\130\3\uffff\1\151\1\143\1\141\1\150\1\142\2\uffff\1\151\1\145\1\144\1\143\1\163\2\142\1\143\1\146\1\43\1\166\1\156\1\43\1\160\3\43\1\155\1\154\1\144\1\141\1\155\1\141\1\162\1\141\1\163\1\145\2\uffff\1\160\1\145\1\43\1\171\1\43\1\145\1\152\2\43\1\164\1\145\1\141\1\151\1\156\1\154\1\141\1\144\1\164\1\146\1\164\1\157\1\147\1\162\1\144\2\151\2\162\1\144\1\162\1\163\2\43\1\154\1\162\1\156\1\162\7\uffff\1\162\3\uffff\1\144\1\163\1\164\1\uffff\1\143\1\166\1\153\1\143\1\164\1\141\1\154\1\164\1\151\1\163\1\43\1\157\3\145\1\162\1\145\1\147\1\141\1\162\1\164\1\141\1\142\1\156\1\uffff\1\43\1\141\1\66\2\145\1\164\1\uffff\1\154\3\uffff\1\145\2\43\1\145\1\162\1\163\1\160\1\163\2\162\1\145\1\143\1\145\1\156\1\uffff\1\43\1\uffff\1\166\1\145\2\uffff\1\43\1\162\1\144\1\157\1\145\1\151\1\156\1\165\1\163\1\147\1\162\2\43\1\154\1\151\1\143\1\162\1\43\2\145\1\154\1\151\1\144\1\145\1\150\1\154\1\164\1\43\1\164\1\151\1\43\1\141\1\157\1\43\2\uffff\1\145\1\141\1\43\1\143\3\43\1\163\1\157\1\162\3\145\3\141\1\146\1\162\1\151\1\43\1\154\1\43\1\uffff\1\162\1\156\1\160\1\43\1\141\1\154\1\151\1\154\1\145\1\162\1\165\1\154\1\164\1\uffff\1\155\1\147\1\64\1\170\1\162\1\151\1\145\1\43\2\uffff\1\146\1\43\1\164\1\141\1\43\1\163\1\145\2\43\1\154\2\43\1\uffff\1\141\1\143\1\uffff\1\154\2\43\1\162\1\141\1\163\1\164\1\151\1\145\1\154\1\164\2\uffff\1\154\1\156\1\141\1\145\1\uffff\1\143\1\43\1\145\1\156\1\43\1\143\1\43\2\145\1\141\1\162\1\uffff\1\165\1\163\1\uffff\1\171\1\154\1\162\1\uffff\1\43\1\154\1\141\1\uffff\1\164\3\uffff\1\141\1\43\1\141\1\144\1\143\1\162\1\164\1\147\1\144\1\154\1\157\1\43\1\143\1\uffff\1\43\1\uffff\1\164\1\144\1\156\1\164\1\uffff\1\162\1\43\1\156\1\157\1\43\1\143\1\165\1\154\1\145\1\157\1\151\1\146\1\145\2\43\1\151\1\141\1\155\1\uffff\1\141\1\uffff\1\43\1\151\1\uffff\1\43\1\156\2\uffff\1\43\2\uffff\1\162\1\164\1\151\1\157\1\70\2\uffff\1\144\2\164\2\162\1\43\1\145\2\151\1\147\1\154\1\144\1\141\1\uffff\1\141\1\43\1\uffff\1\150\1\164\1\uffff\2\43\1\156\1\147\1\141\1\164\1\43\1\165\1\141\1\uffff\1\151\1\162\1\151\1\147\1\uffff\1\155\1\165\2\164\2\145\2\43\1\162\1\uffff\1\43\1\150\1\uffff\1\43\1\145\1\141\1\43\1\171\1\uffff\1\164\1\162\1\uffff\1\141\1\143\1\164\2\43\1\143\1\141\1\162\2\uffff\1\164\1\154\1\145\2\165\1\uffff\1\156\1\uffff\1\143\1\uffff\1\151\1\43\1\144\1\141\3\43\1\145\1\157\1\145\1\uffff\1\43\2\156\1\43\1\154\1\43\1\154\1\156\1\uffff\1\141\1\162\2\uffff\1\164\1\163\1\154\1\162\1\uffff\1\164\1\143\1\171\1\172\1\144\1\157\1\145\1\43\1\162\1\145\1\171\2\43\2\uffff\1\155\1\uffff\1\145\1\43\1\uffff\1\144\1\154\1\uffff\2\43\1\144\2\164\1\43\2\uffff\1\43\1\143\1\43\1\145\1\151\1\156\1\154\1\143\1\163\1\171\1\141\1\uffff\1\145\1\144\3\uffff\1\162\1\144\1\163\1\uffff\2\164\1\uffff\1\43\1\uffff\1\154\1\43\1\162\1\151\3\43\1\151\1\145\1\164\1\43\1\141\1\43\1\156\1\43\1\uffff\1\145\1\144\1\43\2\uffff\1\43\1\144\1\uffff\2\43\2\uffff\1\43\1\145\1\157\2\uffff\1\145\1\uffff\1\144\1\172\3\164\2\43\1\156\3\43\1\165\3\43\1\uffff\1\43\1\uffff\1\43\1\156\3\uffff\1\156\2\43\1\uffff\1\164\1\uffff\1\43\1\uffff\2\43\2\uffff\1\43\3\uffff\1\144\1\162\2\43\2\141\1\43\1\157\2\uffff\1\164\3\uffff\1\143\5\uffff\2\147\2\uffff\1\151\4\uffff\2\43\2\uffff\2\164\1\43\1\uffff\1\162\1\43\1\145\2\43\1\157\2\uffff\2\151\1\uffff\1\43\1\uffff\1\43\2\uffff\1\156\2\157\2\uffff\1\43\2\156\1\uffff\2\43\2\uffff";
    static final String DFA13_maxS =
        "\1\173\1\165\3\uffff\1\56\1\163\1\170\1\157\1\171\1\163\1\157\1\uffff\1\165\1\uffff\1\75\1\171\1\166\1\145\1\164\1\171\1\162\1\151\1\164\2\uffff\1\165\1\uffff\2\71\1\uffff\1\75\1\76\1\157\1\uffff\1\57\1\157\1\uffff\1\157\4\uffff\1\170\3\uffff\1\157\1\163\1\141\1\150\1\142\2\uffff\1\164\1\145\1\144\1\164\1\163\2\142\1\156\1\163\1\172\1\166\1\156\1\172\1\160\3\172\1\155\1\154\1\164\1\141\1\156\1\141\1\162\1\141\1\163\1\145\2\uffff\1\160\1\145\1\172\1\171\1\172\1\145\1\152\2\172\1\164\1\145\1\161\1\151\1\156\1\162\1\141\1\162\1\164\1\146\1\164\1\157\1\147\1\162\1\164\2\151\2\162\1\163\1\162\1\163\2\172\1\156\1\162\1\156\1\162\7\uffff\1\162\3\uffff\1\144\1\163\1\164\1\uffff\1\164\1\166\1\153\1\143\1\164\1\141\1\154\1\164\1\151\1\163\1\172\1\157\3\145\1\162\1\145\1\147\1\141\1\162\1\164\1\141\1\142\1\156\1\uffff\1\172\1\141\3\145\1\164\1\uffff\1\154\3\uffff\1\145\2\172\1\145\1\162\1\164\1\160\1\163\2\162\1\145\1\143\1\145\1\156\1\uffff\1\172\1\uffff\1\166\1\145\2\uffff\1\172\1\162\1\154\1\157\1\145\1\151\1\156\1\165\1\163\1\147\1\162\2\172\1\154\1\151\1\143\1\162\1\172\2\145\1\154\1\151\1\144\1\145\1\150\1\154\1\164\1\172\1\164\1\151\1\172\1\141\1\164\1\172\2\uffff\1\145\1\141\1\172\1\143\3\172\1\163\1\157\1\162\3\145\1\141\1\145\1\141\1\146\1\162\1\151\1\172\1\154\1\172\1\uffff\2\162\1\160\1\172\1\141\1\154\1\167\1\154\1\145\1\162\1\165\1\154\1\164\1\uffff\1\155\1\162\1\64\1\170\1\162\1\151\1\145\1\172\2\uffff\1\146\1\172\1\164\1\141\1\172\1\163\1\145\2\172\1\154\2\172\1\uffff\1\141\1\143\1\uffff\1\162\2\172\1\162\1\141\1\163\1\164\1\151\1\145\1\154\1\164\2\uffff\1\154\1\156\1\141\1\145\1\uffff\1\143\1\172\1\145\1\156\1\172\1\163\1\172\2\145\1\141\1\162\1\uffff\1\165\1\163\1\uffff\1\171\1\154\1\162\1\uffff\1\172\1\154\1\141\1\uffff\1\164\3\uffff\1\141\1\172\1\141\1\144\1\143\1\162\1\164\1\147\1\144\1\154\1\157\1\172\1\163\1\uffff\1\172\1\uffff\1\164\1\144\1\156\1\164\1\uffff\1\162\1\172\1\156\1\157\1\172\1\143\1\165\1\154\1\145\1\157\1\151\1\146\1\145\2\172\1\151\1\141\1\155\1\uffff\1\141\1\uffff\1\172\1\151\1\uffff\1\172\1\156\2\uffff\1\172\2\uffff\1\162\1\164\1\151\1\157\1\70\2\uffff\1\144\2\164\2\162\1\172\1\145\2\151\1\147\1\154\1\144\1\141\1\uffff\1\141\1\172\1\uffff\1\150\1\164\1\uffff\2\172\1\156\1\147\1\141\1\164\1\172\1\165\1\141\1\uffff\1\154\1\162\1\151\1\147\1\uffff\1\155\1\165\2\164\2\145\2\172\1\162\1\uffff\1\172\1\150\1\uffff\1\172\1\145\1\141\1\172\1\171\1\uffff\1\164\1\162\1\uffff\1\141\1\143\1\164\2\172\1\143\1\141\1\162\2\uffff\1\164\1\154\1\145\2\165\1\uffff\1\156\1\uffff\1\143\1\uffff\1\151\1\172\1\144\1\141\3\172\1\145\1\157\1\145\1\uffff\1\172\2\156\1\172\1\154\1\172\1\154\1\156\1\uffff\1\141\1\162\2\uffff\1\164\1\163\1\154\1\162\1\uffff\1\164\1\143\1\171\1\172\1\144\1\157\1\145\1\172\1\162\1\145\1\171\2\172\2\uffff\1\155\1\uffff\1\145\1\172\1\uffff\1\144\1\154\1\uffff\2\172\1\144\2\164\1\172\2\uffff\1\172\1\143\1\172\1\145\1\151\1\156\1\154\1\143\1\163\1\171\1\141\1\uffff\1\145\1\144\3\uffff\1\162\1\144\1\163\1\uffff\2\164\1\uffff\1\172\1\uffff\1\154\1\172\1\162\1\151\3\172\1\151\1\145\1\164\1\172\1\141\1\172\1\156\1\172\1\uffff\1\145\1\144\1\172\2\uffff\1\172\1\144\1\uffff\2\172\2\uffff\1\172\1\145\1\157\2\uffff\1\145\1\uffff\1\144\1\172\3\164\2\172\1\156\3\172\1\165\3\172\1\uffff\1\172\1\uffff\1\172\1\156\3\uffff\1\156\2\172\1\uffff\1\164\1\uffff\1\172\1\uffff\2\172\2\uffff\1\172\3\uffff\1\144\1\162\2\172\1\141\1\163\1\172\1\157\2\uffff\1\164\3\uffff\1\143\5\uffff\2\147\2\uffff\1\151\4\uffff\2\172\2\uffff\2\164\1\172\1\uffff\1\162\1\172\1\145\2\172\1\157\2\uffff\2\151\1\uffff\1\172\1\uffff\1\172\2\uffff\1\156\2\157\2\uffff\1\172\2\156\1\uffff\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\4\7\uffff\1\22\1\uffff\1\25\11\uffff\1\65\1\66\1\uffff\1\73\2\uffff\1\101\3\uffff\1\116\2\uffff\1\125\1\uffff\1\u0094\1\u0095\1\u0096\1\u0097\1\uffff\1\u0099\1\u009b\1\u009d\5\uffff\1\57\1\5\33\uffff\1\126\1\26\45\uffff\1\77\1\100\1\107\1\104\1\106\1\110\1\105\1\uffff\1\u009a\1\u009c\1\117\3\uffff\1\u0098\30\uffff\1\140\6\uffff\1\111\1\uffff\1\112\1\132\1\151\16\uffff\1\142\1\uffff\1\31\2\uffff\1\114\1\150\42\uffff\1\113\1\153\26\uffff\1\10\15\uffff\1\120\10\uffff\1\102\1\103\14\uffff\1\145\2\uffff\1\157\13\uffff\1\123\1\124\4\uffff\1\71\13\uffff\1\75\2\uffff\1\122\3\uffff\1\154\3\uffff\1\141\1\uffff\1\167\1\115\1\121\15\uffff\1\6\1\uffff\1\12\4\uffff\1\134\22\uffff\1\17\1\uffff\1\166\2\uffff\1\40\2\uffff\1\51\1\70\1\uffff\1\27\1\133\5\uffff\1\33\1\u008c\15\uffff\1\44\2\uffff\1\47\2\uffff\1\144\11\uffff\1\72\4\uffff\1\130\11\uffff\1\54\2\uffff\1\136\5\uffff\1\23\2\uffff\1\u0081\10\uffff\1\46\1\20\5\uffff\1\24\1\uffff\1\30\1\uffff\1\160\12\uffff\1\152\10\uffff\1\131\2\uffff\1\137\1\u008d\4\uffff\1\64\15\uffff\1\63\1\174\1\uffff\1\u0087\2\uffff\1\164\2\uffff\1\146\6\uffff\1\35\1\143\13\uffff\1\74\2\uffff\1\32\1\67\1\135\3\uffff\1\34\2\uffff\1\60\1\uffff\1\u008e\17\uffff\1\1\3\uffff\1\u0089\1\7\2\uffff\1\21\2\uffff\1\11\1\45\3\uffff\1\u008f\1\162\1\uffff\1\43\17\uffff\1\177\1\uffff\1\50\2\uffff\1\55\1\u0080\1\163\3\uffff\1\147\1\uffff\1\170\1\uffff\1\171\2\uffff\1\u008b\1\13\1\uffff\1\36\1\165\1\53\10\uffff\1\u0093\1\37\1\uffff\1\172\1\173\1\161\1\uffff\1\u0092\1\41\1\42\1\176\1\52\2\uffff\1\76\1\u0082\1\uffff\1\155\1\156\1\u0088\1\u008a\2\uffff\1\15\1\127\3\uffff\1\u0090\6\uffff\1\14\1\u0084\2\uffff\1\u0091\1\uffff\1\56\1\uffff\1\62\1\61\3\uffff\1\u0083\1\175\3\uffff\1\u0086\2\uffff\1\u0085\1\16";
    static final String DFA13_specialS =
        "\u02ba\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\56\1\uffff\2\56\22\uffff\1\56\1\uffff\1\51\1\47\2\uffff\1\45\1\52\1\2\1\3\1\42\1\34\1\14\1\35\1\5\1\43\1\53\11\54\1\17\1\4\1\40\1\16\1\37\1\uffff\1\36\32\50\1\30\1\uffff\1\31\1\33\1\50\1\uffff\1\27\1\24\1\15\1\11\1\7\1\32\1\46\1\50\1\12\2\50\1\10\1\44\1\13\1\21\1\1\1\50\1\22\1\23\1\20\1\6\1\26\1\25\1\41\2\50\1\55",
            "\1\60\1\uffff\1\62\10\uffff\1\61\5\uffff\1\57\2\uffff\1\63",
            "",
            "",
            "",
            "\1\64",
            "\1\66\4\uffff\1\67",
            "\1\72\1\uffff\1\70\11\uffff\1\71",
            "\1\74\7\uffff\1\73\5\uffff\1\75",
            "\1\76\3\uffff\1\100\5\uffff\1\77\11\uffff\1\101",
            "\1\106\1\uffff\1\105\6\uffff\1\103\1\102\4\uffff\1\104",
            "\1\107\3\uffff\1\112\3\uffff\1\110\5\uffff\1\111",
            "",
            "\1\117\2\uffff\1\120\3\uffff\1\116\3\uffff\1\114\2\uffff\1\113\5\uffff\1\115",
            "",
            "\1\121",
            "\1\124\6\uffff\1\125\2\uffff\1\126\6\uffff\1\123",
            "\1\131\3\uffff\1\127\5\uffff\1\130\1\uffff\1\133\3\uffff\1\132\2\uffff\1\134\1\135",
            "\1\137\3\uffff\1\136",
            "\1\145\3\uffff\1\144\2\uffff\1\141\1\140\3\uffff\1\142\6\uffff\1\143",
            "\1\150\11\uffff\1\147\11\uffff\1\146",
            "\1\153\1\152\5\uffff\1\151\2\uffff\1\154",
            "\1\155\7\uffff\1\156",
            "\1\161\13\uffff\1\157\3\uffff\1\160\1\162\1\163",
            "",
            "",
            "\1\167\7\uffff\1\164\5\uffff\1\165\5\uffff\1\166",
            "",
            "\1\53\11\54",
            "\1\53\11\54",
            "",
            "\1\172",
            "\1\174\1\175",
            "\1\177",
            "",
            "\1\u0080\4\uffff\1\u0081",
            "\1\u0084\11\uffff\1\u0083",
            "",
            "\1\u0085",
            "",
            "",
            "",
            "",
            "\1\u0086\37\uffff\1\u0086",
            "",
            "",
            "",
            "\1\u0088\5\uffff\1\u0087",
            "\1\u0089\17\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\1\u008e\12\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0094\14\uffff\1\u0092\3\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\12\uffff\1\u0098",
            "\1\u009c\11\uffff\1\u009a\2\uffff\1\u009b",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\24\50\1\u009d\1\50\1\u009e\3\50",
            "\1\u00a0",
            "\1\u00a1",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\3\50\1\u00a3\3\50\1\u00a4\1\u00a5\12\50\1\u00a2\6\50",
            "\1\u00a7",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\17\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b1\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u00ba",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u00bc",
            "\1\u00bd",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\1\uffff\1\u00c3\3\uffff\1\u00c5\1\uffff\1\u00c6\6\uffff\1\u00c4\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00cb\2\uffff\1\u00ca\2\uffff\1\u00cc",
            "\1\u00cd",
            "\1\u00cf\12\uffff\1\u00d0\2\uffff\1\u00ce",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\17\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00de\16\uffff\1\u00dd",
            "\1\u00df",
            "\1\u00e0",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\14\50\1\u00e1\15\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u00e4\1\uffff\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e9",
            "",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ee\3\uffff\1\u00ed\10\uffff\1\u00f0\3\uffff\1\u00ef",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0109",
            "\1\u010b\56\uffff\1\u010a",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "",
            "",
            "",
            "\1\u0110",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0123",
            "\1\u0125\7\uffff\1\u0124",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\1\u013f\7\50\1\u013e\21\50",
            "\1\u0141",
            "\1\u0142",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0144",
            "\1\u0145\4\uffff\1\u0146",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0148",
            "\1\u0149",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\26\50\1\u014a\3\50",
            "\1\u014c",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157\3\uffff\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u015e",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0160",
            "\1\u0161\3\uffff\1\u0162",
            "\1\u0163",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167\15\uffff\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0171\12\uffff\1\u0170",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0178",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u017a",
            "\1\u017b",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u017d",
            "\1\u017e",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0181",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0187\5\uffff\1\u0186",
            "\2\50\10\uffff\1\50\2\uffff\4\50\1\u0188\5\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\u0197",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0199",
            "\1\u019a",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u019c\17\uffff\1\u019d",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01a9",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "",
            "",
            "",
            "\1\u01ac",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01b8\17\uffff\1\u01b9",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "",
            "\1\u01bf",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01c1",
            "\1\u01c2",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\21\50\1\u01d2\10\50",
            "\1\u01d4",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01d6",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "",
            "\1\u01ea",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u01f5",
            "\1\u01f6",
            "",
            "\1\u01f8\2\uffff\1\u01f7",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0204",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0206",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\22\50\1\u0207\7\50",
            "\1\u0209",
            "\1\u020a",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u020c",
            "",
            "\1\u020d",
            "\1\u020e",
            "",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "\1\u021c",
            "",
            "\1\u021d",
            "",
            "\1\u021e",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0220",
            "\1\u0221",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0229",
            "\1\u022a",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u022c",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u022e",
            "\1\u022f",
            "",
            "\1\u0230",
            "\1\u0231",
            "",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0243",
            "",
            "\1\u0244",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0246",
            "\1\u0247",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u024f",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "",
            "\1\u0259",
            "\1\u025a",
            "",
            "",
            "",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "",
            "\1\u025e",
            "\1\u025f",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0261",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0263",
            "\1\u0264",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u026c",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u026e",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0270",
            "\1\u0271",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0274",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0278",
            "\1\u0279",
            "",
            "",
            "\1\u027a",
            "",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0282",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0286",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u028c",
            "",
            "",
            "",
            "\1\u028d",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0290",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0295",
            "\1\u0296",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u0299",
            "\1\u029a\21\uffff\1\u029b",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u029d",
            "",
            "",
            "\1\u029e",
            "",
            "",
            "",
            "\1\u029f",
            "",
            "",
            "",
            "",
            "",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "",
            "\1\u02a2",
            "",
            "",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u02a5",
            "\1\u02a6",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u02a8",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u02aa",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u02ad",
            "",
            "",
            "\1\u02ae",
            "\1\u02af",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\1\u02b6",
            "\1\u02b7",
            "",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "\2\50\10\uffff\1\50\2\uffff\12\50\7\uffff\32\50\1\uffff\1\50\2\uffff\1\50\1\uffff\32\50",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | RULE_ID | RULE_DQVALUE | RULE_QVALUE | RULE_HEX | RULE_INT | RULE_COMMENT | RULE_MORECOMMENT | RULE_LINE_COMMENT | RULE_WS );";
        }
    }
 

}