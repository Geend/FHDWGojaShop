package persistence;



import model.visitor.*;

public class CustomerArticleLstProxi extends PersistentProxi implements PersistentCustomerArticleLst{
    
    public CustomerArticleLstProxi(long objectId) {
        super(objectId);
    }
    public CustomerArticleLstProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 324;
    }
    
    public CustomerArticleLst_ArticlesProxi getArticles() throws PersistenceException {
        return ((PersistentCustomerArticleLst)this.getTheObject()).getArticles();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCustomerArticleLst)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCustomerArticleLst)this.getTheObject()).setSubService(newValue);
    }
    public PersistentCustomerArticleLst getThis() throws PersistenceException {
        return ((PersistentCustomerArticleLst)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerArticleLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerArticleLst(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerArticleLst(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerArticleLst(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerArticleLst(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerArticleLst(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerArticleLst(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerArticleLst(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).updateObservers(event);
    }
    public void clear() 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).clear();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void find(final String name) 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).find(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerArticleLst)this.getTheObject()).initializeOnInstantiation();
    }

    
}
