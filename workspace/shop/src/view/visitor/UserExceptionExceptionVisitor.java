
package view.visitor;

import view.*;

public interface UserExceptionExceptionVisitor<E extends view.UserException> extends ArticleOrderExceptionExceptionVisitor<E>{
    
    public void handleCycleException(CycleException cycleException) throws ModelException, E;
    public void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException, E;
    public void handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException, E;
    public void handleInvalidInputException(InvalidInputException invalidInputException) throws ModelException, E;
    public void handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException, E;
    public void handleOrderNotAcceptableException(OrderNotAcceptableException orderNotAcceptableException) throws ModelException, E;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException, E;
    
}
