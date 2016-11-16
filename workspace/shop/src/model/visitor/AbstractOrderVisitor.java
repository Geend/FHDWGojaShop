
package model.visitor;

import persistence.*;

public interface AbstractOrderVisitor {
    
    public void handleOrder(Order4Public order) throws PersistenceException;
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException;
    
}
