package model.meta;

public interface OrderStateMssgsVisitor extends OrderStateDOWNMssgsVisitor, OrderStateUPMssgsVisitor {}


interface OrderStateDOWNMssgsVisitor extends ProcessingOrderStateDOWNMssgsVisitor, InTransitOrderStateDOWNMssgsVisitor, PreOrderStateDOWNMssgsVisitor, FinishedOrderStateDOWNMssgsVisitor, WaitingForAcceptOrderStateDOWNMssgsVisitor, ArticlesInReturnOrderStateDOWNMssgsVisitor {

    
}


interface OrderStateUPMssgsVisitor  {

    
}
