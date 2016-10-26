
package view.visitor;

import view.*;

public abstract class AbstractOrderStandardVisitor implements AbstractOrderVisitor {
    
    public void handleOrder(OrderView order) throws ModelException{
        this.standardHandling(order);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.standardHandling(preOrder);
    }
    protected abstract void standardHandling(AbstractOrderView abstractOrder) throws ModelException;
}
