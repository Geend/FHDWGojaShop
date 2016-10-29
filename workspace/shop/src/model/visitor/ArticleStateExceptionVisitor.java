
package model.visitor;

import persistence.*;

public interface ArticleStateExceptionVisitor<E extends model.UserException> {
    
    public void handleInSale(InSale4Public inSale) throws PersistenceException, E;
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException, E;
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException, E;
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException, E;
    
}
