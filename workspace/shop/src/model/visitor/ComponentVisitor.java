
package model.visitor;

import persistence.*;

public interface ComponentVisitor extends ProductGroupVisitor{
    
    public void handleArticle(Article4Public article) throws PersistenceException;
    
}
