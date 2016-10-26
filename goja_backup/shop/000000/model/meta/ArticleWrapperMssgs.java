package model.meta;

public interface ArticleWrapperMssgs {
    void accept(ArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleWrapperDOWNMssgs extends Mssgs, ArticleWrapperMssgs{}
interface ArticleWrapperUPMssgs extends OrderArticleWrapperUPMssgs, ShopArticleWrapperUPMssgs, ShoppingCartArticleWrapperUPMssgs, ArticleWrapperMssgs{}
