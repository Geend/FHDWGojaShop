package model.meta;

public interface ShoppingCartQuantifiedArticleMssgs {
    void accept(ShoppingCartQuantifiedArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShoppingCartQuantifiedArticleDOWNMssgs extends QuantifiedArticleDOWNMssgs, ShoppingCartQuantifiedArticleMssgs{}
interface ShoppingCartQuantifiedArticleUPMssgs extends Mssgs, ShoppingCartQuantifiedArticleMssgs{}
