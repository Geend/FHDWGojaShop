package persistence;


import model.visitor.*;

public interface PersistentServerRootProductGroup extends Anything, ObsInterface, AbstractPersistentProxi {
    
    public PersistentServer getObserver() throws PersistenceException ;
    public void setObserver(PersistentServer newValue) throws PersistenceException ;
    public PersistentProductGroup getObservee() throws PersistenceException ;
    public void setObservee(PersistentProductGroup newValue) throws PersistenceException ;
    public PersistentServerRootProductGroup getThis() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException;

}

