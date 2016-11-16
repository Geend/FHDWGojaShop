
package view.visitor;

import view.*;

public interface ProductGroupWrapperExceptionVisitor<E extends view.UserException> {
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapperView defaultProductGroupWrapper) throws ModelException, E;
    
}
