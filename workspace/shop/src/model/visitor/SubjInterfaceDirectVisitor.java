
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceDirectVisitor implements SubjInterfaceVisitor {
    
    public abstract void handleAbstractOrder(PersistentAbstractOrder abstractOrder) throws PersistenceException;
    
    public void handleOrder(PersistentOrder order) throws PersistenceException{
        this.handleAbstractOrder(order);
    }
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException{
        this.handleAbstractOrder(preOrder);
    }
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    
    public abstract void handleQuantifiedArticle(PersistentQuantifiedArticle quantifiedArticle) throws PersistenceException;
    
    public void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public abstract void handleProducer(PersistentProducer producer) throws PersistenceException;
    
    public abstract void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    
    public abstract void handleArticleState(PersistentArticleState articleState) throws PersistenceException;
    
    public void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException{
        this.handleArticleState(notInSale);
    }
    public void handleInSale(PersistentInSale inSale) throws PersistenceException{
        this.handleArticleState(inSale);
    }
    public void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException{
        this.handleArticleState(newCreated);
    }
    public abstract void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    
    public abstract void handleComponent(PersistentComponent component) throws PersistenceException;
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.handleComponent(productGroup);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.handleComponent(article);
    }
    public abstract void handleSubj(PersistentSubj subj) throws PersistenceException;
    
    public abstract void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    
    public void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(orderArticleWrapper);
    }
    public void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(shoppingCartArticleWrapper);
    }
    public abstract void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    
    
}
