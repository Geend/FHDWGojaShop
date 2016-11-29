
package model.visitor;

import persistence.*;

public abstract class ArticleWrapperCommandStandardVisitor implements ArticleWrapperCommandVisitor {
    
    public void handleChangePriceCommand(ChangePriceCommand4Public changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleChangeArticleNameCommand(ChangeArticleNameCommand4Public changeArticleNameCommand) throws PersistenceException{
        this.standardHandling(changeArticleNameCommand);
    }
    protected abstract void standardHandling(ArticleWrapperCommand articleWrapperCommand) throws PersistenceException;
}
