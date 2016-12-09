
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException, E;
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException, E;
    public void handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException, E;
    public void handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException, E;
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException, E;
    
}
