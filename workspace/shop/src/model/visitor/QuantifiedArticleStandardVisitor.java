
package model.visitor;

import persistence.*;

public abstract class QuantifiedArticleStandardVisitor implements QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(reOrderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException{
        this.standardHandling(returnQuantifiedArticle);
    }
    protected abstract void standardHandling(QuantifiedArticle4Public quantifiedArticle) throws PersistenceException;
}
