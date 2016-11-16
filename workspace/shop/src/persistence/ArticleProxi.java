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
        return 194;
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
    public ProductGroup4Public getParent() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getParent();
    }
    public void setParent(ProductGroup4Public newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setParent(newValue);
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
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
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
    public void accept(SubComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).moveTo(productGroup);
    }
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).moveTo(productGroup, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).register(observee);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentArticle)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).updateObservers(event);
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
    public void moveToImplementation(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentArticle)this.getTheObject()).moveToImplementation(productGroup);
    }

    
}
