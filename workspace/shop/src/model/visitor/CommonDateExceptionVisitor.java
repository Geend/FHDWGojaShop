
package model.visitor;

import persistence.*;

public interface CommonDateExceptionVisitor<E extends model.UserException> {
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException, E;
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public void handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException, E;
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException, E;
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException, E;
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException, E;
    public void handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException, E;
    public void handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException, E;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException, E;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException, E;
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException, E;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    
}
