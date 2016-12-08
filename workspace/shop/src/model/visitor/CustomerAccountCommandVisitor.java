
package model.visitor;

import persistence.*;

public interface CustomerAccountCommandVisitor {
    
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException;
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    
}
