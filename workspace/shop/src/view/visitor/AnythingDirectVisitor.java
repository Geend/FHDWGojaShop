
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    
    public abstract void handleAbstractOrder(AbstractOrderView abstractOrder) throws ModelException;
    
    public void handleOrder(OrderView order) throws ModelException{
        this.handleAbstractOrder(order);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.handleAbstractOrder(preOrder);
    }
    public abstract void handleQuantifiedArticle(QuantifiedArticleView quantifiedArticle) throws ModelException;
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public abstract void handleProducer(ProducerView producer) throws ModelException;
    
    public abstract void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
    public abstract void handleArticleState(ArticleStateView articleState) throws ModelException;
    
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.handleArticleState(notInSale);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.handleArticleState(inSale);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.handleArticleState(newCreated);
    }
    public abstract void handleComponent(ComponentView component) throws ModelException;
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.handleComponent(productGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.handleComponent(article);
    }
    public abstract void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException{
        this.handleArticleWrapper(orderArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException{
        this.handleArticleWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException{
        this.handleArticleWrapper(shoppingCartArticleWrapper);
    }
    
}
