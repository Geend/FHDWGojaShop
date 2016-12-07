package view;

import view.objects.*;

import view.visitor.*;

public interface BackgroundTaskView extends Anything, AbstractViewRoot {
    
    
    public void accept(BackgroundTaskVisitor visitor) throws ModelException;
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

