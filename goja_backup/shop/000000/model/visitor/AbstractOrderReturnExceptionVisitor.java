
package model.visitor;

import persistence.*;

public interface AbstractOrderReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOrder(PersistentOrder order) throws PersistenceException, E;
    public R handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException, E;
    
}
