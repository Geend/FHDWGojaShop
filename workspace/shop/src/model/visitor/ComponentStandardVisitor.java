
package model.visitor;

import persistence.*;

public abstract class ComponentStandardVisitor implements ComponentVisitor {
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    protected abstract void standardHandling(PersistentComponent component) throws PersistenceException;
}
