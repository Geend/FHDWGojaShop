
package model.visitor;

import persistence.*;

public interface CustomerAccountCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    
}
