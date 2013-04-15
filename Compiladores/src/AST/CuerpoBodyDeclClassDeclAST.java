/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoBodyDeclClassDeclAST extends BodyDeclAST{
    public BodyDeclAST bodydecl;
    public ClassDeclAST clasdecl;
    
    public CuerpoBodyDeclClassDeclAST(BodyDeclAST a, ClassDeclAST b){
        bodydecl=a;
        clasdecl=b;
    }
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoBodyDeclClassDeclAST(this, arg);
    } 
}
