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
public class CuerpoConstrDeclorMethodDeclMethodDeclAST extends MethodDeclAST{
    public MethodDeclAuxAST methodaux;
    public Symbol ide;

    public CuerpoConstrDeclorMethodDeclMethodDeclAST(MethodDeclAuxAST a, Symbol b) {
        methodaux=a;
        ide=b;
    }
    
    
       
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoConstrDeclorMethodDeclMethodDeclAST(this, arg);
    }
}
