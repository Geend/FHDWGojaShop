package persistence;


public interface PersistentArticle extends Anything, SubjInterface, AbstractPersistentProxi, Article4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

