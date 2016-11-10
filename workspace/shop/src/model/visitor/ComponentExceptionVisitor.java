
package model.visitor;

import persistence.*;

public interface ComponentExceptionVisitor<E extends model.UserException> extends ProductGroupExceptionVisitor<E>{
    
    public void handleArticle(Article4Public article) throws PersistenceException, E;
    
}
