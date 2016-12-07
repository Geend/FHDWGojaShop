
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ArticleCommandReturnExceptionVisitor<R, E> ,ComponentCommandReturnExceptionVisitor<R, E> ,ComponentContainerCommandReturnExceptionVisitor<R, E> ,CustomerAccountCommandReturnExceptionVisitor<R, E> ,CustomerDeliveryTimeManagerCommandReturnExceptionVisitor<R, E> ,CustomerOrderManagerCommandReturnExceptionVisitor<R, E> ,CustomerRegisterServiceCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ReOrderManagerCommandReturnExceptionVisitor<R, E> ,ReturnManagerCommandReturnExceptionVisitor<R, E> ,ShoppingCartCommandReturnExceptionVisitor<R, E> ,ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E> {
    
    
}
