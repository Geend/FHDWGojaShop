
package view.visitor;

import view.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException{
        this.standardHandling(producerLst);
    }
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleOwner(OwnerView owner) throws ModelException{
        this.standardHandling(owner);
    }
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.standardHandling(remainingStock);
    }
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleServer(ServerView server) throws ModelException{
        this.standardHandling(server);
    }
    public void handleCustomer(CustomerView customer) throws ModelException{
        this.standardHandling(customer);
    }
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException{
        this.standardHandling(errorDisplay);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.standardHandling(preOrder);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.standardHandling(notInSale);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.standardHandling(subProductGroup);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.standardHandling(customerRegisterService);
    }
    public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException{
        this.standardHandling(customerDeliveryTime);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.standardHandling(newCreated);
    }
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleOrder(OrderView order) throws ModelException{
        this.standardHandling(order);
    }
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.standardHandling(rootProductGroup);
    }
    public void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException{
        this.standardHandling(customerAccount);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.standardHandling(inSale);
    }
    public void handleProducer(ProducerView producer) throws ModelException{
        this.standardHandling(producer);
    }
    public void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException{
        this.standardHandling(shoppingCart);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(Anything anything) throws ModelException;
}
