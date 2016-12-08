
package model.visitor;

import persistence.*;

public interface OrderQuantifiedArticleStateReturnVisitor<R> {
    
    public R handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException;
    public R handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException;
    
}
