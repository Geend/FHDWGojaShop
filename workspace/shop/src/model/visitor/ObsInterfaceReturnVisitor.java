
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnVisitor<R> {
    
    public R handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException;
    
}
