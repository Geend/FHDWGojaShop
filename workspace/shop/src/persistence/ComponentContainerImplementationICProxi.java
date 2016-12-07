package persistence;



import model.visitor.*;

public class ComponentContainerImplementationICProxi extends PersistentInCacheProxiOptimistic implements PersistentComponentContainerImplementation{
    
    public ComponentContainerImplementationICProxi(long objectId) {
        super(objectId);
    }
    public ComponentContainerImplementationICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
            .getComponentContainerImplementation(this.getId());
    }
    
    public long getClassId() {
        return 395;
    }
    
    public void setComponents(ComponentContainerImplementationComponents4Public newValue) throws PersistenceException , model.CycleException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).setComponents(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentComponentContainerImplementation)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentComponentContainerImplementation)this.getTheObject()).setSubService(newValue);
    }
    public PersistentComponentContainerImplementation getThis() throws PersistenceException {
        return ((PersistentComponentContainerImplementation)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).addComponent(component);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).deregister(observee);
    }
    public void fireComponentChanged(final model.meta.ComponentMssgs evnt) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).fireComponentChanged(evnt);
    }
    public ComponentContainerImplementationComponents4Public getComponents() 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).getComponents();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).initialize(This, final$$Fields);
    }
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).newProductGroup(name);
    }
    public void newProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).newProductGroup(name, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).register(observee);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).removeComponent(component);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).updateObservers(event);
    }
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).addComponentImplementation(component);
    }
    public void components_update(final model.meta.ComponentMssgs event) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).components_update(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void fireComponentChangedImplementation(final model.meta.ComponentMssgs evnt) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).fireComponentChangedImplementation(evnt);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).initializeOnInstantiation();
    }
    public ArticleWrapper4Public newArticleImplementation(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).newArticleImplementation(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public ProductGroup4Public newProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentComponentContainerImplementation)this.getTheObject()).newProductGroupImplementation(name);
    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementation)this.getTheObject()).removeComponentImplementation(component);
    }

    
}
