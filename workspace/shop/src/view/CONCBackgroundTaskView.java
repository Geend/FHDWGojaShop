package view;

import view.visitor.*;

public interface CONCBackgroundTaskView extends BackgroundTaskView {
    
    
    public void accept(BackgroundTaskVisitor visitor) throws ModelException;
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

