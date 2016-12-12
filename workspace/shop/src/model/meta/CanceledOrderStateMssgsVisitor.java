package model.meta;

public interface CanceledOrderStateMssgsVisitor extends CanceledOrderStateDOWNMssgsVisitor, CanceledOrderStateUPMssgsVisitor {}


interface CanceledOrderStateDOWNMssgsVisitor  {

    
}


interface CanceledOrderStateUPMssgsVisitor extends OrderStatusUPMssgsVisitor {

    
}
