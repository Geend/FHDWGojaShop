
package model.visitor;

import persistence.*;

public interface UserExceptionVisitor extends ArticleOrderExceptionVisitor{
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException;
    public void handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException;
    public void handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException;
    public void handleEmptyDefinitionException(model.EmptyDefinitionException emptyDefinitionException) throws PersistenceException;
    public void handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException;
    public void handleOrderNotAcceptableException(model.OrderNotAcceptableException orderNotAcceptableException) throws PersistenceException;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException;
    
}
