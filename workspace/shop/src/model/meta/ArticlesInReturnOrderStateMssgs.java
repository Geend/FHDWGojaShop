package model.meta;

public interface ArticlesInReturnOrderStateMssgs {
    void accept(ArticlesInReturnOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticlesInReturnOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, ArticlesInReturnOrderStateMssgs{}
interface ArticlesInReturnOrderStateUPMssgs extends Mssgs, ArticlesInReturnOrderStateMssgs{}
