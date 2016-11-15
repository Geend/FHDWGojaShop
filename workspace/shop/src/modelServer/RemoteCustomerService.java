
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
    


}