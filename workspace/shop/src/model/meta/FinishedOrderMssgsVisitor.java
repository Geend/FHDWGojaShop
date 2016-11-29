package model.meta;

public interface FinishedOrderMssgsVisitor extends FinishedOrderDOWNMssgsVisitor, FinishedOrderUPMssgsVisitor {}


interface FinishedOrderDOWNMssgsVisitor  {

    
}


interface FinishedOrderUPMssgsVisitor extends OrderStateUPMssgsVisitor {

    
}
