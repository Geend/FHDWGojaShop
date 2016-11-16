package model.meta;

public interface ArticleWrapperMssgsVisitor extends ArticleWrapperDOWNMssgsVisitor, ArticleWrapperUPMssgsVisitor {}


interface ArticleWrapperDOWNMssgsVisitor extends OrderArticleWrapperDOWNMssgsVisitor, CustomerShopArticleWrapperDOWNMssgsVisitor, ShopArticleWrapperDOWNMssgsVisitor, StandardArticleWrapperDOWNMssgsVisitor, OwnerArticleWrapperDOWNMssgsVisitor, ShoppingCartArticleWrapperDOWNMssgsVisitor {

    
}


interface ArticleWrapperUPMssgsVisitor extends ComponentWrapperUPMssgsVisitor {

    
}
