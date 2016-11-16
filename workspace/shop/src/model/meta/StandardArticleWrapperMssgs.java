package model.meta;

public interface StandardArticleWrapperMssgs {
    void accept(StandardArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface StandardArticleWrapperDOWNMssgs extends ArticleWrapperDOWNMssgs, StandardArticleWrapperMssgs{}
interface StandardArticleWrapperUPMssgs extends Mssgs, StandardArticleWrapperMssgs{}
