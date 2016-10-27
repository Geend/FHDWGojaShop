package persistence;



import model.visitor.*;

public class ProductGroupICProxi extends ComponentICProxi implements PersistentProductGroup{
    
    public ProductGroupICProxi(long objectId) {
        super(objectId);
    }
    public ProductGroupICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
            .getProductGroup(this.getId());
    }
    
    public long getClassId() {
        return 121;
    }
    
    public ProductGroup_ComponentsProxi getComponents() throws PersistenceException {
        return ((PersistentProductGroup)this.getTheObject()).getComponents();
    }
    public PersistentProductGroup getThis() throws PersistenceException {
        return ((PersistentProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(PartsHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(PartsHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(PartsHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(PartsHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    
    
    public boolean containsParts(final PartsHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).containsParts(part);
    }
    public boolean containsParts(final PartsHIERARCHY part, final java.util.HashSet<PartsHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).containsParts(part, visited);
    }
    public void createArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final PersistentProducer producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public void createSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).createSubProductGroup(name, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).register(observee);
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).strategyParts(strategy);
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy, final java.util.HashMap<PartsHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).strategyParts(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public PersistentArticle createArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final PersistentProducer producer) 
				throws model.CycleException, PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public PersistentProductGroup createSubProductGroup(final String name) 
				throws model.CycleException, PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).createSubProductGroup(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnInstantiation();
    }

    
}
