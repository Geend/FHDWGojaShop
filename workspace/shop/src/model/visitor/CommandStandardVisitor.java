
package model.visitor;

import persistence.*;

public abstract class CommandStandardVisitor implements CommandVisitor {
    
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException{
        this.standardHandling(createCustomerDeliveryTimeCommand);
    }
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.standardHandling(createProducerCommand);
    }
    public void handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException{
        this.standardHandling(changeMinStockCommand);
    }
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException{
        this.standardHandling(removeArticleCommand);
    }
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException{
        this.standardHandling(newProductGroupCommand);
    }
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException{
        this.standardHandling(newArticleCommand);
    }
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException{
        this.standardHandling(orderCartCommand);
    }
    public void handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException{
        this.standardHandling(changeMaxStockCommand);
    }
    public void handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException{
        this.standardHandling(cancelPreOrderCommand);
    }
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException{
        this.standardHandling(registerCommand);
    }
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException{
        this.standardHandling(preOrderCartCommand);
    }
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException{
        this.standardHandling(stopSellingCommand);
    }
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException{
        this.standardHandling(changeArticleQuantityCommand);
    }
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.standardHandling(moveToCommand);
    }
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException{
        this.standardHandling(changeArticleNameCommand);
    }
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
    }
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException{
        this.standardHandling(changeCustomerDeliveryTimeTimeCommand);
    }
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException{
        this.standardHandling(changeArticlePriceCommand);
    }
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException{
        this.standardHandling(changeCustomerDeliveryTimePriceCommand);
    }
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException{
        this.standardHandling(debitCommand);
    }
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException{
        this.standardHandling(acceptOrderCommand);
    }
    protected abstract void standardHandling(Command command) throws PersistenceException;
}
