
package model.visitor;

import persistence.*;

public interface UserExceptionVisitor {
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException;
    public void handleDoubleDefinition(model.DoubleDefinition doubleDefinition) throws PersistenceException;
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException;
    
}
