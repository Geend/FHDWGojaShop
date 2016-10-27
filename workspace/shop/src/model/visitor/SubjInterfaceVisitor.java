
package model.visitor;

import persistence.*;

public interface SubjInterfaceVisitor extends AbstractOrderVisitor,ArticleStateVisitor,ArticleWrapperVisitor,ComponentVisitor,QuantifiedArticleVisitor{
    
    public void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public void handleProducer(PersistentProducer producer) throws PersistenceException;
    public void handleServer(PersistentServer server) throws PersistenceException;
    public void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public void handleSubj(PersistentSubj subj) throws PersistenceException;
    
}
