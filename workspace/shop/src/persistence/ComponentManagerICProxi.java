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
    
    public ComponentContainerImplementation4Public getContainer() throws PersistenceException {
        return ((PersistentComponentManager)this.getTheObject()).getContainer();
    }
    public void setContainer(ComponentContainerImplementation4Public newValue) throws PersistenceException {
        ((PersistentComponentManager)this.getTheObject()).setContainer(newValue);
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
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).updateObservers(event);
    }
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).addComponent(component);
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
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentComponentManager)this.getTheObject()).newProductGroup(name);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentComponentManager)this.getTheObject()).removeComponent(component);
    }

    
}
