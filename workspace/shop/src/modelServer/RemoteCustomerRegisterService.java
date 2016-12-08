
package modelServer;


import persistence.*;

public  class RemoteCustomerRegisterService extends RemoteService {

	
	public RemoteCustomerRegisterService(String connectionName, String userName, PersistentCustomerRegisterService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> customerRegisterService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentCustomerRegisterService)this.server).customerRegisterService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> register(String accountName, String password){
        try {
            ((PersistentCustomerRegisterService)this.server).register(accountName, password);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.UserAlreadyExistsException e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> reloadUI(){
        try {
            ((PersistentCustomerRegisterService)this.server).reloadUI();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}