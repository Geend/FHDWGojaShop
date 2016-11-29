
package model.visitor;

import persistence.*;

public interface ArticleWrapperCommandReturnVisitor<R> {
    
    public R handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public R handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException;
    
}
