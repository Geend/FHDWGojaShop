
package view.visitor;

import view.*;

public interface BackgroundTaskReturnVisitor<R> {
    
    public R handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException;
    public R handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException;
    public R handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException;
    
}
