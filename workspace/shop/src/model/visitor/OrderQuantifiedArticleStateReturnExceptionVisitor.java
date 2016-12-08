
package model.visitor;

import persistence.*;

public interface OrderQuantifiedArticleStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException, E;
    public R handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException, E;
    
}
