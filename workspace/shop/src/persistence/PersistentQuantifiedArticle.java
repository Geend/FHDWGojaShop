package persistence;


public interface PersistentQuantifiedArticle extends Anything, SubjInterface, AbstractPersistentProxi, QuantifiedArticle4Public {
    
    public long getQuantity() throws PersistenceException ;
    public void setQuantity(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

