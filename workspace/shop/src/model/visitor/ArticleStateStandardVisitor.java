
package model.visitor;

import persistence.*;

public abstract class ArticleStateStandardVisitor implements ArticleStateVisitor {
    
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException{
        this.standardHandling(remainingStock);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    public void handleInSale(InSale4Public inSale) throws PersistenceException{
        this.standardHandling(inSale);
    }
    protected abstract void standardHandling(ArticleState4Public articleState) throws PersistenceException;
}
