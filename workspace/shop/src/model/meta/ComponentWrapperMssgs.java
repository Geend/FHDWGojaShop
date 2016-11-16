package model.meta;

public interface ComponentWrapperMssgs {
    void accept(ComponentWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ComponentWrapperDOWNMssgs extends Mssgs, ComponentWrapperMssgs{}
interface ComponentWrapperUPMssgs extends ProductGroupWrapperUPMssgs, ArticleWrapperUPMssgs, ComponentWrapperMssgs{}
