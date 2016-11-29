
package model.visitor;

import persistence.*;

public interface SubjInterfaceVisitor extends ArticleStateVisitor,ComponentVisitor,OrderManagerVisitor,OrderStateVisitor,QuantifiedArticleVisitor,ServiceVisitor,SubComponentVisitor{
    
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public void handleOrder(Order4Public order) throws PersistenceException;
    public void handleProducer(Producer4Public producer) throws PersistenceException;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public void handleServer(Server4Public server) throws PersistenceException;
    public void handleSettings(Settings4Public settings) throws PersistenceException;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public void handleSubj(Subj4Public subj) throws PersistenceException;
    
}
