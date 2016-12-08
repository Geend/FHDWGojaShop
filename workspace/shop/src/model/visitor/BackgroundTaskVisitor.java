
package model.visitor;

import persistence.*;

public interface BackgroundTaskVisitor {
    
    public void handleCONCBackgroundTask(CONCBackgroundTask4Public cONCBackgroundTask) throws PersistenceException;
    public void handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException;
    public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException;
    
}
