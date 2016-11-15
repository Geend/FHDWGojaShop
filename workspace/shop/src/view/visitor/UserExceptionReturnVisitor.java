
package view.visitor;

import view.*;

public interface UserExceptionReturnVisitor<R> {
    
    public R handleCycleException(CycleException cycleException) throws ModelException;
    public R handleDoubleDefinition(DoubleDefinition doubleDefinition) throws ModelException;
    public R handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException;
    public R handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    public R handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException;
    
}
