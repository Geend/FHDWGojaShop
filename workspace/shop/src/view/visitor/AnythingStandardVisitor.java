
package view.visitor;

import view.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException{
        this.standardHandling(producerLst);
    }
    public void handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException{
        this.standardHandling(cONCBackgroundTask);
    }
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.standardHandling(productGroup);
    }
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.standardHandling(remainingStock);
    }
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleServer(ServerView server) throws ModelException{
        this.standardHandling(server);
    }
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException{
        this.standardHandling(errorDisplay);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticleView reOrderQuantifiedArticle) throws ModelException{
        this.standardHandling(reOrderQuantifiedArticle);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.standardHandling(notInSale);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.standardHandling(customerRegisterService);
    }
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException{
        this.standardHandling(processingOrderState);
    }
    public void handleComponentContainerImplementation(ComponentContainerImplementationView componentContainerImplementation) throws ModelException{
        this.standardHandling(componentContainerImplementation);
    }
    public void handleGlobalOrderArchive(GlobalOrderArchiveView globalOrderArchive) throws ModelException{
        this.standardHandling(globalOrderArchive);
    }
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException{
        this.standardHandling(customerDeliveryTimeManager);
    }
    public void handleSettings(SettingsView settings) throws ModelException{
        this.standardHandling(settings);
    }
    public void handleOrder(OrderView order) throws ModelException{
        this.standardHandling(order);
    }
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException{
        this.standardHandling(orderQuantifiedArticleNormalState);
    }
    public void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException{
        this.standardHandling(customerAccount);
    }
    public void handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException{
        this.standardHandling(globalOrderManager);
    }
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException{
        this.standardHandling(reOrderManager);
    }
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException{
        this.standardHandling(inTransitOrderState);
    }
    public void handleShop(ShopView shop) throws ModelException{
        this.standardHandling(shop);
    }
    public void handleProducer(ProducerView producer) throws ModelException{
        this.standardHandling(producer);
    }
    public void handleArticleReturn(ArticleReturnView articleReturn) throws ModelException{
        this.standardHandling(articleReturn);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException{
        this.standardHandling(orderQuantifiedArticleMarkedForReturnState);
    }
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException{
        this.standardHandling(articleWrapper);
    }
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException{
        this.standardHandling(preOrderState);
    }
    public void handleReturnManager(ReturnManagerView returnManager) throws ModelException{
        this.standardHandling(returnManager);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException{
        this.standardHandling(customerDeliveryTime);
    }
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.standardHandling(ownerService);
    }
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException{
        this.standardHandling(finishedOrderState);
    }
    public void handleComponentManager(ComponentManagerView componentManager) throws ModelException{
        this.standardHandling(componentManager);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException{
        this.standardHandling(customerArticleLst);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.standardHandling(newCreated);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleBackgroundTaskManager(BackgroundTaskManagerView backgroundTaskManager) throws ModelException{
        this.standardHandling(backgroundTaskManager);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticleView returnQuantifiedArticle) throws ModelException{
        this.standardHandling(returnQuantifiedArticle);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.standardHandling(inSale);
    }
    public void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException{
        this.standardHandling(shoppingCart);
    }
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderStateView articlesInReturnOrderState) throws ModelException{
        this.standardHandling(articlesInReturnOrderState);
    }
    public void handleOrderQuantifiedArticlePreOrder(OrderQuantifiedArticlePreOrderView orderQuantifiedArticlePreOrder) throws ModelException{
        this.standardHandling(orderQuantifiedArticlePreOrder);
    }
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException{
        this.standardHandling(customerOrderManager);
    }
    protected abstract void standardHandling(Anything anything) throws ModelException;
}
