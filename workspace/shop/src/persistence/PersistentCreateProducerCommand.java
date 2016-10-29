package persistence;


public interface PersistentCreateProducerCommand extends Anything, ProducerLstCommand, PersistentCommonDate, AbstractPersistentProxi, CreateProducerCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

