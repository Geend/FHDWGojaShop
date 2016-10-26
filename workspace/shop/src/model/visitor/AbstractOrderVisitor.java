
package model.visitor;

import persistence.*;

public interface AbstractOrderVisitor {
    
    public void handleOrder(PersistentOrder order) throws PersistenceException;
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    
}
