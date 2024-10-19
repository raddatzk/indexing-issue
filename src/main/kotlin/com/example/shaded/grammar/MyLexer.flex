package com.example.grammar;

import com.intellij.psi.tree.IElementType;
import static com.example.shaded.grammar.MyTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

@SuppressWarnings({"ALL"})
%%

%public
%class _MyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r\n"|"\r"|"\n"
LINE_WS=[\ \t\f]
WHITE_SPACE_AND_EOL=({LINE_WS}|{EOL})+

SIMPLE_NUMBER=-?[0-9]+
OCT_NUMBER=-?0[0-7]+
HEX_NUMBER=-?0[xX][0-9a-fA-F]+
FLOAT_EXP_PART=[eE][-+]?[0-9]+
FLOAT_NUMBER=-?[0-9]+\.(([0-9]+{FLOAT_EXP_PART}?)|([0-9]*{FLOAT_EXP_PART}))
SCI_NUMBER=-?[0-9]+[eE][-+]?[0-9]+?
NUMBER=({FLOAT_NUMBER}|{SCI_NUMBER}|{HEX_NUMBER}|{SIMPLE_NUMBER}|{OCT_NUMBER})

DIGIT=[:digit:]
LETTER=(_|[:letter:])
ID={LETTER}({LETTER}|{DIGIT}|[\-])*

%{
    public _MyLexer() {
      this((java.io.Reader)null);
    }
%}

%%

<YYINITIAL> {
  {WHITE_SPACE_AND_EOL}       { return WHITE_SPACE; }

  "{"                         { return L_CURLY; }
  "}"                         { return R_CURLY; }
  "="                         { return EQUALS; }

  {NUMBER}                    { return NUMBER; }
  {ID}                        { return ID; }
}

[^] { return BAD_CHARACTER; }
