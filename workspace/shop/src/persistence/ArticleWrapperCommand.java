package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ArticleWrapperCommand extends  Command {
    
    

    public void accept(ArticleWrapperCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ArticleWrapperCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ArticleWrapperCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ArticleWrapperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

