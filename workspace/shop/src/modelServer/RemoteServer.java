
package modelServer;


import persistence.*;

public  class RemoteServer extends RemoteServerMaster {

	protected PersistentServer server;

	public RemoteServer(String connectionName, String userName, PersistentServer server){
		super (connectionName, userName );
        this.server = server;
	}

	protected Remote getServer(){
        return this.server;
    }
 

    public synchronized java.util.HashMap<?,?> server_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentServer)this.server).server_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> createArticle(String parentProxiString, String name, String priceAsString, String minStockAsString, String maxStockAsString, String producerDeliveryTimeAsString, String producerProxiString){
        try {
            PersistentProductGroup parent = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            common.Fraction price = common.Fraction.parse(priceAsString);
            long minStock = new Long(minStockAsString).longValue();
            long maxStock = new Long(maxStockAsString).longValue();
            long producerDeliveryTime = new Long(producerDeliveryTimeAsString).longValue();
            PersistentProducer producer = (PersistentProducer)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(producerProxiString));
            ((PersistentServer)this.server).createArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.CycleException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> createProductGroup(String parentProxiString, String name){
        try {
            PersistentProductGroup parent = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            ((PersistentServer)this.server).createProductGroup(parent, name);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.CycleException e0){
            return createExceptionResult(e0, this);
        }
    }
    


}