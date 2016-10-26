
package model.visitor;

import persistence.*;

public interface AnythingReturnVisitor<R> extends AbstractOrderReturnVisitor<R> ,ArticleStateReturnVisitor<R> ,ArticleWrapperReturnVisitor<R> ,ComponentReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> {
    
    public R handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    public R handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    public R handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public R handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public R handleProducer(PersistentProducer producer) throws PersistenceException;
    public R handleServer(PersistentServer server) throws PersistenceException;
    public R handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    
}
