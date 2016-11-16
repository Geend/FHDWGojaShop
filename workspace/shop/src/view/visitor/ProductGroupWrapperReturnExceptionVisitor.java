
package view.visitor;

import view.*;

public interface ProductGroupWrapperReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleDefaultProductGroupWrapper(DefaultProductGroupWrapperView defaultProductGroupWrapper) throws ModelException, E;
    
}
