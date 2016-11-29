
package view.visitor;

import view.*;

public interface OrderStateVisitor {
    
    public void handleActiveOrder(ActiveOrderView activeOrder) throws ModelException;
    public void handleFinishedOrder(FinishedOrderView finishedOrder) throws ModelException;
    public void handlePreOrder(PreOrderView preOrder) throws ModelException;
    
}
