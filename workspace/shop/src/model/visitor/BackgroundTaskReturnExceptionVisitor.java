
package model.visitor;

import persistence.*;

public interface BackgroundTaskReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException, E;
    public R handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException, E;
    public R handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException, E;
    
}
