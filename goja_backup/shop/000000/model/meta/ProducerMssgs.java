package model.meta;

public interface ProducerMssgs {
    void accept(ProducerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProducerDOWNMssgs extends Mssgs, ProducerMssgs{}
interface ProducerUPMssgs extends Mssgs, ProducerMssgs{}
