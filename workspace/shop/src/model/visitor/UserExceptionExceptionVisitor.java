
package model.visitor;

import persistence.*;

public interface UserExceptionExceptionVisitor<E extends model.UserException> extends ArticleOrderExceptionExceptionVisitor<E>{
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException, E;
    public void handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException, E;
    public void handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException, E;
    public void handleEmptyDefinitionException(model.EmptyDefinitionException emptyDefinitionException) throws PersistenceException, E;
    public void handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException, E;
    public void handleOrderNotAcceptableException(model.OrderNotAcceptableException orderNotAcceptableException) throws PersistenceException, E;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException, E;
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException, E;
    
}
