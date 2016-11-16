
package model.visitor;

import persistence.*;

public abstract class AbstractOrderStandardVisitor implements AbstractOrderVisitor {
    
    public void handleOrder(Order4Public order) throws PersistenceException{
        this.standardHandling(order);
    }
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    protected abstract void standardHandling(AbstractOrder4Public abstractOrder) throws PersistenceException;
}
