
package view.visitor;

import view.*;

public abstract class ComponentContainerStandardVisitor implements ComponentContainerVisitor {
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.standardHandling(productGroup);
    }
    public void handleComponentManager(ComponentManagerView componentManager) throws ModelException{
        this.standardHandling(componentManager);
    }
    protected abstract void standardHandling(ComponentContainer componentContainer) throws ModelException;
}
