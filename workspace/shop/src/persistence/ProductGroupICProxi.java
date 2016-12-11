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
    
    public ComponentContainerImplementation4Public getContainer() throws PersistenceException {
        return ((PersistentProductGroup)this.getTheObject()).getContainer();
    }
    public void setContainer(ComponentContainerImplementation4Public newValue) throws PersistenceException {
        ((PersistentProductGroup)this.getTheObject()).setContainer(newValue);
    }
    public String getName() throws PersistenceException {
        return ((PersistentProductGroup)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentProductGroup)this.getTheObject()).setName(newValue);
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
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
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
    public void accept(ComponentContainerVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).containsCompHierarchy(part, visited);
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
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).updateObservers(event);
    }
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).addComponent(component);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnInstantiation();
    }
    public void moveTo(final ComponentContainer container) 
				throws model.InvalidMoveException, model.CycleException, PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).moveTo(container);
    }
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).newProductGroup(name);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).removeComponent(component);
    }

    
}
