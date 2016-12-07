package persistence;



import model.visitor.*;

public class CustomerServiceShopICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerServiceShop{
    
    public CustomerServiceShopICProxi(long objectId) {
        super(objectId);
    }
    public CustomerServiceShopICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade
            .getCustomerServiceShop(this.getId());
    }
    
    public long getClassId() {
        return 407;
    }
    
    public CustomerService4Public getObserver() throws PersistenceException {
        return ((PersistentCustomerServiceShop)this.getTheObject()).getObserver();
    }
    public void setObserver(CustomerService4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceShop)this.getTheObject()).setObserver(newValue);
    }
    public Shop4Public getObservee() throws PersistenceException {
        return ((PersistentCustomerServiceShop)this.getTheObject()).getObservee();
    }
    public void setObservee(Shop4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceShop)this.getTheObject()).setObservee(newValue);
    }
    public PersistentCustomerServiceShop getThis() throws PersistenceException {
        return ((PersistentCustomerServiceShop)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceShop(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceShop(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceShop(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerServiceShop)this.getTheObject()).update(event);
    }

    
}
