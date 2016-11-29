
package model.visitor;

import persistence.*;

public interface AnythingReturnExceptionVisitor<R, E extends model.UserException> extends ArticleStateReturnExceptionVisitor<R, E> ,CommonDateReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,OrderManagerReturnExceptionVisitor<R, E> ,OrderStateReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> {
    
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException, E;
    public R handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException, E;
    public R handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException, E;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public R handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException, E;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public R handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException, E;
    public R handleCustomerServiceRootProductGroup(CustomerServiceRootProductGroup4Public customerServiceRootProductGroup) throws PersistenceException, E;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public R handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException, E;
    public R handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException, E;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException, E;
    public R handleOrder(Order4Public order) throws PersistenceException, E;
    public R handleProducer(Producer4Public producer) throws PersistenceException, E;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    public R handleServer(Server4Public server) throws PersistenceException, E;
    public R handleSettings(Settings4Public settings) throws PersistenceException, E;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public R handleSubj(Subj4Public subj) throws PersistenceException, E;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    
}
