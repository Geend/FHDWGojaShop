package view;

import view.visitor.*;

public interface ProductGroupWrapperView extends ComponentWrapperView {
    
    
    public void accept(ProductGroupWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ProductGroupWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ProductGroupWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ProductGroupWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

