
package model.visitor;

import persistence.*;

public interface SubjInterfaceExceptionVisitor<E extends model.UserException> extends ArticleStateExceptionVisitor<E>,BackgroundTaskExceptionVisitor<E>,ComponentExceptionVisitor<E>,ComponentContainerExceptionVisitor<E>,OrderManagerExceptionVisitor<E>,OrderQuantifiedArticleStateExceptionVisitor<E>,OrderStatusExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleArticle(Article4Public article) throws PersistenceException, E;
    public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException, E;
    public void handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException, E;
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException, E;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException, E;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public void handleOrder(Order4Public order) throws PersistenceException, E;
    public void handleProducer(Producer4Public producer) throws PersistenceException, E;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException, E;
    public void handleServer(Server4Public server) throws PersistenceException, E;
    public void handleSettings(Settings4Public settings) throws PersistenceException, E;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public void handleSubj(Subj4Public subj) throws PersistenceException, E;
    
}
