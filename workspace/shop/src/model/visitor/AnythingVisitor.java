
package model.visitor;

import persistence.*;

public interface AnythingVisitor extends AbstractOrderVisitor,ArticleStateVisitor,ArticleWrapperVisitor,CommonDateVisitor,ComponentVisitor,QuantifiedArticleVisitor{
    
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    public void handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException;
    public void handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException;
    public void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public void handleProducer(PersistentProducer producer) throws PersistenceException;
    public void handleServer(PersistentServer server) throws PersistenceException;
    public void handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException;
    public void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public void handleSubj(PersistentSubj subj) throws PersistenceException;
    
}
