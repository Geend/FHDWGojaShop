
package view.visitor;

import view.*;

public interface AnythingExceptionVisitor<E extends view.UserException> extends AbstractOrderExceptionVisitor<E>,ArticleStateExceptionVisitor<E>,ArticleWrapperExceptionVisitor<E>,ComponentExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException, E;
    public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException, E;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public void handleProducer(ProducerView producer) throws ModelException, E;
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException, E;
    public void handleServer(ServerView server) throws ModelException, E;
    public void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException, E;
    
}
