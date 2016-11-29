
package model.visitor;

import persistence.*;

public abstract class CustomerRegisterService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleCustomerRegisterService(PersistentCustomerRegisterService customerRegisterService) throws PersistenceException;
    
}
