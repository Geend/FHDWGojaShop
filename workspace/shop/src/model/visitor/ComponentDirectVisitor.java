
package model.visitor;

import persistence.*;

public abstract class ComponentDirectVisitor implements ComponentVisitor {
    
    public abstract void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.handleProductGroup(rootProductGroup);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.handleProductGroup(subProductGroup);
    }
    public abstract void handleArticle(Article4Public article) throws PersistenceException;
    
    
}
