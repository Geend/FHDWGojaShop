package view;

import view.objects.*;

import view.visitor.*;

public interface OrderStateView extends Anything, AbstractViewRoot {
    
    
    public void accept(OrderStateVisitor visitor) throws ModelException;
    public <R> R accept(OrderStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

