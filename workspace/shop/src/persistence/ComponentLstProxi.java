package persistence;



import model.visitor.*;

public class ComponentLstProxi extends PersistentProxi implements PersistentComponentLst{
    
    public ComponentLstProxi(long objectId) {
        super(objectId);
    }
    public ComponentLstProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 177;
    }
    
    public ComponentLst_CurrentComponentsProxi getCurrentComponents() throws PersistenceException {
        return ((PersistentComponentLst)this.getTheObject()).getCurrentComponents();
    }
    public PersistentComponentLst getThis() throws PersistenceException {
        return ((PersistentComponentLst)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleComponentLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentLst(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentLst(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentLst(this);
    }
    
    
    public void createProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentComponentLst)this.getTheObject()).createProductGroup(name, invoker);
    }
    public Server4Public getMyServer() 
				throws PersistenceException{
        return ((PersistentComponentLst)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentComponentLst)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentComponentLst)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void createProductGroup(final String name) 
				throws model.DoubleDefinition, PersistenceException{
        ((PersistentComponentLst)this.getTheObject()).createProductGroup(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentComponentLst)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentComponentLst)this.getTheObject()).initializeOnInstantiation();
    }

    
}
