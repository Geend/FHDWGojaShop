
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYStandardVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException{
        this.standardHandling(componentManager);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException{
        this.standardHandling(componentContainerImplementation);
    }
    protected abstract void standardHandling(CompHierarchyHIERARCHY compHierarchyHIERARCHY) throws PersistenceException;
}
