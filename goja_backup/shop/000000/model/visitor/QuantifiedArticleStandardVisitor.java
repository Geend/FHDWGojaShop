
package model.visitor;

import persistence.*;

public abstract class QuantifiedArticleStandardVisitor implements QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    protected abstract void standardHandling(PersistentQuantifiedArticle quantifiedArticle) throws PersistenceException;
}
