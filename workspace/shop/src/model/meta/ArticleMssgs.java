package model.meta;

public interface ArticleMssgs {
    void accept(ArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleDOWNMssgs extends ComponentDOWNMssgs, SubComponentDOWNMssgs, ArticleMssgs{}
interface ArticleUPMssgs extends Mssgs, ArticleMssgs{}
