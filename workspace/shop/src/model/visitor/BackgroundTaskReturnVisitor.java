
package model.visitor;

import persistence.*;

public interface BackgroundTaskReturnVisitor<R> {
    
    public R handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException;
    public R handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException;
    public R handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException;
    
}
