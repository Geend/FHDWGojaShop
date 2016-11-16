
package view.visitor;

import view.*;

public interface SubComponentReturnVisitor<R> {
    
    public R handleArticle(ArticleView article) throws ModelException;
    public R handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException;
    
}
