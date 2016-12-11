
package view.visitor;

import view.*;

public interface UserExceptionReturnVisitor<R> extends ArticleOrderExceptionReturnVisitor<R> {
    
    public R handleCycleException(CycleException cycleException) throws ModelException;
    public R handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException;
    public R handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException;
    public R handleInvalidInputException(InvalidInputException invalidInputException) throws ModelException;
    public R handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException;
    public R handleOrderNotAcceptableException(OrderNotAcceptableException orderNotAcceptableException) throws ModelException;
    public R handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    public R handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException;
    
}
