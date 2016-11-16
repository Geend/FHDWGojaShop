
package model.visitor;

import persistence.*;

public interface ProductGroupExceptionVisitor<E extends model.UserException> {
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException, E;
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException, E;
    
}
