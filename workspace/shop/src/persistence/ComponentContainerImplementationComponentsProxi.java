package persistence;



import model.visitor.*;

public class ComponentContainerImplementationComponentsProxi extends PersistentProxi implements PersistentComponentContainerImplementationComponents{
    
    public ComponentContainerImplementationComponentsProxi(long objectId) {
        super(objectId);
    }
    public ComponentContainerImplementationComponentsProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 396;
    }
    
    public ComponentContainerImplementation4Public getObserver() throws PersistenceException {
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).getObserver();
    }
    public void setObserver(ComponentContainerImplementation4Public newValue) throws PersistenceException {
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).setObserver(newValue);
    }
    public ComponentContainerImplementationComponents_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).getObservee();
    }
    public PersistentComponentContainerImplementationComponents getThis() throws PersistenceException {
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementationComponents(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementationComponents(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementationComponents(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementationComponents(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementationComponents(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementationComponents(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementationComponents(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementationComponents(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementationComponents(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementationComponents(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementationComponents(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementationComponents(this);
    }
    
    
    public void add(final Component4Public observee) 
				throws model.CycleException, PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<Component4Public,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<Component4Public,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<Component4Public,E> procdure) 
				throws E, PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<Component4Public> procdure) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).applyToAll(procdure);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<Component4Public> findAllException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<Component4Public> findAll(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> Component4Public findFirstException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).findFirstException(predcate);
    }
    public Component4Public findFirst(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).getLength();
    }
    public ComponentSearchList getList() 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).getList();
    }
    public java.util.Iterator<Component4Public> iterator() 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentComponentContainerImplementationComponents)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentComponentContainerImplementationComponents)this.getTheObject()).update(event);
    }

    
}
