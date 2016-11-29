
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
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException{
        this.standardHandling(productGroupComponents);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    protected abstract void standardHandling(CompHierarchyHIERARCHY compHierarchyHIERARCHY) throws PersistenceException;
}
