package model.meta;

public interface ArticleStateMssgs {
    void accept(ArticleStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleStateDOWNMssgs extends Mssgs, ArticleStateMssgs{}
interface ArticleStateUPMssgs extends RemainingStockUPMssgs, NotInSaleUPMssgs, NewCreatedUPMssgs, InSaleUPMssgs, ArticleStateMssgs{}
