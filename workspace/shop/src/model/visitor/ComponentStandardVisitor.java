
package model.visitor;

import persistence.*;

public abstract class ComponentStandardVisitor implements ComponentVisitor {
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    protected abstract void standardHandling(Component4Public component) throws PersistenceException;
}
