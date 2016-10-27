
package model.visitor;

import persistence.*;

public abstract class Server$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    public abstract void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    public abstract void handleProducer(PersistentProducer producer) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public abstract void handleInSale(PersistentInSale inSale) throws PersistenceException;
    public abstract void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    
}
