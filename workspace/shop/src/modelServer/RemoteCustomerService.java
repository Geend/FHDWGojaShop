
package modelServer;


import persistence.*;

public  class RemoteCustomerService extends RemoteService {

	
	public RemoteCustomerService(String connectionName, String userName, PersistentCustomerService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> customerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentCustomerService)this.server).customerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> acceptOrder(String orderProxiString){
        try {
            PersistentOrder order = (PersistentOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(orderProxiString));
            ((PersistentCustomerService)this.server).acceptOrder(order);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> addToCart(String articleProxiString, String quantityAsString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long quantity = new Long(quantityAsString).longValue();
            ((PersistentCustomerService)this.server).addToCart(article, quantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> cancelPreOrder(String orderProxiString){
        try {
            PersistentOrder order = (PersistentOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(orderProxiString));
            ((PersistentCustomerService)this.server).cancelPreOrder(order);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticleQuantity(String articleProxiString, String newQuantityAsString){
        try {
            PersistentShoppingCartQuantifiedArticle article = (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newQuantity = new Long(newQuantityAsString).longValue();
            ((PersistentCustomerService)this.server).changeArticleQuantity(article, newQuantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> clearError(String errorProxiString){
        try {
            PersistentErrorDisplay error = (PersistentErrorDisplay)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(errorProxiString));
            ((PersistentCustomerService)this.server).clearError(error);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> clear(String customerArticleLstProxiString){
        try {
            PersistentCustomerArticleLst customerArticleLst = (PersistentCustomerArticleLst)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerArticleLstProxiString));
            ((PersistentCustomerService)this.server).clear(customerArticleLst);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> deposit(String customerAccountProxiString, String amountAsString){
        try {
            PersistentCustomerAccount customerAccount = (PersistentCustomerAccount)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerAccountProxiString));
            common.Fraction amount = common.Fraction.parse(amountAsString);
            ((PersistentCustomerService)this.server).deposit(customerAccount, amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> emptyCart(String cartProxiString){
        try {
            PersistentShoppingCart cart = (PersistentShoppingCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            ((PersistentCustomerService)this.server).emptyCart(cart);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> findArticle(String customerArticleLstProxiString, String name){
        try {
            PersistentCustomerArticleLst customerArticleLst = (PersistentCustomerArticleLst)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerArticleLstProxiString));
            ((PersistentCustomerService)this.server).findArticle(customerArticleLst, name);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> markForReturn(String articleProxiString){
        try {
            PersistentOrderQuantifiedArticle article = (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentCustomerService)this.server).markForReturn(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> order(String cartProxiString, String customerDeliveryTimeProxiString){
        try {
            PersistentShoppingCart cart = (PersistentShoppingCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            PersistentCustomerDeliveryTime customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeProxiString));
            ((PersistentCustomerService)this.server).order(cart, customerDeliveryTime);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.EmptyCartException e0){
            return createExceptionResult(e0, this);
        }catch(model.NotEnoughStockException e1){
            return createExceptionResult(e1, this);
        }catch(model.NotEnoughMoneyException e2){
            return createExceptionResult(e2, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> preOrder(String cartProxiString, String customerDeliveryTimeProxiString){
        try {
            PersistentShoppingCart cart = (PersistentShoppingCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            PersistentCustomerDeliveryTime customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeProxiString));
            ((PersistentCustomerService)this.server).preOrder(cart, customerDeliveryTime);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.EmptyCartException e0){
            return createExceptionResult(e0, this);
        }catch(model.NotEnoughMoneyException e1){
            return createExceptionResult(e1, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> reloadUI(){
        try {
            ((PersistentCustomerService)this.server).reloadUI();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> removeFromCart(String articleProxiString){
        try {
            PersistentShoppingCartQuantifiedArticle article = (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentCustomerService)this.server).removeFromCart(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> unmarkForReturn(String articleProxiString){
        try {
            PersistentOrderQuantifiedArticle article = (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentCustomerService)this.server).unmarkForReturn(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> withdraw(String customerAccountProxiString, String amountAsString){
        try {
            PersistentCustomerAccount customerAccount = (PersistentCustomerAccount)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerAccountProxiString));
            common.Fraction amount = common.Fraction.parse(amountAsString);
            ((PersistentCustomerService)this.server).withdraw(customerAccount, amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.NotEnoughMoneyException e0){
            return createExceptionResult(e0, this);
        }
    }
    


}