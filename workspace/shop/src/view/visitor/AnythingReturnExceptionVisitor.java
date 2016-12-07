
package view.visitor;

import view.*;

public interface AnythingReturnExceptionVisitor<R, E extends view.UserException> extends ArticleStateReturnExceptionVisitor<R, E> ,BackgroundTaskReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,OrderManagerReturnExceptionVisitor<R, E> ,OrderQuantifiedArticleStateReturnExceptionVisitor<R, E> ,OrderStateReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> {
    
    public R handleArticleReturn(ArticleReturnView articleReturn) throws ModelException, E;
    public R handleBackgroundTaskManager(BackgroundTaskManagerView backgroundTaskManager) throws ModelException, E;
    public R handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException, E;
    public R handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException, E;
    public R handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException, E;
    public R handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException, E;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public R handleOrder(OrderView order) throws ModelException, E;
    public R handleProducer(ProducerView producer) throws ModelException, E;
    public R handleProducerLst(ProducerLstView producerLst) throws ModelException, E;
    public R handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException, E;
    public R handleReturnManager(ReturnManagerView returnManager) throws ModelException, E;
    public R handleServer(ServerView server) throws ModelException, E;
    public R handleSettings(SettingsView settings) throws ModelException, E;
    public R handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException, E;
    
}
