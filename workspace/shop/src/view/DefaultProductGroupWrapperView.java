package view;

import view.visitor.*;

public interface DefaultProductGroupWrapperView extends ProductGroupWrapperView {
    
    public String getName()throws ModelException;
    public java.util.Vector<ComponentWrapperView> getComponents()throws ModelException;
    
    public void accept(ProductGroupWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ProductGroupWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ProductGroupWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ProductGroupWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(ComponentWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

