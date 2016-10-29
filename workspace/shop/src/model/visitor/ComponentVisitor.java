
package model.visitor;

import persistence.*;

public interface ComponentVisitor {
    
    public void handleArticle(Article4Public article) throws PersistenceException;
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
