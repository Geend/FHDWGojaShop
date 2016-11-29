package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ArticleCommand extends  Command {
    
    

    public void accept(ArticleCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ArticleCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ArticleCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ArticleCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

