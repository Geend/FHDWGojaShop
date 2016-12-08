package view;

import view.objects.*;

import view.visitor.*;

public interface OrderStatusView extends Anything, AbstractViewRoot {
    
    
    public void accept(OrderStatusVisitor visitor) throws ModelException;
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

