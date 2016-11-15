
package model.visitor;

import persistence.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException{
        this.standardHandling(cycleException);
    }
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException{
        this.standardHandling(notEnoughStockException);
    }
    public void handleDoubleDefinition(model.DoubleDefinition doubleDefinition) throws PersistenceException{
        this.standardHandling(doubleDefinition);
    }
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException{
        this.standardHandling(userAlreadyExistsException);
    }
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException{
        this.standardHandling(restrictionException);
    }
    protected abstract void standardHandling(model.UserException userException) throws PersistenceException;
}
