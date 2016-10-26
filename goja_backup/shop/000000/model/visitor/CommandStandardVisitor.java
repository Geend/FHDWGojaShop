
package model.visitor;

import persistence.*;

public abstract class CommandStandardVisitor implements CommandVisitor {
    
    protected abstract void standardHandling(Command command) throws PersistenceException;
}
