package view;

import view.visitor.*;

public interface CanceledOrderStateView extends OrderStatusView {
    
    
    public void accept(OrderStatusVisitor visitor) throws ModelException;
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

