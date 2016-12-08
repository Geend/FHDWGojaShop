
package view.visitor;

import view.*;

public interface OrderQuantifiedArticleStateReturnVisitor<R> {
    
    public R handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException;
    public R handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException;
    
}
