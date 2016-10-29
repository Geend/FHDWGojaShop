
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYStandardVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    protected abstract void standardHandling(CompHierarchyHIERARCHY compHierarchyHIERARCHY) throws PersistenceException;
}
