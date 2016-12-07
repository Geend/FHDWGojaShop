package persistence;


import model.visitor.*;

public interface ComponentContainerImplementationComponents4Public extends Anything, CompHierarchyHIERARCHY, ObsInterface, PersistentListProxiInterface<Component4Public>, AbstractPersistentProxi {
    
    public ComponentContainerImplementationComponents_ObserveeProxi getObservee() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException;
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void add(final Component4Public observee) 
				throws model.CycleException, PersistenceException;
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<Component4Public,R,E> aggregtion) 
				throws E, PersistenceException;
    public <R> R aggregate(final persistence.Aggregtion<Component4Public,R> aggregtion) 
				throws PersistenceException;
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<Component4Public,E> procdure) 
				throws E, PersistenceException;
    public void applyToAll(final persistence.Procdure<Component4Public> procdure) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException;
    public <E extends model.UserException> void filterException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException;
    public void filter(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> SearchListRoot<Component4Public> findAllException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException;
    public SearchListRoot<Component4Public> findAll(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> Component4Public findFirstException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException;
    public Component4Public findFirst(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException;
    public long getLength() 
				throws PersistenceException;
    public ComponentSearchList getList() 
				throws PersistenceException;
    public java.util.Iterator<Component4Public> iterator() 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstFailure(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<Component4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstSuccess(final persistence.Predcate<Component4Public> predcate) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException;
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException;

}

