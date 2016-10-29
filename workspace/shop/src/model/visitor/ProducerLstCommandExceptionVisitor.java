
package model.visitor;

import persistence.*;

public interface ProducerLstCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    
}
