package model.meta;

public interface ArticleMssgs {
    void accept(ArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleDOWNMssgs extends Mssgs, ArticleMssgs{}
interface ArticleUPMssgs extends Mssgs, ArticleMssgs{}
