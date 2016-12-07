
package view.visitor;

import view.*;

public interface OrderQuantifiedArticleStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException, E;
    public R handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException, E;
    
}
