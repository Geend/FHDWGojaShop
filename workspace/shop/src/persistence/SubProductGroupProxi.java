package persistence;



import model.visitor.*;

public class SubProductGroupProxi extends ProductGroupProxi implements PersistentSubProductGroup{
    
    public SubProductGroupProxi(long objectId) {
        super(objectId);
    }
    public SubProductGroupProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 214;
    }
    
    public ProductGroup4Public getParent() throws PersistenceException {
        return ((PersistentSubProductGroup)this.getTheObject()).getParent();
    }
    public void setParent(ProductGroup4Public newValue) throws PersistenceException {
        ((PersistentSubProductGroup)this.getTheObject()).setParent(newValue);
    }
    public PersistentSubProductGroup getThis() throws PersistenceException {
        return ((PersistentSubProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(ProductGroupVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(SubComponentVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).addComponent(component);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentSubProductGroup)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentSubProductGroup)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).deregister(observee);
    }
    public ProductGroupComponents4Public getComponents() 
				throws PersistenceException{
        return ((PersistentSubProductGroup)this.getTheObject()).getComponents();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).moveTo(productGroup);
    }
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).moveTo(productGroup, invoker);
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public void newSubProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).newSubProductGroup(name);
    }
    public void newSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).newSubProductGroup(name, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).register(observee);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).removeComponent(component);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentSubProductGroup)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentSubProductGroup)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).updateObservers(event);
    }
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).addComponentImplementation(component);
    }
    public void components_update(final model.meta.ComponentMssgs event) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).components_update(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).initializeOnInstantiation();
    }
    public void moveToImplementation(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).moveToImplementation(productGroup);
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newSubProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).newSubProductGroupImplementation(name);
    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        ((PersistentSubProductGroup)this.getTheObject()).removeComponentImplementation(component);
    }

    
}
