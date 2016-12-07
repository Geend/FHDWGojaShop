
package model.visitor;

import persistence.*;

public interface ComponentVisitor {
    
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
