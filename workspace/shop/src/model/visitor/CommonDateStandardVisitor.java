
package model.visitor;

import persistence.*;

public abstract class CommonDateStandardVisitor implements CommonDateVisitor {
    
    public void handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException{
        this.standardHandling(createProductGroupCommand);
    }
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.standardHandling(createProducerCommand);
    }
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
    }
    public void handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException{
        this.standardHandling(addSubProductGroupCommand);
    }
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException{
        this.standardHandling(commonDate);
    }
    protected abstract void standardHandling(CommonDate4Public commonDate) throws PersistenceException;
}
