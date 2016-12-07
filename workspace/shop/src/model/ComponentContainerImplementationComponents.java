
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ComponentContainerImplementationComponents extends PersistentObject implements PersistentComponentContainerImplementationComponents{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ComponentContainerImplementationComponents4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.getClass(objectId);
        return (ComponentContainerImplementationComponents4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ComponentContainerImplementationComponents4Public createComponentContainerImplementationComponents() throws PersistenceException{
        return createComponentContainerImplementationComponents(false);
    }
    
    public static ComponentContainerImplementationComponents4Public createComponentContainerImplementationComponents(boolean delayed$Persistence) throws PersistenceException {
        PersistentComponentContainerImplementationComponents result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade
                .newDelayedComponentContainerImplementationComponents();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade
                .newComponentContainerImplementationComponents(-1);
        }
        while (!(result instanceof ComponentContainerImplementationComponents)) result = (PersistentComponentContainerImplementationComponents)result.getTheObject();
        ((ComponentContainerImplementationComponents)result).setThis(result);
        return result;
    }
    
    public ComponentContainerImplementationComponents provideCopy() throws PersistenceException{
        ComponentContainerImplementationComponents result = this;
        result = new ComponentContainerImplementationComponents(this.observer, 
                                                                this.This, 
                                                                this.getId());
        result.observee = this.observee.copy(result);
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentComponentContainerImplementation observer;
    protected ComponentContainerImplementationComponents_ObserveeProxi observee;
    protected PersistentComponentContainerImplementationComponents This;
    
    public ComponentContainerImplementationComponents(PersistentComponentContainerImplementation observer,PersistentComponentContainerImplementationComponents This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = new ComponentContainerImplementationComponents_ObserveeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 396;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 396) ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade
            .newComponentContainerImplementationComponents(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.observerSet(this.getId(), getObserver());
        }
        this.getObservee().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ComponentContainerImplementation4Public getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(ComponentContainerImplementation4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentComponentContainerImplementation)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.observerSet(this.getId(), newValue);
        }
    }
    public ComponentContainerImplementationComponents_ObserveeProxi getObservee() throws PersistenceException {
        return this.observee;
    }
    protected void setThis(PersistentComponentContainerImplementationComponents newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentComponentContainerImplementationComponents)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentComponentContainerImplementationComponents getThis() throws PersistenceException {
        if(this.This == null){
            PersistentComponentContainerImplementationComponents result = (PersistentComponentContainerImplementationComponents)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentComponentContainerImplementationComponents)this.This;
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void add(final Component4Public observee) 
				throws model.CycleException, PersistenceException{
        this.getObservee().add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<Component4Public,R,E> aggregtion) 
				throws E, PersistenceException{
        return this.getObservee().aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<Component4Public,R> aggregtion) 
				throws PersistenceException{
        return this.getObservee().aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<Component4Public,E> procdure) 
				throws E, PersistenceException{
        this.getObservee().applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<Component4Public> procdure) 
				throws PersistenceException{
        this.getObservee().applyToAll(procdure);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return getThis().containsCompHierarchy(part, new java.util.HashSet<CompHierarchyHIERARCHY>());
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        if(getThis().equals(part)) return true;
		if(visited.contains(getThis())) return false;
		java.util.Iterator<Component4Public> iterator0 = getThis().getObservee().iterator();
		while(iterator0.hasNext())
			if(((CompHierarchyHIERARCHY)iterator0.next()).containsCompHierarchy(part, visited)) return true; 
		visited.add(getThis());
		return false;
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().filterException(predcate);
    }
    public void filter(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        this.getObservee().filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<Component4Public> findAllException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findAllException(predcate);
    }
    public SearchListRoot<Component4Public> findAll(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        return this.getObservee().findAll(predcate);
    }
    public <E extends model.UserException> Component4Public findFirstException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findFirstException(predcate);
    }
    public Component4Public findFirst(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        return this.getObservee().findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        		return this.getObservee().getLength();
    }
    public ComponentSearchList getList() 
				throws PersistenceException{
        return this.getObservee().getList();
    }
    public java.util.Iterator<Component4Public> iterator() 
				throws PersistenceException{
        return this.getObservee().iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstSuccess(predcate);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$observee$$ComponentContainerImplementationComponents = strategy.ComponentContainerImplementationComponents$$observee$$$initialize(getThis());
		java.util.Iterator<?> iterator$$ = getThis().getObservee().iterator();
		while (iterator$$.hasNext()){
			Component4Public current$$Field = (Component4Public)iterator$$.next();
			T current$$ = current$$Field.strategyCompHierarchy(strategy, visited);
			result$$observee$$ComponentContainerImplementationComponents = strategy.ComponentContainerImplementationComponents$$observee$$consolidate(getThis(), result$$observee$$ComponentContainerImplementationComponents, current$$);
		}
		T result = strategy.ComponentContainerImplementationComponents$$finalize(getThis() ,result$$observee$$ComponentContainerImplementationComponents);
		visited.put(getThis(),result);
		return result;
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().components_update((model.meta.ComponentMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
