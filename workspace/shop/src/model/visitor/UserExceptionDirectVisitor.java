
package model.visitor;

import persistence.*;

public abstract class UserExceptionDirectVisitor implements UserExceptionVisitor {
    
    public abstract void handleEmptyCartException(model.EmptyCartException emptyCartException) throws PersistenceException;
    
    public abstract void handleOrderNotAcceptableException(model.OrderNotAcceptableException orderNotAcceptableException) throws PersistenceException;
    
    public abstract void handleNotEnoughMoneyException(model.NotEnoughMoneyException notEnoughMoneyException) throws PersistenceException;
    
    public abstract void handleCycleException(model.CycleException cycleException) throws PersistenceException;
    
    public abstract void handleArticleOrderException(model.ArticleOrderException articleOrderException) throws PersistenceException;
    
    public void handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException{
        this.handleArticleOrderException(articleNotInSaleException);
    }
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException{
        this.handleArticleOrderException(notEnoughStockException);
    }
    public abstract void handleUserAlreadyExistsException(model.UserAlreadyExistsException userAlreadyExistsException) throws PersistenceException;
    
    public abstract void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    
    public abstract void handleDoubleDefinitionException(model.DoubleDefinitionException doubleDefinitionException) throws PersistenceException;
    
    public abstract void handleEmptyDefinitionException(model.EmptyDefinitionException emptyDefinitionException) throws PersistenceException;
    
    
}
