
package view.visitor;

import view.*;

public abstract class UserExceptionDirectVisitor implements UserExceptionVisitor {
    
    public abstract void handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException;
    
    public abstract void handleInvalidInputException(InvalidInputException invalidInputException) throws ModelException;
    
    public abstract void handleOrderNotAcceptableException(OrderNotAcceptableException orderNotAcceptableException) throws ModelException;
    
    public abstract void handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException;
    
    public abstract void handleCycleException(CycleException cycleException) throws ModelException;
    
    public abstract void handleArticleOrderException(ArticleOrderException articleOrderException) throws ModelException;
    
    public void handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException{
        this.handleArticleOrderException(articleNotInSaleException);
    }
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException{
        this.handleArticleOrderException(notEnoughStockException);
    }
    public abstract void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException;
    
    public abstract void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException;
    
    public abstract void handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    
    public abstract void handleEmptyDefinitionException(EmptyDefinitionException emptyDefinitionException) throws ModelException;
    
    
}
