
package model.visitor;

import persistence.*;

public interface CommonDateReturnVisitor<R> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public R handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException;
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public R handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException;
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    public R handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException;
    public R handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException;
    public R handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException;
    public R handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public R handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public R handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException;
    public R handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}
