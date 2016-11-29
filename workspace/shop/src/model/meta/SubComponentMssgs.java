package model.meta;

public interface SubComponentMssgs {
    void accept(SubComponentMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface SubComponentDOWNMssgs extends Mssgs, SubComponentMssgs{}
interface SubComponentUPMssgs extends SubProductGroupUPMssgs, ArticleWrapperUPMssgs, SubComponentMssgs{}
