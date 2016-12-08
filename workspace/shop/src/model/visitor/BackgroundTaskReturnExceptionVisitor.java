
package model.visitor;

import persistence.*;

public interface BackgroundTaskReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException, E;
    public R handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException, E;
    public R handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException, E;
    
}
