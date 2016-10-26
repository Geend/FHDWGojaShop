
package view.visitor;

import view.*;

public interface AnythingReturnVisitor<R> extends AbstractOrderReturnVisitor<R> ,ArticleStateReturnVisitor<R> ,ArticleWrapperReturnVisitor<R> ,ComponentReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> {
    
    public R handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    public R handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public R handleProducer(ProducerView producer) throws ModelException;
    public R handleServer(ServerView server) throws ModelException;
    public R handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
}
