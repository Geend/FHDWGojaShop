
package model.visitor;

import persistence.*;

public abstract class AbstractOrderStandardVisitor implements AbstractOrderVisitor {
    
    public void handleOrder(PersistentOrder order) throws PersistenceException{
        this.standardHandling(order);
    }
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    protected abstract void standardHandling(PersistentAbstractOrder abstractOrder) throws PersistenceException;
}
