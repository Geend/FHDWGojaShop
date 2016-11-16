package view;

import view.objects.*;

import view.visitor.*;

public interface SubComponent extends AbstractViewRoot {
    public ProductGroupView getParent()throws ModelException;
    public void setParent(ProductGroupView newValue) throws ModelException ;
    
    
    public void accept(SubComponentVisitor visitor) throws ModelException;
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
}

