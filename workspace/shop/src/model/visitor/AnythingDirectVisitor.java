
package model.visitor;

import persistence.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    
    public abstract void handleOrderQuantifiedArticleState(OrderQuantifiedArticleState4Public orderQuantifiedArticleState) throws PersistenceException;
    
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException{
        this.handleOrderQuantifiedArticleState(orderQuantifiedArticleNormalState);
    }
    public void handleOrderQuantifiedArticlePreOrder(OrderQuantifiedArticlePreOrder4Public orderQuantifiedArticlePreOrder) throws PersistenceException{
        this.handleOrderQuantifiedArticleState(orderQuantifiedArticlePreOrder);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException{
        this.handleOrderQuantifiedArticleState(orderQuantifiedArticleMarkedForReturnState);
    }
    public abstract void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException;
    
    public abstract void handleServer(Server4Public server) throws PersistenceException;
    
    public abstract void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    
    public abstract void handleArticle(Article4Public article) throws PersistenceException;
    
    public abstract void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    
    public abstract void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    
    public abstract void handleOrderStatus(OrderStatus4Public orderStatus) throws PersistenceException;
    
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException{
        this.handleOrderStatus(preOrderState);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException{
        this.handleOrderStatus(waitingForAcceptOrderState);
    }
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException{
        this.handleOrderStatus(articlesInReturnOrderState);
    }
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException{
        this.handleOrderStatus(finishedOrderState);
    }
    public void handleCanceledOrderState(CanceledOrderState4Public canceledOrderState) throws PersistenceException{
        this.handleOrderStatus(canceledOrderState);
    }
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException{
        this.handleOrderStatus(processingOrderState);
    }
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException{
        this.handleOrderStatus(inTransitOrderState);
    }
    public abstract void handleQuantifiedArticle(QuantifiedArticle4Public quantifiedArticle) throws PersistenceException;
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(reOrderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(returnQuantifiedArticle);
    }
    public abstract void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    
    public abstract void handleGlobalOrderArchive(GlobalOrderArchive4Public globalOrderArchive) throws PersistenceException;
    
    public abstract void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException;
    
    public abstract void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException;
    
    public abstract void handleComponent(Component4Public component) throws PersistenceException;
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.handleComponent(productGroup);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.handleComponent(articleWrapper);
    }
    public abstract void handleSettings(Settings4Public settings) throws PersistenceException;
    
    public abstract void handleOrder(Order4Public order) throws PersistenceException;
    
    public abstract void handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException;
    
    public abstract void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    
    public abstract void handleService(Service4Public service) throws PersistenceException;
    
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException{
        this.handleService(customerService);
    }
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException{
        this.handleService(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.handleService(customerRegisterService);
    }
    public abstract void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    
    public abstract void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException;
    
    public abstract void handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException;
    
    public abstract void handleSubj(Subj4Public subj) throws PersistenceException;
    
    public abstract void handleBackgroundTask(BackgroundTask4Public backgroundTask) throws PersistenceException;
    
    public void handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException{
        this.handleBackgroundTask(cONCBackgroundTask);
    }
    public void handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException{
        this.handleBackgroundTask(globalOrderManager);
    }
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException{
        this.handleBackgroundTask(reOrderManager);
    }
    public abstract void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException;
    
    public abstract void handleShop(Shop4Public shop) throws PersistenceException;
    
    public abstract void handleProducer(Producer4Public producer) throws PersistenceException;
    
    public abstract void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    
    public abstract void handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException;
    
    public abstract void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException;
    
    public abstract void handleArticleState(ArticleState4Public articleState) throws PersistenceException;
    
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.handleArticleState(notInSale);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.handleArticleState(newCreated);
    }
    public void handleInSale(InSale4Public inSale) throws PersistenceException{
        this.handleArticleState(inSale);
    }
    public abstract void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException{
        this.handleCommonDate(createCustomerDeliveryTimeCommand);
    }
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.handleCommonDate(createProducerCommand);
    }
    public void handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException{
        this.handleCommonDate(changeMinStockCommand);
    }
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException{
        this.handleCommonDate(startSellingCommand);
    }
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException{
        this.handleCommonDate(removeArticleCommand);
    }
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException{
        this.handleCommonDate(newProductGroupCommand);
    }
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException{
        this.handleCommonDate(newArticleCommand);
    }
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException{
        this.handleCommonDate(orderCartCommand);
    }
    public void handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException{
        this.handleCommonDate(changeMaxStockCommand);
    }
    public void handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException{
        this.handleCommonDate(cancelPreOrderCommand);
    }
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException{
        this.handleCommonDate(registerCommand);
    }
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException{
        this.handleCommonDate(preOrderCartCommand);
    }
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException{
        this.handleCommonDate(withdrawCommand);
    }
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException{
        this.handleCommonDate(stopSellingCommand);
    }
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.handleCommonDate(moveToCommand);
    }
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException{
        this.handleCommonDate(changeArticleNameCommand);
    }
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException{
        this.handleCommonDate(changeArticleQuantityCommand);
    }
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException{
        this.handleCommonDate(addArticleCommand);
    }
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException{
        this.handleCommonDate(changeCustomerDeliveryTimeTimeCommand);
    }
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException{
        this.handleCommonDate(changeArticlePriceCommand);
    }
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException{
        this.handleCommonDate(depositCommand);
    }
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException{
        this.handleCommonDate(changeCustomerDeliveryTimePriceCommand);
    }
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException{
        this.handleCommonDate(debitCommand);
    }
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException{
        this.handleCommonDate(acceptOrderCommand);
    }
    public abstract void handleOrderManager(OrderManager4Public orderManager) throws PersistenceException;
    
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException{
        this.handleOrderManager(customerOrderManager);
    }
    public abstract void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    
    
}
