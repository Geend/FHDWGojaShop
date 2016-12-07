
package model.visitor;

import persistence.*;

public abstract class ComponentContainerStandardVisitor implements ComponentContainerVisitor {
    
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException{
        this.standardHandling(componentManager);
    }
    protected abstract void standardHandling(ComponentContainer componentContainer) throws PersistenceException;
}
