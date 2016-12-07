
package model;

import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.Instant;

import model.visitor.AnythingExceptionVisitor;
import model.visitor.AnythingReturnExceptionVisitor;
import model.visitor.AnythingReturnVisitor;
import model.visitor.AnythingVisitor;
import model.visitor.InvokerExceptionVisitor;
import model.visitor.InvokerReturnExceptionVisitor;
import model.visitor.InvokerReturnVisitor;
import model.visitor.InvokerVisitor;
import model.visitor.RemoteExceptionVisitor;
import model.visitor.RemoteReturnExceptionVisitor;
import model.visitor.RemoteReturnVisitor;
import model.visitor.RemoteVisitor;
import model.visitor.ServiceExceptionVisitor;
import model.visitor.ServiceReturnExceptionVisitor;
import model.visitor.ServiceReturnVisitor;
import model.visitor.ServiceVisitor;
import model.visitor.SubjInterfaceExceptionVisitor;
import model.visitor.SubjInterfaceReturnExceptionVisitor;
import model.visitor.SubjInterfaceReturnVisitor;
import model.visitor.SubjInterfaceVisitor;
import persistence.Anything;
import persistence.ConnectionHandler;
import persistence.CustomerRegisterService4Public;
import persistence.Invoker;
import persistence.ObsInterface;
import persistence.PersistenceException;
import persistence.PersistentCustomerRegisterService;
import persistence.PersistentProxi;
import persistence.PersistentService;
import persistence.RegisterCommand4Public;
import persistence.SubjInterface;
import persistence.TDObserver;


/* Additional import section end */

public class CustomerRegisterService extends model.Service implements PersistentCustomerRegisterService{
    
    
    public static CustomerRegisterService4Public createCustomerRegisterService() throws PersistenceException{
        return createCustomerRegisterService(false);
    }
    
    public static CustomerRegisterService4Public createCustomerRegisterService(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerRegisterService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerRegisterServiceFacade
                .newDelayedCustomerRegisterService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerRegisterServiceFacade
                .newCustomerRegisterService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static CustomerRegisterService4Public createCustomerRegisterService(boolean delayed$Persistence,CustomerRegisterService4Public This) throws PersistenceException {
        PersistentCustomerRegisterService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerRegisterServiceFacade
                .newDelayedCustomerRegisterService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerRegisterServiceFacade
                .newCustomerRegisterService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerRegisterService provideCopy() throws PersistenceException{
        CustomerRegisterService result = this;
        result = new CustomerRegisterService(this.subService, 
                                             this.This, 
                                             this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public CustomerRegisterService(SubjInterface subService,PersistentService This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,id);        
    }
    
    static public long getTypeId() {
        return -225;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -225) ConnectionHandler.getTheConnectionHandler().theCustomerRegisterServiceFacade
            .newCustomerRegisterService(this.getId());
        super.store();
        
    }
    
    public PersistentCustomerRegisterService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerRegisterService result = (PersistentCustomerRegisterService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerRegisterService)this.This;
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerRegisterService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerRegisterService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerRegisterService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerRegisterService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerRegisterService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerRegisterService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerRegisterService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerRegisterService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerRegisterService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerRegisterService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerRegisterService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerRegisterService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCustomerRegisterService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerRegisterService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerRegisterService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public String customerRegisterService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
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
        this.setThis((PersistentCustomerRegisterService)This);
		if(this.isTheSameAs(This)){
		}
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
    public void register(final String accountName, final String password, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		RegisterCommand4Public command = model.meta.RegisterCommand.createRegisterCommand(accountName, password, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void disconnected() 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void register(final String accountName, final String password) 
				throws model.UserAlreadyExistsException, PersistenceException{

        if(Server.getServerByUser(accountName).getLength() == 0){
            Server.createServer(password, accountName,0l, Timestamp.from(Instant.now()));

            CustomerAccount.createCustomerAccount(accountName,
                    Settings.getTheSettings().getNewCustomerDefaultBalance(),
                    Settings.getTheSettings().getNewCustomerDefaultLimit());
        }
        else {
            throw new UserAlreadyExistsException(MessageFormat.format("User with name {0} already exists", accountName));
        }
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

    /* End of protected part that is not overridden by persistence generator */
    
}
