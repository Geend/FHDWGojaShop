package model.meta;

public interface ShoppingCartArticleWrapperMssgs {
    void accept(ShoppingCartArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShoppingCartArticleWrapperDOWNMssgs extends ArticleWrapperDOWNMssgs, ShoppingCartArticleWrapperMssgs{}
interface ShoppingCartArticleWrapperUPMssgs extends Mssgs, ShoppingCartArticleWrapperMssgs{}
