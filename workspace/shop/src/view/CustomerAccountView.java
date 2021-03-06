package view;

import view.objects.*;

import view.visitor.*;

public interface CustomerAccountView extends Anything, AbstractViewRoot {
    
    public String getName()throws ModelException;
    public void setName(String newValue) throws ModelException ;
    public common.Fraction getBalance()throws ModelException;
    public void setBalance(common.Fraction newValue) throws ModelException ;
    public common.Fraction getLimit()throws ModelException;
    public void setLimit(common.Fraction newValue) throws ModelException ;
    public ShoppingCartView getShoppingCart()throws ModelException;
    public void setShoppingCart(ShoppingCartView newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

