
package view.visitor;

import view.*;

public interface UserExceptionVisitor {
    
    public void handleCycleException(CycleException cycleException) throws ModelException;
    public void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException;
    public void handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException;
    public void handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException;
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException;
    public void handleOrderNotYetArrivedException(OrderNotYetArrivedException orderNotYetArrivedException) throws ModelException;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException;
    
}
