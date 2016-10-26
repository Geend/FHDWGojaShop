
package model.visitor;

import persistence.*;

public interface QuantifiedArticleExceptionVisitor<E extends model.UserException> {
    
    public void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException, E;
    public void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException, E;
    
}
