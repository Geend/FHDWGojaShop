
package view.visitor;

import view.*;

public interface ComponentContainerReturnVisitor<R> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementationView componentContainerImplementation) throws ModelException;
    public R handleComponentManager(ComponentManagerView componentManager) throws ModelException;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
