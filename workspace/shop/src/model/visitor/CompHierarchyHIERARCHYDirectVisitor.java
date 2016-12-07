
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYDirectVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public abstract void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
    public abstract void handleComponent(Component4Public component) throws PersistenceException;
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.handleComponent(productGroup);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.handleComponent(articleWrapper);
    }
    public abstract void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    
    public abstract void handleComponentContainerImplementationComponents(ComponentContainerImplementationComponents4Public componentContainerImplementationComponents) throws PersistenceException;
    
    
}
