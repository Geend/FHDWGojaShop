
package model.visitor;

import persistence.*;

public interface UserExceptionReturnVisitor<R> extends ArticleOrderExceptionReturnVisitor<R> {
    
    public R handleCycleException(model.CycleException cycleException) throws PersistenceException;
    public R handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException;
    public R handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException;
    public R handleEmptyDefinitionException(model.EmptyDefinitionException emptyDefinitionException) throws PersistenceException;
    public R handleInvalidInputException(model.InvalidInputException invalidInputException) throws PersistenceException;
    public R handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException;
    public R handleOrderNotAcceptableException(model.OrderNotAcceptableException orderNotAcceptableException) throws PersistenceException;
    public R handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    public R handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException;
    
}
