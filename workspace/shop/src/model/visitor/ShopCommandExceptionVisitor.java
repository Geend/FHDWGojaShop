
package model.visitor;

import persistence.*;

public interface ShopCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException, E;
    public void handleCancelPreOrderCommand(CancelPreOrderCommand4Public cancelPreOrderCommand) throws PersistenceException, E;
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public void handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException, E;
    public void handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException, E;
    public void handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException, E;
    public void handleChangeMaxStockCommand(ChangeMaxStockCommand4Public changeMaxStockCommand) throws PersistenceException, E;
    public void handleChangeMinStockCommand(ChangeMinStockCommand4Public changeMinStockCommand) throws PersistenceException, E;
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    public void handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException, E;
    public void handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException, E;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    
}
