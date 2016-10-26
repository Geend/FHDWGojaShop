package model.meta;

public interface ArticleWrapperMssgsVisitor extends ArticleWrapperDOWNMssgsVisitor, ArticleWrapperUPMssgsVisitor {}


interface ArticleWrapperDOWNMssgsVisitor extends OrderArticleWrapperDOWNMssgsVisitor, ShopArticleWrapperDOWNMssgsVisitor, ShoppingCartArticleWrapperDOWNMssgsVisitor {

    
}


interface ArticleWrapperUPMssgsVisitor  {

    
}
