package model.meta;

public interface CustomerDeliveryTimeMssgs {
    void accept(CustomerDeliveryTimeMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerDeliveryTimeDOWNMssgs extends Mssgs, CustomerDeliveryTimeMssgs{}
interface CustomerDeliveryTimeUPMssgs extends Mssgs, CustomerDeliveryTimeMssgs{}
