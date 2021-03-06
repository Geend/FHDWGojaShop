package view.objects;


import view.ModelException;

import viewClient.ExceptionAndEventHandler;
import viewClient.ConnectionMaster;
import viewClient.ConnectionIndex;

import common.RPCConstantsAndServices;
import common.ProxiInformation;

import java.util.Vector;
import java.util.Iterator;

import javax.swing.event.TableModelListener;
import javax.swing.tree.TreePath;

abstract class ProxiFactory {
	  abstract ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey);
}

public abstract class ViewProxi extends ViewRoot {

  @SuppressWarnings("unchecked")
  public static <T> Vector<T> getProxiVector(Vector<String> hashtableVector, ExceptionAndEventHandler connectionKey) throws ModelException {
	Vector<T> result = new Vector<T>();
    Iterator<String> entries = hashtableVector.iterator();
    while (entries.hasNext()){
      String current = (String)entries.next();
      ProxiInformation currentProxiInformation = RPCConstantsAndServices.createProxiInformation(current);
      ViewProxi currentProxi = ViewProxi.createProxi(currentProxiInformation, connectionKey);
      currentProxi.setToString(currentProxiInformation.getToString());
      currentProxi.setIconInfo(currentProxiInformation.getIconInfo());
      currentProxi.setLeafInfo(currentProxiInformation.getLeafInfo());
      
      result.add((T) currentProxi);
    }
    return result;
  }
    
  public static ViewProxi createProxi(ProxiInformation proxi, ExceptionAndEventHandler connectionKey) throws ModelException{
	  ViewProxi result = createProxi(proxi.getObjectId(), proxi.getClassId(), connectionKey);
	  if (proxi.isDecorator()){
		  ViewDecoratorProxi resultAsDecorator = (ViewDecoratorProxi) result;
		  resultAsDecorator.setDecorateeId(proxi.getDecorateeObjectId());
		  resultAsDecorator.setDecorateeClassId(proxi.getDecorateeClassId());
	  }
	  result.setIconInfo(proxi.getIconInfo());
	  result.setLeafInfo(proxi.getLeafInfo());
	  return result;
  }

  private static ProxiFactory [] proxiFactories;
	
