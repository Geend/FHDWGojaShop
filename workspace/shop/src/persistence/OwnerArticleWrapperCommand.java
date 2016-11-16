package persistence;

import model.visitor.*;

/* Additional import section end */

public interface OwnerArticleWrapperCommand extends  Command {
    
    

    public void accept(OwnerArticleWrapperCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(OwnerArticleWrapperCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OwnerArticleWrapperCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OwnerArticleWrapperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

