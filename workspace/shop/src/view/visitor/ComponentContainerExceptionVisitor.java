
package view.visitor;

import view.*;

public interface ComponentContainerExceptionVisitor<E extends view.UserException> {
    
    public void handleComponentContainerImplementation(ComponentContainerImplementationView componentContainerImplementation) throws ModelException, E;
    public void handleComponentManager(ComponentManagerView componentManager) throws ModelException, E;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
