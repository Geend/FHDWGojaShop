
package model.visitor;

import persistence.*;

public interface ComponentVisitor {
    
    public void handleArticle(PersistentArticle article) throws PersistenceException;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
