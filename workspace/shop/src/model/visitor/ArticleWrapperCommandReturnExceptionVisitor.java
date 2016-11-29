
package model.visitor;

import persistence.*;

public interface ArticleWrapperCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException, E;
    
}
