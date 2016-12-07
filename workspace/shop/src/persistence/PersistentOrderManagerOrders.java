package persistence;


public interface PersistentOrderManagerOrders extends Anything, PersistentListProxiInterface<Order4Public>, ObsInterface, AbstractPersistentProxi, OrderManagerOrders4Public {
    
    public OrderManager4Public getObserver() throws PersistenceException ;
    public void setObserver(OrderManager4Public newValue) throws PersistenceException ;
    public PersistentOrderManagerOrders getThis() throws PersistenceException ;
    
    

}

