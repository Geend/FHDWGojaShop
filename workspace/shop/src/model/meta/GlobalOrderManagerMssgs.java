package model.meta;

public interface GlobalOrderManagerMssgs {
    void accept(GlobalOrderManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface GlobalOrderManagerDOWNMssgs extends OrderManagerDOWNMssgs, BackgroundTaskDOWNMssgs, GlobalOrderManagerMssgs{}
interface GlobalOrderManagerUPMssgs extends Mssgs, GlobalOrderManagerMssgs{}
