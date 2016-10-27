
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException;
    
}
