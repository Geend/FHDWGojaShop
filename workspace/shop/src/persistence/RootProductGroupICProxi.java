package persistence;



import model.visitor.*;

public class RootProductGroupICProxi extends ProductGroupICProxi implements PersistentRootProductGroup{
    
    public RootProductGroupICProxi(long objectId) {
        super(objectId);
    }
    public RootProductGroupICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theRootProductGroupFacade
            .getRootProductGroup(this.getId());
    }
    
    public long getClassId() {
        return 213;
    }
    
    public PersistentRootProductGroup getThis() throws PersistenceException {
        return ((PersistentRootProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(ProductGroupVisitor visitor) throws PersistenceException {
        visitor.handleRootProductGroup(this);
    }
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRootProductGroup(this);
    }
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleRootProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRootProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRootProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRootProductGroup(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleRootProductGroup(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRootProductGroup(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleRootProductGroup(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRootProductGroup(this);
    }
    
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).addComponent(component);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentRootProductGroup)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentRootProductGroup)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).deregister(observee);
    }
    public ProductGroupComponents4Public getComponents() 
				throws PersistenceException{
        return ((PersistentRootProductGroup)this.getTheObject()).getComponents();
    }
    public OwnerService4Public getMyServer() 
				throws PersistenceException{
        return ((PersistentRootProductGroup)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public void newSubProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).newSubProductGroup(name);
    }
    public void newSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).newSubProductGroup(name, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).register(observee);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).removeComponent(component);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentRootProductGroup)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentRootProductGroup)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).updateObservers(event);
    }
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).addComponentImplementation(component);
    }
    public void components_update(final model.meta.ComponentMssgs event) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).components_update(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).initializeOnInstantiation();
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newSubProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).newSubProductGroupImplementation(name);
    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        ((PersistentRootProductGroup)this.getTheObject()).removeComponentImplementation(component);
    }

    
}
