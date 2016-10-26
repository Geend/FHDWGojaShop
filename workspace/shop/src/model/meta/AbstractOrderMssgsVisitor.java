package model.meta;

public interface AbstractOrderMssgsVisitor extends AbstractOrderDOWNMssgsVisitor, AbstractOrderUPMssgsVisitor {}


interface AbstractOrderDOWNMssgsVisitor extends OrderDOWNMssgsVisitor, PreOrderDOWNMssgsVisitor {

    
}


interface AbstractOrderUPMssgsVisitor  {

    
}
