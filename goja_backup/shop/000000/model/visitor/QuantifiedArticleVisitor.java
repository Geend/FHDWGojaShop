
package model.visitor;

import persistence.*;

public interface QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException;
    public void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException;
    
}
