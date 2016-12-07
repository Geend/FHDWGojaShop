
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ArticleCommandReturnExceptionVisitor<R, E> ,CustomerAccountCommandReturnExceptionVisitor<R, E> ,CustomerOrderManagerCommandReturnExceptionVisitor<R, E> ,CustomerRegisterServiceCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ReOrderManagerCommandReturnExceptionVisitor<R, E> ,ReturnManagerCommandReturnExceptionVisitor<R, E> ,ShopCommandReturnExceptionVisitor<R, E> ,ShoppingCartCommandReturnExceptionVisitor<R, E> ,ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E> {
    
    
}
