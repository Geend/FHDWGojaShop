
package model.visitor;

import persistence.*;

public interface UserExceptionExceptionVisitor<E extends model.UserException> {
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException, E;
    public void handleDoubleDefinition(model.DoubleDefinition doubleDefinition) throws PersistenceException, E;
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException, E;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException, E;
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException, E;
    
}
