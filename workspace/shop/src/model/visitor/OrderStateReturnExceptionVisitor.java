
package model.visitor;

import persistence.*;

public interface OrderStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException, E;
    public R handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException, E;
    public R handlePreOrder(PreOrder4Public preOrder) throws PersistenceException, E;
    
}
