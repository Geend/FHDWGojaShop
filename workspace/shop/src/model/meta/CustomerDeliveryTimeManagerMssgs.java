package model.meta;

public interface CustomerDeliveryTimeManagerMssgs {
    void accept(CustomerDeliveryTimeManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerDeliveryTimeManagerDOWNMssgs extends Mssgs, CustomerDeliveryTimeManagerMssgs{}
interface CustomerDeliveryTimeManagerUPMssgs extends Mssgs, CustomerDeliveryTimeManagerMssgs{}
