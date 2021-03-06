package model.meta;

public interface BackgroundTaskMssgs {
    void accept(BackgroundTaskMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface BackgroundTaskDOWNMssgs extends Mssgs, BackgroundTaskMssgs{}
interface BackgroundTaskUPMssgs extends GlobalOrderManagerUPMssgs, ReOrderManagerUPMssgs, BackgroundTaskMssgs{}
