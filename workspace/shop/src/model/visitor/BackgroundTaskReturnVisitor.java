
package model.visitor;

import persistence.*;

public interface BackgroundTaskReturnVisitor<R> {
    
    public R handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException;
    public R handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException;
    public R handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException;
    
}
