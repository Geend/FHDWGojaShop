package model.meta;

public interface ReOrderManagerMssgsVisitor extends ReOrderManagerDOWNMssgsVisitor, ReOrderManagerUPMssgsVisitor {}


interface ReOrderManagerDOWNMssgsVisitor  {

    public void handleReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg(ReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg event) throws persistence.PersistenceException;
    
}


interface ReOrderManagerUPMssgsVisitor extends BackgroundTaskUPMssgsVisitor {

    public void handleReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg(ReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg event) throws persistence.PersistenceException;
    
}
