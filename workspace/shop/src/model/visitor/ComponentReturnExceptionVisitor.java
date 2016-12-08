
package model.visitor;

import persistence.*;

public interface ComponentReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException, E;
    public R handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException, E;
    
}
