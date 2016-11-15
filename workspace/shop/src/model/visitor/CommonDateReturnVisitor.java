
package model.visitor;

import persistence.*;

public interface CommonDateReturnVisitor<R> {
    
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}
