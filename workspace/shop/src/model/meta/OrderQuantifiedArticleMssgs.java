package model.meta;

public interface OrderQuantifiedArticleMssgs {
    void accept(OrderQuantifiedArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderQuantifiedArticleDOWNMssgs extends QuantifiedArticleDOWNMssgs, OrderQuantifiedArticleMssgs{}
interface OrderQuantifiedArticleUPMssgs extends Mssgs, OrderQuantifiedArticleMssgs{}
