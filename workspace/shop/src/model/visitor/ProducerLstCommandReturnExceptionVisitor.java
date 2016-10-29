
package model.visitor;

import persistence.*;

public interface ProducerLstCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException, E;
    
}
