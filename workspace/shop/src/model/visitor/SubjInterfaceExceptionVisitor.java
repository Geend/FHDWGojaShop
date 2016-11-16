
package model.visitor;

import persistence.*;

public interface SubjInterfaceExceptionVisitor<E extends model.UserException> extends AbstractOrderExceptionVisitor<E>,ArticleStateExceptionVisitor<E>,ComponentExceptionVisitor<E>,ComponentWrapperExceptionVisitor<E>,QuantifiedArticleExceptionVisitor<E>,ServiceExceptionVisitor<E>,SubComponentExceptionVisitor<E>{
    
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException, E;
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException, E;
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException, E;
    public void handleProducer(Producer4Public producer) throws PersistenceException, E;
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException, E;
    public void handleServer(Server4Public server) throws PersistenceException, E;
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException, E;
    public void handleSubj(Subj4Public subj) throws PersistenceException, E;
    
}
