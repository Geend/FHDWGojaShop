package persistence;


import model.visitor.*;

public interface Article4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    public String getName() throws PersistenceException ;
    public common.Fraction getPrice() throws PersistenceException ;
    public long getMinStock() throws PersistenceException ;
    public long getMaxStock() throws PersistenceException ;
    public long getCurrentStock() throws PersistenceException ;
    public long getProducerDeliveryTime() throws PersistenceException ;
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
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void changeMaxStock(final long newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void changeMinStock(final long newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void changeName(final String newValue) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException;
    public void changePrice(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void changeProducerDeliveryTime(final long newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public String getCurrentState() 
				throws PersistenceException;
    public String getProducerName() 
				throws PersistenceException;
    public ArticleWrapper4Public getWrapper() 
				throws PersistenceException;
    public void increaseStock(final long quantity) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void order(final long quantity) 
				throws model.NotEnoughStockException, model.ArticleNotInSaleException, PersistenceException;
    public void reduceStock(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException;
    public void startSelling() 
				throws PersistenceException;
    public void stopSelling() 
				throws PersistenceException;

}

