package model.meta;

public interface OrderStatusMssgsVisitor extends OrderStatusDOWNMssgsVisitor, OrderStatusUPMssgsVisitor {}


interface OrderStatusDOWNMssgsVisitor extends ProcessingOrderStateDOWNMssgsVisitor, InTransitOrderStateDOWNMssgsVisitor, PreOrderStateDOWNMssgsVisitor, FinishedOrderStateDOWNMssgsVisitor, WaitingForAcceptOrderStateDOWNMssgsVisitor, ArticlesInReturnOrderStateDOWNMssgsVisitor {

    
}


interface OrderStatusUPMssgsVisitor  {

    
}
