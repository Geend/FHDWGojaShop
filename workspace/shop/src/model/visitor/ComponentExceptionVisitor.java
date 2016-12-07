
package model.visitor;

import persistence.*;

public interface ComponentExceptionVisitor<E extends model.UserException> {
    
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException, E;
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException, E;
    
}