  private static ProxiFactory [] getTheProxiFactories(){
	if (proxiFactories == null){
		proxiFactories = new ProxiFactory [358];
        proxiFactories[109] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ProducerLstProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[266] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CONCBackgroundTaskProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[20] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ProductGroupProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[177] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[92] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new RemainingStockProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[131] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderQuantifiedArticleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[1] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ServerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[2] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ErrorDisplayProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[225] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ReOrderQuantifiedArticleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[94] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new NotInSaleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[124] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerRegisterServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[234] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ProcessingOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[294] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ComponentContainerImplementationProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[335] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new GlobalOrderArchiveProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[195] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerDeliveryTimeManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[217] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new SettingsProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[137] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[255] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderQuantifiedArticleNormalStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[138] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerAccountProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[242] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new GlobalOrderManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[226] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ReOrderManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[235] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new InTransitOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[327] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShopProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[97] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ProducerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[248] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArticleReturnProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[254] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderQuantifiedArticleMarkedForReturnStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[141] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArticleWrapperProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[236] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new PreOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[250] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ReturnManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[93] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArticleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[133] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerDeliveryTimeProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[175] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OwnerServiceProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[237] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new FinishedOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[278] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ComponentManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[223] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerArticleLstProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[135] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShoppingCartQuantifiedArticleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[99] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new NewCreatedProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[262] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new BackgroundTaskManagerProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[231] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new WaitingForAcceptOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[95] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new InSaleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[245] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ReturnQuantifiedArticleProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[140] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ShoppingCartProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[260] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new ArticlesInReturnOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[350] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new OrderQuantifiedArticlePreOrderProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[355] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CanceledOrderStateProxi(objectId, classId, connectionKey);
            }
        };
        proxiFactories[207] = new ProxiFactory(){
            ViewProxi create(long objectId, long classId, ExceptionAndEventHandler connectionKey){
                return new CustomerOrderManagerProxi(objectId, classId, connectionKey);
            }
        };
	}
	return proxiFactories;
  }
	
  public static ViewProxi createProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) throws ModelException {
	if (classId == 0) return null;
    int index = (int) classId;
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheProxiFactories().length) throw new ModelException("Unknown class :" + Long.toString(classId),0);
    ProxiFactory factory = getTheProxiFactories()[index];
    if (factory == null)  throw new ModelException("Unknown class :" + Long.toString(classId),0);
    ViewProxi result =  factory.create(objectId, classId, connectionKey);
    return result;
  }


	protected ViewObject object;

	private ExceptionAndEventHandler connectionKey;

	private boolean expanded;
	

	protected ViewProxi(long id, long classId, ExceptionAndEventHandler connectionKey) {
		super(id, classId);
		this.connectionKey = connectionKey;
		this.expanded = false;
	}
	public void setExpanded(boolean b) {
		this.expanded = true;
	}

	public boolean expand(){
		if (!expanded){
			try {
				this.getRemote(new java.util.Vector<ViewRoot>(), true);
			} catch (ModelException e) {
				this.setToString(e.getMessage());
				return !(e.getMessage().equals(RPCConstantsAndServices.ObjectNotAvailableErrorMessage) &&
						 e.getErrorNumber() == RPCConstantsAndServices.ObjectNotAvailableErrorNo);
			}
			this.expanded = true;
		}
		return true;
	}

	public ViewObject getTheObject() throws ModelException {
		if (this.object == null)
			getRemote(new java.util.Vector<ViewRoot>(), false);
		return this.object;
	}

	public void setObject(ViewObject object) {
		this.object = object;
	}

	protected ConnectionMaster getConnection() {
		return ConnectionIndex.getTheConnectionIndex().getConnection(this.connectionKey);
	}


	@SuppressWarnings("unchecked")
	public void getRemote(java.util.Vector<ViewRoot> context, boolean forTreeView) throws ModelException {
        ConnectionMaster connection = this.getConnection();
        java.util.HashMap<Object,Object> table = connection.getObject(getRemoteDepth(), context, forTreeView, this);
        if(((Boolean)table.get("?OK?")).booleanValue()) {
            java.util.HashMap<String,Object> resultTable = (java.util.HashMap<String,Object>)table.get(RPCConstantsAndServices.ResultFieldName);
            ViewProxi.resolveReferences(resultTable, this.connectionKey);
            this.setObject((ViewObject) resultTable.get(RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId())));
        }else{
            throw new ModelException((String)table.get("?Message?"), ((Integer)table.get("?ExceptionNumber?")).intValue());
        }
    }
	@SuppressWarnings("unchecked")
	public static void resolveReferences(java.util.HashMap<String, Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        for (String current : resultTable.keySet()) {
			ProxiInformation info = RPCConstantsAndServices.createProxiInformation(current);
			ViewProxi proxi = ViewProxi.createProxi(info, connectionKey);
			resultTable.put(current, proxi.getRemoteObject((java.util.HashMap<String,Object>) resultTable.get(current), connectionKey));
		}
        for (String current : resultTable.keySet()) {
			ViewObject currentEntry = (ViewObject) resultTable.get(current);
			if (currentEntry != null)currentEntry.resolveProxies(resultTable);
		}    	
        for (String current : resultTable.keySet()) {
			ViewObject currentEntry = (ViewObject) resultTable.get(current);
			if (currentEntry != null)currentEntry.sortSetValuedFields();
		}    	
    }

	abstract protected AbstractViewRoot getRemoteObject(java.util.HashMap<String, Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException;

	public String toString() {
		try {
			return this.object == null ? this.toString : this.getTheObject().toString();
		} catch (ModelException me) {
			return me.getMessage();
		}
	}

	public void valueForPathChanged(TreePath path, Object newValue) {
		try {
			this.getTheObject().valueForPathChanged(path, newValue);
		} catch (ModelException e) {
			return;
		}		
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public int getRowCount() {
		try {
			return this.getTheObject().getRowCount();
		} catch (ModelException e) {
			return 0;
		}
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		try {
			return this.getTheObject().getValueAt(rowIndex, columnIndex);
		} catch (ModelException e) {
			return e.getMessage();
		}
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		try {
			return this.getTheObject().isCellEditable(rowIndex, columnIndex);
		} catch (ModelException e) {
			return false;
		}
	}

	public boolean isRowEditable(int index) {
		try {
			return this.getTheObject().isRowEditable(index);
		} catch (ModelException e) {
			return false;
		}
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		try {
			this.getTheObject().setValueAt(aValue, rowIndex, columnIndex);
		} catch (ModelException e) {
			return;
		}
	}

	public void addTableModelListener(TableModelListener l) {
		try {
			this.getTheObject().addTableModelListener(l);
		} catch (ModelException e) {
			throw new Error(e.getMessage());
		}
	}

	public void removeTableModelListener(TableModelListener l) {
		try {
			this.getTheObject().removeTableModelListener(l);
		} catch (ModelException e) {
			throw new Error(e.getMessage());
		}
	}
	public String createProxiInformation() {
		return RPCConstantsAndServices.createFromClientProxiRepresentation(this.getClassId(), this.getId(), this.getRemoteDepth());
	}

}
