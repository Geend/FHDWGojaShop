package persistence;


import model.visitor.*;

public interface Article4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
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
    public Producer4Public getProducer() throws PersistenceException ;
    public void setProducer(Producer4Public newValue) throws PersistenceException ;
    public ArticleState4Public getState() throws PersistenceException ;
    public void setState(ArticleState4Public newValue) throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void increaseStock(final long quantity) 
				throws PersistenceException;
    public void increaseStock(final long quantity, final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void reduceStock(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException;
    public void reduceStock(final long quantity, final Invoker invoker) 
				throws PersistenceException;
    public void startSelling() 
				throws PersistenceException;
    public void startSelling(final Invoker invoker) 
				throws PersistenceException;
    public void stopSelling() 
				throws PersistenceException;
    public void stopSelling(final Invoker invoker) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public String getCurrentState() 
				throws PersistenceException;
    public String getProducerName() 
				throws PersistenceException;
    public ArticleWrapper4Public getWrapper() 
				throws PersistenceException;
    public void increaseStockImplementation(final long quantity) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void reduceStockImplementation(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException;
    public void startSellingImplementation() 
				throws PersistenceException;
    public void stopSellingImplementation() 
				throws PersistenceException;

}

