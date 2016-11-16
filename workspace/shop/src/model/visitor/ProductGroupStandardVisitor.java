
package model.visitor;

import persistence.*;

public abstract class ProductGroupStandardVisitor implements ProductGroupVisitor {
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.standardHandling(rootProductGroup);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
    }
    protected abstract void standardHandling(ProductGroup4Public productGroup) throws PersistenceException;
}
