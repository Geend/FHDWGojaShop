
package view.visitor;

import view.*;

public interface OrderQuantifiedArticleStateExceptionVisitor<E extends view.UserException> {
    
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException, E;
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException, E;
    
}
