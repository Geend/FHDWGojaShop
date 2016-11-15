
package model.visitor;

import persistence.*;

public interface AnythingVisitor extends AbstractOrderVisitor,ArticleStateVisitor,ArticleWrapperVisitor,CommonDateVisitor,ComponentVisitor,QuantifiedArticleVisitor,ServiceVisitor{
    
    public void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    public void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException;
    public void handleProducer(Producer4Public producer) throws PersistenceException;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public void handleServer(Server4Public server) throws PersistenceException;
    public void handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public void handleSubj(Subj4Public subj) throws PersistenceException;
    
}
