
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnVisitor<R> extends ArticleStateReturnVisitor<R> ,BackgroundTaskReturnVisitor<R> ,ComponentReturnVisitor<R> ,ComponentContainerReturnVisitor<R> ,OrderManagerReturnVisitor<R> ,OrderQuantifiedArticleStateReturnVisitor<R> ,OrderStatusReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleArticle(Article4Public article) throws PersistenceException;
    public R handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException;
    public R handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException;
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public R handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public R handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public R handleOrder(Order4Public order) throws PersistenceException;
    public R handleProducer(Producer4Public producer) throws PersistenceException;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public R handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException;
    public R handleServer(Server4Public server) throws PersistenceException;
    public R handleSettings(Settings4Public settings) throws PersistenceException;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public R handleSubj(Subj4Public subj) throws PersistenceException;
    
}
