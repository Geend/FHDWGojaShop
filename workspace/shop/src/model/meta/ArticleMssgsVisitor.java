package model.meta;

public interface ArticleMssgsVisitor extends ArticleDOWNMssgsVisitor, ArticleUPMssgsVisitor {}


interface ArticleDOWNMssgsVisitor  {

    public void handleArticleIncreaseStockIntegerMssg(ArticleIncreaseStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReduceStockIntegerMssg(ArticleReduceStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleStartSellingMssg(ArticleStartSellingMssg event) throws persistence.PersistenceException;
    public void handleArticleStopSellingMssg(ArticleStopSellingMssg event) throws persistence.PersistenceException;
    
}


interface ArticleUPMssgsVisitor extends ComponentUPMssgsVisitor {

    public void handleArticleIncreaseStockIntegerMssg(ArticleIncreaseStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReduceStockIntegerMssg(ArticleReduceStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleStartSellingMssg(ArticleStartSellingMssg event) throws persistence.PersistenceException;
    public void handleArticleStopSellingMssg(ArticleStopSellingMssg event) throws persistence.PersistenceException;
    
}
