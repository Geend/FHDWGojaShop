package model.meta;

public interface AbstractOrderMssgs {
    void accept(AbstractOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface AbstractOrderDOWNMssgs extends Mssgs, AbstractOrderMssgs{}
interface AbstractOrderUPMssgs extends OrderUPMssgs, PreOrderUPMssgs, AbstractOrderMssgs{}
