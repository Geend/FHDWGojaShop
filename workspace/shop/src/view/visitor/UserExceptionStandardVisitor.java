
package view.visitor;

import view.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleCycleException(CycleException cycleException) throws ModelException{
        this.standardHandling(cycleException);
    }
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException{
        this.standardHandling(notEnoughStockException);
    }
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException{
        this.standardHandling(userAlreadyExistsException);
    }
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException{
        this.standardHandling(restrictionException);
    }
    public void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException{
        this.standardHandling(doubleDefinitionException);
    }
    protected abstract void standardHandling(UserException userException) throws ModelException;
}
