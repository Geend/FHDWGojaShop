
package model.visitor;

import persistence.*;

public interface ArticleWrapperCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public void handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException, E;
    
}
