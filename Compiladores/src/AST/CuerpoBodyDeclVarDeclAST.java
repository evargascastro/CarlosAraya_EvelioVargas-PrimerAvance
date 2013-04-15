/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoBodyDeclVarDeclAST extends BodyDeclAST{
    public BodyDeclAST bodydecl;
    public VarDeclAST vardecl;
    
    public CuerpoBodyDeclVarDeclAST(BodyDeclAST a, VarDeclAST b){
        bodydecl=a;
        vardecl=b;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoBodyDeclVarDeclAST(this, arg);
    } 
}
