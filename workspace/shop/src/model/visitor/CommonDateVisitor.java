
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException;
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException;
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException;
    public void handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException;
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}
