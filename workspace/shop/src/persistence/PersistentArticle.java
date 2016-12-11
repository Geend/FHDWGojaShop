package persistence;


public interface PersistentArticle extends Anything, SubjInterface, AbstractPersistentProxi, Article4Public {
    
    public void setPrice(common.Fraction newValue) throws PersistenceException ;
    public void setProducerDeliveryTime(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    
    public ArticleWrapper4Public getMyWrapper() 
				throws PersistenceException;

}

