
package model.visitor;

import persistence.*;

public interface AnythingExceptionVisitor<E extends model.UserException> extends AbstractOrderExceptionVisitor<E>,ArticleStateExceptionVisitor<E>,ArticleWrapperExceptionVisitor<E>,ComponentExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>{
    
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException, E;
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException, E;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    public void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException, E;
    public void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException, E;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public void handleProducer(PersistentProducer producer) throws PersistenceException, E;
    public void handleServer(PersistentServer server) throws PersistenceException, E;
    public void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException, E;
    
}
