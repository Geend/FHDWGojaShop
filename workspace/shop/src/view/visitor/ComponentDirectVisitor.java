
package view.visitor;

import view.*;

public abstract class ComponentDirectVisitor implements ComponentVisitor {
    
    public abstract void handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.handleProductGroup(rootProductGroup);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.handleProductGroup(subProductGroup);
    }
    public abstract void handleArticle(ArticleView article) throws ModelException;
    
    public abstract void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    
    
}
