
package view.visitor;

import view.*;

public interface ProductGroupReturnVisitor<R> {
    
    public R handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException;
    public R handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException;
    
}
