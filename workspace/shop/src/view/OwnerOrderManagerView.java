package view;

import view.visitor.*;

public interface OwnerOrderManagerView extends OrderManagerView {
    
    
    public void accept(OrderManagerVisitor visitor) throws ModelException;
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

