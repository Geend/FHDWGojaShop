
package model.visitor;

import persistence.*;

public abstract class ToString$Visitor extends AnythingStandardVisitor{
    
    public abstract void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public abstract void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    public abstract void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException;
    public abstract void handleServer(Server4Public server) throws PersistenceException;
    public abstract void handleArticle(Article4Public article) throws PersistenceException;
    public abstract void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException;
    public abstract void handleInSale(InSale4Public inSale) throws PersistenceException;
    public abstract void handleProducer(Producer4Public producer) throws PersistenceException;
    public abstract void handleComponentLst(ComponentLst4Public componentLst) throws PersistenceException;
    public abstract void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException;
    
}
