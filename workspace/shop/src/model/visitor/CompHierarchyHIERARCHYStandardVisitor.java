
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYStandardVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.standardHandling(rootProductGroup);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
    }
    protected abstract void standardHandling(CompHierarchyHIERARCHY compHierarchyHIERARCHY) throws PersistenceException;
}
