
package model.visitor;

public interface ComponentWrapperExceptionVisitor<E extends model.UserException> extends ArticleWrapperExceptionVisitor<E>,ProductGroupWrapperExceptionVisitor<E>{
    
    
}
