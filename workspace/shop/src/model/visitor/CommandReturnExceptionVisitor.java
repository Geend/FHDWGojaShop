
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends CustomerRegisterServiceCommandReturnExceptionVisitor<R, E> ,OwnerArticleWrapperCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ProductGroupCommandReturnExceptionVisitor<R, E> ,SubComponentCommandReturnExceptionVisitor<R, E> {
    
    
}
