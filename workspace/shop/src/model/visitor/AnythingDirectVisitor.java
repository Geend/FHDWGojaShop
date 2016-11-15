
package model.visitor;

import persistence.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException;
    
    public abstract void handleServer(Server4Public server) throws PersistenceException;
    
    public abstract void handleErrorDisplay(ErrorDisplay4Public errorDisplay) throws PersistenceException;
    
    public abstract void handleService(Service4Public service) throws PersistenceException;
    
    public void handleOwner(Owner4Public owner) throws PersistenceException{
        this.handleService(owner);
    }
    public void handleCustomer(Customer4Public customer) throws PersistenceException{
        this.handleService(customer);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.handleService(customerRegisterService);
    }
    public abstract void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException;
    
    public abstract void handleSubj(Subj4Public subj) throws PersistenceException;
    
    public abstract void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException;
    
    public abstract void handleCommandCoordinator(CommandCoordinator4Public commandCoordinator) throws PersistenceException;
    
    public abstract void handleAbstractOrder(AbstractOrder4Public abstractOrder) throws PersistenceException;
    
    public void handleOrder(Order4Public order) throws PersistenceException{
        this.handleAbstractOrder(order);
    }
    public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException{
        this.handleAbstractOrder(preOrder);
    }
    public abstract void handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException;
    
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
    public abstract void handleCommonDate(CommonDate4Public commonDate) throws PersistenceException;
    
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException{
        this.handleCommonDate(newSubProductGroupCommand);
    }
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException{
        this.handleCommonDate(increaseStockCommand);
    }
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException{
        this.handleCommonDate(stopSellingCommand);
    }
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.handleCommonDate(createProducerCommand);
    }
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.handleCommonDate(moveToCommand);
    }
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException{
        this.handleCommonDate(startSellingCommand);
    }
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException{
        this.handleCommonDate(reduceStockCommand);
    }
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException{
        this.handleCommonDate(newArticleCommand);
    }
    public void handleRegisterCommand(RegisterCommand4Public registerCommand) throws PersistenceException{
        this.handleCommonDate(registerCommand);
    }
    public abstract void handleCommandExecuter(CommandExecuter4Public commandExecuter) throws PersistenceException;
    
    public abstract void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(orderArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(shoppingCartArticleWrapper);
    }
    
}
