package persistence;



import model.visitor.*;

public class ProducerProxi extends PersistentProxi implements PersistentProducer{
    
    public ProducerProxi(long objectId) {
        super(objectId);
    }
    public ProducerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 127;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentProducer)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentProducer)this.getTheObject()).setName(newValue);
    }
    public PersistentProducer getThis() throws PersistenceException {
        return ((PersistentProducer)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProducer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProducer(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProducer(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProducer(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProducer)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProducer)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProducer)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProducer)this.getTheObject()).initializeOnInstantiation();
    }

    
}
