package model.meta;

public interface OrderStatusMssgsVisitor extends OrderStatusDOWNMssgsVisitor, OrderStatusUPMssgsVisitor {}


interface OrderStatusDOWNMssgsVisitor extends PreOrderStateDOWNMssgsVisitor, ProcessingOrderStateDOWNMssgsVisitor, FinishedOrderStateDOWNMssgsVisitor, WaitingForAcceptOrderStateDOWNMssgsVisitor, InTransitOrderStateDOWNMssgsVisitor, ArticlesInReturnOrderStateDOWNMssgsVisitor {

    
}


interface OrderStatusUPMssgsVisitor  {

    
}
