
package model.visitor;

import persistence.*;

public interface CommonDateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public R handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException, E;
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException, E;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public R handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException, E;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public R handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException, E;
    public R handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException, E;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException, E;
    public R handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException, E;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    public R handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException, E;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    
}
