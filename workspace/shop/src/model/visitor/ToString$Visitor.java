
package model.visitor;

import persistence.*;

public abstract class ToString$Visitor extends AnythingStandardVisitor{
    
    public abstract void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public abstract void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException;
    public abstract void handleServer(Server4Public server) throws PersistenceException;
    public abstract void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException;
    public abstract void handleArticle(Article4Public article) throws PersistenceException;
    public abstract void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException;
    public abstract void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    public abstract void handleInSale(InSale4Public inSale) throws PersistenceException;
    public abstract void handleProducer(Producer4Public producer) throws PersistenceException;
    public abstract void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException;
    
}
