
package model.visitor;

import persistence.*;

public interface ArticleStateVisitor {
    
    public void handleInSale(InSale4Public inSale) throws PersistenceException;
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException;
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException;
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException;
    
}
