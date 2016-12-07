package view;

import view.visitor.*;

public interface ProductGroupView extends ComponentContainer, ComponentView {
    
    public java.util.Vector<ComponentView> getComponents()throws ModelException;
    public void setComponents(java.util.Vector<ComponentView> newValue) throws ModelException ;
    public String getName()throws ModelException;
    public void setName(String newValue) throws ModelException ;
    
    public void accept(ComponentVisitor visitor) throws ModelException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(ComponentContainerVisitor visitor) throws ModelException;
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

