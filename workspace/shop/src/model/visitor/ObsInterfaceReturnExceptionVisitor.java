
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException, E;
    
}
