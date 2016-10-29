
package model.visitor;

import persistence.*;

public interface ProducerLstCommandReturnVisitor<R> {
    
    public R handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    
}
