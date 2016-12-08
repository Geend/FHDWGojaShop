package persistence;


public interface PersistentArticleReturn extends Anything, SubjInterface, AbstractPersistentProxi, ArticleReturn4Public {
    
    public Order4Public getOrder() throws PersistenceException ;
    public void setOrder(Order4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentArticleReturn getThis() throws PersistenceException ;
    
    

}

