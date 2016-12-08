
package view.visitor;

import view.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleEmptyCartException(EmptyCartException emptyCartException) throws ModelException{
        this.standardHandling(emptyCartException);
    }
    public void handleOrderNotAcceptableException(OrderNotAcceptableException orderNotAcceptableException) throws ModelException{
        this.standardHandling(orderNotAcceptableException);
    }
    public void handleNotEnoughMoneyException(NotEnoughMoneyException notEnoughMoneyException) throws ModelException{
        this.standardHandling(notEnoughMoneyException);
    }
    public void handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException{
        this.standardHandling(articleNotInSaleException);
    }
    public void handleCycleException(CycleException cycleException) throws ModelException{
        this.standardHandling(cycleException);
    }
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException{
        this.standardHandling(notEnoughStockException);
    }
    public void handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) throws ModelException{
        this.standardHandling(userAlreadyExistsException);
    }
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException{
        this.standardHandling(restrictionException);
    }
    public void handleDoubleDefinitionException(DoubleDefinitionException doubleDefinitionException) throws ModelException{
        this.standardHandling(doubleDefinitionException);
    }
    public void handleEmptyDefinitionException(EmptyDefinitionException emptyDefinitionException) throws ModelException{
        this.standardHandling(emptyDefinitionException);
    }
    protected abstract void standardHandling(UserException userException) throws ModelException;
}
