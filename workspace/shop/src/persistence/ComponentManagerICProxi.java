package persistence;



import model.visitor.*;

public class ComponentManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentComponentManager{
    
    public ComponentManagerICProxi(long objectId) {
        super(objectId);
    }
    public ComponentManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theComponentManagerFacade
            .getComponentManager(this.getId());
    }
    
    public long getClassId() {
        return 379;
    }
    
    public ComponentManager_ComponentsProxi getComponents() throws PersistenceException {
        return ((PersistentComponentManager)this.getTheObject()).getComponents();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentComponentManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentComponentManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentComponentManager getThis() throws PersistenceException {
        return ((PersistentComponentManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleComponentManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentManager(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleComponentManager(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentManager(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleComponentManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentManager(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws PersistenceException {
        visitor.handleComponentManager(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentManager(this);
    }
    public <E extends model.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentManager(this);
    }
    
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).addComponent(component);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).deregister(observee);
    }
    public OwnerService4Public getMyServer() 
				throws PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).newProductGroup(name);
    }
    public void newProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).newProductGroup(name, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).register(observee);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).removeComponent(component);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).updateObservers(event);
    }
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).addComponentImplementation(component);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).initializeOnInstantiation();
    }
    public ArticleWrapper4Public newArticleImplementation(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).newArticleImplementation(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public ProductGroup4Public newProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).newProductGroupImplementation(name);
    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).removeComponentImplementation(component);
    }

    
}
