/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoProgramAST extends ProgramAST {

    public VariasImportDeclAST p1;
    public VariasClassDeclAST p2;
    public MainClassAST m1;
    
    public CuerpoProgramAST (VariasImportDeclAST a, VariasClassDeclAST b, MainClassAST c){
        p1=a;
        p2=b;
        m1=c;
    }

    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoProgramAST(this, arg);
    }
}
