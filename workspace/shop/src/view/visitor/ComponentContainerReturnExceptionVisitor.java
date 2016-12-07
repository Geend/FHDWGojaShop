
package view.visitor;

import view.*;

public interface ComponentContainerReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementationView componentContainerImplementation) throws ModelException, E;
    public R handleComponentManager(ComponentManagerView componentManager) throws ModelException, E;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
