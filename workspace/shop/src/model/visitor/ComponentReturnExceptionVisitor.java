
package model.visitor;

import persistence.*;

public interface ComponentReturnExceptionVisitor<R, E extends model.UserException> extends ProductGroupReturnExceptionVisitor<R, E> {
    
    public R handleArticle(Article4Public article) throws PersistenceException, E;
    public R handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException, E;
    
}
