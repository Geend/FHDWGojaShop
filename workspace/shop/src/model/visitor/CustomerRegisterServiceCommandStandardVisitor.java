
package model.visitor;

import persistence.*;

public abstract class CustomerRegisterServiceCommandStandardVisitor implements CustomerRegisterServiceCommandVisitor {
    
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException{
        this.standardHandling(registerCommand);
    }
    protected abstract void standardHandling(CustomerRegisterServiceCommand customerRegisterServiceCommand) throws PersistenceException;
}
