package model.meta;

public interface ReOrderQuantifiedArticleMssgs {
    void accept(ReOrderQuantifiedArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ReOrderQuantifiedArticleDOWNMssgs extends QuantifiedArticleDOWNMssgs, ReOrderQuantifiedArticleMssgs{}
interface ReOrderQuantifiedArticleUPMssgs extends Mssgs, ReOrderQuantifiedArticleMssgs{}
