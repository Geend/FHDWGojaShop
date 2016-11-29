
package model.visitor;

import persistence.*;

public interface OrderStateExceptionVisitor<E extends model.UserException> {
    
    public void handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException, E;
    public void handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException, E;
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException, E;
    
}
