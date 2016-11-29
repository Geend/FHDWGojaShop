package view;

import view.visitor.*;

public interface ProductGroupView extends ComponentView {
    
    public java.util.Vector<ComponentView> getComponents()throws ModelException;
    public void setComponents(java.util.Vector<ComponentView> newValue) throws ModelException ;
    
    public void accept(ProductGroupVisitor visitor) throws ModelException;
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

