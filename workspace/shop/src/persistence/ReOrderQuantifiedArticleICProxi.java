package persistence;



import model.visitor.*;

public class ReOrderQuantifiedArticleICProxi extends QuantifiedArticleICProxi implements PersistentReOrderQuantifiedArticle{
    
    public ReOrderQuantifiedArticleICProxi(long objectId) {
        super(objectId);
    }
    public ReOrderQuantifiedArticleICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade
            .getReOrderQuantifiedArticle(this.getId());
    }
    
    public long getClassId() {
        return 326;
    }
    
    public long getProducerDeliveryTimeAtReorder() throws PersistenceException {
        return ((PersistentReOrderQuantifiedArticle)this.getTheObject()).getProducerDeliveryTimeAtReorder();
    }
    public void setProducerDeliveryTimeAtReorder(long newValue) throws PersistenceException {
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).setProducerDeliveryTimeAtReorder(newValue);
    }
    public long getCountdown() throws PersistenceException {
        return ((PersistentReOrderQuantifiedArticle)this.getTheObject()).getCountdown();
    }
    public void setCountdown(long newValue) throws PersistenceException {
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).setCountdown(newValue);
    }
    public PersistentReOrderQuantifiedArticle getThis() throws PersistenceException {
        return ((PersistentReOrderQuantifiedArticle)this.getTheObject()).getThis();
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void increaseQuantity(final long amount) 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).increaseQuantity(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentReOrderQuantifiedArticle)this.getTheObject()).initializeOnInstantiation();
    }

    
}
