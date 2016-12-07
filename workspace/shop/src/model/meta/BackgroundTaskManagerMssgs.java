package model.meta;

public interface BackgroundTaskManagerMssgs {
    void accept(BackgroundTaskManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface BackgroundTaskManagerDOWNMssgs extends Mssgs, BackgroundTaskManagerMssgs{}
interface BackgroundTaskManagerUPMssgs extends Mssgs, BackgroundTaskManagerMssgs{}
