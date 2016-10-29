package model.meta;

public interface ProducerLstMssgs {
    void accept(ProducerLstMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProducerLstDOWNMssgs extends Mssgs, ProducerLstMssgs{}
interface ProducerLstUPMssgs extends Mssgs, ProducerLstMssgs{}
