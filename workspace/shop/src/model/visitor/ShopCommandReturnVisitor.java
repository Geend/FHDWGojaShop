
package model.visitor;

import persistence.*;

public interface ShopCommandReturnVisitor<R> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public R handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException;
    public R handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException;
    public R handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    public R handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException;
    public R handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    
}
