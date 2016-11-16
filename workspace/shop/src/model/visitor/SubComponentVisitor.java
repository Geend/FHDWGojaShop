
package model.visitor;

import persistence.*;

public interface SubComponentVisitor {
    
    public void handleArticle(Article4Public article) throws PersistenceException;
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    
}
