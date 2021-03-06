
package view.visitor;

import view.*;

public interface BackgroundTaskReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException, E;
    public R handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException, E;
    public R handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException, E;
    
}
