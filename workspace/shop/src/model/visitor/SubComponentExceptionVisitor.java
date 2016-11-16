
package model.visitor;

import persistence.*;

public interface SubComponentExceptionVisitor<E extends model.UserException> {
    
    public void handleArticle(Article4Public article) throws PersistenceException, E;
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException, E;
    
}
