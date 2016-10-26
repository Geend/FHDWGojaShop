package model.meta;

public interface ShopArticleWrapperMssgs {
    void accept(ShopArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopArticleWrapperDOWNMssgs extends ArticleWrapperDOWNMssgs, ShopArticleWrapperMssgs{}
interface ShopArticleWrapperUPMssgs extends Mssgs, ShopArticleWrapperMssgs{}
