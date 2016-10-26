
package model.visitor;

import persistence.*;

public interface QuantifiedArticleReturnVisitor<R> {
    
    public R handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException;
    public R handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException;
    
}
