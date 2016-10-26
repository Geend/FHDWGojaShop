
package model.visitor;

import persistence.*;

public interface ArticleStateVisitor {
    
    public void handleInSale(PersistentInSale inSale) throws PersistenceException;
    public void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    public void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    
}
