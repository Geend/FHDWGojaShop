
package model.visitor;

import persistence.*;

public interface AnythingReturnExceptionVisitor<R, E extends model.UserException> extends AbstractOrderReturnExceptionVisitor<R, E> ,ArticleStateReturnExceptionVisitor<R, E> ,ArticleWrapperReturnExceptionVisitor<R, E> ,CommonDateReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> {
    
    public R handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException, E;
    public R handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException, E;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    public R handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException, E;
    public R handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException, E;
    public R handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException, E;
    public R handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException, E;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public R handleProducer(PersistentProducer producer) throws PersistenceException, E;
    public R handleServer(PersistentServer server) throws PersistenceException, E;
    public R handleServerRootProductGroup(PersistentServerRootProductGroup serverRootProductGroup) throws PersistenceException, E;
    public R handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException, E;
    public R handleSubj(PersistentSubj subj) throws PersistenceException, E;
    
}
