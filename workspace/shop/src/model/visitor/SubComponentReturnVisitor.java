
package model.visitor;

import persistence.*;

public interface SubComponentReturnVisitor<R> {
    
    public R handleArticle(Article4Public article) throws PersistenceException;
    public R handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    
}
