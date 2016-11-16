
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnExceptionVisitor<R, E extends model.UserException> extends AbstractOrderReturnExceptionVisitor<R, E> ,ArticleStateReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> ,ComponentWrapperReturnExceptionVisitor<R, E> ,QuantifiedArticleReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> ,SubComponentReturnExceptionVisitor<R, E> {
    
    public R handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public R handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public R handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public R handleProducer(Producer4Public producer) throws PersistenceException, E;
    public R handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public R handleServer(Server4Public server) throws PersistenceException, E;
    public R handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public R handleSubj(Subj4Public subj) throws PersistenceException, E;
    
}
