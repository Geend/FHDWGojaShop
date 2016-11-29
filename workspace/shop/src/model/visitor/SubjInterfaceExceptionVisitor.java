
package model.visitor;

import persistence.*;

public interface SubjInterfaceExceptionVisitor<E extends model.UserException> extends ArticleStateExceptionVisitor<E>,ComponentExceptionVisitor<E>,OrderManagerExceptionVisitor<E>,OrderStateExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>,ServiceExceptionVisitor<E>,SubComponentExceptionVisitor<E>{
    
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException, E;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException, E;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public void handleOrder(Order4Public order) throws PersistenceException, E;
    public void handleProducer(Producer4Public producer) throws PersistenceException, E;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public void handleServer(Server4Public server) throws PersistenceException, E;
    public void handleSettings(Settings4Public settings) throws PersistenceException, E;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public void handleSubj(Subj4Public subj) throws PersistenceException, E;
    
}
