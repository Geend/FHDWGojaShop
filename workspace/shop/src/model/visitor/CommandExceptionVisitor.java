
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ArticleCommandExceptionVisitor<E>,ArticleWrapperCommandExceptionVisitor<E>,CustomerAccountCommandExceptionVisitor<E>,CustomerDeliveryTimeManagerCommandExceptionVisitor<E>,CustomerOrderManagerCommandExceptionVisitor<E>,CustomerRegisterServiceCommandExceptionVisitor<E>,ProducerLstCommandExceptionVisitor<E>,ProductGroupCommandExceptionVisitor<E>,ShoppingCartCommandExceptionVisitor<E>,ShoppingCartQuantifiedArticleCommandExceptionVisitor<E>,SubComponentCommandExceptionVisitor<E>{
    
    
}
