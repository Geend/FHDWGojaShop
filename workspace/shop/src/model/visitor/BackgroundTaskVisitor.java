
package model.visitor;

import persistence.*;

public interface BackgroundTaskVisitor {
    
    public void handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException;
    public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException;
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException;
    
}
