
package model.visitor;

import persistence.*;

public interface ComponentReturnVisitor<R> {
    
    public R handleArticle(Article4Public article) throws PersistenceException;
    public R handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
