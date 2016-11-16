package model.meta;

public interface ArticleWrapperMssgs {
    void accept(ArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleWrapperDOWNMssgs extends ComponentWrapperDOWNMssgs, ArticleWrapperMssgs{}
interface ArticleWrapperUPMssgs extends OrderArticleWrapperUPMssgs, CustomerShopArticleWrapperUPMssgs, ShopArticleWrapperUPMssgs, StandardArticleWrapperUPMssgs, OwnerArticleWrapperUPMssgs, ShoppingCartArticleWrapperUPMssgs, ArticleWrapperMssgs{}
