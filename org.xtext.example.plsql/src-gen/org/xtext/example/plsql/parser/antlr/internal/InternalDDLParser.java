package org.xtext.example.plsql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.plsql.services.DDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "'TABLE'", "'('", "','", "')'", "';'", "'ALTER'", "'ADD'", "'ENABLE'", "'CONSTRAINT'", "'COMMENT'", "'ON'", "'COLUMN'", "'.'", "'IS'", "'SEQUENCE'", "'INCREMENT'", "'BY'", "'START'", "'WITH'", "'MAXVALUE'", "'NOMAXVALUE'", "'MINVALUE'", "'NOMINVALUE'", "'CYCLE'", "'NOCYCLE'", "'CACHE'", "'NOCACHE'", "'ORDER'", "'NOORDER'", "'PRIMARY'", "'KEY'", "'UNIQUE'", "'FOREIGN'", "'REFERENCES'", "'NULL'", "'NOT'", "'NUMBER'", "'VARCHAR2'", "'DATE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDDL.g"; }



     	private DDLGrammarAccess grammarAccess;

        public InternalDDLParser(TokenStream input, DDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Data_definition";
       	}

       	@Override
       	protected DDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleData_definition"
    // InternalDDL.g:64:1: entryRuleData_definition returns [EObject current=null] : iv_ruleData_definition= ruleData_definition EOF ;
    public final EObject entryRuleData_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData_definition = null;


        try {
            // InternalDDL.g:64:56: (iv_ruleData_definition= ruleData_definition EOF )
            // InternalDDL.g:65:2: iv_ruleData_definition= ruleData_definition EOF
            {
             newCompositeNode(grammarAccess.getData_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData_definition=ruleData_definition();

            state._fsp--;

             current =iv_ruleData_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData_definition"


    // $ANTLR start "ruleData_definition"
    // InternalDDL.g:71:1: ruleData_definition returns [EObject current=null] : ( (lv_definitions_0_0= ruleDefinition ) )+ ;
    public final EObject ruleData_definition() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:77:2: ( ( (lv_definitions_0_0= ruleDefinition ) )+ )
            // InternalDDL.g:78:2: ( (lv_definitions_0_0= ruleDefinition ) )+
            {
            // InternalDDL.g:78:2: ( (lv_definitions_0_0= ruleDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDDL.g:79:3: (lv_definitions_0_0= ruleDefinition )
            	    {
            	    // InternalDDL.g:79:3: (lv_definitions_0_0= ruleDefinition )
            	    // InternalDDL.g:80:4: lv_definitions_0_0= ruleDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getData_definitionAccess().getDefinitionsDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_definitions_0_0=ruleDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getData_definitionRule());
            	    				}
            	    				add(
            	    					current,
            	    					"definitions",
            	    					lv_definitions_0_0,
            	    					"org.xtext.example.plsql.DDL.Definition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData_definition"


    // $ANTLR start "entryRuleDefinition"
    // InternalDDL.g:100:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalDDL.g:100:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalDDL.g:101:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalDDL.g:107:1: ruleDefinition returns [EObject current=null] : (this_Create_table_0= ruleCreate_table | this_Alter_table_1= ruleAlter_table | this_Create_sequence_2= ruleCreate_sequence | this_Comment_3= ruleComment ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Create_table_0 = null;

        EObject this_Alter_table_1 = null;

        EObject this_Create_sequence_2 = null;

        EObject this_Comment_3 = null;



        	enterRule();

        try {
            // InternalDDL.g:113:2: ( (this_Create_table_0= ruleCreate_table | this_Alter_table_1= ruleAlter_table | this_Create_sequence_2= ruleCreate_sequence | this_Comment_3= ruleComment ) )
            // InternalDDL.g:114:2: (this_Create_table_0= ruleCreate_table | this_Alter_table_1= ruleAlter_table | this_Create_sequence_2= ruleCreate_sequence | this_Comment_3= ruleComment )
            {
            // InternalDDL.g:114:2: (this_Create_table_0= ruleCreate_table | this_Alter_table_1= ruleAlter_table | this_Create_sequence_2= ruleCreate_sequence | this_Comment_3= ruleComment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==26) ) {
                    alt2=3;
                }
                else if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDDL.g:115:3: this_Create_table_0= ruleCreate_table
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getCreate_tableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_table_0=ruleCreate_table();

                    state._fsp--;


                    			current = this_Create_table_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDDL.g:124:3: this_Alter_table_1= ruleAlter_table
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getAlter_tableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alter_table_1=ruleAlter_table();

                    state._fsp--;


                    			current = this_Alter_table_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDDL.g:133:3: this_Create_sequence_2= ruleCreate_sequence
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getCreate_sequenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_sequence_2=ruleCreate_sequence();

                    state._fsp--;


                    			current = this_Create_sequence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDDL.g:142:3: this_Comment_3= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getCommentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_3=ruleComment();

                    state._fsp--;


                    			current = this_Comment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleCreate_table"
    // InternalDDL.g:154:1: entryRuleCreate_table returns [EObject current=null] : iv_ruleCreate_table= ruleCreate_table EOF ;
    public final EObject entryRuleCreate_table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate_table = null;


        try {
            // InternalDDL.g:154:53: (iv_ruleCreate_table= ruleCreate_table EOF )
            // InternalDDL.g:155:2: iv_ruleCreate_table= ruleCreate_table EOF
            {
             newCompositeNode(grammarAccess.getCreate_tableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate_table=ruleCreate_table();

            state._fsp--;

             current =iv_ruleCreate_table; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate_table"


    // $ANTLR start "ruleCreate_table"
    // InternalDDL.g:161:1: ruleCreate_table returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) ) )* (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) ) )* otherlv_9= ')' otherlv_10= ';' ) ;
    public final EObject ruleCreate_table() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:167:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) ) )* (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) ) )* otherlv_9= ')' otherlv_10= ';' ) )
            // InternalDDL.g:168:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) ) )* (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) ) )* otherlv_9= ')' otherlv_10= ';' )
            {
            // InternalDDL.g:168:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) ) )* (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) ) )* otherlv_9= ')' otherlv_10= ';' )
            // InternalDDL.g:169:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) ) )* (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) ) )* otherlv_9= ')' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreate_tableAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreate_tableAccess().getTABLEKeyword_1());
            		
            // InternalDDL.g:177:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalDDL.g:178:4: (lv_id_2_0= RULE_ID )
            {
            // InternalDDL.g:178:4: (lv_id_2_0= RULE_ID )
            // InternalDDL.g:179:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_2_0, grammarAccess.getCreate_tableAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreate_tableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCreate_tableAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDDL.g:199:3: ( (lv_columns_4_0= ruleColumn ) )
            // InternalDDL.g:200:4: (lv_columns_4_0= ruleColumn )
            {
            // InternalDDL.g:200:4: (lv_columns_4_0= ruleColumn )
            // InternalDDL.g:201:5: lv_columns_4_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getCreate_tableAccess().getColumnsColumnParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_columns_4_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreate_tableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_4_0,
            						"org.xtext.example.plsql.DDL.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDDL.g:218:3: (otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalDDL.g:219:4: otherlv_5= ',' ( (lv_columns_6_0= ruleColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCreate_tableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDDL.g:223:4: ( (lv_columns_6_0= ruleColumn ) )
            	    // InternalDDL.g:224:5: (lv_columns_6_0= ruleColumn )
            	    {
            	    // InternalDDL.g:224:5: (lv_columns_6_0= ruleColumn )
            	    // InternalDDL.g:225:6: lv_columns_6_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getCreate_tableAccess().getColumnsColumnParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_columns_6_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCreate_tableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_6_0,
            	    							"org.xtext.example.plsql.DDL.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDDL.g:243:3: (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDDL.g:244:4: otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraint ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCreate_tableAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDDL.g:248:4: ( (lv_constraints_8_0= ruleConstraint ) )
            	    // InternalDDL.g:249:5: (lv_constraints_8_0= ruleConstraint )
            	    {
            	    // InternalDDL.g:249:5: (lv_constraints_8_0= ruleConstraint )
            	    // InternalDDL.g:250:6: lv_constraints_8_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getCreate_tableAccess().getConstraintsConstraintParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_constraints_8_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCreate_tableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_8_0,
            	    							"org.xtext.example.plsql.DDL.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getCreate_tableAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCreate_tableAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreate_table"


    // $ANTLR start "entryRuleColumn"
    // InternalDDL.g:280:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDDL.g:280:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDDL.g:281:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDDL.g:287:1: ruleColumn returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTYPE ) ) (otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')' )? ( (lv_isNull_5_0= ruleISNULL ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_isNull_5_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:293:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTYPE ) ) (otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')' )? ( (lv_isNull_5_0= ruleISNULL ) )? ) )
            // InternalDDL.g:294:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTYPE ) ) (otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')' )? ( (lv_isNull_5_0= ruleISNULL ) )? )
            {
            // InternalDDL.g:294:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTYPE ) ) (otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')' )? ( (lv_isNull_5_0= ruleISNULL ) )? )
            // InternalDDL.g:295:3: ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTYPE ) ) (otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')' )? ( (lv_isNull_5_0= ruleISNULL ) )?
            {
            // InternalDDL.g:295:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalDDL.g:296:4: (lv_id_0_0= RULE_ID )
            {
            // InternalDDL.g:296:4: (lv_id_0_0= RULE_ID )
            // InternalDDL.g:297:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_id_0_0, grammarAccess.getColumnAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDDL.g:313:3: ( (lv_type_1_0= ruleTYPE ) )
            // InternalDDL.g:314:4: (lv_type_1_0= ruleTYPE )
            {
            // InternalDDL.g:314:4: (lv_type_1_0= ruleTYPE )
            // InternalDDL.g:315:5: lv_type_1_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeTYPEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_1_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.plsql.DDL.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDDL.g:332:3: (otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDDL.g:333:4: otherlv_2= '(' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDDL.g:337:4: ( (lv_number_3_0= RULE_INT ) )
                    // InternalDDL.g:338:5: (lv_number_3_0= RULE_INT )
                    {
                    // InternalDDL.g:338:5: (lv_number_3_0= RULE_INT )
                    // InternalDDL.g:339:6: lv_number_3_0= RULE_INT
                    {
                    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_number_3_0, grammarAccess.getColumnAccess().getNumberINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalDDL.g:360:3: ( (lv_isNull_5_0= ruleISNULL ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=46 && LA6_0<=47)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDDL.g:361:4: (lv_isNull_5_0= ruleISNULL )
                    {
                    // InternalDDL.g:361:4: (lv_isNull_5_0= ruleISNULL )
                    // InternalDDL.g:362:5: lv_isNull_5_0= ruleISNULL
                    {

                    					newCompositeNode(grammarAccess.getColumnAccess().getIsNullISNULLParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_isNull_5_0=ruleISNULL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnRule());
                    					}
                    					set(
                    						current,
                    						"isNull",
                    						lv_isNull_5_0,
                    						"org.xtext.example.plsql.DDL.ISNULL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleAlter_table"
    // InternalDDL.g:383:1: entryRuleAlter_table returns [EObject current=null] : iv_ruleAlter_table= ruleAlter_table EOF ;
    public final EObject entryRuleAlter_table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlter_table = null;


        try {
            // InternalDDL.g:383:52: (iv_ruleAlter_table= ruleAlter_table EOF )
            // InternalDDL.g:384:2: iv_ruleAlter_table= ruleAlter_table EOF
            {
             newCompositeNode(grammarAccess.getAlter_tableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlter_table=ruleAlter_table();

            state._fsp--;

             current =iv_ruleAlter_table; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlter_table"


    // $ANTLR start "ruleAlter_table"
    // InternalDDL.g:390:1: ruleAlter_table returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_tabname_2_0= ruleTabname ) ) ( ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) ) | ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) ;
    public final EObject ruleAlter_table() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_add_3_0=null;
        Token lv_enable_5_0=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        EObject lv_tabname_2_0 = null;

        EObject lv_constraint_4_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:396:2: ( (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_tabname_2_0= ruleTabname ) ) ( ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) ) | ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) )
            // InternalDDL.g:397:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_tabname_2_0= ruleTabname ) ) ( ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) ) | ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            {
            // InternalDDL.g:397:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_tabname_2_0= ruleTabname ) ) ( ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) ) | ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            // InternalDDL.g:398:3: otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_tabname_2_0= ruleTabname ) ) ( ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) ) | ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlter_tableAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAlter_tableAccess().getTABLEKeyword_1());
            		
            // InternalDDL.g:406:3: ( (lv_tabname_2_0= ruleTabname ) )
            // InternalDDL.g:407:4: (lv_tabname_2_0= ruleTabname )
            {
            // InternalDDL.g:407:4: (lv_tabname_2_0= ruleTabname )
            // InternalDDL.g:408:5: lv_tabname_2_0= ruleTabname
            {

            					newCompositeNode(grammarAccess.getAlter_tableAccess().getTabnameTabnameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_tabname_2_0=ruleTabname();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlter_tableRule());
            					}
            					set(
            						current,
            						"tabname",
            						lv_tabname_2_0,
            						"org.xtext.example.plsql.DDL.Tabname");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDDL.g:425:3: ( ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) ) | ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDDL.g:426:4: ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) )
                    {
                    // InternalDDL.g:426:4: ( ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) ) )
                    // InternalDDL.g:427:5: ( (lv_add_3_0= 'ADD' ) ) ( (lv_constraint_4_0= ruleConstraint ) )
                    {
                    // InternalDDL.g:427:5: ( (lv_add_3_0= 'ADD' ) )
                    // InternalDDL.g:428:6: (lv_add_3_0= 'ADD' )
                    {
                    // InternalDDL.g:428:6: (lv_add_3_0= 'ADD' )
                    // InternalDDL.g:429:7: lv_add_3_0= 'ADD'
                    {
                    lv_add_3_0=(Token)match(input,18,FOLLOW_8); 

                    							newLeafNode(lv_add_3_0, grammarAccess.getAlter_tableAccess().getAddADDKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAlter_tableRule());
                    							}
                    							setWithLastConsumed(current, "add", lv_add_3_0, "ADD");
                    						

                    }


                    }

                    // InternalDDL.g:441:5: ( (lv_constraint_4_0= ruleConstraint ) )
                    // InternalDDL.g:442:6: (lv_constraint_4_0= ruleConstraint )
                    {
                    // InternalDDL.g:442:6: (lv_constraint_4_0= ruleConstraint )
                    // InternalDDL.g:443:7: lv_constraint_4_0= ruleConstraint
                    {

                    							newCompositeNode(grammarAccess.getAlter_tableAccess().getConstraintConstraintParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_constraint_4_0=ruleConstraint();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAlter_tableRule());
                    							}
                    							set(
                    								current,
                    								"constraint",
                    								lv_constraint_4_0,
                    								"org.xtext.example.plsql.DDL.Constraint");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDDL.g:462:4: ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) )
                    {
                    // InternalDDL.g:462:4: ( ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) ) )
                    // InternalDDL.g:463:5: ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' ) ( (lv_id_7_0= RULE_ID ) )
                    {
                    // InternalDDL.g:463:5: ( ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT' )
                    // InternalDDL.g:464:6: ( (lv_enable_5_0= 'ENABLE' ) ) otherlv_6= 'CONSTRAINT'
                    {
                    // InternalDDL.g:464:6: ( (lv_enable_5_0= 'ENABLE' ) )
                    // InternalDDL.g:465:7: (lv_enable_5_0= 'ENABLE' )
                    {
                    // InternalDDL.g:465:7: (lv_enable_5_0= 'ENABLE' )
                    // InternalDDL.g:466:8: lv_enable_5_0= 'ENABLE'
                    {
                    lv_enable_5_0=(Token)match(input,19,FOLLOW_8); 

                    								newLeafNode(lv_enable_5_0, grammarAccess.getAlter_tableAccess().getEnableENABLEKeyword_3_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getAlter_tableRule());
                    								}
                    								setWithLastConsumed(current, "enable", lv_enable_5_0, "ENABLE");
                    							

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_5); 

                    						newLeafNode(otherlv_6, grammarAccess.getAlter_tableAccess().getCONSTRAINTKeyword_3_1_0_1());
                    					

                    }

                    // InternalDDL.g:483:5: ( (lv_id_7_0= RULE_ID ) )
                    // InternalDDL.g:484:6: (lv_id_7_0= RULE_ID )
                    {
                    // InternalDDL.g:484:6: (lv_id_7_0= RULE_ID )
                    // InternalDDL.g:485:7: lv_id_7_0= RULE_ID
                    {
                    lv_id_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(lv_id_7_0, grammarAccess.getAlter_tableAccess().getIdIDTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAlter_tableRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"id",
                    								lv_id_7_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAlter_tableAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlter_table"


    // $ANTLR start "entryRuleComment"
    // InternalDDL.g:511:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalDDL.g:511:48: (iv_ruleComment= ruleComment EOF )
            // InternalDDL.g:512:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalDDL.g:518:1: ruleComment returns [EObject current=null] : (otherlv_0= 'COMMENT' otherlv_1= 'ON' ( (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) ) | (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) ) ) otherlv_8= 'IS' ( (lv_string_9_0= RULE_STRING ) ) otherlv_10= ';' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_columnId_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_string_9_0=null;
        Token otherlv_10=null;
        EObject lv_tabname_3_0 = null;

        EObject lv_colname_7_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:524:2: ( (otherlv_0= 'COMMENT' otherlv_1= 'ON' ( (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) ) | (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) ) ) otherlv_8= 'IS' ( (lv_string_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            // InternalDDL.g:525:2: (otherlv_0= 'COMMENT' otherlv_1= 'ON' ( (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) ) | (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) ) ) otherlv_8= 'IS' ( (lv_string_9_0= RULE_STRING ) ) otherlv_10= ';' )
            {
            // InternalDDL.g:525:2: (otherlv_0= 'COMMENT' otherlv_1= 'ON' ( (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) ) | (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) ) ) otherlv_8= 'IS' ( (lv_string_9_0= RULE_STRING ) ) otherlv_10= ';' )
            // InternalDDL.g:526:3: otherlv_0= 'COMMENT' otherlv_1= 'ON' ( (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) ) | (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) ) ) otherlv_8= 'IS' ( (lv_string_9_0= RULE_STRING ) ) otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCOMMENTKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getONKeyword_1());
            		
            // InternalDDL.g:534:3: ( (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) ) | (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDDL.g:535:4: (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) )
                    {
                    // InternalDDL.g:535:4: (otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) ) )
                    // InternalDDL.g:536:5: otherlv_2= 'TABLE' ( (lv_tabname_3_0= ruleTabname ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getTABLEKeyword_2_0_0());
                    				
                    // InternalDDL.g:540:5: ( (lv_tabname_3_0= ruleTabname ) )
                    // InternalDDL.g:541:6: (lv_tabname_3_0= ruleTabname )
                    {
                    // InternalDDL.g:541:6: (lv_tabname_3_0= ruleTabname )
                    // InternalDDL.g:542:7: lv_tabname_3_0= ruleTabname
                    {

                    							newCompositeNode(grammarAccess.getCommentAccess().getTabnameTabnameParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_tabname_3_0=ruleTabname();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommentRule());
                    							}
                    							set(
                    								current,
                    								"tabname",
                    								lv_tabname_3_0,
                    								"org.xtext.example.plsql.DDL.Tabname");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDDL.g:561:4: (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) )
                    {
                    // InternalDDL.g:561:4: (otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) ) )
                    // InternalDDL.g:562:5: otherlv_4= 'COLUMN' ( (lv_columnId_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_colname_7_0= ruleColname ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getCOLUMNKeyword_2_1_0());
                    				
                    // InternalDDL.g:566:5: ( (lv_columnId_5_0= RULE_ID ) )
                    // InternalDDL.g:567:6: (lv_columnId_5_0= RULE_ID )
                    {
                    // InternalDDL.g:567:6: (lv_columnId_5_0= RULE_ID )
                    // InternalDDL.g:568:7: lv_columnId_5_0= RULE_ID
                    {
                    lv_columnId_5_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    							newLeafNode(lv_columnId_5_0, grammarAccess.getCommentAccess().getColumnIdIDTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCommentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"columnId",
                    								lv_columnId_5_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getCommentAccess().getFullStopKeyword_2_1_2());
                    				
                    // InternalDDL.g:588:5: ( (lv_colname_7_0= ruleColname ) )
                    // InternalDDL.g:589:6: (lv_colname_7_0= ruleColname )
                    {
                    // InternalDDL.g:589:6: (lv_colname_7_0= ruleColname )
                    // InternalDDL.g:590:7: lv_colname_7_0= ruleColname
                    {

                    							newCompositeNode(grammarAccess.getCommentAccess().getColnameColnameParserRuleCall_2_1_3_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_colname_7_0=ruleColname();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommentRule());
                    							}
                    							set(
                    								current,
                    								"colname",
                    								lv_colname_7_0,
                    								"org.xtext.example.plsql.DDL.Colname");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getCommentAccess().getISKeyword_3());
            		
            // InternalDDL.g:613:3: ( (lv_string_9_0= RULE_STRING ) )
            // InternalDDL.g:614:4: (lv_string_9_0= RULE_STRING )
            {
            // InternalDDL.g:614:4: (lv_string_9_0= RULE_STRING )
            // InternalDDL.g:615:5: lv_string_9_0= RULE_STRING
            {
            lv_string_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_string_9_0, grammarAccess.getCommentAccess().getStringSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCommentAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleCreate_sequence"
    // InternalDDL.g:639:1: entryRuleCreate_sequence returns [EObject current=null] : iv_ruleCreate_sequence= ruleCreate_sequence EOF ;
    public final EObject entryRuleCreate_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate_sequence = null;


        try {
            // InternalDDL.g:639:56: (iv_ruleCreate_sequence= ruleCreate_sequence EOF )
            // InternalDDL.g:640:2: iv_ruleCreate_sequence= ruleCreate_sequence EOF
            {
             newCompositeNode(grammarAccess.getCreate_sequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate_sequence=ruleCreate_sequence();

            state._fsp--;

             current =iv_ruleCreate_sequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate_sequence"


    // $ANTLR start "ruleCreate_sequence"
    // InternalDDL.g:646:1: ruleCreate_sequence returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'SEQUENCE' ( (lv_id_2_0= RULE_ID ) ) ( (lv_sequence_options_3_0= ruleSequence_options ) )* otherlv_4= ';' ) ;
    public final EObject ruleCreate_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_4=null;
        EObject lv_sequence_options_3_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:652:2: ( (otherlv_0= 'CREATE' otherlv_1= 'SEQUENCE' ( (lv_id_2_0= RULE_ID ) ) ( (lv_sequence_options_3_0= ruleSequence_options ) )* otherlv_4= ';' ) )
            // InternalDDL.g:653:2: (otherlv_0= 'CREATE' otherlv_1= 'SEQUENCE' ( (lv_id_2_0= RULE_ID ) ) ( (lv_sequence_options_3_0= ruleSequence_options ) )* otherlv_4= ';' )
            {
            // InternalDDL.g:653:2: (otherlv_0= 'CREATE' otherlv_1= 'SEQUENCE' ( (lv_id_2_0= RULE_ID ) ) ( (lv_sequence_options_3_0= ruleSequence_options ) )* otherlv_4= ';' )
            // InternalDDL.g:654:3: otherlv_0= 'CREATE' otherlv_1= 'SEQUENCE' ( (lv_id_2_0= RULE_ID ) ) ( (lv_sequence_options_3_0= ruleSequence_options ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCreate_sequenceAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreate_sequenceAccess().getSEQUENCEKeyword_1());
            		
            // InternalDDL.g:662:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalDDL.g:663:4: (lv_id_2_0= RULE_ID )
            {
            // InternalDDL.g:663:4: (lv_id_2_0= RULE_ID )
            // InternalDDL.g:664:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_2_0, grammarAccess.getCreate_sequenceAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreate_sequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDDL.g:680:3: ( (lv_sequence_options_3_0= ruleSequence_options ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||LA9_0==29||(LA9_0>=31 && LA9_0<=40)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDDL.g:681:4: (lv_sequence_options_3_0= ruleSequence_options )
            	    {
            	    // InternalDDL.g:681:4: (lv_sequence_options_3_0= ruleSequence_options )
            	    // InternalDDL.g:682:5: lv_sequence_options_3_0= ruleSequence_options
            	    {

            	    					newCompositeNode(grammarAccess.getCreate_sequenceAccess().getSequence_optionsSequence_optionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_sequence_options_3_0=ruleSequence_options();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreate_sequenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sequence_options",
            	    						lv_sequence_options_3_0,
            	    						"org.xtext.example.plsql.DDL.Sequence_options");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCreate_sequenceAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreate_sequence"


    // $ANTLR start "entryRuleSequence_options"
    // InternalDDL.g:707:1: entryRuleSequence_options returns [EObject current=null] : iv_ruleSequence_options= ruleSequence_options EOF ;
    public final EObject entryRuleSequence_options() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence_options = null;


        try {
            // InternalDDL.g:707:57: (iv_ruleSequence_options= ruleSequence_options EOF )
            // InternalDDL.g:708:2: iv_ruleSequence_options= ruleSequence_options EOF
            {
             newCompositeNode(grammarAccess.getSequence_optionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequence_options=ruleSequence_options();

            state._fsp--;

             current =iv_ruleSequence_options; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence_options"


    // $ANTLR start "ruleSequence_options"
    // InternalDDL.g:714:1: ruleSequence_options returns [EObject current=null] : ( ( ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT ) | ( ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT ) | ( ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT ) | ( (lv_nomaxvalue_8_0= 'NOMAXVALUE' ) ) | ( ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT ) | ( (lv_nominvalue_11_0= 'NOMINVALUE' ) ) | ( (lv_cycle_12_0= 'CYCLE' ) ) | ( (lv_nocycle_13_0= 'NOCYCLE' ) ) | ( ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT ) | ( (lv_nocache_16_0= 'NOCACHE' ) ) | ( (lv_order_17_0= 'ORDER' ) ) | ( (lv_noorder_18_0= 'NOORDER' ) ) ) ;
    public final EObject ruleSequence_options() throws RecognitionException {
        EObject current = null;

        Token lv_increment_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;
        Token lv_start_3_0=null;
        Token otherlv_4=null;
        Token this_INT_5=null;
        Token lv_maxvalue_6_0=null;
        Token this_INT_7=null;
        Token lv_nomaxvalue_8_0=null;
        Token lv_minvalue_9_0=null;
        Token this_INT_10=null;
        Token lv_nominvalue_11_0=null;
        Token lv_cycle_12_0=null;
        Token lv_nocycle_13_0=null;
        Token lv_cache_14_0=null;
        Token this_INT_15=null;
        Token lv_nocache_16_0=null;
        Token lv_order_17_0=null;
        Token lv_noorder_18_0=null;


        	enterRule();

        try {
            // InternalDDL.g:720:2: ( ( ( ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT ) | ( ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT ) | ( ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT ) | ( (lv_nomaxvalue_8_0= 'NOMAXVALUE' ) ) | ( ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT ) | ( (lv_nominvalue_11_0= 'NOMINVALUE' ) ) | ( (lv_cycle_12_0= 'CYCLE' ) ) | ( (lv_nocycle_13_0= 'NOCYCLE' ) ) | ( ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT ) | ( (lv_nocache_16_0= 'NOCACHE' ) ) | ( (lv_order_17_0= 'ORDER' ) ) | ( (lv_noorder_18_0= 'NOORDER' ) ) ) )
            // InternalDDL.g:721:2: ( ( ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT ) | ( ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT ) | ( ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT ) | ( (lv_nomaxvalue_8_0= 'NOMAXVALUE' ) ) | ( ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT ) | ( (lv_nominvalue_11_0= 'NOMINVALUE' ) ) | ( (lv_cycle_12_0= 'CYCLE' ) ) | ( (lv_nocycle_13_0= 'NOCYCLE' ) ) | ( ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT ) | ( (lv_nocache_16_0= 'NOCACHE' ) ) | ( (lv_order_17_0= 'ORDER' ) ) | ( (lv_noorder_18_0= 'NOORDER' ) ) )
            {
            // InternalDDL.g:721:2: ( ( ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT ) | ( ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT ) | ( ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT ) | ( (lv_nomaxvalue_8_0= 'NOMAXVALUE' ) ) | ( ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT ) | ( (lv_nominvalue_11_0= 'NOMINVALUE' ) ) | ( (lv_cycle_12_0= 'CYCLE' ) ) | ( (lv_nocycle_13_0= 'NOCYCLE' ) ) | ( ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT ) | ( (lv_nocache_16_0= 'NOCACHE' ) ) | ( (lv_order_17_0= 'ORDER' ) ) | ( (lv_noorder_18_0= 'NOORDER' ) ) )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            case 33:
                {
                alt10=5;
                }
                break;
            case 34:
                {
                alt10=6;
                }
                break;
            case 35:
                {
                alt10=7;
                }
                break;
            case 36:
                {
                alt10=8;
                }
                break;
            case 37:
                {
                alt10=9;
                }
                break;
            case 38:
                {
                alt10=10;
                }
                break;
            case 39:
                {
                alt10=11;
                }
                break;
            case 40:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDDL.g:722:3: ( ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT )
                    {
                    // InternalDDL.g:722:3: ( ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT )
                    // InternalDDL.g:723:4: ( (lv_increment_0_0= 'INCREMENT' ) ) otherlv_1= 'BY' this_INT_2= RULE_INT
                    {
                    // InternalDDL.g:723:4: ( (lv_increment_0_0= 'INCREMENT' ) )
                    // InternalDDL.g:724:5: (lv_increment_0_0= 'INCREMENT' )
                    {
                    // InternalDDL.g:724:5: (lv_increment_0_0= 'INCREMENT' )
                    // InternalDDL.g:725:6: lv_increment_0_0= 'INCREMENT'
                    {
                    lv_increment_0_0=(Token)match(input,27,FOLLOW_23); 

                    						newLeafNode(lv_increment_0_0, grammarAccess.getSequence_optionsAccess().getIncrementINCREMENTKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequence_optionsRule());
                    						}
                    						setWithLastConsumed(current, "increment", lv_increment_0_0, "INCREMENT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequence_optionsAccess().getBYKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_2, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDDL.g:747:3: ( ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT )
                    {
                    // InternalDDL.g:747:3: ( ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT )
                    // InternalDDL.g:748:4: ( (lv_start_3_0= 'START' ) ) otherlv_4= 'WITH' this_INT_5= RULE_INT
                    {
                    // InternalDDL.g:748:4: ( (lv_start_3_0= 'START' ) )
                    // InternalDDL.g:749:5: (lv_start_3_0= 'START' )
                    {
                    // InternalDDL.g:749:5: (lv_start_3_0= 'START' )
                    // InternalDDL.g:750:6: lv_start_3_0= 'START'
                    {
                    lv_start_3_0=(Token)match(input,29,FOLLOW_24); 

                    						newLeafNode(lv_start_3_0, grammarAccess.getSequence_optionsAccess().getStartSTARTKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequence_optionsRule());
                    						}
                    						setWithLastConsumed(current, "start", lv_start_3_0, "START");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getSequence_optionsAccess().getWITHKeyword_1_1());
                    			
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_5, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDDL.g:772:3: ( ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT )
                    {
                    // InternalDDL.g:772:3: ( ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT )
                    // InternalDDL.g:773:4: ( (lv_maxvalue_6_0= 'MAXVALUE' ) ) this_INT_7= RULE_INT
                    {
                    // InternalDDL.g:773:4: ( (lv_maxvalue_6_0= 'MAXVALUE' ) )
                    // InternalDDL.g:774:5: (lv_maxvalue_6_0= 'MAXVALUE' )
                    {
                    // InternalDDL.g:774:5: (lv_maxvalue_6_0= 'MAXVALUE' )
                    // InternalDDL.g:775:6: lv_maxvalue_6_0= 'MAXVALUE'
                    {
                    lv_maxvalue_6_0=(Token)match(input,31,FOLLOW_12); 

                    						newLeafNode(lv_maxvalue_6_0, grammarAccess.getSequence_optionsAccess().getMaxvalueMAXVALUEKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequence_optionsRule());
                    						}
                    						setWithLastConsumed(current, "maxvalue", lv_maxvalue_6_0, "MAXVALUE");
                    					

                    }


                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_7, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDDL.g:793:3: ( (lv_nomaxvalue_8_0= 'NOMAXVALUE' ) )
                    {
                    // InternalDDL.g:793:3: ( (lv_nomaxvalue_8_0= 'NOMAXVALUE' ) )
                    // InternalDDL.g:794:4: (lv_nomaxvalue_8_0= 'NOMAXVALUE' )
                    {
                    // InternalDDL.g:794:4: (lv_nomaxvalue_8_0= 'NOMAXVALUE' )
                    // InternalDDL.g:795:5: lv_nomaxvalue_8_0= 'NOMAXVALUE'
                    {
                    lv_nomaxvalue_8_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_nomaxvalue_8_0, grammarAccess.getSequence_optionsAccess().getNomaxvalueNOMAXVALUEKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "nomaxvalue", lv_nomaxvalue_8_0, "NOMAXVALUE");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDDL.g:808:3: ( ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT )
                    {
                    // InternalDDL.g:808:3: ( ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT )
                    // InternalDDL.g:809:4: ( (lv_minvalue_9_0= 'MINVALUE' ) ) this_INT_10= RULE_INT
                    {
                    // InternalDDL.g:809:4: ( (lv_minvalue_9_0= 'MINVALUE' ) )
                    // InternalDDL.g:810:5: (lv_minvalue_9_0= 'MINVALUE' )
                    {
                    // InternalDDL.g:810:5: (lv_minvalue_9_0= 'MINVALUE' )
                    // InternalDDL.g:811:6: lv_minvalue_9_0= 'MINVALUE'
                    {
                    lv_minvalue_9_0=(Token)match(input,33,FOLLOW_12); 

                    						newLeafNode(lv_minvalue_9_0, grammarAccess.getSequence_optionsAccess().getMinvalueMINVALUEKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequence_optionsRule());
                    						}
                    						setWithLastConsumed(current, "minvalue", lv_minvalue_9_0, "MINVALUE");
                    					

                    }


                    }

                    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_10, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDDL.g:829:3: ( (lv_nominvalue_11_0= 'NOMINVALUE' ) )
                    {
                    // InternalDDL.g:829:3: ( (lv_nominvalue_11_0= 'NOMINVALUE' ) )
                    // InternalDDL.g:830:4: (lv_nominvalue_11_0= 'NOMINVALUE' )
                    {
                    // InternalDDL.g:830:4: (lv_nominvalue_11_0= 'NOMINVALUE' )
                    // InternalDDL.g:831:5: lv_nominvalue_11_0= 'NOMINVALUE'
                    {
                    lv_nominvalue_11_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_nominvalue_11_0, grammarAccess.getSequence_optionsAccess().getNominvalueNOMINVALUEKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "nominvalue", lv_nominvalue_11_0, "NOMINVALUE");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDDL.g:844:3: ( (lv_cycle_12_0= 'CYCLE' ) )
                    {
                    // InternalDDL.g:844:3: ( (lv_cycle_12_0= 'CYCLE' ) )
                    // InternalDDL.g:845:4: (lv_cycle_12_0= 'CYCLE' )
                    {
                    // InternalDDL.g:845:4: (lv_cycle_12_0= 'CYCLE' )
                    // InternalDDL.g:846:5: lv_cycle_12_0= 'CYCLE'
                    {
                    lv_cycle_12_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cycle_12_0, grammarAccess.getSequence_optionsAccess().getCycleCYCLEKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "cycle", lv_cycle_12_0, "CYCLE");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDDL.g:859:3: ( (lv_nocycle_13_0= 'NOCYCLE' ) )
                    {
                    // InternalDDL.g:859:3: ( (lv_nocycle_13_0= 'NOCYCLE' ) )
                    // InternalDDL.g:860:4: (lv_nocycle_13_0= 'NOCYCLE' )
                    {
                    // InternalDDL.g:860:4: (lv_nocycle_13_0= 'NOCYCLE' )
                    // InternalDDL.g:861:5: lv_nocycle_13_0= 'NOCYCLE'
                    {
                    lv_nocycle_13_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_nocycle_13_0, grammarAccess.getSequence_optionsAccess().getNocycleNOCYCLEKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "nocycle", lv_nocycle_13_0, "NOCYCLE");
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDDL.g:874:3: ( ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT )
                    {
                    // InternalDDL.g:874:3: ( ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT )
                    // InternalDDL.g:875:4: ( (lv_cache_14_0= 'CACHE' ) ) this_INT_15= RULE_INT
                    {
                    // InternalDDL.g:875:4: ( (lv_cache_14_0= 'CACHE' ) )
                    // InternalDDL.g:876:5: (lv_cache_14_0= 'CACHE' )
                    {
                    // InternalDDL.g:876:5: (lv_cache_14_0= 'CACHE' )
                    // InternalDDL.g:877:6: lv_cache_14_0= 'CACHE'
                    {
                    lv_cache_14_0=(Token)match(input,37,FOLLOW_12); 

                    						newLeafNode(lv_cache_14_0, grammarAccess.getSequence_optionsAccess().getCacheCACHEKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequence_optionsRule());
                    						}
                    						setWithLastConsumed(current, "cache", lv_cache_14_0, "CACHE");
                    					

                    }


                    }

                    this_INT_15=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_15, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDDL.g:895:3: ( (lv_nocache_16_0= 'NOCACHE' ) )
                    {
                    // InternalDDL.g:895:3: ( (lv_nocache_16_0= 'NOCACHE' ) )
                    // InternalDDL.g:896:4: (lv_nocache_16_0= 'NOCACHE' )
                    {
                    // InternalDDL.g:896:4: (lv_nocache_16_0= 'NOCACHE' )
                    // InternalDDL.g:897:5: lv_nocache_16_0= 'NOCACHE'
                    {
                    lv_nocache_16_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_nocache_16_0, grammarAccess.getSequence_optionsAccess().getNocacheNOCACHEKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "nocache", lv_nocache_16_0, "NOCACHE");
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDDL.g:910:3: ( (lv_order_17_0= 'ORDER' ) )
                    {
                    // InternalDDL.g:910:3: ( (lv_order_17_0= 'ORDER' ) )
                    // InternalDDL.g:911:4: (lv_order_17_0= 'ORDER' )
                    {
                    // InternalDDL.g:911:4: (lv_order_17_0= 'ORDER' )
                    // InternalDDL.g:912:5: lv_order_17_0= 'ORDER'
                    {
                    lv_order_17_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_order_17_0, grammarAccess.getSequence_optionsAccess().getOrderORDERKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "order", lv_order_17_0, "ORDER");
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDDL.g:925:3: ( (lv_noorder_18_0= 'NOORDER' ) )
                    {
                    // InternalDDL.g:925:3: ( (lv_noorder_18_0= 'NOORDER' ) )
                    // InternalDDL.g:926:4: (lv_noorder_18_0= 'NOORDER' )
                    {
                    // InternalDDL.g:926:4: (lv_noorder_18_0= 'NOORDER' )
                    // InternalDDL.g:927:5: lv_noorder_18_0= 'NOORDER'
                    {
                    lv_noorder_18_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_noorder_18_0, grammarAccess.getSequence_optionsAccess().getNoorderNOORDERKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSequence_optionsRule());
                    					}
                    					setWithLastConsumed(current, "noorder", lv_noorder_18_0, "NOORDER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence_options"


    // $ANTLR start "entryRuleConstraint"
    // InternalDDL.g:943:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDDL.g:943:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDDL.g:944:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDDL.g:950:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'CONSTRAINT' ( (lv_id_1_0= RULE_ID ) ) ( (lv_key_2_0= ruleKey ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        EObject lv_key_2_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:956:2: ( (otherlv_0= 'CONSTRAINT' ( (lv_id_1_0= RULE_ID ) ) ( (lv_key_2_0= ruleKey ) ) ) )
            // InternalDDL.g:957:2: (otherlv_0= 'CONSTRAINT' ( (lv_id_1_0= RULE_ID ) ) ( (lv_key_2_0= ruleKey ) ) )
            {
            // InternalDDL.g:957:2: (otherlv_0= 'CONSTRAINT' ( (lv_id_1_0= RULE_ID ) ) ( (lv_key_2_0= ruleKey ) ) )
            // InternalDDL.g:958:3: otherlv_0= 'CONSTRAINT' ( (lv_id_1_0= RULE_ID ) ) ( (lv_key_2_0= ruleKey ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCONSTRAINTKeyword_0());
            		
            // InternalDDL.g:962:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalDDL.g:963:4: (lv_id_1_0= RULE_ID )
            {
            // InternalDDL.g:963:4: (lv_id_1_0= RULE_ID )
            // InternalDDL.g:964:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_1_0, grammarAccess.getConstraintAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDDL.g:980:3: ( (lv_key_2_0= ruleKey ) )
            // InternalDDL.g:981:4: (lv_key_2_0= ruleKey )
            {
            // InternalDDL.g:981:4: (lv_key_2_0= ruleKey )
            // InternalDDL.g:982:5: lv_key_2_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getKeyKeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_2_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.xtext.example.plsql.DDL.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleKey"
    // InternalDDL.g:1003:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalDDL.g:1003:44: (iv_ruleKey= ruleKey EOF )
            // InternalDDL.g:1004:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalDDL.g:1010:1: ruleKey returns [EObject current=null] : (this_Primary_key_0= rulePrimary_key | this_Unique_key_1= ruleUnique_key | this_Foreign_key_2= ruleForeign_key ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_key_0 = null;

        EObject this_Unique_key_1 = null;

        EObject this_Foreign_key_2 = null;



        	enterRule();

        try {
            // InternalDDL.g:1016:2: ( (this_Primary_key_0= rulePrimary_key | this_Unique_key_1= ruleUnique_key | this_Foreign_key_2= ruleForeign_key ) )
            // InternalDDL.g:1017:2: (this_Primary_key_0= rulePrimary_key | this_Unique_key_1= ruleUnique_key | this_Foreign_key_2= ruleForeign_key )
            {
            // InternalDDL.g:1017:2: (this_Primary_key_0= rulePrimary_key | this_Unique_key_1= ruleUnique_key | this_Foreign_key_2= ruleForeign_key )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDDL.g:1018:3: this_Primary_key_0= rulePrimary_key
                    {

                    			newCompositeNode(grammarAccess.getKeyAccess().getPrimary_keyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_key_0=rulePrimary_key();

                    state._fsp--;


                    			current = this_Primary_key_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDDL.g:1027:3: this_Unique_key_1= ruleUnique_key
                    {

                    			newCompositeNode(grammarAccess.getKeyAccess().getUnique_keyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Unique_key_1=ruleUnique_key();

                    state._fsp--;


                    			current = this_Unique_key_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDDL.g:1036:3: this_Foreign_key_2= ruleForeign_key
                    {

                    			newCompositeNode(grammarAccess.getKeyAccess().getForeign_keyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreign_key_2=ruleForeign_key();

                    state._fsp--;


                    			current = this_Foreign_key_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRulePrimary_key"
    // InternalDDL.g:1048:1: entryRulePrimary_key returns [EObject current=null] : iv_rulePrimary_key= rulePrimary_key EOF ;
    public final EObject entryRulePrimary_key() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary_key = null;


        try {
            // InternalDDL.g:1048:52: (iv_rulePrimary_key= rulePrimary_key EOF )
            // InternalDDL.g:1049:2: iv_rulePrimary_key= rulePrimary_key EOF
            {
             newCompositeNode(grammarAccess.getPrimary_keyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary_key=rulePrimary_key();

            state._fsp--;

             current =iv_rulePrimary_key; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary_key"


    // $ANTLR start "rulePrimary_key"
    // InternalDDL.g:1055:1: rulePrimary_key returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) (otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) ) )* otherlv_6= ')' ) ;
    public final EObject rulePrimary_key() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_colNames_3_0 = null;

        EObject lv_colNames_5_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:1061:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) (otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) ) )* otherlv_6= ')' ) )
            // InternalDDL.g:1062:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) (otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) ) )* otherlv_6= ')' )
            {
            // InternalDDL.g:1062:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) (otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) ) )* otherlv_6= ')' )
            // InternalDDL.g:1063:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) (otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimary_keyAccess().getPRIMARYKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimary_keyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimary_keyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDDL.g:1075:3: ( (lv_colNames_3_0= ruleColname ) )
            // InternalDDL.g:1076:4: (lv_colNames_3_0= ruleColname )
            {
            // InternalDDL.g:1076:4: (lv_colNames_3_0= ruleColname )
            // InternalDDL.g:1077:5: lv_colNames_3_0= ruleColname
            {

            					newCompositeNode(grammarAccess.getPrimary_keyAccess().getColNamesColnameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_colNames_3_0=ruleColname();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimary_keyRule());
            					}
            					add(
            						current,
            						"colNames",
            						lv_colNames_3_0,
            						"org.xtext.example.plsql.DDL.Colname");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDDL.g:1094:3: (otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDDL.g:1095:4: otherlv_4= ',' ( (lv_colNames_5_0= ruleColname ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimary_keyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDDL.g:1099:4: ( (lv_colNames_5_0= ruleColname ) )
            	    // InternalDDL.g:1100:5: (lv_colNames_5_0= ruleColname )
            	    {
            	    // InternalDDL.g:1100:5: (lv_colNames_5_0= ruleColname )
            	    // InternalDDL.g:1101:6: lv_colNames_5_0= ruleColname
            	    {

            	    						newCompositeNode(grammarAccess.getPrimary_keyAccess().getColNamesColnameParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_colNames_5_0=ruleColname();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPrimary_keyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colNames",
            	    							lv_colNames_5_0,
            	    							"org.xtext.example.plsql.DDL.Colname");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrimary_keyAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary_key"


    // $ANTLR start "entryRuleUnique_key"
    // InternalDDL.g:1127:1: entryRuleUnique_key returns [EObject current=null] : iv_ruleUnique_key= ruleUnique_key EOF ;
    public final EObject entryRuleUnique_key() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnique_key = null;


        try {
            // InternalDDL.g:1127:51: (iv_ruleUnique_key= ruleUnique_key EOF )
            // InternalDDL.g:1128:2: iv_ruleUnique_key= ruleUnique_key EOF
            {
             newCompositeNode(grammarAccess.getUnique_keyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnique_key=ruleUnique_key();

            state._fsp--;

             current =iv_ruleUnique_key; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnique_key"


    // $ANTLR start "ruleUnique_key"
    // InternalDDL.g:1134:1: ruleUnique_key returns [EObject current=null] : (otherlv_0= 'UNIQUE' otherlv_1= '(' ( (lv_colNames_2_0= ruleColname ) ) (otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleUnique_key() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_colNames_2_0 = null;

        EObject lv_colNames_4_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:1140:2: ( (otherlv_0= 'UNIQUE' otherlv_1= '(' ( (lv_colNames_2_0= ruleColname ) ) (otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) ) )* otherlv_5= ')' ) )
            // InternalDDL.g:1141:2: (otherlv_0= 'UNIQUE' otherlv_1= '(' ( (lv_colNames_2_0= ruleColname ) ) (otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) ) )* otherlv_5= ')' )
            {
            // InternalDDL.g:1141:2: (otherlv_0= 'UNIQUE' otherlv_1= '(' ( (lv_colNames_2_0= ruleColname ) ) (otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) ) )* otherlv_5= ')' )
            // InternalDDL.g:1142:3: otherlv_0= 'UNIQUE' otherlv_1= '(' ( (lv_colNames_2_0= ruleColname ) ) (otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUnique_keyAccess().getUNIQUEKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUnique_keyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDDL.g:1150:3: ( (lv_colNames_2_0= ruleColname ) )
            // InternalDDL.g:1151:4: (lv_colNames_2_0= ruleColname )
            {
            // InternalDDL.g:1151:4: (lv_colNames_2_0= ruleColname )
            // InternalDDL.g:1152:5: lv_colNames_2_0= ruleColname
            {

            					newCompositeNode(grammarAccess.getUnique_keyAccess().getColNamesColnameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_colNames_2_0=ruleColname();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnique_keyRule());
            					}
            					add(
            						current,
            						"colNames",
            						lv_colNames_2_0,
            						"org.xtext.example.plsql.DDL.Colname");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDDL.g:1169:3: (otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDDL.g:1170:4: otherlv_3= ',' ( (lv_colNames_4_0= ruleColname ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUnique_keyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDDL.g:1174:4: ( (lv_colNames_4_0= ruleColname ) )
            	    // InternalDDL.g:1175:5: (lv_colNames_4_0= ruleColname )
            	    {
            	    // InternalDDL.g:1175:5: (lv_colNames_4_0= ruleColname )
            	    // InternalDDL.g:1176:6: lv_colNames_4_0= ruleColname
            	    {

            	    						newCompositeNode(grammarAccess.getUnique_keyAccess().getColNamesColnameParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_colNames_4_0=ruleColname();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnique_keyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colNames",
            	    							lv_colNames_4_0,
            	    							"org.xtext.example.plsql.DDL.Colname");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUnique_keyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnique_key"


    // $ANTLR start "entryRuleForeign_key"
    // InternalDDL.g:1202:1: entryRuleForeign_key returns [EObject current=null] : iv_ruleForeign_key= ruleForeign_key EOF ;
    public final EObject entryRuleForeign_key() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeign_key = null;


        try {
            // InternalDDL.g:1202:52: (iv_ruleForeign_key= ruleForeign_key EOF )
            // InternalDDL.g:1203:2: iv_ruleForeign_key= ruleForeign_key EOF
            {
             newCompositeNode(grammarAccess.getForeign_keyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeign_key=ruleForeign_key();

            state._fsp--;

             current =iv_ruleForeign_key; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeign_key"


    // $ANTLR start "ruleForeign_key"
    // InternalDDL.g:1209:1: ruleForeign_key returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) otherlv_4= ')' otherlv_5= 'REFERENCES' ( (lv_tabname_6_0= ruleTabname ) ) otherlv_7= '(' ( (lv_colNames_8_0= ruleColname ) ) otherlv_9= ')' ) ;
    public final EObject ruleForeign_key() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_colNames_3_0 = null;

        EObject lv_tabname_6_0 = null;

        EObject lv_colNames_8_0 = null;



        	enterRule();

        try {
            // InternalDDL.g:1215:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) otherlv_4= ')' otherlv_5= 'REFERENCES' ( (lv_tabname_6_0= ruleTabname ) ) otherlv_7= '(' ( (lv_colNames_8_0= ruleColname ) ) otherlv_9= ')' ) )
            // InternalDDL.g:1216:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) otherlv_4= ')' otherlv_5= 'REFERENCES' ( (lv_tabname_6_0= ruleTabname ) ) otherlv_7= '(' ( (lv_colNames_8_0= ruleColname ) ) otherlv_9= ')' )
            {
            // InternalDDL.g:1216:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) otherlv_4= ')' otherlv_5= 'REFERENCES' ( (lv_tabname_6_0= ruleTabname ) ) otherlv_7= '(' ( (lv_colNames_8_0= ruleColname ) ) otherlv_9= ')' )
            // InternalDDL.g:1217:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (lv_colNames_3_0= ruleColname ) ) otherlv_4= ')' otherlv_5= 'REFERENCES' ( (lv_tabname_6_0= ruleTabname ) ) otherlv_7= '(' ( (lv_colNames_8_0= ruleColname ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getForeign_keyAccess().getFOREIGNKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getForeign_keyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getForeign_keyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDDL.g:1229:3: ( (lv_colNames_3_0= ruleColname ) )
            // InternalDDL.g:1230:4: (lv_colNames_3_0= ruleColname )
            {
            // InternalDDL.g:1230:4: (lv_colNames_3_0= ruleColname )
            // InternalDDL.g:1231:5: lv_colNames_3_0= ruleColname
            {

            					newCompositeNode(grammarAccess.getForeign_keyAccess().getColNamesColnameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_colNames_3_0=ruleColname();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeign_keyRule());
            					}
            					add(
            						current,
            						"colNames",
            						lv_colNames_3_0,
            						"org.xtext.example.plsql.DDL.Colname");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getForeign_keyAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getForeign_keyAccess().getREFERENCESKeyword_5());
            		
            // InternalDDL.g:1256:3: ( (lv_tabname_6_0= ruleTabname ) )
            // InternalDDL.g:1257:4: (lv_tabname_6_0= ruleTabname )
            {
            // InternalDDL.g:1257:4: (lv_tabname_6_0= ruleTabname )
            // InternalDDL.g:1258:5: lv_tabname_6_0= ruleTabname
            {

            					newCompositeNode(grammarAccess.getForeign_keyAccess().getTabnameTabnameParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_tabname_6_0=ruleTabname();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeign_keyRule());
            					}
            					set(
            						current,
            						"tabname",
            						lv_tabname_6_0,
            						"org.xtext.example.plsql.DDL.Tabname");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getForeign_keyAccess().getLeftParenthesisKeyword_7());
            		
            // InternalDDL.g:1279:3: ( (lv_colNames_8_0= ruleColname ) )
            // InternalDDL.g:1280:4: (lv_colNames_8_0= ruleColname )
            {
            // InternalDDL.g:1280:4: (lv_colNames_8_0= ruleColname )
            // InternalDDL.g:1281:5: lv_colNames_8_0= ruleColname
            {

            					newCompositeNode(grammarAccess.getForeign_keyAccess().getColNamesColnameParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_colNames_8_0=ruleColname();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeign_keyRule());
            					}
            					add(
            						current,
            						"colNames",
            						lv_colNames_8_0,
            						"org.xtext.example.plsql.DDL.Colname");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getForeign_keyAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeign_key"


    // $ANTLR start "entryRuleColname"
    // InternalDDL.g:1306:1: entryRuleColname returns [EObject current=null] : iv_ruleColname= ruleColname EOF ;
    public final EObject entryRuleColname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColname = null;


        try {
            // InternalDDL.g:1306:48: (iv_ruleColname= ruleColname EOF )
            // InternalDDL.g:1307:2: iv_ruleColname= ruleColname EOF
            {
             newCompositeNode(grammarAccess.getColnameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColname=ruleColname();

            state._fsp--;

             current =iv_ruleColname; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColname"


    // $ANTLR start "ruleColname"
    // InternalDDL.g:1313:1: ruleColname returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleColname() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalDDL.g:1319:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalDDL.g:1320:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalDDL.g:1320:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalDDL.g:1321:3: (lv_id_0_0= RULE_ID )
            {
            // InternalDDL.g:1321:3: (lv_id_0_0= RULE_ID )
            // InternalDDL.g:1322:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getColnameAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColnameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColname"


    // $ANTLR start "entryRuleTabname"
    // InternalDDL.g:1341:1: entryRuleTabname returns [EObject current=null] : iv_ruleTabname= ruleTabname EOF ;
    public final EObject entryRuleTabname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabname = null;


        try {
            // InternalDDL.g:1341:48: (iv_ruleTabname= ruleTabname EOF )
            // InternalDDL.g:1342:2: iv_ruleTabname= ruleTabname EOF
            {
             newCompositeNode(grammarAccess.getTabnameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTabname=ruleTabname();

            state._fsp--;

             current =iv_ruleTabname; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTabname"


    // $ANTLR start "ruleTabname"
    // InternalDDL.g:1348:1: ruleTabname returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_basename_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTabname() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_basename_2_0=null;


        	enterRule();

        try {
            // InternalDDL.g:1354:2: ( ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_basename_2_0= RULE_ID ) ) ) )
            // InternalDDL.g:1355:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_basename_2_0= RULE_ID ) ) )
            {
            // InternalDDL.g:1355:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_basename_2_0= RULE_ID ) ) )
            // InternalDDL.g:1356:3: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_basename_2_0= RULE_ID ) )
            {
            // InternalDDL.g:1356:3: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==24) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalDDL.g:1357:4: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // InternalDDL.g:1357:4: ( (lv_id_0_0= RULE_ID ) )
                    // InternalDDL.g:1358:5: (lv_id_0_0= RULE_ID )
                    {
                    // InternalDDL.g:1358:5: (lv_id_0_0= RULE_ID )
                    // InternalDDL.g:1359:6: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_id_0_0, grammarAccess.getTabnameAccess().getIdIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTabnameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getTabnameAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDDL.g:1380:3: ( (lv_basename_2_0= RULE_ID ) )
            // InternalDDL.g:1381:4: (lv_basename_2_0= RULE_ID )
            {
            // InternalDDL.g:1381:4: (lv_basename_2_0= RULE_ID )
            // InternalDDL.g:1382:5: lv_basename_2_0= RULE_ID
            {
            lv_basename_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_basename_2_0, grammarAccess.getTabnameAccess().getBasenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTabnameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"basename",
            						lv_basename_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTabname"


    // $ANTLR start "entryRuleISNULL"
    // InternalDDL.g:1402:1: entryRuleISNULL returns [EObject current=null] : iv_ruleISNULL= ruleISNULL EOF ;
    public final EObject entryRuleISNULL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleISNULL = null;


        try {
            // InternalDDL.g:1402:47: (iv_ruleISNULL= ruleISNULL EOF )
            // InternalDDL.g:1403:2: iv_ruleISNULL= ruleISNULL EOF
            {
             newCompositeNode(grammarAccess.getISNULLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleISNULL=ruleISNULL();

            state._fsp--;

             current =iv_ruleISNULL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleISNULL"


    // $ANTLR start "ruleISNULL"
    // InternalDDL.g:1409:1: ruleISNULL returns [EObject current=null] : ( ( (lv_null_0_0= 'NULL' ) ) | ( ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL' ) ) ;
    public final EObject ruleISNULL() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_nonNull_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDDL.g:1415:2: ( ( ( (lv_null_0_0= 'NULL' ) ) | ( ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL' ) ) )
            // InternalDDL.g:1416:2: ( ( (lv_null_0_0= 'NULL' ) ) | ( ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL' ) )
            {
            // InternalDDL.g:1416:2: ( ( (lv_null_0_0= 'NULL' ) ) | ( ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            else if ( (LA15_0==47) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDDL.g:1417:3: ( (lv_null_0_0= 'NULL' ) )
                    {
                    // InternalDDL.g:1417:3: ( (lv_null_0_0= 'NULL' ) )
                    // InternalDDL.g:1418:4: (lv_null_0_0= 'NULL' )
                    {
                    // InternalDDL.g:1418:4: (lv_null_0_0= 'NULL' )
                    // InternalDDL.g:1419:5: lv_null_0_0= 'NULL'
                    {
                    lv_null_0_0=(Token)match(input,46,FOLLOW_2); 

                    					newLeafNode(lv_null_0_0, grammarAccess.getISNULLAccess().getNullNULLKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getISNULLRule());
                    					}
                    					setWithLastConsumed(current, "null", true, "NULL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDDL.g:1432:3: ( ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL' )
                    {
                    // InternalDDL.g:1432:3: ( ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL' )
                    // InternalDDL.g:1433:4: ( (lv_nonNull_1_0= 'NOT' ) ) otherlv_2= 'NULL'
                    {
                    // InternalDDL.g:1433:4: ( (lv_nonNull_1_0= 'NOT' ) )
                    // InternalDDL.g:1434:5: (lv_nonNull_1_0= 'NOT' )
                    {
                    // InternalDDL.g:1434:5: (lv_nonNull_1_0= 'NOT' )
                    // InternalDDL.g:1435:6: lv_nonNull_1_0= 'NOT'
                    {
                    lv_nonNull_1_0=(Token)match(input,47,FOLLOW_28); 

                    						newLeafNode(lv_nonNull_1_0, grammarAccess.getISNULLAccess().getNonNullNOTKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getISNULLRule());
                    						}
                    						setWithLastConsumed(current, "nonNull", true, "NOT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getISNULLAccess().getNULLKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleISNULL"


    // $ANTLR start "entryRuleTYPE"
    // InternalDDL.g:1456:1: entryRuleTYPE returns [EObject current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final EObject entryRuleTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE = null;


        try {
            // InternalDDL.g:1456:45: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalDDL.g:1457:2: iv_ruleTYPE= ruleTYPE EOF
            {
             newCompositeNode(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;

             current =iv_ruleTYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalDDL.g:1463:1: ruleTYPE returns [EObject current=null] : ( ( (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' ) ) ) ;
    public final EObject ruleTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;
        Token lv_id_0_3=null;


        	enterRule();

        try {
            // InternalDDL.g:1469:2: ( ( ( (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' ) ) ) )
            // InternalDDL.g:1470:2: ( ( (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' ) ) )
            {
            // InternalDDL.g:1470:2: ( ( (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' ) ) )
            // InternalDDL.g:1471:3: ( (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' ) )
            {
            // InternalDDL.g:1471:3: ( (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' ) )
            // InternalDDL.g:1472:4: (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' )
            {
            // InternalDDL.g:1472:4: (lv_id_0_1= 'NUMBER' | lv_id_0_2= 'VARCHAR2' | lv_id_0_3= 'DATE' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt16=1;
                }
                break;
            case 49:
                {
                alt16=2;
                }
                break;
            case 50:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDDL.g:1473:5: lv_id_0_1= 'NUMBER'
                    {
                    lv_id_0_1=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_id_0_1, grammarAccess.getTYPEAccess().getIdNUMBERKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    					setWithLastConsumed(current, "id", lv_id_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDDL.g:1484:5: lv_id_0_2= 'VARCHAR2'
                    {
                    lv_id_0_2=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_id_0_2, grammarAccess.getTYPEAccess().getIdVARCHAR2Keyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    					setWithLastConsumed(current, "id", lv_id_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDDL.g:1495:5: lv_id_0_3= 'DATE'
                    {
                    lv_id_0_3=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_id_0_3, grammarAccess.getTYPEAccess().getIdDATEKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    					setWithLastConsumed(current, "id", lv_id_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000220802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000C00000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000001FFA8010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001A0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});

}