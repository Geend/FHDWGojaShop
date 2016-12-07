package model.meta;

public interface ArticleWrapperMssgs {
    void accept(ArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleWrapperDOWNMssgs extends ComponentDOWNMssgs, ArticleWrapperMssgs{}
interface ArticleWrapperUPMssgs extends Mssgs, ArticleWrapperMssgs{}
