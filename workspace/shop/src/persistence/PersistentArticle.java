package persistence;


import model.visitor.*;

public interface PersistentArticle extends PersistentComponent {
    
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
    
    public void accept(ComponentVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(PartsHIERARCHYVisitor visitor) throws PersistenceException;
    public <R> R accept(PartsHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(PartsHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(PartsHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public boolean containsParts(final PartsHIERARCHY part) 
				throws PersistenceException;
    public boolean containsParts(final PartsHIERARCHY part, final java.util.HashSet<PartsHIERARCHY> visited) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy) 
				throws PersistenceException;
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy, final java.util.HashMap<PartsHIERARCHY,T> visited) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

