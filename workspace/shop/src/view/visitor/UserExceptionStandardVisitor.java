
package view.visitor;

import view.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleCycleException(CycleException cycleException) throws ModelException{
        this.standardHandling(cycleException);
    }
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException{
        this.standardHandling(notEnoughStockException);
    }
    public void handleDoubleDefinition(DoubleDefinition doubleDefinition) throws ModelException{
        this.standardHandling(doubleDefinition);
    }
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException{
        this.standardHandling(userAlreadyExistsException);
    }
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException{
        this.standardHandling(restrictionException);
    }
    protected abstract void standardHandling(UserException userException) throws ModelException;
}
