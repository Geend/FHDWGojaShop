
package model.visitor;

import persistence.*;

public interface ProductGroupWrapperExceptionVisitor<E extends model.UserException> {
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException, E;
    
}
