package model.meta;

public interface OrderQuantifiedArticlePreOrderMssgs {
    void accept(OrderQuantifiedArticlePreOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderQuantifiedArticlePreOrderDOWNMssgs extends OrderQuantifiedArticleStateDOWNMssgs, OrderQuantifiedArticlePreOrderMssgs{}
interface OrderQuantifiedArticlePreOrderUPMssgs extends Mssgs, OrderQuantifiedArticlePreOrderMssgs{}
