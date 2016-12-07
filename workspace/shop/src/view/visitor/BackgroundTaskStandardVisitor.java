
package view.visitor;

import view.*;

public abstract class BackgroundTaskStandardVisitor implements BackgroundTaskVisitor {
    
    public void handleCONCBackgroundTask(CONCBackgroundTaskView cONCBackgroundTask) throws ModelException{
        this.standardHandling(cONCBackgroundTask);
    }
    public void handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException{
        this.standardHandling(ownerOrderManager);
    }
    public void handleReOrderManager(ReOrderManagerView reOrderManager) throws ModelException{
        this.standardHandling(reOrderManager);
    }
    protected abstract void standardHandling(BackgroundTaskView backgroundTask) throws ModelException;
}
