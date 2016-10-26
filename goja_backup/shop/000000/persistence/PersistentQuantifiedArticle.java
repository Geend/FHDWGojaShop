package persistence;


public interface PersistentQuantifiedArticle extends Anything, AbstractPersistentProxi, QuantifiedArticle4Public {
    
    public long getQuantity() throws PersistenceException ;
    public void setQuantity(long newValue) throws PersistenceException ;
    public abstract PersistentQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

