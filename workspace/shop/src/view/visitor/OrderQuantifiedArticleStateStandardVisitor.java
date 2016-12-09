
package view.visitor;

import view.*;

public abstract class OrderQuantifiedArticleStateStandardVisitor implements OrderQuantifiedArticleStateVisitor {
    
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalStateView orderQuantifiedArticleNormalState) throws ModelException{
        this.standardHandling(orderQuantifiedArticleNormalState);
    }
    public void handleOrderQuantifiedArticlePreOrder(OrderQuantifiedArticlePreOrderView orderQuantifiedArticlePreOrder) throws ModelException{
        this.standardHandling(orderQuantifiedArticlePreOrder);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnStateView orderQuantifiedArticleMarkedForReturnState) throws ModelException{
        this.standardHandling(orderQuantifiedArticleMarkedForReturnState);
    }
    protected abstract void standardHandling(OrderQuantifiedArticleStateView orderQuantifiedArticleState) throws ModelException;
}
