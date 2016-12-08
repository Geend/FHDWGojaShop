
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnExceptionVisitor<R, E extends model.UserException> extends ArticleStateReturnExceptionVisitor<R, E> ,BackgroundTaskReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,ComponentContainerReturnExceptionVisitor<R, E> ,OrderManagerReturnExceptionVisitor<R, E> ,OrderQuantifiedArticleStateReturnExceptionVisitor<R, E> ,OrderStatusReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> {
    
    public R handleArticle(Article4Public article) throws PersistenceException, E;
    public R handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException, E;
    public R handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException, E;
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public R handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException, E;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public R handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException, E;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public R handleGlobalOrderArchive(GlobalOrderArchive4Public globalOrderArchive) throws PersistenceException, E;
    public R handleOrder(Order4Public order) throws PersistenceException, E;
    public R handleProducer(Producer4Public producer) throws PersistenceException, E;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public R handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException, E;
    public R handleServer(Server4Public server) throws PersistenceException, E;
    public R handleSettings(Settings4Public settings) throws PersistenceException, E;
    public R handleShop(Shop4Public shop) throws PersistenceException, E;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public R handleSubj(Subj4Public subj) throws PersistenceException, E;
    
}
