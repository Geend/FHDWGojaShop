package model.meta;

public interface NotInSaleMssgs {
    void accept(NotInSaleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface NotInSaleDOWNMssgs extends ArticleStateDOWNMssgs, NotInSaleMssgs{}
interface NotInSaleUPMssgs extends Mssgs, NotInSaleMssgs{}
