
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException, E;
    
}
