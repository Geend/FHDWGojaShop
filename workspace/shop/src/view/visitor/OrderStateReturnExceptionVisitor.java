
package view.visitor;

import view.*;

public interface OrderStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleActiveOrder(ActiveOrderView activeOrder) throws ModelException, E;
    public R handleFinishedOrder(FinishedOrderView finishedOrder) throws ModelException, E;
    public R handlePreOrder(PreOrderView preOrder) throws ModelException, E;
    
}
