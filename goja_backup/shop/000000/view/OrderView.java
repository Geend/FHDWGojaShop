package view;

import view.visitor.*;

public interface OrderView extends AbstractOrderView {
    
    
    public void accept(AbstractOrderVisitor visitor) throws ModelException;
    public <R> R accept(AbstractOrderReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AbstractOrderExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AbstractOrderReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}
