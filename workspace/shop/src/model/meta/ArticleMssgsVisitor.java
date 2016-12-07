package model.meta;

public interface ArticleMssgsVisitor extends ArticleDOWNMssgsVisitor, ArticleUPMssgsVisitor {}


interface ArticleDOWNMssgsVisitor  {

    public void handleArticleIncreaseStockIntegerMssg(ArticleIncreaseStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReduceStockIntegerMssg(ArticleReduceStockIntegerMssg event) throws persistence.PersistenceException;
    
}


interface ArticleUPMssgsVisitor  {

    public void handleArticleIncreaseStockIntegerMssg(ArticleIncreaseStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReduceStockIntegerMssg(ArticleReduceStockIntegerMssg event) throws persistence.PersistenceException;
    
}
