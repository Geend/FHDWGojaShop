
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,CustomerAccountCommandReturnVisitor<R> ,CustomerOrderManagerCommandReturnVisitor<R> ,CustomerRegisterServiceCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ReOrderManagerCommandReturnVisitor<R> ,ReturnManagerCommandReturnVisitor<R> ,ShopCommandReturnVisitor<R> ,ShoppingCartCommandReturnVisitor<R> ,ShoppingCartQuantifiedArticleCommandReturnVisitor<R> {
    
    
}
