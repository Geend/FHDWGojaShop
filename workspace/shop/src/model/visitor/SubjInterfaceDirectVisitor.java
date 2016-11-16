
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceDirectVisitor implements SubjInterfaceVisitor {
    
    public abstract void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    
    public abstract void handleServer(Server4Public server) throws PersistenceException;
    
    public abstract void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    
    public abstract void handleService(Service4Public service) throws PersistenceException;
    
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException{
        this.handleService(customerService);
    }
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException{
        this.handleService(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.handleService(customerRegisterService);
    }
    public abstract void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    
    public abstract void handleSubj(Subj4Public subj) throws PersistenceException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    
    public abstract void handleComponentWrapper(ComponentWrapper4Public componentWrapper) throws PersistenceException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(standardArticleWrapper);
    }
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.handleComponentWrapper(defaultProductGroupWrapper);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(ownerArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(shoppingCartArticleWrapper);
    }
    public abstract void handleAbstractOrder(AbstractOrder4Public abstractOrder) throws PersistenceException;
    
    public void handleOrder(Order4Public order) throws PersistenceException{
        this.handleAbstractOrder(order);
    }
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException{
        this.handleAbstractOrder(preOrder);
    }
    public abstract void handleQuantifiedArticle(QuantifiedArticle4Public quantifiedArticle) throws PersistenceException;
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public abstract void handleProducer(Producer4Public producer) throws PersistenceException;
    
    public abstract void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException;
    
    public abstract void handleArticleState(ArticleState4Public articleState) throws PersistenceException;
    
    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.handleArticleState(notInSale);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.handleArticleState(newCreated);
    }
    public void handleInSale(InSale4Public inSale) throws PersistenceException{
        this.handleArticleState(inSale);
    }
    public abstract void handleComponent(Component4Public component) throws PersistenceException;
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.handleComponent(rootProductGroup);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.handleComponent(article);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.handleComponent(subProductGroup);
    }
    
}
