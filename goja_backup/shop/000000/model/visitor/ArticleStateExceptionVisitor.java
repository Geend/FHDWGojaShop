
package model.visitor;

import persistence.*;

public interface ArticleStateExceptionVisitor<E extends model.UserException> {
    
    public void handleInSale(PersistentInSale inSale) throws PersistenceException, E;
    public void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException, E;
    public void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException, E;
    public void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException, E;
    
}
