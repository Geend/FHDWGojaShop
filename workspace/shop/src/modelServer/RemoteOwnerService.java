
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
    
    public synchronized java.util.HashMap<?,?> changeArticleMaxStock(String articleProxiString, String newArticleMaxStockAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newArticleMaxStock = new Long(newArticleMaxStockAsString).longValue();
            ((PersistentOwnerService)this.server).changeArticleMaxStock(article, newArticleMaxStock);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticleMinStock(String articleProxiString, String newArticleMinStockAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newArticleMinStock = new Long(newArticleMinStockAsString).longValue();
            ((PersistentOwnerService)this.server).changeArticleMinStock(article, newArticleMinStock);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticleName(String articleProxiString, String newName){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentOwnerService)this.server).changeArticleName(article, newName);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeArticlePrice(String articleProxiString, String newPriceAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            common.Fraction newPrice = common.Fraction.parse(newPriceAsString);
            ((PersistentOwnerService)this.server).changeArticlePrice(article, newPrice);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
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
    
    public synchronized java.util.HashMap<?,?> increaseArticleStock(String articleProxiString, String quantityAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long quantity = new Long(quantityAsString).longValue();
            ((PersistentOwnerService)this.server).increaseArticleStock(article, quantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> moveTo(String componentProxiString, String newParentGroupProxiString){
        try {
            SubComponent component = (SubComponent)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(componentProxiString));
            PersistentProductGroup newParentGroup = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(newParentGroupProxiString));
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
            PersistentProductGroup parent = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            common.Fraction price = common.Fraction.parse(priceAsString);
            long minStock = new Long(minStockAsString).longValue();
            long maxStock = new Long(maxStockAsString).longValue();
            long producerDeliveryTime = new Long(producerDeliveryTimeAsString).longValue();
            PersistentProducer producer = (PersistentProducer)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(producerProxiString));
            ((PersistentOwnerService)this.server).newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.CycleException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> newProductGroup(String parentProxiString, String name){
        try {
            PersistentProductGroup parent = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
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
    
    public synchronized java.util.HashMap<?,?> newProductGroup(String name){
        try {
            ((PersistentOwnerService)this.server).newProductGroup(name);
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
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long quantity = new Long(quantityAsString).longValue();
            ((PersistentOwnerService)this.server).reduceArticleStock(article, quantity);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> startSelling(String articleProxiString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentOwnerService)this.server).startSelling(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> stopSelling(String articleProxiString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentOwnerService)this.server).stopSelling(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}