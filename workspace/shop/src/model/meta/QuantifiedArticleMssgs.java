package model.meta;

public interface QuantifiedArticleMssgs {
    void accept(QuantifiedArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface QuantifiedArticleDOWNMssgs extends Mssgs, QuantifiedArticleMssgs{}
interface QuantifiedArticleUPMssgs extends OrderQuantifiedArticleUPMssgs, ShoppingCartQuantifiedArticleUPMssgs, QuantifiedArticleMssgs{}
