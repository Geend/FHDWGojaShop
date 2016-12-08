
package model.visitor;

import persistence.*;

public interface CustomerAccountCommandReturnVisitor<R> {
    
    public R handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public R handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public R handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    
}
