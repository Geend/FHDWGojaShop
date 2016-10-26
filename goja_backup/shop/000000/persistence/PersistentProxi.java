package persistence;

import java.util.HashMap;

import common.ProxiInformation;
import common.RPCConstantsAndServices;

abstract class ProxiFactory {
	  abstract AbstractPersistentRoot create(long objectId);
}
abstract class ListProxiFactory {
	  abstract AbstractPersistentRoot create(long objectId, long entryId);
}

public abstract class PersistentProxi extends PersistentRoot implements PersistentProxiInterface {

  private static ProxiFactory [] proxiFactories;
  private static ListProxiFactory [] listProxiFactories;
	
  private static ListProxiFactory [] getTheListProxiFactories(){
	if (listProxiFactories == null){
		listProxiFactories = new ListProxiFactory[68];
        listProxiFactories[66] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderArticleWrapperListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[20] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProductGroupListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[21] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemainingStockListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[47] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderQuantifiedArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[1] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ServerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[2] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ErrorDisplayListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[22] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[48] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PreOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[23] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NotInSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[49] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerDeliveryTimeListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[0] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandCoordinatorListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[52] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShoppingCartQuantifiedArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[29] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NewCreatedListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[60] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopArticleWrapperListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[46] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[24] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerAccountListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[25] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new InSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[26] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProducerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[51] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShoppingCartListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[3] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommonDateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[4] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandExecuterListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[62] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShoppingCartArticleWrapperListEntryProxi(objectId, entryId);
            }
        };
	}
	return listProxiFactories;
  }
  private static ProxiFactory [] getTheProxiFactories(){
	if (proxiFactories == null){
		proxiFactories = new ProxiFactory [68];
        proxiFactories[66] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderArticleWrapperProxi(objectId);
            }
        };
        proxiFactories[20] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProductGroupProxi(objectId);
            }
        };
        proxiFactories[21] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemainingStockProxi(objectId);
            }
        };
        proxiFactories[47] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderQuantifiedArticleProxi(objectId);
            }
        };
        proxiFactories[1] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ServerProxi(objectId);
            }
        };
        proxiFactories[2] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ErrorDisplayProxi(objectId);
            }
        };
        proxiFactories[22] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleProxi(objectId);
            }
        };
        proxiFactories[48] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PreOrderProxi(objectId);
            }
        };
        proxiFactories[23] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NotInSaleProxi(objectId);
            }
        };
        proxiFactories[49] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerDeliveryTimeProxi(objectId);
            }
        };
        proxiFactories[0] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandCoordinatorProxi(objectId);
            }
        };
        proxiFactories[52] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShoppingCartQuantifiedArticleProxi(objectId);
            }
        };
        proxiFactories[29] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NewCreatedProxi(objectId);
            }
        };
        proxiFactories[60] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopArticleWrapperProxi(objectId);
            }
        };
        proxiFactories[46] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderProxi(objectId);
            }
        };
        proxiFactories[24] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerAccountProxi(objectId);
            }
        };
        proxiFactories[25] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new InSaleProxi(objectId);
            }
        };
        proxiFactories[26] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProducerProxi(objectId);
            }
        };
        proxiFactories[51] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShoppingCartProxi(objectId);
            }
        };
        proxiFactories[3] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommonDateProxi(objectId);
            }
        };
        proxiFactories[4] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandExecuterProxi(objectId);
            }
        };
        proxiFactories[62] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShoppingCartArticleWrapperProxi(objectId);
            }
        };
	}
	return proxiFactories;
  }

  public static PersistentProxiInterface createProxi(ProxiInformation proxi) throws PersistenceException{
	  if (proxi.isDecorator()){
		  Decoratees resultDecoratee = (Decoratees) createProxi(proxi.getDecorateeObjectId(), proxi.getDecorateeClassId());
		  PersistentProxiInterface resultDecorator = (PersistentProxiInterface) resultDecoratee.createDecorator();
		  resultDecorator.setId(proxi.getObjectId());
		  return resultDecorator;
	  } else {
		  return createProxi(proxi.getObjectId(), proxi.getClassId());
	  }
  }

  public static PersistentProxiInterface createProxi(long objectId, long classId) throws PersistenceException {
    int index = (int) classId;
    if (classId == RPCConstantsAndServices.NullClassID) return null; 
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    ProxiFactory factory = getTheProxiFactories()[index];
    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    PersistentProxiInterface result =  (PersistentProxiInterface)factory.create(objectId);
    result.getTheObject();
    return result;
  }
  public static PersistentListEntryProxi createListEntryProxi(long objectId, long classId, long entryId) throws PersistenceException {
    int index = (int) classId;
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheListProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    ListProxiFactory factory = getTheListProxiFactories()[index];
    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    PersistentListEntryProxi result =  (PersistentListEntryProxi)factory.create(objectId,entryId);
    result.getTheObject();
    return result;
  }

	private PersistentInCacheProxi object;

	protected PersistentProxi(long id) {
		super(id);
		this.object = null;
	}

	protected PersistentProxi(PersistentInCacheProxi object) {
		//TODO (GOJA) Still needed for Decorator???
		super(object.getId());
		this.object = object;
		this.object.incrementUserCount();
	}
	public boolean isDelayed$Persistence() throws PersistenceException {
		return this.getTheObject().isDelayed$Persistence();
	}

	public void setDelayed$Persistence(boolean b) throws PersistenceException {
		this.getTheObject().setDelayed$Persistence(b);
	}
	public void store() throws PersistenceException{
		this.getTheObject().store();
	}
	public void setId(long id) {
		super.setId(id);
		try {
			this.getTheObject().setId(id);
		} catch (PersistenceException e) {
			throw new PersistenceError(e);
		}
	}

	public void setObject(PersistentRoot object) {
		if (this.object == null)
			this.object = (PersistentInCacheProxi)object;
	}

	public HashMap<String,Object> toHashtable(int depth, int essentialLevel, boolean forGUI, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot iCRroxi = this.getTheObject();
		if (iCRroxi == null) return null;
		return iCRroxi.toHashtable(depth, essentialLevel, forGUI, tdObserver);
	}
	public HashMap<String, Object> toHashtable(HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot iCRroxi = this.getTheObject();
		if (iCRroxi == null) return null;
		return iCRroxi.toHashtable(allResults, depth, essentialLevel, forGUI, leaf, tdObserver);
	}

	public PersistentRoot getTheObject() throws PersistenceException {
		if (this.object == null) {
			this.object = Cache.getTheCache().get(this);
			this.object.incrementUserCount();
		}
		return this.object;
	}
	public boolean hasEssentialFields() throws PersistenceException{
		return this.getTheObject().hasEssentialFields();
	}
	public int getIconInfo() throws PersistenceException {
		return this.getTheObject().getIconInfo();
	}
	public int getLeafInfo() throws PersistenceException {
		return this.getTheObject().getLeafInfo();
	}
	
	public String toString() {
		try {
			return this.getTheObject().toString();
		} catch (PersistenceException pe) {
			throw new PersistenceError(pe);
		}
	}
	public String toString(boolean inner)throws PersistenceException{
		try {
			return this.getTheObject().toString(inner);
		} catch (PersistenceException pe) {
			throw new PersistenceError(pe);
		}		
	}
	public void delete$Me() throws PersistenceException {
		this.getTheObject().delete$Me();
	}
	public Anything getThis() throws PersistenceException {
		return this.getTheObject().getThis();
	}
	
	
    protected void setDltd() throws PersistenceException{
        this.getTheObject().setDltd();
    }
    public boolean isDltd() throws PersistenceException {
        return this.getTheObject().isDltd();
    }
	
	
//	public void finalize(){
//		if (this.object != null)this.object.decrementUserCount();
//	}
}
