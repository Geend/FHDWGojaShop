
package model.visitor;

import persistence.*;

public abstract class ShopCommandStandardVisitor implements ShopCommandVisitor {
    
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException{
        this.standardHandling(createCustomerDeliveryTimeCommand);
    }
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
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
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException{
        this.standardHandling(preOrderCartCommand);
    }
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException{
        this.standardHandling(stopSellingCommand);
    }
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.standardHandling(moveToCommand);
    }
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException{
        this.standardHandling(changeArticleNameCommand);
    }
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException{
        this.standardHandling(changeCustomerDeliveryTimeTimeCommand);
    }
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException{
        this.standardHandling(changeArticlePriceCommand);
    }
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException{
        this.standardHandling(changeCustomerDeliveryTimePriceCommand);
    }
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException{
        this.standardHandling(acceptOrderCommand);
    }
    protected abstract void standardHandling(ShopCommand shopCommand) throws PersistenceException;
}
