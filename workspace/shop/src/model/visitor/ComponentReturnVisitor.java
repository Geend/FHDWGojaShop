
package model.visitor;

import persistence.*;

public interface ComponentReturnVisitor<R> extends ProductGroupReturnVisitor<R> {
    
    public R handleArticle(Article4Public article) throws PersistenceException;
    
}
