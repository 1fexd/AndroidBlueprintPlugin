
/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.github.pvoid.androidbp.blueprint.model;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class BlueprintParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return BlueprintParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public BlueprintParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public BlueprintParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public BlueprintParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\003\000\002\003\003\000\002\004\006" +
    "\000\002\005\005\000\002\005\003\000\002\006\005\000" +
    "\002\006\002\000\002\007\005\000\002\007\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\011\005\000\002\012\005\000\002\013\005\000" +
    "\002\013\003\000\002\014\003\000\002\014\003\000\002" +
    "\014\003\000\002\014\003\000\002\014\003\000\002\014" +
    "\002\000\002\015\005\000\002\015\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\006\020\011\022\010\001\002\000\010\002" +
    "\060\020\011\022\010\001\002\000\010\002\ufffd\020\ufffd" +
    "\022\ufffd\001\002\000\010\002\ufffe\020\ufffe\022\ufffe\001" +
    "\002\000\010\002\uffff\020\uffff\022\uffff\001\002\000\006" +
    "\011\054\013\053\001\002\000\004\004\012\001\002\000" +
    "\010\005\ufff8\012\ufff8\025\013\001\002\000\004\013\021" +
    "\001\002\000\006\005\017\012\016\001\002\000\006\005" +
    "\ufffa\012\ufffa\001\002\000\010\005\ufff8\012\ufff8\025\013" +
    "\001\002\000\010\002\ufffc\020\ufffc\022\ufffc\001\002\000" +
    "\006\005\ufffb\012\ufffb\001\002\000\020\004\027\006\031" +
    "\016\023\017\026\021\022\023\034\024\032\001\002\000" +
    "\016\002\ufff2\005\ufff2\010\ufff2\012\ufff2\020\ufff2\022\ufff2" +
    "\001\002\000\016\002\ufff1\005\ufff1\010\ufff1\012\ufff1\020" +
    "\ufff1\022\ufff1\001\002\000\016\002\ufff3\005\ufff3\010\ufff3" +
    "\012\ufff3\020\ufff3\022\ufff3\001\002\000\010\005\ufff9\010" +
    "\051\012\ufff9\001\002\000\016\002\ufff5\005\ufff5\010\ufff5" +
    "\012\ufff5\020\ufff5\022\ufff5\001\002\000\010\005\ufff8\012" +
    "\ufff8\025\013\001\002\000\016\002\ufff4\005\ufff4\010\ufff4" +
    "\012\ufff4\020\ufff4\022\ufff4\001\002\000\020\007\uffe5\012" +
    "\uffe5\016\040\017\036\021\042\023\043\024\035\001\002" +
    "\000\016\002\uffef\005\uffef\010\uffef\012\uffef\020\uffef\022" +
    "\uffef\001\002\000\016\002\ufff6\005\ufff6\010\ufff6\012\ufff6" +
    "\020\ufff6\022\ufff6\001\002\000\016\002\ufff0\005\ufff0\010" +
    "\ufff0\012\ufff0\020\ufff0\022\ufff0\001\002\000\006\007\uffe6" +
    "\012\uffe6\001\002\000\006\007\uffea\012\uffea\001\002\000" +
    "\006\007\uffeb\012\uffeb\001\002\000\006\007\uffe8\012\uffe8" +
    "\001\002\000\006\007\045\012\044\001\002\000\006\007" +
    "\uffe9\012\uffe9\001\002\000\006\007\uffe7\012\uffe7\001\002" +
    "\000\020\007\uffe5\012\uffe5\016\040\017\036\021\042\023" +
    "\043\024\035\001\002\000\016\002\uffed\005\uffed\010\uffed" +
    "\012\uffed\020\uffed\022\uffed\001\002\000\006\007\uffec\012" +
    "\uffec\001\002\000\006\005\050\012\016\001\002\000\016" +
    "\002\uffee\005\uffee\010\uffee\012\uffee\020\uffee\022\uffee\001" +
    "\002\000\020\004\027\006\031\016\023\017\026\021\022" +
    "\023\034\024\032\001\002\000\016\002\ufff7\005\ufff7\010" +
    "\ufff7\012\ufff7\020\ufff7\022\ufff7\001\002\000\020\004\027" +
    "\006\031\016\023\017\026\021\022\023\034\024\032\001" +
    "\002\000\020\004\027\006\031\016\023\017\026\021\022" +
    "\023\034\024\032\001\002\000\012\002\uffe3\010\051\020" +
    "\uffe3\022\uffe3\001\002\000\012\002\uffe4\010\051\020\uffe4" +
    "\022\uffe4\001\002\000\010\002\000\020\000\022\000\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\012\002\003\003\006\004\005\015\004\001" +
    "\001\000\010\003\056\004\005\015\004\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\013\006\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\007\024\010\032\011\023\012\027\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\046\006\014\001" +
    "\001\000\002\001\001\000\006\013\040\014\036\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\045\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\010" +
    "\051\011\023\012\027\001\001\000\002\001\001\000\012" +
    "\007\055\010\032\011\023\012\027\001\001\000\012\007" +
    "\054\010\032\011\023\012\027\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$BlueprintParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$BlueprintParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$BlueprintParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public void syntax_error(Symbol s){
    BlueprintLexer lexer = (BlueprintLexer) getScanner();
    throw new RuntimeException("compiler has detected a syntax error at line " + lexer.yyline
            + " column " + lexer.yychar);
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$BlueprintParser$actions {
  private final BlueprintParser parser;

  /** Constructor */
  CUP$BlueprintParser$actions(BlueprintParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$BlueprintParser$do_action_part00000000(
    int                        CUP$BlueprintParser$act_num,
    java_cup.runtime.lr_parser CUP$BlueprintParser$parser,
    java.util.Stack            CUP$BlueprintParser$stack,
    int                        CUP$BlueprintParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$BlueprintParser$result;

      /* select the action based on the action number */
      switch (CUP$BlueprintParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= items EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-1)).value;
		RESULT = start_val;
              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-1)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$BlueprintParser$parser.done_parsing();
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // items ::= items item 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("items",0, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-1)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // items ::= item 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("items",0, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // item ::= blueprint 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("item",1, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // item ::= variable 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("item",1, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // blueprint ::= BLUEPRINT_TYPE OBJECT_START pairs OBJECT_END 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("blueprint",2, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-3)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // pairs ::= pairs ELEMENT_SEPARATOR pair 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("pairs",3, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // pairs ::= pair 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("pairs",3, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // pair ::= FIELD_NAME EQUALS value_stm 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("pair",4, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // pair ::= 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("pair",4, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // value_stm ::= value_stm PLUS value 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value_stm",5, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // value_stm ::= value 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value_stm",5, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // value ::= STRING 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // value ::= array 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // value ::= object 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // value ::= BOOL 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // value ::= NUMBER 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // value ::= VARIABLE_VALUE 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // value ::= LINK 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // object ::= OBJECT_START pairs OBJECT_END 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("object",7, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // array ::= ARRAY_START elements ARRAY_END 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("array",8, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // elements ::= elements ELEMENT_SEPARATOR element 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("elements",9, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // elements ::= element 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("elements",9, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // element ::= STRING 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("element",10, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // element ::= BOOL 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("element",10, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // element ::= NUMBER 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("element",10, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // element ::= VARIABLE_VALUE 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("element",10, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // element ::= LINK 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("element",10, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // element ::= 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("element",10, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // variable ::= VARIABLE_NAME EQUALS value_stm 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("variable",11, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // variable ::= VARIABLE_NAME PLUS_EQUALS value_stm 
            {
              Object RESULT =null;

              CUP$BlueprintParser$result = parser.getSymbolFactory().newSymbol("variable",11, ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.elementAt(CUP$BlueprintParser$top-2)), ((java_cup.runtime.Symbol)CUP$BlueprintParser$stack.peek()), RESULT);
            }
          return CUP$BlueprintParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$BlueprintParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$BlueprintParser$do_action(
    int                        CUP$BlueprintParser$act_num,
    java_cup.runtime.lr_parser CUP$BlueprintParser$parser,
    java.util.Stack            CUP$BlueprintParser$stack,
    int                        CUP$BlueprintParser$top)
    throws java.lang.Exception
    {
              return CUP$BlueprintParser$do_action_part00000000(
                               CUP$BlueprintParser$act_num,
                               CUP$BlueprintParser$parser,
                               CUP$BlueprintParser$stack,
                               CUP$BlueprintParser$top);
    }
}

}
