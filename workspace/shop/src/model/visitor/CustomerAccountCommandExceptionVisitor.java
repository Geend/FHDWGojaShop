
package model.visitor;

import persistence.*;

public interface CustomerAccountCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleDepositCommand(DepositCommand4Public depositCommand) throws PersistenceException, E;
    public void handleWithdrawCommand(WithdrawCommand4Public withdrawCommand) throws PersistenceException, E;
    
}
