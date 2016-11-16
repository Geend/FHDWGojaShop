
package view.visitor;

import view.*;

public interface SubComponentVisitor {
    
    public void handleArticle(ArticleView article) throws ModelException;
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException;
    
}
