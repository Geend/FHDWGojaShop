
package view.visitor;

public interface ComponentWrapperReturnExceptionVisitor<R, E extends view.UserException> extends ArticleWrapperReturnExceptionVisitor<R, E> ,ProductGroupWrapperReturnExceptionVisitor<R, E> {
    
    
}
