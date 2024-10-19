// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: MyLexer.flex

package com.example.shaded.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.example.shaded.grammar.MyTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

@SuppressWarnings({"ALL"})

public class _MyLexer implements FlexLexer {

    /**
     * This character denotes the end of file
     */
    public static final int YYEOF = -1;

    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    /**
     * lexical states
     */
    public static final int YYINITIAL = 0;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 0
    };

    /**
     * Top-level table for translating characters to character classes
     */
    private static final int[] ZZ_CMAP_TOP = zzUnpackcmap_top();

    private static final String ZZ_CMAP_TOP_PACKED_0 =
            "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700" +
                    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00" +
                    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500" +
                    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00" +
                    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300" +
                    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700" +
                    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100" +
                    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200" +
                    "\1\u3300\1\u3400\1\u1f00\1\u3500\1\u3600\1\u3700\1\u3800\1\u0100" +
                    "\1\u3900\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u1f00" +
                    "\1\u4000\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700" +
                    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u1f00\1\u4c00\1\u4d00\1\u4e00" +
                    "\1\u1f00\3\u0100\1\u4f00\1\u5000\1\u5100\12\u1f00\4\u0100\1\u5200" +
                    "\17\u1f00\2\u0100\1\u5300\41\u1f00\2\u0100\1\u5400\1\u5500\2\u1f00" +
                    "\1\u5600\1\u5700\27\u0100\1\u5800\2\u0100\1\u5900\45\u1f00\1\u0100" +
                    "\1\u5a00\1\u5b00\11\u1f00\1\u5c00\27\u1f00\1\u5d00\1\u5e00\1\u5f00" +
                    "\1\u6000\11\u1f00\1\u6100\1\u6200\5\u1f00\1\u6300\1\u6400\4\u1f00" +
                    "\1\u6500\21\u1f00\246\u0100\1\u6600\20\u0100\1\u6700\1\u6800\25\u0100" +
                    "\1\u6900\34\u0100\1\u6a00\14\u1f00\2\u0100\1\u6b00\u0e05\u1f00";

    private static int[] zzUnpackcmap_top() {
        int[] result = new int[4352];
        int offset = 0;
        offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackcmap_top(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Second-level tables for translating characters to character classes
     */
    private static final int[] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

    private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
            "\11\0\2\1\1\0\2\1\22\0\1\1\12\0\1\2" +
                    "\1\0\1\3\1\4\1\0\1\5\11\6\3\0\1\7" +
                    "\3\0\4\10\1\11\1\10\21\12\1\13\2\12\4\0" +
                    "\1\12\1\0\4\10\1\11\1\10\21\12\1\13\2\12" +
                    "\1\14\1\0\1\15\54\0\1\12\12\0\1\12\4\0" +
                    "\1\12\5\0\27\12\1\0\37\12\1\0\u01ca\12\4\0" +
                    "\14\12\16\0\5\12\7\0\1\12\1\0\1\12\201\0" +
                    "\5\12\1\0\2\12\2\0\4\12\1\0\1\12\6\0" +
                    "\1\12\1\0\3\12\1\0\1\12\1\0\24\12\1\0" +
                    "\123\12\1\0\213\12\10\0\246\12\1\0\46\12\2\0" +
                    "\1\12\6\0\51\12\107\0\33\12\4\0\4\12\55\0" +
                    "\53\12\25\0\12\16\4\0\2\12\1\0\143\12\1\0" +
                    "\1\12\17\0\2\12\7\0\2\12\12\16\3\12\2\0" +
                    "\1\12\20\0\1\12\1\0\36\12\35\0\131\12\13\0" +
                    "\1\12\16\0\12\16\41\12\11\0\2\12\4\0\1\12" +
                    "\5\0\26\12\4\0\1\12\11\0\1\12\3\0\1\12" +
                    "\27\0\31\12\7\0\13\12\65\0\25\12\1\0\10\12" +
                    "\106\0\66\12\3\0\1\12\22\0\1\12\7\0\12\12" +
                    "\4\0\12\16\1\0\20\12\4\0\10\12\2\0\2\12" +
                    "\2\0\26\12\1\0\7\12\1\0\1\12\3\0\4\12" +
                    "\3\0\1\12\20\0\1\12\15\0\2\12\1\0\3\12" +
                    "\4\0\12\16\2\12\12\0\1\12\10\0\6\12\4\0" +
                    "\2\12\2\0\26\12\1\0\7\12\1\0\2\12\1\0" +
                    "\2\12\1\0\2\12\37\0\4\12\1\0\1\12\7\0" +
                    "\12\16\2\0\3\12\20\0\11\12\1\0\3\12\1\0" +
                    "\26\12\1\0\7\12\1\0\2\12\1\0\5\12\3\0" +
                    "\1\12\22\0\1\12\17\0\2\12\4\0\12\16\11\0" +
                    "\1\12\13\0\10\12\2\0\2\12\2\0\26\12\1\0" +
                    "\7\12\1\0\2\12\1\0\5\12\3\0\1\12\36\0" +
                    "\2\12\1\0\3\12\4\0\12\16\1\0\1\12\21\0" +
                    "\1\12\1\0\6\12\3\0\3\12\1\0\4\12\3\0" +
                    "\2\12\1\0\1\12\1\0\2\12\3\0\2\12\3\0" +
                    "\3\12\3\0\14\12\26\0\1\12\25\0\12\16\25\0" +
                    "\10\12\1\0\3\12\1\0\27\12\1\0\20\12\3\0" +
                    "\1\12\32\0\3\12\5\0\2\12\4\0\12\16\20\0" +
                    "\1\12\4\0\10\12\1\0\3\12\1\0\27\12\1\0" +
                    "\12\12\1\0\5\12\3\0\1\12\40\0\1\12\1\0" +
                    "\2\12\4\0\12\16\1\0\2\12\22\0\10\12\1\0" +
                    "\3\12\1\0\51\12\2\0\1\12\20\0\1\12\5\0" +
                    "\3\12\10\0\3\12\4\0\12\16\12\0\6\12\5\0" +
                    "\22\12\3\0\30\12\1\0\11\12\1\0\1\12\2\0" +
                    "\7\12\37\0\12\16\21\0\60\12\1\0\2\12\14\0" +
                    "\7\12\11\0\12\16\47\0\2\12\1\0\1\12\1\0" +
                    "\5\12\1\0\30\12\1\0\1\12\1\0\12\12\1\0" +
                    "\2\12\11\0\1\12\2\0\5\12\1\0\1\12\11\0" +
                    "\12\16\2\0\4\12\40\0\1\12\37\0\12\16\26\0" +
                    "\10\12\1\0\44\12\33\0\5\12\163\0\53\12\24\0" +
                    "\1\12\12\16\6\0\6\12\4\0\4\12\3\0\1\12" +
                    "\3\0\2\12\7\0\3\12\4\0\15\12\14\0\1\12" +
                    "\1\0\12\16\6\0\46\12\1\0\1\12\5\0\1\12" +
                    "\2\0\53\12\1\0\115\12\1\0\4\12\2\0\7\12" +
                    "\1\0\1\12\1\0\4\12\2\0\51\12\1\0\4\12" +
                    "\2\0\41\12\1\0\4\12\2\0\7\12\1\0\1\12" +
                    "\1\0\4\12\2\0\17\12\1\0\71\12\1\0\4\12" +
                    "\2\0\103\12\45\0\20\12\20\0\126\12\2\0\6\12" +
                    "\3\0\u016c\12\2\0\21\12\1\0\32\12\5\0\113\12" +
                    "\6\0\10\12\7\0\15\12\1\0\4\12\16\0\22\12" +
                    "\16\0\22\12\16\0\15\12\1\0\3\12\17\0\64\12" +
                    "\43\0\1\12\4\0\1\12\3\0\12\16\46\0\12\16" +
                    "\6\0\131\12\7\0\5\12\2\0\42\12\1\0\1\12" +
                    "\5\0\106\12\12\0\37\12\47\0\12\16\36\12\2\0" +
                    "\5\12\13\0\54\12\4\0\32\12\6\0\12\16\46\0" +
                    "\27\12\11\0\65\12\53\0\12\16\6\0\12\16\15\0" +
                    "\1\12\135\0\57\12\21\0\7\12\4\0\12\16\51\0" +
                    "\36\12\15\0\2\12\12\16\54\12\32\0\44\12\34\0" +
                    "\12\16\3\0\3\12\12\16\44\12\2\0\11\12\7\0" +
                    "\53\12\2\0\3\12\51\0\4\12\1\0\6\12\1\0" +
                    "\2\12\3\0\1\12\5\0\300\12\100\0\26\12\2\0" +
                    "\6\12\2\0\46\12\2\0\6\12\2\0\10\12\1\0" +
                    "\1\12\1\0\1\12\1\0\1\12\1\0\37\12\2\0" +
                    "\65\12\1\0\7\12\1\0\1\12\3\0\3\12\1\0" +
                    "\7\12\3\0\4\12\2\0\6\12\4\0\15\12\5\0" +
                    "\3\12\1\0\7\12\164\0\1\12\15\0\1\12\20\0" +
                    "\15\12\145\0\1\12\4\0\1\12\2\0\12\12\1\0" +
                    "\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0" +
                    "\1\12\1\0\4\12\1\0\13\12\2\0\4\12\5\0" +
                    "\5\12\4\0\1\12\64\0\2\12\u017b\0\57\12\1\0" +
                    "\57\12\1\0\205\12\6\0\4\12\3\0\2\12\14\0" +
                    "\46\12\1\0\1\12\5\0\1\12\2\0\70\12\7\0" +
                    "\1\12\20\0\27\12\11\0\7\12\1\0\7\12\1\0" +
                    "\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0" +
                    "\7\12\1\0\7\12\120\0\1\12\325\0\2\12\52\0" +
                    "\5\12\5\0\2\12\4\0\126\12\6\0\3\12\1\0" +
                    "\132\12\1\0\4\12\5\0\53\12\1\0\136\12\21\0" +
                    "\33\12\65\0\306\12\112\0\360\12\20\0\215\12\103\0" +
                    "\56\12\2\0\15\12\3\0\20\12\12\16\2\12\24\0" +
                    "\57\12\20\0\37\12\2\0\106\12\61\0\11\12\2\0" +
                    "\147\12\2\0\65\12\2\0\5\12\60\0\13\12\1\0" +
                    "\3\12\1\0\4\12\1\0\27\12\35\0\64\12\16\0" +
                    "\62\12\34\0\12\16\30\0\6\12\3\0\1\12\1\0" +
                    "\2\12\1\0\12\16\34\12\12\0\27\12\31\0\35\12" +
                    "\7\0\57\12\34\0\1\12\12\16\6\0\5\12\1\0" +
                    "\12\12\12\16\5\12\1\0\51\12\27\0\3\12\1\0" +
                    "\10\12\4\0\12\16\6\0\27\12\3\0\1\12\3\0" +
                    "\62\12\1\0\1\12\3\0\2\12\2\0\5\12\2\0" +
                    "\1\12\1\0\1\12\30\0\3\12\2\0\13\12\7\0" +
                    "\3\12\14\0\6\12\2\0\6\12\2\0\6\12\11\0" +
                    "\7\12\1\0\7\12\1\0\53\12\1\0\14\12\10\0" +
                    "\163\12\15\0\12\16\6\0\244\12\14\0\27\12\4\0" +
                    "\61\12\4\0\156\12\2\0\152\12\46\0\7\12\14\0" +
                    "\5\12\5\0\1\12\1\0\12\12\1\0\15\12\1\0" +
                    "\5\12\1\0\1\12\1\0\2\12\1\0\2\12\1\0" +
                    "\154\12\41\0\153\12\22\0\100\12\2\0\66\12\50\0" +
                    "\14\12\164\0\5\12\1\0\207\12\23\0\12\16\7\0" +
                    "\32\12\6\0\32\12\13\0\131\12\3\0\6\12\2\0" +
                    "\6\12\2\0\6\12\2\0\3\12\43\0\14\12\1\0" +
                    "\32\12\1\0\23\12\1\0\2\12\1\0\17\12\2\0" +
                    "\16\12\42\0\173\12\205\0\35\12\3\0\61\12\57\0" +
                    "\40\12\15\0\24\12\1\0\10\12\6\0\46\12\12\0" +
                    "\36\12\2\0\44\12\4\0\10\12\60\0\236\12\2\0" +
                    "\12\16\6\0\44\12\4\0\44\12\4\0\50\12\10\0" +
                    "\64\12\234\0\67\12\11\0\26\12\12\0\10\12\230\0" +
                    "\6\12\2\0\1\12\1\0\54\12\1\0\2\12\3\0" +
                    "\1\12\2\0\27\12\12\0\27\12\11\0\37\12\101\0" +
                    "\23\12\1\0\2\12\12\0\26\12\12\0\32\12\106\0" +
                    "\70\12\6\0\2\12\100\0\1\12\17\0\4\12\1\0" +
                    "\3\12\1\0\35\12\52\0\35\12\3\0\35\12\43\0" +
                    "\10\12\1\0\34\12\33\0\66\12\12\0\26\12\12\0" +
                    "\23\12\15\0\22\12\156\0\111\12\67\0\63\12\15\0" +
                    "\63\12\15\0\44\12\14\0\12\16\306\0\35\12\12\0" +
                    "\1\12\10\0\26\12\232\0\27\12\14\0\65\12\56\0" +
                    "\12\16\23\0\55\12\40\0\31\12\7\0\12\16\11\0" +
                    "\44\12\17\0\12\16\4\0\1\12\13\0\43\12\3\0" +
                    "\1\12\14\0\60\12\16\0\4\12\13\0\12\16\1\12" +
                    "\1\0\1\12\43\0\22\12\1\0\31\12\124\0\7\12" +
                    "\1\0\1\12\1\0\4\12\1\0\17\12\1\0\12\12" +
                    "\7\0\57\12\21\0\12\16\13\0\10\12\2\0\2\12" +
                    "\2\0\26\12\1\0\7\12\1\0\2\12\1\0\5\12" +
                    "\3\0\1\12\22\0\1\12\14\0\5\12\236\0\65\12" +
                    "\22\0\4\12\5\0\12\16\5\0\1\12\40\0\60\12" +
                    "\24\0\2\12\1\0\1\12\10\0\12\16\246\0\57\12" +
                    "\51\0\4\12\44\0\60\12\24\0\1\12\13\0\12\16" +
                    "\46\0\53\12\15\0\1\12\7\0\12\16\66\0\33\12" +
                    "\25\0\12\16\306\0\54\12\164\0\100\12\12\16\25\0" +
                    "\1\12\240\0\10\12\2\0\47\12\20\0\1\12\1\0" +
                    "\1\12\34\0\1\12\12\0\50\12\7\0\1\12\25\0" +
                    "\1\12\13\0\56\12\23\0\1\12\42\0\71\12\7\0" +
                    "\11\12\1\0\45\12\21\0\1\12\17\0\12\16\30\0" +
                    "\36\12\160\0\7\12\1\0\2\12\1\0\46\12\25\0" +
                    "\1\12\11\0\12\16\6\0\6\12\1\0\2\12\1\0" +
                    "\40\12\16\0\1\12\7\0\12\16\u0136\0\23\12\15\0" +
                    "\232\12\346\0\304\12\274\0\57\12\321\0\107\12\271\0" +
                    "\71\12\7\0\37\12\1\0\12\16\146\0\36\12\22\0" +
                    "\60\12\20\0\4\12\14\0\12\16\11\0\25\12\5\0" +
                    "\23\12\260\0\100\12\200\0\113\12\5\0\1\12\102\0" +
                    "\15\12\100\0\2\12\1\0\1\12\34\0\370\12\10\0" +
                    "\363\12\15\0\37\12\61\0\3\12\21\0\4\12\10\0" +
                    "\u018c\12\4\0\153\12\5\0\15\12\3\0\11\12\7\0" +
                    "\12\12\146\0\125\12\1\0\107\12\1\0\2\12\2\0" +
                    "\1\12\2\0\2\12\2\0\4\12\1\0\14\12\1\0" +
                    "\1\12\1\0\7\12\1\0\101\12\1\0\4\12\2\0" +
                    "\10\12\1\0\7\12\1\0\34\12\1\0\4\12\1\0" +
                    "\5\12\1\0\1\12\3\0\7\12\1\0\u0154\12\2\0" +
                    "\31\12\1\0\31\12\1\0\37\12\1\0\31\12\1\0" +
                    "\37\12\1\0\31\12\1\0\37\12\1\0\31\12\1\0" +
                    "\37\12\1\0\31\12\1\0\10\12\2\0\62\16\55\12" +
                    "\12\0\7\12\2\0\12\16\4\0\1\12\u0171\0\54\12" +
                    "\4\0\12\16\6\0\305\12\73\0\104\12\7\0\1\12" +
                    "\4\0\12\16\246\0\4\12\1\0\33\12\1\0\2\12" +
                    "\1\0\1\12\2\0\1\12\1\0\12\12\1\0\4\12" +
                    "\1\0\1\12\1\0\1\12\6\0\1\12\4\0\1\12" +
                    "\1\0\1\12\1\0\1\12\1\0\3\12\1\0\2\12" +
                    "\1\0\1\12\2\0\1\12\1\0\1\12\1\0\1\12" +
                    "\1\0\1\12\1\0\1\12\1\0\2\12\1\0\1\12" +
                    "\2\0\4\12\1\0\7\12\1\0\4\12\1\0\4\12" +
                    "\1\0\1\12\1\0\12\12\1\0\21\12\5\0\3\12" +
                    "\1\0\5\12\1\0\21\12\104\0\327\12\51\0\65\12" +
                    "\13\0\336\12\2\0\u0182\12\16\0\u0131\12\37\0\36\12" +
                    "\342\0";

    private static int[] zzUnpackcmap_blocks() {
        int[] result = new int[27648];
        int offset = 0;
        offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackcmap_blocks(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\1\0\1\1\1\2\1\1\2\3\1\4\1\5\1\6" +
                    "\1\7\1\0\1\3\1\0\1\3\1\0\2\3\1\0";

    private static int[] zzUnpackAction() {
        int[] result = new int[18];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\17\0\36\0\55\0\74\0\113\0\17\0\132" +
                    "\0\17\0\17\0\151\0\170\0\207\0\151\0\226\0\245" +
                    "\0\207\0\245";

    private static int[] zzUnpackRowMap() {
        int[] result = new int[18];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length() - 1;
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpacktrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\1\2\1\3\1\2\1\4\1\2\1\5\1\6\1\7" +
                    "\4\10\1\11\1\12\1\2\20\0\1\3\22\0\1\5" +
                    "\1\6\14\0\1\13\2\6\2\0\1\14\1\0\1\15" +
                    "\7\0\1\13\2\6\2\0\1\14\10\0\1\10\1\0" +
                    "\2\10\1\0\4\10\2\0\1\10\5\0\2\16\2\0" +
                    "\1\17\7\0\2\20\1\0\2\20\15\0\2\21\1\0" +
                    "\2\21\7\0\2\22\1\0\2\20\15\0\2\20\10\0";

    private static int[] zzUnpacktrans() {
        int[] result = new int[180];
        int offset = 0;
        offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpacktrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String[] ZZ_ERROR_MSG = {
            "Unknown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\1\0\1\11\4\1\1\11\1\1\2\11\1\0\1\1" +
                    "\1\0\1\1\1\0\2\1\1\0";

    private static int[] zzUnpackAttribute() {
        int[] result = new int[18];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * the input device
     */
    private java.io.Reader zzReader;

    /**
     * the current state of the DFA
     */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private CharSequence zzBuffer = "";

    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;

    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;

    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;

    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;

    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;

    /**
     * Number of newlines encountered up to the start of the matched text.
     */
    @SuppressWarnings("unused")
    private int yyline;

    /**
     * Number of characters from the last newline up to the start of the matched text.
     */
    @SuppressWarnings("unused")
    protected int yycolumn;

    /**
     * Number of characters up to the start of the matched text.
     */
    @SuppressWarnings("unused")
    private long yychar;

    /**
     * Whether the scanner is currently at the beginning of a line.
     */
    @SuppressWarnings("unused")
    private boolean zzAtBOL = true;

    /**
     * Whether the user-EOF-code has already been executed.
     */
    @SuppressWarnings("unused")
    private boolean zzEOFDone;

    /* user code: */
    public _MyLexer() {
        this((java.io.Reader) null);
    }


    /**
     * Creates a new scanner
     *
     * @param in the java.io.Reader to read input from.
     */
    public _MyLexer(java.io.Reader in) {
        this.zzReader = in;
    }


    /**
     * Returns the maximum size of the scanner buffer, which limits the size of tokens.
     */
    private int zzMaxBufferLen() {
        return Integer.MAX_VALUE;
    }

    /**
     * Whether the scanner buffer can grow to accommodate a larger token.
     */
    private boolean zzCanGrow() {
        return true;
    }

    /**
     * Translates raw input code points to DFA table row
     */
    private static int zzCMap(int input) {
        int offset = input & 255;
        return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
    }

    public final int getTokenStart() {
        return zzStartRead;
    }

    public final int getTokenEnd() {
        return getTokenStart() + yylength();
    }

    public void reset(CharSequence buffer, int start, int end, int initialState) {
        zzBuffer = buffer;
        zzCurrentPos = zzMarkedPos = zzStartRead = start;
        zzAtEOF = false;
        zzAtBOL = true;
        zzEndRead = end;
        yybegin(initialState);
    }

    /**
     * Refills the input buffer.
     *
     * @return {@code false}, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {
        return true;
    }


    /**
     * Returns the current lexical state.
     */
    public final int yystate() {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     */
    public final CharSequence yytext() {
        return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
    }


    /**
     * Returns the character at position {@code pos} from the
     * matched text.
     * <p>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBuffer.charAt(zzStartRead + pos);
    }


    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occurred while scanning.
     * <p>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again.
     *               This number must not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength())
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws java.io.IOException if any I/O-Error occurs
     */
    public IElementType advance() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        CharSequence zzBufferL = zzBuffer;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];

            // set up zzAction for empty match case:
            int zzAttributes = zzAttrL[zzState];
            if ((zzAttributes & 1) == 1) {
                zzAction = zzState;
            }


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL) {
                        zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
                        zzCurrentPosL += Character.charCount(zzInput);
                    } else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
                            zzCurrentPosL += Character.charCount(zzInput);
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMap(zzInput)];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                zzAtEOF = true;
                return null;
            } else {
                switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                    case 1: {
                        return BAD_CHARACTER;
                    }
                    // fall through
                    case 8:
                        break;
                    case 2: {
                        return WHITE_SPACE;
                    }
                    // fall through
                    case 9:
                        break;
                    case 3: {
                        return NUMBER;
                    }
                    // fall through
                    case 10:
                        break;
                    case 4: {
                        return EQUALS;
                    }
                    // fall through
                    case 11:
                        break;
                    case 5: {
                        return ID;
                    }
                    // fall through
                    case 12:
                        break;
                    case 6: {
                        return L_CURLY;
                    }
                    // fall through
                    case 13:
                        break;
                    case 7: {
                        return R_CURLY;
                    }
                    // fall through
                    case 14:
                        break;
                    default:
                        zzScanError(ZZ_NO_MATCH);
                }
            }
        }
    }


}
