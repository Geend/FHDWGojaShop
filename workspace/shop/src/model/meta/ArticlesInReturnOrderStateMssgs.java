package model.meta;

public interface ArticlesInReturnOrderStateMssgs {
    void accept(ArticlesInReturnOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticlesInReturnOrderStateDOWNMssgs extends OrderStateDOWNMssgs, ArticlesInReturnOrderStateMssgs{}
interface ArticlesInReturnOrderStateUPMssgs extends Mssgs, ArticlesInReturnOrderStateMssgs{}
