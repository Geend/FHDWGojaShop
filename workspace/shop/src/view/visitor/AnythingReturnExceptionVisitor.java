
package view.visitor;

import view.*;

public interface AnythingReturnExceptionVisitor<R, E extends view.UserException> extends AbstractOrderReturnExceptionVisitor<R, E> ,ArticleStateReturnExceptionVisitor<R, E> ,ArticleWrapperReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> {
    
    public R handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException, E;
    public R handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException, E;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public R handleProducer(ProducerView producer) throws ModelException, E;
    public R handleServer(ServerView server) throws ModelException, E;
    public R handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException, E;
    
}