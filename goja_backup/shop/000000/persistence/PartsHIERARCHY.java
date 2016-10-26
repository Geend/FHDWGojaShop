package persistence;

import model.visitor.*;

/* Additional import section end */

public interface PartsHIERARCHY extends AbstractPersistentProxi {
    
    
    public boolean containsParts(final PartsHIERARCHY part) 
				throws PersistenceException;
    public boolean containsParts(final PartsHIERARCHY part, final java.util.HashSet<PartsHIERARCHY> visited) 
				throws PersistenceException;
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy) 
				throws PersistenceException;
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy, final java.util.HashMap<PartsHIERARCHY,T> visited) 
				throws PersistenceException;

    public void accept(PartsHIERARCHYVisitor visitor) throws PersistenceException;
    public <R> R accept(PartsHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(PartsHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(PartsHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

