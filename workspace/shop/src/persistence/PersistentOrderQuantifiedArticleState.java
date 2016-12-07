package persistence;


public interface PersistentOrderQuantifiedArticleState extends Anything, SubjInterface, AbstractPersistentProxi, OrderQuantifiedArticleState4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentOrderQuantifiedArticleState getThis() throws PersistenceException ;
    
    

}

