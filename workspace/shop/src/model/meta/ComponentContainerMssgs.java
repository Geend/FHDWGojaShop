package model.meta;

public interface ComponentContainerMssgs {
    void accept(ComponentContainerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ComponentContainerDOWNMssgs extends Mssgs, ComponentContainerMssgs{}
interface ComponentContainerUPMssgs extends ProductGroupUPMssgs, ComponentContainerImplementationUPMssgs, ComponentManagerUPMssgs, ComponentContainerMssgs{}
