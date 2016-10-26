
package model.visitor;

import persistence.*;

public interface AbstractOrderExceptionVisitor<E extends model.UserException> {
    
    public void handleOrder(PersistentOrder order) throws PersistenceException, E;
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException, E;
    
}
