package model.meta;

public interface ComponentManagerMssgs {
    void accept(ComponentManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ComponentManagerDOWNMssgs extends ComponentContainerDOWNMssgs, ComponentManagerMssgs{}
interface ComponentManagerUPMssgs extends Mssgs, ComponentManagerMssgs{}
