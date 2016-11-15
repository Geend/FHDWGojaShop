
package model.visitor;

import persistence.*;

public interface CommonDateExceptionVisitor<E extends model.UserException> {
    
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException, E;
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    
}
