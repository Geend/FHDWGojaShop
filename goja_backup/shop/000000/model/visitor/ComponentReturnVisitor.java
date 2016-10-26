
package model.visitor;

import persistence.*;

public interface ComponentReturnVisitor<R> {
    
    public R handleArticle(PersistentArticle article) throws PersistenceException;
    public R handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
