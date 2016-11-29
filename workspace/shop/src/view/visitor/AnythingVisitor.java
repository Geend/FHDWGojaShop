
package view.visitor;

import view.*;

public interface AnythingVisitor extends ArticleStateVisitor,ComponentVisitor,OrderManagerVisitor,OrderStateVisitor,QuantifiedArticleVisitor,ServiceVisitor{
    
    public void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    public void handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException;
    public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public void handleOrder(OrderView order) throws ModelException;
    public void handleProducer(ProducerView producer) throws ModelException;
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException;
    public void handleServer(ServerView server) throws ModelException;
    public void handleSettings(SettingsView settings) throws ModelException;
    public void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
}
