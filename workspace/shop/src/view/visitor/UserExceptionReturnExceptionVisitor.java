
package view.visitor;

import view.*;

public interface UserExceptionReturnExceptionVisitor<R, E extends view.UserException> extends ArticleOrderExceptionReturnExceptionVisitor<R, E> {
    
    public R handleCycleException(CycleException cycleException) throws ModelException, E;
    public R handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException, E;
    public R handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException, E;
    public R handleEmptyDefinitionException(EmptyDefinitionException emptyDefinitionException) throws ModelException, E;
    public R handleInvalidInputException(InvalidInputException invalidInputException) throws ModelException, E;
    public R handleInvalidMoveException(InvalidMoveException invalidMoveException) throws ModelException, E;
    public R handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException, E;
    public R handleOrderNotAcceptableException(OrderNotAcceptableException orderNotAcceptableException) throws ModelException, E;
    public R handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    public R handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException, E;
    
}
