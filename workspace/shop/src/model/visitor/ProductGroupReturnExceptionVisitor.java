
package model.visitor;

import persistence.*;

public interface ProductGroupReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException, E;
    public R handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException, E;
    
}
