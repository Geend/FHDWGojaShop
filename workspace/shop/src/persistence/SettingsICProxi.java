package persistence;



import model.visitor.*;

public class SettingsICProxi extends PersistentInCacheProxiOptimistic implements PersistentSettings{
    
    public SettingsICProxi(long objectId) {
        super(objectId);
    }
    public SettingsICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theSettingsFacade
            .getSettings(this.getId());
    }
    
    public long getClassId() {
        return 318;
    }
    
    public common.Fraction getNewCustomerDefaultBalance() throws PersistenceException {
        return ((PersistentSettings)this.getTheObject()).getNewCustomerDefaultBalance();
    }
    public void setNewCustomerDefaultBalance(common.Fraction newValue) throws PersistenceException {
        ((PersistentSettings)this.getTheObject()).setNewCustomerDefaultBalance(newValue);
    }
    public common.Fraction getNewCustomerDefaultLimit() throws PersistenceException {
        return ((PersistentSettings)this.getTheObject()).getNewCustomerDefaultLimit();
    }
    public void setNewCustomerDefaultLimit(common.Fraction newValue) throws PersistenceException {
        ((PersistentSettings)this.getTheObject()).setNewCustomerDefaultLimit(newValue);
    }
    public common.Fraction getReturnPercentage() throws PersistenceException {
        return ((PersistentSettings)this.getTheObject()).getReturnPercentage();
    }
    public void setReturnPercentage(common.Fraction newValue) throws PersistenceException {
        ((PersistentSettings)this.getTheObject()).setReturnPercentage(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentSettings)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentSettings)this.getTheObject()).setSubService(newValue);
    }
    public PersistentSettings getThis() throws PersistenceException {
        return ((PersistentSettings)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleSettings(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSettings(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSettings(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSettings(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleSettings(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSettings(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSettings(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSettings(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentSettings)this.getTheObject()).initializeOnInstantiation();
    }

    
}
