
package model.visitor;

import persistence.*;

public interface AnythingReturnVisitor<R> extends ArticleStateReturnVisitor<R> ,BackgroundTaskReturnVisitor<R> ,CommonDateReturnVisitor<R> ,ComponentReturnVisitor<R> ,OrderManagerReturnVisitor<R> ,OrderQuantifiedArticleStateReturnVisitor<R> ,OrderStatusReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public R handleArticle(Article4Public article) throws PersistenceException;
    public R handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException;
    public R handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException;
    public R handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException;
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public R handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException;
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    public R handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException;
    public R handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException;
    public R handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException;
    public R handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException;
    public R handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    public R handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    public R handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    public R handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public R handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public R handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException;
    public R handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public R handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException;
    public R handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public R handleGlobalOrderArchive(GlobalOrderArchive4Public globalOrderArchive) throws PersistenceException;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public R handleOrder(Order4Public order) throws PersistenceException;
    public R handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException;
    public R handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException;
    public R handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException;
    public R handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException;
    public R handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException;
    public R handleProducer(Producer4Public producer) throws PersistenceException;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public R handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    public R handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException;
    public R handleServer(Server4Public server) throws PersistenceException;
    public R handleSettings(Settings4Public settings) throws PersistenceException;
    public R handleShop(Shop4Public shop) throws PersistenceException;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public R handleSubj(Subj4Public subj) throws PersistenceException;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    
}
