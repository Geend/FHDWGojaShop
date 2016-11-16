package persistence;



import model.visitor.*;

public class DefaultProductGroupWrapperICProxi extends ProductGroupWrapperICProxi implements PersistentDefaultProductGroupWrapper{
    
    public DefaultProductGroupWrapperICProxi(long objectId) {
        super(objectId);
    }
    public DefaultProductGroupWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theDefaultProductGroupWrapperFacade
            .getDefaultProductGroupWrapper(this.getId());
    }
    
    public long getClassId() {
        return 290;
    }
    
    public PersistentDefaultProductGroupWrapper getThis() throws PersistenceException {
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).getThis();
    }
    
    public void accept(ProductGroupWrapperVisitor visitor) throws PersistenceException {
        visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R> R accept(ProductGroupWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws PersistenceException {
        visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public <E extends model.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDefaultProductGroupWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDefaultProductGroupWrapper(this);
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).register(observee);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public ComponentWrapperSearchList getComponents() 
				throws PersistenceException{
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).getComponents();
    }
    public String getName() 
				throws PersistenceException{
        return ((PersistentDefaultProductGroupWrapper)this.getTheObject()).getName();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentDefaultProductGroupWrapper)this.getTheObject()).initializeOnInstantiation();
    }

    
}
