/* The following code was generated by JFlex 1.4.3 on 8/04/13 22:26 */
package compiladores;

import java_cup.runtime.Symbol;

/**
 * Scanner para la gramática de la primer tarea programada del curso de Compiladores e Intérpretes.
 */

public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\2\1\0\1\3\1\1\16\7\4\0\1\3\1\44"+
    "\1\41\1\0\1\6\1\0\1\51\1\0\1\56\1\57\1\5\1\42"+
    "\1\62\1\43\1\61\1\4\1\10\11\11\1\0\1\60\1\46\1\45"+
    "\1\47\2\0\22\6\1\15\7\6\1\54\1\63\1\55\1\0\1\6"+
    "\1\0\1\31\1\33\1\30\1\25\1\23\1\35\1\17\1\37\1\12"+
    "\2\6\1\27\1\20\1\13\1\22\1\21\1\6\1\16\1\26\1\14"+
    "\1\32\1\34\1\36\1\24\1\40\1\6\1\52\1\50\1\53\1\0"+
    "\41\7\2\0\4\6\4\0\1\6\2\0\1\7\7\0\1\6\4\0"+
    "\1\6\5\0\27\6\1\0\37\6\1\0\u01ca\6\4\0\14\6\16\0"+
    "\5\6\7\0\1\6\1\0\1\6\21\0\160\7\5\6\1\0\2\6"+
    "\2\0\4\6\10\0\1\6\1\0\3\6\1\0\1\6\1\0\24\6"+
    "\1\0\123\6\1\0\213\6\1\0\5\7\2\0\236\6\11\0\46\6"+
    "\2\0\1\6\7\0\47\6\11\0\55\7\1\0\1\7\1\0\2\7"+
    "\1\0\2\7\1\0\1\7\10\0\33\6\5\0\3\6\15\0\4\7"+
    "\7\0\1\6\4\0\13\7\5\0\53\6\37\7\4\0\2\6\1\7"+
    "\143\6\1\0\1\6\10\7\1\0\6\7\2\6\2\7\1\0\4\7"+
    "\2\6\12\7\3\6\2\0\1\6\17\0\1\7\1\6\1\7\36\6"+
    "\33\7\2\0\131\6\13\7\1\6\16\0\12\7\41\6\11\7\2\6"+
    "\4\0\1\6\5\0\26\6\4\7\1\6\11\7\1\6\3\7\1\6"+
    "\5\7\22\0\31\6\3\7\244\0\4\7\66\6\3\7\1\6\22\7"+
    "\1\6\7\7\12\6\2\7\2\0\12\7\1\0\7\6\1\0\7\6"+
    "\1\0\3\7\1\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6"+
    "\1\0\1\6\3\0\4\6\2\0\1\7\1\6\7\7\2\0\2\7"+
    "\2\0\3\7\1\6\10\0\1\7\4\0\2\6\1\0\3\6\2\7"+
    "\2\0\12\7\4\6\7\0\1\6\5\0\3\7\1\0\6\6\4\0"+
    "\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0\2\6\1\0"+
    "\2\6\2\0\1\7\1\0\5\7\4\0\2\7\2\0\3\7\3\0"+
    "\1\7\7\0\4\6\1\0\1\6\7\0\14\7\3\6\1\7\13\0"+
    "\3\7\1\0\11\6\1\0\3\6\1\0\26\6\1\0\7\6\1\0"+
    "\2\6\1\0\5\6\2\0\1\7\1\6\10\7\1\0\3\7\1\0"+
    "\3\7\2\0\1\6\17\0\2\6\2\7\2\0\12\7\1\0\1\6"+
    "\17\0\3\7\1\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6"+
    "\1\0\2\6\1\0\5\6\2\0\1\7\1\6\7\7\2\0\2\7"+
    "\2\0\3\7\10\0\2\7\4\0\2\6\1\0\3\6\2\7\2\0"+
    "\12\7\1\0\1\6\20\0\1\7\1\6\1\0\6\6\3\0\3\6"+
    "\1\0\4\6\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6"+
    "\3\0\3\6\3\0\14\6\4\0\5\7\3\0\3\7\1\0\4\7"+
    "\2\0\1\6\6\0\1\7\16\0\12\7\11\0\1\6\7\0\3\7"+
    "\1\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6\1\0\5\6"+
    "\3\0\1\6\7\7\1\0\3\7\1\0\4\7\7\0\2\7\1\0"+
    "\2\6\6\0\2\6\2\7\2\0\12\7\22\0\2\7\1\0\10\6"+
    "\1\0\3\6\1\0\27\6\1\0\12\6\1\0\5\6\2\0\1\7"+
    "\1\6\7\7\1\0\3\7\1\0\4\7\7\0\2\7\7\0\1\6"+
    "\1\0\2\6\2\7\2\0\12\7\1\0\2\6\17\0\2\7\1\0"+
    "\10\6\1\0\3\6\1\0\51\6\2\0\1\6\7\7\1\0\3\7"+
    "\1\0\4\7\1\6\10\0\1\7\10\0\2\6\2\7\2\0\12\7"+
    "\12\0\6\6\2\0\2\7\1\0\22\6\3\0\30\6\1\0\11\6"+
    "\1\0\1\6\2\0\7\6\3\0\1\7\4\0\6\7\1\0\1\7"+
    "\1\0\10\7\22\0\2\7\15\0\60\6\1\7\2\6\7\7\4\0"+
    "\10\6\10\7\1\0\12\7\47\0\2\6\1\0\1\6\2\0\2\6"+
    "\1\0\1\6\2\0\1\6\6\0\4\6\1\0\7\6\1\0\3\6"+
    "\1\0\1\6\1\0\1\6\2\0\2\6\1\0\4\6\1\7\2\6"+
    "\6\7\1\0\2\7\1\6\2\0\5\6\1\0\1\6\1\0\6\7"+
    "\2\0\12\7\2\0\2\6\42\0\1\6\27\0\2\7\6\0\12\7"+
    "\13\0\1\7\1\0\1\7\1\0\1\7\4\0\2\7\10\6\1\0"+
    "\44\6\4\0\24\7\1\0\2\7\5\6\13\7\1\0\44\7\11\0"+
    "\1\7\71\0\53\6\24\7\1\6\12\7\6\0\6\6\4\7\4\6"+
    "\3\7\1\6\3\7\2\6\7\7\3\6\4\7\15\6\14\7\1\6"+
    "\17\7\2\0\46\6\12\0\53\6\1\0\1\6\3\0\u0149\6\1\0"+
    "\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0\51\6\1\0"+
    "\4\6\2\0\41\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0"+
    "\4\6\2\0\17\6\1\0\71\6\1\0\4\6\2\0\103\6\2\0"+
    "\3\7\40\0\20\6\20\0\125\6\14\0\u026c\6\2\0\21\6\1\0"+
    "\32\6\5\0\113\6\3\0\3\6\17\0\15\6\1\0\4\6\3\7"+
    "\13\0\22\6\3\7\13\0\22\6\2\7\14\0\15\6\1\0\3\6"+
    "\1\0\2\7\14\0\64\6\40\7\3\0\1\6\3\0\2\6\1\7"+
    "\2\0\12\7\41\0\3\7\2\0\12\7\6\0\130\6\10\0\51\6"+
    "\1\7\1\6\5\0\106\6\12\0\35\6\3\0\14\7\4\0\14\7"+
    "\12\0\12\7\36\6\2\0\5\6\13\0\54\6\4\0\21\7\7\6"+
    "\2\7\6\0\12\7\46\0\27\6\5\7\4\0\65\6\12\7\1\0"+
    "\35\7\2\0\13\7\6\0\12\7\15\0\1\6\130\0\5\7\57\6"+
    "\21\7\7\6\4\0\12\7\21\0\11\7\14\0\3\7\36\6\12\7"+
    "\3\0\2\6\12\7\6\0\46\6\16\7\14\0\44\6\24\7\10\0"+
    "\12\7\3\0\3\6\12\7\44\6\122\0\3\7\1\0\25\7\4\6"+
    "\1\7\4\6\1\7\15\0\300\6\47\7\25\0\4\7\u0116\6\2\0"+
    "\6\6\2\0\46\6\2\0\6\6\2\0\10\6\1\0\1\6\1\0"+
    "\1\6\1\0\1\6\1\0\37\6\2\0\65\6\1\0\7\6\1\0"+
    "\1\6\3\0\3\6\1\0\7\6\3\0\4\6\2\0\6\6\4\0"+
    "\15\6\5\0\3\6\1\0\7\6\16\0\5\7\32\0\5\7\20\0"+
    "\2\6\23\0\1\6\13\0\5\7\5\0\6\7\1\0\1\6\15\0"+
    "\1\6\20\0\15\6\3\0\32\6\26\0\15\7\4\0\1\7\3\0"+
    "\14\7\21\0\1\6\4\0\1\6\2\0\12\6\1\0\1\6\3\0"+
    "\5\6\6\0\1\6\1\0\1\6\1\0\1\6\1\0\4\6\1\0"+
    "\13\6\2\0\4\6\5\0\5\6\4\0\1\6\21\0\51\6\u0a77\0"+
    "\57\6\1\0\57\6\1\0\205\6\6\0\4\6\3\7\16\0\46\6"+
    "\12\0\66\6\11\0\1\6\17\0\1\7\27\6\11\0\7\6\1\0"+
    "\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0"+
    "\7\6\1\0\7\6\1\0\40\7\57\0\1\6\u01d5\0\3\6\31\0"+
    "\11\6\6\7\1\0\5\6\2\0\5\6\4\0\126\6\2\0\2\7"+
    "\2\0\3\6\1\0\132\6\1\0\4\6\5\0\51\6\3\0\136\6"+
    "\21\0\33\6\65\0\20\6\u0200\0\u19b6\6\112\0\u51cc\6\64\0\u048d\6"+
    "\103\0\56\6\2\0\u010d\6\3\0\20\6\12\7\2\6\24\0\57\6"+
    "\1\7\14\0\2\7\1\0\31\6\10\0\120\6\2\7\45\0\11\6"+
    "\2\0\147\6\2\0\4\6\1\0\2\6\16\0\12\6\120\0\10\6"+
    "\1\7\3\6\1\7\4\6\1\7\27\6\5\7\20\0\1\6\7\0"+
    "\64\6\14\0\2\7\62\6\21\7\13\0\12\7\6\0\22\7\6\6"+
    "\3\0\1\6\4\0\12\7\34\6\10\7\2\0\27\6\15\7\14\0"+
    "\35\6\3\0\4\7\57\6\16\7\16\0\1\6\12\7\46\0\51\6"+
    "\16\7\11\0\3\6\1\7\10\6\2\7\2\0\12\7\6\0\27\6"+
    "\3\0\1\6\1\7\4\0\60\6\1\7\1\6\3\7\2\6\2\7"+
    "\5\6\2\7\1\6\1\7\1\6\30\0\3\6\43\0\6\6\2\0"+
    "\6\6\2\0\6\6\11\0\7\6\1\0\7\6\221\0\43\6\10\7"+
    "\1\0\2\7\2\0\12\7\6\0\u2ba4\6\14\0\27\6\4\0\61\6"+
    "\u2104\0\u012e\6\2\0\76\6\2\0\152\6\46\0\7\6\14\0\5\6"+
    "\5\0\1\6\1\7\12\6\1\0\15\6\1\0\5\6\1\0\1\6"+
    "\1\0\2\6\1\0\2\6\1\0\154\6\41\0\u016b\6\22\0\100\6"+
    "\2\0\66\6\50\0\15\6\3\0\20\7\20\0\7\7\14\0\2\6"+
    "\30\0\3\6\31\0\1\6\6\0\5\6\1\0\207\6\2\0\1\7"+
    "\4\0\1\6\13\0\12\7\7\0\32\6\4\0\1\6\1\0\32\6"+
    "\13\0\131\6\3\0\6\6\2\0\6\6\2\0\6\6\2\0\3\6"+
    "\3\0\2\6\3\0\2\6\22\0\3\7\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\2\6\20\5"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\1"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\2\0\1\32\1\5\1\33"+
    "\23\5\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\2\0\1\46\1\5\1\47\11\5"+
    "\1\50\12\5\1\0\2\5\1\51\1\52\3\5\1\53"+
    "\1\54\2\5\1\55\1\5\1\56\4\5\1\57\14\5"+
    "\1\60\1\5\1\61\1\62\1\63\1\5\1\64\1\65"+
    "\1\66\1\5\1\67\1\5\1\70\1\71\2\5\1\72"+
    "\1\73\1\74\2\5\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[160];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
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
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\150\0\320\0\150\0\u0104"+
    "\0\150\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270"+
    "\0\u02a4\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410"+
    "\0\u0444\0\u0478\0\150\0\150\0\150\0\u04ac\0\u04e0\0\u0514"+
    "\0\u0548\0\u057c\0\u05b0\0\150\0\150\0\150\0\150\0\150"+
    "\0\150\0\150\0\150\0\150\0\u05e4\0\150\0\u0618\0\u064c"+
    "\0\u0680\0\u06b4\0\u06e8\0\u0104\0\u071c\0\u0750\0\u0784\0\u07b8"+
    "\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958"+
    "\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\150"+
    "\0\150\0\150\0\150\0\150\0\150\0\150\0\150\0\150"+
    "\0\150\0\u0af8\0\u0b2c\0\u0104\0\u0b60\0\u0104\0\u0b94\0\u0bc8"+
    "\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0104"+
    "\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4"+
    "\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u0104\0\u0104\0\u100c"+
    "\0\u1040\0\u1074\0\u0104\0\u0104\0\u10a8\0\u10dc\0\u0104\0\u1110"+
    "\0\u0104\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u0104\0\u1214\0\u1248"+
    "\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8"+
    "\0\u141c\0\u1450\0\u0104\0\u1484\0\u0104\0\u0104\0\u0104\0\u14b8"+
    "\0\u0104\0\u0104\0\u0104\0\u14ec\0\u0104\0\u1520\0\u0104\0\u0104"+
    "\0\u1554\0\u1588\0\u0104\0\u0104\0\u0104\0\u15bc\0\u15f0\0\u0104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[160];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\3\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\20"+
    "\1\21\1\22\1\23\2\10\1\24\1\25\1\26\2\10"+
    "\1\27\1\30\1\31\1\32\2\10\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\3"+
    "\1\55\2\3\36\55\1\56\21\55\1\57\66\0\1\5"+
    "\65\0\1\60\1\61\64\0\33\10\33\0\2\12\60\0"+
    "\5\10\1\62\4\10\1\63\14\10\1\64\3\10\31\0"+
    "\15\10\1\65\15\10\31\0\10\10\1\66\20\10\1\67"+
    "\1\10\31\0\6\10\1\70\23\10\1\71\31\0\15\10"+
    "\1\72\15\10\31\0\23\10\1\73\7\10\31\0\10\10"+
    "\1\74\13\10\1\75\6\10\31\0\24\10\1\76\6\10"+
    "\31\0\16\10\1\77\2\10\1\100\11\10\31\0\6\10"+
    "\1\101\24\10\31\0\15\10\1\102\15\10\31\0\21\10"+
    "\1\103\11\10\31\0\14\10\1\104\16\10\31\0\14\10"+
    "\1\105\16\10\31\0\23\10\1\106\7\10\31\0\31\10"+
    "\1\107\1\10\70\0\1\110\63\0\1\111\63\0\1\112"+
    "\63\0\1\113\66\0\1\114\64\0\1\115\12\0\1\55"+
    "\2\0\36\55\1\0\21\55\14\0\1\116\1\117\1\0"+
    "\1\120\22\0\1\121\22\0\1\60\1\4\1\5\61\60"+
    "\5\122\1\123\56\122\6\0\6\10\1\124\24\10\31\0"+
    "\13\10\1\125\17\10\31\0\30\10\1\126\2\10\31\0"+
    "\24\10\1\127\6\10\31\0\4\10\1\130\26\10\31\0"+
    "\10\10\1\131\22\10\31\0\20\10\1\132\12\10\31\0"+
    "\6\10\1\133\14\10\1\134\7\10\31\0\4\10\1\135"+
    "\26\10\31\0\4\10\1\136\26\10\31\0\25\10\1\137"+
    "\5\10\31\0\6\10\1\140\24\10\31\0\4\10\1\141"+
    "\1\10\1\142\24\10\31\0\20\10\1\143\12\10\31\0"+
    "\23\10\1\144\7\10\31\0\5\10\1\145\25\10\31\0"+
    "\23\10\1\146\7\10\31\0\14\10\1\147\16\10\31\0"+
    "\4\10\1\150\26\10\31\0\21\10\1\151\11\10\31\0"+
    "\4\10\1\152\26\10\23\0\5\122\1\153\56\122\4\0"+
    "\1\5\1\123\64\0\14\10\1\154\4\10\1\155\11\10"+
    "\31\0\15\10\1\156\15\10\31\0\20\10\1\157\12\10"+
    "\31\0\4\10\1\160\26\10\31\0\6\10\1\161\24\10"+
    "\31\0\24\10\1\162\6\10\31\0\17\10\1\163\13\10"+
    "\31\0\5\10\1\164\25\10\31\0\5\10\1\165\25\10"+
    "\31\0\21\10\1\166\11\10\31\0\6\10\1\167\24\10"+
    "\31\0\15\10\1\170\15\10\31\0\15\10\1\171\15\10"+
    "\31\0\6\10\1\172\24\10\31\0\11\10\1\173\21\10"+
    "\31\0\20\10\1\174\12\10\31\0\21\10\1\175\11\10"+
    "\31\0\17\10\1\176\13\10\31\0\20\10\1\177\12\10"+
    "\31\0\21\10\1\200\11\10\23\0\4\122\1\5\1\153"+
    "\56\122\6\0\10\10\1\201\22\10\31\0\15\10\1\202"+
    "\15\10\31\0\5\10\1\203\25\10\31\0\15\10\1\204"+
    "\15\10\31\0\10\10\1\205\22\10\31\0\6\10\1\206"+
    "\24\10\31\0\4\10\1\207\26\10\31\0\5\10\1\210"+
    "\25\10\31\0\4\10\1\211\26\10\31\0\6\10\1\212"+
    "\24\10\31\0\20\10\1\213\12\10\31\0\15\10\1\214"+
    "\15\10\31\0\15\10\1\215\15\10\31\0\15\10\1\216"+
    "\15\10\31\0\6\10\1\217\24\10\31\0\12\10\1\220"+
    "\20\10\31\0\11\10\1\221\21\10\31\0\12\10\1\222"+
    "\20\10\31\0\5\10\1\223\25\10\31\0\21\10\1\224"+
    "\11\10\31\0\22\10\1\225\10\10\31\0\17\10\1\226"+
    "\13\10\31\0\22\10\1\227\10\10\31\0\31\10\1\230"+
    "\1\10\31\0\23\10\1\231\7\10\31\0\15\10\1\232"+
    "\15\10\31\0\5\10\1\233\25\10\31\0\20\10\1\234"+
    "\12\10\31\0\5\10\1\235\25\10\31\0\5\10\1\236"+
    "\25\10\31\0\6\10\1\237\24\10\31\0\20\10\1\240"+
    "\12\10\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5668];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\1\1\1\11\1\1\1\11"+
    "\21\1\3\11\6\1\11\11\1\1\1\11\1\1\2\0"+
    "\26\1\12\11\2\0\27\1\1\0\65\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[160];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2214) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /* ignore */
          }
        case 62: break;
        case 43: 
          { return symbol(sym.READ,yytext());
          }
        case 63: break;
        case 44: 
          { return symbol(sym.MAIN,yytext());
          }
        case 64: break;
        case 8: 
          { return symbol(sym.SUMA,yytext());
          }
        case 65: break;
        case 52: 
          { return symbol(sym.TSTRING,yytext());
          }
        case 66: break;
        case 35: 
          { string.append('\t');
          }
        case 67: break;
        case 42: 
          { return symbol(sym.THIS,yytext());
          }
        case 68: break;
        case 45: 
          { return symbol(sym.EXIT,yytext());
          }
        case 69: break;
        case 7: 
          { string.setLength(0); yybegin(STRING);
          }
        case 70: break;
        case 14: 
          { return symbol(sym.LLAVEI,yytext());
          }
        case 71: break;
        case 40: 
          { return symbol(sym.OUT,yytext());
          }
        case 72: break;
        case 32: 
          { return symbol(sym.OR,yytext());
          }
        case 73: break;
        case 28: 
          { return symbol(sym.DIF,yytext());
          }
        case 74: break;
        case 10: 
          { return symbol(sym.NEG,yytext());
          }
        case 75: break;
        case 18: 
          { return symbol(sym.PARENTI,yytext());
          }
        case 76: break;
        case 20: 
          { return symbol(sym.PYCOMA,yytext());
          }
        case 77: break;
        case 48: 
          { return symbol(sym.CLASS,yytext());
          }
        case 78: break;
        case 12: 
          { return symbol(sym.MEN,yytext());
          }
        case 79: break;
        case 25: 
          { string.append('\\');
          }
        case 80: break;
        case 21: 
          { return symbol(sym.PUNTO,yytext());
          }
        case 81: break;
        case 41: 
          { return symbol(sym.TRUE,yytext());
          }
        case 82: break;
        case 36: 
          { string.append('\r');
          }
        case 83: break;
        case 46: 
          { return symbol(sym.ELSE,yytext());
          }
        case 84: break;
        case 31: 
          { return symbol(sym.MAY_IG,yytext());
          }
        case 85: break;
        case 11: 
          { return symbol(sym.ASIGN,yytext());
          }
        case 86: break;
        case 47: 
          { return symbol(sym.VOID,yytext());
          }
        case 87: break;
        case 13: 
          { return symbol(sym.MAY,yytext());
          }
        case 88: break;
        case 29: 
          { return symbol(sym.IG_IG,yytext());
          }
        case 89: break;
        case 57: 
          { return symbol(sym.LENGTH,yytext());
          }
        case 90: break;
        case 50: 
          { return symbol(sym.WHILE,yytext());
          }
        case 91: break;
        case 1: 
          { System.out.println("Error caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );
				   /*throw new Error("Caracter no permitido <"+
                                                    yytext()+">");*/
          }
        case 92: break;
        case 33: 
          { return symbol(sym.AND,yytext());
          }
        case 93: break;
        case 5: 
          { return symbol(sym.ID,yytext());
          }
        case 94: break;
        case 37: 
          { string.append('\"');
          }
        case 95: break;
        case 56: 
          { return symbol(sym.STATIC,yytext());
          }
        case 96: break;
        case 15: 
          { return symbol(sym.LLAVED,yytext());
          }
        case 97: break;
        case 30: 
          { return symbol(sym.MEN_IG,yytext());
          }
        case 98: break;
        case 27: 
          { return symbol(sym.IF,yytext());
          }
        case 99: break;
        case 19: 
          { return symbol(sym.PARENTD,yytext());
          }
        case 100: break;
        case 9: 
          { return symbol(sym.RESTA,yytext());
          }
        case 101: break;
        case 24: 
          { yybegin(YYINITIAL); 
                                   return symbol(sym.STRING_CONS, string.toString());
          }
        case 102: break;
        case 59: 
          { return symbol(sym.EXTENDS,yytext());
          }
        case 103: break;
        case 16: 
          { return symbol(sym.CORCHI,yytext());
          }
        case 104: break;
        case 60: 
          { return symbol(sym.BOOL,yytext());
          }
        case 105: break;
        case 6: 
          { return symbol(sym.NUM,yytext());
          }
        case 106: break;
        case 34: 
          { string.append('\n');
          }
        case 107: break;
        case 61: 
          { return symbol(sym.IMPLEM,yytext());
          }
        case 108: break;
        case 26: 
          { return symbol(sym.IN,yytext());
          }
        case 109: break;
        case 3: 
          { return symbol(sym.DIV,yytext());
          }
        case 110: break;
        case 39: 
          { return symbol(sym.NEW,yytext());
          }
        case 111: break;
        case 55: 
          { return symbol(sym.PUBLIC,yytext());
          }
        case 112: break;
        case 54: 
          { return symbol(sym.RETURN,yytext());
          }
        case 113: break;
        case 51: 
          { return symbol(sym.IMPORT,yytext());
          }
        case 114: break;
        case 49: 
          { return symbol(sym.FALSE,yytext());
          }
        case 115: break;
        case 53: 
          { return symbol(sym.SYSTEM,yytext());
          }
        case 116: break;
        case 17: 
          { return symbol(sym.CORCHD,yytext());
          }
        case 117: break;
        case 38: 
          { return symbol(sym.TINT,yytext());
          }
        case 118: break;
        case 22: 
          { return symbol(sym.COMA,yytext());
          }
        case 119: break;
        case 23: 
          { string.append( yytext() );
          }
        case 120: break;
        case 58: 
          { return symbol(sym.PRINTLN,yytext());
          }
        case 121: break;
        case 4: 
          { return symbol(sym.MULT,yytext());
          }
        case 122: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }
}