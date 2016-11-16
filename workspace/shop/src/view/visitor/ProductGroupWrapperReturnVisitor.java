
package view.visitor;

import view.*;

public interface ProductGroupWrapperReturnVisitor<R> {
    
    public R handleDefaultProductGroupWrapper(DefaultProductGroupWrapperView defaultProductGroupWrapper) throws ModelException;
    
}
