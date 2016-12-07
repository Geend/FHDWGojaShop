
package model.visitor;

import persistence.*;

public interface BackgroundTaskExceptionVisitor<E extends model.UserException> {
    
    public void handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException, E;
    public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException, E;
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException, E;
    
}
