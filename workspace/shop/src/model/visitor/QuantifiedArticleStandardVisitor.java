
package model.visitor;

import persistence.*;

public abstract class QuantifiedArticleStandardVisitor implements QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    protected abstract void standardHandling(QuantifiedArticle4Public quantifiedArticle) throws PersistenceException;
}
