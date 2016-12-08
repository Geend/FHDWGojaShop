
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends CustomerAccountCommandExceptionVisitor<E>,CustomerRegisterServiceCommandExceptionVisitor<E>,ProducerLstCommandExceptionVisitor<E>,ShopCommandExceptionVisitor<E>,ShoppingCartCommandExceptionVisitor<E>,ShoppingCartQuantifiedArticleCommandExceptionVisitor<E>{
    
    
}
