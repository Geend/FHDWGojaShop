
package model;

import common.Fraction;
import constants.ShopConstants;
import model.meta.OrderMssgs;
import persistence.*;
import model.visitor.*;
import view.objects.ArticleReturnReturnManagerWrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/* Additional import section end */

public class CustomerOrderManager extends model.OrderManager implements PersistentCustomerOrderManager{
    
    
    public static CustomerOrderManager4Public createCustomerOrderManager(CustomerAccount4Public account) throws PersistenceException{
        return createCustomerOrderManager(account,false);
    }
    
    public static CustomerOrderManager4Public createCustomerOrderManager(CustomerAccount4Public account,boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newDelayedCustomerOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newCustomerOrderManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("account", account);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static CustomerOrderManager4Public createCustomerOrderManager(CustomerAccount4Public account,boolean delayed$Persistence,CustomerOrderManager4Public This) throws PersistenceException {
        PersistentCustomerOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newDelayedCustomerOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
                .newCustomerOrderManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("account", account);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot account = (AbstractPersistentRoot)this.getAccount();
            if (account != null) {
                result.put("account", account.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    account.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && account.hasEssentialFields())account.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerOrderManager provideCopy() throws PersistenceException{
        CustomerOrderManager result = this;
        result = new CustomerOrderManager(this.orders, 
                                          this.subService, 
                                          this.This, 
                                          this.account, 
                                          this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerAccount account;
    
    public CustomerOrderManager(PersistentOrderManagerOrders orders,SubjInterface subService,PersistentOrderManager This,PersistentCustomerAccount account,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(orders,(SubjInterface)subService,(PersistentOrderManager)This,id);
        this.account = account;        
    }
    
    static public long getTypeId() {
        return 308;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 308) ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
            .newCustomerOrderManager(this.getId());
        super.store();
        if(this.getAccount() != null){
            this.getAccount().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade.accountSet(this.getId(), getAccount());
        }
        
    }
    
    public CustomerAccount4Public getAccount() throws PersistenceException {
        return this.account;
    }
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.account)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.account = (PersistentCustomerAccount)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade.accountSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerOrderManager result = (PersistentCustomerOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerOrderManager)this.This;
    }
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getOrders().getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void acceptOrder(final Order4Public order, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		AcceptOrderCommand4Public command = model.meta.AcceptOrderCommand.createAcceptOrderCommand(now, now);
		command.setOrder(order);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerOrderManager)This);
		if(this.isTheSameAs(This)){
			this.setAccount((PersistentCustomerAccount)final$$Fields.get("account"));
		}
    }
    public void newOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewOrderCommand4Public command = model.meta.NewOrderCommand.createNewOrderCommand(now, now);
		command.setCart(cart);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void newPreOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewPreOrderCommand4Public command = model.meta.NewPreOrderCommand.createNewPreOrderCommand(now, now);
		command.setCart(cart);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void acceptOrder(final Order4Public order) 
				throws model.OrderNotYetArrivedException, model.NotEnoughMoneyException, PersistenceException{

        order.getState().accept(new OrderStatusExceptionVisitor<OrderNotYetArrivedException>() {
            @Override
            public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException {

            }

            @Override
            public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException {

            }

            @Override
            public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException, OrderNotYetArrivedException {
                if(inTransitOrderState.getTicksLeft() == 0)
                    throw new OrderNotYetArrivedException("");
            }

            @Override
            public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException, OrderNotYetArrivedException {
                throw new OrderNotYetArrivedException("");

            }

            @Override
            public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException, OrderNotYetArrivedException {
                throw new OrderNotYetArrivedException("");

            }

            @Override
            public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException {

            }
        });


        ArticleReturn4Public articleReturn = ArticleReturn.createArticleReturn(order);
        order.getArticles().applyToAll(article -> {
            article.getState().accept(new OrderQuantifiedArticleStateVisitor() {
                @Override
                public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException {
                    articleReturn.addArticle(ReturnQuantifiedArticle.createReturnQuantifiedArticle(article.getQuantity(), article.getArticle()));

                    //Calculate the new totalPrice based on the ReturnPercentage value
                    Fraction newTotalPrice = order.getTotalPrice();
                    newTotalPrice = newTotalPrice.sub(article.getArticlePriceAtOrderTime().mul(article.getQuantity()));
                    newTotalPrice = newTotalPrice.add(article.getArticlePriceAtOrderTime().mul(article.getQuantity()).mul(Settings.getTheSettings().getReturnPercentage()));
                    order.setTotalPrice(newTotalPrice);
                }

                @Override
                public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException {

                }
            });
        });

        //TODO! Account for the customers limit
        getThis().getAccount().debit(order.getTotalPrice());

        if(articleReturn.getReturnArticles().getLength() > 0) {
            ReturnManager.getTheReturnManager().addArticleReturn(articleReturn);
            order.setState(ArticlesInReturnOrderState.createArticlesInReturnOrderState(ShopConstants.DEFAULT_RETURN_TIME));
        }
        else{
            order.setState(FinishedOrderState.createFinishedOrderState());

            //TODO! Order in archive
            //getThis().getOrders().removeAll(order);
        }

    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void newOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughStockException, model.NotEnoughMoneyException, PersistenceException{
        if(cart.getArticles().getLength() == 0)
            throw new EmptyCartException();

        Order4Public order = Order.createOrder(customerDeliveryTime, ProcessingOrderState.createProcessingOrderState());

        cart.getArticles().applyToAllException(shoppingCartQuantifiedArticle -> {

            ArticleWrapper4Public articleWrapper = shoppingCartQuantifiedArticle.getArticle();

            shoppingCartQuantifiedArticle.getArticle().getArticle().reduceStock(shoppingCartQuantifiedArticle.getQuantity());

            Fraction perArticlePrice = shoppingCartQuantifiedArticle.getArticle().getArticle().getPrice();

            OrderQuantifiedArticle4Public orderQuantifiedArticle =
                    OrderQuantifiedArticle.createOrderQuantifiedArticle(
                            shoppingCartQuantifiedArticle.getQuantity(),
                            articleWrapper,
                            perArticlePrice);

            order.addArticle(orderQuantifiedArticle);

            //Reorder articles that are in the correct state if necessary
            //TODO! Move reorder logic somewhere else?
            if(articleWrapper.getArticle().getCurrentStock() < articleWrapper.getArticle().getMinStock()){
                articleWrapper.getArticle().getState().accept(new ArticleStateVisitor() {
                    @Override
                    public void handleInSale(InSale4Public inSale) throws PersistenceException {
                        ReOrderManager.getTheReOrderManager().reOrder(articleWrapper);
                    }

                    @Override
                    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                        ReOrderManager.getTheReOrderManager().reOrder(articleWrapper);
                    }

                    @Override
                    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                        //Don't reorder articles that aren't in sale (this should actually never be called)
                    }

                    @Override
                    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                        if(articleWrapper.getArticle().getCurrentStock() == 0)
                            articleWrapper.getArticle().setState(NotInSale.createNotInSale());
                    }
                });
            }
        });

        //TODO! Account for the customers limit
        if(getThis().getAccount().getBalance().isLess(order.getTotalPrice())){
            throw new NotEnoughMoneyException("");
        }

        getThis().getOrders().add(order);
        OwnerOrderManager.getTheOwnerOrderManager().addOrder(order);

        order.setState(InTransitOrderState.createInTransitOrderState(customerDeliveryTime.getDeliveryTime()));

    }
    public void newPreOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, PersistenceException{

        if(cart.getArticles().getLength() == 0)
            throw new EmptyCartException();

        Order4Public order = Order.createOrder(customerDeliveryTime, ProcessingOrderState.createProcessingOrderState());



        cart.getArticles().applyToAll(shoppingCartQuantifiedArticle -> {

            ArticleWrapper4Public articleWrapper = shoppingCartQuantifiedArticle.getArticle();

            Long requestedQuantity = shoppingCartQuantifiedArticle.getQuantity();
            Long currentStock =  shoppingCartQuantifiedArticle.getArticle().getArticle().getCurrentStock();


            if(requestedQuantity > currentStock)
            {
                Long diff = requestedQuantity - currentStock;


                //"Reserve" all available articles for this pre order
                try {
                    shoppingCartQuantifiedArticle.getArticle().getArticle().reduceStock(currentStock);
                } catch (NotEnoughStockException e) {
                    //This can't happen because we already checked if we have enough stock.
                    //Maybe there is a race condition problem when two customers order the same article at the same time.
                    throw new Error(e);
                }

                //Order what we still need + enough to have maxStock after delivery of the preOrder
                ReOrderManager.getTheReOrderManager().reOrderForPreorder(articleWrapper, diff + articleWrapper.getArticle().getMaxStock());

            }
            else
            {
                try {
                    shoppingCartQuantifiedArticle.getArticle().getArticle().reduceStock(shoppingCartQuantifiedArticle.getQuantity());
                } catch (NotEnoughStockException e) {
                    //This can't happen because we already checked if we have enough stock.
                    //Maybe there is a race condition problem when two customers order the same article at the same time.
                    throw new Error(e);
                }
            }

            Fraction perArticlePrice = shoppingCartQuantifiedArticle.getArticle().getArticle().getPrice();

            OrderQuantifiedArticle4Public orderQuantifiedArticle =
                    OrderQuantifiedArticle.createOrderQuantifiedArticle(
                            shoppingCartQuantifiedArticle.getQuantity(),
                            articleWrapper,
                            perArticlePrice);

            order.addArticle(orderQuantifiedArticle);



        });

        //TODO! Account for the customers limit
        if(getThis().getAccount().getBalance().isLess(order.getTotalPrice())){
            throw new NotEnoughMoneyException("");
        }

        getThis().getOrders().add(order);
        OwnerOrderManager.getTheOwnerOrderManager().addOrder(order);

        order.setState(PreOrderState.createPreOrderState());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    @Override
    public void orders_update(OrderMssgs event) throws PersistenceException {
        System.out.println(event.toString() + "C");
    }
    /* End of protected part that is not overridden by persistence generator */
    
}
