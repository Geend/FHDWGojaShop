package view;

import view.objects.*;

import view.visitor.*;

public interface OrderManagerView extends Anything, AbstractViewRoot {
    
    public java.util.Vector<OrderView> getOrders()throws ModelException;
    public void setOrders(java.util.Vector<OrderView> newValue) throws ModelException ;
    
    public void accept(OrderManagerVisitor visitor) throws ModelException;
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

