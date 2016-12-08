
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException;
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException;
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException;
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}
