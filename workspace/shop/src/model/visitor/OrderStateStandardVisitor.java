
package model.visitor;

import persistence.*;

public abstract class OrderStateStandardVisitor implements OrderStateVisitor {
    
    public void handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException{
        this.standardHandling(activeOrder);
    }
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    public void handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException{
        this.standardHandling(finishedOrder);
    }
    protected abstract void standardHandling(OrderState4Public orderState) throws PersistenceException;
}
