package model.meta;

public interface OrderStateMssgsVisitor extends OrderStateDOWNMssgsVisitor, OrderStateUPMssgsVisitor {}


interface OrderStateDOWNMssgsVisitor extends PreOrderDOWNMssgsVisitor, FinishedOrderDOWNMssgsVisitor, ActiveOrderDOWNMssgsVisitor {

    
}


interface OrderStateUPMssgsVisitor  {

    
}
