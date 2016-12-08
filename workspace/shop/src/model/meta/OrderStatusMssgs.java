package model.meta;

public interface OrderStatusMssgs {
    void accept(OrderStatusMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderStatusDOWNMssgs extends Mssgs, OrderStatusMssgs{}
interface OrderStatusUPMssgs extends ProcessingOrderStateUPMssgs, InTransitOrderStateUPMssgs, PreOrderStateUPMssgs, FinishedOrderStateUPMssgs, WaitingForAcceptOrderStateUPMssgs, ArticlesInReturnOrderStateUPMssgs, OrderStatusMssgs{}
