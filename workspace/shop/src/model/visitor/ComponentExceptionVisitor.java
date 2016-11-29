
package model.visitor;

import persistence.*;

public interface ComponentExceptionVisitor<E extends model.UserException> extends ProductGroupExceptionVisitor<E>{
    
    public void handleArticle(Article4Public article) throws PersistenceException, E;
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException, E;
    
}
