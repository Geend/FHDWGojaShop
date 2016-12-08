package model.meta;

public interface ReturnQuantifiedArticleMssgs {
    void accept(ReturnQuantifiedArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ReturnQuantifiedArticleDOWNMssgs extends QuantifiedArticleDOWNMssgs, ReturnQuantifiedArticleMssgs{}
interface ReturnQuantifiedArticleUPMssgs extends Mssgs, ReturnQuantifiedArticleMssgs{}
