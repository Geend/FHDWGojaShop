
package view.visitor;

import view.*;

public interface AbstractOrderReturnVisitor<R> {
    
    public R handleOrder(OrderView order) throws ModelException;
    public R handlePreOrder(PreOrderView preOrder) throws ModelException;
    
}
