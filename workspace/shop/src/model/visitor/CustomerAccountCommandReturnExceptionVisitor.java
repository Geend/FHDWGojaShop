
package model.visitor;

import persistence.*;

public interface CustomerAccountCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException, E;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    
}
