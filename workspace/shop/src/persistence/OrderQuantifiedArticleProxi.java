package persistence;



import model.visitor.*;

public class OrderQuantifiedArticleProxi extends QuantifiedArticleProxi implements PersistentOrderQuantifiedArticle{
    
    public OrderQuantifiedArticleProxi(long objectId) {
        super(objectId);
    }
    public OrderQuantifiedArticleProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 232;
    }
    
    public common.Fraction getArticlePriceAtOrderTime() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticle)this.getTheObject()).getArticlePriceAtOrderTime();
    }
    public void setArticlePriceAtOrderTime(common.Fraction newValue) throws PersistenceException {
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).setArticlePriceAtOrderTime(newValue);
    }
    public OrderQuantifiedArticleState4Public getState() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticle)this.getTheObject()).getState();
    }
    public void setState(OrderQuantifiedArticleState4Public newValue) throws PersistenceException {
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).setState(newValue);
    }
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticle)this.getTheObject()).getThis();
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void increaseQuantity(final long amount) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).increaseQuantity(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).initializeOnInstantiation();
    }
    public void markForReturn() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).markForReturn();
    }
    public void unmarkForReturn() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).unmarkForReturn();
    }

    
}
