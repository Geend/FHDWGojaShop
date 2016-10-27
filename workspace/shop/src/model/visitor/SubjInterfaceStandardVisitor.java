
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceStandardVisitor implements SubjInterfaceVisitor {
    
    public void handleOrder(PersistentOrder order) throws PersistenceException{
        this.standardHandling(order);
    }
    public void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException{
        this.standardHandling(remainingStock);
    }
    public void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleServer(PersistentServer server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    public void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException{
        this.standardHandling(notInSale);
    }
    public void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException{
        this.standardHandling(customerAccount);
    }
    public void handleInSale(PersistentInSale inSale) throws PersistenceException{
        this.standardHandling(inSale);
    }
    public void handleSubj(PersistentSubj subj) throws PersistenceException{
        this.standardHandling(subj);
    }
    public void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException{
        this.standardHandling(customerDeliveryTime);
    }
    public void handleProducer(PersistentProducer producer) throws PersistenceException{
        this.standardHandling(producer);
    }
    public void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException{
        this.standardHandling(shoppingCart);
    }
    public void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException{
        this.standardHandling(newCreated);
    }
    public void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(SubjInterface subjInterface) throws PersistenceException;
}
