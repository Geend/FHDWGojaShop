
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException, E;
    public R handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException, E;
    public R handleOwnerServiceOrderManager(OwnerServiceOrderManager4Public ownerServiceOrderManager) throws PersistenceException, E;
    public R handleOwnerServiceReOrderManager(OwnerServiceReOrderManager4Public ownerServiceReOrderManager) throws PersistenceException, E;
    public R handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException, E;
    
}
