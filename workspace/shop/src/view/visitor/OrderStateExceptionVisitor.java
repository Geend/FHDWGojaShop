
package view.visitor;

import view.*;

public interface OrderStateExceptionVisitor<E extends view.UserException> {
    
    public void handleActiveOrder(ActiveOrderView activeOrder) throws ModelException, E;
    public void handleFinishedOrder(FinishedOrderView finishedOrder) throws ModelException, E;
    public void handlePreOrder(PreOrderView preOrder) throws ModelException, E;
    
}
