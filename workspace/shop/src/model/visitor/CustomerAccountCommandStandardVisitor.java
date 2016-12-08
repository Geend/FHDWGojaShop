
package model.visitor;

import persistence.*;

public abstract class CustomerAccountCommandStandardVisitor implements CustomerAccountCommandVisitor {
    
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    public void handleDebitCommand(DebitCommand4Public debitCommand) throws PersistenceException{
        this.standardHandling(debitCommand);
    }
    protected abstract void standardHandling(CustomerAccountCommand customerAccountCommand) throws PersistenceException;
}
