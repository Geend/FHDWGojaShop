
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceStandardVisitor implements SubjInterfaceVisitor {
    
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException{
        this.standardHandling(producerLst);
    }
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException{
        this.standardHandling(remainingStock);
    }
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.standardHandling(defaultProductGroupWrapper);
    }
    public void handleServer(Server4Public server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.standardHandling(customerRegisterService);
    }
    public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException{
        this.standardHandling(customerDeliveryTime);
    }
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException{
        this.standardHandling(ownerService);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException{
        this.standardHandling(customerShopArticleWrapper);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException{
        this.standardHandling(standardArticleWrapper);
    }
    public void handleOrder(Order4Public order) throws PersistenceException{
        this.standardHandling(order);
    }
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.standardHandling(rootProductGroup);
    }
    public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException{
        this.standardHandling(customerAccount);
    }
    public void handleInSale(InSale4Public inSale) throws PersistenceException{
        this.standardHandling(inSale);
    }
    public void handleSubj(Subj4Public subj) throws PersistenceException{
        this.standardHandling(subj);
    }
    public void handleProducer(Producer4Public producer) throws PersistenceException{
        this.standardHandling(producer);
    }
    public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException{
        this.standardHandling(shoppingCart);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException{
        this.standardHandling(ownerArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(SubjInterface subjInterface) throws PersistenceException;
}
