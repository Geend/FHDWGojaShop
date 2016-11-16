package model.meta;

public interface SubProductGroupMssgsVisitor extends SubProductGroupDOWNMssgsVisitor, SubProductGroupUPMssgsVisitor {}


interface SubProductGroupDOWNMssgsVisitor  {

    
}


interface SubProductGroupUPMssgsVisitor extends ProductGroupUPMssgsVisitor, SubComponentUPMssgsVisitor {

    
}
