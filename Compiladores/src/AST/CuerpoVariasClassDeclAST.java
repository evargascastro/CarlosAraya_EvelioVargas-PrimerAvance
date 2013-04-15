/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoVariasClassDeclAST extends VariasClassDeclAST{
    public VariasClassDeclAST vclas;
    public ClassDeclAST clas;
    
    public CuerpoVariasClassDeclAST(VariasClassDeclAST a, ClassDeclAST b){
        vclas=a;
        clas=b;
    }
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasClassDeclAST(this, arg);
    }
}
