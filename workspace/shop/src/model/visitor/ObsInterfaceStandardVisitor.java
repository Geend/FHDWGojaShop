
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException{
        this.standardHandling(serverRootProductGroup);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
