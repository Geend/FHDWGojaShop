package persistence;



import model.visitor.*;

public class ArticleProxi extends ComponentProxi implements PersistentArticle{
    
    public ArticleProxi(long objectId) {
        super(objectId);
    }
    public ArticleProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 123;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getPrice() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setPrice(newValue);
    }
    public long getMinStock() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getMinStock();
    }
    public void setMinStock(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setMinStock(newValue);
    }
    public long getMaxStock() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getMaxStock();
    }
    public void setMaxStock(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setMaxStock(newValue);
    }
    public long getCurrentStock() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getCurrentStock();
    }
    public void setCurrentStock(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setCurrentStock(newValue);
    }
    public long getProducerDeliveryTime() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getProducerDeliveryTime();
    }
    public void setProducerDeliveryTime(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setProducerDeliveryTime(newValue);
    }
    public PersistentProducer getProducer() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getProducer();
    }
    public void setProducer(PersistentProducer newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setProducer(newValue);
    }
    public PersistentArticleState getState() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getState();
    }
    public void setState(PersistentArticleState newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setState(newValue);
    }
    public PersistentArticle getThis() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getThis();
    }
    
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    public void accept(PartsHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(PartsHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(PartsHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(PartsHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    
    
    public boolean containsParts(final PartsHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).containsParts(part);
    }
    public boolean containsParts(final PartsHIERARCHY part, final java.util.HashSet<PartsHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).containsParts(part, visited);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).strategyParts(strategy);
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy, final java.util.HashMap<PartsHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).strategyParts(strategy, visited);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initializeOnInstantiation();
    }

    
}
