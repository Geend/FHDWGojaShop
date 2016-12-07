
package model.visitor;

import persistence.*;

public abstract class BackgroundTaskStandardVisitor implements BackgroundTaskVisitor {
    
    public void handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException{
        this.standardHandling(cONCBackgroundTask);
    }
    public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException{
        this.standardHandling(ownerOrderManager);
    }
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException{
        this.standardHandling(reOrderManager);
    }
    protected abstract void standardHandling(BackgroundTask4Public backgroundTask) throws PersistenceException;
}
