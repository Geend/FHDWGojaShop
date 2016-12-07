
package view.visitor;

import view.*;

public interface BackgroundTaskVisitor {
    
    public void handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException;
    public void handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException;
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException;
    
}
