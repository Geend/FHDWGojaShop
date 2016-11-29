
package model.visitor;

import persistence.*;

public interface CustomerAccountCommandVisitor {
    
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException;
    
}
