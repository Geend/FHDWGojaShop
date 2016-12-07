package model.meta;

public interface WaitingForAcceptOrderStateMssgsVisitor extends WaitingForAcceptOrderStateDOWNMssgsVisitor, WaitingForAcceptOrderStateUPMssgsVisitor {}


interface WaitingForAcceptOrderStateDOWNMssgsVisitor  {

    
}


interface WaitingForAcceptOrderStateUPMssgsVisitor extends OrderStatusUPMssgsVisitor {

    
}
