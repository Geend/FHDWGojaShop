
package model.visitor;

import persistence.*;

public interface CommonDateExceptionVisitor<E extends model.UserException> {
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException, E;
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public void handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException, E;
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException, E;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException, E;
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException, E;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException, E;
    public void handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException, E;
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    
}
