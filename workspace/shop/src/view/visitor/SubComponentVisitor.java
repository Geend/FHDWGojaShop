
package view.visitor;

import view.*;

public interface SubComponentVisitor {
    
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException;
    
}
