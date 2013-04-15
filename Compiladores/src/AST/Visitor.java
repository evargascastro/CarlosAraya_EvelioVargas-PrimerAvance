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
}
