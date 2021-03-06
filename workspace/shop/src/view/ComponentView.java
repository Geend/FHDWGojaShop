package view;

import view.objects.*;

import view.visitor.*;

public interface ComponentView extends Anything, AbstractViewRoot {
    
    public ComponentContainer getParent()throws ModelException;
    public void setParent(ComponentContainer newValue) throws ModelException ;
    
    public void accept(ComponentVisitor visitor) throws ModelException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

