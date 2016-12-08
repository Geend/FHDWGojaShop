
package modelServer;


import persistence.*;

public  class RemoteOwnerService extends RemoteService {

	
	public RemoteOwnerService(String connectionName, String userName, PersistentOwnerService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> ownerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentOwnerService)this.server).ownerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticleName(String articleProxiString, String newName){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentOwnerService)this.server).changeArticleName(article, newName);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticlePrice(String articleProxiString, String newPriceAsString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            common.Fraction newPrice = common.Fraction.parse(newPriceAsString);
            ((PersistentOwnerService)this.server).changeArticlePrice(article, newPrice);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeCustomerDeliveryTimePrice(String customerDeliveryTimeProxiString, String newValueAsString){
        try {
            PersistentCustomerDeliveryTime customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeProxiString));
            common.Fraction newValue = common.Fraction.parse(newValueAsString);
            ((PersistentOwnerService)this.server).changeCustomerDeliveryTimePrice(customerDeliveryTime, newValue);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeCustomerDeliveryTimeTime(String customerDeliveryTimeProxiString, String newValueAsString){
        try {
            PersistentCustomerDeliveryTime customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeProxiString));
            long newValue = new Long(newValueAsString).longValue();
            ((PersistentOwnerService)this.server).changeCustomerDeliveryTimeTime(customerDeliveryTime, newValue);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeNewCustomerDefaultBalance(String newValueAsString){
        try {
            common.Fraction newValue = common.Fraction.parse(newValueAsString);
            ((PersistentOwnerService)this.server).changeNewCustomerDefaultBalance(newValue);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeNewCustomerDefaultLimit(String newValueAsString){
        try {
            common.Fraction newValue = common.Fraction.parse(newValueAsString);
            ((PersistentOwnerService)this.server).changeNewCustomerDefaultLimit(newValue);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeReturnPercentage(String newValueAsString){
        try {
            common.Fraction newValue = common.Fraction.parse(newValueAsString);
            ((PersistentOwnerService)this.server).changeReturnPercentage(newValue);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> createCustomerDeliveryTime(String name, String priceAsString, String timeAsString){
        try {
            common.Fraction price = common.Fraction.parse(priceAsString);
            long time = new Long(timeAsString).longValue();
            ((PersistentOwnerService)this.server).createCustomerDeliveryTime(name, price, time);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.DoubleDefinitionException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> createProducer(String name){
        try {
            ((PersistentOwnerService)this.server).createProducer(name);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.DoubleDefinitionException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> getArticle(String wrapperProxiString){
        try {
            PersistentArticleWrapper wrapper = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(wrapperProxiString));
            Article4Public result = ((PersistentOwnerService)this.server).getArticle(wrapper);
            return createOKResult(result, 1, this);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> increaseArticleStock(String articleProxiString, String quantityAsString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long quantity = new Long(quantityAsString).longValue();
            ((PersistentOwnerService)this.server).increaseArticleStock(article, quantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> moveTo(String componentProxiString, String newParentGroupProxiString){
        try {
            PersistentComponent component = (PersistentComponent)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(componentProxiString));
            ComponentContainer newParentGroup = (ComponentContainer)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(newParentGroupProxiString));
            ((PersistentOwnerService)this.server).moveTo(component, newParentGroup);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.CycleException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> newArticle(String parentProxiString, String name, String priceAsString, String minStockAsString, String maxStockAsString, String producerDeliveryTimeAsString, String producerProxiString){
        try {
            ComponentContainer parent = (ComponentContainer)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            common.Fraction price = common.Fraction.parse(priceAsString);
            long minStock = new Long(minStockAsString).longValue();
            long maxStock = new Long(maxStockAsString).longValue();
            long producerDeliveryTime = new Long(producerDeliveryTimeAsString).longValue();
            PersistentProducer producer = (PersistentProducer)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(producerProxiString));
            ((PersistentOwnerService)this.server).newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.DoubleDefinitionException e0){
            return createExceptionResult(e0, this);
        }catch(model.CycleException e1){
            return createExceptionResult(e1, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> newProductGroup(String parentProxiString, String name){
        try {
            ComponentContainer parent = (ComponentContainer)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            ((PersistentOwnerService)this.server).newProductGroup(parent, name);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.DoubleDefinitionException e0){
            return createExceptionResult(e0, this);
        }catch(model.CycleException e1){
            return createExceptionResult(e1, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> reduceArticleStock(String articleProxiString, String quantityAsString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long quantity = new Long(quantityAsString).longValue();
            ((PersistentOwnerService)this.server).reduceArticleStock(article, quantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.NotEnoughStockException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> reloadUI(){
        try {
            ((PersistentOwnerService)this.server).reloadUI();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> startSelling(String articleProxiString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentOwnerService)this.server).startSelling(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> stopSelling(String articleProxiString){
        try {
            PersistentArticleWrapper article = (PersistentArticleWrapper)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentOwnerService)this.server).stopSelling(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}