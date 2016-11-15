
package model.visitor;

import persistence.*;

public interface CommonDateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException, E;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException, E;
    public R handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException, E;
    public R handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException, E;
    public R handleCommonDate(CommonDate4Public commonDate) throws PersistenceException, E;
    
}
