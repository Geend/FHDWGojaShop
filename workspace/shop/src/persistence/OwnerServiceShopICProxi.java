package persistence;



import model.visitor.*;

public class OwnerServiceShopICProxi extends PersistentInCacheProxiOptimistic implements PersistentOwnerServiceShop{
    
    public OwnerServiceShopICProxi(long objectId) {
        super(objectId);
    }
    public OwnerServiceShopICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade
            .getOwnerServiceShop(this.getId());
    }
    
    public long getClassId() {
        return 426;
    }
    
    public OwnerService4Public getObserver() throws PersistenceException {
        return ((PersistentOwnerServiceShop)this.getTheObject()).getObserver();
    }
    public void setObserver(OwnerService4Public newValue) throws PersistenceException {
        ((PersistentOwnerServiceShop)this.getTheObject()).setObserver(newValue);
    }
    public Shop4Public getObservee() throws PersistenceException {
        return ((PersistentOwnerServiceShop)this.getTheObject()).getObservee();
    }
    public void setObservee(Shop4Public newValue) throws PersistenceException {
        ((PersistentOwnerServiceShop)this.getTheObject()).setObservee(newValue);
    }
    public PersistentOwnerServiceShop getThis() throws PersistenceException {
        return ((PersistentOwnerServiceShop)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceShop(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceShop(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceShop(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOwnerServiceShop)this.getTheObject()).update(event);
    }

    
}
