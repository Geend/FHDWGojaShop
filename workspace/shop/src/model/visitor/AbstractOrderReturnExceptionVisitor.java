
package model.visitor;

import persistence.*;

public interface AbstractOrderReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOrder(Order4Public order) throws PersistenceException, E;
    public R handlePreOrder(PreOrder4Public preOrder) throws PersistenceException, E;
    
}
