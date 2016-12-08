package model.meta;

public interface ProcessingOrderStateMssgsVisitor extends ProcessingOrderStateDOWNMssgsVisitor, ProcessingOrderStateUPMssgsVisitor {}


interface ProcessingOrderStateDOWNMssgsVisitor  {

    
}


interface ProcessingOrderStateUPMssgsVisitor extends OrderStatusUPMssgsVisitor {

    
}
