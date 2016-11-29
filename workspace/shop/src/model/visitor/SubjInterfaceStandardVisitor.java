
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceStandardVisitor implements SubjInterfaceVisitor {
    
    public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException{
        this.standardHandling(producerLst);
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
    public void handleServer(Server4Public server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException{
        this.standardHandling(finishedOrder);
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
    public void handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException{
        this.standardHandling(activeOrder);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException{
        this.standardHandling(customerArticleLst);
    }
    public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException{
        this.standardHandling(customerDeliveryTimeManager);
    }
    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    public void handleSettings(Settings4Public settings) throws PersistenceException{
        this.standardHandling(settings);
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
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException{
        this.standardHandling(customerOrderManager);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    protected abstract void standardHandling(SubjInterface subjInterface) throws PersistenceException;
}
