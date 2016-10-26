package model.meta;

public interface NewCreatedMssgs {
    void accept(NewCreatedMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface NewCreatedDOWNMssgs extends ArticleStateDOWNMssgs, NewCreatedMssgs{}
interface NewCreatedUPMssgs extends Mssgs, NewCreatedMssgs{}
