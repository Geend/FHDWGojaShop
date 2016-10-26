package model.meta;

public interface OrderArticleWrapperMssgs {
    void accept(OrderArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderArticleWrapperDOWNMssgs extends ArticleWrapperDOWNMssgs, OrderArticleWrapperMssgs{}
interface OrderArticleWrapperUPMssgs extends Mssgs, OrderArticleWrapperMssgs{}
