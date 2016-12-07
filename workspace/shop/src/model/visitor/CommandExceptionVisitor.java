
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ArticleCommandExceptionVisitor<E>,CustomerAccountCommandExceptionVisitor<E>,CustomerOrderManagerCommandExceptionVisitor<E>,CustomerRegisterServiceCommandExceptionVisitor<E>,ProducerLstCommandExceptionVisitor<E>,ReOrderManagerCommandExceptionVisitor<E>,ReturnManagerCommandExceptionVisitor<E>,ShopCommandExceptionVisitor<E>,ShoppingCartCommandExceptionVisitor<E>,ShoppingCartQuantifiedArticleCommandExceptionVisitor<E>{
    
    
}
