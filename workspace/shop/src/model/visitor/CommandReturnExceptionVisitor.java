
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends CustomerAccountCommandReturnExceptionVisitor<R, E> ,CustomerRegisterServiceCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ShopCommandReturnExceptionVisitor<R, E> ,ShoppingCartCommandReturnExceptionVisitor<R, E> ,ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E> {
    
    
}
