package model.meta;

public interface OrderStateMssgsVisitor extends OrderStateDOWNMssgsVisitor, OrderStateUPMssgsVisitor {}


interface OrderStateDOWNMssgsVisitor extends PreOrderStateDOWNMssgsVisitor, ProcessingOrderStateDOWNMssgsVisitor, FinishedOrderStateDOWNMssgsVisitor, WaitingForAcceptOrderStateDOWNMssgsVisitor, InTransitOrderStateDOWNMssgsVisitor {

    
}


interface OrderStateUPMssgsVisitor  {

    
}
