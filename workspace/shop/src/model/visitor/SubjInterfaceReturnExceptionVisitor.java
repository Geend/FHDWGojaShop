
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnExceptionVisitor<R, E extends model.UserException> extends AbstractOrderReturnExceptionVisitor<R, E> ,ArticleStateReturnExceptionVisitor<R, E> ,ArticleWrapperReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> {
    
    public R handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException, E;
    public R handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException, E;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public R handleProducer(PersistentProducer producer) throws PersistenceException, E;
    public R handleServer(PersistentServer server) throws PersistenceException, E;
    public R handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException, E;
    public R handleSubj(PersistentSubj subj) throws PersistenceException, E;
    
}
