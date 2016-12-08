package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ShoppingCartQuantifiedArticleCommand extends  Command {
    
    

    public void accept(ShoppingCartQuantifiedArticleCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ShoppingCartQuantifiedArticleCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ShoppingCartQuantifiedArticleCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

