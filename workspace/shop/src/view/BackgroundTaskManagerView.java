package view;

import view.objects.*;

import view.visitor.*;

public interface BackgroundTaskManagerView extends Anything, AbstractViewRoot {
    
    public java.util.Vector<BackgroundTaskView> getTasks()throws ModelException;
    public void setTasks(java.util.Vector<BackgroundTaskView> newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

