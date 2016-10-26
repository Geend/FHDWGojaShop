package persistence;



public abstract class ComponentProxi extends PersistentProxi implements PersistentComponent{
    
    public ComponentProxi(long objectId) {
        super(objectId);
    }
    public ComponentProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public abstract PersistentComponent getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentComponent)this.getTheObject()).initialize(This, final$$Fields);
    }
    public boolean containsParts(final PartsHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentComponent)this.getTheObject()).containsParts(part);
    }
    public boolean containsParts(final PartsHIERARCHY part, final java.util.HashSet<PartsHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentComponent)this.getTheObject()).containsParts(part, visited);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentComponent)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentComponent)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentComponent)this.getTheObject()).initializeOnInstantiation();
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentComponent)this.getTheObject()).strategyParts(strategy);
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy, final java.util.HashMap<PartsHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentComponent)this.getTheObject()).strategyParts(strategy, visited);
    }

    
}
