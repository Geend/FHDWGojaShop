
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ArticleCommandReturnExceptionVisitor<R, E> ,CustomerRegisterServiceCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ProductGroupCommandReturnExceptionVisitor<R, E> ,SubComponentCommandReturnExceptionVisitor<R, E> {
    
    
}
