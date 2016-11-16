package model.meta;

public interface OwnerArticleWrapperMssgs {
    void accept(OwnerArticleWrapperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OwnerArticleWrapperDOWNMssgs extends ArticleWrapperDOWNMssgs, OwnerArticleWrapperMssgs{}
interface OwnerArticleWrapperUPMssgs extends Mssgs, OwnerArticleWrapperMssgs{}
