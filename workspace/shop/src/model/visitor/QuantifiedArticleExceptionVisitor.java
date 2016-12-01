
package model.visitor;

import persistence.*;

public interface QuantifiedArticleExceptionVisitor<E extends model.UserException> {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException, E;
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException, E;
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException, E;
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException, E;
    
}
