
package view.visitor;

import view.*;

public interface AnythingReturnVisitor<R> extends ArticleStateReturnVisitor<R> ,BackgroundTaskReturnVisitor<R> ,ComponentReturnVisitor<R> ,OrderManagerReturnVisitor<R> ,OrderQuantifiedArticleStateReturnVisitor<R> ,OrderStatusReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleArticle(ArticleView article) throws ModelException;
    public R handleArticleReturn(ArticleReturnView articleReturn) throws ModelException;
    public R handleBackgroundTaskManager(BackgroundTaskManagerView backgroundTaskManager) throws ModelException;
    public R handleComponentContainerImplementation(ComponentContainerImplementationView componentContainerImplementation) throws ModelException;
    public R handleComponentManager(ComponentManagerView componentManager) throws ModelException;
    public R handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    public R handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException;
    public R handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    public R handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public R handleOrder(OrderView order) throws ModelException;
    public R handleProducer(ProducerView producer) throws ModelException;
    public R handleProducerLst(ProducerLstView producerLst) throws ModelException;
    public R handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException;
    public R handleReturnManager(ReturnManagerView returnManager) throws ModelException;
    public R handleServer(ServerView server) throws ModelException;
    public R handleSettings(SettingsView settings) throws ModelException;
    public R handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
}
