
package model.visitor;

import persistence.*;

public interface ProductGroupWrapperReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException, E;
    
}
