
package model.visitor;

import persistence.*;

public abstract class ToString$Visitor extends AnythingStandardVisitor{
    
    public abstract void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    public abstract void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException;
    public abstract void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException;
    public abstract void handleServer(Server4Public server) throws PersistenceException;
    public abstract void handleCustomer(Customer4Public customer) throws PersistenceException;
    public abstract void handleArticle(Article4Public article) throws PersistenceException;
    public abstract void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException;
    public abstract void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException;
    public abstract void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    public abstract void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException;
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    public abstract void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException;
    public abstract void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException;
    public abstract void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException;
    public abstract void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException;
    public abstract void handleOrder(Order4Public order) throws PersistenceException;
    public abstract void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException;
    public abstract void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    public abstract void handleInSale(InSale4Public inSale) throws PersistenceException;
    public abstract void handleProducer(Producer4Public producer) throws PersistenceException;
    public abstract void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    public abstract void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException;
    
}
