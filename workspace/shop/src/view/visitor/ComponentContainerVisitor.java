
package view.visitor;

import view.*;

public interface ComponentContainerVisitor {
    
    public void handleComponentContainerImplementation(ComponentContainerImplementationView componentContainerImplementation) throws ModelException;
    public void handleComponentManager(ComponentManagerView componentManager) throws ModelException;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
