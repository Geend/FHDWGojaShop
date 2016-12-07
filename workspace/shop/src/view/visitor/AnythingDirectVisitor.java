
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleProducerLst(ProducerLstView producerLst) throws ModelException;
    
    public abstract void handleOrderQuantifiedArticleState(OrderQuantifiedArticleStateView orderQuantifiedArticleState) throws ModelException;
    
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException{
        this.handleOrderQuantifiedArticleState(orderQuantifiedArticleNormalState);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException{
        this.handleOrderQuantifiedArticleState(orderQuantifiedArticleMarkedForReturnState);
    }
    public abstract void handleReturnManager(ReturnManagerView returnManager) throws ModelException;
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleArticle(ArticleView article) throws ModelException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    
    public abstract void handleOrderStatus(OrderStatusView orderStatus) throws ModelException;
    
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException{
        this.handleOrderStatus(preOrderState);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException{
        this.handleOrderStatus(waitingForAcceptOrderState);
    }
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderStateView articlesInReturnOrderState) throws ModelException{
        this.handleOrderStatus(articlesInReturnOrderState);
    }
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException{
        this.handleOrderStatus(finishedOrderState);
    }
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException{
        this.handleOrderStatus(processingOrderState);
    }
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException{
        this.handleOrderStatus(inTransitOrderState);
    }
    public abstract void handleQuantifiedArticle(QuantifiedArticleView quantifiedArticle) throws ModelException;
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticleView reOrderQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(reOrderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticleView returnQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(returnQuantifiedArticle);
    }
    public abstract void handleComponentManager(ComponentManagerView componentManager) throws ModelException;
    
    public abstract void handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException;
    
    public abstract void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException;
    
    public abstract void handleComponent(ComponentView component) throws ModelException;
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.handleComponent(productGroup);
    }
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException{
        this.handleComponent(articleWrapper);
    }
    public abstract void handleSettings(SettingsView settings) throws ModelException;
    
    public abstract void handleOrder(OrderView order) throws ModelException;
    
    public abstract void handleBackgroundTaskManager(BackgroundTaskManagerView backgroundTaskManager) throws ModelException;
    
    public abstract void handleService(ServiceView service) throws ModelException;
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.handleService(customerService);
    }
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.handleService(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.handleService(customerRegisterService);
    }
    public abstract void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    
    public abstract void handleBackgroundTask(BackgroundTaskView backgroundTask) throws ModelException;
    
    public void handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException{
        this.handleBackgroundTask(cONCBackgroundTask);
    }
    public void handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException{
        this.handleBackgroundTask(ownerOrderManager);
    }
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException{
        this.handleBackgroundTask(reOrderManager);
    }
    public abstract void handleProducer(ProducerView producer) throws ModelException;
    
    public abstract void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
    public abstract void handleArticleReturn(ArticleReturnView articleReturn) throws ModelException;
    
    public abstract void handleArticleState(ArticleStateView articleState) throws ModelException;
    
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.handleArticleState(notInSale);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.handleArticleState(newCreated);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.handleArticleState(inSale);
    }
    public abstract void handleOrderManager(OrderManagerView orderManager) throws ModelException;
    
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException{
        this.handleOrderManager(customerOrderManager);
    }
    
}
