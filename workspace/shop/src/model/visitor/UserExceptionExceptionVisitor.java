
package model.visitor;

import persistence.*;

public interface UserExceptionExceptionVisitor<E extends model.UserException> {
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException, E;
    public void handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException, E;
    public void handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException, E;
    public void handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException, E;
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException, E;
    public void handleOrderNotYetArrivedException(model.OrderNotYetArrivedException orderNotYetArrivedException) throws PersistenceException, E;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException, E;
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException, E;
    
}
