package persistence;


public interface PersistentArticle extends PersistentComponent, Article4Public {
    
    public void setPrice(common.Fraction newValue) throws PersistenceException ;
    public void setMinStock(long newValue) throws PersistenceException ;
    public void setMaxStock(long newValue) throws PersistenceException ;
    public void setCurrentStock(long newValue) throws PersistenceException ;
    public void setProducerDeliveryTime(long newValue) throws PersistenceException ;
    public void setProducer(Producer4Public newValue) throws PersistenceException ;
    public void setState(ArticleState4Public newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

