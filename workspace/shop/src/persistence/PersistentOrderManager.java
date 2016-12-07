package persistence;


public interface PersistentOrderManager extends Anything, SubjInterface, AbstractPersistentProxi, OrderManager4Public {
    
    public void setOrders(OrderManagerOrders4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentOrderManager getThis() throws PersistenceException ;
    
    
    public void orders_update(final model.meta.OrderMssgs event) 
				throws PersistenceException;

}

