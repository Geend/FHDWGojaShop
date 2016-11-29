
package view.visitor;

import view.*;

public interface OrderStateReturnVisitor<R> {
    
    public R handleActiveOrder(ActiveOrderView activeOrder) throws ModelException;
    public R handleFinishedOrder(FinishedOrderView finishedOrder) throws ModelException;
    public R handlePreOrder(PreOrderView preOrder) throws ModelException;
    
}
