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
public class CuerpoClassDeclAST extends ClassDeclAST{
    public Symbol ide;
    public ClassDeclAuxAST clasdecl;
    public BodyDeclAST bodydecl;
    
    public CuerpoClassDeclAST(Symbol a, ClassDeclAuxAST b, BodyDeclAST c){
        ide=a;
        clasdecl=b;
        bodydecl=c;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoClassDeclAST(this, arg);
    } 
}
