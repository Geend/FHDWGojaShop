
package model.visitor;

import persistence.*;

public interface OrderStateVisitor {
    
    public void handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException;
    public void handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException;
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException;
    
}
