package model.meta;

public interface FinishedOrderStateMssgsVisitor extends FinishedOrderStateDOWNMssgsVisitor, FinishedOrderStateUPMssgsVisitor {}


interface FinishedOrderStateDOWNMssgsVisitor  {

    
}


interface FinishedOrderStateUPMssgsVisitor extends OrderStatusUPMssgsVisitor {

    
}
