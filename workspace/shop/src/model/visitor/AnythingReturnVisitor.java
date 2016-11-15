
package model.visitor;

import persistence.*;

public interface AnythingReturnVisitor<R> extends AbstractOrderReturnVisitor<R> ,ArticleStateReturnVisitor<R> ,ArticleWrapperReturnVisitor<R> ,CommonDateReturnVisitor<R> ,ComponentReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    public R handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException;
    public R handleProducer(Producer4Public producer) throws PersistenceException;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public R handleServer(Server4Public server) throws PersistenceException;
    public R handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public R handleSubj(Subj4Public subj) throws PersistenceException;
    
}
