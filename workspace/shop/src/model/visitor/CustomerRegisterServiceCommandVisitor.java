
package model.visitor;

import persistence.*;

public interface CustomerRegisterServiceCommandVisitor {
    
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException;
    
}
