
package model.visitor;

import persistence.*;

public interface AnythingVisitor extends ArticleStateVisitor,CommonDateVisitor,ComponentVisitor{
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException;
    public void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    public void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    public void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    public void handleComponentLst(ComponentLst4Public componentLst) throws PersistenceException;
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    public void handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public void handleProducer(Producer4Public producer) throws PersistenceException;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public void handleServer(Server4Public server) throws PersistenceException;
    
}
