
package model.visitor;

import persistence.*;

public interface AnythingExceptionVisitor<E extends model.UserException> extends ArticleStateExceptionVisitor<E>,BackgroundTaskExceptionVisitor<E>,CommonDateExceptionVisitor<E>,ComponentExceptionVisitor<E>,OrderManagerExceptionVisitor<E>,OrderQuantifiedArticleStateExceptionVisitor<E>,OrderStatusExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException, E;
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public void handleArticle(Article4Public article) throws PersistenceException, E;
    public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException, E;
    public void handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException, E;
    public void handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException, E;
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException, E;
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException, E;
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException, E;
    public void handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException, E;
    public void handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException, E;
    public void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException, E;
    public void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException, E;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException, E;
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException, E;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException, E;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException, E;
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException, E;
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException, E;
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException, E;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public void handleGlobalOrderArchive(GlobalOrderArchive4Public globalOrderArchive) throws PersistenceException, E;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    public void handleOrder(Order4Public order) throws PersistenceException, E;
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException, E;
    public void handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException, E;
    public void handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException, E;
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException, E;
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException, E;
    public void handleProducer(Producer4Public producer) throws PersistenceException, E;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException, E;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    public void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException, E;
    public void handleServer(Server4Public server) throws PersistenceException, E;
    public void handleSettings(Settings4Public settings) throws PersistenceException, E;
    public void handleShop(Shop4Public shop) throws PersistenceException, E;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public void handleSubj(Subj4Public subj) throws PersistenceException, E;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    
}
