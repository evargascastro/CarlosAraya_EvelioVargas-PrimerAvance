/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public interface Visitor {
    
    
    public Object visitCuerpoProgramAST( CuerpoProgramAST c, Object arg);
    public Object visitCuerpoVariasImportDeclAST(CuerpoVariasImportDeclAST c, Object arg);
    public Object visitCuerpoVariasClassDeclAST(CuerpoVariasClassDeclAST c, Object arg);
    public Object visitCuerpoImportDeclAST(CuerpoImportDeclAST c, Object arg);
    public Object visitCuerpoImportDeclAuxAST(CuerpoImportDeclAuxAST c, Object arg);
    public Object visitCuerpoUnTypeNameAST(CuerpoUnTypeNameAST c, Object arg);
    public Object visitCuerpoVariasTypeNameAST(CuerpoVariasTypeNameAST c, Object arg);
    public Object visitCuerpoMainClassAST(CuerpoMainClassAST c, Object arg);
    public Object visitCuerpoClassDeclAST(CuerpoClassDeclAST c, Object arg);
    public Object visitCuerpoExtendsClassDeclAuxAST(CuerpoExtendsClassDeclAuxAST c, Object arg);
    public Object visitCuerpoImplementsClassDeclAuxAST(CuerpoImplementsClassDeclAuxAST c, Object arg);
    public Object visitCuerpoBodyDeclVarDeclAST(CuerpoBodyDeclVarDeclAST c, Object arg);
    public Object visitCuerpoBodyDeclMethodDeclAST(CuerpoBodyDeclMethodDeclAST c, Object arg);
    public Object visitCuerpoBodyDeclClassDeclAST(CuerpoBodyDeclClassDeclAST c, Object arg);
    public Object visitCuerpoVarDeclAST(CuerpoVarDeclAST c, Object arg);
    public Object visitCuerpoMethodDeclAST(CuerpoMethodDeclAST c, Object arg);
    public Object visitCuerpoConstrDeclorMethodDeclConstrDeclAST(CuerpoConstrDeclorMethodDeclConstrDeclAST c, Object arg);
    public Object visitCuerpoConstrDeclorMethodDeclMethodDeclAST(CuerpoConstrDeclorMethodDeclMethodDeclAST c, Object arg);
}
