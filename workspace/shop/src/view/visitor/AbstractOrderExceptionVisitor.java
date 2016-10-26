
package view.visitor;

import view.*;

public interface AbstractOrderExceptionVisitor<E extends view.UserException> {
    
    public void handleOrder(OrderView order) throws ModelException, E;
    public void handlePreOrder(PreOrderView preOrder) throws ModelException, E;
    
}
