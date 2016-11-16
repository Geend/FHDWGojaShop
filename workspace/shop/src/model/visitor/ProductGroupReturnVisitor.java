
package model.visitor;

import persistence.*;

public interface ProductGroupReturnVisitor<R> {
    
    public R handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException;
    public R handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    
}
