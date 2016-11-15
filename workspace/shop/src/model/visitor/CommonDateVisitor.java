
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException;
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}
