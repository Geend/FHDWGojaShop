package persistence;

import java.util.HashMap;

abstract class ICProxiFactory {
	  abstract PersistentInCacheProxi create(long objectId);
}

public abstract class PersistentInCacheProxi extends PersistentRoot {

	  private static ICProxiFactory [] iCProxiFactories;
		
	  private static ICProxiFactory [] getTheICProxiFactories(){
		if (iCProxiFactories == null){
			iCProxiFactories = new ICProxiFactory[199];
        iCProxiFactories[109] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProducerLstICProxi(objectId);
            }
        };
        iCProxiFactories[179] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[177] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerServiceICProxi(objectId);
            }
        };
        iCProxiFactories[92] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemainingStockICProxi(objectId);
            }
        };
        iCProxiFactories[131] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderQuantifiedArticleICProxi(objectId);
            }
        };
        iCProxiFactories[1] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ServerICProxi(objectId);
            }
        };
        iCProxiFactories[2] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ErrorDisplayICProxi(objectId);
            }
        };
        iCProxiFactories[119] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReduceStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[94] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NotInSaleICProxi(objectId);
            }
        };
        iCProxiFactories[124] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerRegisterServiceICProxi(objectId);
            }
        };
        iCProxiFactories[113] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SubProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[166] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RegisterCommandICProxi(objectId);
            }
        };
        iCProxiFactories[0] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandCoordinatorICProxi(objectId);
            }
        };
        iCProxiFactories[172] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StopSellingCommandICProxi(objectId);
            }
        };
        iCProxiFactories[168] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new MoveToCommandICProxi(objectId);
            }
        };
        iCProxiFactories[197] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerShopArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[136] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[137] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderICProxi(objectId);
            }
        };
        iCProxiFactories[112] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RootProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[121] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new IncreaseStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[108] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CreateProducerCommandICProxi(objectId);
            }
        };
        iCProxiFactories[173] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StartSellingCommandICProxi(objectId);
            }
        };
        iCProxiFactories[171] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[138] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerAccountICProxi(objectId);
            }
        };
        iCProxiFactories[164] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ServiceRootProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[97] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProducerICProxi(objectId);
            }
        };
        iCProxiFactories[194] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OwnerArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[3] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommonDateICProxi(objectId);
            }
        };
        iCProxiFactories[142] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShoppingCartArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[189] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new DefaultProductGroupWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[93] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleICProxi(objectId);
            }
        };
        iCProxiFactories[132] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreOrderICProxi(objectId);
            }
        };
        iCProxiFactories[183] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProductGroupComponentsICProxi(objectId);
            }
        };
        iCProxiFactories[133] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerDeliveryTimeICProxi(objectId);
            }
        };
        iCProxiFactories[175] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OwnerServiceICProxi(objectId);
            }
        };
        iCProxiFactories[135] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShoppingCartQuantifiedArticleICProxi(objectId);
            }
        };
        iCProxiFactories[99] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewCreatedICProxi(objectId);
            }
        };
        iCProxiFactories[193] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StandardArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[91] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewSubProductGroupCommandICProxi(objectId);
            }
        };
        iCProxiFactories[95] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new InSaleICProxi(objectId);
            }
        };
        iCProxiFactories[157] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SubjICProxi(objectId);
            }
        };
        iCProxiFactories[140] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShoppingCartICProxi(objectId);
            }
        };
        iCProxiFactories[4] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandExecuterICProxi(objectId);
            }
        };
		}
		return iCProxiFactories;
	  }

	public static PersistentInCacheProxi createInCacheProxi(long objectId, long classId) throws PersistenceException {
	    int index = (int) classId;
		if (index < 0) index = index * -1;
	    index = index - 101;
	    if (index > getTheICProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
	    ICProxiFactory factory = getTheICProxiFactories()[index];
	    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
	    PersistentInCacheProxi result =  factory.create(objectId);
	    return result;
	}

	protected PersistentObject object;
  	public int userCount;
	
	protected PersistentInCacheProxi(long id) {
		super(id);
		this.userCount = 0;
	}

	public PersistentInCacheProxi(PersistentObject object) {
		this(object.getId());
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
	public HashMap<String,Object> toHashtable(int depth, int essentialLevel, boolean forGUI, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot object = this.getTheObject();
		if (object == null) return null;
		return object.toHashtable(depth, essentialLevel, forGUI, tdObserver);
	}
	public HashMap<String, Object> toHashtable(HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot object = this.getTheObject();
		if (object == null) return null;
		return object.toHashtable(allResults, depth, essentialLevel, forGUI, leaf, tdObserver);
	}

	protected abstract PersistentObject getRemote() throws PersistenceException;

	public synchronized PersistentRoot getTheObject() throws PersistenceException {
		if (this.object == null) this.object = getRemote();
		return this.object;
	}		
	protected synchronized void setObject(PersistentObject object) throws PersistenceException {
		this.object = object;
	}
	protected synchronized void clear() throws PersistenceException {
		this.object = null;
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

	public synchronized void incrementUserCount() {
		this.userCount++;
	}

	public static long recycleCounter = 0;
	public synchronized void decrementUserCount() {
		this.userCount--;
		if (this.isRemovable()){
			Cache.getTheCache().remove(this);
			PersistentInCacheProxi.recycleCounter ++;
		}
	}

	protected boolean isRemovable() {
		return this.userCount <= 0 ;
	}
	public synchronized void tryBreak() {
		try {
			if (!this.isDelayed$Persistence())this.object = null;
		} catch (PersistenceException e) {
			return;
		}
	}

	public boolean hasEssentialFields() throws PersistenceException{
		return this.getTheObject().hasEssentialFields();
	}
	public void delete$Me() throws PersistenceException {
		this.getTheObject().delete$Me();
	}
	public Anything getThis() throws PersistenceException {
		return this.getTheObject().getThis();
	}
	
    protected void setDltd() throws PersistenceException {
        this.getTheObject().setDltd();
    }
    public boolean isDltd() throws PersistenceException {
        return this.getTheObject().isDltd();
    }

}
