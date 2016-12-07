
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,ComponentCommandReturnVisitor<R> ,ComponentContainerCommandReturnVisitor<R> ,CustomerAccountCommandReturnVisitor<R> ,CustomerDeliveryTimeManagerCommandReturnVisitor<R> ,CustomerOrderManagerCommandReturnVisitor<R> ,CustomerRegisterServiceCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ReOrderManagerCommandReturnVisitor<R> ,ReturnManagerCommandReturnVisitor<R> ,ShoppingCartCommandReturnVisitor<R> ,ShoppingCartQuantifiedArticleCommandReturnVisitor<R> {
    
    
}
