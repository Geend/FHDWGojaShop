
package model.visitor;

import persistence.*;

public interface ArticleWrapperCommandVisitor {
    
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException;
    public void handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException;
    
}
