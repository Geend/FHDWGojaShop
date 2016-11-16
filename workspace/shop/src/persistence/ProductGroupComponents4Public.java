package persistence;


import model.visitor.*;

public interface ProductGroupComponents4Public extends PersistentListProxiInterface<ComponentWrapper4Public>, Anything, CompHierarchyHIERARCHY, ObsInterface, AbstractPersistentProxi {
    
    public ProductGroupComponents_ObserveeProxi getObservee() throws PersistenceException ;
    
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
    
    public void add(final ComponentWrapper4Public observee) 
				throws model.CycleException, PersistenceException;
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<ComponentWrapper4Public,R,E> aggregtion) 
				throws E, PersistenceException;
    public <R> R aggregate(final persistence.Aggregtion<ComponentWrapper4Public,R> aggregtion) 
				throws PersistenceException;
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<ComponentWrapper4Public,E> procdure) 
				throws E, PersistenceException;
    public void applyToAll(final persistence.Procdure<ComponentWrapper4Public> procdure) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException;
    public <E extends model.UserException> void filterException(final persistence.PredcateException<ComponentWrapper4Public,E> predcate) 
				throws E, PersistenceException;
    public void filter(final persistence.Predcate<ComponentWrapper4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> SearchListRoot<ComponentWrapper4Public> findAllException(final persistence.PredcateException<ComponentWrapper4Public,E> predcate) 
				throws E, PersistenceException;
    public SearchListRoot<ComponentWrapper4Public> findAll(final persistence.Predcate<ComponentWrapper4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> ComponentWrapper4Public findFirstException(final persistence.PredcateException<ComponentWrapper4Public,E> predcate) 
				throws E, PersistenceException;
    public ComponentWrapper4Public findFirst(final persistence.Predcate<ComponentWrapper4Public> predcate) 
				throws PersistenceException;
    public long getLength() 
				throws PersistenceException;
    public ComponentWrapperSearchList getList() 
				throws PersistenceException;
    public java.util.Iterator<ComponentWrapper4Public> iterator() 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<ComponentWrapper4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstFailure(final persistence.Predcate<ComponentWrapper4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<ComponentWrapper4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstSuccess(final persistence.Predcate<ComponentWrapper4Public> predcate) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException;
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException;

}

