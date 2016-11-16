
package view.visitor;

import view.*;

public interface AbstractOrderVisitor {
    
    public void handleOrder(OrderView order) throws ModelException;
    public void handlePreOrder(PreOrderView preOrder) throws ModelException;
    
}
