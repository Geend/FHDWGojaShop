
package model.visitor;

import persistence.*;

public interface ComponentReturnVisitor<R> {
    
    public R handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    public R handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
