
package model.visitor;

import persistence.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException{
        this.standardHandling(emptyCartException);
    }
    public void handleOrderNotAcceptableException(model.OrderNotAcceptableException orderNotAcceptableException) throws PersistenceException{
        this.standardHandling(orderNotAcceptableException);
    }
    public void handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException{
        this.standardHandling(notEnoughMoneyException);
    }
    public void handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException{
        this.standardHandling(articleNotInSaleException);
    }
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException{
        this.standardHandling(cycleException);
    }
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException{
        this.standardHandling(notEnoughStockException);
    }
    public void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException{
        this.standardHandling(userAlreadyExistsException);
    }
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException{
        this.standardHandling(restrictionException);
    }
    public void handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException{
        this.standardHandling(doubleDefinitionException);
    }
    protected abstract void standardHandling(model.UserException userException) throws PersistenceException;
}
