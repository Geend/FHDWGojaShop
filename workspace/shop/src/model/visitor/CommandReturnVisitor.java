
package model.visitor;

public interface CommandReturnVisitor<R> extends CustomerAccountCommandReturnVisitor<R> ,CustomerRegisterServiceCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ShopCommandReturnVisitor<R> ,ShoppingCartCommandReturnVisitor<R> ,ShoppingCartQuantifiedArticleCommandReturnVisitor<R> {
    
    
}
