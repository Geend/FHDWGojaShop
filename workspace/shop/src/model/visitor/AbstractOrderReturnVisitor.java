
package model.visitor;

import persistence.*;

public interface AbstractOrderReturnVisitor<R> {
    
    public R handleOrder(Order4Public order) throws PersistenceException;
    public R handlePreOrder(PreOrder4Public preOrder) throws PersistenceException;
    
}
