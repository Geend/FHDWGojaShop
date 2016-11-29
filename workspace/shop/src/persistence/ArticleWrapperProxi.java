package persistence;



import model.visitor.*;

public class ArticleWrapperProxi extends ComponentProxi implements PersistentArticleWrapper{
    
    public ArticleWrapperProxi(long objectId) {
        super(objectId);
    }
    public ArticleWrapperProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 242;
    }
    
    public Article4Public getArticle() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getArticle();
    }
    public void setArticle(Article4Public newValue) throws PersistenceException {
        ((PersistentArticleWrapper)this.getTheObject()).setArticle(newValue);
    }
    public ProductGroup4Public getParent() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getParent();
    }
    public void setParent(ProductGroup4Public newValue) throws PersistenceException {
        ((PersistentArticleWrapper)this.getTheObject()).setParent(newValue);
    }
    public PersistentArticleWrapper getThis() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getThis();
    }
    
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(SubComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    
    
    public void changeArticleName(final String newName) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).changeArticleName(newName);
    }
    public void changeArticleName(final String newName, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).changeArticleName(newName, invoker);
    }
    public void changePrice(final common.Fraction newPrice, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).changePrice(newPrice, invoker);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).moveTo(productGroup);
    }
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).moveTo(productGroup, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).register(observee);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).updateObservers(event);
    }
    public void changeArticleNameImplementation(final String newName) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).changeArticleNameImplementation(newName);
    }
    public void changePrice(final common.Fraction newPrice) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).changePrice(newPrice);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public common.Fraction getPrice() 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).getPrice();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public void moveToImplementation(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).moveToImplementation(productGroup);
    }

    
}
