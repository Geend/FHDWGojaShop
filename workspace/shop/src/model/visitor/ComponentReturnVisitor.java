
package model.visitor;

import persistence.*;

public interface ComponentReturnVisitor<R> extends ProductGroupReturnVisitor<R> {
    
    public R handleArticle(Article4Public article) throws PersistenceException;
    public R handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    
}
