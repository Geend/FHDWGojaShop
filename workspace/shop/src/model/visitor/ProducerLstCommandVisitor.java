
package model.visitor;

import persistence.*;

public interface ProducerLstCommandVisitor {
    
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException;
    
}
