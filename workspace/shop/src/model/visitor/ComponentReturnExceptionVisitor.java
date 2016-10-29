
package model.visitor;

import persistence.*;

public interface ComponentReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticle(Article4Public article) throws PersistenceException, E;
    public R handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException, E;
    
}
