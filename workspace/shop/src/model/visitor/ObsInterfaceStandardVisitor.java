
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleReOrderManagerReorderArticles(ReOrderManagerReorderArticles4Public reOrderManagerReorderArticles) throws PersistenceException{
        this.standardHandling(reOrderManagerReorderArticles);
    }
    public void handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException{
        this.standardHandling(ownerServiceReOrderManager);
    }
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException{
        this.standardHandling(customerServiceOrderManager);
    }
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException{
        this.standardHandling(ownerServiceShop);
    }
    public void handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException{
        this.standardHandling(ownerServiceOrderManager);
    }
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException{
        this.standardHandling(customerServiceShop);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
