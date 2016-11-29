
package view.visitor;

import view.*;

public abstract class OrderStateStandardVisitor implements OrderStateVisitor {
    
    public void handleActiveOrder(ActiveOrderView activeOrder) throws ModelException{
        this.standardHandling(activeOrder);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.standardHandling(preOrder);
    }
    public void handleFinishedOrder(FinishedOrderView finishedOrder) throws ModelException{
        this.standardHandling(finishedOrder);
    }
    protected abstract void standardHandling(OrderStateView orderState) throws ModelException;
}
