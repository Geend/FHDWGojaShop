package model.meta;

public interface OwnerArticleWrapperMssgsVisitor extends OwnerArticleWrapperDOWNMssgsVisitor, OwnerArticleWrapperUPMssgsVisitor {}


interface OwnerArticleWrapperDOWNMssgsVisitor  {

    public void handleOwnerArticleWrapperIncreaseStockIntegerMssg(OwnerArticleWrapperIncreaseStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleOwnerArticleWrapperReduceStockIntegerMssg(OwnerArticleWrapperReduceStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleOwnerArticleWrapperStartSellingMssg(OwnerArticleWrapperStartSellingMssg event) throws persistence.PersistenceException;
    public void handleOwnerArticleWrapperStopSellingMssg(OwnerArticleWrapperStopSellingMssg event) throws persistence.PersistenceException;
    
}


interface OwnerArticleWrapperUPMssgsVisitor extends ArticleWrapperUPMssgsVisitor {

    public void handleOwnerArticleWrapperIncreaseStockIntegerMssg(OwnerArticleWrapperIncreaseStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleOwnerArticleWrapperReduceStockIntegerMssg(OwnerArticleWrapperReduceStockIntegerMssg event) throws persistence.PersistenceException;
    public void handleOwnerArticleWrapperStartSellingMssg(OwnerArticleWrapperStartSellingMssg event) throws persistence.PersistenceException;
    public void handleOwnerArticleWrapperStopSellingMssg(OwnerArticleWrapperStopSellingMssg event) throws persistence.PersistenceException;
    
}
