package model.meta;

public interface ArticleReturnMssgs {
    void accept(ArticleReturnMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleReturnDOWNMssgs extends Mssgs, ArticleReturnMssgs{}
interface ArticleReturnUPMssgs extends Mssgs, ArticleReturnMssgs{}
