
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnVisitor<R> extends AbstractOrderReturnVisitor<R> ,ArticleStateReturnVisitor<R> ,ComponentReturnVisitor<R> ,ComponentWrapperReturnVisitor<R> ,QuantifiedArticleReturnVisitor<R> ,ServiceReturnVisitor<R> ,SubComponentReturnVisitor<R> {
    
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    public R handleProducer(Producer4Public producer) throws PersistenceException;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public R handleServer(Server4Public server) throws PersistenceException;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public R handleSubj(Subj4Public subj) throws PersistenceException;
    
}
