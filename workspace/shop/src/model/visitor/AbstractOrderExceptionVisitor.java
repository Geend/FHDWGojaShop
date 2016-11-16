
package model.visitor;

import persistence.*;

public interface AbstractOrderExceptionVisitor<E extends model.UserException> {
    
    public void handleOrder(Order4Public order) throws PersistenceException, E;
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException, E;
    
}
