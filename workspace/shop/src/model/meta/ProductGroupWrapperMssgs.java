package model.meta;

public interface ProductGroupWrapperMssgs {
    void accept(ProductGroupWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProductGroupWrapperDOWNMssgs extends ComponentWrapperDOWNMssgs, ProductGroupWrapperMssgs{}
interface ProductGroupWrapperUPMssgs extends DefaultProductGroupWrapperUPMssgs, ProductGroupWrapperMssgs{}
