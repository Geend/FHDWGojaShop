
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnVisitor<R> extends AbstractOrderReturnVisitor<R> ,ArticleStateReturnVisitor<R> ,ArticleWrapperReturnVisitor<R> ,ComponentReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> {
    
    public R handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public R handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public R handleProducer(PersistentProducer producer) throws PersistenceException;
    public R handleServer(PersistentServer server) throws PersistenceException;
    public R handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public R handleSubj(PersistentSubj subj) throws PersistenceException;
    
}
