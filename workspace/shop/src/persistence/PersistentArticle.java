package persistence;


public interface PersistentArticle extends PersistentComponent, Article4Public {
    
    public String getName() throws PersistenceException ;
    public void setName(String newValue) throws PersistenceException ;
    public common.Fraction getPrice() throws PersistenceException ;
    public void setPrice(common.Fraction newValue) throws PersistenceException ;
    public long getMinStock() throws PersistenceException ;
    public void setMinStock(long newValue) throws PersistenceException ;
    public long getMaxStock() throws PersistenceException ;
    public void setMaxStock(long newValue) throws PersistenceException ;
    public long getCurrentStock() throws PersistenceException ;
    public void setCurrentStock(long newValue) throws PersistenceException ;
    public long getProducerDeliveryTime() throws PersistenceException ;
    public void setProducerDeliveryTime(long newValue) throws PersistenceException ;
    public PersistentProducer getProducer() throws PersistenceException ;
    public void setProducer(PersistentProducer newValue) throws PersistenceException ;
    public PersistentArticleState getState() throws PersistenceException ;
    public void setState(PersistentArticleState newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

