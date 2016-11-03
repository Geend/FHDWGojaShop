
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
}