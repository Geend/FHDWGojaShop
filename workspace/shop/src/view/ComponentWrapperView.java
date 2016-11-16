package view;

import view.objects.*;

import view.visitor.*;

public interface ComponentWrapperView extends Anything, AbstractViewRoot {
    
    
    public void accept(ComponentWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

