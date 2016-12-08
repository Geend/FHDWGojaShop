
package model.visitor;

import persistence.*;

public abstract class OrderQuantifiedArticleStateStandardVisitor implements OrderQuantifiedArticleStateVisitor {
    
    public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticleNormalState);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticleMarkedForReturnState);
    }
    protected abstract void standardHandling(OrderQuantifiedArticleState4Public orderQuantifiedArticleState) throws PersistenceException;
}
