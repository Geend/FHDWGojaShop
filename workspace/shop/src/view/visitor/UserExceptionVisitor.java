
package view.visitor;

import view.*;

public interface UserExceptionVisitor extends ArticleOrderExceptionVisitor{
    
    public void handleCycleException(CycleException cycleException) throws ModelException;
    public void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException;
    public void handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException;
    public void handleInvalidInputException(InvalidInputException invalidInputException) throws ModelException;
    public void handleInvalidMoveException(InvalidMoveException invalidMoveException) throws ModelException;
    public void handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException;
    public void handleOrderNotAcceptableException(OrderNotAcceptableException orderNotAcceptableException) throws ModelException;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException;
    
}
