
package model.visitor;

import persistence.*;

public interface UserExceptionReturnExceptionVisitor<R, E extends model.UserException> extends ArticleOrderExceptionReturnExceptionVisitor<R, E> {
    
    public R handleCycleException(model.CycleException cycleException) throws PersistenceException, E;
    public R handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException, E;
    public R handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException, E;
    public R handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException, E;
    public R handleOrderNotAcceptableException(model.OrderNotAcceptableException orderNotAcceptableException) throws PersistenceException, E;
    public R handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException, E;
    public R handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException, E;
    
}
