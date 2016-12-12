package persistence;



import model.visitor.*;

public class ArticleICProxi extends PersistentInCacheProxiOptimistic implements PersistentArticle{
    
    public ArticleICProxi(long objectId) {
        super(objectId);
    }
    public ArticleICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theArticleFacade
            .getArticle(this.getId());
    }
    
    public long getClassId() {
        return 194;
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
    public Producer4Public getProducer() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getProducer();
    }
    public void setProducer(Producer4Public newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setProducer(newValue);
    }
    public ArticleState4Public getState() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getState();
    }
    public void setState(ArticleState4Public newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setState(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setSubService(newValue);
    }
    public PersistentArticle getThis() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getThis();
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).deregister(observee);
    }
    public ArticleWrapper4Public getMyWrapper() 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).getMyWrapper();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).updateObservers(event);
    }
    public void changeMaxStock(final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeMaxStock(newValue);
    }
    public void changeMinStock(final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeMinStock(newValue);
    }
    public void changeName(final String newValue) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeName(newValue);
    }
    public void changePrice(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).changePrice(newValue);
    }
    public void changeProducerDeliveryTime(final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeProducerDeliveryTime(newValue);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public String getCurrentState() 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).getCurrentState();
    }
    public String getProducerName() 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).getProducerName();
    }
    public ArticleWrapper4Public getWrapper() 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).getWrapper();
    }
    public void increaseStock(final long quantity) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).increaseStock(quantity);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initializeOnInstantiation();
    }
    public void order(final long quantity) 
				throws model.NotEnoughStockException, model.ArticleNotInSaleException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).order(quantity);
    }
    public void reduceStock(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).reduceStock(quantity);
    }
    public void startSelling() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).startSelling();
    }
    public void stopSelling() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).stopSelling();
    }

    
}
