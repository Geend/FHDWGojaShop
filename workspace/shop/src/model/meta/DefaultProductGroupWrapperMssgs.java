package model.meta;

public interface DefaultProductGroupWrapperMssgs {
    void accept(DefaultProductGroupWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface DefaultProductGroupWrapperDOWNMssgs extends ProductGroupWrapperDOWNMssgs, DefaultProductGroupWrapperMssgs{}
interface DefaultProductGroupWrapperUPMssgs extends Mssgs, DefaultProductGroupWrapperMssgs{}
