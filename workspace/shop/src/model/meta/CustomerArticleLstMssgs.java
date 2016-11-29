package model.meta;

public interface CustomerArticleLstMssgs {
    void accept(CustomerArticleLstMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerArticleLstDOWNMssgs extends Mssgs, CustomerArticleLstMssgs{}
interface CustomerArticleLstUPMssgs extends Mssgs, CustomerArticleLstMssgs{}
