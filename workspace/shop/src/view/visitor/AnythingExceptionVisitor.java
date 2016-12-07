
package view.visitor;

import view.*;

public interface AnythingExceptionVisitor<E extends view.UserException> extends ArticleStateExceptionVisitor<E>,BackgroundTaskExceptionVisitor<E>,ComponentExceptionVisitor<E>,OrderManagerExceptionVisitor<E>,OrderQuantifiedArticleStateExceptionVisitor<E>,OrderStatusExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleArticle(ArticleView article) throws ModelException, E;
    public void handleArticleReturn(ArticleReturnView articleReturn) throws ModelException, E;
    public void handleBackgroundTaskManager(BackgroundTaskManagerView backgroundTaskManager) throws ModelException, E;
    public void handleComponentManager(ComponentManagerView componentManager) throws ModelException, E;
    public void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException, E;
    public void handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException, E;
    public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException, E;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException, E;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public void handleOrder(OrderView order) throws ModelException, E;
    public void handleProducer(ProducerView producer) throws ModelException, E;
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException, E;
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException, E;
    public void handleReturnManager(ReturnManagerView returnManager) throws ModelException, E;
    public void handleServer(ServerView server) throws ModelException, E;
    public void handleSettings(SettingsView settings) throws ModelException, E;
    public void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException, E;
    
}
