
package model.visitor;

import persistence.*;

public interface AnythingVisitor extends ArticleStateVisitor,BackgroundTaskVisitor,CommonDateVisitor,ComponentVisitor,OrderManagerVisitor,OrderQuantifiedArticleStateVisitor,OrderStatusVisitor,QuantifiedArticleVisitor,ServiceVisitor{
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleArticle(Article4Public article) throws PersistenceException;
    public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException;
    public void handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException;
    public void handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException;
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException;
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException;
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException;
    public void handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException;
    public void handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException;
    public void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    public void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException;
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException;
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public void handleGlobalOrderArchive(GlobalOrderArchive4Public globalOrderArchive) throws PersistenceException;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public void handleOrder(Order4Public order) throws PersistenceException;
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException;
    public void handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException;
    public void handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException;
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException;
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException;
    public void handleProducer(Producer4Public producer) throws PersistenceException;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    public void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException;
    public void handleServer(Server4Public server) throws PersistenceException;
    public void handleSettings(Settings4Public settings) throws PersistenceException;
    public void handleShop(Shop4Public shop) throws PersistenceException;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public void handleSubj(Subj4Public subj) throws PersistenceException;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    
}
