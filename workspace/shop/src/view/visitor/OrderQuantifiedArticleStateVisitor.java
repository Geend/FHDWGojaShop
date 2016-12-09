
package view.visitor;

import view.*;

public interface OrderQuantifiedArticleStateVisitor {
    
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException;
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException;
    public void handleOrderQuantifiedArticlePreOrder(OrderQuantifiedArticlePreOrderView orderQuantifiedArticlePreOrder) throws ModelException;
    
}
