
package model.visitor;

import persistence.*;

public interface CommonDateReturnVisitor<R> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public R handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException;
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public R handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException;
    public R handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public R handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException;
    public R handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}
