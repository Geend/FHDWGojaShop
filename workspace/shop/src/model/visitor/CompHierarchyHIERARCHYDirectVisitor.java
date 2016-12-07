
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYDirectVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public abstract void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    
    public abstract void handleComponent(Component4Public component) throws PersistenceException;
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.handleComponent(productGroup);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.handleComponent(articleWrapper);
    }
    
}
