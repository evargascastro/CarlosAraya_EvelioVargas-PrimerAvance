/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoMethodDeclAST extends MethodDeclAST{
    public ConstrDeclorMethodDeclAST consormethod;
    public FormalListAST formalist;
    public MethodDeclAuxUnoAST methodaux;

    public CuerpoMethodDeclAST(ConstrDeclorMethodDeclAST a, FormalListAST b, MethodDeclAuxUnoAST c) {
        consormethod=a;
        formalist=b;
        methodaux=c;
    }
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoMethodDeclAST(this, arg);
    }
}
