
package model.visitor;

import persistence.*;

public interface ComponentReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticle(PersistentArticle article) throws PersistenceException, E;
    public R handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException, E;
    
}
