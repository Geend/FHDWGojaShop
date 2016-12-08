
package model.visitor;

import persistence.*;

public abstract class ComponentStandardVisitor implements ComponentVisitor {
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    protected abstract void standardHandling(Component4Public component) throws PersistenceException;
}
