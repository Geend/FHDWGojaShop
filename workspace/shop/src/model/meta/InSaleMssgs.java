package model.meta;

public interface InSaleMssgs {
    void accept(InSaleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface InSaleDOWNMssgs extends ArticleStateDOWNMssgs, InSaleMssgs{}
interface InSaleUPMssgs extends Mssgs, InSaleMssgs{}
