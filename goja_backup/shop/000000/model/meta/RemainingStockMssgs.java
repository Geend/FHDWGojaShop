package model.meta;

public interface RemainingStockMssgs {
    void accept(RemainingStockMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface RemainingStockDOWNMssgs extends ArticleStateDOWNMssgs, RemainingStockMssgs{}
interface RemainingStockUPMssgs extends Mssgs, RemainingStockMssgs{}
