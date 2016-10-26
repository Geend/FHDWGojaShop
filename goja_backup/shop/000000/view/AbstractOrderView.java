package view;

import view.objects.*;

import view.visitor.*;

public interface AbstractOrderView extends Anything, AbstractViewRoot {
    
    public OrderQuantifiedArticleView getArticles()throws ModelException;
    public void setArticles(OrderQuantifiedArticleView newValue) throws ModelException ;
    public CustomerDeliveryTimeView getCustomerDeliveryTime()throws ModelException;
    public void setCustomerDeliveryTime(CustomerDeliveryTimeView newValue) throws ModelException ;
    
    public void accept(AbstractOrderVisitor visitor) throws ModelException;
    public <R> R accept(AbstractOrderReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AbstractOrderExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AbstractOrderReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

