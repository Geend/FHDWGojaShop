
package model.visitor;

import persistence.*;

public interface AbstractOrderReturnVisitor<R> {
    
    public R handleOrder(PersistentOrder order) throws PersistenceException;
    public R handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    
}
