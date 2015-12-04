package uk.ac.york.cs.cs2as.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCS2ASDSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=11;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
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
    public String getGrammarFileName() { return "../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:11:7: ( 'source' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:11:9: 'source'
            {
            match("source"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:12:7: ( ',' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:12:9: ','
            {
            match(','); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:13:7: ( 'target' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:13:9: 'target'
            {
            match("target"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:14:7: ( ':' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:14:9: ':'
            {
            match(':'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:15:7: ( '::*' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:15:9: '::*'
            {
            match("::*"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:16:7: ( 'mappings' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:16:9: 'mappings'
            {
            match("mappings"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:17:7: ( '{' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:17:9: '{'
            {
            match('{'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:18:7: ( '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:18:9: '}'
            {
            match('}'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:19:7: ( 'map' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:19:9: 'map'
            {
            match("map"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:20:7: ( 'from' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:20:9: 'from'
            {
            match("from"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:21:7: ( 'when' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:21:9: 'when'
            {
            match("when"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:22:7: ( ';' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:22:9: ';'
            {
            match(';'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:23:7: ( 'redefine' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:23:9: 'redefine'
            {
            match("redefine"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:24:7: ( ':=' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:24:9: ':='
            {
            match(":="); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:25:7: ( 'disambiguation' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:25:9: 'disambiguation'
            {
            match("disambiguation"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:26:7: ( 'nameresolution' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:26:9: 'nameresolution'
            {
            match("nameresolution"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:27:7: ( 'named-element' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:27:9: 'named-element'
            {
            match("named-element"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:28:7: ( 'name-property' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:28:9: 'name-property'
            {
            match("name-property"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:29:7: ( 'name-referencer' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:29:9: 'name-referencer'
            {
            match("name-referencer"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:30:7: ( 'name-qualifier' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:30:9: 'name-qualifier'
            {
            match("name-qualifier"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:31:7: ( 'name-segments-property' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:31:9: 'name-segments-property'
            {
            match("name-segments-property"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:32:7: ( 'qualifying' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:32:9: 'qualifying'
            {
            match("qualifying"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:33:7: ( 'using' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:33:9: 'using'
            {
            match("using"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:34:7: ( 'following' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:34:9: 'following'
            {
            match("following"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:35:7: ( 'imported' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:35:9: 'imported'
            {
            match("imported"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:36:7: ( 'nested-scope' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:36:9: 'nested-scope'
            {
            match("nested-scope"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:37:7: ( 'same-scope' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:37:9: 'same-scope'
            {
            match("same-scope"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:38:7: ( 'empty-scope' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:38:9: 'empty-scope'
            {
            match("empty-scope"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:39:7: ( 'also-exports' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:39:9: 'also-exports'
            {
            match("also-exports"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:40:7: ( 'occluding' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:40:9: 'occluding'
            {
            match("occluding"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:41:7: ( 'for' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:41:9: 'for'
            {
            match("for"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:42:7: ( 'all' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:42:9: 'all'
            {
            match("all"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:43:7: ( 'excepting' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:43:9: 'excepting'
            {
            match("excepting"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:44:7: ( 'exports' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:44:9: 'exports'
            {
            match("exports"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:45:7: ( 'resolve' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:45:9: 'resolve'
            {
            match("resolve"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:46:7: ( 'lookup' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:46:9: 'lookup'
            {
            match("lookup"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:47:7: ( 'lookupFrom' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:47:9: 'lookupFrom'
            {
            match("lookupFrom"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:48:7: ( '(' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:48:9: '('
            {
            match('('); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:49:7: ( ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:49:9: ')'
            {
            match(')'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:50:7: ( '-' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:50:9: '-'
            {
            match('-'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:51:7: ( 'not' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:51:9: 'not'
            {
            match("not"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:52:7: ( '*' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:52:9: '*'
            {
            match('*'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:53:7: ( '/' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:53:9: '/'
            {
            match('/'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:54:7: ( '+' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:54:9: '+'
            {
            match('+'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:55:7: ( '>' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:55:9: '>'
            {
            match('>'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:56:7: ( '<' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:56:9: '<'
            {
            match('<'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:57:7: ( '>=' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:57:9: '>='
            {
            match(">="); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:58:7: ( '<=' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:58:9: '<='
            {
            match("<="); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:59:7: ( '=' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:59:9: '='
            {
            match('='); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:60:7: ( '<>' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:60:9: '<>'
            {
            match("<>"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:61:7: ( 'and' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:61:9: 'and'
            {
            match("and"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:62:7: ( 'or' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:62:9: 'or'
            {
            match("or"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:63:7: ( 'xor' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:63:9: 'xor'
            {
            match("xor"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:64:7: ( 'implies' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:64:9: 'implies'
            {
            match("implies"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:65:7: ( '.' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:65:9: '.'
            {
            match('.'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:66:7: ( '->' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:66:9: '->'
            {
            match("->"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:67:7: ( '?.' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:67:9: '?.'
            {
            match("?."); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:68:7: ( '?->' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:68:9: '?->'
            {
            match("?->"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:69:7: ( 'Map' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:69:9: 'Map'
            {
            match("Map"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:70:7: ( 'Tuple' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:70:9: 'Tuple'
            {
            match("Tuple"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:71:7: ( '::' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:71:9: '::'
            {
            match("::"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:72:7: ( 'Boolean' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:72:9: 'Boolean'
            {
            match("Boolean"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:73:7: ( 'Integer' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:73:9: 'Integer'
            {
            match("Integer"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:74:7: ( 'Real' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:74:9: 'Real'
            {
            match("Real"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:75:7: ( 'String' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:75:9: 'String'
            {
            match("String"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:76:7: ( 'UnlimitedNatural' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:76:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:77:7: ( 'OclAny' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:77:9: 'OclAny'
            {
            match("OclAny"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:78:7: ( 'OclInvalid' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:78:9: 'OclInvalid'
            {
            match("OclInvalid"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:79:7: ( 'OclVoid' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:79:9: 'OclVoid'
            {
            match("OclVoid"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:80:7: ( 'Set' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:80:9: 'Set'
            {
            match("Set"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:81:7: ( 'Bag' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:81:9: 'Bag'
            {
            match("Bag"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:82:7: ( 'Sequence' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:82:9: 'Sequence'
            {
            match("Sequence"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:83:7: ( 'Collection' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:83:9: 'Collection'
            {
            match("Collection"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:84:7: ( 'OrderedSet' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:84:9: 'OrderedSet'
            {
            match("OrderedSet"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:85:7: ( '..' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:85:9: '..'
            {
            match(".."); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:86:7: ( '++' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:86:9: '++'
            {
            match("++"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:87:7: ( 'Lambda' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:87:9: 'Lambda'
            {
            match("Lambda"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:88:7: ( '<-' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:88:9: '<-'
            {
            match("<-"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:89:7: ( 'true' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:89:9: 'true'
            {
            match("true"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:90:7: ( 'false' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:90:9: 'false'
            {
            match("false"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:91:7: ( 'invalid' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:91:9: 'invalid'
            {
            match("invalid"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:92:7: ( 'null' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:92:9: 'null'
            {
            match("null"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:93:7: ( '@' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:93:9: '@'
            {
            match('@'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:94:7: ( 'pre' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:94:9: 'pre'
            {
            match("pre"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:95:8: ( '[' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:95:10: '['
            {
            match('['); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:96:8: ( ']' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:96:10: ']'
            {
            match(']'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:97:8: ( 'in' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:97:10: 'in'
            {
            match("in"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:98:8: ( '|' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:98:10: '|'
            {
            match('|'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:99:8: ( 'if' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:99:10: 'if'
            {
            match("if"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:100:8: ( 'then' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:100:10: 'then'
            {
            match("then"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:101:8: ( 'else' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:101:10: 'else'
            {
            match("else"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:102:8: ( 'endif' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:102:10: 'endif'
            {
            match("endif"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:103:8: ( 'elseif' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:103:10: 'elseif'
            {
            match("elseif"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:104:8: ( 'let' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:104:10: 'let'
            {
            match("let"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:105:8: ( 'self' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:105:10: 'self'
            {
            match("self"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:106:8: ( '|?' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:106:10: '|?'
            {
            match("|?"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:107:8: ( '|1' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:107:10: '|1'
            {
            match("|1"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:108:8: ( '?' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:108:10: '?'
            {
            match('?'); 

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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:109:8: ( 'extends' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:109:10: 'extends'
            {
            match("extends"); 


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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:110:8: ( '&&' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:110:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "RULE_ESCAPED_CHARACTER"
    public final void mRULE_ESCAPED_CHARACTER() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7503:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7503:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHARACTER"

    // $ANTLR start "RULE_LETTER_CHARACTER"
    public final void mRULE_LETTER_CHARACTER() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7505:32: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7505:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_CHARACTER"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7507:27: ( '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7507:29: '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7507:33: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7507:34: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7507:57: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_QUOTED_STRING"

    // $ANTLR start "RULE_SINGLE_QUOTED_STRING"
    public final void mRULE_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7509:27: ( '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7509:29: '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7509:34: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7509:35: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7509:58: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop2;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_ML_SINGLE_QUOTED_STRING"
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7511:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7511:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7511:38: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7511:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("'/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_SIMPLE_ID"
    public final void mRULE_SIMPLE_ID() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7513:16: ( RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7513:18: RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            {
            mRULE_LETTER_CHARACTER(); 
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7513:40: ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ID"

    // $ANTLR start "RULE_ESCAPED_ID"
    public final void mRULE_ESCAPED_ID() throws RecognitionException {
        try {
            int _type = RULE_ESCAPED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7515:17: ( '_' RULE_SINGLE_QUOTED_STRING )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7515:19: '_' RULE_SINGLE_QUOTED_STRING
            {
            match('_'); 
            mRULE_SINGLE_QUOTED_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7517:10: ( ( '0' .. '9' )+ )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7517:12: ( '0' .. '9' )+
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7517:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7517:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7519:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7519:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7519:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7519:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:41: ( '\\r' )? '\\n'
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7521:41: '\\r'
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7523:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7523:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7523:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7525:16: ( . )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:7525:18: .
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
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=110;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:612: T__114
                {
                mT__114(); 

                }
                break;
            case 100 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:619: T__115
                {
                mT__115(); 

                }
                break;
            case 101 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:626: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 102 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:652: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 103 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:678: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 104 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:707: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 105 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:722: RULE_ESCAPED_ID
                {
                mRULE_ESCAPED_ID(); 

                }
                break;
            case 106 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:738: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 107 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:747: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 108 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:763: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 109 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:779: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 110 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1:787: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\73\1\uffff\1\73\1\102\1\73\2\uffff\2\73\1\uffff\12\73"+
        "\2\uffff\1\144\1\uffff\1\150\1\152\1\154\1\160\1\uffff\1\73\1\164"+
        "\1\167\12\73\1\uffff\1\73\2\uffff\1\u008b\3\67\1\73\4\uffff\3\73"+
        "\2\uffff\3\73\1\u0099\2\uffff\1\73\2\uffff\4\73\1\uffff\11\73\1"+
        "\u00ab\1\u00ac\7\73\1\u00b7\2\73\22\uffff\1\73\5\uffff\15\73\1\uffff"+
        "\1\73\13\uffff\6\73\2\uffff\1\u00d1\2\73\1\u00d4\7\73\1\u00dc\5"+
        "\73\2\uffff\7\73\1\u00ea\1\u00eb\1\73\1\uffff\1\73\1\u00ee\1\u00ef"+
        "\1\u00f0\2\73\1\u00f3\3\73\1\u00f7\6\73\1\u0100\2\73\1\u0103\1\73"+
        "\1\u0105\1\u0106\1\73\1\uffff\1\u0108\1\73\1\uffff\1\73\1\u010b"+
        "\5\73\1\uffff\1\u0113\11\73\1\u011e\2\73\2\uffff\2\73\3\uffff\2"+
        "\73\1\uffff\1\73\1\u0126\1\73\1\uffff\10\73\1\uffff\1\73\2\uffff"+
        "\1\73\2\uffff\1\73\1\uffff\1\73\1\u0134\1\uffff\5\73\1\uffff\1\73"+
        "\1\uffff\1\73\1\u0140\10\73\1\uffff\1\u0149\1\uffff\2\73\1\u014c"+
        "\2\73\1\uffff\11\73\1\u0158\1\u0159\2\73\1\uffff\4\73\5\uffff\2"+
        "\73\1\uffff\3\73\1\uffff\3\73\1\u0168\1\uffff\1\73\1\u016b\1\uffff"+
        "\2\73\1\u016e\2\73\1\u0171\4\73\1\u0176\2\uffff\3\73\1\u017a\2\73"+
        "\1\uffff\2\73\1\u017f\1\u0180\1\73\1\u0182\1\u0183\1\uffff\2\73"+
        "\1\uffff\1\u0186\1\u0187\1\uffff\2\73\1\uffff\1\73\1\u018b\2\73"+
        "\1\uffff\1\u018e\1\73\1\u0190\1\uffff\3\73\1\u0194\2\uffff\1\73"+
        "\2\uffff\2\73\2\uffff\1\u0198\2\73\1\uffff\2\73\1\uffff\1\u019d"+
        "\1\uffff\3\73\1\uffff\1\u01a1\1\u01a2\1\73\1\uffff\4\73\1\uffff"+
        "\2\73\1\u01aa\2\uffff\1\u01ab\1\73\1\u01ad\1\u01ae\1\u01af\2\73"+
        "\2\uffff\1\73\3\uffff\6\73\1\u01b9\1\u01ba\1\73\2\uffff\1\73\1\u01bd"+
        "\1\uffff";
    static final String DFA11_eofS =
        "\u01be\uffff";
    static final String DFA11_minS =
        "\1\0\1\141\1\uffff\1\141\1\72\1\141\2\uffff\1\141\1\150\1\uffff"+
        "\1\145\1\151\1\141\1\165\1\163\1\146\2\154\1\143\1\145\2\uffff\1"+
        "\55\1\uffff\1\47\1\53\1\75\1\55\1\uffff\1\157\1\56\1\55\1\141\1"+
        "\165\1\141\1\156\2\145\1\156\1\143\1\157\1\141\1\uffff\1\162\2\uffff"+
        "\1\61\1\46\2\0\1\47\4\uffff\1\165\1\155\1\154\2\uffff\1\162\1\165"+
        "\1\145\1\52\2\uffff\1\160\2\uffff\1\157\2\154\1\145\1\uffff\1\144"+
        "\1\163\1\155\1\163\1\164\1\154\1\141\1\151\1\160\2\60\1\160\1\143"+
        "\1\163\1\144\1\154\1\144\1\143\1\60\1\157\1\164\22\uffff\1\162\5"+
        "\uffff\2\160\1\157\1\147\1\164\1\141\1\162\1\161\2\154\1\144\1\154"+
        "\1\155\1\uffff\1\145\13\uffff\1\162\1\145\1\146\1\147\1\145\1\156"+
        "\2\uffff\1\60\1\155\1\154\1\60\1\163\1\156\1\145\1\157\1\141\1\145"+
        "\1\164\1\60\2\154\1\156\1\154\1\141\2\uffff\1\164\1\145\1\157\2"+
        "\145\1\151\1\157\2\60\1\154\1\uffff\1\153\3\60\2\154\1\60\1\145"+
        "\1\154\1\151\1\60\1\165\1\151\1\101\1\145\1\154\1\142\1\60\1\143"+
        "\1\55\1\60\1\145\2\60\1\151\1\uffff\1\60\1\157\1\uffff\1\145\1\60"+
        "\1\146\1\154\1\155\1\55\1\145\1\uffff\1\60\1\151\1\147\1\162\1\151"+
        "\1\154\1\171\1\160\1\162\1\156\1\60\1\146\1\55\2\uffff\2\165\3\uffff"+
        "\2\145\1\uffff\1\147\1\60\1\156\1\uffff\1\145\1\155\2\156\1\157"+
        "\1\162\1\145\1\144\1\uffff\1\145\2\uffff\1\164\2\uffff\1\156\1\uffff"+
        "\1\167\1\60\1\uffff\1\151\1\166\1\142\1\145\1\55\1\160\1\144\1\uffff"+
        "\1\146\1\60\1\164\1\145\1\151\1\55\2\164\1\144\1\146\1\uffff\1\60"+
        "\1\uffff\1\144\1\160\1\60\1\141\1\145\1\uffff\1\147\1\156\1\151"+
        "\1\171\1\166\1\151\1\145\1\143\1\141\2\60\1\147\1\151\1\uffff\1"+
        "\156\1\145\1\151\1\163\5\uffff\1\55\1\171\1\uffff\1\145\1\163\1"+
        "\144\1\uffff\1\151\2\163\1\60\1\uffff\1\151\1\60\1\uffff\1\156\1"+
        "\162\1\60\1\143\1\164\1\60\1\141\2\144\1\164\1\60\2\uffff\1\163"+
        "\1\156\1\145\1\60\1\147\1\157\1\uffff\1\151\1\144\2\60\1\156\2\60"+
        "\1\uffff\1\156\1\162\1\uffff\2\60\1\uffff\2\145\1\uffff\1\154\1"+
        "\60\1\123\1\151\1\uffff\1\60\1\147\1\60\1\uffff\1\165\1\154\1\156"+
        "\1\60\2\uffff\1\147\2\uffff\1\147\1\157\2\uffff\1\60\1\144\1\151"+
        "\1\uffff\1\145\1\157\1\uffff\1\60\1\uffff\1\141\1\165\1\147\1\uffff"+
        "\2\60\1\155\1\uffff\1\116\1\144\1\164\1\156\1\uffff\2\164\1\60\2"+
        "\uffff\1\60\1\141\3\60\2\151\2\uffff\1\164\3\uffff\2\157\1\165\2"+
        "\156\1\162\2\60\1\141\2\uffff\1\154\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\157\1\uffff\1\162\1\75\1\141\2\uffff\1\162\1\150\1\uffff"+
        "\1\145\1\151\2\165\1\163\1\156\1\170\1\156\1\162\1\157\2\uffff\1"+
        "\76\1\uffff\1\52\1\53\1\75\1\76\1\uffff\1\157\2\56\1\141\1\165\1"+
        "\157\1\156\1\145\1\164\1\156\1\162\1\157\1\141\1\uffff\1\162\2\uffff"+
        "\1\77\1\46\2\uffff\1\47\4\uffff\1\165\1\155\1\154\2\uffff\1\162"+
        "\1\165\1\145\1\52\2\uffff\1\160\2\uffff\1\157\1\162\1\154\1\145"+
        "\1\uffff\2\163\1\155\1\163\1\164\1\154\1\141\1\151\1\160\2\172\1"+
        "\160\1\164\1\163\1\144\1\163\1\144\1\143\1\172\1\157\1\164\22\uffff"+
        "\1\162\5\uffff\2\160\1\157\1\147\1\164\1\141\1\162\1\164\2\154\1"+
        "\144\1\154\1\155\1\uffff\1\145\13\uffff\1\162\1\145\1\146\1\147"+
        "\1\145\1\156\2\uffff\1\172\1\155\1\154\1\172\1\163\1\156\1\145\1"+
        "\157\1\141\1\145\1\164\1\172\2\154\1\156\1\157\1\141\2\uffff\1\164"+
        "\1\145\1\157\2\145\1\151\1\157\2\172\1\154\1\uffff\1\153\3\172\2"+
        "\154\1\172\1\145\1\154\1\151\1\172\1\165\1\151\1\126\1\145\1\154"+
        "\1\142\1\172\1\143\1\55\1\172\1\145\2\172\1\151\1\uffff\1\172\1"+
        "\157\1\uffff\1\145\1\172\1\146\1\154\1\155\1\162\1\145\1\uffff\1"+
        "\172\1\151\1\147\1\162\1\151\1\154\1\171\1\160\1\162\1\156\1\172"+
        "\1\146\1\55\2\uffff\2\165\3\uffff\2\145\1\uffff\1\147\1\172\1\156"+
        "\1\uffff\1\145\1\155\2\156\1\157\1\162\1\145\1\144\1\uffff\1\145"+
        "\2\uffff\1\164\2\uffff\1\156\1\uffff\1\167\1\172\1\uffff\1\151\1"+
        "\166\1\142\1\145\1\55\1\163\1\144\1\uffff\1\146\1\172\1\164\1\145"+
        "\1\151\1\55\2\164\1\144\1\146\1\uffff\1\172\1\uffff\1\144\1\160"+
        "\1\172\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1\166\1\151\1"+
        "\145\1\143\1\141\2\172\1\147\1\151\1\uffff\1\156\1\145\1\151\1\163"+
        "\5\uffff\1\55\1\171\1\uffff\1\145\1\163\1\144\1\uffff\1\151\2\163"+
        "\1\172\1\uffff\1\151\1\172\1\uffff\1\156\1\162\1\172\1\143\1\164"+
        "\1\172\1\141\2\144\1\164\1\172\2\uffff\1\163\1\156\1\145\1\172\1"+
        "\147\1\157\1\uffff\1\151\1\144\2\172\1\156\2\172\1\uffff\1\156\1"+
        "\162\1\uffff\2\172\1\uffff\2\145\1\uffff\1\154\1\172\1\123\1\151"+
        "\1\uffff\1\172\1\147\1\172\1\uffff\1\165\1\154\1\156\1\172\2\uffff"+
        "\1\147\2\uffff\1\147\1\157\2\uffff\1\172\1\144\1\151\1\uffff\1\145"+
        "\1\157\1\uffff\1\172\1\uffff\1\141\1\165\1\147\1\uffff\2\172\1\155"+
        "\1\uffff\1\116\1\144\1\164\1\156\1\uffff\2\164\1\172\2\uffff\1\172"+
        "\1\141\3\172\2\151\2\uffff\1\164\3\uffff\2\157\1\165\2\156\1\162"+
        "\2\172\1\141\2\uffff\1\154\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\3\uffff\1\7\1\10\2\uffff\1\14\12\uffff\1\46\1\47\1"+
        "\uffff\1\52\4\uffff\1\61\15\uffff\1\123\1\uffff\1\125\1\126\5\uffff"+
        "\1\150\1\152\1\155\1\156\3\uffff\1\150\1\2\4\uffff\1\16\1\4\1\uffff"+
        "\1\7\1\10\4\uffff\1\14\25\uffff\1\46\1\47\1\70\1\154\1\50\1\52\1"+
        "\147\1\153\1\53\1\114\1\54\1\57\1\55\1\60\1\62\1\116\1\56\1\61\1"+
        "\uffff\1\113\1\67\1\71\1\72\1\142\15\uffff\1\123\1\uffff\1\125\1"+
        "\126\1\140\1\141\1\130\1\144\1\145\1\146\1\151\1\152\1\155\6\uffff"+
        "\1\5\1\75\21\uffff\1\127\1\131\12\uffff\1\64\31\uffff\1\11\2\uffff"+
        "\1\37\7\uffff\1\51\15\uffff\1\40\1\63\2\uffff\1\136\1\65\1\73\2"+
        "\uffff\1\107\3\uffff\1\106\10\uffff\1\124\1\uffff\1\33\1\137\1\uffff"+
        "\1\117\1\132\1\uffff\1\12\2\uffff\1\13\7\uffff\1\122\12\uffff\1"+
        "\133\1\uffff\1\35\5\uffff\1\100\15\uffff\1\120\4\uffff\1\21\1\22"+
        "\1\23\1\24\1\25\2\uffff\1\27\3\uffff\1\34\4\uffff\1\134\2\uffff"+
        "\1\74\13\uffff\1\1\1\3\6\uffff\1\32\7\uffff\1\135\2\uffff\1\44\2"+
        "\uffff\1\101\2\uffff\1\103\4\uffff\1\115\3\uffff\1\43\4\uffff\1"+
        "\66\1\121\1\uffff\1\42\1\143\2\uffff\1\76\1\77\3\uffff\1\105\2\uffff"+
        "\1\6\1\uffff\1\15\3\uffff\1\31\3\uffff\1\110\4\uffff\1\30\3\uffff"+
        "\1\41\1\36\7\uffff\1\26\1\45\1\uffff\1\104\1\112\1\111\11\uffff"+
        "\1\17\1\20\2\uffff\1\102";
    static final String DFA11_specialS =
        "\1\2\60\uffff\1\0\1\1\u018b\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\67\1\61\3\67\1\60\1\62\1"+
            "\25\1\26\1\30\1\32\1\2\1\27\1\37\1\31\12\65\1\4\1\12\1\34\1"+
            "\35\1\33\1\40\1\53\1\64\1\43\1\51\5\64\1\44\2\64\1\52\1\41\1"+
            "\64\1\50\2\64\1\45\1\46\1\42\1\47\5\64\1\55\1\67\1\56\1\67\1"+
            "\63\1\67\1\22\2\64\1\14\1\21\1\10\2\64\1\20\2\64\1\24\1\5\1"+
            "\15\1\23\1\54\1\16\1\13\1\1\1\3\1\17\1\64\1\11\1\36\2\64\1\6"+
            "\1\57\1\7\uff82\67",
            "\1\71\3\uffff\1\72\11\uffff\1\70",
            "",
            "\1\75\6\uffff\1\77\11\uffff\1\76",
            "\1\100\2\uffff\1\101",
            "\1\103",
            "",
            "",
            "\1\110\15\uffff\1\107\2\uffff\1\106",
            "\1\111",
            "",
            "\1\113",
            "\1\114",
            "\1\115\3\uffff\1\116\11\uffff\1\117\5\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\125\6\uffff\1\123\1\124",
            "\1\130\1\126\1\131\11\uffff\1\127",
            "\1\132\1\uffff\1\133",
            "\1\134\16\uffff\1\135",
            "\1\137\11\uffff\1\136",
            "",
            "",
            "\1\143\20\uffff\1\142",
            "",
            "\1\146\2\uffff\1\147",
            "\1\151",
            "\1\153",
            "\1\157\17\uffff\1\155\1\156",
            "",
            "\1\162",
            "\1\163",
            "\1\166\1\165",
            "\1\170",
            "\1\171",
            "\1\173\15\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\177\16\uffff\1\176",
            "\1\u0080",
            "\1\u0081\16\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0086",
            "",
            "",
            "\1\u008a\15\uffff\1\u0089",
            "\1\u008c",
            "\0\u008d",
            "\0\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c\5\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0\16\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\25\73\1\u00aa\4"+
            "\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00ad",
            "\1\u00ae\14\uffff\1\u00af\3\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\6\uffff\1\u00b3",
            "\1\u00b5",
            "\1\u00b6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00b8",
            "\1\u00b9",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ba",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c3\2\uffff\1\u00c2",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
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
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\17\73\1\u00d0\12"+
            "\73",
            "\1\u00d2",
            "\1\u00d3",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e1\2\uffff\1\u00e0",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00f1",
            "\1\u00f2",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\7\uffff\1\u00fb\14\uffff\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0101",
            "\1\u0102",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0104",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0107",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0109",
            "",
            "\1\u010a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u0111\66\uffff\1\u0110\15\uffff\1\u010f",
            "\1\u0112",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u011d\21"+
            "\73",
            "\1\u011f",
            "\1\u0120",
            "",
            "",
            "\1\u0121",
            "\1\u0122",
            "",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "",
            "",
            "\1\u0131",
            "",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a\1\u013c\1\u013b\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u014a",
            "\1\u014b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u015a",
            "\1\u015b",
            "",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "",
            "",
            "",
            "",
            "\1\u0160",
            "\1\u0161",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0169",
            "\12\73\7\uffff\5\73\1\u016a\24\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\u016c",
            "\1\u016d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u016f",
            "\1\u0170",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u017b",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0181",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0184",
            "\1\u0185",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\u018a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u018c",
            "\1\u018d",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u018f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0195",
            "",
            "",
            "\1\u0196",
            "\1\u0197",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0199",
            "\1\u019a",
            "",
            "\1\u019b",
            "\1\u019c",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01ac",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "",
            "\1\u01b2",
            "",
            "",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01bb",
            "",
            "",
            "\1\u01bc",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    static class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_49 = input.LA(1);

                        s = -1;
                        if ( ((LA11_49>='\u0000' && LA11_49<='\uFFFF')) ) {s = 141;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_50 = input.LA(1);

                        s = -1;
                        if ( ((LA11_50>='\u0000' && LA11_50<='\uFFFF')) ) {s = 142;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='s') ) {s = 1;}

                        else if ( (LA11_0==',') ) {s = 2;}

                        else if ( (LA11_0=='t') ) {s = 3;}

                        else if ( (LA11_0==':') ) {s = 4;}

                        else if ( (LA11_0=='m') ) {s = 5;}

                        else if ( (LA11_0=='{') ) {s = 6;}

                        else if ( (LA11_0=='}') ) {s = 7;}

                        else if ( (LA11_0=='f') ) {s = 8;}

                        else if ( (LA11_0=='w') ) {s = 9;}

                        else if ( (LA11_0==';') ) {s = 10;}

                        else if ( (LA11_0=='r') ) {s = 11;}

                        else if ( (LA11_0=='d') ) {s = 12;}

                        else if ( (LA11_0=='n') ) {s = 13;}

                        else if ( (LA11_0=='q') ) {s = 14;}

                        else if ( (LA11_0=='u') ) {s = 15;}

                        else if ( (LA11_0=='i') ) {s = 16;}

                        else if ( (LA11_0=='e') ) {s = 17;}

                        else if ( (LA11_0=='a') ) {s = 18;}

                        else if ( (LA11_0=='o') ) {s = 19;}

                        else if ( (LA11_0=='l') ) {s = 20;}

                        else if ( (LA11_0=='(') ) {s = 21;}

                        else if ( (LA11_0==')') ) {s = 22;}

                        else if ( (LA11_0=='-') ) {s = 23;}

                        else if ( (LA11_0=='*') ) {s = 24;}

                        else if ( (LA11_0=='/') ) {s = 25;}

                        else if ( (LA11_0=='+') ) {s = 26;}

                        else if ( (LA11_0=='>') ) {s = 27;}

                        else if ( (LA11_0=='<') ) {s = 28;}

                        else if ( (LA11_0=='=') ) {s = 29;}

                        else if ( (LA11_0=='x') ) {s = 30;}

                        else if ( (LA11_0=='.') ) {s = 31;}

                        else if ( (LA11_0=='?') ) {s = 32;}

                        else if ( (LA11_0=='M') ) {s = 33;}

                        else if ( (LA11_0=='T') ) {s = 34;}

                        else if ( (LA11_0=='B') ) {s = 35;}

                        else if ( (LA11_0=='I') ) {s = 36;}

                        else if ( (LA11_0=='R') ) {s = 37;}

                        else if ( (LA11_0=='S') ) {s = 38;}

                        else if ( (LA11_0=='U') ) {s = 39;}

                        else if ( (LA11_0=='O') ) {s = 40;}

                        else if ( (LA11_0=='C') ) {s = 41;}

                        else if ( (LA11_0=='L') ) {s = 42;}

                        else if ( (LA11_0=='@') ) {s = 43;}

                        else if ( (LA11_0=='p') ) {s = 44;}

                        else if ( (LA11_0=='[') ) {s = 45;}

                        else if ( (LA11_0==']') ) {s = 46;}

                        else if ( (LA11_0=='|') ) {s = 47;}

                        else if ( (LA11_0=='&') ) {s = 48;}

                        else if ( (LA11_0=='\"') ) {s = 49;}

                        else if ( (LA11_0=='\'') ) {s = 50;}

                        else if ( (LA11_0=='_') ) {s = 51;}

                        else if ( (LA11_0=='A'||(LA11_0>='D' && LA11_0<='H')||(LA11_0>='J' && LA11_0<='K')||LA11_0=='N'||(LA11_0>='P' && LA11_0<='Q')||(LA11_0>='V' && LA11_0<='Z')||(LA11_0>='b' && LA11_0<='c')||(LA11_0>='g' && LA11_0<='h')||(LA11_0>='j' && LA11_0<='k')||LA11_0=='v'||(LA11_0>='y' && LA11_0<='z')) ) {s = 52;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 53;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 54;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='%')||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}