/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoBodyDeclMethodDeclAST extends BodyDeclAST{
    public BodyDeclAST bodydecl;
    public MethodDeclAST methoddecl;
    
    public CuerpoBodyDeclMethodDeclAST(BodyDeclAST a, MethodDeclAST b){
        bodydecl=a;
        methoddecl=b;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoBodyDeclMethodDeclAST(this, arg);
    } 
}
