
package view.visitor;

import view.*;

public interface AnythingVisitor extends AbstractOrderVisitor,ArticleStateVisitor,ArticleWrapperVisitor,ComponentVisitor,QuantifiedArticleVisitor{
    
    public void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public void handleProducer(ProducerView producer) throws ModelException;
    public void handleServer(ServerView server) throws ModelException;
    public void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
}
