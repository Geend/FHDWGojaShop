
package model.visitor;

import persistence.*;

public abstract class ArticleStateStandardVisitor implements ArticleStateVisitor {
    
    public void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException{
        this.standardHandling(remainingStock);
    }
    public void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleInSale(PersistentInSale inSale) throws PersistenceException{
        this.standardHandling(inSale);
    }
    public void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    protected abstract void standardHandling(PersistentArticleState articleState) throws PersistenceException;
}
