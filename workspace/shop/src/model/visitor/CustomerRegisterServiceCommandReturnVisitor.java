
package model.visitor;

import persistence.*;

public interface CustomerRegisterServiceCommandReturnVisitor<R> {
    
    public R handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    
}
