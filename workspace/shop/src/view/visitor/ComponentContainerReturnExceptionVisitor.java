
package view.visitor;

import view.*;

public interface ComponentContainerReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleComponentManager(ComponentManagerView componentManager) throws ModelException, E;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
