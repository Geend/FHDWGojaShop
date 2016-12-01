package view;

import view.objects.*;

import view.visitor.*;

public interface OrderView extends Anything, AbstractViewRoot {
    
    public java.util.Vector<OrderQuantifiedArticleView> getArticles()throws ModelException;
    public void setArticles(java.util.Vector<OrderQuantifiedArticleView> newValue) throws ModelException ;
    public CustomerDeliveryTimeView getCustomerDeliveryTime()throws ModelException;
    public void setCustomerDeliveryTime(CustomerDeliveryTimeView newValue) throws ModelException ;
    public common.Fraction getTotalPrice()throws ModelException;
    public void setTotalPrice(common.Fraction newValue) throws ModelException ;
    public OrderStateView getState()throws ModelException;
    public void setState(OrderStateView newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

