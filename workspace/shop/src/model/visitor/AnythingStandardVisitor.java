
package model.visitor;

import persistence.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException{
        this.standardHandling(producerLst);
    }
    public void handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException{
        this.standardHandling(cONCBackgroundTask);
    }
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException{
        this.standardHandling(remainingStock);
    }
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleServer(Server4Public server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(reOrderQuantifiedArticle);
    }
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException{
        this.standardHandling(newProductGroupCommand);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.standardHandling(customerRegisterService);
    }
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException{
        this.standardHandling(registerCommand);
    }
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException{
        this.standardHandling(processingOrderState);
    }
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException{
        this.standardHandling(componentContainerImplementation);
    }
    public void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException{
        this.standardHandling(commandCoordinator);
    }
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException{
        this.standardHandling(stopSellingCommand);
    }
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.standardHandling(moveToCommand);
    }
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
    }
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException{
        this.standardHandling(changeCustomerDeliveryTimeTimeCommand);
    }
    public void handleGlobalOrderArchive(GlobalOrderArchive4Public globalOrderArchive) throws PersistenceException{
        this.standardHandling(globalOrderArchive);
    }
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException{
        this.standardHandling(customerDeliveryTimeManager);
    }
    public void handleSettings(Settings4Public settings) throws PersistenceException{
        this.standardHandling(settings);
    }
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    public void handleOrder(Order4Public order) throws PersistenceException{
        this.standardHandling(order);
    }
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.standardHandling(createProducerCommand);
    }
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticleNormalState);
    }
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException{
        this.standardHandling(removeArticleCommand);
    }
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException{
        this.standardHandling(newArticleCommand);
    }
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException{
        this.standardHandling(customerAccount);
    }
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException{
        this.standardHandling(ownerServiceShop);
    }
    public void handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException{
        this.standardHandling(globalOrderManager);
    }
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException{
        this.standardHandling(reOrderManager);
    }
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException{
        this.standardHandling(inTransitOrderState);
    }
    public void handleShop(Shop4Public shop) throws PersistenceException{
        this.standardHandling(shop);
    }
    public void handleProducer(Producer4Public producer) throws PersistenceException{
        this.standardHandling(producer);
    }
    public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException{
        this.standardHandling(articleReturn);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticleMarkedForReturnState);
    }
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException{
        this.standardHandling(commonDate);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException{
        this.standardHandling(preOrderState);
    }
    public void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException{
        this.standardHandling(returnManager);
    }
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException{
        this.standardHandling(createCustomerDeliveryTimeCommand);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException{
        this.standardHandling(orderCartCommand);
    }
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException{
        this.standardHandling(customerDeliveryTime);
    }
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException{
        this.standardHandling(ownerService);
    }
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException{
        this.standardHandling(changeArticleNameCommand);
    }
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException{
        this.standardHandling(finishedOrderState);
    }
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException{
        this.standardHandling(componentManager);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException{
        this.standardHandling(customerArticleLst);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException{
        this.standardHandling(changeArticlePriceCommand);
    }
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException{
        this.standardHandling(debitCommand);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException{
        this.standardHandling(backgroundTaskManager);
    }
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException{
        this.standardHandling(customerServiceOrderManager);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException{
        this.standardHandling(returnQuantifiedArticle);
    }
    public void handleInSale(InSale4Public inSale) throws PersistenceException{
        this.standardHandling(inSale);
    }
    public void handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException{
        this.standardHandling(ownerServiceOrderManager);
    }
    public void handleSubj(Subj4Public subj) throws PersistenceException{
        this.standardHandling(subj);
    }
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException{
        this.standardHandling(customerServiceShop);
    }
    public void handleReOrderManagerReorderArticles(ReOrderManagerReorderArticles4Public reOrderManagerReorderArticles) throws PersistenceException{
        this.standardHandling(reOrderManagerReorderArticles);
    }
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException{
        this.standardHandling(preOrderCartCommand);
    }
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException{
        this.standardHandling(shoppingCart);
    }
    public void handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException{
        this.standardHandling(ownerServiceReOrderManager);
    }
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException{
        this.standardHandling(articlesInReturnOrderState);
    }
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException{
        this.standardHandling(changeArticleQuantityCommand);
    }
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException{
        this.standardHandling(customerOrderManager);
    }
    public void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException{
        this.standardHandling(commandExecuter);
    }
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException{
        this.standardHandling(changeCustomerDeliveryTimePriceCommand);
    }
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException{
        this.standardHandling(acceptOrderCommand);
    }
    protected abstract void standardHandling(Anything anything) throws PersistenceException;
}
