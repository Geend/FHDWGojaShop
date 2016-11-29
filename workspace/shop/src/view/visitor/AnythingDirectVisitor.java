
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleProducerLst(ProducerLstView producerLst) throws ModelException;
    
    public abstract void handleOrder(OrderView order) throws ModelException;
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleService(ServiceView service) throws ModelException;
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.handleService(customerService);
    }
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.handleService(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.handleService(customerRegisterService);
    }
    public abstract void handleCustomerAccount(CustomerAccountView customerAccount) throws ModelException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException;
    
    public abstract void handleProducer(ProducerView producer) throws ModelException;
    
    public abstract void handleQuantifiedArticle(QuantifiedArticleView quantifiedArticle) throws ModelException;
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.handleQuantifiedArticle(shoppingCartQuantifiedArticle);
    }
    public abstract void handleShoppingCart(ShoppingCartView shoppingCart) throws ModelException;
    
    public abstract void handleCustomerArticleLst(CustomerArticleLstView customerArticleLst) throws ModelException;
    
    public abstract void handleArticleState(ArticleStateView articleState) throws ModelException;
    
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.handleArticleState(notInSale);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.handleArticleState(newCreated);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.handleArticleState(inSale);
    }
    public abstract void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView customerDeliveryTimeManager) throws ModelException;
    
    public abstract void handleComponent(ComponentView component) throws ModelException;
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.handleComponent(rootProductGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.handleComponent(article);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.handleComponent(subProductGroup);
    }
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException{
        this.handleComponent(articleWrapper);
    }
    public abstract void handleOrderState(OrderStateView orderState) throws ModelException;
    
    public void handleActiveOrder(ActiveOrderView activeOrder) throws ModelException{
        this.handleOrderState(activeOrder);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.handleOrderState(preOrder);
    }
    public void handleFinishedOrder(FinishedOrderView finishedOrder) throws ModelException{
        this.handleOrderState(finishedOrder);
    }
    public abstract void handleSettings(SettingsView settings) throws ModelException;
    
    public abstract void handleOrderManager(OrderManagerView orderManager) throws ModelException;
    
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException{
        this.handleOrderManager(customerOrderManager);
    }
    
}
