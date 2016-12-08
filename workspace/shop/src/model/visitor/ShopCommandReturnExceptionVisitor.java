
package model.visitor;

import persistence.*;

public interface ShopCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException, E;
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public R handleChangeArticlePriceCommand(ChangeArticlePriceCommand4Public changeArticlePriceCommand) throws PersistenceException, E;
    public R handleChangeCustomerDeliveryTimePriceCommand(ChangeCustomerDeliveryTimePriceCommand4Public changeCustomerDeliveryTimePriceCommand) throws PersistenceException, E;
    public R handleChangeCustomerDeliveryTimeTimeCommand(ChangeCustomerDeliveryTimeTimeCommand4Public changeCustomerDeliveryTimeTimeCommand) throws PersistenceException, E;
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    public R handleOrderCartCommand(OrderCartCommand4Public orderCartCommand) throws PersistenceException, E;
    public R handlePreOrderCartCommand(PreOrderCartCommand4Public preOrderCartCommand) throws PersistenceException, E;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    
}
