
package model.visitor;

import persistence.*;

public interface ProductGroupVisitor {
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException;
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    
}
