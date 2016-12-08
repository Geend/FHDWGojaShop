package persistence;


public interface PersistentReOrderQuantifiedArticle extends PersistentQuantifiedArticle, ReOrderQuantifiedArticle4Public {
    
    public long getProducerDeliveryTimeAtReorder() throws PersistenceException ;
    public void setProducerDeliveryTimeAtReorder(long newValue) throws PersistenceException ;
    public PersistentReOrderQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

