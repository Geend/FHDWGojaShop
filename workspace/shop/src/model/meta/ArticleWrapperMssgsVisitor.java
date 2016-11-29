package model.meta;

public interface ArticleWrapperMssgsVisitor extends ArticleWrapperDOWNMssgsVisitor, ArticleWrapperUPMssgsVisitor {}


interface ArticleWrapperDOWNMssgsVisitor  {

    public void handleArticleWrapperChangeArticleNameStringMssg(ArticleWrapperChangeArticleNameStringMssg event) throws persistence.PersistenceException;
    
}


interface ArticleWrapperUPMssgsVisitor extends ComponentUPMssgsVisitor, SubComponentUPMssgsVisitor {

    public void handleArticleWrapperChangeArticleNameStringMssg(ArticleWrapperChangeArticleNameStringMssg event) throws persistence.PersistenceException;
    
}
