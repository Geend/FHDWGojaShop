
package view.visitor;

import view.*;

public interface BackgroundTaskVisitor {
    
    public void handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException;
    public void handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException;
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException;
    
}
