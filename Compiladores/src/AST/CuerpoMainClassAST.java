/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;
import java_cup.runtime.Symbol;
/**
 *
 * @author Carlos
 */
public class CuerpoMainClassAST extends MainClassAST{
    public Symbol ide;
    public Symbol ide1;
    public StatementAST statem;
    
    public CuerpoMainClassAST (Symbol a, Symbol b, StatementAST c){
        ide=a;
        ide1=b;
        statem=c;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoMainClassAST(this, arg);
    } 
}
