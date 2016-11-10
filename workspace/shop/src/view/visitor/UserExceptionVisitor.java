
package view.visitor;

import view.*;

public interface UserExceptionVisitor {
    
    public void handleCycleException(CycleException cycleException) throws ModelException;
    public void handleDoubleDefinition(DoubleDefinition doubleDefinition) throws ModelException;
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    
}
