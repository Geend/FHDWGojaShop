package model.meta;

public interface ProductGroupMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ProductGroupUPMssgsVisitor {}


interface ProductGroupDOWNMssgsVisitor extends SubProductGroupDOWNMssgsVisitor, RootProductGroupDOWNMssgsVisitor, SubComponentUPMssgsVisitor {

    
}


interface ProductGroupUPMssgsVisitor extends ComponentUPMssgsVisitor {

    
}
