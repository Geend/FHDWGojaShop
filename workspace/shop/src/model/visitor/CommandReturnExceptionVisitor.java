
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ArticleCommandReturnExceptionVisitor<R, E> ,ArticleWrapperCommandReturnExceptionVisitor<R, E> ,CustomerAccountCommandReturnExceptionVisitor<R, E> ,CustomerDeliveryTimeManagerCommandReturnExceptionVisitor<R, E> ,CustomerOrderManagerCommandReturnExceptionVisitor<R, E> ,CustomerRegisterServiceCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ProductGroupCommandReturnExceptionVisitor<R, E> ,ShoppingCartCommandReturnExceptionVisitor<R, E> ,ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E> ,SubComponentCommandReturnExceptionVisitor<R, E> {
    
    
}
