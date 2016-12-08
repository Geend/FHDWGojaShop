package model.meta;

public interface ServiceMssgsVisitor extends ServiceDOWNMssgsVisitor, ServiceUPMssgsVisitor {}


interface ServiceDOWNMssgsVisitor extends CustomerServiceDOWNMssgsVisitor, CustomerRegisterServiceDOWNMssgsVisitor, OwnerServiceDOWNMssgsVisitor {

    
}


interface ServiceUPMssgsVisitor  {

    
}
