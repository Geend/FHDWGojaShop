
package model.visitor;

import persistence.*;

public abstract class ProducerLstCommandStandardVisitor implements ProducerLstCommandVisitor {
    
    public void handleCreateProducerCommand(CreateProducerCommand4Public createProducerCommand) throws PersistenceException{
        this.standardHandling(createProducerCommand);
    }
    protected abstract void standardHandling(ProducerLstCommand producerLstCommand) throws PersistenceException;
}
