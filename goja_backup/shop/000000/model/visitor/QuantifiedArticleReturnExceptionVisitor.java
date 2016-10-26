
package model.visitor;

import persistence.*;

public interface QuantifiedArticleReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException, E;
    public R handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException, E;
    
}
