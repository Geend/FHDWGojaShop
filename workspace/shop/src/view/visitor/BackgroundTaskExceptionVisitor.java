
package view.visitor;

import view.*;

public interface BackgroundTaskExceptionVisitor<E extends view.UserException> {
    
    public void handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException, E;
    public void handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException, E;
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException, E;
    
}
