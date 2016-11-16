
package model.visitor;

public interface ComponentWrapperReturnExceptionVisitor<R, E extends model.UserException> extends ArticleWrapperReturnExceptionVisitor<R, E> ,ProductGroupWrapperReturnExceptionVisitor<R, E> {
    
    
}
