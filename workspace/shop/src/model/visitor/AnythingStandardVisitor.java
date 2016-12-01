
package model.visitor;

import persistence.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException{
        this.standardHandling(producerLst);
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
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException{
        this.standardHandling(reduceStockCommand);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(reOrderQuantifiedArticle);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException{
        this.standardHandling(newPreOrderCommand);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
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
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException{
        this.standardHandling(increaseStockCommand);
    }
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.standardHandling(rootProductGroup);
    }
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.standardHandling(createProducerCommand);
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
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException{
        this.standardHandling(reOrderCommand);
    }
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException{
        this.standardHandling(reOrderManager);
    }
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException{
        this.standardHandling(inTransitOrderState);
    }
    public void handleProducer(Producer4Public producer) throws PersistenceException{
        this.standardHandling(producer);
    }
    public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException{
        this.standardHandling(articleReturn);
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
    public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException{
        this.standardHandling(ownerOrderManager);
    }
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException{
        this.standardHandling(productGroupComponents);
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
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException{
        this.standardHandling(customerArticleLst);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    public void handleCustomerServiceRootProductGroup(CustomerServiceRootProductGroup4Public customerServiceRootProductGroup) throws PersistenceException{
        this.standardHandling(customerServiceRootProductGroup);
    }
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException{
        this.standardHandling(debitCommand);
    }
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException{
        this.standardHandling(newSubProductGroupCommand);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException{
        this.standardHandling(addArticleReturnCommand);
    }
    public void handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException{
        this.standardHandling(returnQuantifiedArticle);
    }
    public void handleInSale(InSale4Public inSale) throws PersistenceException{
        this.standardHandling(inSale);
    }
    public void handleSubj(Subj4Public subj) throws PersistenceException{
        this.standardHandling(subj);
    }
    public void handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException{
        this.standardHandling(startOrderingCommand);
    }
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException{
        this.standardHandling(shoppingCart);
    }
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException{
        this.standardHandling(changeArticleQuantityCommand);
    }
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException{
        this.standardHandling(newOrderCommand);
    }
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException{
        this.standardHandling(customerOrderManager);
    }
    public void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException{
        this.standardHandling(commandExecuter);
    }
    protected abstract void standardHandling(Anything anything) throws PersistenceException;
}
