package view;

import view.objects.*;

import view.visitor.*;

public interface ComponentContainer extends AbstractViewRoot {
    
    
    public void accept(ComponentContainerVisitor visitor) throws ModelException;
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
}

