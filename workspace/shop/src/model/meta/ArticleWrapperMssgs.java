package model.meta;

public interface ArticleWrapperMssgs {
    void accept(ArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleWrapperDOWNMssgs extends ComponentDOWNMssgs, SubComponentDOWNMssgs, ArticleWrapperMssgs{}
interface ArticleWrapperUPMssgs extends Mssgs, ArticleWrapperMssgs{}
