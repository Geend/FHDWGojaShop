package model.meta;

public interface CustomerShopArticleWrapperMssgs {
    void accept(CustomerShopArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerShopArticleWrapperDOWNMssgs extends ArticleWrapperDOWNMssgs, CustomerShopArticleWrapperMssgs{}
interface CustomerShopArticleWrapperUPMssgs extends Mssgs, CustomerShopArticleWrapperMssgs{}
