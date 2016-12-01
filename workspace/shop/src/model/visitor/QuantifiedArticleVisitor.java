
package model.visitor;

import persistence.*;

public interface QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException;
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException;
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException;
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException;
    
}
