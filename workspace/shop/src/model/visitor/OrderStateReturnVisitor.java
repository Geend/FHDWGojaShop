
package model.visitor;

import persistence.*;

public interface OrderStateReturnVisitor<R> {
    
    public R handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException;
    public R handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException;
    public R handlePreOrder(PreOrder4Public preOrder) throws PersistenceException;
    
}
