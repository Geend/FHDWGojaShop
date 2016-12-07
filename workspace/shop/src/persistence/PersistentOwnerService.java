package persistence;


public interface PersistentOwnerService extends PersistentService, OwnerService4Public {
    
    public void setShop(OwnerServiceShop4Public newValue) throws PersistenceException ;
    public Settings4Public getSettings() throws PersistenceException ;
    public void setSettings(Settings4Public newValue) throws PersistenceException ;
    public ReOrderManager4Public getReOrderManager() throws PersistenceException ;
    public void setReOrderManager(ReOrderManager4Public newValue) throws PersistenceException ;
    public OwnerOrderManager4Public getOwnerOrderManager() throws PersistenceException ;
    public void setOwnerOrderManager(OwnerOrderManager4Public newValue) throws PersistenceException ;
    public ReturnManager4Public getReturnManager() throws PersistenceException ;
    public void setReturnManager(ReturnManager4Public newValue) throws PersistenceException ;
    public PersistentOwnerService getThis() throws PersistenceException ;
    
    
    public Shop4Public getShop() 
				throws PersistenceException;
    public void setShop(final Shop4Public shop) 
				throws PersistenceException;
    public void shop_update(final model.meta.ShopMssgs event) 
				throws PersistenceException;

}

