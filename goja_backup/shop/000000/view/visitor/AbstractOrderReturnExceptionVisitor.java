
package view.visitor;

import view.*;

public interface AbstractOrderReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleOrder(OrderView order) throws ModelException, E;
    public R handlePreOrder(PreOrderView preOrder) throws ModelException, E;
    
}
